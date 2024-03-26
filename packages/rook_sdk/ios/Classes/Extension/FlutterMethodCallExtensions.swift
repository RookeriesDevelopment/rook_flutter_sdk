//
//  FlutterMethodCallExtensions.swift
//  integration_test
//
//  Created by Daniel Nolasco on 26/03/24.
//

import Foundation
import Flutter

extension FlutterMethodCall {
    func getIntArgAt(_ index: Int) -> Int {
        let args = self.arguments as? [Any]
        let value = args?[index] as? Int
        
        return value!
    }
}
