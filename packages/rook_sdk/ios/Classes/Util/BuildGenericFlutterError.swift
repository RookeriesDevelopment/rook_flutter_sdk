//
//  BuildGenericFlutterError.swift
//  integration_test
//
//  Created by Daniel Nolasco on 26/03/24.
//

import Foundation
import Flutter

func buildGenericFlutterError(_ message: String) -> FlutterError {
    return FlutterError.init(
        code: GENERIC_ERROR_CODE,
        message: message,
        details: nil
    )
}

private let GENERIC_ERROR_CODE = "-1"
