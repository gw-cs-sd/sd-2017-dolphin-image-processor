
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Andrew/play-java-1/conf/routes
// @DATE:Tue Mar 28 01:39:46 EDT 2017

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
  UsersController_3: controllers.UsersController,
  // @LINE:14
  Assets_5: controllers.Assets,
  // @LINE:21
  ConfirmUserDeleteController_6: controllers.ConfirmUserDeleteController,
  // @LINE:22
  SamplesController_4: controllers.SamplesController,
  // @LINE:25
  ConfirmSampleDeleteController_2: controllers.ConfirmSampleDeleteController,
  // @LINE:30
  SegmentsController_1: controllers.SegmentsController,
  // @LINE:32
  ExaminationController_0: controllers.ExaminationController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    UsersController_3: controllers.UsersController,
    // @LINE:14
    Assets_5: controllers.Assets,
    // @LINE:21
    ConfirmUserDeleteController_6: controllers.ConfirmUserDeleteController,
    // @LINE:22
    SamplesController_4: controllers.SamplesController,
    // @LINE:25
    ConfirmSampleDeleteController_2: controllers.ConfirmSampleDeleteController,
    // @LINE:30
    SegmentsController_1: controllers.SegmentsController,
    // @LINE:32
    ExaminationController_0: controllers.ExaminationController
  ) = this(errorHandler, UsersController_3, Assets_5, ConfirmUserDeleteController_6, SamplesController_4, ConfirmSampleDeleteController_2, SegmentsController_1, ExaminationController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UsersController_3, Assets_5, ConfirmUserDeleteController_6, SamplesController_4, ConfirmSampleDeleteController_2, SegmentsController_1, ExaminationController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.UsersController.initialRender"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix, """controllers.UsersController.initialRender"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addNewUser""", """controllers.UsersController.addNewUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """requestDeleteUser""", """controllers.UsersController.requestDeleteUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginUser""", """controllers.UsersController.loginUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm""", """controllers.ConfirmUserDeleteController.confirm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backToUsers""", """controllers.SamplesController.backToUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addSample""", """controllers.SamplesController.addSample"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """requestDeleteSample""", """controllers.SamplesController.requestDeleteSample"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmSampleDelete""", """controllers.ConfirmSampleDeleteController.confirmSampleDelete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewSample""", """controllers.SamplesController.viewSample"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """populateDataSets""", """controllers.SamplesController.populateDataSets"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """runClassifier""", """controllers.SamplesController.runClassifier"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backToSample""", """controllers.SegmentsController.backToSamples"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewExamination""", """controllers.SegmentsController.viewExamination"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backToSegments""", """controllers.ExaminationController.backToSegments"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clickImage""", """controllers.ExaminationController.clickImage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """revertToOriginal""", """controllers.ExaminationController.revertToOriginal"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_UsersController_initialRender0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UsersController_initialRender0_invoker = createInvoker(
    UsersController_3.initialRender,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "initialRender",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_UsersController_initialRender2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UsersController_initialRender2_invoker = createInvoker(
    UsersController_3.initialRender,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "initialRender",
      Nil,
      "POST",
      """az""",
      this.prefix + """"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsersController_addNewUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addNewUser")))
  )
  private[this] lazy val controllers_UsersController_addNewUser3_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_UsersController_requestDeleteUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("requestDeleteUser")))
  )
  private[this] lazy val controllers_UsersController_requestDeleteUser4_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_UsersController_loginUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginUser")))
  )
  private[this] lazy val controllers_UsersController_loginUser5_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_ConfirmUserDeleteController_confirm6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm")))
  )
  private[this] lazy val controllers_ConfirmUserDeleteController_confirm6_invoker = createInvoker(
    ConfirmUserDeleteController_6.confirm,
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

  // @LINE:22
  private[this] lazy val controllers_SamplesController_backToUsers7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backToUsers")))
  )
  private[this] lazy val controllers_SamplesController_backToUsers7_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_SamplesController_addSample8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addSample")))
  )
  private[this] lazy val controllers_SamplesController_addSample8_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_SamplesController_requestDeleteSample9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("requestDeleteSample")))
  )
  private[this] lazy val controllers_SamplesController_requestDeleteSample9_invoker = createInvoker(
    SamplesController_4.requestDeleteSample,
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

  // @LINE:25
  private[this] lazy val controllers_ConfirmSampleDeleteController_confirmSampleDelete10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmSampleDelete")))
  )
  private[this] lazy val controllers_ConfirmSampleDeleteController_confirmSampleDelete10_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_SamplesController_viewSample11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewSample")))
  )
  private[this] lazy val controllers_SamplesController_viewSample11_invoker = createInvoker(
    SamplesController_4.viewSample,
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

  // @LINE:28
  private[this] lazy val controllers_SamplesController_populateDataSets12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("populateDataSets")))
  )
  private[this] lazy val controllers_SamplesController_populateDataSets12_invoker = createInvoker(
    SamplesController_4.populateDataSets,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SamplesController",
      "populateDataSets",
      Nil,
      "POST",
      """POST	/addToDataset				controllers.SamplesController.addToDataset""",
      this.prefix + """populateDataSets"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_SamplesController_runClassifier13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("runClassifier")))
  )
  private[this] lazy val controllers_SamplesController_runClassifier13_invoker = createInvoker(
    SamplesController_4.runClassifier,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SamplesController",
      "runClassifier",
      Nil,
      "POST",
      """""",
      this.prefix + """runClassifier"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_SegmentsController_backToSamples14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backToSample")))
  )
  private[this] lazy val controllers_SegmentsController_backToSamples14_invoker = createInvoker(
    SegmentsController_1.backToSamples,
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

  // @LINE:31
  private[this] lazy val controllers_SegmentsController_viewExamination15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewExamination")))
  )
  private[this] lazy val controllers_SegmentsController_viewExamination15_invoker = createInvoker(
    SegmentsController_1.viewExamination,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SegmentsController",
      "viewExamination",
      Nil,
      "POST",
      """""",
      this.prefix + """viewExamination"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ExaminationController_backToSegments16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backToSegments")))
  )
  private[this] lazy val controllers_ExaminationController_backToSegments16_invoker = createInvoker(
    ExaminationController_0.backToSegments,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExaminationController",
      "backToSegments",
      Nil,
      "POST",
      """""",
      this.prefix + """backToSegments"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ExaminationController_clickImage17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clickImage")))
  )
  private[this] lazy val controllers_ExaminationController_clickImage17_invoker = createInvoker(
    ExaminationController_0.clickImage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExaminationController",
      "clickImage",
      Nil,
      "POST",
      """""",
      this.prefix + """clickImage"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ExaminationController_revertToOriginal18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("revertToOriginal")))
  )
  private[this] lazy val controllers_ExaminationController_revertToOriginal18_invoker = createInvoker(
    ExaminationController_0.revertToOriginal,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExaminationController",
      "revertToOriginal",
      Nil,
      "POST",
      """""",
      this.prefix + """revertToOriginal"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_UsersController_initialRender0_route(params) =>
      call { 
        controllers_UsersController_initialRender0_invoker.call(UsersController_3.initialRender)
      }
  
    // @LINE:14
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_UsersController_initialRender2_route(params) =>
      call { 
        controllers_UsersController_initialRender2_invoker.call(UsersController_3.initialRender)
      }
  
    // @LINE:18
    case controllers_UsersController_addNewUser3_route(params) =>
      call { 
        controllers_UsersController_addNewUser3_invoker.call(UsersController_3.addNewUser)
      }
  
    // @LINE:19
    case controllers_UsersController_requestDeleteUser4_route(params) =>
      call { 
        controllers_UsersController_requestDeleteUser4_invoker.call(UsersController_3.requestDeleteUser)
      }
  
    // @LINE:20
    case controllers_UsersController_loginUser5_route(params) =>
      call { 
        controllers_UsersController_loginUser5_invoker.call(UsersController_3.loginUser)
      }
  
    // @LINE:21
    case controllers_ConfirmUserDeleteController_confirm6_route(params) =>
      call { 
        controllers_ConfirmUserDeleteController_confirm6_invoker.call(ConfirmUserDeleteController_6.confirm)
      }
  
    // @LINE:22
    case controllers_SamplesController_backToUsers7_route(params) =>
      call { 
        controllers_SamplesController_backToUsers7_invoker.call(SamplesController_4.backToUsers)
      }
  
    // @LINE:23
    case controllers_SamplesController_addSample8_route(params) =>
      call { 
        controllers_SamplesController_addSample8_invoker.call(SamplesController_4.addSample)
      }
  
    // @LINE:24
    case controllers_SamplesController_requestDeleteSample9_route(params) =>
      call { 
        controllers_SamplesController_requestDeleteSample9_invoker.call(SamplesController_4.requestDeleteSample)
      }
  
    // @LINE:25
    case controllers_ConfirmSampleDeleteController_confirmSampleDelete10_route(params) =>
      call { 
        controllers_ConfirmSampleDeleteController_confirmSampleDelete10_invoker.call(ConfirmSampleDeleteController_2.confirmSampleDelete)
      }
  
    // @LINE:26
    case controllers_SamplesController_viewSample11_route(params) =>
      call { 
        controllers_SamplesController_viewSample11_invoker.call(SamplesController_4.viewSample)
      }
  
    // @LINE:28
    case controllers_SamplesController_populateDataSets12_route(params) =>
      call { 
        controllers_SamplesController_populateDataSets12_invoker.call(SamplesController_4.populateDataSets)
      }
  
    // @LINE:29
    case controllers_SamplesController_runClassifier13_route(params) =>
      call { 
        controllers_SamplesController_runClassifier13_invoker.call(SamplesController_4.runClassifier)
      }
  
    // @LINE:30
    case controllers_SegmentsController_backToSamples14_route(params) =>
      call { 
        controllers_SegmentsController_backToSamples14_invoker.call(SegmentsController_1.backToSamples)
      }
  
    // @LINE:31
    case controllers_SegmentsController_viewExamination15_route(params) =>
      call { 
        controllers_SegmentsController_viewExamination15_invoker.call(SegmentsController_1.viewExamination)
      }
  
    // @LINE:32
    case controllers_ExaminationController_backToSegments16_route(params) =>
      call { 
        controllers_ExaminationController_backToSegments16_invoker.call(ExaminationController_0.backToSegments)
      }
  
    // @LINE:33
    case controllers_ExaminationController_clickImage17_route(params) =>
      call { 
        controllers_ExaminationController_clickImage17_invoker.call(ExaminationController_0.clickImage)
      }
  
    // @LINE:34
    case controllers_ExaminationController_revertToOriginal18_route(params) =>
      call { 
        controllers_ExaminationController_revertToOriginal18_invoker.call(ExaminationController_0.revertToOriginal)
      }
  }
}
