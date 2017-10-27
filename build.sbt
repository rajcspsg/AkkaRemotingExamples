name := """AkkaRemotingExamples"""

version := "1.0"

scalaVersion := "2.12.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.5.4"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-remote" % "2.5.4"
