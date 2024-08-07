import Flutter
import UIKit
import RookSDK

public class RookSdkAppleHealthPlugin: NSObject, FlutterPlugin {
    private let rookConnectPermissionsManager = RookConnectPermissionsManager()
    private let rookSummaryManager = RookSummaryManager()
    private let rookEventsManager = RookEventsManager()
    private let dataSourcesManager = DataSourcesManager()
    
    public static func register(with registrar: FlutterPluginRegistrar) {
        let channel = FlutterMethodChannel(name: "rook_sdk_apple_health", binaryMessenger: registrar.messenger())
        let instance = RookSdkAppleHealthPlugin()
        registrar.addMethodCallDelegate(instance, channel: channel)
        
        AnalyticsExtractionConfigurator.shared.setPlatform(.flutter)
        AnalyticsTransmissionConfigurator.shared.setPlatform(.flutter)
        
        RookBackGroundSync.shared.setBackListeners()
    }
    
    public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
        switch call.method {
        case "enableNativeLogs":
            RookConnectConfigurationManager.shared.setConsoleLogAvailable(true)
            break
        case "setConfiguration":
            let bytes = call.getDataArgAt(0)
            
            runWithValue(
                flutterResult: result,
                builder: { try RookConfigurationProto(serializedData: bytes.data) },
                block: { it in
                    RookConnectConfigurationManager.shared.setEnvironment(it.environment.toDomain())
                    RookConnectConfigurationManager.shared.setConfiguration(
                        clientUUID: it.clientUuid,
                        secretKey: it.secretKey,
                        enableBackgroundSync: it.enableBackgroundSync
                    )
                    
                    resultBoolSuccess(flutterResult: result, true)
                }
            )
            break
        case "getUserID":
            RookConnectConfigurationManager.shared.getUserId { it in
                switch it {
                case Result.success(let userID):
                    result(userID)
                case Result.failure(_):
                    result(nil)
                }
            }
            break
        case "initRook":
            RookConnectConfigurationManager.shared.initRook { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "updateUserID":
            let userID = call.getStringArgAt(0)
            
            RookConnectConfigurationManager.shared.updateUserId(userID) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "clearUserID":
            RookConnectConfigurationManager.shared.clearUser() { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "deleteUserFromRook":
            RookConnectConfigurationManager.shared.removeUserFromRook() { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncUserTimeZone":
            RookConnectConfigurationManager.shared.syncUserTimeZone() { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "requestPermissions":
            rookConnectPermissionsManager.requestAllPermissions() { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncSleepSummary":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookSummaryManager.syncSleepSummary(from: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncBodySummary":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookSummaryManager.syncBodySummary(from: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncPhysicalSummary":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookSummaryManager.syncPhysicalSummary(from: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncPendingSummaries":
            rookSummaryManager.syncPendingSummaries() { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncPhysicalEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncTrainingEvent(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
            
        case "syncBloodGlucoseEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncBloodGlucoseEvents(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncBloodPressureEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncBloodPressureEvents(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncBodyMetricsEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncBodyMetricsEvents(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncBodyHeartRateEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncBodyHeartRateEvent(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncPhysicalHeartRateEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncPhysicalHeartRateEvent(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncBodyOxygenationEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncBodyOxygenationEvent(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncPhysicalOxygenationEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncPhysicalOxygenationEvent(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncTemperatureEvents":
            let millis = call.getInt64ArgAt(0)
            let date = buildDateFromMillis(millis)
            
            rookEventsManager.syncTemperatureEvents(date: date) { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "syncTodayAppleHealthStepsCount":
            rookEventsManager.getTodayStepCount() { it in
                switch it {
                case Result.success(let steps):
                    resultInt64Success(flutterResult: result, steps)
                case Result.failure(let error):
                    resultInt64Error(flutterResult: result, error)
                }
            }
            break
        case "syncPendingEvents":
            rookEventsManager.syncPendingEvents() { it in
                switch it {
                case Result.success(let bool):
                    resultBoolSuccess(flutterResult: result, bool)
                case Result.failure(let error):
                    resultBoolError(flutterResult: result, error)
                }
            }
            break
        case "isContinuousUploadEnabled":
            let enabled = RookConnectConfigurationManager.shared.isSyncEnable()
            
            resultBoolSuccess(flutterResult: result, enabled)
            break
        case "enableContinuousUpload":
            let enableNativeLogs = call.getBoolArgAt(0)
            let bytes = call.getDataArgAt(1)
            
            runWithValue(
                flutterResult: result,
                builder: { try RookConfigurationProto(serializedData: bytes.data) },
                block: { it in
                    RookConnectConfigurationManager.shared.setConsoleLogAvailable(enableNativeLogs)
                    RookConnectConfigurationManager.shared.setEnvironment(it.environment.toDomain())
                    RookConnectConfigurationManager.shared.setConfiguration(
                        clientUUID: it.clientUuid,
                        secretKey: it.secretKey,
                        enableBackgroundSync: true
                    )
                    
                    RookConnectConfigurationManager.shared.initRook { it in
                        switch it {
                        case Result.success(_):
                            RookConnectConfigurationManager.shared.enableSync()
                            
                            resultBoolSuccess(flutterResult: result, true)
                        case Result.failure(let error):
                            resultBoolError(flutterResult: result, error)
                        }
                    }
                }
            )
            break
        case "disableContinuousUpload":
            RookConnectConfigurationManager.shared.disableSync()
            
            resultBoolSuccess(flutterResult: result, true)
            break
        case "enableBackground":
            let enableNativeLogs = call.getBoolArgAt(0)
            let bytes = call.getDataArgAt(1)
            
            runWithValue(
                flutterResult: result,
                builder: { try RookConfigurationProto(serializedData: bytes.data) },
                block: { it in
                    RookConnectConfigurationManager.shared.setConsoleLogAvailable(enableNativeLogs)
                    RookConnectConfigurationManager.shared.setEnvironment(it.environment.toDomain())
                    RookConnectConfigurationManager.shared.setConfiguration(
                        clientUUID: it.clientUuid,
                        secretKey: it.secretKey,
                        enableBackgroundSync: true
                    )
                    
                    RookConnectConfigurationManager.shared.initRook { it in
                        switch it {
                        case Result.success(_):
                            RookBackGroundSync.shared.enableBackGroundForSummaries()
                            RookBackGroundSync.shared.enableBackGroundForEvents()
                            
                            resultBoolSuccess(flutterResult: result, true)
                        case Result.failure(let error):
                            resultBoolError(flutterResult: result, error)
                        }
                    }
                }
            )
            break
        case "disableBackground":
            RookBackGroundSync.shared.disableBackGroundForSummaries()
            RookBackGroundSync.shared.disableBackGroundForEvents()
            
            resultBoolSuccess(flutterResult: result, true)
            break
        case "getAvailableDataSources":
            let redirectUrl = call.getNullableStringArgAt(0)
            
            dataSourcesManager.getAvailableDataSources(redirectURL: redirectUrl) { it in
                switch it {
                case Result.success(let dataSources):
                    resultDataSourceSuccess(flutterResult: result, dataSources)
                case Result.failure(let error):
                    resultDataSourceError(flutterResult: result, error)
                }
            }
            break
        case "presentDataSourceView":
            DispatchQueue.main.async {
                let redirectUrl = call.getNullableStringArgAt(0)
                
                self.dataSourcesManager.presentDataSourceView(redirectURL: redirectUrl) { it in
                    switch it {
                    case Result.success(let success):
                        resultBoolSuccess(flutterResult: result, success)
                    case Result.failure(let error):
                        resultBoolError(flutterResult: result, error)
                    }
                }
            }
            break
        default:
            result(FlutterMethodNotImplemented)
        }
    }
}
