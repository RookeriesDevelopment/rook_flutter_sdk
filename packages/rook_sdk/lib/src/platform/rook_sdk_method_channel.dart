import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';
import 'package:rook_sdk/src/data/extension/result_boolean_extensions.dart';
import 'package:rook_sdk/src/data/mapper/availability_status_mappers.dart';
import 'package:rook_sdk/src/data/mapper/health_permission_mappers.dart';
import 'package:rook_sdk/src/data/proto/protos.pb.dart';
import 'package:rook_sdk/src/domain/enums/availability_status.dart';
import 'package:rook_sdk/src/domain/enums/health_permission.dart';

import 'rook_sdk_platform_interface.dart';

class MethodChannelRookSdk extends RookSdkPlatform {
  @visibleForTesting
  final methodChannel = const MethodChannel('rook_sdk');

  @override
  Future<AvailabilityStatus> checkAvailability() async {
    final int code = await methodChannel.invokeMethod('checkAvailability');
    final proto = AvailabilityStatusProto.valueOf(code) ??
        AvailabilityStatusProto.NOT_SUPPORTED;

    return proto.toDomain();
  }

  @override
  Future<void> openHealthConnectSettings() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'openHealthConnectSettings',
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<bool> checkPermissions(HealthPermission healthPermission) async {
    final proto = healthPermission.toProto();

    final Uint8List bytes = await methodChannel.invokeMethod(
      'checkPermissions',
      [proto.value],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    return result.unwrap();
  }

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
