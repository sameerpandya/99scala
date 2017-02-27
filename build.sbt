lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.spandya",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "99scala",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1"
  )

