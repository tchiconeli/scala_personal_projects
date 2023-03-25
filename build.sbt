ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

libraryDependencies  ++= List(
  "org.seleniumhq.selenium" % "selenium-api" % "4.2.1",
  "org.seleniumhq.selenium" % "selenium-support" % "4.3.0" ,
    "org.seleniumhq.selenium" % "selenium-firefox-driver" % "4.2.1"

)

lazy val root = (project in file("."))
  .settings(
    name := "Estudo_Selenium"
  )
