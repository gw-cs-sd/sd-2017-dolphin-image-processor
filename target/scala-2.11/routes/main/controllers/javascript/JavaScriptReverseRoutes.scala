
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Andrew/play-java-1/conf/routes
// @DATE:Tue Apr 04 12:52:35 EDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseSamplesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def runClassifier: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.runClassifier",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "runClassifier"})
        }
      """
    )
  
    // @LINE:30
    def runClassifierSample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.runClassifierSample",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "runClassifierSample"})
        }
      """
    )
  
    // @LINE:23
    def addSample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.addSample",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addSample"})
        }
      """
    )
  
    // @LINE:28
    def populateDataSets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.populateDataSets",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "populateDataSets"})
        }
      """
    )
  
    // @LINE:22
    def backToUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.backToUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "backToUsers"})
        }
      """
    )
  
    // @LINE:26
    def viewSample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.viewSample",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewSample"})
        }
      """
    )
  
    // @LINE:24
    def requestDeleteSample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SamplesController.requestDeleteSample",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "requestDeleteSample"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseExaminationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def revertToOriginal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExaminationController.revertToOriginal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "revertToOriginal"})
        }
      """
    )
  
    // @LINE:35
    def clickImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExaminationController.clickImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clickImage"})
        }
      """
    )
  
    // @LINE:37
    def evaluate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExaminationController.evaluate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluate"})
        }
      """
    )
  
    // @LINE:34
    def backToSegments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExaminationController.backToSegments",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "backToSegments"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseSegmentsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def viewExamination: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentsController.viewExamination",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewExamination"})
        }
      """
    )
  
    // @LINE:33
    def evaluateSample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentsController.evaluateSample",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "evaluateSample"})
        }
      """
    )
  
    // @LINE:31
    def backToSamples: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentsController.backToSamples",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "backToSample"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseConfirmUserDeleteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConfirmUserDeleteController.confirm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseUsersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.loginUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser"})
        }
      """
    )
  
    // @LINE:19
    def requestDeleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.requestDeleteUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "requestDeleteUser"})
        }
      """
    )
  
    // @LINE:18
    def addNewUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.addNewUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addNewUser"})
        }
      """
    )
  
    // @LINE:6
    def initialRender: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.initialRender",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseConfirmSampleDeleteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def confirmSampleDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConfirmSampleDeleteController.confirmSampleDelete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmSampleDelete"})
        }
      """
    )
  
  }


}
