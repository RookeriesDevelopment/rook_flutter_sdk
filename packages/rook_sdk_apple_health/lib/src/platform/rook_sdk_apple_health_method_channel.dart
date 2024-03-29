import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';
import 'package:rook_sdk_apple_health/src/data/extension/result_boolean_extensions.dart';
import 'package:rook_sdk_apple_health/src/data/extension/result_int64_extensions.dart';
import 'package:rook_sdk_apple_health/src/data/mapper/rook_configuration_mappers.dart';
import 'package:rook_sdk_apple_health/src/data/proto/protos.pb.dart';
import 'package:rook_sdk_apple_health/src/platform/rook_sdk_apple_health_platform_interface.dart';
import 'package:rook_sdk_core/rook_sdk_core.dart';

class MethodChannelRookSdkAppleHealth extends RookSdkAppleHealthPlatform {
  @visibleForTesting
  final methodChannel = const MethodChannel('rook_sdk_apple_health');

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
  Future<void> requestAllPermissions() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('requestAllPermissions');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> requestSleepPermissions() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('requestSleepPermissions');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> requestBodyPermissions() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('requestBodyPermissions');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> requestPhysicalPermissions() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('requestPhysicalPermissions');
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
  Future<void> syncYesterdaySummaries() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncYesterdaySummaries',
    );
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
  Future<void> syncPendingEvents() async {
    final Uint8List bytes =
        await methodChannel.invokeMethod('syncPendingEvents');
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> syncYesterdayEvents() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'syncYesterdayEvents',
    );
    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<bool> isStepsTrackerActive() async {
    await Future.delayed(const Duration(milliseconds: 1500));

    final Uint8List bytes = await methodChannel.invokeMethod(
      'isStepsTrackerActive',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<void> startStepsTracker() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'startStepsTracker',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> stopStepsTracker() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'stopStepsTracker',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<int> getTodaySteps() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'getTodaySteps',
    );

    final result = ResultInt64Proto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<bool> isCaloriesTrackerActive() async {
    await Future.delayed(const Duration(milliseconds: 1500));

    final Uint8List bytes = await methodChannel.invokeMethod(
      'isCaloriesTrackerActive',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<void> startCaloriesTracker() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'startCaloriesTracker',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> stopCaloriesTracker() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'stopCaloriesTracker',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<int> getTodayCalories() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'getTodayCalories',
    );

    final result = ResultInt64Proto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<bool> isYesterdaySyncEnabled() async {
    await Future.delayed(const Duration(milliseconds: 1500));

    final Uint8List bytes = await methodChannel.invokeMethod(
      'isYesterdaySyncEnabled',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    return result.unwrap();
  }

  @override
  Future<void> enableYesterdaySync(RookConfiguration rookConfiguration) async {
    final rookConfigurationProto = rookConfiguration.toProto();

    final Uint8List bytes = await methodChannel.invokeMethod(
      'enableYesterdaySync',
      [
        rookConfigurationProto.writeToBuffer(),
      ],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> disableYesterdaySync() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'disableYesterdaySync',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> enableBackGroundForSummaries(
    RookConfiguration rookConfiguration,
  ) async {
    final rookConfigurationProto = rookConfiguration.toProto();

    final Uint8List bytes = await methodChannel.invokeMethod(
      'enableBackGroundForSummaries',
      [
        rookConfigurationProto.writeToBuffer(),
      ],
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }

  @override
  Future<void> disableBackGroundForSummaries() async {
    final Uint8List bytes = await methodChannel.invokeMethod(
      'disableBackGroundForSummaries',
    );

    final result = ResultBooleanProto.fromBuffer(bytes);

    result.unwrap();
  }
}
