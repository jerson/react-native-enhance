
Pod::Spec.new do |s|
  s.name         = "RNEnhance"
  s.version      = "1.0.0"
  s.summary      = "RNEnhance"
  s.description  = <<-DESC
                  Enhance support for **Android**
                   DESC
  s.homepage     = "https://github.com/jerson/react-native-enhance"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "jeral17@gmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/jerson/react-native-enhance.git", :tag => "master" }
  s.source_files  = "RNEnhance/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  