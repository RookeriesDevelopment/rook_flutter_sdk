import 'package:rook_sdk/src/data/proto/protos.pbenum.dart';
import 'package:rook_sdk/src/domain/enums/health_permission.dart';

extension HealthPermissionMappers on HealthPermission {
  HealthPermissionProto toProto() {
    return switch (this) {
      HealthPermission.sleep => HealthPermissionProto.SLEEP,
      HealthPermission.body => HealthPermissionProto.BODY,
      HealthPermission.physical => HealthPermissionProto.PHYSICAL,
      _ => HealthPermissionProto.ALL,
    };
  }
}
