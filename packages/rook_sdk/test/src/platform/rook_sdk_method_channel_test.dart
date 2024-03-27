import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:rook_sdk/rook_sdk.dart';
import 'package:rook_sdk/src/data/proto/protos.pb.dart';
import 'package:rook_sdk/src/platform/rook_sdk_method_channel.dart';

void main() {
  TestWidgetsFlutterBinding.ensureInitialized();

  final platform = MethodChannelRookSdk();
  const channel = MethodChannel('rook_sdk');

  tearDown(() {
    TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
        .setMockMethodCallHandler(channel, null);
  });

  group('MethodChannelRookSdk | ResultBooleanProto success unwrap', () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultBooleanProto();
        proto.success = true;
        return proto.writeToBuffer();
      });
    });

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
        final future = platform.checkPermissions(HealthPermission.sleep);

        await expectLater(future, completion(true));
      },
    );

    test(
      'GIVEN a Result.success WHEN requestPermissions THEN complete',
      () async {
        final future = platform.requestPermissions(HealthPermission.sleep);

        await expectLater(future, completes);
      },
    );
  });

  group('MethodChannelRookSdk | ResultBooleanProto exception unwrap', () {
    setUp(() {
      TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
          .setMockMethodCallHandler(channel, (_) async {
        final proto = ResultBooleanProto();
        proto.genericExceptionProto =
            GenericExceptionProto(message: 'Generic error');

        return proto.writeToBuffer();
      });
    });

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
        final future = platform.checkPermissions(HealthPermission.body);

        await expectLater(future, throwsA(isException));
      },
    );

    test(
      'GIVEN a Result.exception WHEN requestPermissions THEN throw exception',
      () async {
        final future = platform.requestPermissions(HealthPermission.body);

        await expectLater(future, throwsA(isException));
      },
    );
  });

  group('MethodChannelRookSdk checkAvailability', () {
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

        await expectLater(future, completion(AvailabilityStatus.installed));
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
          'GIVEN the unhappy path WHEN checkAvailability THEN complete with AvailabilityStatus.notSupported',
          () async {
        final future = platform.checkAvailability();

        await expectLater(future, completion(AvailabilityStatus.notSupported));
      });
    });
  });
}
