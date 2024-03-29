import mill._, scalalib._, scalajslib._, define.Task
// import ammonite.ops._

object illustrations extends ScalaJSModule{
    def scalaVersion = "2.12.10"
    def scalaJSVersion = "0.6.31"
  
    def platformSegment = "js"
  
    import coursier.maven.MavenRepository
  
    def repositories = super.repositories ++ Seq(
      MavenRepository("https://oss.sonatype.org/content/repositories/releases")
    )
  
    def ivyDeps = Agg(
      ivy"org.scala-js::scalajs-dom::0.9.7",
      ivy"in.nvilla::monadic-html::0.4.0",
      ivy"com.lihaoyi::scalatags::0.8.2"
    )
  
    def pack(): define.Command[PathRef] = T.command {
      def js = fastOpt()
      val target = os.pwd/ "js" / "illustrations.js"
    //   pprint.log(target)
      os.copy.over(js.path, target, createFolders = true)
      js
    }
  
  
  }