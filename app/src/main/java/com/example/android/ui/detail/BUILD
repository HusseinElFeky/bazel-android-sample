load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")

kt_android_library(
    name = "detail",
    srcs = ["DetailActivity.kt"],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//app/src:__subpackages__"],
    deps = [
        "@maven//:androidx_core_core_ktx",
        "@maven//:androidx_appcompat_appcompat",
        "@maven//:androidx_constraintlayout_constraintlayout"
    ]
)
