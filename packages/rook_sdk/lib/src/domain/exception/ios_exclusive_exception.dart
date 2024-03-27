class IosExclusiveException implements Exception {
  final String message = 'This functionality is only available on Ios devices';

  @override
  String toString() {
    return 'IosExclusiveException{message: $message}';
  }
}
