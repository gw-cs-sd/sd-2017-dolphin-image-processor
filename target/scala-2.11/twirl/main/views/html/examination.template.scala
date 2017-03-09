
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object examination_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class examination extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sampleId: String, origImagePath: String, examImagePath: String, buttonVisibility: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.92*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <style>
  		#revertButton """),format.raw/*7.19*/("""{"""),format.raw/*7.20*/("""
  		"""),format.raw/*8.5*/("""visibility: """),_display_(/*8.18*/buttonVisibility),format.raw/*8.34*/("""
  		"""),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
  		"""),format.raw/*10.5*/("""body"""),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""text-align:center"""),format.raw/*10.27*/("""}"""),format.raw/*10.28*/("""
  		"""),format.raw/*11.5*/("""</style>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>
    </head>
    <body>
    <form action="backToSegments" method='POST' enctype="multipart/form-data" id="backToSegmentsForm">
    <button type="submit" form="backToSegmentsForm" value=""""),_display_(/*18.61*/sampleId),format.raw/*18.69*/(""""  name="sampleId" >Back</button>
    </form>
    
    <form action="clickImage" method='POST' enctype="multipart/form-data" id="clickImageForm">
    <img onclick="buttonClick(event)" src="assets/dolphinImages/subExamination.jpg" id="examinee">
    <input type="hidden" value="0" id="xClick" name="xClick">
    <input type="hidden" value="0" id="yClick" name="yClick">
    <input type="hidden" value=""""),_display_(/*25.34*/sampleId),format.raw/*25.42*/("""" name="sampleId">
    <input type="hidden" value=""""),_display_(/*26.34*/examImagePath),format.raw/*26.47*/("""" name="examImagePath">
    <input type="hidden" value=""""),_display_(/*27.34*/origImagePath),format.raw/*27.47*/("""" name="origImagePath">
    </form>
    <form action="revertToOriginal" method='POST' enctype="multipart/form-data" id="revertForm">
    <button type="submit" form="revertForm" value=""""),_display_(/*30.53*/sampleId),format.raw/*30.61*/("""" name="sampleId" id="revertButton">Zoom Back to Original</button>
    <input type="hidden" value=""""),_display_(/*31.34*/examImagePath),format.raw/*31.47*/("""" name="examImagePath">
    </form>
    
    <a href="javascript:showhide('uniquename')">
    		Is this an image of a bloodstain?
    </a>
    
    <div id="uniquename" style="display:none;">
    	<p>Content goes here.</p>
    </div>
     

    </body>
    <script type="text/javascript">
    var sampId = """"),_display_(/*45.20*/sampleId),format.raw/*45.28*/("""";
    function buttonClick(subEvent)
    """),format.raw/*47.5*/("""{"""),format.raw/*47.6*/("""
        """),format.raw/*48.9*/("""var mainEvent = subEvent ? subEvent : window.event;

        //alert("This button click occurred at: X(" +
        //mainEvent.clientX + ") and Y(" + mainEvent.clientY + ")");
        
        var exam = document.getElementById('examinee');
        var box = """),format.raw/*54.19*/("""{"""),format.raw/*54.20*/(""" """),format.raw/*54.21*/("""left: 0, top: 0 """),format.raw/*54.37*/("""}"""),format.raw/*54.38*/(""";
        try """),format.raw/*55.13*/("""{"""),format.raw/*55.14*/("""
            """),format.raw/*56.13*/("""box = exam.getBoundingClientRect();
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""" 
        """),format.raw/*58.9*/("""catch(e) 
        """),format.raw/*59.9*/("""{"""),format.raw/*59.10*/("""}"""),format.raw/*59.11*/("""
        """),format.raw/*60.9*/("""var doc = document,
            docElem = doc.documentElement,
            body = document.body,
            win = window,
            clientTop  = docElem.clientTop  || body.clientTop  || 0,
            clientLeft = docElem.clientLeft || body.clientLeft || 0,
            scrollTop  = win.pageYOffset && docElem.scrollTop  || body.scrollTop,
            scrollLeft = win.pageXOffset && docElem.scrollLeft || body.scrollLeft,
            top  = box.top  + scrollTop  - clientTop,
            left = box.left + scrollLeft - clientLeft;
        top = box.top;
        left = box.left;
        
        var imageX = (mainEvent.clientX - left);
        var imageY = (mainEvent.clientY - top);
        
        //alert("This button click occurred at: X(" +
        //        imageX + ") and Y(" + imageY + ")");
        document.getElementById("xClick").setAttribute("value", imageX);
        document.getElementById("yClick").setAttribute("value", imageY);
        document.getElementById('clickImageForm').submit();
        
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""
    
    """),format.raw/*84.5*/("""//MOCK-UP DEMO
    function showhide(id) """),format.raw/*85.27*/("""{"""),format.raw/*85.28*/("""
       	"""),format.raw/*86.9*/("""var e = document.getElementById(id);
       	
       	var inner;
       	if(sampId === '107')
       	"""),format.raw/*90.9*/("""{"""),format.raw/*90.10*/("""
       		"""),format.raw/*91.10*/("""inner = '<p>YES</p>';
       	"""),format.raw/*92.9*/("""}"""),format.raw/*92.10*/("""
       	"""),format.raw/*93.9*/("""else
       	"""),format.raw/*94.9*/("""{"""),format.raw/*94.10*/("""
       		"""),format.raw/*95.10*/("""inner = '<p>NO</p>';
       	"""),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""
       	
       	"""),format.raw/*98.9*/("""document.getElementById(id).innerHTML = inner;
       	
       	e.style.display = (e.style.display == 'block') ? 'none' : 'block';
     """),format.raw/*101.6*/("""}"""),format.raw/*101.7*/("""
	"""),format.raw/*102.2*/("""</script>
</html>"""))
      }
    }
  }

  def render(sampleId:String,origImagePath:String,examImagePath:String,buttonVisibility:String): play.twirl.api.HtmlFormat.Appendable = apply(sampleId,origImagePath,examImagePath,buttonVisibility)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (sampleId,origImagePath,examImagePath,buttonVisibility) => apply(sampleId,origImagePath,examImagePath,buttonVisibility)

  def ref: this.type = this

}


}

/**/
object examination extends examination_Scope0.examination
              /*
                  -- GENERATED --
                  DATE: Wed Mar 08 11:55:28 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/examination.scala.html
                  HASH: c876f6871d9e30c35f3cdbf0c1159cd15818bf83
                  MATRIX: 778->1|963->91|993->95|1102->177|1130->178|1162->184|1201->197|1237->213|1269->219|1296->220|1329->226|1360->230|1389->231|1434->248|1463->249|1496->255|1586->318|1601->324|1664->365|1753->427|1768->433|1829->472|1882->498|1897->504|1959->545|2211->770|2240->778|2676->1187|2705->1195|2785->1248|2819->1261|2904->1319|2938->1332|3153->1520|3182->1528|3310->1629|3344->1642|3693->1964|3722->1972|3793->2016|3821->2017|3858->2027|4151->2292|4180->2293|4209->2294|4253->2310|4282->2311|4325->2326|4354->2327|4396->2341|4468->2386|4497->2387|4535->2398|4581->2417|4610->2418|4639->2419|4676->2429|5751->3477|5779->3478|5818->3490|5888->3532|5917->3533|5954->3543|6087->3649|6116->3650|6155->3661|6213->3692|6242->3693|6279->3703|6320->3717|6349->3718|6388->3729|6445->3759|6474->3760|6521->3780|6688->3919|6717->3920|6748->3923
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|49->18|49->18|56->25|56->25|57->26|57->26|58->27|58->27|61->30|61->30|62->31|62->31|76->45|76->45|78->47|78->47|79->48|85->54|85->54|85->54|85->54|85->54|86->55|86->55|87->56|88->57|88->57|89->58|90->59|90->59|90->59|91->60|113->82|113->82|115->84|116->85|116->85|117->86|121->90|121->90|122->91|123->92|123->92|124->93|125->94|125->94|126->95|127->96|127->96|129->98|132->101|132->101|133->102
                  -- GENERATED --
              */
          