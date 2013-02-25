import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

name := "$name$"

organization := "$package;format="normalize"$"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1"
)

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/",
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "io.spray"          % "spray-routing" % "$sprayVersion$",
  "io.spray"          % "spray-can"     % "$sprayVersion$",
  "io.spray"          % "spray-httpx"   % "$sprayVersion$",
  "io.spray"          % "spray-testkit" % "$sprayVersion$",
  "com.typesafe.akka" %% "akka-actor"   % "$akkaVersion$",
  "io.spray"          %% "spray-json"   % "$sprayJsonVersion$"
)

resolvers ++= Seq(
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalaz"    %% "scalaz-core"               % "$scalazVersion$",
  "org.typelevel" %% "scalaz-contrib-210"        % "$scalazContribVersion$",
  "org.typelevel" %% "scalaz-contrib-validation" % "$scalazContribVersion$"
)
