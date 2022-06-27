# Workspace name
workspace(name = "Bazel")

###########################################################################
#   HTTP ARCHIVE
###########################################################################
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

###########################################################################
#   KOTLIN
###########################################################################

RULES_KOTLIN_VERSION = "v1.6.0"

RULES_KOTLIN_SHA = "a57591404423a52bd6b18ebba7979e8cd2243534736c5c94d35c89718ea38f94"

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = RULES_KOTLIN_SHA,
    urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % RULES_KOTLIN_VERSION],
)

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories", "kotlinc_version")

kotlin_repositories(
    compiler_release = kotlinc_version(
        release = "1.6.10",  # just the numeric version
        sha256 = "432267996d0d6b4b17ca8de0f878e44d4a099b7e9f1587a98edc4d27e76c215a",
    ),
)

load("@io_bazel_rules_kotlin//kotlin:core.bzl", "define_kt_toolchain", "kt_register_toolchains")

register_toolchains("//:kotlin_toolchain")

###########################################################################
#   Dagger2
###########################################################################

DAGGER_TAG = "2.42"

DAGGER_SHA = "8121789cc443f177005f683bdbed8f36273a5ceb96fb16a9528fd76bb2c35c79"

http_archive(
    name = "dagger",
    sha256 = DAGGER_SHA,
    strip_prefix = "dagger-dagger-%s" % DAGGER_TAG,
    urls = ["https://github.com/google/dagger/archive/dagger-%s.zip" % DAGGER_TAG],
)

load("@dagger//:workspace_defs.bzl", "DAGGER_ARTIFACTS", "DAGGER_REPOSITORIES")

###########################################################################
#   Maven
###########################################################################

RULES_JVM_EXTERNAL_TAG = "4.2"

RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = DAGGER_ARTIFACTS + [
        "org.projectlombok:lombok:1.18.24",
        "dev.zacsweers.redacted:redacted-compiler-plugin:1.0.0",
        "dev.zacsweers.redacted:redacted-compiler-plugin-annotations:1.0.0",
    ],
    repositories = DAGGER_REPOSITORIES + [
        "https://repo1.maven.org/maven2",
    ],
)
