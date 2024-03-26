import 'package:rook_sdk/src/platform/rook_sdk_platform_interface.dart';

final class RookConfigurationManager {

  Future<String?> getPlatformVersion() {
    return RookSdkPlatform.instance.getPlatformVersion();
  }
}