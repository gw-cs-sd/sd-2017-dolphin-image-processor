
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
    	<th class="tg-amwm">Convexity</th>
    	<th class="tg-amwm">Circularity</th>
    	<th class="tg-amwm">Blood Status</th>
    </tr>

	"""),_display_(/*51.3*/for((segment,i) <- segments.zipWithIndex) yield /*51.44*/ {_display_(Seq[Any](format.raw/*51.46*/("""
    	"""),format.raw/*52.6*/("""<tr>
    		<td """),_display_(/*53.12*/if(i % 2==0)/*53.24*/ {_display_(Seq[Any](format.raw/*53.26*/("""class="tg-j0tj"""")))}/*53.43*/else/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""class="tg-baqh"""")))}),format.raw/*53.65*/(""">"""),_display_(/*53.67*/segment/*53.74*/.getLabel()),format.raw/*53.85*/("""</td>
    		<td """),_display_(/*54.12*/if(i % 2==0)/*54.24*/ {_display_(Seq[Any](format.raw/*54.26*/("""class="tg-6k2t"""")))}/*54.43*/else/*54.48*/{_display_(Seq[Any](format.raw/*54.49*/("""class="tg-yw4l"""")))}),format.raw/*54.65*/(""">"""),_display_(/*54.67*/segment/*54.74*/.getSegmentId()),format.raw/*54.89*/("""</td>
    		<td """),_display_(/*55.12*/if(i % 2==0)/*55.24*/ {_display_(Seq[Any](format.raw/*55.26*/("""class="tg-j0tj"""")))}/*55.43*/else/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""class="tg-baqh"""")))}),format.raw/*55.65*/(""">"""),_display_(/*55.67*/segment/*55.74*/.getArea()),format.raw/*55.84*/("""</td>
    		<td """),_display_(/*56.12*/if(i % 2==0)/*56.24*/ {_display_(Seq[Any](format.raw/*56.26*/("""class="tg-j0tj"""")))}/*56.43*/else/*56.48*/{_display_(Seq[Any](format.raw/*56.49*/("""class="tg-baqh"""")))}),format.raw/*56.65*/(""">"""),_display_(/*56.67*/segment/*56.74*/.getHeight()),format.raw/*56.86*/("""</td>
     		<td """),_display_(/*57.13*/if(i % 2==0)/*57.25*/ {_display_(Seq[Any](format.raw/*57.27*/("""class="tg-j0tj"""")))}/*57.44*/else/*57.49*/{_display_(Seq[Any](format.raw/*57.50*/("""class="tg-baqh"""")))}),format.raw/*57.66*/(""">"""),_display_(/*57.68*/segment/*57.75*/.getWidth()),format.raw/*57.86*/("""</td>
     		<td """),_display_(/*58.13*/if(i % 2==0)/*58.25*/ {_display_(Seq[Any](format.raw/*58.27*/("""class="tg-j0tj"""")))}/*58.44*/else/*58.49*/{_display_(Seq[Any](format.raw/*58.50*/("""class="tg-baqh"""")))}),format.raw/*58.66*/(""">"""),_display_(/*58.68*/segment/*58.75*/.getPerimeter()),format.raw/*58.90*/("""</td>
     		<td """),_display_(/*59.13*/if(i % 2==0)/*59.25*/ {_display_(Seq[Any](format.raw/*59.27*/("""class="tg-j0tj"""")))}/*59.44*/else/*59.49*/{_display_(Seq[Any](format.raw/*59.50*/("""class="tg-baqh"""")))}),format.raw/*59.66*/(""">"""),_display_(/*59.68*/segment/*59.75*/.getMeanR()),format.raw/*59.86*/("""</td>
     		<td """),_display_(/*60.13*/if(i % 2==0)/*60.25*/ {_display_(Seq[Any](format.raw/*60.27*/("""class="tg-j0tj"""")))}/*60.44*/else/*60.49*/{_display_(Seq[Any](format.raw/*60.50*/("""class="tg-baqh"""")))}),format.raw/*60.66*/(""">"""),_display_(/*60.68*/segment/*60.75*/.getMeanG()),format.raw/*60.86*/("""</td>
     		<td """),_display_(/*61.13*/if(i % 2==0)/*61.25*/ {_display_(Seq[Any](format.raw/*61.27*/("""class="tg-j0tj"""")))}/*61.44*/else/*61.49*/{_display_(Seq[Any](format.raw/*61.50*/("""class="tg-baqh"""")))}),format.raw/*61.66*/(""">"""),_display_(/*61.68*/segment/*61.75*/.getMeanB()),format.raw/*61.86*/("""</td>
     		<td """),_display_(/*62.13*/if(i % 2==0)/*62.25*/ {_display_(Seq[Any](format.raw/*62.27*/("""class="tg-j0tj"""")))}/*62.44*/else/*62.49*/{_display_(Seq[Any](format.raw/*62.50*/("""class="tg-baqh"""")))}),format.raw/*62.66*/(""">"""),_display_(/*62.68*/segment/*62.75*/.getConvexity()),format.raw/*62.90*/("""</td>
     		<td """),_display_(/*63.13*/if(i % 2==0)/*63.25*/ {_display_(Seq[Any](format.raw/*63.27*/("""class="tg-j0tj"""")))}/*63.44*/else/*63.49*/{_display_(Seq[Any](format.raw/*63.50*/("""class="tg-baqh"""")))}),format.raw/*63.66*/(""">"""),_display_(/*63.68*/segment/*63.75*/.getCircularity()),format.raw/*63.92*/("""</td>
     		<td """),_display_(/*64.13*/if(i % 2==0)/*64.25*/ {_display_(Seq[Any](format.raw/*64.27*/("""class="tg-j0tj"""")))}/*64.44*/else/*64.49*/{_display_(Seq[Any](format.raw/*64.50*/("""class="tg-baqh"""")))}),format.raw/*64.66*/(""">"""),_display_(/*64.68*/segment/*64.75*/.getBloodStatus()),format.raw/*64.92*/("""</td>
    	</tr>
	""")))}),format.raw/*66.3*/("""
"""),format.raw/*67.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*69.50*/("""{"""),format.raw/*69.51*/(""""use strict";
function r(n,t)"""),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
	"""),format.raw/*71.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*71.49*/("""{"""),format.raw/*71.50*/("""
		"""),format.raw/*72.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*73.28*/("""{"""),format.raw/*73.29*/("""
			"""),format.raw/*74.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/(""" """),format.raw/*75.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/("""
	"""),format.raw/*78.2*/("""return e
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""
"""),format.raw/*80.1*/("""function e(n,t)"""),format.raw/*80.16*/("""{"""),format.raw/*80.17*/("""
	"""),format.raw/*81.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*83.14*/("""{"""),format.raw/*83.15*/("""
			"""),format.raw/*84.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
	"""),format.raw/*87.2*/("""),e
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/("""
"""),format.raw/*89.1*/("""function o(n)"""),format.raw/*89.14*/("""{"""),format.raw/*89.15*/(""" """),format.raw/*89.16*/("""return n.textContent||n.innerText||"" """),format.raw/*89.54*/("""}"""),format.raw/*89.55*/("""
"""),format.raw/*90.1*/("""function i(n)"""),format.raw/*90.14*/("""{"""),format.raw/*90.15*/("""i return n.innerHTML||"" """),format.raw/*90.40*/("""}"""),format.raw/*90.41*/("""
"""),format.raw/*91.1*/("""function u(n,t)"""),format.raw/*91.16*/("""{"""),format.raw/*91.17*/(""" """),format.raw/*91.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*91.48*/("""}"""),format.raw/*91.49*/("""
"""),format.raw/*92.1*/("""function a(n,t)"""),format.raw/*92.16*/("""{"""),format.raw/*92.17*/(""" """),format.raw/*92.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*92.48*/("""}"""),format.raw/*92.49*/("""
"""),format.raw/*93.1*/("""function c(n)"""),format.raw/*93.14*/("""{"""),format.raw/*93.15*/(""" """),format.raw/*93.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*93.66*/("""}"""),format.raw/*93.67*/("""
"""),format.raw/*94.1*/("""function f(n,t)"""),format.raw/*94.16*/("""{"""),format.raw/*94.17*/(""" """),format.raw/*94.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*94.44*/("""}"""),format.raw/*94.45*/("""
"""),format.raw/*95.1*/("""function s(n,t)"""),format.raw/*95.16*/("""{"""),format.raw/*95.17*/(""" """),format.raw/*95.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*95.47*/("""}"""),format.raw/*95.48*/("""
"""),format.raw/*96.1*/("""function d(n,t)"""),format.raw/*96.16*/("""{"""),format.raw/*96.17*/(""" 
	"""),format.raw/*97.2*/("""if(f(n,t))"""),format.raw/*97.12*/("""{"""),format.raw/*97.13*/(""" """),format.raw/*97.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*97.79*/("""}"""),format.raw/*97.80*/("""
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""
"""),format.raw/*99.1*/("""function v(n)"""),format.raw/*99.14*/("""{"""),format.raw/*99.15*/(""" """),format.raw/*99.16*/("""d(n,L),d(n,E) """),format.raw/*99.30*/("""}"""),format.raw/*99.31*/("""
"""),format.raw/*100.1*/("""function l(n,t,e)"""),format.raw/*100.18*/("""{"""),format.raw/*100.19*/(""" """),format.raw/*100.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*100.75*/("""}"""),format.raw/*100.76*/("""
"""),format.raw/*101.1*/("""function g(n)"""),format.raw/*101.14*/("""{"""),format.raw/*101.15*/("""return function(t,r)"""),format.raw/*101.35*/("""{"""),format.raw/*101.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*101.105*/("""}"""),format.raw/*101.106*/("""}"""),format.raw/*101.107*/("""function h(n)"""),format.raw/*101.120*/("""{"""),format.raw/*101.121*/("""return function(t,r)"""),format.raw/*101.141*/("""{"""),format.raw/*101.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*101.199*/("""}"""),format.raw/*101.200*/("""}"""),format.raw/*101.201*/("""function m(n,t,r)"""),format.raw/*101.218*/("""{"""),format.raw/*101.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*101.253*/("""{"""),format.raw/*101.254*/("""return"""),format.raw/*101.260*/("""{"""),format.raw/*101.261*/("""str:n,index:t"""),format.raw/*101.274*/("""}"""),format.raw/*101.275*/("""}"""),format.raw/*101.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*101.360*/("""{"""),format.raw/*101.361*/("""return n.index"""),format.raw/*101.375*/("""}"""),format.raw/*101.376*/(""")"""),format.raw/*101.377*/("""}"""),format.raw/*101.378*/("""function p(n,t,r,o)"""),format.raw/*101.397*/("""{"""),format.raw/*101.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*101.442*/("""{"""),format.raw/*101.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*101.488*/("""{"""),format.raw/*101.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*101.508*/("""}"""),format.raw/*101.509*/(""")"""),format.raw/*101.510*/("""}"""),format.raw/*101.511*/("""l(n,o,i)"""),format.raw/*101.519*/("""}"""),format.raw/*101.520*/("""function x(n,t)"""),format.raw/*101.535*/("""{"""),format.raw/*101.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*101.574*/("""{"""),format.raw/*101.575*/("""t.addEventListener("click",function()"""),format.raw/*101.612*/("""{"""),format.raw/*101.613*/("""p(n,r,e,t)"""),format.raw/*101.623*/("""}"""),format.raw/*101.624*/("""),s(t,"tg-sort-header")"""),format.raw/*101.647*/("""}"""),format.raw/*101.648*/(""")"""),format.raw/*101.649*/("""}"""),format.raw/*101.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*101.714*/("""{"""),format.raw/*101.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*101.839*/("""{"""),format.raw/*101.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*101.887*/("""}"""),format.raw/*101.888*/("""x(e,i)"""),format.raw/*101.894*/("""}"""),format.raw/*101.895*/("""}"""),format.raw/*101.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*102.58*/("""{"""),format.raw/*102.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*102.82*/("""}"""),format.raw/*102.83*/(""");
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
                  DATE: Thu Mar 09 12:29:53 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: cad7bfdd03dc562c1424ca24adc2d9e6442e79a8
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|5995->2406|6024->2414|6122->2485|6152->2494|6765->3081|6822->3122|6862->3124|6896->3131|6940->3148|6961->3160|7001->3162|7036->3179|7049->3184|7088->3185|7135->3201|7164->3203|7180->3210|7212->3221|7257->3239|7278->3251|7318->3253|7353->3270|7366->3275|7405->3276|7452->3292|7481->3294|7497->3301|7533->3316|7578->3334|7599->3346|7639->3348|7674->3365|7687->3370|7726->3371|7773->3387|7802->3389|7818->3396|7849->3406|7894->3424|7915->3436|7955->3438|7990->3455|8003->3460|8042->3461|8089->3477|8118->3479|8134->3486|8167->3498|8213->3517|8234->3529|8274->3531|8309->3548|8322->3553|8361->3554|8408->3570|8437->3572|8453->3579|8485->3590|8531->3609|8552->3621|8592->3623|8627->3640|8640->3645|8679->3646|8726->3662|8755->3664|8771->3671|8807->3686|8853->3705|8874->3717|8914->3719|8949->3736|8962->3741|9001->3742|9048->3758|9077->3760|9093->3767|9125->3778|9171->3797|9192->3809|9232->3811|9267->3828|9280->3833|9319->3834|9366->3850|9395->3852|9411->3859|9443->3870|9489->3889|9510->3901|9550->3903|9585->3920|9598->3925|9637->3926|9684->3942|9713->3944|9729->3951|9761->3962|9807->3981|9828->3993|9868->3995|9903->4012|9916->4017|9955->4018|10002->4034|10031->4036|10047->4043|10083->4058|10129->4077|10150->4089|10190->4091|10225->4108|10238->4113|10277->4114|10324->4130|10353->4132|10369->4139|10407->4156|10453->4175|10474->4187|10514->4189|10549->4206|10562->4211|10601->4212|10648->4228|10677->4230|10693->4237|10731->4254|10782->4275|10811->4277|10947->4385|10976->4386|11034->4416|11063->4417|11093->4420|11168->4467|11197->4468|11228->4472|11296->4512|11325->4513|11357->4518|11426->4560|11454->4561|11482->4562|11586->4639|11614->4640|11644->4643|11681->4653|11709->4654|11738->4656|11781->4671|11810->4672|11840->4675|11924->4731|11953->4732|11985->4737|12067->4792|12095->4793|12125->4796|12157->4801|12185->4802|12214->4804|12255->4817|12284->4818|12313->4819|12379->4857|12408->4858|12437->4860|12478->4873|12507->4874|12560->4899|12589->4900|12618->4902|12661->4917|12690->4918|12719->4919|12777->4949|12806->4950|12835->4952|12878->4967|12907->4968|12936->4969|12994->4999|13023->5000|13052->5002|13093->5015|13122->5016|13151->5017|13229->5067|13258->5068|13287->5070|13330->5085|13359->5086|13388->5087|13442->5113|13471->5114|13500->5116|13543->5131|13572->5132|13601->5133|13658->5162|13687->5163|13716->5165|13759->5180|13788->5181|13819->5185|13857->5195|13886->5196|13915->5197|14008->5262|14037->5263|14066->5265|14094->5266|14123->5268|14164->5281|14193->5282|14222->5283|14264->5297|14293->5298|14323->5300|14369->5317|14399->5318|14429->5319|14513->5374|14543->5375|14573->5377|14615->5390|14645->5391|14694->5411|14724->5412|14823->5481|14854->5482|14885->5483|14928->5496|14959->5497|15009->5517|15040->5518|15127->5575|15158->5576|15189->5577|15236->5594|15267->5595|15331->5629|15362->5630|15398->5636|15429->5637|15472->5650|15503->5651|15534->5652|15648->5736|15679->5737|15723->5751|15754->5752|15785->5753|15816->5754|15865->5773|15896->5774|15970->5818|16001->5819|16076->5864|16107->5865|16156->5884|16187->5885|16218->5886|16249->5887|16287->5895|16318->5896|16363->5911|16394->5912|16462->5950|16493->5951|16560->5988|16591->5989|16631->5999|16662->6000|16715->6023|16746->6024|16777->6025|16808->6026|16902->6090|16933->6091|17087->6215|17118->6216|17195->6263|17226->6264|17262->6270|17293->6271|17324->6272|17423->6342|17453->6343|17505->6366|17535->6367
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|60->29|60->29|61->30|61->30|82->51|82->51|82->51|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|97->66|98->67|100->69|100->69|101->70|101->70|102->71|102->71|102->71|103->72|104->73|104->73|105->74|106->75|106->75|106->75|108->77|108->77|109->78|110->79|110->79|111->80|111->80|111->80|112->81|114->83|114->83|115->84|117->86|117->86|118->87|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|129->98|129->98|130->99|130->99|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102
                  -- GENERATED --
              */
          