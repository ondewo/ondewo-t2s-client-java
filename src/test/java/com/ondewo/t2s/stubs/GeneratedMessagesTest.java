package com.ondewo.t2s.stubs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import ondewo.t2s.TextToSpeech;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Exercises the committed protoc output. These are the tests that catch a broken generator:
 * they build a message, push it through the real binary marshaller and read it back.
 *
 * <p>ondewo-t2s-api is a single proto that does NOT set {@code java_multiple_files}, so every
 * message is nested in the outer class {@code ondewo.t2s.TextToSpeech} and no
 * {@code com.ondewo.t2s} classes are generated at all - the pilot's separate multi-file case
 * has no counterpart here.
 */
class GeneratedMessagesTest {

    @Test
    void roundTripsAnOuterClassMessage() throws Exception {
        final TextToSpeech.ListT2sPipelinesRequest original =
                TextToSpeech.ListT2sPipelinesRequest.newBuilder()
                        .addLanguages("de")
                        .addLanguages("en")
                        .addSpeakerSexes("female")
                        .addPipelineOwners("ondewo")
                        .addSpeakerNames("alex")
                        .addDomains("medical")
                        .build();

        final byte[] wire = original.toByteArray();
        final TextToSpeech.ListT2sPipelinesRequest parsed =
                TextToSpeech.ListT2sPipelinesRequest.parseFrom(wire);

        assertEquals(original, parsed);
        assertEquals(2, parsed.getLanguagesCount());
        assertEquals("en", parsed.getLanguages(1));
        assertEquals("female", parsed.getSpeakerSexes(0));
        assertEquals("ondewo", parsed.getPipelineOwners(0));
        assertEquals("medical", parsed.getDomains(0));
        assertTrue(wire.length > 0);
    }

    /**
     * {@code optional string instruction = 13} in text-to-speech.proto. Explicit presence is
     * what lets a client send the zero value; losing it is the exact regression that broke the
     * angular target, so it is asserted on the wire here.
     */
    @Test
    void keepsExplicitPresenceOfAnOptionalScalar() throws Exception {
        final TextToSpeech.RequestConfig unset =
                TextToSpeech.RequestConfig.newBuilder().setT2SPipelineId("de_1").build();
        final TextToSpeech.RequestConfig explicitEmpty =
                TextToSpeech.RequestConfig.newBuilder()
                        .setT2SPipelineId("de_1")
                        .setInstruction("")
                        .build();

        assertFalse(TextToSpeech.RequestConfig.parseFrom(unset.toByteArray()).hasInstruction());
        assertTrue(
                TextToSpeech.RequestConfig.parseFrom(explicitEmpty.toByteArray())
                        .hasInstruction());
        assertEquals(
                "",
                TextToSpeech.RequestConfig.parseFrom(explicitEmpty.toByteArray())
                        .getInstruction());
        // An explicitly set empty string has to reach the wire, an unset field must not.
        assertTrue(explicitEmpty.toByteArray().length > unset.toByteArray().length);
    }

    @Test
    void keepsTheProtoPackageInTheDescriptor() {
        // The java_package of these protos is rewritten by the compiler image, but the PROTO
        // package - what goes on the wire - must stay ondewo.t2s.
        assertEquals(
                "ondewo.t2s.ListT2sPipelinesRequest",
                TextToSpeech.ListT2sPipelinesRequest.getDescriptor().getFullName());
        assertEquals(
                "ondewo.t2s.RequestConfig",
                TextToSpeech.RequestConfig.getDescriptor().getFullName());
    }

    @ParameterizedTest(name = "{0} has the zero value {1}")
    @MethodSource("zeroValues")
    void everyEnumDeclaresItsZeroValue(final String name, final int number, final Object zeroValue) {
        assertEquals(0, number, name);
        assertEquals(name, zeroValue.toString());
    }

    private static Stream<Arguments> zeroValues() {
        return Stream.of(
                Arguments.of(
                        "PCM_16", TextToSpeech.Pcm.PCM_16.getNumber(), TextToSpeech.Pcm.forNumber(0)),
                Arguments.of(
                        "wav",
                        TextToSpeech.AudioFormat.wav.getNumber(),
                        TextToSpeech.AudioFormat.forNumber(0)));
    }

    @Test
    void defaultInstancesAreEmpty() {
        final TextToSpeech.RequestConfig config = TextToSpeech.RequestConfig.getDefaultInstance();

        assertEquals("", config.getT2SPipelineId());
        assertFalse(config.hasInstruction());
        assertFalse(config.hasSampleRate());
        assertEquals(0, config.getSerializedSize());
    }
}
