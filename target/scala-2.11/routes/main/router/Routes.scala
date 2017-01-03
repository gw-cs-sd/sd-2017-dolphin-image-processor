
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Andrew/play-java-1/conf/routes
// @DATE:Mon Jan 02 23:08:45 EST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:16
  Application_6: controllers.Application,
  // @LINE:17
  UsersController_1: controllers.UsersController,
  // @LINE:20
  ConfirmUserDeleteController_7: controllers.ConfirmUserDeleteController,
  // @LINE:21
  SamplesController_4: controllers.SamplesController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:16
    Application_6: controllers.Application,
    // @LINE:17
    UsersController_1: controllers.UsersController,
    // @LINE:20
    ConfirmUserDeleteController_7: controllers.ConfirmUserDeleteController,
    // @LINE:21
    SamplesController_4: controllers.SamplesController
  ) = this(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_5, Application_6, UsersController_1, ConfirmUserDeleteController_7, SamplesController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_0, AsyncController_3, Assets_5, Application_6, UsersController_1, ConfirmUserDeleteController_7, SamplesController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix, """controllers.Application.upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addNewUser""", """controllers.UsersController.addNewUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """requestDeleteUser""", """controllers.UsersController.requestDeleteUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginUser""", """controllers.UsersController.loginUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm""", """controllers.ConfirmUserDeleteController.confirm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backToUsers""", """controllers.SamplesController.backToUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addSample""", """controllers.SamplesController.addSample"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_upload4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_upload4_invoker = createInvoker(
    Application_6.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Nil,
      "POST",
      """az""",
      this.prefix + """"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UsersController_addNewUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addNewUser")))
  )
  private[this] lazy val controllers_UsersController_addNewUser5_invoker = createInvoker(
    UsersController_1.addNewUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "addNewUser",
      Nil,
      "POST",
      """""",
      this.prefix + """addNewUser"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsersController_requestDeleteUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("requestDeleteUser")))
  )
  private[this] lazy val controllers_UsersController_requestDeleteUser6_invoker = createInvoker(
    UsersController_1.requestDeleteUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "requestDeleteUser",
      Nil,
      "POST",
      """""",
      this.prefix + """requestDeleteUser"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UsersController_loginUser7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginUser")))
  )
  private[this] lazy val controllers_UsersController_loginUser7_invoker = createInvoker(
    UsersController_1.loginUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "loginUser",
      Nil,
      "POST",
      """""",
      this.prefix + """loginUser"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ConfirmUserDeleteController_confirm8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm")))
  )
  private[this] lazy val controllers_ConfirmUserDeleteController_confirm8_invoker = createInvoker(
    ConfirmUserDeleteController_7.confirm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConfirmUserDeleteController",
      "confirm",
      Nil,
      "POST",
      """""",
      this.prefix + """confirm"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_SamplesController_backToUsers9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backToUsers")))
  )
  private[this] lazy val controllers_SamplesController_backToUsers9_invoker = createInvoker(
    SamplesController_4.backToUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SamplesController",
      "backToUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """backToUsers"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_SamplesController_addSample10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addSample")))
  )
  private[this] lazy val controllers_SamplesController_addSample10_invoker = createInvoker(
    SamplesController_4.addSample,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SamplesController",
      "addSample",
      Nil,
      "POST",
      """""",
      this.prefix + """addSample"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_Application_upload4_route(params) =>
      call { 
        controllers_Application_upload4_invoker.call(Application_6.upload)
      }
  
    // @LINE:17
    case controllers_UsersController_addNewUser5_route(params) =>
      call { 
        controllers_UsersController_addNewUser5_invoker.call(UsersController_1.addNewUser)
      }
  
    // @LINE:18
    case controllers_UsersController_requestDeleteUser6_route(params) =>
      call { 
        controllers_UsersController_requestDeleteUser6_invoker.call(UsersController_1.requestDeleteUser)
      }
  
    // @LINE:19
    case controllers_UsersController_loginUser7_route(params) =>
      call { 
        controllers_UsersController_loginUser7_invoker.call(UsersController_1.loginUser)
      }
  
    // @LINE:20
    case controllers_ConfirmUserDeleteController_confirm8_route(params) =>
      call { 
        controllers_ConfirmUserDeleteController_confirm8_invoker.call(ConfirmUserDeleteController_7.confirm)
      }
  
    // @LINE:21
    case controllers_SamplesController_backToUsers9_route(params) =>
      call { 
        controllers_SamplesController_backToUsers9_invoker.call(SamplesController_4.backToUsers)
      }
  
    // @LINE:22
    case controllers_SamplesController_addSample10_route(params) =>
      call { 
        controllers_SamplesController_addSample10_invoker.call(SamplesController_4.addSample)
      }
  }
}
