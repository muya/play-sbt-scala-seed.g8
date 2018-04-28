name := """$name$"""
organization := "$organization$"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "$scalatestplusplay_version$" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "$package$.$name;format="word"$.controllers._"

// Adds additional packages into resources/routes
// play.sbt.routes.RoutesKeys.routesImport += "$package$.$name;format="word"$.binders._"

// disable default Play layout to enable SBT layout
disablePlugins(PlayLayoutPlugin)
PlayKeys.playMonitoredFiles ++= (sourceDirectories in (Compile, TwirlKeys.compileTemplates)).value
