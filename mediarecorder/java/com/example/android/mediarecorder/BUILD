load("@build_bazel_rules_android//android:rules.bzl", "android_binary", "android_library")

android_library(
    name = "main",
    srcs = ["MainActivity.java"],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
        "//mediarecorder/java/com/example/android/common/media"
    ]
)

android_binary(
    name = "app",
    manifest = "AndroidManifest.xml",
    manifest_values = {
        "minSdkVersion": "16",
        "targetSdkVersion": "30",
        "versionCode" : "1",
        "versionName" : "1.0.0"
    },
    deps = [":main"]
)
