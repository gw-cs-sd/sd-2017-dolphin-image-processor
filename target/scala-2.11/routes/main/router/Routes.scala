
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Andrew/play-java-1/conf/routes
// @DATE:Thu Jan 05 14:52:49 EST 2017

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
  HomeController_4: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_5: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:16
  Application_8: controllers.Application,
  // @LINE:17
  UsersController_3: controllers.UsersController,
  // @LINE:20
  ConfirmUserDeleteController_9: controllers.ConfirmUserDeleteController,
  // @LINE:21
  SamplesController_6: controllers.SamplesController,
  // @LINE:24
  ConfirmSampleDeleteController_2: controllers.ConfirmSampleDeleteController,
  // @LINE:26
  SegmentsController_0: controllers.SegmentsController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_4: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_5: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:16
    Application_8: controllers.Application,
    // @LINE:17
    UsersController_3: controllers.UsersController,
    // @LINE:20
    ConfirmUserDeleteController_9: controllers.ConfirmUserDeleteController,
    // @LINE:21
    SamplesController_6: controllers.SamplesController,
    // @LINE:24
    ConfirmSampleDeleteController_2: controllers.ConfirmSampleDeleteController,
    // @LINE:26
    SegmentsController_0: controllers.SegmentsController
  ) = this(errorHandler, HomeController_4, CountController_1, AsyncController_5, Assets_7, Application_8, UsersController_3, ConfirmUserDeleteController_9, SamplesController_6, ConfirmSampleDeleteController_2, SegmentsController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CountController_1, AsyncController_5, Assets_7, Application_8, UsersController_3, ConfirmUserDeleteController_9, SamplesController_6, ConfirmSampleDeleteController_2, SegmentsController_0, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """requestDeleteSample""", """controllers.SamplesController.requestDeleteSample"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmSampleDelete""", """controllers.ConfirmSampleDeleteController.confirmSampleDelete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewSample""", """controllers.SamplesController.viewSample"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backToSample""", """controllers.SegmentsController.backToSamples"""),
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
    HomeController_4.index,
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
    CountController_1.count,
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
    AsyncController_5.message,
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
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
    Application_8.upload,
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
    UsersController_3.addNewUser,
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
    UsersController_3.requestDeleteUser,
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
    UsersController_3.loginUser,
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
    ConfirmUserDeleteController_9.confirm,
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
    SamplesController_6.backToUsers,
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
    SamplesController_6.addSample,
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

  // @LINE:23
  private[this] lazy val controllers_SamplesController_requestDeleteSample11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("requestDeleteSample")))
  )
  private[this] lazy val controllers_SamplesController_requestDeleteSample11_invoker = createInvoker(
    SamplesController_6.requestDeleteSample,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SamplesController",
      "requestDeleteSample",
      Nil,
      "POST",
      """""",
      this.prefix + """requestDeleteSample"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ConfirmSampleDeleteController_confirmSampleDelete12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmSampleDelete")))
  )
  private[this] lazy val controllers_ConfirmSampleDeleteController_confirmSampleDelete12_invoker = createInvoker(
    ConfirmSampleDeleteController_2.confirmSampleDelete,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConfirmSampleDeleteController",
      "confirmSampleDelete",
      Nil,
      "POST",
      """""",
      this.prefix + """confirmSampleDelete"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SamplesController_viewSample13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewSample")))
  )
  private[this] lazy val controllers_SamplesController_viewSample13_invoker = createInvoker(
    SamplesController_6.viewSample,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SamplesController",
      "viewSample",
      Nil,
      "POST",
      """""",
      this.prefix + """viewSample"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SegmentsController_backToSamples14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backToSample")))
  )
  private[this] lazy val controllers_SegmentsController_backToSamples14_invoker = createInvoker(
    SegmentsController_0.backToSamples,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SegmentsController",
      "backToSamples",
      Nil,
      "POST",
      """""",
      this.prefix + """backToSample"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_Application_upload4_route(params) =>
      call { 
        controllers_Application_upload4_invoker.call(Application_8.upload)
      }
  
    // @LINE:17
    case controllers_UsersController_addNewUser5_route(params) =>
      call { 
        controllers_UsersController_addNewUser5_invoker.call(UsersController_3.addNewUser)
      }
  
    // @LINE:18
    case controllers_UsersController_requestDeleteUser6_route(params) =>
      call { 
        controllers_UsersController_requestDeleteUser6_invoker.call(UsersController_3.requestDeleteUser)
      }
  
    // @LINE:19
    case controllers_UsersController_loginUser7_route(params) =>
      call { 
        controllers_UsersController_loginUser7_invoker.call(UsersController_3.loginUser)
      }
  
    // @LINE:20
    case controllers_ConfirmUserDeleteController_confirm8_route(params) =>
      call { 
        controllers_ConfirmUserDeleteController_confirm8_invoker.call(ConfirmUserDeleteController_9.confirm)
      }
  
    // @LINE:21
    case controllers_SamplesController_backToUsers9_route(params) =>
      call { 
        controllers_SamplesController_backToUsers9_invoker.call(SamplesController_6.backToUsers)
      }
  
    // @LINE:22
    case controllers_SamplesController_addSample10_route(params) =>
      call { 
        controllers_SamplesController_addSample10_invoker.call(SamplesController_6.addSample)
      }
  
    // @LINE:23
    case controllers_SamplesController_requestDeleteSample11_route(params) =>
      call { 
        controllers_SamplesController_requestDeleteSample11_invoker.call(SamplesController_6.requestDeleteSample)
      }
  
    // @LINE:24
    case controllers_ConfirmSampleDeleteController_confirmSampleDelete12_route(params) =>
      call { 
        controllers_ConfirmSampleDeleteController_confirmSampleDelete12_invoker.call(ConfirmSampleDeleteController_2.confirmSampleDelete)
      }
  
    // @LINE:25
    case controllers_SamplesController_viewSample13_route(params) =>
      call { 
        controllers_SamplesController_viewSample13_invoker.call(SamplesController_6.viewSample)
      }
  
    // @LINE:26
    case controllers_SegmentsController_backToSamples14_route(params) =>
      call { 
        controllers_SegmentsController_backToSamples14_invoker.call(SegmentsController_0.backToSamples)
      }
  }
}
