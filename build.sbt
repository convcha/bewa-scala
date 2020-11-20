ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.convcha"
ThisBuild / organizationName := "bewa"

lazy val http4sVersion = "0.21.8"
lazy val scalaTestVersion = "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "bewa",
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-dsl" % http4sVersion,
      "org.http4s" %% "http4s-blaze-server" % http4sVersion,
      "org.http4s" %% "http4s-blaze-client" % http4sVersion,
      "org.scalatest" %% "scalatest" % scalaTestVersion % Test
    )
  )
