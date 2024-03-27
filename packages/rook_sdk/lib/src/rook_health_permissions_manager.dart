import 'package:rook_sdk/src/domain/annotation/android_exclusive.dart';
import 'package:rook_sdk/src/domain/enums/availability_status.dart';
import 'package:rook_sdk/src/domain/enums/health_permission.dart';
import 'package:rook_sdk/src/domain/platform/enforce_android_platform.dart';
import 'package:rook_sdk/src/platform/rook_sdk_platform_interface.dart';

final class RookHealthPermissionsManager {
  const RookHealthPermissionsManager._();

  /// Check if the Health Connect APK is installed in this device.
  @AndroidExclusive()
  static Future<AvailabilityStatus> checkAvailability() {
    enforceAndroidPlatform();

    return RookSdkPlatform.instance.checkAvailability();
  }

  /// Launches the health Connect application.
  @AndroidExclusive()
  static Future<void> openHealthConnectSettings() {
    enforceAndroidPlatform();

    return RookSdkPlatform.instance.openHealthConnectSettings();
  }

  /// Checks if the provided [healthPermission] is granted.
  @AndroidExclusive()
  static Future<bool> checkPermissions(HealthPermission healthPermission) {
    enforceAndroidPlatform();

    return RookSdkPlatform.instance.checkPermissions(healthPermission);
  }

  /// Launch a request to ask the user to grant the provided [healthPermission].
  static Future<void> requestPermissions(HealthPermission healthPermission) {
    return RookSdkPlatform.instance.requestPermissions(healthPermission);
  }
}
