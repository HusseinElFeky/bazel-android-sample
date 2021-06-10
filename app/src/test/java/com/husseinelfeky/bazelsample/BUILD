load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "unit_test",
    srcs = glob(["*.java"]),
    test_class = "com.husseinelfeky.bazelsample.BasicUnitTest",
    deps = [
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest",
        "@maven//:androidx_test_runner"
    ]
)
