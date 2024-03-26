//
//  RunWithValue.swift
//  integration_test
//
//  Created by Daniel Nolasco on 26/03/24.
//

import Foundation
import Flutter

func doWithValue<T>(flutterResult: FlutterResult, builder: () throws -> T, block: (T) -> Void) {
    do {
        let value = try builder()
        
        block(value)
    } catch {
        flutterResult(buildGenericFlutterError(error.localizedDescription))
    }
}
