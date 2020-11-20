import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.convcha"
ThisBuild / organizationName := "bewa"

lazy val root = (project in file("."))
  .settings(
    name := "bewa",
    libraryDependencies += scalaTest % Test
  )
