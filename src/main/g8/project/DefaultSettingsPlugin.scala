import sbt.Keys._
import sbt._

object DefaultSettingsPlugin extends AutoPlugin {

  override def trigger = allRequirements

  // the rationale for placing settings defs here is that they should (or can) not be updated automatically using the scala-base-sync script
  // in the following, organizationName and startYear would also be required by sbt-header to generate ready-made license headers
  override lazy val projectSettings: Seq[Def.Setting[_]] = {
      Seq(
        organization := "$organization$",
        resolvers ++= Dependencies.resolvers,
        scalaVersion := "2.13.4",
        startYear := Some($start_year$)
      )
  }

}
