package $package$

import scopt.{OParser, OParserBuilder}

object Main {

  // TODO
  final case class Args()

  val argsBuilder: OParserBuilder[Args] = OParser.builder[Args]

  val argsParser: OParser[Unit, Args] = {
    import argsBuilder._
    OParser.sequence(
      programName("$name$"),
      head("$name$", "0.1"),
      note("TODO"),
      // TODO: add arguments and options
    )
  }

  def main(rawArgs: Array[String]): Unit = {
    OParser.parse(argsParser, rawArgs, Args()) match {
      case Some(args) =>
        println("it worked: " + args)
      case None =>
        sys.exit(1)
    }
  }

}
