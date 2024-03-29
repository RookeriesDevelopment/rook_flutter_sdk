import 'package:rook_sdk_apple_health/src/platform/rook_sdk_apple_health_platform_interface.dart';
import 'package:rook_sdk_core/rook_sdk_core.dart';

class AHRookConfigurationManager {
  /// Set the credentials to use this SDK.
  Future<void> setConfiguration(RookConfiguration rookConfiguration) {
    return RookSdkAppleHealthPlatform.instance.setConfiguration(
      rookConfiguration,
    );
  }

  Future<String?> getUserID() {
    return RookSdkAppleHealthPlatform.instance.getUserID();
  }

  /// Initializes all internal SDKs using the [RookConfiguration] provided with [setConfiguration].
  Future<void> initRook() {
    return RookSdkAppleHealthPlatform.instance.initRook();
  }

  /// Sets the current user for data upload.
  Future<void> updateUserID(String userID) {
    return RookSdkAppleHealthPlatform.instance.updateUserID(userID);
  }

  /// Removes the current user for data upload.
  Future<void> clearUserID() {
    return RookSdkAppleHealthPlatform.instance.clearUserID();
  }

  /// Removes the current user from appleHealth data source,
  /// once removed rook servers won't accept any health data from appleHealth.
  Future<void> deleteUserFromRook() {
    return RookSdkAppleHealthPlatform.instance.deleteUserFromRook();
  }

  /// Extract and upload timezone information for the current user.
  ///
  /// **IMPORTANT: This function is already called every time `updateUserID` completes successfully,
  /// in most cases the above behavior is more than enough. Only use this function if you need to update
  /// the timezone information manually.**
  Future<void> syncUserTimeZone() {
    return RookSdkAppleHealthPlatform.instance.syncUserTimeZone();
  }
}
