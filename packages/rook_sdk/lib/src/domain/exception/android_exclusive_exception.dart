class AndroidExclusiveException implements Exception {
  final String message =
      'This functionality is only available on Android devices';

  @override
  String toString() {
    return 'AndroidExclusiveException{message: $message}';
  }
}
