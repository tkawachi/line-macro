organization := "com.github.tkawachi"

name := "line-macro"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

unmanagedSourceDirectories in Compile <+= (scalaVersion, sourceDirectory in Compile) {
  case (v, dir) if v startsWith "2.10" => dir / "scala_2.10"
  case (v, dir) if v startsWith "2.11" => dir / "scala_2.11"
}

scalariformSettings

doctestSettings
