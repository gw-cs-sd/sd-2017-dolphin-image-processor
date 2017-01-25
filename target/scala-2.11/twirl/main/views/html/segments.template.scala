
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object segments_Scope0 {
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

class segments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,DBSample,String,String,String,List[DBSegment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sampleId: String, userName: String, sample: DBSample, imagePath: String, displayWidth: String, displayHeight: String, segments: List[DBSegment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.147*/("""

"""),format.raw/*3.1*/("""<style type="text/css">
.tg  """),format.raw/*4.6*/("""{"""),format.raw/*4.7*/("""border-collapse:collapse;border-spacing:0;border-color:#999;margin:0px auto;"""),format.raw/*4.83*/("""}"""),format.raw/*4.84*/("""
"""),format.raw/*5.1*/(""".tg td"""),format.raw/*5.7*/("""{"""),format.raw/*5.8*/("""font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#444;background-color:#F7FDFA;"""),format.raw/*5.194*/("""}"""),format.raw/*5.195*/("""
"""),format.raw/*6.1*/(""".tg th"""),format.raw/*6.7*/("""{"""),format.raw/*6.8*/("""font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#fff;background-color:#26ADE4;"""),format.raw/*6.213*/("""}"""),format.raw/*6.214*/("""
"""),format.raw/*7.1*/(""".tg .tg-baqh"""),format.raw/*7.13*/("""{"""),format.raw/*7.14*/("""text-align:center;vertical-align:top"""),format.raw/*7.50*/("""}"""),format.raw/*7.51*/("""
"""),format.raw/*8.1*/(""".tg .tg-9hbo"""),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""font-weight:bold;vertical-align:top"""),format.raw/*8.49*/("""}"""),format.raw/*8.50*/("""
"""),format.raw/*9.1*/(""".tg .tg-amwm"""),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""font-weight:bold;text-align:center;vertical-align:top"""),format.raw/*9.67*/("""}"""),format.raw/*9.68*/("""
"""),format.raw/*10.1*/(""".tg .tg-6k2t"""),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""background-color:#D2E4FC;vertical-align:top"""),format.raw/*10.57*/("""}"""),format.raw/*10.58*/("""
"""),format.raw/*11.1*/(""".tg .tg-j0tj"""),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""background-color:#D2E4FC;text-align:center;vertical-align:top"""),format.raw/*11.75*/("""}"""),format.raw/*11.76*/("""
"""),format.raw/*12.1*/(""".tg .tg-yw4l"""),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""vertical-align:top"""),format.raw/*12.32*/("""}"""),format.raw/*12.33*/("""
"""),format.raw/*13.1*/("""th.tg-sort-header::-moz-selection """),format.raw/*13.35*/("""{"""),format.raw/*13.36*/(""" """),format.raw/*13.37*/("""background:transparent; """),format.raw/*13.61*/("""}"""),format.raw/*13.62*/("""th.tg-sort-header::selection      """),format.raw/*13.96*/("""{"""),format.raw/*13.97*/(""" """),format.raw/*13.98*/("""background:transparent; """),format.raw/*13.122*/("""}"""),format.raw/*13.123*/("""th.tg-sort-header """),format.raw/*13.141*/("""{"""),format.raw/*13.142*/(""" """),format.raw/*13.143*/("""cursor:pointer; """),format.raw/*13.159*/("""}"""),format.raw/*13.160*/("""table th.tg-sort-header:after """),format.raw/*13.190*/("""{"""),format.raw/*13.191*/("""  """),format.raw/*13.193*/("""content:'';  float:right;  margin-top:7px;  border-width:0 4px 4px;  border-style:solid;  border-color:#404040 transparent;  visibility:hidden;  """),format.raw/*13.338*/("""}"""),format.raw/*13.339*/("""table th.tg-sort-header:hover:after """),format.raw/*13.375*/("""{"""),format.raw/*13.376*/("""  """),format.raw/*13.378*/("""visibility:visible;  """),format.raw/*13.399*/("""}"""),format.raw/*13.400*/("""table th.tg-sort-desc:after,table th.tg-sort-asc:after,table th.tg-sort-asc:hover:after """),format.raw/*13.488*/("""{"""),format.raw/*13.489*/("""  """),format.raw/*13.491*/("""visibility:visible;  opacity:0.4;  """),format.raw/*13.526*/("""}"""),format.raw/*13.527*/("""table th.tg-sort-desc:after """),format.raw/*13.555*/("""{"""),format.raw/*13.556*/("""  """),format.raw/*13.558*/("""border-bottom:none;  border-width:4px 4px 0;  """),format.raw/*13.604*/("""}"""),format.raw/*13.605*/("""
"""),format.raw/*14.1*/("""</style>


<table id="tg-cFHod" class="tg">
	<tr><td class="tg-j0tj" style="text-align: center;">sampleId """),_display_(/*18.64*/sampleId),format.raw/*18.72*/(""" """),format.raw/*18.73*/(""": """),_display_(/*18.76*/userName),format.raw/*18.84*/("""</td></tr>
    <tr><td class="tg-baqh" style="text-align: center;">
    	<img src="assets/"""),_display_(/*20.24*/imagePath),format.raw/*20.33*/("""" height=""""),_display_(/*20.44*/displayHeight),format.raw/*20.57*/("""" width=""""),_display_(/*20.67*/displayWidth),format.raw/*20.79*/("""" alt=""""),_display_(/*20.87*/sample/*20.93*/.getName()),format.raw/*20.103*/("""">
    	</td>
    </tr>
    <tr>
    <td class="tg-baqh" style="text-align: center;">
    <form action="backToSample" method='POST' enctype="multipart/form-data" id="backToSampleForm">
    <button type="submit" form="backToSampleForm" value=""""),_display_(/*26.59*/sample/*26.65*/.getUserId()),format.raw/*26.77*/(""""  name="backUserId" >Back</button>
    </form>
    <form action="viewExamination" method='POST' enctype="multipart/form-data" id="viewExaminationForm">
    <button type="submit" form="viewExaminationForm" value=""""),_display_(/*29.62*/sampleId),format.raw/*29.70*/(""""  name="sampleId" >Examine</button>
    <input type="hidden" value=""""),_display_(/*30.34*/imagePath),format.raw/*30.43*/("""" name="imagePath">
    </form>
    </td>
    </tr>
</table>
<table id="tg-cFHod" class="tg">
    <tr>
    	<th class="tg-amwm">Label</th>
    	<th class="tg-9hbo">Id</th>
    	<th class="tg-amwm">Area</th>
    	<th class="tg-amwm">Height</th>
    	<th class="tg-amwm">Width</th>
    	<th class="tg-amwm">Perimeter</th>
    </tr>

	"""),_display_(/*45.3*/for((segment,i) <- segments.zipWithIndex) yield /*45.44*/ {_display_(Seq[Any](format.raw/*45.46*/("""
    	"""),format.raw/*46.6*/("""<tr>
    		<td """),_display_(/*47.12*/if(i % 2==0)/*47.24*/ {_display_(Seq[Any](format.raw/*47.26*/("""class="tg-j0tj"""")))}/*47.43*/else/*47.48*/{_display_(Seq[Any](format.raw/*47.49*/("""class="tg-baqh"""")))}),format.raw/*47.65*/(""">"""),_display_(/*47.67*/segment/*47.74*/.getLabel()),format.raw/*47.85*/("""</td>
    		<td """),_display_(/*48.12*/if(i % 2==0)/*48.24*/ {_display_(Seq[Any](format.raw/*48.26*/("""class="tg-6k2t"""")))}/*48.43*/else/*48.48*/{_display_(Seq[Any](format.raw/*48.49*/("""class="tg-yw4l"""")))}),format.raw/*48.65*/(""">"""),_display_(/*48.67*/segment/*48.74*/.getSegmentId()),format.raw/*48.89*/("""</td>
    		<td """),_display_(/*49.12*/if(i % 2==0)/*49.24*/ {_display_(Seq[Any](format.raw/*49.26*/("""class="tg-j0tj"""")))}/*49.43*/else/*49.48*/{_display_(Seq[Any](format.raw/*49.49*/("""class="tg-baqh"""")))}),format.raw/*49.65*/(""">"""),_display_(/*49.67*/segment/*49.74*/.getArea()),format.raw/*49.84*/("""</td>
    		<td """),_display_(/*50.12*/if(i % 2==0)/*50.24*/ {_display_(Seq[Any](format.raw/*50.26*/("""class="tg-j0tj"""")))}/*50.43*/else/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""class="tg-baqh"""")))}),format.raw/*50.65*/(""">"""),_display_(/*50.67*/segment/*50.74*/.getHeight()),format.raw/*50.86*/("""</td>
     		<td """),_display_(/*51.13*/if(i % 2==0)/*51.25*/ {_display_(Seq[Any](format.raw/*51.27*/("""class="tg-j0tj"""")))}/*51.44*/else/*51.49*/{_display_(Seq[Any](format.raw/*51.50*/("""class="tg-baqh"""")))}),format.raw/*51.66*/(""">"""),_display_(/*51.68*/segment/*51.75*/.getWidth()),format.raw/*51.86*/("""</td>
     		<td """),_display_(/*52.13*/if(i % 2==0)/*52.25*/ {_display_(Seq[Any](format.raw/*52.27*/("""class="tg-j0tj"""")))}/*52.44*/else/*52.49*/{_display_(Seq[Any](format.raw/*52.50*/("""class="tg-baqh"""")))}),format.raw/*52.66*/(""">"""),_display_(/*52.68*/segment/*52.75*/.getPerimeter()),format.raw/*52.90*/("""</td>
    	</tr>
	""")))}),format.raw/*54.3*/("""
"""),format.raw/*55.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*57.50*/("""{"""),format.raw/*57.51*/(""""use strict";
function r(n,t)"""),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
	"""),format.raw/*59.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*59.49*/("""{"""),format.raw/*59.50*/("""
		"""),format.raw/*60.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*61.28*/("""{"""),format.raw/*61.29*/("""
			"""),format.raw/*62.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*63.3*/("""}"""),format.raw/*63.4*/(""" """),format.raw/*63.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/("""
	"""),format.raw/*66.2*/("""return e
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""
"""),format.raw/*68.1*/("""function e(n,t)"""),format.raw/*68.16*/("""{"""),format.raw/*68.17*/("""
	"""),format.raw/*69.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*71.14*/("""{"""),format.raw/*71.15*/("""
			"""),format.raw/*72.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
	"""),format.raw/*75.2*/("""),e
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""
"""),format.raw/*77.1*/("""function o(n)"""),format.raw/*77.14*/("""{"""),format.raw/*77.15*/(""" """),format.raw/*77.16*/("""return n.textContent||n.innerText||"" """),format.raw/*77.54*/("""}"""),format.raw/*77.55*/("""
"""),format.raw/*78.1*/("""function i(n)"""),format.raw/*78.14*/("""{"""),format.raw/*78.15*/("""i return n.innerHTML||"" """),format.raw/*78.40*/("""}"""),format.raw/*78.41*/("""
"""),format.raw/*79.1*/("""function u(n,t)"""),format.raw/*79.16*/("""{"""),format.raw/*79.17*/(""" """),format.raw/*79.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*79.48*/("""}"""),format.raw/*79.49*/("""
"""),format.raw/*80.1*/("""function a(n,t)"""),format.raw/*80.16*/("""{"""),format.raw/*80.17*/(""" """),format.raw/*80.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*80.48*/("""}"""),format.raw/*80.49*/("""
"""),format.raw/*81.1*/("""function c(n)"""),format.raw/*81.14*/("""{"""),format.raw/*81.15*/(""" """),format.raw/*81.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*81.66*/("""}"""),format.raw/*81.67*/("""
"""),format.raw/*82.1*/("""function f(n,t)"""),format.raw/*82.16*/("""{"""),format.raw/*82.17*/(""" """),format.raw/*82.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*82.44*/("""}"""),format.raw/*82.45*/("""
"""),format.raw/*83.1*/("""function s(n,t)"""),format.raw/*83.16*/("""{"""),format.raw/*83.17*/(""" """),format.raw/*83.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*83.47*/("""}"""),format.raw/*83.48*/("""
"""),format.raw/*84.1*/("""function d(n,t)"""),format.raw/*84.16*/("""{"""),format.raw/*84.17*/(""" 
	"""),format.raw/*85.2*/("""if(f(n,t))"""),format.raw/*85.12*/("""{"""),format.raw/*85.13*/(""" """),format.raw/*85.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*85.79*/("""}"""),format.raw/*85.80*/("""
"""),format.raw/*86.1*/("""}"""),format.raw/*86.2*/("""
"""),format.raw/*87.1*/("""function v(n)"""),format.raw/*87.14*/("""{"""),format.raw/*87.15*/(""" """),format.raw/*87.16*/("""d(n,L),d(n,E) """),format.raw/*87.30*/("""}"""),format.raw/*87.31*/("""
"""),format.raw/*88.1*/("""function l(n,t,e)"""),format.raw/*88.18*/("""{"""),format.raw/*88.19*/(""" """),format.raw/*88.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*88.75*/("""}"""),format.raw/*88.76*/("""
"""),format.raw/*89.1*/("""function g(n)"""),format.raw/*89.14*/("""{"""),format.raw/*89.15*/("""return function(t,r)"""),format.raw/*89.35*/("""{"""),format.raw/*89.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*89.105*/("""}"""),format.raw/*89.106*/("""}"""),format.raw/*89.107*/("""function h(n)"""),format.raw/*89.120*/("""{"""),format.raw/*89.121*/("""return function(t,r)"""),format.raw/*89.141*/("""{"""),format.raw/*89.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*89.199*/("""}"""),format.raw/*89.200*/("""}"""),format.raw/*89.201*/("""function m(n,t,r)"""),format.raw/*89.218*/("""{"""),format.raw/*89.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*89.253*/("""{"""),format.raw/*89.254*/("""return"""),format.raw/*89.260*/("""{"""),format.raw/*89.261*/("""str:n,index:t"""),format.raw/*89.274*/("""}"""),format.raw/*89.275*/("""}"""),format.raw/*89.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*89.360*/("""{"""),format.raw/*89.361*/("""return n.index"""),format.raw/*89.375*/("""}"""),format.raw/*89.376*/(""")"""),format.raw/*89.377*/("""}"""),format.raw/*89.378*/("""function p(n,t,r,o)"""),format.raw/*89.397*/("""{"""),format.raw/*89.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*89.442*/("""{"""),format.raw/*89.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*89.488*/("""{"""),format.raw/*89.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*89.508*/("""}"""),format.raw/*89.509*/(""")"""),format.raw/*89.510*/("""}"""),format.raw/*89.511*/("""l(n,o,i)"""),format.raw/*89.519*/("""}"""),format.raw/*89.520*/("""function x(n,t)"""),format.raw/*89.535*/("""{"""),format.raw/*89.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*89.574*/("""{"""),format.raw/*89.575*/("""t.addEventListener("click",function()"""),format.raw/*89.612*/("""{"""),format.raw/*89.613*/("""p(n,r,e,t)"""),format.raw/*89.623*/("""}"""),format.raw/*89.624*/("""),s(t,"tg-sort-header")"""),format.raw/*89.647*/("""}"""),format.raw/*89.648*/(""")"""),format.raw/*89.649*/("""}"""),format.raw/*89.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*89.714*/("""{"""),format.raw/*89.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*89.839*/("""{"""),format.raw/*89.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*89.887*/("""}"""),format.raw/*89.888*/("""x(e,i)"""),format.raw/*89.894*/("""}"""),format.raw/*89.895*/("""}"""),format.raw/*89.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*90.58*/("""{"""),format.raw/*90.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*90.82*/("""}"""),format.raw/*90.83*/(""");
</script>    
"""))
      }
    }
  }

  def render(sampleId:String,userName:String,sample:DBSample,imagePath:String,displayWidth:String,displayHeight:String,segments:List[DBSegment]): play.twirl.api.HtmlFormat.Appendable = apply(sampleId,userName,sample,imagePath,displayWidth,displayHeight,segments)

  def f:((String,String,DBSample,String,String,String,List[DBSegment]) => play.twirl.api.HtmlFormat.Appendable) = (sampleId,userName,sample,imagePath,displayWidth,displayHeight,segments) => apply(sampleId,userName,sample,imagePath,displayWidth,displayHeight,segments)

  def ref: this.type = this

}


}

/**/
object segments extends segments_Scope0.segments
              /*
                  -- GENERATED --
                  DATE: Wed Jan 25 15:46:26 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: 52470220099c839ad710383db2e6ffc152935483
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|5995->2406|6024->2414|6122->2485|6152->2494|6526->2842|6583->2883|6623->2885|6657->2892|6701->2909|6722->2921|6762->2923|6797->2940|6810->2945|6849->2946|6896->2962|6925->2964|6941->2971|6973->2982|7018->3000|7039->3012|7079->3014|7114->3031|7127->3036|7166->3037|7213->3053|7242->3055|7258->3062|7294->3077|7339->3095|7360->3107|7400->3109|7435->3126|7448->3131|7487->3132|7534->3148|7563->3150|7579->3157|7610->3167|7655->3185|7676->3197|7716->3199|7751->3216|7764->3221|7803->3222|7850->3238|7879->3240|7895->3247|7928->3259|7974->3278|7995->3290|8035->3292|8070->3309|8083->3314|8122->3315|8169->3331|8198->3333|8214->3340|8246->3351|8292->3370|8313->3382|8353->3384|8388->3401|8401->3406|8440->3407|8487->3423|8516->3425|8532->3432|8568->3447|8619->3468|8648->3470|8784->3578|8813->3579|8871->3609|8900->3610|8930->3613|9005->3660|9034->3661|9065->3665|9133->3705|9162->3706|9194->3711|9263->3753|9291->3754|9319->3755|9423->3832|9451->3833|9481->3836|9518->3846|9546->3847|9575->3849|9618->3864|9647->3865|9677->3868|9761->3924|9790->3925|9822->3930|9904->3985|9932->3986|9962->3989|9994->3994|10022->3995|10051->3997|10092->4010|10121->4011|10150->4012|10216->4050|10245->4051|10274->4053|10315->4066|10344->4067|10397->4092|10426->4093|10455->4095|10498->4110|10527->4111|10556->4112|10614->4142|10643->4143|10672->4145|10715->4160|10744->4161|10773->4162|10831->4192|10860->4193|10889->4195|10930->4208|10959->4209|10988->4210|11066->4260|11095->4261|11124->4263|11167->4278|11196->4279|11225->4280|11279->4306|11308->4307|11337->4309|11380->4324|11409->4325|11438->4326|11495->4355|11524->4356|11553->4358|11596->4373|11625->4374|11656->4378|11694->4388|11723->4389|11752->4390|11845->4455|11874->4456|11903->4458|11931->4459|11960->4461|12001->4474|12030->4475|12059->4476|12101->4490|12130->4491|12159->4493|12204->4510|12233->4511|12262->4512|12345->4567|12374->4568|12403->4570|12444->4583|12473->4584|12521->4604|12550->4605|12648->4674|12678->4675|12708->4676|12750->4689|12780->4690|12829->4710|12859->4711|12945->4768|12975->4769|13005->4770|13051->4787|13081->4788|13144->4822|13174->4823|13209->4829|13239->4830|13281->4843|13311->4844|13341->4845|13454->4929|13484->4930|13527->4944|13557->4945|13587->4946|13617->4947|13665->4966|13695->4967|13768->5011|13798->5012|13872->5057|13902->5058|13950->5077|13980->5078|14010->5079|14040->5080|14077->5088|14107->5089|14151->5104|14181->5105|14248->5143|14278->5144|14344->5181|14374->5182|14413->5192|14443->5193|14495->5216|14525->5217|14555->5218|14585->5219|14678->5283|14708->5284|14861->5408|14891->5409|14967->5456|14997->5457|15032->5463|15062->5464|15092->5465|15190->5535|15219->5536|15270->5559|15299->5560
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|60->29|60->29|61->30|61->30|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|85->54|86->55|88->57|88->57|89->58|89->58|90->59|90->59|90->59|91->60|92->61|92->61|93->62|94->63|94->63|94->63|96->65|96->65|97->66|98->67|98->67|99->68|99->68|99->68|100->69|102->71|102->71|103->72|105->74|105->74|106->75|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90
                  -- GENERATED --
              */
          