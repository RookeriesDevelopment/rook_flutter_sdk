import 'package:fixnum/fixnum.dart';
import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:rook_sdk_core/rook_sdk_core.dart';
import 'package:rook_sdk_health_connect/rook_sdk_health_connect.dart';
import 'package:rook_sdk_health_connect/src/data/proto/protos.pb.dart';
import 'package:rook_sdk_health_connect/src/platform/rook_sdk_health_connect_method_channel.dart';

void main() {
  TestWidgetsFlutterBinding.ensureInitialized();

  final platform = MethodChannelRookSdkHealthConnect();
  const channel = MethodChannel('rook_sdk_health_connect');

  tearDown(() {
    TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
        .setMockMethodCallHandler(channel, null);
  });

  group('MethodChannelRookSdkHealthConnect | ResultBooleanProto success unwrap',
      () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultBooleanProto();
        proto.success = true;
        return proto.writeToBuffer();
      });
    });

    test('GIVEN a Result.success WHEN enableNativeLogs THEN complete',
        () async {
      final future = platform.enableNativeLogs();

      await expectLater(future, completes);
    });

    test('GIVEN a Result.success WHEN setConfiguration THEN complete',
        () async {
      final rookConfiguration = RookConfiguration(
        'rookUrl',
        'clientUUID',
        RookEnvironment.sandbox,
      );
      final future = platform.setConfiguration(rookConfiguration);

      await expectLater(future, completes);
    });

    test('GIVEN a Result.success WHEN initRook THEN complete', () async {
      final future = platform.initRook();

      await expectLater(future, completes);
    });

    test('GIVEN a Result.success WHEN updateUserID THEN complete', () async {
      final future = platform.updateUserID('userID');

      await expectLater(future, completes);
    });

    test('GIVEN a Result.success WHEN clearUserID THEN complete', () async {
      final future = platform.clearUserID();

      await expectLater(future, completes);
    });

    test('GIVEN a Result.success WHEN deleteUserFromRook THEN complete',
        () async {
      final future = platform.deleteUserFromRook();

      await expectLater(future, completes);
    });

    test(
      'GIVEN a Result.success WHEN syncUserTimeZone THEN complete',
      () async {
        final future = platform.syncUserTimeZone();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN openHealthConnectSettings THEN complete',
      () async {
        final future = platform.openHealthConnectSettings();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN checkPermissions THEN complete with expected value',
      () async {
        final future = platform.checkPermissions(HCHealthPermission.sleep);

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN requestPermissions THEN complete',
      () async {
        final future = platform.requestPermissions(HCHealthPermission.sleep);

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN shouldSyncFor THEN complete with expected value',
      () async {
        final future = platform.shouldSyncFor(
            HCHealthDataType.sleepSummary, DateTime.now());

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncPendingSummaries THEN complete',
      () async {
        final future = platform.syncPendingSummaries();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN syncYesterdaySummaries THEN complete',
      () async {
        final future = platform.syncYesterdaySummaries();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN syncPendingEvents THEN complete',
      () async {
        final future = platform.syncPendingEvents();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN syncYesterdayEvents THEN complete',
      () async {
        final future = platform.syncYesterdayEvents();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN isStepsTrackerAvailable THEN complete with expected value',
      () async {
        final future = platform.isStepsTrackerAvailable();

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN isStepsTrackerActive THEN complete with expected value',
      () async {
        final future = platform.isStepsTrackerActive();

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN hasStepsTrackerPermissions THEN complete with expected value',
      () async {
        final future = platform.hasStepsTrackerPermissions();

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN requestStepsTrackerPermissions THEN complete',
      () async {
        final future = platform.requestStepsTrackerPermissions();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN startStepsTracker THEN complete',
      () async {
        final future = platform.startStepsTracker();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN stopStepsTracker THEN complete',
      () async {
        final future = platform.stopStepsTracker();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN hasYesterdaySyncAndroidPermissions THEN complete with expected value',
      () async {
        final future = platform.hasYesterdaySyncAndroidPermissions();

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN requestYesterdaySyncAndroidPermissions THEN complete',
      () async {
        final future = platform.requestYesterdaySyncAndroidPermissions();

        await expectLater(future, completes);
      },
    );

    test(
      'GIVEN a Result.success WHEN hasYesterdaySyncHealthConnectPermissions THEN complete with expected value',
      () async {
        final future = platform.hasYesterdaySyncHealthConnectPermissions();

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN requestYesterdaySyncHealthConnectPermissions THEN complete',
      () async {
        final future = platform.requestYesterdaySyncHealthConnectPermissions();

        await expectLater(future, completes);
      },
    );
  });

  group(
      'MethodChannelRookSdkHealthConnect | ResultBooleanProto exception unwrap',
      () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultBooleanProto();
        proto.genericExceptionProto =
            GenericExceptionProto(message: 'Generic error');

        return proto.writeToBuffer();
      });
    });

    test('GIVEN a Result.exception WHEN initRook THEN throw exception',
        () async {
      final future = platform.initRook();

      await expectLater(future, throwsA(isException));
    });

    test('GIVEN a Result.exception WHEN updateUserID THEN throw exception',
        () async {
      final future = platform.updateUserID('userID');

      await expectLater(future, throwsA(isException));
    });

    test(
        'GIVEN a Result.exception WHEN deleteUserFromRook THEN throw exception',
        () async {
      final future = platform.deleteUserFromRook();

      await expectLater(future, throwsA(isException));
    });

    test(
      'GIVEN a Result.exception WHEN syncUserTimeZone throw exception',
      () async {
        final future = platform.syncUserTimeZone();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN openHealthConnectSettings THEN throw exception',
      () async {
        final future = platform.openHealthConnectSettings();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN checkPermissions THEN throw exception',
      () async {
        final future = platform.checkPermissions(HCHealthPermission.body);

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN requestPermissions THEN throw exception',
      () async {
        final future = platform.requestPermissions(HCHealthPermission.body);

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN shouldSyncFor THEN throw exception',
      () async {
        final future = platform.shouldSyncFor(
            HCHealthDataType.sleepSummary, DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncPendingSummaries THEN throw exception',
      () async {
        final future = platform.syncPendingSummaries();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncYesterdaySummaries THEN throw exception',
      () async {
        final future = platform.syncYesterdaySummaries();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncPendingEvents THEN throw exception',
      () async {
        final future = platform.syncPendingEvents();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncYesterdayEvents THEN throw exception',
      () async {
        final future = platform.syncYesterdayEvents();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN isStepsTrackerAvailable THEN throw exception',
      () async {
        final future = platform.isStepsTrackerAvailable();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN isStepsTrackerActive THEN throw exception',
      () async {
        final future = platform.isStepsTrackerActive();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN hasStepsTrackerPermissions THEN throw exception',
      () async {
        final future = platform.hasStepsTrackerPermissions();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN requestStepsTrackerPermissions THEN throw exception',
      () async {
        final future = platform.requestStepsTrackerPermissions();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN startStepsTracker THEN throw exception',
      () async {
        final future = platform.startStepsTracker();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN stopStepsTracker THEN throw exception',
      () async {
        final future = platform.stopStepsTracker();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN hasYesterdaySyncAndroidPermissions THEN throw exception',
      () async {
        final future = platform.hasYesterdaySyncAndroidPermissions();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN requestYesterdaySyncAndroidPermissions THEN throw exception',
      () async {
        final future = platform.requestYesterdaySyncAndroidPermissions();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN hasYesterdaySyncHealthConnectPermissions THEN throw exception',
      () async {
        final future = platform.hasYesterdaySyncHealthConnectPermissions();

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN requestYesterdaySyncHealthConnectPermissions THEN throw exception',
      () async {
        final future = platform.requestYesterdaySyncHealthConnectPermissions();

        await expectLater(future, throwsA(isException));
      },
    );
  });

  group('MethodChannelRookSdkHealthConnect | ResultInt64Proto value unwrap',
      () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultInt64Proto();
        proto.value = Int64(1000);
        return proto.writeToBuffer();
      });
    });

    test(
        'GIVEN a Result.value WHEN getTodaySteps THEN complete with expected value',
        () async {
      final future = platform.getTodaySteps();

      await expectLater(future, completion(1000));
    });
  });

  group('MethodChannelRookSdkHealthConnect | ResultInt64Proto exception unwrap',
      () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultInt64Proto();
        proto.genericExceptionProto =
            GenericExceptionProto(message: 'Generic error');

        return proto.writeToBuffer();
      });
    });

    test('GIVEN a Result.exception WHEN getTodaySteps THEN throw exception',
        () async {
      final future = platform.getTodaySteps();

      await expectLater(future, throwsA(isException));
    });
  });

  group(
      'MethodChannelRookSdkHealthConnect | ResultSyncStatusProto value unwrap',
      () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultSyncStatusProto();
        proto.syncStatusProto = SyncStatusProto.SYNCED;
        return proto.writeToBuffer();
      });
    });

    test(
      'GIVEN a Result.success WHEN syncSleepSummary THEN complete with expected value',
      () async {
        final future = platform.syncSleepSummary(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncPhysicalSummary THEN complete with expected value',
      () async {
        final future = platform.syncPhysicalSummary(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncBodySummary THEN complete with expected value',
      () async {
        final future = platform.syncBodySummary(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncPhysicalEvents THEN complete with expected value',
      () async {
        final future = platform.syncPhysicalEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncBloodGlucoseEvents THEN complete with expected value',
      () async {
        final future = platform.syncBloodGlucoseEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncBloodPressureEvents THEN complete with expected value',
      () async {
        final future = platform.syncBloodPressureEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncBodyMetricsEvents THEN complete with expected value',
      () async {
        final future = platform.syncBodyMetricsEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncBodyHeartRateEvents THEN complete with expected value',
      () async {
        final future = platform.syncBodyHeartRateEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncPhysicalHeartRateEvents THEN complete with expected value',
      () async {
        final future = platform.syncPhysicalHeartRateEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncHydrationEvents THEN complete with expected value',
      () async {
        final future = platform.syncHydrationEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncNutritionEvents THEN complete with expected value',
      () async {
        final future = platform.syncNutritionEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncBodyOxygenationEvents THEN complete with expected value',
      () async {
        final future = platform.syncBodyOxygenationEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncPhysicalOxygenationEvents THEN complete with expected value',
      () async {
        final future = platform.syncPhysicalOxygenationEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );

    test(
      'GIVEN a Result.success WHEN syncTemperatureEvents THEN complete with expected value',
      () async {
        final future = platform.syncTemperatureEvents(DateTime.now());

        await expectLater(future, completion(SyncStatus.synced));
      },
    );
  });

  group(
      'MethodChannelRookSdkHealthConnect | ResultSyncStatusProto exception unwrap',
      () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultSyncStatusProto();
        proto.genericExceptionProto =
            GenericExceptionProto(message: 'Generic error');

        return proto.writeToBuffer();
      });
    });

    test(
      'GIVEN a Result.exception WHEN syncSleepSummary throw exception',
      () async {
        final future = platform.syncSleepSummary(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncPhysicalSummary throw exception',
      () async {
        final future = platform.syncPhysicalSummary(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncBodySummary THEN throw exception',
      () async {
        final future = platform.syncBodySummary(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncPhysicalEvents THEN throw exception',
      () async {
        final future = platform.syncPhysicalEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncBloodGlucoseEvents THEN throw exception',
      () async {
        final future = platform.syncBloodGlucoseEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncBloodPressureEvents THEN throw exception',
      () async {
        final future = platform.syncBloodPressureEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncBodyMetricsEvents THEN throw exception',
      () async {
        final future = platform.syncBodyMetricsEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncBodyHeartRateEvents THEN throw exception',
      () async {
        final future = platform.syncBodyHeartRateEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncPhysicalHeartRateEvents THEN throw exception',
      () async {
        final future = platform.syncPhysicalHeartRateEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncHydrationEvents THEN throw exception',
      () async {
        final future = platform.syncHydrationEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncNutritionEvents THEN throw exception',
      () async {
        final future = platform.syncNutritionEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncBodyOxygenationEvents THEN throw exception',
      () async {
        final future = platform.syncBodyOxygenationEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncPhysicalOxygenationEvents THEN throw exception',
      () async {
        final future = platform.syncPhysicalOxygenationEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN syncTemperatureEvents THEN throw exception',
      () async {
        final future = platform.syncTemperatureEvents(DateTime.now());

        await expectLater(future, throwsA(isException));
      },
    );
  });

  group('MethodChannelRookSdkHealthConnect | String Success', () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        return 'RookUser';
      });
    });

    test(
        'GIVEN the happy path WHEN getUserID THEN complete with expected value',
        () async {
      final future = platform.getUserID();

      await expectLater(future, completion('RookUser'));
    });
  });

  group('MethodChannelRookSdkHealthConnect | String null', () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        return null;
      });
    });

    test('GIVEN null WHEN getUserID THEN complete with expected value',
        () async {
      final future = platform.getUserID();

      await expectLater(future, completion(null));
    });
  });

  group('MethodChannelRookSdkHealthConnect | String Failure', () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        throw Exception('Error');
        // return 'RookUser';
      });
    });

    test('GIVEN the unhappy path WHEN getUserID THEN throw exception',
        () async {
      final future = platform.getUserID();

      await expectLater(future, throwsA(isException));
    });
  });

  group('MethodChannelRookSdkHealthConnect checkAvailability', () {
    group('Valid AvailabilityStatusProto value', () {
      setUp(() {
        TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
            .setMockMethodCallHandler(
          channel,
          (message) async {
            return AvailabilityStatusProto.INSTALLED.value;
          },
        );
      });

      test(
          'GIVEN the happy path WHEN checkAvailability THEN complete with expected value',
          () async {
        final future = platform.checkAvailability();

        await expectLater(future, completion(HCAvailabilityStatus.installed));
      });
    });

    group('Invalid AvailabilityStatusProto value', () {
      setUp(() {
        TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
            .setMockMethodCallHandler(
          channel,
          (message) async {
            return 1000;
          },
        );
      });

      test(
          'GIVEN the unhappy path WHEN checkAvailability THEN complete with HCAvailabilityStatus.notSupported',
          () async {
        final future = platform.checkAvailability();

        await expectLater(
            future, completion(HCAvailabilityStatus.notSupported));
      });
    });
  });
}
