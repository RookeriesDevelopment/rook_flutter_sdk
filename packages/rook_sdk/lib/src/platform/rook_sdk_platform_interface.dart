import 'package:plugin_platform_interface/plugin_platform_interface.dart';
import 'package:rook_sdk/src/domain/enums/health_permission.dart';

import 'rook_sdk_method_channel.dart';

abstract class RookSdkPlatform extends PlatformInterface {
  RookSdkPlatform() : super(token: _token);

  static final Object _token = Object();

  static RookSdkPlatform _instance = MethodChannelRookSdk();
  static RookSdkPlatform get instance => _instance;

  static set instance(RookSdkPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<void> requestPermissions(HealthPermission healthPermission);
}
