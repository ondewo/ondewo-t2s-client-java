package ondewo.t2s;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class Text2SpeechGrpc {

  private Text2SpeechGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.t2s.Text2Speech";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.SynthesizeRequest,
      ondewo.t2s.TextToSpeech.SynthesizeResponse> getSynthesizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Synthesize",
      requestType = ondewo.t2s.TextToSpeech.SynthesizeRequest.class,
      responseType = ondewo.t2s.TextToSpeech.SynthesizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.SynthesizeRequest,
      ondewo.t2s.TextToSpeech.SynthesizeResponse> getSynthesizeMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.SynthesizeRequest, ondewo.t2s.TextToSpeech.SynthesizeResponse> getSynthesizeMethod;
    if ((getSynthesizeMethod = Text2SpeechGrpc.getSynthesizeMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getSynthesizeMethod = Text2SpeechGrpc.getSynthesizeMethod) == null) {
          Text2SpeechGrpc.getSynthesizeMethod = getSynthesizeMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.SynthesizeRequest, ondewo.t2s.TextToSpeech.SynthesizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Synthesize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.SynthesizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.SynthesizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("Synthesize"))
              .build();
        }
      }
    }
    return getSynthesizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.BatchSynthesizeRequest,
      ondewo.t2s.TextToSpeech.BatchSynthesizeResponse> getBatchSynthesizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchSynthesize",
      requestType = ondewo.t2s.TextToSpeech.BatchSynthesizeRequest.class,
      responseType = ondewo.t2s.TextToSpeech.BatchSynthesizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.BatchSynthesizeRequest,
      ondewo.t2s.TextToSpeech.BatchSynthesizeResponse> getBatchSynthesizeMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.BatchSynthesizeRequest, ondewo.t2s.TextToSpeech.BatchSynthesizeResponse> getBatchSynthesizeMethod;
    if ((getBatchSynthesizeMethod = Text2SpeechGrpc.getBatchSynthesizeMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getBatchSynthesizeMethod = Text2SpeechGrpc.getBatchSynthesizeMethod) == null) {
          Text2SpeechGrpc.getBatchSynthesizeMethod = getBatchSynthesizeMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.BatchSynthesizeRequest, ondewo.t2s.TextToSpeech.BatchSynthesizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchSynthesize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.BatchSynthesizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.BatchSynthesizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("BatchSynthesize"))
              .build();
        }
      }
    }
    return getBatchSynthesizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest,
      ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse> getStreamingSynthesizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingSynthesize",
      requestType = ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest.class,
      responseType = ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest,
      ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse> getStreamingSynthesizeMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest, ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse> getStreamingSynthesizeMethod;
    if ((getStreamingSynthesizeMethod = Text2SpeechGrpc.getStreamingSynthesizeMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getStreamingSynthesizeMethod = Text2SpeechGrpc.getStreamingSynthesizeMethod) == null) {
          Text2SpeechGrpc.getStreamingSynthesizeMethod = getStreamingSynthesizeMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest, ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamingSynthesize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("StreamingSynthesize"))
              .build();
        }
      }
    }
    return getStreamingSynthesizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.NormalizeTextRequest,
      ondewo.t2s.TextToSpeech.NormalizeTextResponse> getNormalizeTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NormalizeText",
      requestType = ondewo.t2s.TextToSpeech.NormalizeTextRequest.class,
      responseType = ondewo.t2s.TextToSpeech.NormalizeTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.NormalizeTextRequest,
      ondewo.t2s.TextToSpeech.NormalizeTextResponse> getNormalizeTextMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.NormalizeTextRequest, ondewo.t2s.TextToSpeech.NormalizeTextResponse> getNormalizeTextMethod;
    if ((getNormalizeTextMethod = Text2SpeechGrpc.getNormalizeTextMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getNormalizeTextMethod = Text2SpeechGrpc.getNormalizeTextMethod) == null) {
          Text2SpeechGrpc.getNormalizeTextMethod = getNormalizeTextMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.NormalizeTextRequest, ondewo.t2s.TextToSpeech.NormalizeTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NormalizeText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.NormalizeTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.NormalizeTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("NormalizeText"))
              .build();
        }
      }
    }
    return getNormalizeTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.T2sPipelineId,
      ondewo.t2s.TextToSpeech.Text2SpeechConfig> getGetT2sPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetT2sPipeline",
      requestType = ondewo.t2s.TextToSpeech.T2sPipelineId.class,
      responseType = ondewo.t2s.TextToSpeech.Text2SpeechConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.T2sPipelineId,
      ondewo.t2s.TextToSpeech.Text2SpeechConfig> getGetT2sPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.T2sPipelineId, ondewo.t2s.TextToSpeech.Text2SpeechConfig> getGetT2sPipelineMethod;
    if ((getGetT2sPipelineMethod = Text2SpeechGrpc.getGetT2sPipelineMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getGetT2sPipelineMethod = Text2SpeechGrpc.getGetT2sPipelineMethod) == null) {
          Text2SpeechGrpc.getGetT2sPipelineMethod = getGetT2sPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.T2sPipelineId, ondewo.t2s.TextToSpeech.Text2SpeechConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetT2sPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.T2sPipelineId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.Text2SpeechConfig.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("GetT2sPipeline"))
              .build();
        }
      }
    }
    return getGetT2sPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.Text2SpeechConfig,
      ondewo.t2s.TextToSpeech.T2sPipelineId> getCreateT2sPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateT2sPipeline",
      requestType = ondewo.t2s.TextToSpeech.Text2SpeechConfig.class,
      responseType = ondewo.t2s.TextToSpeech.T2sPipelineId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.Text2SpeechConfig,
      ondewo.t2s.TextToSpeech.T2sPipelineId> getCreateT2sPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.Text2SpeechConfig, ondewo.t2s.TextToSpeech.T2sPipelineId> getCreateT2sPipelineMethod;
    if ((getCreateT2sPipelineMethod = Text2SpeechGrpc.getCreateT2sPipelineMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getCreateT2sPipelineMethod = Text2SpeechGrpc.getCreateT2sPipelineMethod) == null) {
          Text2SpeechGrpc.getCreateT2sPipelineMethod = getCreateT2sPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.Text2SpeechConfig, ondewo.t2s.TextToSpeech.T2sPipelineId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateT2sPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.Text2SpeechConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.T2sPipelineId.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("CreateT2sPipeline"))
              .build();
        }
      }
    }
    return getCreateT2sPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.T2sPipelineId,
      com.google.protobuf.Empty> getDeleteT2sPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteT2sPipeline",
      requestType = ondewo.t2s.TextToSpeech.T2sPipelineId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.T2sPipelineId,
      com.google.protobuf.Empty> getDeleteT2sPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.T2sPipelineId, com.google.protobuf.Empty> getDeleteT2sPipelineMethod;
    if ((getDeleteT2sPipelineMethod = Text2SpeechGrpc.getDeleteT2sPipelineMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getDeleteT2sPipelineMethod = Text2SpeechGrpc.getDeleteT2sPipelineMethod) == null) {
          Text2SpeechGrpc.getDeleteT2sPipelineMethod = getDeleteT2sPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.T2sPipelineId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteT2sPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.T2sPipelineId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("DeleteT2sPipeline"))
              .build();
        }
      }
    }
    return getDeleteT2sPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.Text2SpeechConfig,
      com.google.protobuf.Empty> getUpdateT2sPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateT2sPipeline",
      requestType = ondewo.t2s.TextToSpeech.Text2SpeechConfig.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.Text2SpeechConfig,
      com.google.protobuf.Empty> getUpdateT2sPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.Text2SpeechConfig, com.google.protobuf.Empty> getUpdateT2sPipelineMethod;
    if ((getUpdateT2sPipelineMethod = Text2SpeechGrpc.getUpdateT2sPipelineMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getUpdateT2sPipelineMethod = Text2SpeechGrpc.getUpdateT2sPipelineMethod) == null) {
          Text2SpeechGrpc.getUpdateT2sPipelineMethod = getUpdateT2sPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.Text2SpeechConfig, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateT2sPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.Text2SpeechConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("UpdateT2sPipeline"))
              .build();
        }
      }
    }
    return getUpdateT2sPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest,
      ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse> getListT2sPipelinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListT2sPipelines",
      requestType = ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest.class,
      responseType = ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest,
      ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse> getListT2sPipelinesMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest, ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse> getListT2sPipelinesMethod;
    if ((getListT2sPipelinesMethod = Text2SpeechGrpc.getListT2sPipelinesMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getListT2sPipelinesMethod = Text2SpeechGrpc.getListT2sPipelinesMethod) == null) {
          Text2SpeechGrpc.getListT2sPipelinesMethod = getListT2sPipelinesMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest, ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListT2sPipelines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("ListT2sPipelines"))
              .build();
        }
      }
    }
    return getListT2sPipelinesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest,
      ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse> getListT2sLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListT2sLanguages",
      requestType = ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest.class,
      responseType = ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest,
      ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse> getListT2sLanguagesMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest, ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse> getListT2sLanguagesMethod;
    if ((getListT2sLanguagesMethod = Text2SpeechGrpc.getListT2sLanguagesMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getListT2sLanguagesMethod = Text2SpeechGrpc.getListT2sLanguagesMethod) == null) {
          Text2SpeechGrpc.getListT2sLanguagesMethod = getListT2sLanguagesMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest, ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListT2sLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("ListT2sLanguages"))
              .build();
        }
      }
    }
    return getListT2sLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sDomainsRequest,
      ondewo.t2s.TextToSpeech.ListT2sDomainsResponse> getListT2sDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListT2sDomains",
      requestType = ondewo.t2s.TextToSpeech.ListT2sDomainsRequest.class,
      responseType = ondewo.t2s.TextToSpeech.ListT2sDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sDomainsRequest,
      ondewo.t2s.TextToSpeech.ListT2sDomainsResponse> getListT2sDomainsMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sDomainsRequest, ondewo.t2s.TextToSpeech.ListT2sDomainsResponse> getListT2sDomainsMethod;
    if ((getListT2sDomainsMethod = Text2SpeechGrpc.getListT2sDomainsMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getListT2sDomainsMethod = Text2SpeechGrpc.getListT2sDomainsMethod) == null) {
          Text2SpeechGrpc.getListT2sDomainsMethod = getListT2sDomainsMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.ListT2sDomainsRequest, ondewo.t2s.TextToSpeech.ListT2sDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListT2sDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("ListT2sDomains"))
              .build();
        }
      }
    }
    return getListT2sDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest,
      ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse> getListT2sNormalizationPipelinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListT2sNormalizationPipelines",
      requestType = ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest.class,
      responseType = ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest,
      ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse> getListT2sNormalizationPipelinesMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest, ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse> getListT2sNormalizationPipelinesMethod;
    if ((getListT2sNormalizationPipelinesMethod = Text2SpeechGrpc.getListT2sNormalizationPipelinesMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getListT2sNormalizationPipelinesMethod = Text2SpeechGrpc.getListT2sNormalizationPipelinesMethod) == null) {
          Text2SpeechGrpc.getListT2sNormalizationPipelinesMethod = getListT2sNormalizationPipelinesMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest, ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListT2sNormalizationPipelines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("ListT2sNormalizationPipelines"))
              .build();
        }
      }
    }
    return getListT2sNormalizationPipelinesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse> getGetServiceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse> getGetServiceInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse> getGetServiceInfoMethod;
    if ((getGetServiceInfoMethod = Text2SpeechGrpc.getGetServiceInfoMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getGetServiceInfoMethod = Text2SpeechGrpc.getGetServiceInfoMethod) == null) {
          Text2SpeechGrpc.getGetServiceInfoMethod = getGetServiceInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("GetServiceInfo"))
              .build();
        }
      }
    }
    return getGetServiceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.PhonemizerId,
      ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getGetCustomPhonemizerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomPhonemizer",
      requestType = ondewo.t2s.TextToSpeech.PhonemizerId.class,
      responseType = ondewo.t2s.TextToSpeech.CustomPhonemizerProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.PhonemizerId,
      ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getGetCustomPhonemizerMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.PhonemizerId, ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getGetCustomPhonemizerMethod;
    if ((getGetCustomPhonemizerMethod = Text2SpeechGrpc.getGetCustomPhonemizerMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getGetCustomPhonemizerMethod = Text2SpeechGrpc.getGetCustomPhonemizerMethod) == null) {
          Text2SpeechGrpc.getGetCustomPhonemizerMethod = getGetCustomPhonemizerMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.PhonemizerId, ondewo.t2s.TextToSpeech.CustomPhonemizerProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomPhonemizer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.PhonemizerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.CustomPhonemizerProto.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("GetCustomPhonemizer"))
              .build();
        }
      }
    }
    return getGetCustomPhonemizerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest,
      ondewo.t2s.TextToSpeech.PhonemizerId> getCreateCustomPhonemizerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomPhonemizer",
      requestType = ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest.class,
      responseType = ondewo.t2s.TextToSpeech.PhonemizerId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest,
      ondewo.t2s.TextToSpeech.PhonemizerId> getCreateCustomPhonemizerMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest, ondewo.t2s.TextToSpeech.PhonemizerId> getCreateCustomPhonemizerMethod;
    if ((getCreateCustomPhonemizerMethod = Text2SpeechGrpc.getCreateCustomPhonemizerMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getCreateCustomPhonemizerMethod = Text2SpeechGrpc.getCreateCustomPhonemizerMethod) == null) {
          Text2SpeechGrpc.getCreateCustomPhonemizerMethod = getCreateCustomPhonemizerMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest, ondewo.t2s.TextToSpeech.PhonemizerId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomPhonemizer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.PhonemizerId.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("CreateCustomPhonemizer"))
              .build();
        }
      }
    }
    return getCreateCustomPhonemizerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.PhonemizerId,
      com.google.protobuf.Empty> getDeleteCustomPhonemizerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomPhonemizer",
      requestType = ondewo.t2s.TextToSpeech.PhonemizerId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.PhonemizerId,
      com.google.protobuf.Empty> getDeleteCustomPhonemizerMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.PhonemizerId, com.google.protobuf.Empty> getDeleteCustomPhonemizerMethod;
    if ((getDeleteCustomPhonemizerMethod = Text2SpeechGrpc.getDeleteCustomPhonemizerMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getDeleteCustomPhonemizerMethod = Text2SpeechGrpc.getDeleteCustomPhonemizerMethod) == null) {
          Text2SpeechGrpc.getDeleteCustomPhonemizerMethod = getDeleteCustomPhonemizerMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.PhonemizerId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCustomPhonemizer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.PhonemizerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("DeleteCustomPhonemizer"))
              .build();
        }
      }
    }
    return getDeleteCustomPhonemizerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest,
      ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getUpdateCustomPhonemizerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCustomPhonemizer",
      requestType = ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest.class,
      responseType = ondewo.t2s.TextToSpeech.CustomPhonemizerProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest,
      ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getUpdateCustomPhonemizerMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest, ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getUpdateCustomPhonemizerMethod;
    if ((getUpdateCustomPhonemizerMethod = Text2SpeechGrpc.getUpdateCustomPhonemizerMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getUpdateCustomPhonemizerMethod = Text2SpeechGrpc.getUpdateCustomPhonemizerMethod) == null) {
          Text2SpeechGrpc.getUpdateCustomPhonemizerMethod = getUpdateCustomPhonemizerMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest, ondewo.t2s.TextToSpeech.CustomPhonemizerProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCustomPhonemizer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.CustomPhonemizerProto.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("UpdateCustomPhonemizer"))
              .build();
        }
      }
    }
    return getUpdateCustomPhonemizerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest,
      ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse> getListCustomPhonemizerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomPhonemizer",
      requestType = ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest.class,
      responseType = ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest,
      ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse> getListCustomPhonemizerMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest, ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse> getListCustomPhonemizerMethod;
    if ((getListCustomPhonemizerMethod = Text2SpeechGrpc.getListCustomPhonemizerMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getListCustomPhonemizerMethod = Text2SpeechGrpc.getListCustomPhonemizerMethod) == null) {
          Text2SpeechGrpc.getListCustomPhonemizerMethod = getListCustomPhonemizerMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest, ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCustomPhonemizer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("ListCustomPhonemizer"))
              .build();
        }
      }
    }
    return getListCustomPhonemizerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.VoiceCloningRequest,
      com.google.protobuf.Empty> getVoiceCloningMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoiceCloning",
      requestType = ondewo.t2s.TextToSpeech.VoiceCloningRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.VoiceCloningRequest,
      com.google.protobuf.Empty> getVoiceCloningMethod() {
    io.grpc.MethodDescriptor<ondewo.t2s.TextToSpeech.VoiceCloningRequest, com.google.protobuf.Empty> getVoiceCloningMethod;
    if ((getVoiceCloningMethod = Text2SpeechGrpc.getVoiceCloningMethod) == null) {
      synchronized (Text2SpeechGrpc.class) {
        if ((getVoiceCloningMethod = Text2SpeechGrpc.getVoiceCloningMethod) == null) {
          Text2SpeechGrpc.getVoiceCloningMethod = getVoiceCloningMethod =
              io.grpc.MethodDescriptor.<ondewo.t2s.TextToSpeech.VoiceCloningRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoiceCloning"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.t2s.TextToSpeech.VoiceCloningRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Text2SpeechMethodDescriptorSupplier("VoiceCloning"))
              .build();
        }
      }
    }
    return getVoiceCloningMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Text2SpeechStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Text2SpeechStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Text2SpeechStub>() {
        @java.lang.Override
        public Text2SpeechStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Text2SpeechStub(channel, callOptions);
        }
      };
    return Text2SpeechStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static Text2SpeechBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Text2SpeechBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Text2SpeechBlockingV2Stub>() {
        @java.lang.Override
        public Text2SpeechBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Text2SpeechBlockingV2Stub(channel, callOptions);
        }
      };
    return Text2SpeechBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Text2SpeechBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Text2SpeechBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Text2SpeechBlockingStub>() {
        @java.lang.Override
        public Text2SpeechBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Text2SpeechBlockingStub(channel, callOptions);
        }
      };
    return Text2SpeechBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Text2SpeechFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Text2SpeechFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Text2SpeechFutureStub>() {
        @java.lang.Override
        public Text2SpeechFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Text2SpeechFutureStub(channel, callOptions);
        }
      };
    return Text2SpeechFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * &lt;p&gt;Synthesizes a specific text sent in the request with the provided configuration requirements
     * and retrieves a response that includes the synthesized text as audio and the requested configuration.&lt;/p&gt;
     * </pre>
     */
    default void synthesize(ondewo.t2s.TextToSpeech.SynthesizeRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.SynthesizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSynthesizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs batch synthesis by accepting a batch of synthesis requests and returning a batch response.
     * This can be more efficient for generating predictions on the AI model in bulk.&lt;/p&gt;
     * </pre>
     */
    default void batchSynthesize(ondewo.t2s.TextToSpeech.BatchSynthesizeRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.BatchSynthesizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchSynthesizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs streaming synthesis by accepting stream of input text and returning a stream of generated audio.&lt;/p&gt;
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest> streamingSynthesize(
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamingSynthesizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Normalizes a text according to the specific pipeline&amp;apos;s normalization rules.&lt;/p&gt;
     * </pre>
     */
    default void normalizeText(ondewo.t2s.TextToSpeech.NormalizeTextRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.NormalizeTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNormalizeTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the configuration of the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    default void getT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.Text2SpeechConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetT2sPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new text-to-speech pipeline with the provided configuration and returns its pipeline ID.&lt;/p&gt;
     * </pre>
     */
    default void createT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.T2sPipelineId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateT2sPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    default void deleteT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteT2sPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified text-to-speech pipeline with the given configuration.&lt;/p&gt;
     * </pre>
     */
    default void updateT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateT2sPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of text-to-speech pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    default void listT2sPipelines(ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListT2sPipelinesMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of languages available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    default void listT2sLanguages(ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListT2sLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of domains available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    default void listT2sDomains(ondewo.t2s.TextToSpeech.ListT2sDomainsRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListT2sDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    default void listT2sNormalizationPipelines(ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListT2sNormalizationPipelinesMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the version information of the running text-to-speech server.&lt;/p&gt;
     * </pre>
     */
    default void getServiceInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a custom phonemizer based on the provided PhonemizerId.&lt;/p&gt;
     * </pre>
     */
    default void getCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.CustomPhonemizerProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomPhonemizerMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a custom phonemizer based on the provided CreateCustomPhonemizerRequest.
     * Returns the PhonemizerId associated with the created custom phonemizer.&lt;/p&gt;
     * </pre>
     */
    default void createCustomPhonemizer(ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.PhonemizerId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomPhonemizerMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a custom phonemizer based on the provided PhonemizerId.
     * Returns an Empty response upon successful deletion.&lt;/p&gt;
     * </pre>
     */
    default void deleteCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCustomPhonemizerMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified custom phonemizer with the provided configuration.&lt;/p&gt;
     * </pre>
     */
    default void updateCustomPhonemizer(ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.CustomPhonemizerProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCustomPhonemizerMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of custom phonemizers based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    default void listCustomPhonemizer(ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCustomPhonemizerMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Clones a voice based on a sample audio of the speaker and its transcription.
     * The cloned voice can afterwards be used for synthesis by referencing the given speaker name.&lt;/p&gt;
     * </pre>
     */
    default void voiceCloning(ondewo.t2s.TextToSpeech.VoiceCloningRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoiceCloningMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Text2Speech.
   * <pre>
   * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
   * </pre>
   */
  public static abstract class Text2SpeechImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Text2SpeechGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Text2Speech.
   * <pre>
   * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
   * </pre>
   */
  public static final class Text2SpeechStub
      extends io.grpc.stub.AbstractAsyncStub<Text2SpeechStub> {
    private Text2SpeechStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Text2SpeechStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Text2SpeechStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Synthesizes a specific text sent in the request with the provided configuration requirements
     * and retrieves a response that includes the synthesized text as audio and the requested configuration.&lt;/p&gt;
     * </pre>
     */
    public void synthesize(ondewo.t2s.TextToSpeech.SynthesizeRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.SynthesizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSynthesizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs batch synthesis by accepting a batch of synthesis requests and returning a batch response.
     * This can be more efficient for generating predictions on the AI model in bulk.&lt;/p&gt;
     * </pre>
     */
    public void batchSynthesize(ondewo.t2s.TextToSpeech.BatchSynthesizeRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.BatchSynthesizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchSynthesizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs streaming synthesis by accepting stream of input text and returning a stream of generated audio.&lt;/p&gt;
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest> streamingSynthesize(
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamingSynthesizeMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Normalizes a text according to the specific pipeline&amp;apos;s normalization rules.&lt;/p&gt;
     * </pre>
     */
    public void normalizeText(ondewo.t2s.TextToSpeech.NormalizeTextRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.NormalizeTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNormalizeTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the configuration of the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public void getT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.Text2SpeechConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetT2sPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new text-to-speech pipeline with the provided configuration and returns its pipeline ID.&lt;/p&gt;
     * </pre>
     */
    public void createT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.T2sPipelineId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateT2sPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public void deleteT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteT2sPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified text-to-speech pipeline with the given configuration.&lt;/p&gt;
     * </pre>
     */
    public void updateT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateT2sPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of text-to-speech pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public void listT2sPipelines(ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListT2sPipelinesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of languages available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public void listT2sLanguages(ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListT2sLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of domains available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public void listT2sDomains(ondewo.t2s.TextToSpeech.ListT2sDomainsRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListT2sDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public void listT2sNormalizationPipelines(ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListT2sNormalizationPipelinesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the version information of the running text-to-speech server.&lt;/p&gt;
     * </pre>
     */
    public void getServiceInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a custom phonemizer based on the provided PhonemizerId.&lt;/p&gt;
     * </pre>
     */
    public void getCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.CustomPhonemizerProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomPhonemizerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a custom phonemizer based on the provided CreateCustomPhonemizerRequest.
     * Returns the PhonemizerId associated with the created custom phonemizer.&lt;/p&gt;
     * </pre>
     */
    public void createCustomPhonemizer(ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.PhonemizerId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomPhonemizerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a custom phonemizer based on the provided PhonemizerId.
     * Returns an Empty response upon successful deletion.&lt;/p&gt;
     * </pre>
     */
    public void deleteCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCustomPhonemizerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified custom phonemizer with the provided configuration.&lt;/p&gt;
     * </pre>
     */
    public void updateCustomPhonemizer(ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.CustomPhonemizerProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCustomPhonemizerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of custom phonemizers based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public void listCustomPhonemizer(ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest request,
        io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCustomPhonemizerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Clones a voice based on a sample audio of the speaker and its transcription.
     * The cloned voice can afterwards be used for synthesis by referencing the given speaker name.&lt;/p&gt;
     * </pre>
     */
    public void voiceCloning(ondewo.t2s.TextToSpeech.VoiceCloningRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoiceCloningMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Text2Speech.
   * <pre>
   * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
   * </pre>
   */
  public static final class Text2SpeechBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<Text2SpeechBlockingV2Stub> {
    private Text2SpeechBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Text2SpeechBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Text2SpeechBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Synthesizes a specific text sent in the request with the provided configuration requirements
     * and retrieves a response that includes the synthesized text as audio and the requested configuration.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.SynthesizeResponse synthesize(ondewo.t2s.TextToSpeech.SynthesizeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSynthesizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs batch synthesis by accepting a batch of synthesis requests and returning a batch response.
     * This can be more efficient for generating predictions on the AI model in bulk.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.BatchSynthesizeResponse batchSynthesize(ondewo.t2s.TextToSpeech.BatchSynthesizeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchSynthesizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs streaming synthesis by accepting stream of input text and returning a stream of generated audio.&lt;/p&gt;
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest, ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse>
        streamingSynthesize() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamingSynthesizeMethod(), getCallOptions());
    }

    /**
     * <pre>
     * &lt;p&gt;Normalizes a text according to the specific pipeline&amp;apos;s normalization rules.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.NormalizeTextResponse normalizeText(ondewo.t2s.TextToSpeech.NormalizeTextRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getNormalizeTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the configuration of the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.Text2SpeechConfig getT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new text-to-speech pipeline with the provided configuration and returns its pipeline ID.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.T2sPipelineId createT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified text-to-speech pipeline with the given configuration.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty updateT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of text-to-speech pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse listT2sPipelines(ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListT2sPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of languages available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse listT2sLanguages(ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListT2sLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of domains available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sDomainsResponse listT2sDomains(ondewo.t2s.TextToSpeech.ListT2sDomainsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListT2sDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse listT2sNormalizationPipelines(ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListT2sNormalizationPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the version information of the running text-to-speech server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse getServiceInfo(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetServiceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a custom phonemizer based on the provided PhonemizerId.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.CustomPhonemizerProto getCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a custom phonemizer based on the provided CreateCustomPhonemizerRequest.
     * Returns the PhonemizerId associated with the created custom phonemizer.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.PhonemizerId createCustomPhonemizer(ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a custom phonemizer based on the provided PhonemizerId.
     * Returns an Empty response upon successful deletion.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified custom phonemizer with the provided configuration.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.CustomPhonemizerProto updateCustomPhonemizer(ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of custom phonemizers based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse listCustomPhonemizer(ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Clones a voice based on a sample audio of the speaker and its transcription.
     * The cloned voice can afterwards be used for synthesis by referencing the given speaker name.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty voiceCloning(ondewo.t2s.TextToSpeech.VoiceCloningRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getVoiceCloningMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Text2Speech.
   * <pre>
   * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
   * </pre>
   */
  public static final class Text2SpeechBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Text2SpeechBlockingStub> {
    private Text2SpeechBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Text2SpeechBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Text2SpeechBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Synthesizes a specific text sent in the request with the provided configuration requirements
     * and retrieves a response that includes the synthesized text as audio and the requested configuration.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.SynthesizeResponse synthesize(ondewo.t2s.TextToSpeech.SynthesizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSynthesizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs batch synthesis by accepting a batch of synthesis requests and returning a batch response.
     * This can be more efficient for generating predictions on the AI model in bulk.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.BatchSynthesizeResponse batchSynthesize(ondewo.t2s.TextToSpeech.BatchSynthesizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSynthesizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Normalizes a text according to the specific pipeline&amp;apos;s normalization rules.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.NormalizeTextResponse normalizeText(ondewo.t2s.TextToSpeech.NormalizeTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNormalizeTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the configuration of the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.Text2SpeechConfig getT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new text-to-speech pipeline with the provided configuration and returns its pipeline ID.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.T2sPipelineId createT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteT2sPipeline(ondewo.t2s.TextToSpeech.T2sPipelineId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified text-to-speech pipeline with the given configuration.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty updateT2sPipeline(ondewo.t2s.TextToSpeech.Text2SpeechConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateT2sPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of text-to-speech pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse listT2sPipelines(ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListT2sPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of languages available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse listT2sLanguages(ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListT2sLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of domains available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sDomainsResponse listT2sDomains(ondewo.t2s.TextToSpeech.ListT2sDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListT2sDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse listT2sNormalizationPipelines(ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListT2sNormalizationPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the version information of the running text-to-speech server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse getServiceInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a custom phonemizer based on the provided PhonemizerId.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.CustomPhonemizerProto getCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a custom phonemizer based on the provided CreateCustomPhonemizerRequest.
     * Returns the PhonemizerId associated with the created custom phonemizer.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.PhonemizerId createCustomPhonemizer(ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a custom phonemizer based on the provided PhonemizerId.
     * Returns an Empty response upon successful deletion.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteCustomPhonemizer(ondewo.t2s.TextToSpeech.PhonemizerId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified custom phonemizer with the provided configuration.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.CustomPhonemizerProto updateCustomPhonemizer(ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of custom phonemizers based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse listCustomPhonemizer(ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCustomPhonemizerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Clones a voice based on a sample audio of the speaker and its transcription.
     * The cloned voice can afterwards be used for synthesis by referencing the given speaker name.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty voiceCloning(ondewo.t2s.TextToSpeech.VoiceCloningRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoiceCloningMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Text2Speech.
   * <pre>
   * &lt;p&gt;Text2Speech service provides endpoints for text-to-speech generation.&lt;/p&gt;
   * </pre>
   */
  public static final class Text2SpeechFutureStub
      extends io.grpc.stub.AbstractFutureStub<Text2SpeechFutureStub> {
    private Text2SpeechFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Text2SpeechFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Text2SpeechFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Synthesizes a specific text sent in the request with the provided configuration requirements
     * and retrieves a response that includes the synthesized text as audio and the requested configuration.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.SynthesizeResponse> synthesize(
        ondewo.t2s.TextToSpeech.SynthesizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSynthesizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Performs batch synthesis by accepting a batch of synthesis requests and returning a batch response.
     * This can be more efficient for generating predictions on the AI model in bulk.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.BatchSynthesizeResponse> batchSynthesize(
        ondewo.t2s.TextToSpeech.BatchSynthesizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchSynthesizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Normalizes a text according to the specific pipeline&amp;apos;s normalization rules.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.NormalizeTextResponse> normalizeText(
        ondewo.t2s.TextToSpeech.NormalizeTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNormalizeTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the configuration of the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.Text2SpeechConfig> getT2sPipeline(
        ondewo.t2s.TextToSpeech.T2sPipelineId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetT2sPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new text-to-speech pipeline with the provided configuration and returns its pipeline ID.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.T2sPipelineId> createT2sPipeline(
        ondewo.t2s.TextToSpeech.Text2SpeechConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateT2sPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes the specified text-to-speech pipeline.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteT2sPipeline(
        ondewo.t2s.TextToSpeech.T2sPipelineId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteT2sPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified text-to-speech pipeline with the given configuration.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateT2sPipeline(
        ondewo.t2s.TextToSpeech.Text2SpeechConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateT2sPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of text-to-speech pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse> listT2sPipelines(
        ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListT2sPipelinesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of languages available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse> listT2sLanguages(
        ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListT2sLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of domains available based on specific configuration requirements.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.ListT2sDomainsResponse> listT2sDomains(
        ondewo.t2s.TextToSpeech.ListT2sDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListT2sDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse> listT2sNormalizationPipelines(
        ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListT2sNormalizationPipelinesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves the version information of the running text-to-speech server.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse> getServiceInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a custom phonemizer based on the provided PhonemizerId.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.CustomPhonemizerProto> getCustomPhonemizer(
        ondewo.t2s.TextToSpeech.PhonemizerId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomPhonemizerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a custom phonemizer based on the provided CreateCustomPhonemizerRequest.
     * Returns the PhonemizerId associated with the created custom phonemizer.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.PhonemizerId> createCustomPhonemizer(
        ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomPhonemizerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a custom phonemizer based on the provided PhonemizerId.
     * Returns an Empty response upon successful deletion.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCustomPhonemizer(
        ondewo.t2s.TextToSpeech.PhonemizerId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCustomPhonemizerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates the specified custom phonemizer with the provided configuration.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.CustomPhonemizerProto> updateCustomPhonemizer(
        ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCustomPhonemizerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of custom phonemizers based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse> listCustomPhonemizer(
        ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCustomPhonemizerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Clones a voice based on a sample audio of the speaker and its transcription.
     * The cloned voice can afterwards be used for synthesis by referencing the given speaker name.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> voiceCloning(
        ondewo.t2s.TextToSpeech.VoiceCloningRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoiceCloningMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNTHESIZE = 0;
  private static final int METHODID_BATCH_SYNTHESIZE = 1;
  private static final int METHODID_NORMALIZE_TEXT = 2;
  private static final int METHODID_GET_T2S_PIPELINE = 3;
  private static final int METHODID_CREATE_T2S_PIPELINE = 4;
  private static final int METHODID_DELETE_T2S_PIPELINE = 5;
  private static final int METHODID_UPDATE_T2S_PIPELINE = 6;
  private static final int METHODID_LIST_T2S_PIPELINES = 7;
  private static final int METHODID_LIST_T2S_LANGUAGES = 8;
  private static final int METHODID_LIST_T2S_DOMAINS = 9;
  private static final int METHODID_LIST_T2S_NORMALIZATION_PIPELINES = 10;
  private static final int METHODID_GET_SERVICE_INFO = 11;
  private static final int METHODID_GET_CUSTOM_PHONEMIZER = 12;
  private static final int METHODID_CREATE_CUSTOM_PHONEMIZER = 13;
  private static final int METHODID_DELETE_CUSTOM_PHONEMIZER = 14;
  private static final int METHODID_UPDATE_CUSTOM_PHONEMIZER = 15;
  private static final int METHODID_LIST_CUSTOM_PHONEMIZER = 16;
  private static final int METHODID_VOICE_CLONING = 17;
  private static final int METHODID_STREAMING_SYNTHESIZE = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNTHESIZE:
          serviceImpl.synthesize((ondewo.t2s.TextToSpeech.SynthesizeRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.SynthesizeResponse>) responseObserver);
          break;
        case METHODID_BATCH_SYNTHESIZE:
          serviceImpl.batchSynthesize((ondewo.t2s.TextToSpeech.BatchSynthesizeRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.BatchSynthesizeResponse>) responseObserver);
          break;
        case METHODID_NORMALIZE_TEXT:
          serviceImpl.normalizeText((ondewo.t2s.TextToSpeech.NormalizeTextRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.NormalizeTextResponse>) responseObserver);
          break;
        case METHODID_GET_T2S_PIPELINE:
          serviceImpl.getT2sPipeline((ondewo.t2s.TextToSpeech.T2sPipelineId) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.Text2SpeechConfig>) responseObserver);
          break;
        case METHODID_CREATE_T2S_PIPELINE:
          serviceImpl.createT2sPipeline((ondewo.t2s.TextToSpeech.Text2SpeechConfig) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.T2sPipelineId>) responseObserver);
          break;
        case METHODID_DELETE_T2S_PIPELINE:
          serviceImpl.deleteT2sPipeline((ondewo.t2s.TextToSpeech.T2sPipelineId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_T2S_PIPELINE:
          serviceImpl.updateT2sPipeline((ondewo.t2s.TextToSpeech.Text2SpeechConfig) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_T2S_PIPELINES:
          serviceImpl.listT2sPipelines((ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse>) responseObserver);
          break;
        case METHODID_LIST_T2S_LANGUAGES:
          serviceImpl.listT2sLanguages((ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse>) responseObserver);
          break;
        case METHODID_LIST_T2S_DOMAINS:
          serviceImpl.listT2sDomains((ondewo.t2s.TextToSpeech.ListT2sDomainsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sDomainsResponse>) responseObserver);
          break;
        case METHODID_LIST_T2S_NORMALIZATION_PIPELINES:
          serviceImpl.listT2sNormalizationPipelines((ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_INFO:
          serviceImpl.getServiceInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOM_PHONEMIZER:
          serviceImpl.getCustomPhonemizer((ondewo.t2s.TextToSpeech.PhonemizerId) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.CustomPhonemizerProto>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOM_PHONEMIZER:
          serviceImpl.createCustomPhonemizer((ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.PhonemizerId>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOM_PHONEMIZER:
          serviceImpl.deleteCustomPhonemizer((ondewo.t2s.TextToSpeech.PhonemizerId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOM_PHONEMIZER:
          serviceImpl.updateCustomPhonemizer((ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.CustomPhonemizerProto>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_PHONEMIZER:
          serviceImpl.listCustomPhonemizer((ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse>) responseObserver);
          break;
        case METHODID_VOICE_CLONING:
          serviceImpl.voiceCloning((ondewo.t2s.TextToSpeech.VoiceCloningRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAMING_SYNTHESIZE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingSynthesize(
              (io.grpc.stub.StreamObserver<ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSynthesizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.SynthesizeRequest,
              ondewo.t2s.TextToSpeech.SynthesizeResponse>(
                service, METHODID_SYNTHESIZE)))
        .addMethod(
          getBatchSynthesizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.BatchSynthesizeRequest,
              ondewo.t2s.TextToSpeech.BatchSynthesizeResponse>(
                service, METHODID_BATCH_SYNTHESIZE)))
        .addMethod(
          getStreamingSynthesizeMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.StreamingSynthesizeRequest,
              ondewo.t2s.TextToSpeech.StreamingSynthesizeResponse>(
                service, METHODID_STREAMING_SYNTHESIZE)))
        .addMethod(
          getNormalizeTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.NormalizeTextRequest,
              ondewo.t2s.TextToSpeech.NormalizeTextResponse>(
                service, METHODID_NORMALIZE_TEXT)))
        .addMethod(
          getGetT2sPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.T2sPipelineId,
              ondewo.t2s.TextToSpeech.Text2SpeechConfig>(
                service, METHODID_GET_T2S_PIPELINE)))
        .addMethod(
          getCreateT2sPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.Text2SpeechConfig,
              ondewo.t2s.TextToSpeech.T2sPipelineId>(
                service, METHODID_CREATE_T2S_PIPELINE)))
        .addMethod(
          getDeleteT2sPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.T2sPipelineId,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_T2S_PIPELINE)))
        .addMethod(
          getUpdateT2sPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.Text2SpeechConfig,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_T2S_PIPELINE)))
        .addMethod(
          getListT2sPipelinesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.ListT2sPipelinesRequest,
              ondewo.t2s.TextToSpeech.ListT2sPipelinesResponse>(
                service, METHODID_LIST_T2S_PIPELINES)))
        .addMethod(
          getListT2sLanguagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.ListT2sLanguagesRequest,
              ondewo.t2s.TextToSpeech.ListT2sLanguagesResponse>(
                service, METHODID_LIST_T2S_LANGUAGES)))
        .addMethod(
          getListT2sDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.ListT2sDomainsRequest,
              ondewo.t2s.TextToSpeech.ListT2sDomainsResponse>(
                service, METHODID_LIST_T2S_DOMAINS)))
        .addMethod(
          getListT2sNormalizationPipelinesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesRequest,
              ondewo.t2s.TextToSpeech.ListT2sNormalizationPipelinesResponse>(
                service, METHODID_LIST_T2S_NORMALIZATION_PIPELINES)))
        .addMethod(
          getGetServiceInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ondewo.t2s.TextToSpeech.T2SGetServiceInfoResponse>(
                service, METHODID_GET_SERVICE_INFO)))
        .addMethod(
          getGetCustomPhonemizerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.PhonemizerId,
              ondewo.t2s.TextToSpeech.CustomPhonemizerProto>(
                service, METHODID_GET_CUSTOM_PHONEMIZER)))
        .addMethod(
          getCreateCustomPhonemizerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.CreateCustomPhonemizerRequest,
              ondewo.t2s.TextToSpeech.PhonemizerId>(
                service, METHODID_CREATE_CUSTOM_PHONEMIZER)))
        .addMethod(
          getDeleteCustomPhonemizerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.PhonemizerId,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CUSTOM_PHONEMIZER)))
        .addMethod(
          getUpdateCustomPhonemizerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.UpdateCustomPhonemizerRequest,
              ondewo.t2s.TextToSpeech.CustomPhonemizerProto>(
                service, METHODID_UPDATE_CUSTOM_PHONEMIZER)))
        .addMethod(
          getListCustomPhonemizerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.ListCustomPhonemizerRequest,
              ondewo.t2s.TextToSpeech.ListCustomPhonemizerResponse>(
                service, METHODID_LIST_CUSTOM_PHONEMIZER)))
        .addMethod(
          getVoiceCloningMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.t2s.TextToSpeech.VoiceCloningRequest,
              com.google.protobuf.Empty>(
                service, METHODID_VOICE_CLONING)))
        .build();
  }

  private static abstract class Text2SpeechBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Text2SpeechBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.t2s.TextToSpeech.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Text2Speech");
    }
  }

  private static final class Text2SpeechFileDescriptorSupplier
      extends Text2SpeechBaseDescriptorSupplier {
    Text2SpeechFileDescriptorSupplier() {}
  }

  private static final class Text2SpeechMethodDescriptorSupplier
      extends Text2SpeechBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    Text2SpeechMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Text2SpeechGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Text2SpeechFileDescriptorSupplier())
              .addMethod(getSynthesizeMethod())
              .addMethod(getBatchSynthesizeMethod())
              .addMethod(getStreamingSynthesizeMethod())
              .addMethod(getNormalizeTextMethod())
              .addMethod(getGetT2sPipelineMethod())
              .addMethod(getCreateT2sPipelineMethod())
              .addMethod(getDeleteT2sPipelineMethod())
              .addMethod(getUpdateT2sPipelineMethod())
              .addMethod(getListT2sPipelinesMethod())
              .addMethod(getListT2sLanguagesMethod())
              .addMethod(getListT2sDomainsMethod())
              .addMethod(getListT2sNormalizationPipelinesMethod())
              .addMethod(getGetServiceInfoMethod())
              .addMethod(getGetCustomPhonemizerMethod())
              .addMethod(getCreateCustomPhonemizerMethod())
              .addMethod(getDeleteCustomPhonemizerMethod())
              .addMethod(getUpdateCustomPhonemizerMethod())
              .addMethod(getListCustomPhonemizerMethod())
              .addMethod(getVoiceCloningMethod())
              .build();
        }
      }
    }
    return result;
  }
}
