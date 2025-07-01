val catsEffectVersion = "3.6.1"

name := "intellij-scala3"
version := "1.0"
scalaVersion := "3.7.1"
scalacOptions ++= Seq(
  "-Wvalue-discard",
  "-Wnonunit-statement"
)

val tapirVersion = "1.11.35" 

libraryDependencies ++= Seq(
  "org.virtuslab" %% "besom-core" % "0.2.2",
  "org.virtuslab" %% "besom-docker" % "4.5.1-core.0.2",
  "org.typelevel" %% "cats-effect" % catsEffectVersion,
  "org.typelevel" %% "cats-effect-cps" % "0.4.0",
  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % tapirVersion,
)
