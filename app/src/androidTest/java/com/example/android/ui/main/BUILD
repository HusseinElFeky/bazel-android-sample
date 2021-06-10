load("@rules_jvm_external//:defs.bzl", "artifact")

android_library(
    name = "test_deps",
    exports = [
        artifact("junit:junit"),
        artifact("org.hamcrest:hamcrest"),
        artifact("androidx.test.espresso:espresso-core"),
        artifact("androidx.test:runner"),
        artifact("androidx.test:rules"),
        artifact("androidx.test.ext:junit")
    ]
)

android_library(
    name = "test_main",
    srcs = ["MainActivityTest.java"],
    visibility = ["//app/src/androidTest:__subpackages__"],
    deps = [
        ":test_deps",
        "//app/src/main/java/com/example/android/ui/main:main"
    ]
)

android_binary(
    name = "test_app",
    instruments = "//app/src/main/java/com/example/android/ui/main:app",
    manifest = "AndroidManifest.xml",
    manifest_values = {
        "applicationId": "com.example.android",
        "minSdkVersion": "16",
        "targetSdkVersion": "30",
        "versionCode" : "1",
        "versionName" : "1.0.0"
    },
    deps = [":test_main"]
)

android_instrumentation_test(
    name = "test_app_instrumentation",
    target_device = "@android_test_support//tools/android/emulated_devices/generic_phone:android_23_x86_qemu2",
    test_app = ":test_app"
)
