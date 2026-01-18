// build.sbt
// 黄金组合：Chisel 6 + ChiselTest 6

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.jay"

val chiselVersion = "6.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "chisel-demo",
    libraryDependencies ++= Seq(
      // 核心库
      "org.chipsalliance" %% "chisel" % chiselVersion,
      // 测试库
      "edu.berkeley.cs" %% "chiseltest" % "6.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-Ymacro-annotations",
    ),
    addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % chiselVersion cross CrossVersion.full)
  )