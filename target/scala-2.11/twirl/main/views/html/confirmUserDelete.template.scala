
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirmUserDelete_Scope0 {
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

class confirmUserDelete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userId: String, userName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*2.1*/("""<style type="text/css">
.tg  """),format.raw/*3.6*/("""{"""),format.raw/*3.7*/("""border-collapse:collapse;border-spacing:0;border-color:#999;margin:0px auto;"""),format.raw/*3.83*/("""}"""),format.raw/*3.84*/("""
"""),format.raw/*4.1*/(""".tg td"""),format.raw/*4.7*/("""{"""),format.raw/*4.8*/("""font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#444;background-color:#F7FDFA;"""),format.raw/*4.194*/("""}"""),format.raw/*4.195*/("""
"""),format.raw/*5.1*/(""".tg th"""),format.raw/*5.7*/("""{"""),format.raw/*5.8*/("""font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#fff;background-color:#26ADE4;"""),format.raw/*5.213*/("""}"""),format.raw/*5.214*/("""
"""),format.raw/*6.1*/(""".tg .tg-baqh"""),format.raw/*6.13*/("""{"""),format.raw/*6.14*/("""text-align:center;vertical-align:top"""),format.raw/*6.50*/("""}"""),format.raw/*6.51*/("""
"""),format.raw/*7.1*/(""".tg .tg-9hbo"""),format.raw/*7.13*/("""{"""),format.raw/*7.14*/("""font-weight:bold;vertical-align:top"""),format.raw/*7.49*/("""}"""),format.raw/*7.50*/("""
"""),format.raw/*8.1*/(""".tg .tg-amwm"""),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""font-weight:bold;text-align:center;vertical-align:top"""),format.raw/*8.67*/("""}"""),format.raw/*8.68*/("""
"""),format.raw/*9.1*/(""".tg .tg-6k2t"""),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""background-color:#D2E4FC;vertical-align:top"""),format.raw/*9.57*/("""}"""),format.raw/*9.58*/("""
"""),format.raw/*10.1*/(""".tg .tg-j0tj"""),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""background-color:#D2E4FC;text-align:center;vertical-align:top"""),format.raw/*10.75*/("""}"""),format.raw/*10.76*/("""
"""),format.raw/*11.1*/(""".tg .tg-yw4l"""),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""vertical-align:top"""),format.raw/*11.32*/("""}"""),format.raw/*11.33*/("""
"""),format.raw/*12.1*/("""th.tg-sort-header::-moz-selection """),format.raw/*12.35*/("""{"""),format.raw/*12.36*/(""" """),format.raw/*12.37*/("""background:transparent; """),format.raw/*12.61*/("""}"""),format.raw/*12.62*/("""th.tg-sort-header::selection      """),format.raw/*12.96*/("""{"""),format.raw/*12.97*/(""" """),format.raw/*12.98*/("""background:transparent; """),format.raw/*12.122*/("""}"""),format.raw/*12.123*/("""th.tg-sort-header """),format.raw/*12.141*/("""{"""),format.raw/*12.142*/(""" """),format.raw/*12.143*/("""cursor:pointer; """),format.raw/*12.159*/("""}"""),format.raw/*12.160*/("""table th.tg-sort-header:after """),format.raw/*12.190*/("""{"""),format.raw/*12.191*/("""  """),format.raw/*12.193*/("""content:'';  float:right;  margin-top:7px;  border-width:0 4px 4px;  border-style:solid;  border-color:#404040 transparent;  visibility:hidden;  """),format.raw/*12.338*/("""}"""),format.raw/*12.339*/("""table th.tg-sort-header:hover:after """),format.raw/*12.375*/("""{"""),format.raw/*12.376*/("""  """),format.raw/*12.378*/("""visibility:visible;  """),format.raw/*12.399*/("""}"""),format.raw/*12.400*/("""table th.tg-sort-desc:after,table th.tg-sort-asc:after,table th.tg-sort-asc:hover:after """),format.raw/*12.488*/("""{"""),format.raw/*12.489*/("""  """),format.raw/*12.491*/("""visibility:visible;  opacity:0.4;  """),format.raw/*12.526*/("""}"""),format.raw/*12.527*/("""table th.tg-sort-desc:after """),format.raw/*12.555*/("""{"""),format.raw/*12.556*/("""  """),format.raw/*12.558*/("""border-bottom:none;  border-width:4px 4px 0;  """),format.raw/*12.604*/("""}"""),format.raw/*12.605*/("""
"""),format.raw/*13.1*/("""</style>

<form action="confirm" method='POST' enctype="multipart/form-data" id="ConfirmDeleteUserForm">
<table id="tg-cFHod" class="tg">
	<tr><td class="tg-j0tj" colspan="2" style="text-align: center;">OK to Delete userId """),_display_(/*17.87*/userId),format.raw/*17.93*/(""" """),format.raw/*17.94*/(""": """),_display_(/*17.97*/userName),format.raw/*17.105*/(""" """),format.raw/*17.106*/("""?</td></tr>
    <tr>
    <td class="tg-baqh" style="text-align: center;">
    <button type="submit" form="ConfirmDeleteUserForm" value=""""),_display_(/*20.64*/userId),format.raw/*20.70*/(""""  name="deleteUserId" >OK</button>
    </td>
    <td class="tg-baqh" style="text-align: center;">
    <input type="hidden" name="newUserName">
    <button type="submit" form="ConfirmDeleteUserForm" value=""""),_display_(/*24.64*/userId),format.raw/*24.70*/(""""  name="userId" >Cancel</button>
    </td>
    </tr>
</table>
</form>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*30.50*/("""{"""),format.raw/*30.51*/(""""use strict";
function r(n,t)"""),format.raw/*31.16*/("""{"""),format.raw/*31.17*/("""
	"""),format.raw/*32.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*32.49*/("""{"""),format.raw/*32.50*/("""
		"""),format.raw/*33.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
			"""),format.raw/*35.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""" """),format.raw/*36.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*38.2*/("""}"""),format.raw/*38.3*/("""
	"""),format.raw/*39.2*/("""return e
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/("""function e(n,t)"""),format.raw/*41.16*/("""{"""),format.raw/*41.17*/("""
	"""),format.raw/*42.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*44.14*/("""{"""),format.raw/*44.15*/("""
			"""),format.raw/*45.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
	"""),format.raw/*48.2*/("""),e
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""
"""),format.raw/*50.1*/("""function o(n)"""),format.raw/*50.14*/("""{"""),format.raw/*50.15*/(""" """),format.raw/*50.16*/("""return n.textContent||n.innerText||"" """),format.raw/*50.54*/("""}"""),format.raw/*50.55*/("""
"""),format.raw/*51.1*/("""function i(n)"""),format.raw/*51.14*/("""{"""),format.raw/*51.15*/("""i return n.innerHTML||"" """),format.raw/*51.40*/("""}"""),format.raw/*51.41*/("""
"""),format.raw/*52.1*/("""function u(n,t)"""),format.raw/*52.16*/("""{"""),format.raw/*52.17*/(""" """),format.raw/*52.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*52.48*/("""}"""),format.raw/*52.49*/("""
"""),format.raw/*53.1*/("""function a(n,t)"""),format.raw/*53.16*/("""{"""),format.raw/*53.17*/(""" """),format.raw/*53.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*53.48*/("""}"""),format.raw/*53.49*/("""
"""),format.raw/*54.1*/("""function c(n)"""),format.raw/*54.14*/("""{"""),format.raw/*54.15*/(""" """),format.raw/*54.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*54.66*/("""}"""),format.raw/*54.67*/("""
"""),format.raw/*55.1*/("""function f(n,t)"""),format.raw/*55.16*/("""{"""),format.raw/*55.17*/(""" """),format.raw/*55.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*55.44*/("""}"""),format.raw/*55.45*/("""
"""),format.raw/*56.1*/("""function s(n,t)"""),format.raw/*56.16*/("""{"""),format.raw/*56.17*/(""" """),format.raw/*56.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*56.47*/("""}"""),format.raw/*56.48*/("""
"""),format.raw/*57.1*/("""function d(n,t)"""),format.raw/*57.16*/("""{"""),format.raw/*57.17*/(""" 
	"""),format.raw/*58.2*/("""if(f(n,t))"""),format.raw/*58.12*/("""{"""),format.raw/*58.13*/(""" """),format.raw/*58.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*58.79*/("""}"""),format.raw/*58.80*/("""
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""
"""),format.raw/*60.1*/("""function v(n)"""),format.raw/*60.14*/("""{"""),format.raw/*60.15*/(""" """),format.raw/*60.16*/("""d(n,L),d(n,E) """),format.raw/*60.30*/("""}"""),format.raw/*60.31*/("""
"""),format.raw/*61.1*/("""function l(n,t,e)"""),format.raw/*61.18*/("""{"""),format.raw/*61.19*/(""" """),format.raw/*61.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*61.75*/("""}"""),format.raw/*61.76*/("""
"""),format.raw/*62.1*/("""function g(n)"""),format.raw/*62.14*/("""{"""),format.raw/*62.15*/("""return function(t,r)"""),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*62.105*/("""}"""),format.raw/*62.106*/("""}"""),format.raw/*62.107*/("""function h(n)"""),format.raw/*62.120*/("""{"""),format.raw/*62.121*/("""return function(t,r)"""),format.raw/*62.141*/("""{"""),format.raw/*62.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*62.199*/("""}"""),format.raw/*62.200*/("""}"""),format.raw/*62.201*/("""function m(n,t,r)"""),format.raw/*62.218*/("""{"""),format.raw/*62.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*62.253*/("""{"""),format.raw/*62.254*/("""return"""),format.raw/*62.260*/("""{"""),format.raw/*62.261*/("""str:n,index:t"""),format.raw/*62.274*/("""}"""),format.raw/*62.275*/("""}"""),format.raw/*62.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*62.360*/("""{"""),format.raw/*62.361*/("""return n.index"""),format.raw/*62.375*/("""}"""),format.raw/*62.376*/(""")"""),format.raw/*62.377*/("""}"""),format.raw/*62.378*/("""function p(n,t,r,o)"""),format.raw/*62.397*/("""{"""),format.raw/*62.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*62.442*/("""{"""),format.raw/*62.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*62.488*/("""{"""),format.raw/*62.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*62.508*/("""}"""),format.raw/*62.509*/(""")"""),format.raw/*62.510*/("""}"""),format.raw/*62.511*/("""l(n,o,i)"""),format.raw/*62.519*/("""}"""),format.raw/*62.520*/("""function x(n,t)"""),format.raw/*62.535*/("""{"""),format.raw/*62.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*62.574*/("""{"""),format.raw/*62.575*/("""t.addEventListener("click",function()"""),format.raw/*62.612*/("""{"""),format.raw/*62.613*/("""p(n,r,e,t)"""),format.raw/*62.623*/("""}"""),format.raw/*62.624*/("""),s(t,"tg-sort-header")"""),format.raw/*62.647*/("""}"""),format.raw/*62.648*/(""")"""),format.raw/*62.649*/("""}"""),format.raw/*62.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*62.714*/("""{"""),format.raw/*62.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*62.839*/("""{"""),format.raw/*62.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*62.887*/("""}"""),format.raw/*62.888*/("""x(e,i)"""),format.raw/*62.894*/("""}"""),format.raw/*62.895*/("""}"""),format.raw/*62.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*63.58*/("""{"""),format.raw/*63.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*63.82*/("""}"""),format.raw/*63.83*/(""");
</script>    
"""))
      }
    }
  }

  def render(userId:String,userName:String): play.twirl.api.HtmlFormat.Appendable = apply(userId,userName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (userId,userName) => apply(userId,userName)

  def ref: this.type = this

}


}

/**/
object confirmUserDelete extends confirmUserDelete_Scope0.confirmUserDelete
              /*
                  -- GENERATED --
                  DATE: Fri Feb 17 23:23:48 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/confirmUserDelete.scala.html
                  HASH: f30b73106031ee3de998f6dd220e4528b5525d41
                  MATRIX: 776->1|905->35|933->37|989->67|1016->68|1119->144|1147->145|1175->147|1207->153|1234->154|1448->340|1477->341|1505->343|1537->349|1564->350|1797->555|1826->556|1854->558|1893->570|1921->571|1984->607|2012->608|2040->610|2079->622|2107->623|2169->658|2197->659|2225->661|2264->673|2292->674|2372->727|2400->728|2428->730|2467->742|2495->743|2565->786|2593->787|2622->789|2662->801|2691->802|2780->863|2809->864|2838->866|2878->878|2907->879|2953->897|2982->898|3011->900|3073->934|3102->935|3131->936|3183->960|3212->961|3274->995|3303->996|3332->997|3385->1021|3415->1022|3462->1040|3492->1041|3522->1042|3567->1058|3597->1059|3656->1089|3686->1090|3717->1092|3891->1237|3921->1238|3986->1274|4016->1275|4047->1277|4097->1298|4127->1299|4244->1387|4274->1388|4305->1390|4369->1425|4399->1426|4456->1454|4486->1455|4517->1457|4592->1503|4622->1504|4651->1506|4906->1734|4933->1740|4962->1741|4992->1744|5022->1752|5052->1753|5219->1893|5246->1899|5484->2110|5511->2116|5713->2290|5742->2291|5800->2321|5829->2322|5859->2325|5934->2372|5963->2373|5994->2377|6062->2417|6091->2418|6123->2423|6192->2465|6220->2466|6248->2467|6352->2544|6380->2545|6410->2548|6447->2558|6475->2559|6504->2561|6547->2576|6576->2577|6606->2580|6690->2636|6719->2637|6751->2642|6833->2697|6861->2698|6891->2701|6923->2706|6951->2707|6980->2709|7021->2722|7050->2723|7079->2724|7145->2762|7174->2763|7203->2765|7244->2778|7273->2779|7326->2804|7355->2805|7384->2807|7427->2822|7456->2823|7485->2824|7543->2854|7572->2855|7601->2857|7644->2872|7673->2873|7702->2874|7760->2904|7789->2905|7818->2907|7859->2920|7888->2921|7917->2922|7995->2972|8024->2973|8053->2975|8096->2990|8125->2991|8154->2992|8208->3018|8237->3019|8266->3021|8309->3036|8338->3037|8367->3038|8424->3067|8453->3068|8482->3070|8525->3085|8554->3086|8585->3090|8623->3100|8652->3101|8681->3102|8774->3167|8803->3168|8832->3170|8860->3171|8889->3173|8930->3186|8959->3187|8988->3188|9030->3202|9059->3203|9088->3205|9133->3222|9162->3223|9191->3224|9274->3279|9303->3280|9332->3282|9373->3295|9402->3296|9450->3316|9479->3317|9577->3386|9607->3387|9637->3388|9679->3401|9709->3402|9758->3422|9788->3423|9874->3480|9904->3481|9934->3482|9980->3499|10010->3500|10073->3534|10103->3535|10138->3541|10168->3542|10210->3555|10240->3556|10270->3557|10383->3641|10413->3642|10456->3656|10486->3657|10516->3658|10546->3659|10594->3678|10624->3679|10697->3723|10727->3724|10801->3769|10831->3770|10879->3789|10909->3790|10939->3791|10969->3792|11006->3800|11036->3801|11080->3816|11110->3817|11177->3855|11207->3856|11273->3893|11303->3894|11342->3904|11372->3905|11424->3928|11454->3929|11484->3930|11514->3931|11607->3995|11637->3996|11790->4120|11820->4121|11896->4168|11926->4169|11961->4175|11991->4176|12021->4177|12119->4247|12148->4248|12199->4271|12228->4272
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|48->17|48->17|48->17|48->17|48->17|48->17|51->20|51->20|55->24|55->24|61->30|61->30|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|67->36|67->36|67->36|69->38|69->38|70->39|71->40|71->40|72->41|72->41|72->41|73->42|75->44|75->44|76->45|78->47|78->47|79->48|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63
                  -- GENERATED --
              */
          