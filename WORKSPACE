# Load HTTP Archive
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

# Load Protobuf build rules
http_archive(
    name = "rules_proto",
    strip_prefix = "rules_proto-f7a30f6f80006b591fa7c437fe5a951eb10bcbcf",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/rules_proto/archive/f7a30f6f80006b591fa7c437fe5a951eb10bcbcf.tar.gz",
        "https://github.com/bazelbuild/rules_proto/archive/f7a30f6f80006b591fa7c437fe5a951eb10bcbcf.tar.gz"
    ]
)
load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()

# Load Kotlin build rules
RULES_KOTLIN_VERSION = "9051eb053f9c958440603d557316a6e9fda14687"

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "c36e71eec84c0e17dd098143a9d93d5720e81b4db32bceaf2daf939252352727",
    strip_prefix = "rules_kotlin-%s" % RULES_KOTLIN_VERSION,
    url = "https://github.com/bazelbuild/rules_kotlin/archive/%s.tar.gz" % RULES_KOTLIN_VERSION,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories()
kt_register_toolchains()

# Android Test Support
#
# This repository contains the supporting tools to run Android instrumentation tests,
# like the emulator definitions (android_device) and the device broker/test runner.
ATS_TAG = "1edfdab3134a7f01b37afabd3eebfd2c5bb05151"
ATS_SHA256 = "dcd1ff76aef1a26329d77863972780c8fe1fc8ff625747342239f0489c2837ec"

http_archive(
    name = "android_test_support",
    sha256 = ATS_SHA256,
    strip_prefix = "android-test-%s" % ATS_TAG,
    urls = ["https://github.com/android/android-test/archive/%s.tar.gz" % ATS_TAG],
)

load("@android_test_support//:repo.bzl", "android_test_repositories")
android_test_repositories()

# Load Maven
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        # Android Main Libraries
        "androidx.appcompat:appcompat:1.3.0",
        "com.google.android.material:material:1.3.0",
        "androidx.constraintlayout:constraintlayout:2.0.4",

        # Android Core Kotlin Extensions
        "androidx.core:core-ktx:1.3.2",

        # Protobuf
#        "com.google.protobuf:protobuf-java:3.17.3",
#        "com.google.protobuf:protobuf-java-util:3.17.3",

        # Gson
        "com.google.code.gson:gson:2.8.7",

        # Test Libraries
        "junit:junit:4.13.2",
        "org.hamcrest:hamcrest:2.2",
        "androidx.test.espresso:espresso-core:3.3.0",
        "androidx.test:runner:1.3.0",
        "androidx.test:rules:1.3.0",
        "androidx.test.ext:junit:1.1.2"
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
