name := "gatling-grpc"

organization := "com.spr.intuition"

scalaVersion := "2.12.6"

lazy val root = (project in file(".")).enablePlugins(GatlingPlugin)

lazy val gatlingVersion = "2.2.2"

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test" withJavadoc() withSources(),
  "io.gatling" % "gatling-test-framework" % gatlingVersion % "test" withJavadoc() withSources(),
  "io.gatling" % "gatling-core" % gatlingVersion,
  "io.grpc" % "grpc-netty" % "1.0.3",
  "io.netty" % "netty-tcnative-boringssl-static" % "1.1.33.Fork26",
  "io.grpc" % "grpc-testing" % "1.0.2"
)

libraryDependencies += Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
)


PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
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