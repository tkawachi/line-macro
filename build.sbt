organization := "com.github.tkawachi"

name := "line-macro"

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

scmInfo := Some(ScmInfo(
  url("https://github.com/tkawachi/line-macro/"),
  "scm:git:github.com:tkawachi/line-macro.git"
))

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint"
)

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

unmanagedSourceDirectories in Compile <+= (scalaVersion, sourceDirectory in Compile) {
  case (v, dir) if v startsWith "2.10" => dir / "scala_2.10"
  case (v, dir) if v startsWith "2.11" => dir / "scala_2.11"
}

scalariformSettings

doctestSettings
