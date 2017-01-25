
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <style>
        .photo """),format.raw/*15.16*/("""{"""),format.raw/*15.17*/("""
            """),format.raw/*16.13*/("""padding: 64px 0 0 0;
            border: 3px solid #fff;
            outline: 1px solid #000;
            margin: 1px;
            width: 64px;
            height: 0px;
            display: block;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
        """),format.raw/*24.9*/("""</style>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*25.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.59*/routes/*26.65*/.Assets.versioned("images/favicon.png")),format.raw/*26.104*/("""">
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*27.70*/("""" type="text/javascript"></script>
    </head>
    <body>
    
    <form action='' method='POST' enctype="multipart/form-data">
        <input type='file' name='fileupload'><br>
        <input type='submit' value='run SetThresholdRGB macro on the selected image'>
    </form>
    
    <img src="assets/public/dolphinImages/zoomed.jpg">
    <img class="photo" src="""),_display_(/*37.29*/routes/*37.35*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*37.80*/(""" """),format.raw/*37.81*/("""/>
    <img class="photo" src="""),_display_(/*38.29*/routes/*38.35*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*38.80*/(""" """),format.raw/*38.81*/("""style="background-image: url("""),_display_(/*38.111*/routes/*38.117*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*38.162*/(""")" />
    
<!-- COMMENT OUT FOR NOW
    <p>
        Original (1 of 4):
    </p>
    <img src="""),_display_(/*44.15*/routes/*44.21*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*44.66*/(""" """),format.raw/*44.67*/("""/>
    
    <p>
        Red Isolated (2 of 4):
    </p>
    <img src="""),_display_(/*49.15*/routes/*49.21*/.Assets.versioned("dolphinImages/redIsolated.jpg")),format.raw/*49.71*/(""" """),format.raw/*49.72*/("""/>
    
    <p>
        Red-ified (3 of 4):
    </p>
    <img src="""),_display_(/*54.15*/routes/*54.21*/.Assets.versioned("dolphinImages/redified.jpg")),format.raw/*54.68*/(""" """),format.raw/*54.69*/("""/>
    
    <p>
        Grayscale (4 of 4):
    </p>
    <img src="""),_display_(/*59.15*/routes/*59.21*/.Assets.versioned("dolphinImages/grayscaled.jpg")),format.raw/*59.70*/(""" """),format.raw/*59.71*/("""/>

END COMMENT OUT -->    


    """),format.raw/*64.94*/("""
    
        """),format.raw/*67.32*/("""
        """),_display_(/*68.10*/content),format.raw/*68.17*/("""
    """),format.raw/*69.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Jan 25 15:46:25 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/main.scala.html
                  HASH: dc1abfca6b2e59cb8a759fd3757cce266831e9e7
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1400->459|1429->460|1470->473|1702->678|1731->679|1767->688|1856->750|1871->756|1934->797|2022->858|2037->864|2098->903|2150->928|2165->934|2227->975|2618->1339|2633->1345|2699->1390|2728->1391|2786->1422|2801->1428|2867->1473|2896->1474|2954->1504|2970->1510|3037->1555|3158->1649|3173->1655|3239->1700|3268->1701|3365->1771|3380->1777|3451->1827|3480->1828|3574->1895|3589->1901|3657->1948|3686->1949|3780->2016|3795->2022|3865->2071|3894->2072|3956->2195|3998->2299|4035->2309|4063->2316|4095->2321
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|45->15|45->15|46->16|53->23|53->23|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|67->37|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|68->38|68->38|74->44|74->44|74->44|74->44|79->49|79->49|79->49|79->49|84->54|84->54|84->54|84->54|89->59|89->59|89->59|89->59|94->64|96->67|97->68|97->68|98->69
                  -- GENERATED --
              */
          