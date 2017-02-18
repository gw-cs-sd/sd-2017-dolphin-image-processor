
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
  		"""),format.raw/*10.5*/("""</style>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*13.70*/("""" type="text/javascript"></script>
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
    
<!-- COMMENT OUT FOR NOW
    <p>
        Original (1 of 4):
    </p>
    <img src="""),_display_(/*46.15*/routes/*46.21*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*46.66*/(""" """),format.raw/*46.67*/("""/>
    
    <p>
        Red Isolated (2 of 4):
    </p>
    <img src="""),_display_(/*51.15*/routes/*51.21*/.Assets.versioned("dolphinImages/redIsolated.jpg")),format.raw/*51.71*/(""" """),format.raw/*51.72*/("""/>
    
    <p>
        Red-ified (3 of 4):
    </p>
    <img src="""),_display_(/*56.15*/routes/*56.21*/.Assets.versioned("dolphinImages/redified.jpg")),format.raw/*56.68*/(""" """),format.raw/*56.69*/("""/>
    
    <p>
        Grayscale (4 of 4):
    </p>
    <img src="""),_display_(/*61.15*/routes/*61.21*/.Assets.versioned("dolphinImages/grayscaled.jpg")),format.raw/*61.70*/(""" """),format.raw/*61.71*/("""/>

END COMMENT OUT -->    

    </body>
    <script type="text/javascript">
    var sampId = """"),_display_(/*67.20*/sampleId),format.raw/*67.28*/("""";
    function buttonClick(subEvent)
    """),format.raw/*69.5*/("""{"""),format.raw/*69.6*/("""
        """),format.raw/*70.9*/("""var mainEvent = subEvent ? subEvent : window.event;

        //alert("This button click occurred at: X(" +
        //mainEvent.clientX + ") and Y(" + mainEvent.clientY + ")");
        
        var exam = document.getElementById('examinee');
        var box = """),format.raw/*76.19*/("""{"""),format.raw/*76.20*/(""" """),format.raw/*76.21*/("""left: 0, top: 0 """),format.raw/*76.37*/("""}"""),format.raw/*76.38*/(""";
        try """),format.raw/*77.13*/("""{"""),format.raw/*77.14*/("""
            """),format.raw/*78.13*/("""box = exam.getBoundingClientRect();
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""" 
        """),format.raw/*80.9*/("""catch(e) 
        """),format.raw/*81.9*/("""{"""),format.raw/*81.10*/("""}"""),format.raw/*81.11*/("""
        """),format.raw/*82.9*/("""var doc = document,
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
        
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
    
    """),format.raw/*106.5*/("""//MOCK-UP DEMO
    function showhide(id) """),format.raw/*107.27*/("""{"""),format.raw/*107.28*/("""
       	"""),format.raw/*108.9*/("""var e = document.getElementById(id);
       	
       	var inner;
       	if(sampId === '54')
       	"""),format.raw/*112.9*/("""{"""),format.raw/*112.10*/("""
       		"""),format.raw/*113.10*/("""inner = '<p>YES</p>';
       	"""),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""
       	"""),format.raw/*115.9*/("""else
       	"""),format.raw/*116.9*/("""{"""),format.raw/*116.10*/("""
       		"""),format.raw/*117.10*/("""inner = '<p>NO</p>';
       	"""),format.raw/*118.9*/("""}"""),format.raw/*118.10*/("""
       	
       	"""),format.raw/*120.9*/("""document.getElementById(id).innerHTML = inner;
       	
       	e.style.display = (e.style.display == 'block') ? 'none' : 'block';
     """),format.raw/*123.6*/("""}"""),format.raw/*123.7*/("""
	"""),format.raw/*124.2*/("""</script>
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
                  DATE: Fri Feb 17 23:23:48 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/examination.scala.html
                  HASH: 41d4566b6fa984a39f036330585346e08f2eaa8c
                  MATRIX: 778->1|963->91|993->95|1102->177|1130->178|1162->184|1201->197|1237->213|1269->219|1296->220|1329->226|1419->289|1434->295|1497->336|1586->398|1601->404|1662->443|1715->469|1730->475|1792->516|2050->747|2079->755|2515->1164|2544->1172|2624->1225|2658->1238|2743->1296|2777->1309|2992->1497|3021->1505|3149->1606|3183->1619|3547->1956|3562->1962|3628->2007|3657->2008|3759->2083|3774->2089|3845->2139|3874->2140|3973->2212|3988->2218|4056->2265|4085->2266|4184->2338|4199->2344|4269->2393|4298->2394|4427->2496|4456->2504|4527->2548|4555->2549|4592->2559|4885->2824|4914->2825|4943->2826|4987->2842|5016->2843|5059->2858|5088->2859|5130->2873|5202->2918|5231->2919|5269->2930|5315->2949|5344->2950|5373->2951|5410->2961|6486->4009|6515->4010|6555->4022|6626->4064|6656->4065|6694->4075|6827->4180|6857->4181|6897->4192|6956->4223|6986->4224|7024->4234|7066->4248|7096->4249|7136->4260|7194->4290|7224->4291|7272->4311|7439->4450|7468->4451|7499->4454
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|49->18|49->18|56->25|56->25|57->26|57->26|58->27|58->27|61->30|61->30|62->31|62->31|77->46|77->46|77->46|77->46|82->51|82->51|82->51|82->51|87->56|87->56|87->56|87->56|92->61|92->61|92->61|92->61|98->67|98->67|100->69|100->69|101->70|107->76|107->76|107->76|107->76|107->76|108->77|108->77|109->78|110->79|110->79|111->80|112->81|112->81|112->81|113->82|135->104|135->104|137->106|138->107|138->107|139->108|143->112|143->112|144->113|145->114|145->114|146->115|147->116|147->116|148->117|149->118|149->118|151->120|154->123|154->123|155->124
                  -- GENERATED --
              */
          