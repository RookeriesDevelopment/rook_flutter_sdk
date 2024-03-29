import 'package:rook_sdk_health_connect/src/platform/rook_sdk_health_connect_platform_interface.dart';

class AndroidStepsTracker {
  AndroidStepsTracker._();

  /// Checks if the device has the required sensors; [STEP_COUNTER](https://developer.android.com/develop/sensors-and-location/sensors/sensors_motion#sensors-motion-stepcounter).
  static Future<bool> isAvailable() {
    return RookSdkHealthConnectPlatform.instance.isStepsTrackerAvailable();
  }

  /// Checks if the tracker is running in background.
  static Future<bool> isActive() {
    return RookSdkHealthConnectPlatform.instance.isStepsTrackerActive();
  }

  /// Check if all required permissions are granted.
  static Future<bool> hasPermissions() {
    return RookSdkHealthConnectPlatform.instance.hasStepsTrackerPermissions();
  }

  /// Request all required permissions, the permissions requested may vary depending on the Android version.
  static Future<void> requestPermissions() {
    return RookSdkHealthConnectPlatform.instance
        .requestStepsTrackerPermissions();
  }

  /// Starts the StepsTracker service, if the service is already active this function won't do anything.
  static Future<void> start() {
    return RookSdkHealthConnectPlatform.instance.startStepsTracker();
  }

  /// Stops the StepsTracker service, if the service is not active this function won't do anything.
  static Future<void> stop() {
    return RookSdkHealthConnectPlatform.instance.stopStepsTracker();
  }

  /// Returns the last stored step count of the current day.
  /// This value is updated every time the phone detects a step taken and will be reset to zero every day.
  static Future<int> getTodaySteps() {
    return RookSdkHealthConnectPlatform.instance.getTodaySteps();
  }
}
