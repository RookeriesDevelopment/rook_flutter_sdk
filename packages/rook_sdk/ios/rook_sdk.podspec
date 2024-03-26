#
# To learn more about a Podspec see http://guides.cocoapods.org/syntax/podspec.html.
# Run `pod lib lint rook_sdk.podspec` to validate before publishing.
#
Pod::Spec.new do |s|
  s.name             = 'rook_sdk'
  s.version          = '0.0.1'
  s.summary          = 'Bridge between RookSDK (Ios Native) and Flutter.'
  s.description      = <<-DESC
Bridge between RookSDK (Ios Native) and Flutter.
                       DESC
  s.homepage         = 'https://docs.tryrook.io/'
  s.license          = { :file => '../LICENSE' }
  s.author           = { 'Rook' => 'contact@tryrook.io' }
  s.source           = { :path => '.' }
  s.source_files = 'Classes/**/*'
  s.dependency 'Flutter'
  s.platform = :ios, '13.0'

  # Flutter.framework does not contain a i386 slice.
  s.pod_target_xcconfig = { 'DEFINES_MODULE' => 'YES', 'EXCLUDED_ARCHS[sdk=iphonesimulator*]' => 'i386' }
  s.swift_version = '5.0'
end
