scalaVersion := "2.12.2" // Doodle is currently published for Scala 2.12 only
scalaVersion in ThisBuild := "2.12.2"
resolvers += Resolver.bintrayRepo("underscoreio", "training")
libraryDependencies += "underscoreio" %% "doodle" % "0.8.2"
