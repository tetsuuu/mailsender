name := "mailsender-asobi"

version := "1.0"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.sendgrid" % "sendgrid-java" % "2.2.2",
  "com.typesafe" % "config" % "1.3.0"
)
