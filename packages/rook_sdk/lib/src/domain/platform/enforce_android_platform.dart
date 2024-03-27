import 'package:flutter/foundation.dart';
import 'package:rook_sdk/src/domain/exception/android_exclusive_exception.dart';

void enforceAndroidPlatform() {
  if (defaultTargetPlatform != TargetPlatform.android) {
    throw AndroidExclusiveException();
  }
}
