
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Andrew/play-java-1/conf/routes
// @DATE:Thu Mar 16 17:58:27 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
