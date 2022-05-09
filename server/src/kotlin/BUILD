load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules()

kt_jvm_binary(
    name = "app",
    srcs = glob(["me/adkhambek/hamroh/*.kt"]),
    main_class = "me.adkhambek.hamroh.Application",
    deps = [
        ":dagger",
    ],
)
