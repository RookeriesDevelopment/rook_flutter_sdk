import Flutter
import UIKit
import RookSDK
import RookAppleHealth
import RookConnectTransmission

public class RookSdkPlugin: NSObject, FlutterPlugin {
    
    private let rookConnectPermissionsManager = RookConnectPermissionsManager()
    
    public static func register(with registrar: FlutterPluginRegistrar) {
        let channel = FlutterMethodChannel(name: "rook_sdk", binaryMessenger: registrar.messenger())
        let instance = RookSdkPlugin()
        
        registrar.addMethodCallDelegate(instance, channel: channel)
        
        AnalyticsExtractionConfigurator.shared.setPlatform(.flutter)
        AnalyticsTransmissionConfigurator.shared.setPlatform(.flutter)
    }
    
    public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
        switch call.method {
        case "requestPermissions":
            let permissionCode = call.getIntArgAt(0)
            let permission = HealthPermissionProto.init(rawValue: permissionCode)
            
            switch permission {
            case .sleep:
                rookConnectPermissionsManager.requestSleepPermissions() { it in
                    switch it {
                    case Result.success(let bool):
                        resultBoolSuccess(result, bool)
                    case Result.failure(let error):
                        resultBoolError(result, error)
                    }
                }
            case .physical:
                rookConnectPermissionsManager.requestPhysicalPermissions() { it in
                    switch it {
                    case Result.success(let bool):
                        resultBoolSuccess(result, bool)
                    case Result.failure(let error):
                        resultBoolError(result, error)
                    }
                }
            case .body:
                rookConnectPermissionsManager.requestBodyPermissions() { it in
                    switch it {
                    case Result.success(let bool):
                        resultBoolSuccess(result, bool)
                    case Result.failure(let error):
                        resultBoolError(result, error)
                    }
                }
            case .all:
                rookConnectPermissionsManager.requestAllPermissions() { it in
                    switch it {
                    case Result.success(let bool):
                        resultBoolSuccess(result, bool)
                    case Result.failure(let error):
                        resultBoolError(result, error)
                    }
                }
            default:
                resultBoolError(result, RookFlutterErrors.UnknownPermission)
            }
            break
        default:
            result(FlutterMethodNotImplemented)
        }
    }
}
