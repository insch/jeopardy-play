name := """jeopardy-play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaCore,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.1.Final",
  javaEbean,
  cache,
  javaWs
)

libraryDependencies ++= Seq(
  "com.google.code.gson" % "gson" % "2.2"
)

templatesImport += "scala.collection._"

templatesImport += "at.ac.tuwien.big.we15.lab2.api._"
