import 'package:rook_sdk/src/data/proto/protos.pbenum.dart';
import 'package:rook_sdk/src/domain/enums/availability_status.dart';

extension AvailabilityStatusMappers on AvailabilityStatusProto {
  AvailabilityStatus toDomain() {
    return switch (this) {
      AvailabilityStatusProto.INSTALLED => AvailabilityStatus.installed,
      AvailabilityStatusProto.NOT_INSTALLED => AvailabilityStatus.notInstalled,
      _ => AvailabilityStatus.notSupported,
    };
  }
}
