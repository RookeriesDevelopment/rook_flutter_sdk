import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';
import 'package:rook_sdk_apple_health/src/data/extension/result_boolean_extensions.dart';
import 'package:rook_sdk_apple_health/src/data/extension/result_data_sources_extensions.dart';
import 'package:rook_sdk_apple_health/src/data/extension/result_int64_extensions.dart';
import 'package:rook_sdk_apple_health/src/data/mapper/rook_configuration_mappers.dart';
import 'package:rook_sdk_apple_health/src/data/mapper/rook_environment_mappers.dart';
import 'package:rook_sdk_apple_health/src/data/proto/protos.pb.dart';
import 'package:rook_sdk_apple_health/src/platform/rook_sdk_apple_health_platform_interface.dart';
import 'package:rook_sdk_core/rook_sdk_core.dart';

class MethodChannelRookSdkAppleHealth extends RookSdkAppleHealthPlatform {
  @visibleForTesting
  final methodChannel = const MethodChannel('rook_sdk_apple_health');

  @override
  Future<void> enableNativeLogs() async {
    await methodChannel.invokeMethod('enableNativeLogs');
  }

  @override
  Future<void> setConfiguration(RookConfiguration rookConfiguration) async {
    final rookConfigurationProto = rookConfiguration.toProto();

    await methodChannel.invokeMethod(
      'setConfiguration',
      [
        rookConfigurationProto.writeToBuffer(),
      ],
    );
  }

  @override
  Future<String?> getUserID() {
    return methodChannel.invokeMethod('getUserID');
  }

  @override
  Future<void> initRook() async {
    final Uint8List bytes = await methodChannel.invokeMethod('initRook');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> updateUserID(String userID) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'updateUserID',
      [
        userID,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> clearUserID() async {
    await methodChannel.invokeMethod('clearUserID');
  }

  @override
  Future<void> deleteUserFromRook() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'deleteUserFromRook',
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncUserTimeZone() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('syncUserTimeZone');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> requestPermissions() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('requestPermissions');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncSleepSummary(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncSleepSummary',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncBodySummary(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncBodySummary',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncPhysicalSummary(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncPhysicalSummary',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncPendingSummaries() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('syncPendingSummaries');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncPhysicalEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncPhysicalEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncBloodGlucoseEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncBloodGlucoseEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncBloodPressureEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncBloodPressureEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncBodyMetricsEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncBodyMetricsEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncBodyHeartRateEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncBodyHeartRateEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncPhysicalHeartRateEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncPhysicalHeartRateEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncBodyOxygenationEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncBodyOxygenationEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncPhysicalOxygenationEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncPhysicalOxygenationEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncTemperatureEvents(DateTime date) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncTemperatureEvents',
      [
        date.millisecondsSinceEpoch,
      ],
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<int?> syncTodayAppleHealthStepsCount() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncTodayAppleHealthStepsCount',
    );

    final result = ResultInt64Proto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<void> syncPendingEvents() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('syncPendingEvents');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<bool> isContinuousUploadEnabled() async {
    await Future.delayed(const Duration(milliseconds: 1500));

    final Uint8List bytes = await methodChannel.invokeMethod(
      'isContinuousUploadEnabled',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<void> enableContinuousUpload(
    bool enableNativeLogs,
    String clientUUID,
    String secretKey,
    RookEnvironment environment,
  ) async {
    final rookConfigurationProto = RookConfigurationProto(
      clientUUID: clientUUID,
      secretKey: secretKey,
      environment: environment.toProto(),
      enableBackgroundSync: false,
    );

    final Uint8List bytes = await methodChannel.invokeMethod(
      'enableContinuousUpload',
      [
        enableNativeLogs,
        rookConfigurationProto.writeToBuffer(),
      ],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> disableContinuousUpload() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'disableContinuousUpload',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> enableBackground(
    bool enableNativeLogs,
    String clientUUID,
    String secretKey,
    RookEnvironment environment,
  ) async {
    final rookConfigurationProto = RookConfigurationProto(
      clientUUID: clientUUID,
      secretKey: secretKey,
      environment: environment.toProto(),
      enableBackgroundSync: false,
    );

    final Uint8List bytes = await methodChannel.invokeMethod(
      'enableBackground',
      [
        enableNativeLogs,
        rookConfigurationProto.writeToBuffer(),
      ],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> disableBackground() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'disableBackground',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<List<DataSource>> getAvailableDataSources(String? redirectUrl) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'getAvailableDataSources',
      [
        redirectUrl,
      ],
    );

    final result = ResultDataSourcesProto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<void> presentDataSourceView(String? redirectUrl) async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'presentDataSourceView',
      [
        redirectUrl,
      ],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }
}
