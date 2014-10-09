organization := "com.github.tkawachi"

name := "line-macro"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

scalariformSettings

doctestSettings
