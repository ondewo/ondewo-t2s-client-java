# Release History

*****************

## Release ONDEWO T2S Java Client 6.7.1

### New Features

* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) Offline-token start-up, as the python SDK has it: a handed-off Keycloak OFFLINE refresh token (`refreshToken`) replaces the password. The provider then starts with ONE `grant_type=refresh_token` exchange and never sends a password grant, not even when the token is refused, because Keycloak's brute-force detection counts failed password logins and N processes sharing one technical user would lock it. A Keycloak config needs `password` or `refreshToken`; with both, the refresh token wins.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) `ClientConfig.builder()` takes `keycloakUrl`, `realm`, `clientId`, `username`, `password`, `refreshToken`, `tokenExpirationInS` and `keycloakVerifySsl`, and every channel from `GrpcChannels.newChannel` carries the bearer token of one shared `com.ondewo.t2s.auth.KeycloakTokenProvider` per credential set, refreshed by the daemon thread `keycloak-token-refresh-<clientId>`; failures raise `KeycloakAuthenticationException`.

### Bug Fixes

* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) The field names in the "no access_token" error are quoted as python's `repr` quotes them (`['expires_in', 'refresh_token']`).
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) The backoff exponent cap comes from `KeycloakTimings.maxRetryExponent` (default 6, negative values clamped to 0); the six-argument constructor still works.

### Improvements

* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) A failed token refresh never ends the refreshing: every failure (an unreachable or timed-out token endpoint, a non-2xx answer, a body that is not a JSON object, a missing `access_token`, a non-numeric `expires_in`) is retried with a full-jitter backoff from 5 s doubling up to 300 s, which the background refresh and the per-call refresh share, so a Keycloak outage costs one token request per backoff step instead of one per call. A success resets the backoff.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) A token that is still valid keeps being served while its refresh fails; only an EXPIRED token that cannot be refreshed fails, with a Keycloak authentication error that chains the underlying cause. A malformed token response changes no provider state, and an error about a response without an `access_token` names its field names only, never their values.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) One provider is shared per credential set: the registry key is a SHA-256 over the Keycloak connection and credential fields (the password and the refresh token enter it only as hashes), so two configs of different tenants never share a provider and all clients of one identity log in once.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) The token request times out after 10 s, quoted Keycloak error bodies are cut at 500 characters, each failed attempt logs one WARNING (attempt number, retry delay, remaining token validity) and the first success afterwards one INFO; no error message and no log line carries a password or a token.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) The behaviour is pinned by the same test catalogue as the python SDK (`test_keycloak_refresh_resilience.py`, `test_client_config_refresh_token.py`), plus edge cases: every failure kind, the backoff ladder and its bounds, concurrent callers during an outage (one token request), malformed responses, credential-free logs and the credential-keyed registry.

*****************

## Release ONDEWO T2S Java Client 6.7.0

### Improvements

* Tracking API Version [6.7.0](https://github.com/ondewo/ondewo-t2s-api/releases/tag/6.7.0) ( [Documentation](https://ondewo.github.io/ondewo-t2s-api/) )
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) Generated with ondewo-proto-compiler 5.17.0 (protoc 35.1). New runtime floors: protobuf-java 4.35.1, grpc-java 1.85.1, proto-google-common-protos 2.82.0.

*****************

## Release ONDEWO T2S Java Client 6.6.1

### New Features

* TLS and mutual TLS helper in the hand-written package `com.ondewo.t2s.channel` (kept by a
  regeneration): `ClientConfig` (`host`, `port`, `grpcCert`, `grpcClientCert`, `grpcClientKey`,
  `useSecureChannel`, default `true`) and `GrpcChannels.newChannel(config)` /
  `GrpcChannels.newChannelBuilder(config)`. One channel serves every stub of the client.
  * The certificate fields take **PEM content, not file paths**. Non-PEM material (typically a path) or an
    encrypted / non-PKCS#8 key is refused with `IllegalArgumentException` before any connection is
    attempted. An empty `grpcCert` means the JVM trust store.
  * `grpcClientCert` and `grpcClientKey` are both-or-neither: setting only one makes
    `ClientConfig.Builder.build()` throw. Both empty means plain server-authenticated TLS.
  * `useSecureChannel(false)` with a client identity throws instead of silently dropping it. A plaintext
    channel logs a `WARNING` naming `host:port` through `java.util.logging`; the logging configuration of
    the application is never touched.
  * `ClientConfig.toString()` shows `grpcClientKey` as `***REDACTED***` (empty when unset) and the
    certificates only as their length; no error message renders a PEM, the key or a whole config.
  * A bare IPv6 literal host is bracketed (`::1` -> `[::1]:50051`); PEMs with CRLF line endings work.
* Channel defaults aligned with the ONDEWO Python clients where grpc-java exposes them: keepalive timeout
  20 s, `keepAliveWithoutCalls(false)`, `maxInboundMessageSize(Integer.MAX_VALUE)`.
  * Keepalive time is **5 minutes**, not the Python clients' 30 s: grpc-java has no
    `http2.max_pings_without_data`, so a 30 s ping on a silent stream is answered by a default grpc-core
    server with a `too_many_pings` GOAWAY (measured against a grpcio 1.81 server). Pair a server that
    permits faster pings with a shorter `keepAliveTime` on the builder.
  * Not available in grpc-java and documented as gaps: `http2.max_pings_without_data`,
    `max_reconnect_backoff_ms` (grpc-java's backoff caps at 120 s), and no retry policy is configured
    (only gRPC's transparent retries).

### Improvements

* Still tracking API Version [6.6.0](https://github.com/ondewo/ondewo-t2s-api/releases/tag/6.6.0)
* The stubs are generated by the [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) `5.15.2` (was `5.15.1`).
* README section "TLS, mutual TLS and certificates": modes, loading PEMs from files, a test PKI with openssl,
  channel defaults, security notes and troubleshooting.

### Tests

* `ClientConfigTest` and `GrpcChannelsTest`: real TLS handshakes against a loopback Netty server with a PKI
  generated at test time (BouncyCastle, test scope only; no key is committed) - TLS with a custom CA, mutual
  TLS, CRLF PEMs, IPv6 `[::1]`, empty identity = plain TLS; missing client certificate, client from an
  unrelated CA and wrong CA end in `UNAVAILABLE`; half pair, plaintext with identity, insecure warning and
  redaction edge cases. The 100 % JaCoCo gate now also covers `com/ondewo/t2s/channel/**`.
* `ReleaseNotesTest` pins the `RELEASE.md` heading spelling and the `*****` separator the GitHub release
  body is sliced by, and that the current version has non-empty notes.

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
