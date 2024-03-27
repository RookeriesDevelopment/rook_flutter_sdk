import 'package:flutter/foundation.dart';
import 'package:rook_sdk/src/domain/exception/ios_exclusive_exception.dart';

void enforceIosPlatform() {
  if (defaultTargetPlatform != TargetPlatform.iOS) {
    throw IosExclusiveException();
  }
}
