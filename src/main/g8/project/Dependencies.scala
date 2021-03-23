import sbt._

object Dependencies {

  val resolvers: Seq[Resolver] = Seq()

  object Version {
    val Scopt = "4.0.0"
  }

  // comment licenses for dependencies using the SPDX short identifier (see e.g. https://opensource.org/licenses/Apache-2.0)
  // rationale: double check the license when adding a new library avoid having to remove a problematic one later on when it is in use and thus hard to remove
  object Library {
    // MIT
    val Scopt = "com.github.scopt" %% "scopt" % Version.Scopt
  }

  val app: Seq[ModuleID] = Seq(Library.Scopt)

}
