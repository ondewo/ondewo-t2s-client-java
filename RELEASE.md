# Release History

*****************

## Release ONDEWO T2S Java Client 6.6.0

### New Features

* Initial release of the ONDEWO T2S (Text-to-Speech) gRPC client for Java. The library
  is generated from the protobuf definitions of [ondewo-t2s-api](https://github.com/ondewo/ondewo-t2s-api)
  by the `ondewo-java-proto-compiler` image of the
  [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) release
  `5.15.1`: `protoc --java_out` for the message classes, `protoc-gen-grpc-java` for the
  service stubs, and a rendered `pom.xml` that pins the gRPC, protobuf and
  `proto-google-common-protos` versions the stubs were generated against. The packaged artifact is
  `com.ondewo:ondewo-t2s-client-java`, compiled with `maven.compiler.release=11`, and ships a
  sources jar alongside the binary jar.
* The generated stubs (`src/main/java`) and the rendered `pom.xml` are **committed**, so the
  library is consumable, IDE-openable and buildable without docker.
* A JUnit 5 suite (18 tests) exercises the committed stubs for real: message round trips through
  the binary marshallers, enum zero values, descriptor package names, the generated
  `Text2SpeechGrpc` service descriptor, and one unary call end to end over the gRPC in-process
  transport. `com.ondewo.t2s.auth.BearerToken` is the one hand-written class - the authorization
  helper - and JaCoCo enforces **100 %** instruction, branch and method coverage over it, bound
  to the `verify` phase.
* `make build` regenerates the whole client from the pinned submodules - api protos and proto
  compiler - and `make test` verifies that every `.proto` produced java code before running
  `mvn verify` (suite + coverage gate). Both run in CI on JDK 11 and JDK 21; no CI step is
  conditional, so a missing or truncated client turns the run red instead of skipping.

*****************
