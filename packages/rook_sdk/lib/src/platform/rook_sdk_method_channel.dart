import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'rook_sdk_platform_interface.dart';

class MethodChannelRookSdk extends RookSdkPlatform {

  @visibleForTesting
  final methodChannel = const MethodChannel('rook_sdk');

  @override
  Future<String?> getPlatformVersion() async {
    final version = await methodChannel.invokeMethod<String>('getPlatformVersion');
    return version;
  }
}
