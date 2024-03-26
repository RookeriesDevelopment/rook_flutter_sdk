//
//  ResultBoolean.swift
//  integration_test
//
//  Created by Daniel Nolasco on 26/03/24.
//

import Foundation
import Flutter
import RookSDK

func resultBoolSuccess(_ flutterResult: FlutterResult, _ bool: Bool) {
    let result = ResultBooleanProto.with { it in
        it.success = bool
    }
    
    doWithValue(
        flutterResult: flutterResult,
        builder: { try result.serializedData() },
        block: { it in flutterResult(it) }
    )
}

func resultBoolError(_ flutterResult: FlutterResult, _ error: Error) {
    var result = ResultBooleanProto()
    
    if let rookConnectError = error as? RookConnectErrors {
        if rookConnectError == .missingConfiguration {
            result.missingConfigurationExceptionProto = MissingConfigurationExceptionProto.with { it in
                it.message = "No configuration found. Did you forget to call setConfiguration() ?"
            }
        } else {
            result.genericExceptionProto = GenericExceptionProto.with { it in
                it.message = "\(rookConnectError)"
            }
        }
    } else {
        result.genericExceptionProto = GenericExceptionProto.with { it in
            it.message = "\(error)"
        }
    }
    
    doWithValue(
        flutterResult: flutterResult,
        builder: { try result.serializedData() },
        block: { it in flutterResult(it) }
    )
}
