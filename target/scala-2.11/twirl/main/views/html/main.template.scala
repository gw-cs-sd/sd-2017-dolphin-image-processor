
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*16.70*/("""" type="text/javascript"></script>
    </head>
    <body>
    
    <form action='' method='POST' enctype="multipart/form-data">
        <input type='file' name='fileupload'><br>
        <input type='submit' value='run SetThresholdRGB macro on the selected image'>
    </form>
<!-- COMMENT OUT FOR NOW
    <p>
        Original (1 of 4):
    </p>
    <img src="""),_display_(/*28.15*/routes/*28.21*/.Assets.versioned("dolphinImages/image1.jpg")),format.raw/*28.66*/(""" """),format.raw/*28.67*/("""/>
    
    <p>
        Red Isolated (2 of 4):
    </p>
    <img src="""),_display_(/*33.15*/routes/*33.21*/.Assets.versioned("dolphinImages/redIsolated.jpg")),format.raw/*33.71*/(""" """),format.raw/*33.72*/("""/>
    
    <p>
        Red-ified (3 of 4):
    </p>
    <img src="""),_display_(/*38.15*/routes/*38.21*/.Assets.versioned("dolphinImages/redified.jpg")),format.raw/*38.68*/(""" """),format.raw/*38.69*/("""/>
    
    <p>
        Grayscale (4 of 4):
    </p>
    <img src="""),_display_(/*43.15*/routes/*43.21*/.Assets.versioned("dolphinImages/grayscaled.jpg")),format.raw/*43.70*/(""" """),format.raw/*43.71*/("""/>

END COMMENT OUT -->    


    """),format.raw/*48.94*/("""
    
        """),format.raw/*51.32*/("""
        """),_display_(/*52.10*/content),format.raw/*52.17*/("""
    """),format.raw/*53.5*/("""</body>
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
                  DATE: Mon Jan 02 23:08:46 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/main.scala.html
                  HASH: 5947b3d5cb396b8bf86292afad6103f0b83849a7
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1421->481|1436->487|1499->528|1587->589|1602->595|1663->634|1715->659|1730->665|1792->706|2178->1065|2193->1071|2259->1116|2288->1117|2385->1187|2400->1193|2471->1243|2500->1244|2594->1311|2609->1317|2677->1364|2706->1365|2800->1432|2815->1438|2885->1487|2914->1488|2976->1611|3018->1715|3055->1725|3083->1732|3115->1737
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|58->28|58->28|58->28|58->28|63->33|63->33|63->33|63->33|68->38|68->38|68->38|68->38|73->43|73->43|73->43|73->43|78->48|80->51|81->52|81->52|82->53
                  -- GENERATED --
              */
          