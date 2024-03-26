import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';
import 'package:rook_sdk/src/data/extension/result_boolean_extensions.dart';
import 'package:rook_sdk/src/data/mapper/health_permission_mappers.dart';
import 'package:rook_sdk/src/data/proto/protos.pb.dart';
import 'package:rook_sdk/src/domain/enums/health_permission.dart';

import 'rook_sdk_platform_interface.dart';

class MethodChannelRookSdk extends RookSdkPlatform {

  @visibleForTesting
  final methodChannel = const MethodChannel('rook_sdk');

  @override
  Future<void> requestPermissions(HealthPermission healthPermission) async {
    final proto = healthPermission.toProto();

    final Uint8List bytes = await methodChannel.invokeMethod(
      'requestPermissions',
      [proto.value],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }
}
