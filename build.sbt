val catsEffectVersion = "3.6.1"
val jsoniterScalaVersion = "2.37.2"
val tapirVersion = "1.11.35"
val fs2Version = "3.12.2" 

name := "intellij-scala3"
version := "1.0"
scalaVersion := "3.7.3"
scalacOptions ++= Seq(
  "-Wvalue-discard",
  "-Wnonunit-statement"
)


libraryDependencies ++= Seq(
  "org.virtuslab" %% "besom-core" % "0.2.2",
  "org.virtuslab" %% "besom-docker" % "4.5.1-core.0.2",
  "org.typelevel" %% "cats-effect" % catsEffectVersion,
  "org.typelevel" %% "cats-effect-cps" % "0.4.0",
  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % tapirVersion,
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % jsoniterScalaVersion,
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % jsoniterScalaVersion,
  "co.fs2" %% "fs2-core" % fs2Version,
)
