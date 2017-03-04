
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
    	<th class="tg-amwm">MeanR</th>
    	<th class="tg-amwm">MeanG</th>
    	<th class="tg-amwm">MeanB</th>
    	<th class="tg-amwm">Blood Status</th>
    </tr>

	"""),_display_(/*49.3*/for((segment,i) <- segments.zipWithIndex) yield /*49.44*/ {_display_(Seq[Any](format.raw/*49.46*/("""
    	"""),format.raw/*50.6*/("""<tr>
    		<td """),_display_(/*51.12*/if(i % 2==0)/*51.24*/ {_display_(Seq[Any](format.raw/*51.26*/("""class="tg-j0tj"""")))}/*51.43*/else/*51.48*/{_display_(Seq[Any](format.raw/*51.49*/("""class="tg-baqh"""")))}),format.raw/*51.65*/(""">"""),_display_(/*51.67*/segment/*51.74*/.getLabel()),format.raw/*51.85*/("""</td>
    		<td """),_display_(/*52.12*/if(i % 2==0)/*52.24*/ {_display_(Seq[Any](format.raw/*52.26*/("""class="tg-6k2t"""")))}/*52.43*/else/*52.48*/{_display_(Seq[Any](format.raw/*52.49*/("""class="tg-yw4l"""")))}),format.raw/*52.65*/(""">"""),_display_(/*52.67*/segment/*52.74*/.getSegmentId()),format.raw/*52.89*/("""</td>
    		<td """),_display_(/*53.12*/if(i % 2==0)/*53.24*/ {_display_(Seq[Any](format.raw/*53.26*/("""class="tg-j0tj"""")))}/*53.43*/else/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""class="tg-baqh"""")))}),format.raw/*53.65*/(""">"""),_display_(/*53.67*/segment/*53.74*/.getArea()),format.raw/*53.84*/("""</td>
    		<td """),_display_(/*54.12*/if(i % 2==0)/*54.24*/ {_display_(Seq[Any](format.raw/*54.26*/("""class="tg-j0tj"""")))}/*54.43*/else/*54.48*/{_display_(Seq[Any](format.raw/*54.49*/("""class="tg-baqh"""")))}),format.raw/*54.65*/(""">"""),_display_(/*54.67*/segment/*54.74*/.getHeight()),format.raw/*54.86*/("""</td>
     		<td """),_display_(/*55.13*/if(i % 2==0)/*55.25*/ {_display_(Seq[Any](format.raw/*55.27*/("""class="tg-j0tj"""")))}/*55.44*/else/*55.49*/{_display_(Seq[Any](format.raw/*55.50*/("""class="tg-baqh"""")))}),format.raw/*55.66*/(""">"""),_display_(/*55.68*/segment/*55.75*/.getWidth()),format.raw/*55.86*/("""</td>
     		<td """),_display_(/*56.13*/if(i % 2==0)/*56.25*/ {_display_(Seq[Any](format.raw/*56.27*/("""class="tg-j0tj"""")))}/*56.44*/else/*56.49*/{_display_(Seq[Any](format.raw/*56.50*/("""class="tg-baqh"""")))}),format.raw/*56.66*/(""">"""),_display_(/*56.68*/segment/*56.75*/.getPerimeter()),format.raw/*56.90*/("""</td>
     		<td """),_display_(/*57.13*/if(i % 2==0)/*57.25*/ {_display_(Seq[Any](format.raw/*57.27*/("""class="tg-j0tj"""")))}/*57.44*/else/*57.49*/{_display_(Seq[Any](format.raw/*57.50*/("""class="tg-baqh"""")))}),format.raw/*57.66*/(""">"""),_display_(/*57.68*/segment/*57.75*/.getMeanR()),format.raw/*57.86*/("""</td>
     		<td """),_display_(/*58.13*/if(i % 2==0)/*58.25*/ {_display_(Seq[Any](format.raw/*58.27*/("""class="tg-j0tj"""")))}/*58.44*/else/*58.49*/{_display_(Seq[Any](format.raw/*58.50*/("""class="tg-baqh"""")))}),format.raw/*58.66*/(""">"""),_display_(/*58.68*/segment/*58.75*/.getMeanG()),format.raw/*58.86*/("""</td>
     		<td """),_display_(/*59.13*/if(i % 2==0)/*59.25*/ {_display_(Seq[Any](format.raw/*59.27*/("""class="tg-j0tj"""")))}/*59.44*/else/*59.49*/{_display_(Seq[Any](format.raw/*59.50*/("""class="tg-baqh"""")))}),format.raw/*59.66*/(""">"""),_display_(/*59.68*/segment/*59.75*/.getMeanB()),format.raw/*59.86*/("""</td>
     		<td """),_display_(/*60.13*/if(i % 2==0)/*60.25*/ {_display_(Seq[Any](format.raw/*60.27*/("""class="tg-j0tj"""")))}/*60.44*/else/*60.49*/{_display_(Seq[Any](format.raw/*60.50*/("""class="tg-baqh"""")))}),format.raw/*60.66*/(""">"""),_display_(/*60.68*/segment/*60.75*/.getBloodStatus()),format.raw/*60.92*/("""</td>
    	</tr>
	""")))}),format.raw/*62.3*/("""
"""),format.raw/*63.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*65.50*/("""{"""),format.raw/*65.51*/(""""use strict";
function r(n,t)"""),format.raw/*66.16*/("""{"""),format.raw/*66.17*/("""
	"""),format.raw/*67.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*67.49*/("""{"""),format.raw/*67.50*/("""
		"""),format.raw/*68.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*69.28*/("""{"""),format.raw/*69.29*/("""
			"""),format.raw/*70.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/(""" """),format.raw/*71.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*73.2*/("""}"""),format.raw/*73.3*/("""
	"""),format.raw/*74.2*/("""return e
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/("""function e(n,t)"""),format.raw/*76.16*/("""{"""),format.raw/*76.17*/("""
	"""),format.raw/*77.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*79.14*/("""{"""),format.raw/*79.15*/("""
			"""),format.raw/*80.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*82.3*/("""}"""),format.raw/*82.4*/("""
	"""),format.raw/*83.2*/("""),e
"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""
"""),format.raw/*85.1*/("""function o(n)"""),format.raw/*85.14*/("""{"""),format.raw/*85.15*/(""" """),format.raw/*85.16*/("""return n.textContent||n.innerText||"" """),format.raw/*85.54*/("""}"""),format.raw/*85.55*/("""
"""),format.raw/*86.1*/("""function i(n)"""),format.raw/*86.14*/("""{"""),format.raw/*86.15*/("""i return n.innerHTML||"" """),format.raw/*86.40*/("""}"""),format.raw/*86.41*/("""
"""),format.raw/*87.1*/("""function u(n,t)"""),format.raw/*87.16*/("""{"""),format.raw/*87.17*/(""" """),format.raw/*87.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*87.48*/("""}"""),format.raw/*87.49*/("""
"""),format.raw/*88.1*/("""function a(n,t)"""),format.raw/*88.16*/("""{"""),format.raw/*88.17*/(""" """),format.raw/*88.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*88.48*/("""}"""),format.raw/*88.49*/("""
"""),format.raw/*89.1*/("""function c(n)"""),format.raw/*89.14*/("""{"""),format.raw/*89.15*/(""" """),format.raw/*89.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*89.66*/("""}"""),format.raw/*89.67*/("""
"""),format.raw/*90.1*/("""function f(n,t)"""),format.raw/*90.16*/("""{"""),format.raw/*90.17*/(""" """),format.raw/*90.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*90.44*/("""}"""),format.raw/*90.45*/("""
"""),format.raw/*91.1*/("""function s(n,t)"""),format.raw/*91.16*/("""{"""),format.raw/*91.17*/(""" """),format.raw/*91.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*91.47*/("""}"""),format.raw/*91.48*/("""
"""),format.raw/*92.1*/("""function d(n,t)"""),format.raw/*92.16*/("""{"""),format.raw/*92.17*/(""" 
	"""),format.raw/*93.2*/("""if(f(n,t))"""),format.raw/*93.12*/("""{"""),format.raw/*93.13*/(""" """),format.raw/*93.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*93.79*/("""}"""),format.raw/*93.80*/("""
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""
"""),format.raw/*95.1*/("""function v(n)"""),format.raw/*95.14*/("""{"""),format.raw/*95.15*/(""" """),format.raw/*95.16*/("""d(n,L),d(n,E) """),format.raw/*95.30*/("""}"""),format.raw/*95.31*/("""
"""),format.raw/*96.1*/("""function l(n,t,e)"""),format.raw/*96.18*/("""{"""),format.raw/*96.19*/(""" """),format.raw/*96.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*96.75*/("""}"""),format.raw/*96.76*/("""
"""),format.raw/*97.1*/("""function g(n)"""),format.raw/*97.14*/("""{"""),format.raw/*97.15*/("""return function(t,r)"""),format.raw/*97.35*/("""{"""),format.raw/*97.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*97.105*/("""}"""),format.raw/*97.106*/("""}"""),format.raw/*97.107*/("""function h(n)"""),format.raw/*97.120*/("""{"""),format.raw/*97.121*/("""return function(t,r)"""),format.raw/*97.141*/("""{"""),format.raw/*97.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*97.199*/("""}"""),format.raw/*97.200*/("""}"""),format.raw/*97.201*/("""function m(n,t,r)"""),format.raw/*97.218*/("""{"""),format.raw/*97.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*97.253*/("""{"""),format.raw/*97.254*/("""return"""),format.raw/*97.260*/("""{"""),format.raw/*97.261*/("""str:n,index:t"""),format.raw/*97.274*/("""}"""),format.raw/*97.275*/("""}"""),format.raw/*97.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*97.360*/("""{"""),format.raw/*97.361*/("""return n.index"""),format.raw/*97.375*/("""}"""),format.raw/*97.376*/(""")"""),format.raw/*97.377*/("""}"""),format.raw/*97.378*/("""function p(n,t,r,o)"""),format.raw/*97.397*/("""{"""),format.raw/*97.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*97.442*/("""{"""),format.raw/*97.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*97.488*/("""{"""),format.raw/*97.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*97.508*/("""}"""),format.raw/*97.509*/(""")"""),format.raw/*97.510*/("""}"""),format.raw/*97.511*/("""l(n,o,i)"""),format.raw/*97.519*/("""}"""),format.raw/*97.520*/("""function x(n,t)"""),format.raw/*97.535*/("""{"""),format.raw/*97.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*97.574*/("""{"""),format.raw/*97.575*/("""t.addEventListener("click",function()"""),format.raw/*97.612*/("""{"""),format.raw/*97.613*/("""p(n,r,e,t)"""),format.raw/*97.623*/("""}"""),format.raw/*97.624*/("""),s(t,"tg-sort-header")"""),format.raw/*97.647*/("""}"""),format.raw/*97.648*/(""")"""),format.raw/*97.649*/("""}"""),format.raw/*97.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*97.714*/("""{"""),format.raw/*97.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*97.839*/("""{"""),format.raw/*97.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*97.887*/("""}"""),format.raw/*97.888*/("""x(e,i)"""),format.raw/*97.894*/("""}"""),format.raw/*97.895*/("""}"""),format.raw/*97.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*98.58*/("""{"""),format.raw/*98.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*98.82*/("""}"""),format.raw/*98.83*/(""");
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
                  DATE: Sat Mar 04 16:12:24 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: 686954d8b8962890beb1206ef660c5889c10970b
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|5995->2406|6024->2414|6122->2485|6152->2494|6681->2997|6738->3038|6778->3040|6812->3047|6856->3064|6877->3076|6917->3078|6952->3095|6965->3100|7004->3101|7051->3117|7080->3119|7096->3126|7128->3137|7173->3155|7194->3167|7234->3169|7269->3186|7282->3191|7321->3192|7368->3208|7397->3210|7413->3217|7449->3232|7494->3250|7515->3262|7555->3264|7590->3281|7603->3286|7642->3287|7689->3303|7718->3305|7734->3312|7765->3322|7810->3340|7831->3352|7871->3354|7906->3371|7919->3376|7958->3377|8005->3393|8034->3395|8050->3402|8083->3414|8129->3433|8150->3445|8190->3447|8225->3464|8238->3469|8277->3470|8324->3486|8353->3488|8369->3495|8401->3506|8447->3525|8468->3537|8508->3539|8543->3556|8556->3561|8595->3562|8642->3578|8671->3580|8687->3587|8723->3602|8769->3621|8790->3633|8830->3635|8865->3652|8878->3657|8917->3658|8964->3674|8993->3676|9009->3683|9041->3694|9087->3713|9108->3725|9148->3727|9183->3744|9196->3749|9235->3750|9282->3766|9311->3768|9327->3775|9359->3786|9405->3805|9426->3817|9466->3819|9501->3836|9514->3841|9553->3842|9600->3858|9629->3860|9645->3867|9677->3878|9723->3897|9744->3909|9784->3911|9819->3928|9832->3933|9871->3934|9918->3950|9947->3952|9963->3959|10001->3976|10052->3997|10081->3999|10217->4107|10246->4108|10304->4138|10333->4139|10363->4142|10438->4189|10467->4190|10498->4194|10566->4234|10595->4235|10627->4240|10696->4282|10724->4283|10752->4284|10856->4361|10884->4362|10914->4365|10951->4375|10979->4376|11008->4378|11051->4393|11080->4394|11110->4397|11194->4453|11223->4454|11255->4459|11337->4514|11365->4515|11395->4518|11427->4523|11455->4524|11484->4526|11525->4539|11554->4540|11583->4541|11649->4579|11678->4580|11707->4582|11748->4595|11777->4596|11830->4621|11859->4622|11888->4624|11931->4639|11960->4640|11989->4641|12047->4671|12076->4672|12105->4674|12148->4689|12177->4690|12206->4691|12264->4721|12293->4722|12322->4724|12363->4737|12392->4738|12421->4739|12499->4789|12528->4790|12557->4792|12600->4807|12629->4808|12658->4809|12712->4835|12741->4836|12770->4838|12813->4853|12842->4854|12871->4855|12928->4884|12957->4885|12986->4887|13029->4902|13058->4903|13089->4907|13127->4917|13156->4918|13185->4919|13278->4984|13307->4985|13336->4987|13364->4988|13393->4990|13434->5003|13463->5004|13492->5005|13534->5019|13563->5020|13592->5022|13637->5039|13666->5040|13695->5041|13778->5096|13807->5097|13836->5099|13877->5112|13906->5113|13954->5133|13983->5134|14081->5203|14111->5204|14141->5205|14183->5218|14213->5219|14262->5239|14292->5240|14378->5297|14408->5298|14438->5299|14484->5316|14514->5317|14577->5351|14607->5352|14642->5358|14672->5359|14714->5372|14744->5373|14774->5374|14887->5458|14917->5459|14960->5473|14990->5474|15020->5475|15050->5476|15098->5495|15128->5496|15201->5540|15231->5541|15305->5586|15335->5587|15383->5606|15413->5607|15443->5608|15473->5609|15510->5617|15540->5618|15584->5633|15614->5634|15681->5672|15711->5673|15777->5710|15807->5711|15846->5721|15876->5722|15928->5745|15958->5746|15988->5747|16018->5748|16111->5812|16141->5813|16294->5937|16324->5938|16400->5985|16430->5986|16465->5992|16495->5993|16525->5994|16623->6064|16652->6065|16703->6088|16732->6089
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|60->29|60->29|61->30|61->30|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|93->62|94->63|96->65|96->65|97->66|97->66|98->67|98->67|98->67|99->68|100->69|100->69|101->70|102->71|102->71|102->71|104->73|104->73|105->74|106->75|106->75|107->76|107->76|107->76|108->77|110->79|110->79|111->80|113->82|113->82|114->83|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|124->93|124->93|124->93|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98
                  -- GENERATED --
              */
          