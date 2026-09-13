package com.ondewo.t2s.stubs;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ondewo.t2s.auth.BearerToken;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Server;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServiceDescriptor;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import ondewo.t2s.Text2SpeechGrpc;
import ondewo.t2s.TextToSpeech;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Exercises the generated gRPC service stubs: their descriptors, every stub flavour, and one
 * real request/response round trip over the in-process transport - no socket, no network, but
 * the real generated marshallers on both ends.
 */
class GeneratedServicesTest {

    /**
     * Number of {@code *Grpc} classes protoc must emit for this product: ondewo-t2s-api
     * declares the single service ondewo.t2s.Text2Speech in ondewo/t2s/text-to-speech.proto.
     * Bump it when the api adds or drops a service - that is exactly the kind of silent
     * generator regression this test exists to catch.
     */
    private static final int EXPECTED_SERVICE_COUNT = 1;

    private static final Metadata.Key<String> AUTHORIZATION =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    private final AtomicReference<Metadata> receivedHeaders = new AtomicReference<>();

    private Server server;
    private ManagedChannel channel;

    @BeforeEach
    void startServer() throws Exception {
        final Text2SpeechGrpc.Text2SpeechImplBase service =
                new Text2SpeechGrpc.Text2SpeechImplBase() {
                    @Override
                    public void normalizeText(
                            final TextToSpeech.NormalizeTextRequest request,
                            final StreamObserver<TextToSpeech.NormalizeTextResponse>
                                    responseObserver) {
                        responseObserver.onNext(
                                TextToSpeech.NormalizeTextResponse.newBuilder()
                                        .setNormalizedText(
                                                request.getT2SPipelineId()
                                                        + ": "
                                                        + request.getText().toLowerCase())
                                        .build());
                        responseObserver.onCompleted();
                    }
                };

        final ServerInterceptor headerCapture =
                new ServerInterceptor() {
                    @Override
                    public <Q, S> ServerCall.Listener<Q> interceptCall(
                            final ServerCall<Q, S> call,
                            final Metadata headers,
                            final ServerCallHandler<Q, S> next) {
                        receivedHeaders.set(headers);
                        return next.startCall(call, headers);
                    }
                };

        final String name = InProcessServerBuilder.generateName();
        server =
                InProcessServerBuilder.forName(name)
                        .directExecutor()
                        .addService(ServerInterceptors.intercept(service, headerCapture))
                        .build()
                        .start();
        channel = InProcessChannelBuilder.forName(name).build();
    }

    @AfterEach
    void stopServer() throws Exception {
        channel.shutdownNow();
        server.shutdownNow();
        channel.awaitTermination(10, TimeUnit.SECONDS);
        server.awaitTermination(10, TimeUnit.SECONDS);
    }

    @Test
    void exposesTheExpectedServiceDescriptor() {
        final ServiceDescriptor descriptor = Text2SpeechGrpc.getServiceDescriptor();

        final List<String> methods =
                descriptor.getMethods().stream()
                        .map(MethodDescriptor::getBareMethodName)
                        .collect(toList());

        assertEquals("ondewo.t2s.Text2Speech", descriptor.getName());
        assertTrue(
                methods.containsAll(
                        List.of(
                                "Synthesize",
                                "BatchSynthesize",
                                "StreamingSynthesize",
                                "NormalizeText",
                                "ListT2sPipelines")),
                "missing rpcs, got " + methods);
        assertEquals(
                MethodDescriptor.MethodType.UNARY,
                Text2SpeechGrpc.getNormalizeTextMethod().getType());
        assertEquals(
                "ondewo.t2s.Text2Speech/NormalizeText",
                Text2SpeechGrpc.getNormalizeTextMethod().getFullMethodName());
        // text-to-speech.proto declares `rpc StreamingSynthesize (stream ...) returns (stream ...)`,
        // so the generated descriptor has to keep it bidirectional.
        assertEquals(
                MethodDescriptor.MethodType.BIDI_STREAMING,
                Text2SpeechGrpc.getStreamingSynthesizeMethod().getType());
    }

    /**
     * Every generated service class, found on the compiled classpath rather than listed by
     * hand, so a service added to the api is picked up without touching this test.
     */
    @Test
    void everyGeneratedServiceHasAUsableDescriptor() throws Exception {
        final Path classesRoot =
                Paths.get(
                        Text2SpeechGrpc.class
                                .getProtectionDomain()
                                .getCodeSource()
                                .getLocation()
                                .toURI());
        assertTrue(Files.isDirectory(classesRoot), "expected compiled classes at " + classesRoot);

        final List<String> serviceClasses;
        try (Stream<Path> tree = Files.walk(classesRoot)) {
            serviceClasses =
                    tree.filter(Files::isRegularFile)
                            .map(path -> classesRoot.relativize(path).toString())
                            .filter(name -> name.endsWith("Grpc.class"))
                            .map(name -> name.substring(0, name.length() - ".class".length()))
                            .map(name -> name.replace(java.io.File.separatorChar, '.'))
                            .sorted()
                            .collect(toList());
        }

        assertEquals(EXPECTED_SERVICE_COUNT, serviceClasses.size(), "found " + serviceClasses);

        for (final String className : serviceClasses) {
            final ServiceDescriptor descriptor =
                    (ServiceDescriptor)
                            Class.forName(className).getMethod("getServiceDescriptor").invoke(null);

            assertTrue(
                    descriptor.getName().startsWith("ondewo."),
                    className + " serves " + descriptor.getName());
            assertTrue(
                    descriptor.getMethods().iterator().hasNext(),
                    className + " declares no rpc");
        }
    }

    @Test
    void servesAUnaryCallOverTheGeneratedMarshallers() {
        final Text2SpeechGrpc.Text2SpeechBlockingStub stub =
                new BearerToken("s3cr3t").attachTo(Text2SpeechGrpc.newBlockingStub(channel));

        final TextToSpeech.NormalizeTextResponse normalized =
                stub.normalizeText(
                        TextToSpeech.NormalizeTextRequest.newBuilder()
                                .setT2SPipelineId("de_1")
                                .setText("Guten Morgen")
                                .build());

        assertEquals("de_1: guten morgen", normalized.getNormalizedText());
        assertEquals("Bearer s3cr3t", receivedHeaders.get().get(AUTHORIZATION));
    }

    /**
     * The published library declares grpc-netty-shaded, so a consumer can open a channel from
     * a plain target string without adding a transport. Nothing is dialled: gRPC connects
     * lazily, on the first call.
     */
    @Test
    void buildsEveryStubFlavourAgainstAPlainTargetChannel() {
        final ManagedChannel dummy =
                ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build();
        try {
            assertNotNull(Text2SpeechGrpc.newBlockingStub(dummy));
            assertNotNull(Text2SpeechGrpc.newFutureStub(dummy));
            assertNotNull(Text2SpeechGrpc.newStub(dummy));
        } finally {
            dummy.shutdownNow();
        }
    }
}
