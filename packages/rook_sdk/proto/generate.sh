# Dart
protoc --dart_out=../lib/src/data/proto protos.proto
# Java
protoc --java_out=../android/src/main/kotlin/ protos.proto
# Swift
protoc --swift_out=../ios/Classes/Proto protos.proto