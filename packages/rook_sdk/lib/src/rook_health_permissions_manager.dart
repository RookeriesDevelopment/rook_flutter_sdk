import 'package:rook_sdk/src/domain/enums/health_permission.dart';
import 'package:rook_sdk/src/platform/rook_sdk_platform_interface.dart';

final class RookHealthPermissionsManager {

  /// Launch a request to ask the user to grant the provided [healthPermission].
  static Future<void> requestPermissions(HealthPermission healthPermission) {
    return RookSdkPlatform.instance.requestPermissions(healthPermission);
  }
}