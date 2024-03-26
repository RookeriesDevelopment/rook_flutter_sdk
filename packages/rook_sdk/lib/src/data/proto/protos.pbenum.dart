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

class HealthPermissionProto extends $pb.ProtobufEnum {
  static const HealthPermissionProto SLEEP = HealthPermissionProto._(0, _omitEnumNames ? '' : 'SLEEP');
  static const HealthPermissionProto PHYSICAL = HealthPermissionProto._(1, _omitEnumNames ? '' : 'PHYSICAL');
  static const HealthPermissionProto BODY = HealthPermissionProto._(2, _omitEnumNames ? '' : 'BODY');
  static const HealthPermissionProto ALL = HealthPermissionProto._(3, _omitEnumNames ? '' : 'ALL');

  static const $core.List<HealthPermissionProto> values = <HealthPermissionProto> [
    SLEEP,
    PHYSICAL,
    BODY,
    ALL,
  ];

  static final $core.Map<$core.int, HealthPermissionProto> _byValue = $pb.ProtobufEnum.initByValue(values);
  static HealthPermissionProto? valueOf($core.int value) => _byValue[value];

  const HealthPermissionProto._($core.int v, $core.String n) : super(v, n);
}


const _omitEnumNames = $core.bool.fromEnvironment('protobuf.omit_enum_names');
