
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Andrew/play-java-1/conf/routes
// @DATE:Fri Feb 17 23:23:47 EST 2017


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
