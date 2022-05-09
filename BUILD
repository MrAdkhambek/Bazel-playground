load("@io_bazel_rules_kotlin//kotlin:core.bzl", "define_kt_toolchain")

JAVA_LANGUAGE_LEVEL = "11"

KOTLIN_LANGUAGE_LEVEL = "1.6"

define_kt_toolchain(
    name = "kotlin_toolchain",
    api_version = KOTLIN_LANGUAGE_LEVEL,  # "1.1", "1.2", "1.3", "1.4", "1.5", or "1.6"
    jvm_target = JAVA_LANGUAGE_LEVEL,  # "1.6", "1.8", "9", "10", "11", "12", "13", "15", "16", or "17"
    language_version = KOTLIN_LANGUAGE_LEVEL,  # "1.1", "1.2", "1.3", "1.4",  "1.5", or "1.6"
)
