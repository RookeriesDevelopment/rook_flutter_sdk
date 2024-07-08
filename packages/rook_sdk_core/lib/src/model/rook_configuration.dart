import 'package:rook_sdk_core/src/enum/rook_environment.dart';

/// This class represents the credentials of the SDK.
///
/// * [clientUUID] Client unique identifier provided by ROOK.
/// * [secretKey] Client secretKey provided by ROOK.
/// * [environment] Behaviour configuration.
/// * [enableBackgroundSync] Automatically enables background sync on Apple Health and Auto Sync on Health Connect
class RookConfiguration {
  final String clientUUID;
  final String secretKey;
  final RookEnvironment environment;
  final bool enableBackgroundSync;

  RookConfiguration({
    required this.clientUUID,
    required this.secretKey,
    required this.environment,
    required this.enableBackgroundSync,
  });

  @override
  String toString() {
    return 'RookConfiguration{clientUUID: $clientUUID, secretKey: $secretKey, environment: $environment}';
  }
}
