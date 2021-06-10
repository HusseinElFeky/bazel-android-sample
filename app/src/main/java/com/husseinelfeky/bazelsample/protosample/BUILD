load("@build_bazel_rules_android//android:rules.bzl", "android_library")
load("@rules_java//java:defs.bzl", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

android_library(
    name = "protosample",
    srcs = glob(["*.java"]),
    visibility = ["//app/src:__subpackages__"],
    deps = [
        ":addressbook_proto_java",
#        "@maven//:com_google_protobuf_protobuf_java",
#        "@maven//:com_google_protobuf_protobuf_java_util",
        "@com_google_protobuf//:protobuf_java",
        "@com_google_protobuf//:protobuf_java_util",
        "@maven//:com_google_code_gson_gson"
    ]
)

proto_library(
    name = "addressbook_proto",
    srcs = ["addressbook.proto"]
)

java_proto_library(
    name = "addressbook_proto_java",
    deps = [":addressbook_proto"]
)
