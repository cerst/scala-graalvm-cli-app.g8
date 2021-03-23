// https://github.com/dwijnand/sbt-dynver
// derive and set project versions based on Git meta data
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")

// https://github.com/sbt/sbt-native-packager
// create an executable (e.g. thin-jar, native bundle, docker-container)
// useful commands:
//    universal:stage
//    docker:publish[Local]
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.8.0")

// https://scalameta.org/scalafmt/
// thorough code formatting (recommendation: use Intellij plugin configured as format-on-save)
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

// https://github.com/DavidGregory084/sbt-tpolecat
// automatically sets valuable compiler flags
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.16")

// https://github.com/rtimush/sbt-updates
// check for new releases of plugins and dependencies
// when updating this version in the scala-base repo,
// don't forget to change <project-root>/project/project/sbt-updates.sbt as well
// useful commands
//    dependencyUpdates - list possible updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.1")
