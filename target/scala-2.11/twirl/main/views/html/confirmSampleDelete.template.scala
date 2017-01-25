
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirmSampleDelete_Scope0 {
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

class confirmSampleDelete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sampleId: String, userId: String, userName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""
"""),format.raw/*4.3*/("""
"""),format.raw/*5.1*/("""<style type="text/css">
.tg  """),format.raw/*6.6*/("""{"""),format.raw/*6.7*/("""border-collapse:collapse;border-spacing:0;border-color:#999;margin:0px auto;"""),format.raw/*6.83*/("""}"""),format.raw/*6.84*/("""
"""),format.raw/*7.1*/(""".tg td"""),format.raw/*7.7*/("""{"""),format.raw/*7.8*/("""font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#444;background-color:#F7FDFA;"""),format.raw/*7.194*/("""}"""),format.raw/*7.195*/("""
"""),format.raw/*8.1*/(""".tg th"""),format.raw/*8.7*/("""{"""),format.raw/*8.8*/("""font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#fff;background-color:#26ADE4;"""),format.raw/*8.213*/("""}"""),format.raw/*8.214*/("""
"""),format.raw/*9.1*/(""".tg .tg-baqh"""),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""text-align:center;vertical-align:top"""),format.raw/*9.50*/("""}"""),format.raw/*9.51*/("""
"""),format.raw/*10.1*/(""".tg .tg-9hbo"""),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""font-weight:bold;vertical-align:top"""),format.raw/*10.49*/("""}"""),format.raw/*10.50*/("""
"""),format.raw/*11.1*/(""".tg .tg-amwm"""),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""font-weight:bold;text-align:center;vertical-align:top"""),format.raw/*11.67*/("""}"""),format.raw/*11.68*/("""
"""),format.raw/*12.1*/(""".tg .tg-6k2t"""),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""background-color:#D2E4FC;vertical-align:top"""),format.raw/*12.57*/("""}"""),format.raw/*12.58*/("""
"""),format.raw/*13.1*/(""".tg .tg-j0tj"""),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""background-color:#D2E4FC;text-align:center;vertical-align:top"""),format.raw/*13.75*/("""}"""),format.raw/*13.76*/("""
"""),format.raw/*14.1*/(""".tg .tg-yw4l"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""vertical-align:top"""),format.raw/*14.32*/("""}"""),format.raw/*14.33*/("""
"""),format.raw/*15.1*/("""th.tg-sort-header::-moz-selection """),format.raw/*15.35*/("""{"""),format.raw/*15.36*/(""" """),format.raw/*15.37*/("""background:transparent; """),format.raw/*15.61*/("""}"""),format.raw/*15.62*/("""th.tg-sort-header::selection      """),format.raw/*15.96*/("""{"""),format.raw/*15.97*/(""" """),format.raw/*15.98*/("""background:transparent; """),format.raw/*15.122*/("""}"""),format.raw/*15.123*/("""th.tg-sort-header """),format.raw/*15.141*/("""{"""),format.raw/*15.142*/(""" """),format.raw/*15.143*/("""cursor:pointer; """),format.raw/*15.159*/("""}"""),format.raw/*15.160*/("""table th.tg-sort-header:after """),format.raw/*15.190*/("""{"""),format.raw/*15.191*/("""  """),format.raw/*15.193*/("""content:'';  float:right;  margin-top:7px;  border-width:0 4px 4px;  border-style:solid;  border-color:#404040 transparent;  visibility:hidden;  """),format.raw/*15.338*/("""}"""),format.raw/*15.339*/("""table th.tg-sort-header:hover:after """),format.raw/*15.375*/("""{"""),format.raw/*15.376*/("""  """),format.raw/*15.378*/("""visibility:visible;  """),format.raw/*15.399*/("""}"""),format.raw/*15.400*/("""table th.tg-sort-desc:after,table th.tg-sort-asc:after,table th.tg-sort-asc:hover:after """),format.raw/*15.488*/("""{"""),format.raw/*15.489*/("""  """),format.raw/*15.491*/("""visibility:visible;  opacity:0.4;  """),format.raw/*15.526*/("""}"""),format.raw/*15.527*/("""table th.tg-sort-desc:after """),format.raw/*15.555*/("""{"""),format.raw/*15.556*/("""  """),format.raw/*15.558*/("""border-bottom:none;  border-width:4px 4px 0;  """),format.raw/*15.604*/("""}"""),format.raw/*15.605*/("""
"""),format.raw/*16.1*/("""</style>

<form action="confirmSampleDelete" method='POST' enctype="multipart/form-data" id="ConfirmDeleteSampleForm">
<table id="tg-cFHod" class="tg">
	<tr><td class="tg-j0tj" colspan="2" style="text-align: center;">OK to Delete sampleId """),_display_(/*20.89*/sampleId),format.raw/*20.97*/(""" """),format.raw/*20.98*/(""": """),_display_(/*20.101*/userName),format.raw/*20.109*/(""" """),format.raw/*20.110*/("""?</td></tr>
    <tr>
    <td class="tg-baqh" style="text-align: center;"">
    <button type="submit" form="ConfirmDeleteSampleForm" value=""""),_display_(/*23.66*/sampleId),format.raw/*23.74*/(""""  name="deleteSampleId" >OK</button>
    </td>
    <td class="tg-baqh" style="text-align: center;">
    <button type="submit" form="ConfirmDeleteSampleForm" value=""""),_display_(/*26.66*/sampleId),format.raw/*26.74*/(""""  name="sampleId" >Cancel</button>
    </td>
    </tr>
</table>
</form>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*32.50*/("""{"""),format.raw/*32.51*/(""""use strict";
function r(n,t)"""),format.raw/*33.16*/("""{"""),format.raw/*33.17*/("""
	"""),format.raw/*34.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*34.49*/("""{"""),format.raw/*34.50*/("""
		"""),format.raw/*35.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*36.28*/("""{"""),format.raw/*36.29*/("""
			"""),format.raw/*37.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*38.3*/("""}"""),format.raw/*38.4*/(""" """),format.raw/*38.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/("""
	"""),format.raw/*41.2*/("""return e
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""
"""),format.raw/*43.1*/("""function e(n,t)"""),format.raw/*43.16*/("""{"""),format.raw/*43.17*/("""
	"""),format.raw/*44.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*46.14*/("""{"""),format.raw/*46.15*/("""
			"""),format.raw/*47.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*49.3*/("""}"""),format.raw/*49.4*/("""
	"""),format.raw/*50.2*/("""),e
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""
"""),format.raw/*52.1*/("""function o(n)"""),format.raw/*52.14*/("""{"""),format.raw/*52.15*/(""" """),format.raw/*52.16*/("""return n.textContent||n.innerText||"" """),format.raw/*52.54*/("""}"""),format.raw/*52.55*/("""
"""),format.raw/*53.1*/("""function i(n)"""),format.raw/*53.14*/("""{"""),format.raw/*53.15*/("""i return n.innerHTML||"" """),format.raw/*53.40*/("""}"""),format.raw/*53.41*/("""
"""),format.raw/*54.1*/("""function u(n,t)"""),format.raw/*54.16*/("""{"""),format.raw/*54.17*/(""" """),format.raw/*54.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*54.48*/("""}"""),format.raw/*54.49*/("""
"""),format.raw/*55.1*/("""function a(n,t)"""),format.raw/*55.16*/("""{"""),format.raw/*55.17*/(""" """),format.raw/*55.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*55.48*/("""}"""),format.raw/*55.49*/("""
"""),format.raw/*56.1*/("""function c(n)"""),format.raw/*56.14*/("""{"""),format.raw/*56.15*/(""" """),format.raw/*56.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*56.66*/("""}"""),format.raw/*56.67*/("""
"""),format.raw/*57.1*/("""function f(n,t)"""),format.raw/*57.16*/("""{"""),format.raw/*57.17*/(""" """),format.raw/*57.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*57.44*/("""}"""),format.raw/*57.45*/("""
"""),format.raw/*58.1*/("""function s(n,t)"""),format.raw/*58.16*/("""{"""),format.raw/*58.17*/(""" """),format.raw/*58.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*58.47*/("""}"""),format.raw/*58.48*/("""
"""),format.raw/*59.1*/("""function d(n,t)"""),format.raw/*59.16*/("""{"""),format.raw/*59.17*/(""" 
	"""),format.raw/*60.2*/("""if(f(n,t))"""),format.raw/*60.12*/("""{"""),format.raw/*60.13*/(""" """),format.raw/*60.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*60.79*/("""}"""),format.raw/*60.80*/("""
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
"""),format.raw/*62.1*/("""function v(n)"""),format.raw/*62.14*/("""{"""),format.raw/*62.15*/(""" """),format.raw/*62.16*/("""d(n,L),d(n,E) """),format.raw/*62.30*/("""}"""),format.raw/*62.31*/("""
"""),format.raw/*63.1*/("""function l(n,t,e)"""),format.raw/*63.18*/("""{"""),format.raw/*63.19*/(""" """),format.raw/*63.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*63.75*/("""}"""),format.raw/*63.76*/("""
"""),format.raw/*64.1*/("""function g(n)"""),format.raw/*64.14*/("""{"""),format.raw/*64.15*/("""return function(t,r)"""),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*64.105*/("""}"""),format.raw/*64.106*/("""}"""),format.raw/*64.107*/("""function h(n)"""),format.raw/*64.120*/("""{"""),format.raw/*64.121*/("""return function(t,r)"""),format.raw/*64.141*/("""{"""),format.raw/*64.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*64.199*/("""}"""),format.raw/*64.200*/("""}"""),format.raw/*64.201*/("""function m(n,t,r)"""),format.raw/*64.218*/("""{"""),format.raw/*64.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*64.253*/("""{"""),format.raw/*64.254*/("""return"""),format.raw/*64.260*/("""{"""),format.raw/*64.261*/("""str:n,index:t"""),format.raw/*64.274*/("""}"""),format.raw/*64.275*/("""}"""),format.raw/*64.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*64.360*/("""{"""),format.raw/*64.361*/("""return n.index"""),format.raw/*64.375*/("""}"""),format.raw/*64.376*/(""")"""),format.raw/*64.377*/("""}"""),format.raw/*64.378*/("""function p(n,t,r,o)"""),format.raw/*64.397*/("""{"""),format.raw/*64.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*64.442*/("""{"""),format.raw/*64.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*64.488*/("""{"""),format.raw/*64.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*64.508*/("""}"""),format.raw/*64.509*/(""")"""),format.raw/*64.510*/("""}"""),format.raw/*64.511*/("""l(n,o,i)"""),format.raw/*64.519*/("""}"""),format.raw/*64.520*/("""function x(n,t)"""),format.raw/*64.535*/("""{"""),format.raw/*64.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*64.574*/("""{"""),format.raw/*64.575*/("""t.addEventListener("click",function()"""),format.raw/*64.612*/("""{"""),format.raw/*64.613*/("""p(n,r,e,t)"""),format.raw/*64.623*/("""}"""),format.raw/*64.624*/("""),s(t,"tg-sort-header")"""),format.raw/*64.647*/("""}"""),format.raw/*64.648*/(""")"""),format.raw/*64.649*/("""}"""),format.raw/*64.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*64.714*/("""{"""),format.raw/*64.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*64.839*/("""{"""),format.raw/*64.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*64.887*/("""}"""),format.raw/*64.888*/("""x(e,i)"""),format.raw/*64.894*/("""}"""),format.raw/*64.895*/("""}"""),format.raw/*64.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*65.58*/("""{"""),format.raw/*65.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*65.82*/("""}"""),format.raw/*65.83*/(""");
</script>    
"""))
      }
    }
  }

  def render(sampleId:String,userId:String,userName:String): play.twirl.api.HtmlFormat.Appendable = apply(sampleId,userId,userName)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (sampleId,userId,userName) => apply(sampleId,userId,userName)

  def ref: this.type = this

}


}

/**/
object confirmSampleDelete extends confirmSampleDelete_Scope0.confirmSampleDelete
              /*
                  -- GENERATED --
                  DATE: Wed Jan 25 15:46:25 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/confirmSampleDelete.scala.html
                  HASH: 11509d37456ee69cc8993863957b89452d464987
                  MATRIX: 787->1|934->53|962->98|990->100|1046->130|1073->131|1176->207|1204->208|1232->210|1264->216|1291->217|1505->403|1534->404|1562->406|1594->412|1621->413|1854->618|1883->619|1911->621|1950->633|1978->634|2041->670|2069->671|2098->673|2138->685|2167->686|2230->721|2259->722|2288->724|2328->736|2357->737|2438->790|2467->791|2496->793|2536->805|2565->806|2636->849|2665->850|2694->852|2734->864|2763->865|2852->926|2881->927|2910->929|2950->941|2979->942|3025->960|3054->961|3083->963|3145->997|3174->998|3203->999|3255->1023|3284->1024|3346->1058|3375->1059|3404->1060|3457->1084|3487->1085|3534->1103|3564->1104|3594->1105|3639->1121|3669->1122|3728->1152|3758->1153|3789->1155|3963->1300|3993->1301|4058->1337|4088->1338|4119->1340|4169->1361|4199->1362|4316->1450|4346->1451|4377->1453|4441->1488|4471->1489|4528->1517|4558->1518|4589->1520|4664->1566|4694->1567|4723->1569|4994->1813|5023->1821|5052->1822|5083->1825|5113->1833|5143->1834|5313->1977|5342->1985|5538->2154|5567->2162|5771->2338|5800->2339|5858->2369|5887->2370|5917->2373|5992->2420|6021->2421|6052->2425|6120->2465|6149->2466|6181->2471|6250->2513|6278->2514|6306->2515|6410->2592|6438->2593|6468->2596|6505->2606|6533->2607|6562->2609|6605->2624|6634->2625|6664->2628|6748->2684|6777->2685|6809->2690|6891->2745|6919->2746|6949->2749|6981->2754|7009->2755|7038->2757|7079->2770|7108->2771|7137->2772|7203->2810|7232->2811|7261->2813|7302->2826|7331->2827|7384->2852|7413->2853|7442->2855|7485->2870|7514->2871|7543->2872|7601->2902|7630->2903|7659->2905|7702->2920|7731->2921|7760->2922|7818->2952|7847->2953|7876->2955|7917->2968|7946->2969|7975->2970|8053->3020|8082->3021|8111->3023|8154->3038|8183->3039|8212->3040|8266->3066|8295->3067|8324->3069|8367->3084|8396->3085|8425->3086|8482->3115|8511->3116|8540->3118|8583->3133|8612->3134|8643->3138|8681->3148|8710->3149|8739->3150|8832->3215|8861->3216|8890->3218|8918->3219|8947->3221|8988->3234|9017->3235|9046->3236|9088->3250|9117->3251|9146->3253|9191->3270|9220->3271|9249->3272|9332->3327|9361->3328|9390->3330|9431->3343|9460->3344|9508->3364|9537->3365|9635->3434|9665->3435|9695->3436|9737->3449|9767->3450|9816->3470|9846->3471|9932->3528|9962->3529|9992->3530|10038->3547|10068->3548|10131->3582|10161->3583|10196->3589|10226->3590|10268->3603|10298->3604|10328->3605|10441->3689|10471->3690|10514->3704|10544->3705|10574->3706|10604->3707|10652->3726|10682->3727|10755->3771|10785->3772|10859->3817|10889->3818|10937->3837|10967->3838|10997->3839|11027->3840|11064->3848|11094->3849|11138->3864|11168->3865|11235->3903|11265->3904|11331->3941|11361->3942|11400->3952|11430->3953|11482->3976|11512->3977|11542->3978|11572->3979|11665->4043|11695->4044|11848->4168|11878->4169|11954->4216|11984->4217|12019->4223|12049->4224|12079->4225|12177->4295|12206->4296|12257->4319|12286->4320
                  LINES: 27->1|32->1|33->4|34->5|35->6|35->6|35->6|35->6|36->7|36->7|36->7|36->7|36->7|37->8|37->8|37->8|37->8|37->8|38->9|38->9|38->9|38->9|38->9|39->10|39->10|39->10|39->10|39->10|40->11|40->11|40->11|40->11|40->11|41->12|41->12|41->12|41->12|41->12|42->13|42->13|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|44->15|45->16|49->20|49->20|49->20|49->20|49->20|49->20|52->23|52->23|55->26|55->26|61->32|61->32|62->33|62->33|63->34|63->34|63->34|64->35|65->36|65->36|66->37|67->38|67->38|67->38|69->40|69->40|70->41|71->42|71->42|72->43|72->43|72->43|73->44|75->46|75->46|76->47|78->49|78->49|79->50|80->51|80->51|81->52|81->52|81->52|81->52|81->52|81->52|82->53|82->53|82->53|82->53|82->53|83->54|83->54|83->54|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|85->56|85->56|85->56|85->56|85->56|85->56|86->57|86->57|86->57|86->57|86->57|86->57|87->58|87->58|87->58|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|89->60|89->60|89->60|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|93->64|94->65|94->65|94->65|94->65
                  -- GENERATED --
              */
          