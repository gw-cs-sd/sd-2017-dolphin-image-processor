
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
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

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[DBUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(selectedUser: String, users: List[DBUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*3.1*/("""<h1>Welcome """),_display_(/*3.14*/selectedUser),format.raw/*3.26*/("""!</h1>

<ul>
"""),_display_(/*6.2*/for(user <- users) yield /*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
  """),format.raw/*7.3*/("""<li>"""),_display_(/*7.8*/user/*7.12*/.getName()),format.raw/*7.22*/("""</li>
""")))}),format.raw/*8.2*/("""
"""),format.raw/*9.1*/("""</ul>"""))
      }
    }
  }

  def render(selectedUser:String,users:List[DBUser]): play.twirl.api.HtmlFormat.Appendable = apply(selectedUser,users)

  def f:((String,List[DBUser]) => play.twirl.api.HtmlFormat.Appendable) = (selectedUser,users) => apply(selectedUser,users)

  def ref: this.type = this

}


}

/**/
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Fri Feb 17 23:23:48 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/test.scala.html
                  HASH: f586183dbf219564c8c037b669f769526d9ce20a
                  MATRIX: 756->1|894->44|924->48|963->61|995->73|1037->90|1070->108|1109->110|1139->114|1169->119|1181->123|1211->133|1248->141|1276->143
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|40->9
                  -- GENERATED --
              */
          