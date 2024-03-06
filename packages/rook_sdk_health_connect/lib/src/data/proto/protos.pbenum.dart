//
//  Generated code. Do not modify.
//  source: protos.proto
//
// @dart = 2.12

// ignore_for_file: annotate_overrides, camel_case_types, comment_references
// ignore_for_file: constant_identifier_names, library_prefixes
// ignore_for_file: non_constant_identifier_names, prefer_final_fields
// ignore_for_file: unnecessary_import, unnecessary_this, unused_import

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

class RookEnvironmentProto extends $pb.ProtobufEnum {
  static const RookEnvironmentProto SANDBOX =
      RookEnvironmentProto._(0, _omitEnumNames ? '' : 'SANDBOX');
  static const RookEnvironmentProto PRODUCTION =
      RookEnvironmentProto._(1, _omitEnumNames ? '' : 'PRODUCTION');

  static const $core.List<RookEnvironmentProto> values = <RookEnvironmentProto>[
    SANDBOX,
    PRODUCTION,
  ];

  static final $core.Map<$core.int, RookEnvironmentProto> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static RookEnvironmentProto? valueOf($core.int value) => _byValue[value];

  const RookEnvironmentProto._($core.int v, $core.String n) : super(v, n);
}

class AvailabilityStatusProto extends $pb.ProtobufEnum {
  static const AvailabilityStatusProto INSTALLED =
      AvailabilityStatusProto._(0, _omitEnumNames ? '' : 'INSTALLED');
  static const AvailabilityStatusProto NOT_INSTALLED =
      AvailabilityStatusProto._(1, _omitEnumNames ? '' : 'NOT_INSTALLED');
  static const AvailabilityStatusProto NOT_SUPPORTED =
      AvailabilityStatusProto._(2, _omitEnumNames ? '' : 'NOT_SUPPORTED');

  static const $core.List<AvailabilityStatusProto> values =
      <AvailabilityStatusProto>[
    INSTALLED,
    NOT_INSTALLED,
    NOT_SUPPORTED,
  ];

  static final $core.Map<$core.int, AvailabilityStatusProto> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static AvailabilityStatusProto? valueOf($core.int value) => _byValue[value];

  const AvailabilityStatusProto._($core.int v, $core.String n) : super(v, n);
}

class HealthPermissionProto extends $pb.ProtobufEnum {
  static const HealthPermissionProto SLEEP =
      HealthPermissionProto._(0, _omitEnumNames ? '' : 'SLEEP');
  static const HealthPermissionProto PHYSICAL =
      HealthPermissionProto._(1, _omitEnumNames ? '' : 'PHYSICAL');
  static const HealthPermissionProto BODY =
      HealthPermissionProto._(2, _omitEnumNames ? '' : 'BODY');
  static const HealthPermissionProto ALL =
      HealthPermissionProto._(3, _omitEnumNames ? '' : 'ALL');

  static const $core.List<HealthPermissionProto> values =
      <HealthPermissionProto>[
    SLEEP,
    PHYSICAL,
    BODY,
    ALL,
  ];

  static final $core.Map<$core.int, HealthPermissionProto> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static HealthPermissionProto? valueOf($core.int value) => _byValue[value];

  const HealthPermissionProto._($core.int v, $core.String n) : super(v, n);
}

class SyncStatusProto extends $pb.ProtobufEnum {
  static const SyncStatusProto SYNCED =
      SyncStatusProto._(0, _omitEnumNames ? '' : 'SYNCED');
  static const SyncStatusProto RECORDS_NOT_FOUND =
      SyncStatusProto._(1, _omitEnumNames ? '' : 'RECORDS_NOT_FOUND');

  static const $core.List<SyncStatusProto> values = <SyncStatusProto>[
    SYNCED,
    RECORDS_NOT_FOUND,
  ];

  static final $core.Map<$core.int, SyncStatusProto> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static SyncStatusProto? valueOf($core.int value) => _byValue[value];

  const SyncStatusProto._($core.int v, $core.String n) : super(v, n);
}

class HealthDataTypeProto extends $pb.ProtobufEnum {
  static const HealthDataTypeProto SLEEP_SUMMARY =
      HealthDataTypeProto._(0, _omitEnumNames ? '' : 'SLEEP_SUMMARY');
  static const HealthDataTypeProto PHYSICAL_SUMMARY =
      HealthDataTypeProto._(1, _omitEnumNames ? '' : 'PHYSICAL_SUMMARY');
  static const HealthDataTypeProto BODY_SUMMARY =
      HealthDataTypeProto._(2, _omitEnumNames ? '' : 'BODY_SUMMARY');
  static const HealthDataTypeProto PHYSICAL_EVENT =
      HealthDataTypeProto._(3, _omitEnumNames ? '' : 'PHYSICAL_EVENT');
  static const HealthDataTypeProto BLOOD_GLUCOSE_BODY_EVENT =
      HealthDataTypeProto._(
          4, _omitEnumNames ? '' : 'BLOOD_GLUCOSE_BODY_EVENT');
  static const HealthDataTypeProto BLOOD_PRESSURE_BODY_EVENT =
      HealthDataTypeProto._(
          5, _omitEnumNames ? '' : 'BLOOD_PRESSURE_BODY_EVENT');
  static const HealthDataTypeProto BODY_METRICS_EVENT =
      HealthDataTypeProto._(6, _omitEnumNames ? '' : 'BODY_METRICS_EVENT');
  static const HealthDataTypeProto HEART_RATE_BODY_EVENT =
      HealthDataTypeProto._(7, _omitEnumNames ? '' : 'HEART_RATE_BODY_EVENT');
  static const HealthDataTypeProto HEART_RATE_PHYSICAL_EVENT =
      HealthDataTypeProto._(
          8, _omitEnumNames ? '' : 'HEART_RATE_PHYSICAL_EVENT');
  static const HealthDataTypeProto HYDRATION_BODY_EVENT =
      HealthDataTypeProto._(9, _omitEnumNames ? '' : 'HYDRATION_BODY_EVENT');
  static const HealthDataTypeProto NUTRITION_BODY_EVENT =
      HealthDataTypeProto._(10, _omitEnumNames ? '' : 'NUTRITION_BODY_EVENT');
  static const HealthDataTypeProto OXYGENATION_BODY_EVENT =
      HealthDataTypeProto._(11, _omitEnumNames ? '' : 'OXYGENATION_BODY_EVENT');
  static const HealthDataTypeProto OXYGENATION_PHYSICAL_EVENT =
      HealthDataTypeProto._(
          12, _omitEnumNames ? '' : 'OXYGENATION_PHYSICAL_EVENT');
  static const HealthDataTypeProto TEMPERATURE_BODY_EVENT =
      HealthDataTypeProto._(13, _omitEnumNames ? '' : 'TEMPERATURE_BODY_EVENT');

  static const $core.List<HealthDataTypeProto> values = <HealthDataTypeProto>[
    SLEEP_SUMMARY,
    PHYSICAL_SUMMARY,
    BODY_SUMMARY,
    PHYSICAL_EVENT,
    BLOOD_GLUCOSE_BODY_EVENT,
    BLOOD_PRESSURE_BODY_EVENT,
    BODY_METRICS_EVENT,
    HEART_RATE_BODY_EVENT,
    HEART_RATE_PHYSICAL_EVENT,
    HYDRATION_BODY_EVENT,
    NUTRITION_BODY_EVENT,
    OXYGENATION_BODY_EVENT,
    OXYGENATION_PHYSICAL_EVENT,
    TEMPERATURE_BODY_EVENT,
  ];

  static final $core.Map<$core.int, HealthDataTypeProto> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static HealthDataTypeProto? valueOf($core.int value) => _byValue[value];

  const HealthDataTypeProto._($core.int v, $core.String n) : super(v, n);
}

const _omitEnumNames = $core.bool.fromEnvironment('protobuf.omit_enum_names');
