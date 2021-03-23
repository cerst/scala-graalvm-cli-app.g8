lazy val root = (project in file("."))
  .aggregate(app)
  .settings(
    // root intentionally does not contain any code, so don't publish
    skip in publish := true,
    name := "$name$-root"
  )

lazy val app = (project in file("app"))
  .enablePlugins(GraalVMNativeImagePlugin)
  .settings(
    graalVMNativeImageOptions ++= Seq(
      // workaround required to fix runtime failure: Unsupported Constructor [...]: All methods from java.lang.invoke should have been replaced during image building
      "--initialize-at-build-time",
      // enforce that the generated image does not require a JDK (by default, this is possible due to fallbacks)
      "--no-fallback",
      // do NOT fail the build but print the problematic source at runtime (compile time reporting does not work for some reason ...)
      "--report-unsupported-elements-at-runtime"
    ),
    libraryDependencies ++= Dependencies.app,
    name := "$name$",
    // published as a runnable, not a library
    skip in publish := true
  )
