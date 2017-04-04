
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

class examination extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sampleId: String, origImagePath: String, examImagePath: String, evalSummary: String, buttonVisibility: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <style>
  		#revertButton """),format.raw/*7.19*/("""{"""),format.raw/*7.20*/("""
  		"""),format.raw/*8.5*/("""visibility: """),_display_(/*8.18*/buttonVisibility),format.raw/*8.34*/("""
  		"""),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
  		"""),format.raw/*10.5*/("""body"""),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""text-align:center"""),format.raw/*10.27*/("""}"""),format.raw/*10.28*/("""
  		"""),format.raw/*11.5*/("""pre """),format.raw/*11.9*/("""{"""),format.raw/*11.10*/("""
    		"""),format.raw/*12.7*/("""text-align: left;
    		white-space: pre-line;
    		display: inline-block;
    		font-size:14px;
  		"""),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
  		"""),format.raw/*17.5*/("""</style>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.59*/routes/*19.65*/.Assets.versioned("images/favicon.png")),format.raw/*19.104*/("""">
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*20.70*/("""" type="text/javascript"></script>
    </head>
    <body>
    <form action="backToSegments" method='POST' enctype="multipart/form-data" id="backToSegmentsForm">
    <button type="submit" form="backToSegmentsForm" value=""""),_display_(/*24.61*/sampleId),format.raw/*24.69*/(""""  name="sampleId" >Back</button>
    </form>
    
    <form action="clickImage" method='POST' enctype="multipart/form-data" id="clickImageForm">
    <img onclick="buttonClick(event)" src="assets/dolphinImages/subExamination.jpg" id="examinee">
    <input type="hidden" value="0" id="xClick" name="xClick">
    <input type="hidden" value="0" id="yClick" name="yClick">
    <input type="hidden" value=""""),_display_(/*31.34*/sampleId),format.raw/*31.42*/("""" name="sampleId">
    <input type="hidden" value=""""),_display_(/*32.34*/examImagePath),format.raw/*32.47*/("""" name="examImagePath">
    <input type="hidden" value=""""),_display_(/*33.34*/origImagePath),format.raw/*33.47*/("""" name="origImagePath">
    </form>
    <form action="revertToOriginal" method='POST' enctype="multipart/form-data" id="revertForm">
    <button type="submit" form="revertForm" value=""""),_display_(/*36.53*/sampleId),format.raw/*36.61*/("""" name="sampleId" id="revertButton">Zoom Back to Original</button>
    <input type="hidden" value=""""),_display_(/*37.34*/examImagePath),format.raw/*37.47*/("""" name="examImagePath">
    </form>
    
<!--     <a href="javascript:showhide('uniquename')"> -->
<!--     		Is this an image of a bloodstain? -->
<!--     </a> -->
    
<!--     <div id="uniquename" style="display:none;"> -->
<!--     	<p>Content goes here.</p> -->
<!--     </div> -->
    
    <form action="evaluate" method='POST' enctype="multipart/form-data" id="evaluateForm">
    <button type="submit" form="evaluateForm" value=""""),_display_(/*49.55*/sampleId),format.raw/*49.63*/(""""  name="sampleId" >Classify</button>
    </form>
    <div style="text-align: center;">
    	<pre>"""),_display_(/*52.12*/evalSummary),format.raw/*52.23*/("""</pre>
    </div>
     

    </body>
    <script type="text/javascript">
    var sampId = """"),_display_(/*58.20*/sampleId),format.raw/*58.28*/("""";
    function buttonClick(subEvent)
    """),format.raw/*60.5*/("""{"""),format.raw/*60.6*/("""
        """),format.raw/*61.9*/("""var mainEvent = subEvent ? subEvent : window.event;

        //alert("This button click occurred at: X(" +
        //mainEvent.clientX + ") and Y(" + mainEvent.clientY + ")");
        
        var exam = document.getElementById('examinee');
        var box = """),format.raw/*67.19*/("""{"""),format.raw/*67.20*/(""" """),format.raw/*67.21*/("""left: 0, top: 0 """),format.raw/*67.37*/("""}"""),format.raw/*67.38*/(""";
        try """),format.raw/*68.13*/("""{"""),format.raw/*68.14*/("""
            """),format.raw/*69.13*/("""box = exam.getBoundingClientRect();
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""" 
        """),format.raw/*71.9*/("""catch(e) 
        """),format.raw/*72.9*/("""{"""),format.raw/*72.10*/("""}"""),format.raw/*72.11*/("""
        """),format.raw/*73.9*/("""var doc = document,
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
        
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""
    
    """),format.raw/*97.5*/("""//MOCK-UP DEMO
    function showhide(id) """),format.raw/*98.27*/("""{"""),format.raw/*98.28*/("""
       	"""),format.raw/*99.9*/("""var e = document.getElementById(id);
       	
       	var inner;
       	if(sampId === '107')
       	"""),format.raw/*103.9*/("""{"""),format.raw/*103.10*/("""
       		"""),format.raw/*104.10*/("""inner = '<p>YES</p>';
       	"""),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""
       	"""),format.raw/*106.9*/("""else
       	"""),format.raw/*107.9*/("""{"""),format.raw/*107.10*/("""
       		"""),format.raw/*108.10*/("""inner = '<p>NO</p>';
       	"""),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""
       	
       	"""),format.raw/*111.9*/("""document.getElementById(id).innerHTML = inner;
       	
       	e.style.display = (e.style.display == 'block') ? 'none' : 'block';
     """),format.raw/*114.6*/("""}"""),format.raw/*114.7*/("""
	"""),format.raw/*115.2*/("""</script>
</html>"""))
      }
    }
  }

  def render(sampleId:String,origImagePath:String,examImagePath:String,evalSummary:String,buttonVisibility:String): play.twirl.api.HtmlFormat.Appendable = apply(sampleId,origImagePath,examImagePath,evalSummary,buttonVisibility)

  def f:((String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (sampleId,origImagePath,examImagePath,evalSummary,buttonVisibility) => apply(sampleId,origImagePath,examImagePath,evalSummary,buttonVisibility)

  def ref: this.type = this

}


}

/**/
object examination extends examination_Scope0.examination
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 12:06:33 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/examination.scala.html
                  HASH: 31dd531d72ff420d37479978bcf06e9127bd38cd
                  MATRIX: 785->1|992->112|1022->116|1131->198|1159->199|1191->205|1230->218|1266->234|1298->240|1325->241|1358->247|1389->251|1418->252|1463->269|1492->270|1525->276|1556->280|1585->281|1620->289|1753->395|1781->396|1814->402|1904->465|1919->471|1982->512|2071->574|2086->580|2147->619|2200->645|2215->651|2277->692|2529->917|2558->925|2994->1334|3023->1342|3103->1395|3137->1408|3222->1466|3256->1479|3471->1667|3500->1675|3628->1776|3662->1789|4139->2239|4168->2247|4297->2349|4329->2360|4454->2458|4483->2466|4554->2510|4582->2511|4619->2521|4912->2786|4941->2787|4970->2788|5014->2804|5043->2805|5086->2820|5115->2821|5157->2835|5229->2880|5258->2881|5296->2892|5342->2911|5371->2912|5400->2913|5437->2923|6512->3971|6540->3972|6579->3984|6649->4026|6678->4027|6715->4037|6849->4143|6879->4144|6919->4155|6978->4186|7008->4187|7046->4197|7088->4211|7118->4212|7158->4223|7216->4253|7246->4254|7294->4274|7461->4413|7490->4414|7521->4417
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|55->24|55->24|62->31|62->31|63->32|63->32|64->33|64->33|67->36|67->36|68->37|68->37|80->49|80->49|83->52|83->52|89->58|89->58|91->60|91->60|92->61|98->67|98->67|98->67|98->67|98->67|99->68|99->68|100->69|101->70|101->70|102->71|103->72|103->72|103->72|104->73|126->95|126->95|128->97|129->98|129->98|130->99|134->103|134->103|135->104|136->105|136->105|137->106|138->107|138->107|139->108|140->109|140->109|142->111|145->114|145->114|146->115
                  -- GENERATED --
              */
          