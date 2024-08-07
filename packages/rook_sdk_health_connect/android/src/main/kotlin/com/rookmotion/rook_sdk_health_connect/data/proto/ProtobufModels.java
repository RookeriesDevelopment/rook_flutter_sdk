// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

// Protobuf Java Version: 3.25.3
package com.rookmotion.rook_sdk_health_connect.data.proto;

public final class ProtobufModels {
  private ProtobufModels() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RookConfigurationProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RookConfigurationProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DataSourceProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DataSourceProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DataSourceProtoListWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DataSourceProtoListWrapper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SyncStatusWithIntProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SyncStatusWithIntProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeviceNotSupportedExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeviceNotSupportedExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HealthConnectNotInstalledExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HealthConnectNotInstalledExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HttpRequestExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HttpRequestExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MissingConfigurationExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MissingConfigurationExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MissingPermissionsExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MissingPermissionsExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestQuotaExceededExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestQuotaExceededExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SDKNotInitializedExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SDKNotInitializedExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TimeoutExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TimeoutExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserNotInitializedExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserNotInitializedExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GenericExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GenericExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MissingAndroidPermissionsExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MissingAndroidPermissionsExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SDKNotAuthorizedExceptionProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SDKNotAuthorizedExceptionProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResultBooleanProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResultBooleanProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResultInt64Proto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResultInt64Proto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResultSyncStatusProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResultSyncStatusProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResultSyncStatusWithIntProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResultSyncStatusWithIntProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResultDataSourceProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResultDataSourceProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014protos.proto\"\211\001\n\026RookConfigurationProt" +
      "o\022\022\n\nclientUUID\030\001 \001(\t\022\021\n\tsecretKey\030\002 \001(\t" +
      "\022*\n\013environment\030\003 \001(\0162\025.RookEnvironmentP" +
      "roto\022\034\n\024enableBackgroundSync\030\004 \001(\010\"\220\001\n\017D" +
      "ataSourceProto\022\014\n\004name\030\001 \001(\t\022\023\n\013descript" +
      "ion\030\002 \001(\t\022\r\n\005image\030\003 \001(\t\022\021\n\tconnected\030\004 " +
      "\001(\010\022\030\n\020authorizationUrl\030\005 \001(\t\022\036\n\026authori" +
      "zationUrlIsNull\030\006 \001(\010\"C\n\032DataSourceProto" +
      "ListWrapper\022%\n\013dataSources\030\001 \003(\0132\020.DataS" +
      "ourceProto\"M\n\026SyncStatusWithIntProto\022$\n\n" +
      "syncStatus\030\001 \001(\0162\020.SyncStatusProto\022\r\n\005st" +
      "eps\030\002 \001(\r\"3\n DeviceNotSupportedException" +
      "Proto\022\017\n\007message\030\001 \001(\t\":\n\'HealthConnectN" +
      "otInstalledExceptionProto\022\017\n\007message\030\001 \001" +
      "(\t\":\n\031HttpRequestExceptionProto\022\017\n\007messa" +
      "ge\030\001 \001(\t\022\014\n\004code\030\002 \001(\r\"5\n\"MissingConfigu" +
      "rationExceptionProto\022\017\n\007message\030\001 \001(\t\"3\n" +
      " MissingPermissionsExceptionProto\022\017\n\007mes" +
      "sage\030\001 \001(\t\"5\n\"RequestQuotaExceededExcept" +
      "ionProto\022\017\n\007message\030\001 \001(\t\"2\n\037SDKNotIniti" +
      "alizedExceptionProto\022\017\n\007message\030\001 \001(\t\"(\n" +
      "\025TimeoutExceptionProto\022\017\n\007message\030\001 \001(\t\"" +
      "3\n UserNotInitializedExceptionProto\022\017\n\007m" +
      "essage\030\001 \001(\t\"(\n\025GenericExceptionProto\022\017\n" +
      "\007message\030\001 \001(\t\":\n\'MissingAndroidPermissi" +
      "onsExceptionProto\022\017\n\007message\030\001 \001(\t\"1\n\036SD" +
      "KNotAuthorizedExceptionProto\022\017\n\007message\030" +
      "\001 \001(\t\"\311\007\n\022ResultBooleanProto\022\021\n\007success\030" +
      "\001 \001(\010H\000\022M\n deviceNotSupportedExceptionPr" +
      "oto\030\002 \001(\0132!.DeviceNotSupportedExceptionP" +
      "rotoH\000\022[\n\'healthConnectNotInstalledExcep" +
      "tionProto\030\003 \001(\0132(.HealthConnectNotInstal" +
      "ledExceptionProtoH\000\022?\n\031httpRequestExcept" +
      "ionProto\030\004 \001(\0132\032.HttpRequestExceptionPro" +
      "toH\000\022Q\n\"missingConfigurationExceptionPro" +
      "to\030\005 \001(\0132#.MissingConfigurationException" +
      "ProtoH\000\022M\n missingPermissionsExceptionPr" +
      "oto\030\006 \001(\0132!.MissingPermissionsExceptionP" +
      "rotoH\000\022Q\n\"requestQuotaExceededExceptionP" +
      "roto\030\007 \001(\0132#.RequestQuotaExceededExcepti" +
      "onProtoH\000\022K\n\037sdkNotInitializedExceptionP" +
      "roto\030\010 \001(\0132 .SDKNotInitializedExceptionP" +
      "rotoH\000\0227\n\025timeoutExceptionProto\030\t \001(\0132\026." +
      "TimeoutExceptionProtoH\000\022M\n userNotInitia" +
      "lizedExceptionProto\030\n \001(\0132!.UserNotIniti" +
      "alizedExceptionProtoH\000\0227\n\025genericExcepti" +
      "onProto\030\013 \001(\0132\026.GenericExceptionProtoH\000\022" +
      "[\n\'missingAndroidPermissionsExceptionPro" +
      "to\030\014 \001(\0132(.MissingAndroidPermissionsExce" +
      "ptionProtoH\000\022I\n\036sdkNotAuthorizedExceptio" +
      "nProto\030\r \001(\0132\037.SDKNotAuthorizedException" +
      "ProtoH\000B\010\n\006result\"\264\002\n\020ResultInt64Proto\022\017" +
      "\n\005value\030\001 \001(\003H\000\022K\n\037sdkNotInitializedExce" +
      "ptionProto\030\010 \001(\0132 .SDKNotInitializedExce" +
      "ptionProtoH\000\0227\n\025genericExceptionProto\030\013 " +
      "\001(\0132\026.GenericExceptionProtoH\000\022I\n\036sdkNotA" +
      "uthorizedExceptionProto\030\r \001(\0132\037.SDKNotAu" +
      "thorizedExceptionProtoH\000B\010\n\006resultJ\004\010\002\020\003" +
      "J\004\010\003\020\004J\004\010\004\020\005J\004\010\005\020\006J\004\010\006\020\007J\004\010\007\020\010J\004\010\t\020\nJ\004\010\n" +
      "\020\013J\004\010\014\020\r\"\302\006\n\025ResultSyncStatusProto\022+\n\017sy" +
      "ncStatusProto\030\001 \001(\0162\020.SyncStatusProtoH\000\022" +
      "M\n deviceNotSupportedExceptionProto\030\002 \001(" +
      "\0132!.DeviceNotSupportedExceptionProtoH\000\022[" +
      "\n\'healthConnectNotInstalledExceptionProt" +
      "o\030\003 \001(\0132(.HealthConnectNotInstalledExcep" +
      "tionProtoH\000\022?\n\031httpRequestExceptionProto" +
      "\030\004 \001(\0132\032.HttpRequestExceptionProtoH\000\022M\n " +
      "missingPermissionsExceptionProto\030\006 \001(\0132!" +
      ".MissingPermissionsExceptionProtoH\000\022Q\n\"r" +
      "equestQuotaExceededExceptionProto\030\007 \001(\0132" +
      "#.RequestQuotaExceededExceptionProtoH\000\022K" +
      "\n\037sdkNotInitializedExceptionProto\030\010 \001(\0132" +
      " .SDKNotInitializedExceptionProtoH\000\0227\n\025t" +
      "imeoutExceptionProto\030\t \001(\0132\026.TimeoutExce" +
      "ptionProtoH\000\022M\n userNotInitializedExcept" +
      "ionProto\030\n \001(\0132!.UserNotInitializedExcep" +
      "tionProtoH\000\0227\n\025genericExceptionProto\030\013 \001" +
      "(\0132\026.GenericExceptionProtoH\000\022I\n\036sdkNotAu" +
      "thorizedExceptionProto\030\r \001(\0132\037.SDKNotAut" +
      "horizedExceptionProtoH\000B\010\n\006resultJ\004\010\005\020\006J" +
      "\004\010\014\020\r\"\327\006\n\034ResultSyncStatusWithIntProto\0229" +
      "\n\026syncStatusWithIntProto\030\001 \001(\0132\027.SyncSta" +
      "tusWithIntProtoH\000\022M\n deviceNotSupportedE" +
      "xceptionProto\030\002 \001(\0132!.DeviceNotSupported" +
      "ExceptionProtoH\000\022[\n\'healthConnectNotInst" +
      "alledExceptionProto\030\003 \001(\0132(.HealthConnec" +
      "tNotInstalledExceptionProtoH\000\022?\n\031httpReq" +
      "uestExceptionProto\030\004 \001(\0132\032.HttpRequestEx" +
      "ceptionProtoH\000\022M\n missingPermissionsExce" +
      "ptionProto\030\006 \001(\0132!.MissingPermissionsExc" +
      "eptionProtoH\000\022Q\n\"requestQuotaExceededExc" +
      "eptionProto\030\007 \001(\0132#.RequestQuotaExceeded" +
      "ExceptionProtoH\000\022K\n\037sdkNotInitializedExc" +
      "eptionProto\030\010 \001(\0132 .SDKNotInitializedExc" +
      "eptionProtoH\000\0227\n\025timeoutExceptionProto\030\t" +
      " \001(\0132\026.TimeoutExceptionProtoH\000\022M\n userNo" +
      "tInitializedExceptionProto\030\n \001(\0132!.UserN" +
      "otInitializedExceptionProtoH\000\0227\n\025generic" +
      "ExceptionProto\030\013 \001(\0132\026.GenericExceptionP" +
      "rotoH\000\022I\n\036sdkNotAuthorizedExceptionProto" +
      "\030\r \001(\0132\037.SDKNotAuthorizedExceptionProtoH" +
      "\000B\010\n\006resultJ\004\010\005\020\006J\004\010\014\020\r\"\264\003\n\025ResultDataSo" +
      "urceProto\022A\n\032dataSourceProtoListWrapper\030" +
      "\001 \001(\0132\033.DataSourceProtoListWrapperH\000\022K\n\037" +
      "sdkNotInitializedExceptionProto\030\010 \001(\0132 ." +
      "SDKNotInitializedExceptionProtoH\000\022M\n use" +
      "rNotInitializedExceptionProto\030\n \001(\0132!.Us" +
      "erNotInitializedExceptionProtoH\000\0227\n\025gene" +
      "ricExceptionProto\030\013 \001(\0132\026.GenericExcepti" +
      "onProtoH\000\022I\n\036sdkNotAuthorizedExceptionPr" +
      "oto\030\r \001(\0132\037.SDKNotAuthorizedExceptionPro" +
      "toH\000B\010\n\006resultJ\004\010\002\020\003J\004\010\003\020\004J\004\010\004\020\005J\004\010\005\020\006J\004" +
      "\010\006\020\007J\004\010\007\020\010J\004\010\t\020\nJ\004\010\014\020\r*3\n\024RookEnvironmen" +
      "tProto\022\013\n\007SANDBOX\020\000\022\016\n\nPRODUCTION\020\001*N\n\027A" +
      "vailabilityStatusProto\022\r\n\tINSTALLED\020\000\022\021\n" +
      "\rNOT_INSTALLED\020\001\022\021\n\rNOT_SUPPORTED\020\002*4\n\017S" +
      "yncStatusProto\022\n\n\006SYNCED\020\000\022\025\n\021RECORDS_NO" +
      "T_FOUND\020\001*E\n\024SyncInstructionProto\022\013\n\007NOT" +
      "HING\020\000\022\017\n\013SYNC_OLDEST\020\001\022\017\n\013SYNC_LATEST\020\002" +
      "*\377\002\n\023HealthDataTypeProto\022\021\n\rSLEEP_SUMMAR" +
      "Y\020\000\022\024\n\020PHYSICAL_SUMMARY\020\001\022\020\n\014BODY_SUMMAR" +
      "Y\020\002\022\022\n\016PHYSICAL_EVENT\020\003\022\034\n\030BLOOD_GLUCOSE" +
      "_BODY_EVENT\020\004\022\035\n\031BLOOD_PRESSURE_BODY_EVE" +
      "NT\020\005\022\026\n\022BODY_METRICS_EVENT\020\006\022\031\n\025HEART_RA" +
      "TE_BODY_EVENT\020\007\022\035\n\031HEART_RATE_PHYSICAL_E" +
      "VENT\020\010\022\030\n\024HYDRATION_BODY_EVENT\020\t\022\030\n\024NUTR" +
      "ITION_BODY_EVENT\020\n\022\032\n\026OXYGENATION_BODY_E" +
      "VENT\020\013\022\036\n\032OXYGENATION_PHYSICAL_EVENT\020\014\022\032" +
      "\n\026TEMPERATURE_BODY_EVENT\020\rBE\n1com.rookmo" +
      "tion.rook_sdk_health_connect.data.protoB" +
      "\016ProtobufModelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RookConfigurationProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RookConfigurationProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RookConfigurationProto_descriptor,
        new java.lang.String[] { "ClientUUID", "SecretKey", "Environment", "EnableBackgroundSync", });
    internal_static_DataSourceProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DataSourceProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DataSourceProto_descriptor,
        new java.lang.String[] { "Name", "Description", "Image", "Connected", "AuthorizationUrl", "AuthorizationUrlIsNull", });
    internal_static_DataSourceProtoListWrapper_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DataSourceProtoListWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DataSourceProtoListWrapper_descriptor,
        new java.lang.String[] { "DataSources", });
    internal_static_SyncStatusWithIntProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SyncStatusWithIntProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SyncStatusWithIntProto_descriptor,
        new java.lang.String[] { "SyncStatus", "Steps", });
    internal_static_DeviceNotSupportedExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_DeviceNotSupportedExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeviceNotSupportedExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_HealthConnectNotInstalledExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_HealthConnectNotInstalledExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HealthConnectNotInstalledExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_HttpRequestExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_HttpRequestExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HttpRequestExceptionProto_descriptor,
        new java.lang.String[] { "Message", "Code", });
    internal_static_MissingConfigurationExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_MissingConfigurationExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MissingConfigurationExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_MissingPermissionsExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_MissingPermissionsExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MissingPermissionsExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_RequestQuotaExceededExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_RequestQuotaExceededExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestQuotaExceededExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_SDKNotInitializedExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_SDKNotInitializedExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SDKNotInitializedExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_TimeoutExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_TimeoutExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TimeoutExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_UserNotInitializedExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_UserNotInitializedExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserNotInitializedExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_GenericExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_GenericExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GenericExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_MissingAndroidPermissionsExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_MissingAndroidPermissionsExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MissingAndroidPermissionsExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_SDKNotAuthorizedExceptionProto_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_SDKNotAuthorizedExceptionProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SDKNotAuthorizedExceptionProto_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_ResultBooleanProto_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_ResultBooleanProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResultBooleanProto_descriptor,
        new java.lang.String[] { "Success", "DeviceNotSupportedExceptionProto", "HealthConnectNotInstalledExceptionProto", "HttpRequestExceptionProto", "MissingConfigurationExceptionProto", "MissingPermissionsExceptionProto", "RequestQuotaExceededExceptionProto", "SdkNotInitializedExceptionProto", "TimeoutExceptionProto", "UserNotInitializedExceptionProto", "GenericExceptionProto", "MissingAndroidPermissionsExceptionProto", "SdkNotAuthorizedExceptionProto", "Result", });
    internal_static_ResultInt64Proto_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_ResultInt64Proto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResultInt64Proto_descriptor,
        new java.lang.String[] { "Value", "SdkNotInitializedExceptionProto", "GenericExceptionProto", "SdkNotAuthorizedExceptionProto", "Result", });
    internal_static_ResultSyncStatusProto_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_ResultSyncStatusProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResultSyncStatusProto_descriptor,
        new java.lang.String[] { "SyncStatusProto", "DeviceNotSupportedExceptionProto", "HealthConnectNotInstalledExceptionProto", "HttpRequestExceptionProto", "MissingPermissionsExceptionProto", "RequestQuotaExceededExceptionProto", "SdkNotInitializedExceptionProto", "TimeoutExceptionProto", "UserNotInitializedExceptionProto", "GenericExceptionProto", "SdkNotAuthorizedExceptionProto", "Result", });
    internal_static_ResultSyncStatusWithIntProto_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_ResultSyncStatusWithIntProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResultSyncStatusWithIntProto_descriptor,
        new java.lang.String[] { "SyncStatusWithIntProto", "DeviceNotSupportedExceptionProto", "HealthConnectNotInstalledExceptionProto", "HttpRequestExceptionProto", "MissingPermissionsExceptionProto", "RequestQuotaExceededExceptionProto", "SdkNotInitializedExceptionProto", "TimeoutExceptionProto", "UserNotInitializedExceptionProto", "GenericExceptionProto", "SdkNotAuthorizedExceptionProto", "Result", });
    internal_static_ResultDataSourceProto_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_ResultDataSourceProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResultDataSourceProto_descriptor,
        new java.lang.String[] { "DataSourceProtoListWrapper", "SdkNotInitializedExceptionProto", "UserNotInitializedExceptionProto", "GenericExceptionProto", "SdkNotAuthorizedExceptionProto", "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
