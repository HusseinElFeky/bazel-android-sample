load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# Load Android build rules
http_archive(
    name = "build_bazel_rules_android",
    strip_prefix = "rules_android-0.1.1",
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"]
)

# Load JVM External build rules
RULES_JVM_EXTERNAL_TAG = "4.1"
RULES_JVM_EXTERNAL_SHA = "f36441aa876c4f6427bfb2d1f2d723b48e9d930b62662bf723ddfb8fc80f0140"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

# Load Maven
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        # Android Libraries
        "androidx.appcompat:appcompat:1.3.0",
        "com.google.android.material:material:1.3.0",
        "androidx.constraintlayout:constraintlayout:2.0.4",

        # Test Libraries
        "junit:junit:4.13.2",
        "androidx.test.espresso:espresso-core:3.3.0",
        "org.hamcrest:hamcrest-library:2.2"
    ],
    repositories = [
        "https://maven.google.com", # Google
        "https://repo1.maven.org/maven2" # Maven Central
    ]
)

# Configure Android SDK Path
load("@build_bazel_rules_android//android:rules.bzl", "android_sdk_repository")
android_sdk_repository(
    name = "androidsdk",
    path = "C:/Users/Hussein El Feky/AppData/Local/Android/Sdk", # Path to Android SDK, optional if $ANDROID_HOME is set
    api_level = 30,
    build_tools_version = "30.0.3"
)
