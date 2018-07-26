name := "tf-serving-gatling"

organization := "tf.benchmark"

scalaVersion := "2.12.6"

lazy val root = (project in file(".")).settings(inConfig(Gatling)(Defaults.testSettings): _*)

lazy val gatlingVersion = "2.3.0"

// (optional) If you need scalapb/scalapb.proto or anything from google/protobuf/*.proto
libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
  "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test",
  "io.gatling" % "gatling-test-framework" % gatlingVersion % "test",
  "io.gatling" % "gatling-core" % gatlingVersion,
  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion,
  "io.netty" % "netty-tcnative-boringssl-static" % "1.1.33.Fork26",
  "io.grpc" % "grpc-testing" % "1.0.2"
)

javaOptions in Gatling := overrideDefaultJavaOptions("-Xms1g", "-Xmx2g")

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Xlint:_",
  "-Xlint:-missing-interpolator",
  "-Xfuture",
  "-Yno-adapted-args",
  "-encoding", "UTF-8"
)

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)