import 'package:flutter_test/flutter_test.dart';
import 'package:rook_sdk/src/data/mapper/health_permission_mappers.dart';
import 'package:rook_sdk/src/data/proto/protos.pbenum.dart';
import 'package:rook_sdk/src/domain/enums/health_permission.dart';

void main() {
  group('HealthPermission to HealthPermissionProto mappers', () {
    test(
      'GIVEN a HealthPermission.sleep WHEN toProto THEN return HealthPermissionProto.SLEEP',
      () {
        const healthPermission = HealthPermission.sleep;

        final result = healthPermission.toProto();

        expect(result, HealthPermissionProto.SLEEP);
      },
    );

    test(
      'GIVEN a HealthPermission.body WHEN toProto THEN return HealthPermissionProto.BODY',
      () {
        const healthPermission = HealthPermission.body;

        final result = healthPermission.toProto();

        expect(result, HealthPermissionProto.BODY);
      },
    );

    test(
      'GIVEN a HealthPermission.physical WHEN toProto THEN return HealthPermissionProto.PHYSICAL',
      () {
        const healthPermission = HealthPermission.physical;

        final result = healthPermission.toProto();

        expect(result, HealthPermissionProto.PHYSICAL);
      },
    );

    test(
      'GIVEN a HealthPermission.all WHEN toProto THEN return HealthPermissionProto.ALL',
      () {
        const healthPermission = HealthPermission.all;

        final result = healthPermission.toProto();

        expect(result, HealthPermissionProto.ALL);
      },
    );
  });
}
