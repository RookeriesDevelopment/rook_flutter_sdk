import 'package:flutter_test/flutter_test.dart';
import 'package:rook_sdk/src/data/mapper/availability_status_mappers.dart';
import 'package:rook_sdk/src/data/proto/protos.pbenum.dart';
import 'package:rook_sdk/src/domain/enums/availability_status.dart';

void main() {
  group('AvailabilityStatusProto to AvailabilityStatus mappers', () {
    test(
      'GIVEN AvailabilityStatusProto.INSTALLED WHEN toDomain THEN return AvailabilityStatus.installed',
      () {
        const proto = AvailabilityStatusProto.INSTALLED;
        final result = proto.toDomain();

        expect(result, AvailabilityStatus.installed);
      },
    );

    test(
      'GIVEN AvailabilityStatusProto.NOT_INSTALLED WHEN toDomain THEN return AvailabilityStatus.notInstalled',
      () {
        const proto = AvailabilityStatusProto.NOT_INSTALLED;
        final result = proto.toDomain();

        expect(result, AvailabilityStatus.notInstalled);
      },
    );

    test(
      'GIVEN AvailabilityStatusProto.NOT_SUPPORTED WHEN toDomain THEN return AvailabilityStatus.notSupported',
      () {
        const proto = AvailabilityStatusProto.NOT_SUPPORTED;
        final result = proto.toDomain();

        expect(result, AvailabilityStatus.notSupported);
      },
    );
  });
}
