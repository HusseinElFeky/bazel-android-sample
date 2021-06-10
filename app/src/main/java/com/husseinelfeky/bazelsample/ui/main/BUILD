load("@build_bazel_rules_android//android:rules.bzl", "android_binary", "android_library")

android_library(
    name = "main",
    srcs = ["MainActivity.java"],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//app/src/androidTest:__subpackages__"],
    deps = [
        "//app/src/main/java/com/husseinelfeky/bazelsample/common/media",
        "//app/src/main/java/com/husseinelfeky/bazelsample/ui/detail",
        "@maven//:androidx_appcompat_appcompat",
        "@maven//:androidx_constraintlayout_constraintlayout"
    ]
)

android_binary(
    name = "app",
    manifest = "AndroidManifest.xml",
    manifest_values = {
        "applicationId": "com.husseinelfeky.bazelsample",
        "minSdkVersion": "16",
        "targetSdkVersion": "30",
        "versionCode" : "1",
        "versionName" : "1.0.0"
    },
    visibility = ["//app/src/androidTest:__subpackages__"],
    deps = [":main"]
)
