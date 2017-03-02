
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
    	<th class="tg-amwm">Blood Status</th>
    </tr>

	"""),_display_(/*46.3*/for((segment,i) <- segments.zipWithIndex) yield /*46.44*/ {_display_(Seq[Any](format.raw/*46.46*/("""
    	"""),format.raw/*47.6*/("""<tr>
    		<td """),_display_(/*48.12*/if(i % 2==0)/*48.24*/ {_display_(Seq[Any](format.raw/*48.26*/("""class="tg-j0tj"""")))}/*48.43*/else/*48.48*/{_display_(Seq[Any](format.raw/*48.49*/("""class="tg-baqh"""")))}),format.raw/*48.65*/(""">"""),_display_(/*48.67*/segment/*48.74*/.getLabel()),format.raw/*48.85*/("""</td>
    		<td """),_display_(/*49.12*/if(i % 2==0)/*49.24*/ {_display_(Seq[Any](format.raw/*49.26*/("""class="tg-6k2t"""")))}/*49.43*/else/*49.48*/{_display_(Seq[Any](format.raw/*49.49*/("""class="tg-yw4l"""")))}),format.raw/*49.65*/(""">"""),_display_(/*49.67*/segment/*49.74*/.getSegmentId()),format.raw/*49.89*/("""</td>
    		<td """),_display_(/*50.12*/if(i % 2==0)/*50.24*/ {_display_(Seq[Any](format.raw/*50.26*/("""class="tg-j0tj"""")))}/*50.43*/else/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""class="tg-baqh"""")))}),format.raw/*50.65*/(""">"""),_display_(/*50.67*/segment/*50.74*/.getArea()),format.raw/*50.84*/("""</td>
    		<td """),_display_(/*51.12*/if(i % 2==0)/*51.24*/ {_display_(Seq[Any](format.raw/*51.26*/("""class="tg-j0tj"""")))}/*51.43*/else/*51.48*/{_display_(Seq[Any](format.raw/*51.49*/("""class="tg-baqh"""")))}),format.raw/*51.65*/(""">"""),_display_(/*51.67*/segment/*51.74*/.getHeight()),format.raw/*51.86*/("""</td>
     		<td """),_display_(/*52.13*/if(i % 2==0)/*52.25*/ {_display_(Seq[Any](format.raw/*52.27*/("""class="tg-j0tj"""")))}/*52.44*/else/*52.49*/{_display_(Seq[Any](format.raw/*52.50*/("""class="tg-baqh"""")))}),format.raw/*52.66*/(""">"""),_display_(/*52.68*/segment/*52.75*/.getWidth()),format.raw/*52.86*/("""</td>
     		<td """),_display_(/*53.13*/if(i % 2==0)/*53.25*/ {_display_(Seq[Any](format.raw/*53.27*/("""class="tg-j0tj"""")))}/*53.44*/else/*53.49*/{_display_(Seq[Any](format.raw/*53.50*/("""class="tg-baqh"""")))}),format.raw/*53.66*/(""">"""),_display_(/*53.68*/segment/*53.75*/.getPerimeter()),format.raw/*53.90*/("""</td>
     		<td """),_display_(/*54.13*/if(i % 2==0)/*54.25*/ {_display_(Seq[Any](format.raw/*54.27*/("""class="tg-j0tj"""")))}/*54.44*/else/*54.49*/{_display_(Seq[Any](format.raw/*54.50*/("""class="tg-baqh"""")))}),format.raw/*54.66*/(""">"""),_display_(/*54.68*/segment/*54.75*/.getBloodStatus()),format.raw/*54.92*/("""</td>
    	</tr>
	""")))}),format.raw/*56.3*/("""
"""),format.raw/*57.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*59.50*/("""{"""),format.raw/*59.51*/(""""use strict";
function r(n,t)"""),format.raw/*60.16*/("""{"""),format.raw/*60.17*/("""
	"""),format.raw/*61.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*61.49*/("""{"""),format.raw/*61.50*/("""
		"""),format.raw/*62.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*63.28*/("""{"""),format.raw/*63.29*/("""
			"""),format.raw/*64.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/(""" """),format.raw/*65.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*67.2*/("""}"""),format.raw/*67.3*/("""
	"""),format.raw/*68.2*/("""return e
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""
"""),format.raw/*70.1*/("""function e(n,t)"""),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
	"""),format.raw/*71.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*73.14*/("""{"""),format.raw/*73.15*/("""
			"""),format.raw/*74.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*76.3*/("""}"""),format.raw/*76.4*/("""
	"""),format.raw/*77.2*/("""),e
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""
"""),format.raw/*79.1*/("""function o(n)"""),format.raw/*79.14*/("""{"""),format.raw/*79.15*/(""" """),format.raw/*79.16*/("""return n.textContent||n.innerText||"" """),format.raw/*79.54*/("""}"""),format.raw/*79.55*/("""
"""),format.raw/*80.1*/("""function i(n)"""),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""i return n.innerHTML||"" """),format.raw/*80.40*/("""}"""),format.raw/*80.41*/("""
"""),format.raw/*81.1*/("""function u(n,t)"""),format.raw/*81.16*/("""{"""),format.raw/*81.17*/(""" """),format.raw/*81.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*81.48*/("""}"""),format.raw/*81.49*/("""
"""),format.raw/*82.1*/("""function a(n,t)"""),format.raw/*82.16*/("""{"""),format.raw/*82.17*/(""" """),format.raw/*82.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*82.48*/("""}"""),format.raw/*82.49*/("""
"""),format.raw/*83.1*/("""function c(n)"""),format.raw/*83.14*/("""{"""),format.raw/*83.15*/(""" """),format.raw/*83.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*83.66*/("""}"""),format.raw/*83.67*/("""
"""),format.raw/*84.1*/("""function f(n,t)"""),format.raw/*84.16*/("""{"""),format.raw/*84.17*/(""" """),format.raw/*84.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*84.44*/("""}"""),format.raw/*84.45*/("""
"""),format.raw/*85.1*/("""function s(n,t)"""),format.raw/*85.16*/("""{"""),format.raw/*85.17*/(""" """),format.raw/*85.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*85.47*/("""}"""),format.raw/*85.48*/("""
"""),format.raw/*86.1*/("""function d(n,t)"""),format.raw/*86.16*/("""{"""),format.raw/*86.17*/(""" 
	"""),format.raw/*87.2*/("""if(f(n,t))"""),format.raw/*87.12*/("""{"""),format.raw/*87.13*/(""" """),format.raw/*87.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*87.79*/("""}"""),format.raw/*87.80*/("""
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/("""
"""),format.raw/*89.1*/("""function v(n)"""),format.raw/*89.14*/("""{"""),format.raw/*89.15*/(""" """),format.raw/*89.16*/("""d(n,L),d(n,E) """),format.raw/*89.30*/("""}"""),format.raw/*89.31*/("""
"""),format.raw/*90.1*/("""function l(n,t,e)"""),format.raw/*90.18*/("""{"""),format.raw/*90.19*/(""" """),format.raw/*90.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*90.75*/("""}"""),format.raw/*90.76*/("""
"""),format.raw/*91.1*/("""function g(n)"""),format.raw/*91.14*/("""{"""),format.raw/*91.15*/("""return function(t,r)"""),format.raw/*91.35*/("""{"""),format.raw/*91.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*91.105*/("""}"""),format.raw/*91.106*/("""}"""),format.raw/*91.107*/("""function h(n)"""),format.raw/*91.120*/("""{"""),format.raw/*91.121*/("""return function(t,r)"""),format.raw/*91.141*/("""{"""),format.raw/*91.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*91.199*/("""}"""),format.raw/*91.200*/("""}"""),format.raw/*91.201*/("""function m(n,t,r)"""),format.raw/*91.218*/("""{"""),format.raw/*91.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*91.253*/("""{"""),format.raw/*91.254*/("""return"""),format.raw/*91.260*/("""{"""),format.raw/*91.261*/("""str:n,index:t"""),format.raw/*91.274*/("""}"""),format.raw/*91.275*/("""}"""),format.raw/*91.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*91.360*/("""{"""),format.raw/*91.361*/("""return n.index"""),format.raw/*91.375*/("""}"""),format.raw/*91.376*/(""")"""),format.raw/*91.377*/("""}"""),format.raw/*91.378*/("""function p(n,t,r,o)"""),format.raw/*91.397*/("""{"""),format.raw/*91.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*91.442*/("""{"""),format.raw/*91.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*91.488*/("""{"""),format.raw/*91.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*91.508*/("""}"""),format.raw/*91.509*/(""")"""),format.raw/*91.510*/("""}"""),format.raw/*91.511*/("""l(n,o,i)"""),format.raw/*91.519*/("""}"""),format.raw/*91.520*/("""function x(n,t)"""),format.raw/*91.535*/("""{"""),format.raw/*91.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*91.574*/("""{"""),format.raw/*91.575*/("""t.addEventListener("click",function()"""),format.raw/*91.612*/("""{"""),format.raw/*91.613*/("""p(n,r,e,t)"""),format.raw/*91.623*/("""}"""),format.raw/*91.624*/("""),s(t,"tg-sort-header")"""),format.raw/*91.647*/("""}"""),format.raw/*91.648*/(""")"""),format.raw/*91.649*/("""}"""),format.raw/*91.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*91.714*/("""{"""),format.raw/*91.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*91.839*/("""{"""),format.raw/*91.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*91.887*/("""}"""),format.raw/*91.888*/("""x(e,i)"""),format.raw/*91.894*/("""}"""),format.raw/*91.895*/("""}"""),format.raw/*91.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*92.58*/("""{"""),format.raw/*92.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*92.82*/("""}"""),format.raw/*92.83*/(""");
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
                  DATE: Fri Feb 24 15:06:44 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: f6210214b1e67d98907a01029fd07a629eb4ed39
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|5995->2406|6024->2414|6122->2485|6152->2494|6570->2886|6627->2927|6667->2929|6701->2936|6745->2953|6766->2965|6806->2967|6841->2984|6854->2989|6893->2990|6940->3006|6969->3008|6985->3015|7017->3026|7062->3044|7083->3056|7123->3058|7158->3075|7171->3080|7210->3081|7257->3097|7286->3099|7302->3106|7338->3121|7383->3139|7404->3151|7444->3153|7479->3170|7492->3175|7531->3176|7578->3192|7607->3194|7623->3201|7654->3211|7699->3229|7720->3241|7760->3243|7795->3260|7808->3265|7847->3266|7894->3282|7923->3284|7939->3291|7972->3303|8018->3322|8039->3334|8079->3336|8114->3353|8127->3358|8166->3359|8213->3375|8242->3377|8258->3384|8290->3395|8336->3414|8357->3426|8397->3428|8432->3445|8445->3450|8484->3451|8531->3467|8560->3469|8576->3476|8612->3491|8658->3510|8679->3522|8719->3524|8754->3541|8767->3546|8806->3547|8853->3563|8882->3565|8898->3572|8936->3589|8987->3610|9016->3612|9152->3720|9181->3721|9239->3751|9268->3752|9298->3755|9373->3802|9402->3803|9433->3807|9501->3847|9530->3848|9562->3853|9631->3895|9659->3896|9687->3897|9791->3974|9819->3975|9849->3978|9886->3988|9914->3989|9943->3991|9986->4006|10015->4007|10045->4010|10129->4066|10158->4067|10190->4072|10272->4127|10300->4128|10330->4131|10362->4136|10390->4137|10419->4139|10460->4152|10489->4153|10518->4154|10584->4192|10613->4193|10642->4195|10683->4208|10712->4209|10765->4234|10794->4235|10823->4237|10866->4252|10895->4253|10924->4254|10982->4284|11011->4285|11040->4287|11083->4302|11112->4303|11141->4304|11199->4334|11228->4335|11257->4337|11298->4350|11327->4351|11356->4352|11434->4402|11463->4403|11492->4405|11535->4420|11564->4421|11593->4422|11647->4448|11676->4449|11705->4451|11748->4466|11777->4467|11806->4468|11863->4497|11892->4498|11921->4500|11964->4515|11993->4516|12024->4520|12062->4530|12091->4531|12120->4532|12213->4597|12242->4598|12271->4600|12299->4601|12328->4603|12369->4616|12398->4617|12427->4618|12469->4632|12498->4633|12527->4635|12572->4652|12601->4653|12630->4654|12713->4709|12742->4710|12771->4712|12812->4725|12841->4726|12889->4746|12918->4747|13016->4816|13046->4817|13076->4818|13118->4831|13148->4832|13197->4852|13227->4853|13313->4910|13343->4911|13373->4912|13419->4929|13449->4930|13512->4964|13542->4965|13577->4971|13607->4972|13649->4985|13679->4986|13709->4987|13822->5071|13852->5072|13895->5086|13925->5087|13955->5088|13985->5089|14033->5108|14063->5109|14136->5153|14166->5154|14240->5199|14270->5200|14318->5219|14348->5220|14378->5221|14408->5222|14445->5230|14475->5231|14519->5246|14549->5247|14616->5285|14646->5286|14712->5323|14742->5324|14781->5334|14811->5335|14863->5358|14893->5359|14923->5360|14953->5361|15046->5425|15076->5426|15229->5550|15259->5551|15335->5598|15365->5599|15400->5605|15430->5606|15460->5607|15558->5677|15587->5678|15638->5701|15667->5702
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|60->29|60->29|61->30|61->30|77->46|77->46|77->46|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|87->56|88->57|90->59|90->59|91->60|91->60|92->61|92->61|92->61|93->62|94->63|94->63|95->64|96->65|96->65|96->65|98->67|98->67|99->68|100->69|100->69|101->70|101->70|101->70|102->71|104->73|104->73|105->74|107->76|107->76|108->77|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92
                  -- GENERATED --
              */
          