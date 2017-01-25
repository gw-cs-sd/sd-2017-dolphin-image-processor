
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
    
<!-- COMMENT OUT FOR NOW
    <p>
        Original (1 of 4):
    </p>
    <img src="""),_display_(/*38.15*/routes/*38.21*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*38.66*/(""" """),format.raw/*38.67*/("""/>
    
    <p>
        Red Isolated (2 of 4):
    </p>
    <img src="""),_display_(/*43.15*/routes/*43.21*/.Assets.versioned("dolphinImages/redIsolated.jpg")),format.raw/*43.71*/(""" """),format.raw/*43.72*/("""/>
    
    <p>
        Red-ified (3 of 4):
    </p>
    <img src="""),_display_(/*48.15*/routes/*48.21*/.Assets.versioned("dolphinImages/redified.jpg")),format.raw/*48.68*/(""" """),format.raw/*48.69*/("""/>
    
    <p>
        Grayscale (4 of 4):
    </p>
    <img src="""),_display_(/*53.15*/routes/*53.21*/.Assets.versioned("dolphinImages/grayscaled.jpg")),format.raw/*53.70*/(""" """),format.raw/*53.71*/("""/>

END COMMENT OUT -->    

    </body>
    <script type="text/javascript">
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
	"""),format.raw/*96.2*/("""</script>
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
                  DATE: Wed Jan 25 15:46:25 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/examination.scala.html
                  HASH: d67a6b2c931231c48dcd8e534aabca5bb5f6ab2b
                  MATRIX: 778->1|963->91|993->95|1102->177|1130->178|1162->184|1201->197|1237->213|1269->219|1296->220|1329->226|1419->289|1434->295|1497->336|1586->398|1601->404|1662->443|1715->469|1730->475|1792->516|2050->747|2079->755|2515->1164|2544->1172|2624->1225|2658->1238|2743->1296|2777->1309|2992->1497|3021->1505|3149->1606|3183->1619|3341->1750|3356->1756|3422->1801|3451->1802|3553->1877|3568->1883|3639->1933|3668->1934|3767->2006|3782->2012|3850->2059|3879->2060|3978->2132|3993->2138|4063->2187|4092->2188|4242->2311|4270->2312|4307->2322|4600->2587|4629->2588|4658->2589|4702->2605|4731->2606|4774->2621|4803->2622|4845->2636|4917->2681|4946->2682|4984->2693|5030->2712|5059->2713|5088->2714|5125->2724|6200->3772|6228->3773|6258->3776
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|49->18|49->18|56->25|56->25|57->26|57->26|58->27|58->27|61->30|61->30|62->31|62->31|69->38|69->38|69->38|69->38|74->43|74->43|74->43|74->43|79->48|79->48|79->48|79->48|84->53|84->53|84->53|84->53|91->60|91->60|92->61|98->67|98->67|98->67|98->67|98->67|99->68|99->68|100->69|101->70|101->70|102->71|103->72|103->72|103->72|104->73|126->95|126->95|127->96
                  -- GENERATED --
              */
          