
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
    	<th class="tg-amwm">StdDevR</th>
    	<th class="tg-amwm">Blood Status</th>
    </tr>

	"""),_display_(/*52.3*/for((segment,i) <- segments.zipWithIndex) yield /*52.44*/ {_display_(Seq[Any](format.raw/*52.46*/("""
    	"""),format.raw/*53.6*/("""<tr>
    		<td """),_display_(/*54.12*/if(i % 2==0)/*54.24*/ {_display_(Seq[Any](format.raw/*54.26*/("""class="tg-j0tj"""")))}/*54.43*/else/*54.48*/{_display_(Seq[Any](format.raw/*54.49*/("""class="tg-baqh"""")))}),format.raw/*54.65*/(""">"""),_display_(/*54.67*/segment/*54.74*/.getLabel()),format.raw/*54.85*/("""</td>
    		<td """),_display_(/*55.12*/if(i % 2==0)/*55.24*/ {_display_(Seq[Any](format.raw/*55.26*/("""class="tg-6k2t"""")))}/*55.43*/else/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""class="tg-yw4l"""")))}),format.raw/*55.65*/(""">"""),_display_(/*55.67*/segment/*55.74*/.getSegmentId()),format.raw/*55.89*/("""</td>
    		<td """),_display_(/*56.12*/if(i % 2==0)/*56.24*/ {_display_(Seq[Any](format.raw/*56.26*/("""class="tg-j0tj"""")))}/*56.43*/else/*56.48*/{_display_(Seq[Any](format.raw/*56.49*/("""class="tg-baqh"""")))}),format.raw/*56.65*/(""">"""),_display_(/*56.67*/segment/*56.74*/.getArea()),format.raw/*56.84*/("""</td>
    		<td """),_display_(/*57.12*/if(i % 2==0)/*57.24*/ {_display_(Seq[Any](format.raw/*57.26*/("""class="tg-j0tj"""")))}/*57.43*/else/*57.48*/{_display_(Seq[Any](format.raw/*57.49*/("""class="tg-baqh"""")))}),format.raw/*57.65*/(""">"""),_display_(/*57.67*/segment/*57.74*/.getHeight()),format.raw/*57.86*/("""</td>
     		<td """),_display_(/*58.13*/if(i % 2==0)/*58.25*/ {_display_(Seq[Any](format.raw/*58.27*/("""class="tg-j0tj"""")))}/*58.44*/else/*58.49*/{_display_(Seq[Any](format.raw/*58.50*/("""class="tg-baqh"""")))}),format.raw/*58.66*/(""">"""),_display_(/*58.68*/segment/*58.75*/.getWidth()),format.raw/*58.86*/("""</td>
     		<td """),_display_(/*59.13*/if(i % 2==0)/*59.25*/ {_display_(Seq[Any](format.raw/*59.27*/("""class="tg-j0tj"""")))}/*59.44*/else/*59.49*/{_display_(Seq[Any](format.raw/*59.50*/("""class="tg-baqh"""")))}),format.raw/*59.66*/(""">"""),_display_(/*59.68*/segment/*59.75*/.getPerimeter()),format.raw/*59.90*/("""</td>
     		<td """),_display_(/*60.13*/if(i % 2==0)/*60.25*/ {_display_(Seq[Any](format.raw/*60.27*/("""class="tg-j0tj"""")))}/*60.44*/else/*60.49*/{_display_(Seq[Any](format.raw/*60.50*/("""class="tg-baqh"""")))}),format.raw/*60.66*/(""">"""),_display_(/*60.68*/segment/*60.75*/.getMeanR()),format.raw/*60.86*/("""</td>
     		<td """),_display_(/*61.13*/if(i % 2==0)/*61.25*/ {_display_(Seq[Any](format.raw/*61.27*/("""class="tg-j0tj"""")))}/*61.44*/else/*61.49*/{_display_(Seq[Any](format.raw/*61.50*/("""class="tg-baqh"""")))}),format.raw/*61.66*/(""">"""),_display_(/*61.68*/segment/*61.75*/.getMeanG()),format.raw/*61.86*/("""</td>
     		<td """),_display_(/*62.13*/if(i % 2==0)/*62.25*/ {_display_(Seq[Any](format.raw/*62.27*/("""class="tg-j0tj"""")))}/*62.44*/else/*62.49*/{_display_(Seq[Any](format.raw/*62.50*/("""class="tg-baqh"""")))}),format.raw/*62.66*/(""">"""),_display_(/*62.68*/segment/*62.75*/.getMeanB()),format.raw/*62.86*/("""</td>
     		<td """),_display_(/*63.13*/if(i % 2==0)/*63.25*/ {_display_(Seq[Any](format.raw/*63.27*/("""class="tg-j0tj"""")))}/*63.44*/else/*63.49*/{_display_(Seq[Any](format.raw/*63.50*/("""class="tg-baqh"""")))}),format.raw/*63.66*/(""">"""),_display_(/*63.68*/segment/*63.75*/.getConvexity()),format.raw/*63.90*/("""</td>
     		<td """),_display_(/*64.13*/if(i % 2==0)/*64.25*/ {_display_(Seq[Any](format.raw/*64.27*/("""class="tg-j0tj"""")))}/*64.44*/else/*64.49*/{_display_(Seq[Any](format.raw/*64.50*/("""class="tg-baqh"""")))}),format.raw/*64.66*/(""">"""),_display_(/*64.68*/segment/*64.75*/.getCircularity()),format.raw/*64.92*/("""</td>
     		<td """),_display_(/*65.13*/if(i % 2==0)/*65.25*/ {_display_(Seq[Any](format.raw/*65.27*/("""class="tg-j0tj"""")))}/*65.44*/else/*65.49*/{_display_(Seq[Any](format.raw/*65.50*/("""class="tg-baqh"""")))}),format.raw/*65.66*/(""">"""),_display_(/*65.68*/segment/*65.75*/.getStdDevR()),format.raw/*65.88*/("""</td>
     		<td """),_display_(/*66.13*/if(i % 2==0)/*66.25*/ {_display_(Seq[Any](format.raw/*66.27*/("""class="tg-j0tj"""")))}/*66.44*/else/*66.49*/{_display_(Seq[Any](format.raw/*66.50*/("""class="tg-baqh"""")))}),format.raw/*66.66*/(""">"""),_display_(/*66.68*/segment/*66.75*/.getBloodStatus()),format.raw/*66.92*/("""</td>
    	</tr>
	""")))}),format.raw/*68.3*/("""
"""),format.raw/*69.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*71.50*/("""{"""),format.raw/*71.51*/(""""use strict";
function r(n,t)"""),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
	"""),format.raw/*73.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*73.49*/("""{"""),format.raw/*73.50*/("""
		"""),format.raw/*74.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*75.28*/("""{"""),format.raw/*75.29*/("""
			"""),format.raw/*76.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*77.3*/("""}"""),format.raw/*77.4*/(""" """),format.raw/*77.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*79.2*/("""}"""),format.raw/*79.3*/("""
	"""),format.raw/*80.2*/("""return e
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""
"""),format.raw/*82.1*/("""function e(n,t)"""),format.raw/*82.16*/("""{"""),format.raw/*82.17*/("""
	"""),format.raw/*83.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*85.14*/("""{"""),format.raw/*85.15*/("""
			"""),format.raw/*86.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*88.3*/("""}"""),format.raw/*88.4*/("""
	"""),format.raw/*89.2*/("""),e
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
"""),format.raw/*91.1*/("""function o(n)"""),format.raw/*91.14*/("""{"""),format.raw/*91.15*/(""" """),format.raw/*91.16*/("""return n.textContent||n.innerText||"" """),format.raw/*91.54*/("""}"""),format.raw/*91.55*/("""
"""),format.raw/*92.1*/("""function i(n)"""),format.raw/*92.14*/("""{"""),format.raw/*92.15*/("""i return n.innerHTML||"" """),format.raw/*92.40*/("""}"""),format.raw/*92.41*/("""
"""),format.raw/*93.1*/("""function u(n,t)"""),format.raw/*93.16*/("""{"""),format.raw/*93.17*/(""" """),format.raw/*93.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*93.48*/("""}"""),format.raw/*93.49*/("""
"""),format.raw/*94.1*/("""function a(n,t)"""),format.raw/*94.16*/("""{"""),format.raw/*94.17*/(""" """),format.raw/*94.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*94.48*/("""}"""),format.raw/*94.49*/("""
"""),format.raw/*95.1*/("""function c(n)"""),format.raw/*95.14*/("""{"""),format.raw/*95.15*/(""" """),format.raw/*95.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*95.66*/("""}"""),format.raw/*95.67*/("""
"""),format.raw/*96.1*/("""function f(n,t)"""),format.raw/*96.16*/("""{"""),format.raw/*96.17*/(""" """),format.raw/*96.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*96.44*/("""}"""),format.raw/*96.45*/("""
"""),format.raw/*97.1*/("""function s(n,t)"""),format.raw/*97.16*/("""{"""),format.raw/*97.17*/(""" """),format.raw/*97.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*97.47*/("""}"""),format.raw/*97.48*/("""
"""),format.raw/*98.1*/("""function d(n,t)"""),format.raw/*98.16*/("""{"""),format.raw/*98.17*/(""" 
	"""),format.raw/*99.2*/("""if(f(n,t))"""),format.raw/*99.12*/("""{"""),format.raw/*99.13*/(""" """),format.raw/*99.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*99.79*/("""}"""),format.raw/*99.80*/("""
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""
"""),format.raw/*101.1*/("""function v(n)"""),format.raw/*101.14*/("""{"""),format.raw/*101.15*/(""" """),format.raw/*101.16*/("""d(n,L),d(n,E) """),format.raw/*101.30*/("""}"""),format.raw/*101.31*/("""
"""),format.raw/*102.1*/("""function l(n,t,e)"""),format.raw/*102.18*/("""{"""),format.raw/*102.19*/(""" """),format.raw/*102.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*102.75*/("""}"""),format.raw/*102.76*/("""
"""),format.raw/*103.1*/("""function g(n)"""),format.raw/*103.14*/("""{"""),format.raw/*103.15*/("""return function(t,r)"""),format.raw/*103.35*/("""{"""),format.raw/*103.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*103.105*/("""}"""),format.raw/*103.106*/("""}"""),format.raw/*103.107*/("""function h(n)"""),format.raw/*103.120*/("""{"""),format.raw/*103.121*/("""return function(t,r)"""),format.raw/*103.141*/("""{"""),format.raw/*103.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*103.199*/("""}"""),format.raw/*103.200*/("""}"""),format.raw/*103.201*/("""function m(n,t,r)"""),format.raw/*103.218*/("""{"""),format.raw/*103.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*103.253*/("""{"""),format.raw/*103.254*/("""return"""),format.raw/*103.260*/("""{"""),format.raw/*103.261*/("""str:n,index:t"""),format.raw/*103.274*/("""}"""),format.raw/*103.275*/("""}"""),format.raw/*103.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*103.360*/("""{"""),format.raw/*103.361*/("""return n.index"""),format.raw/*103.375*/("""}"""),format.raw/*103.376*/(""")"""),format.raw/*103.377*/("""}"""),format.raw/*103.378*/("""function p(n,t,r,o)"""),format.raw/*103.397*/("""{"""),format.raw/*103.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*103.442*/("""{"""),format.raw/*103.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*103.488*/("""{"""),format.raw/*103.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*103.508*/("""}"""),format.raw/*103.509*/(""")"""),format.raw/*103.510*/("""}"""),format.raw/*103.511*/("""l(n,o,i)"""),format.raw/*103.519*/("""}"""),format.raw/*103.520*/("""function x(n,t)"""),format.raw/*103.535*/("""{"""),format.raw/*103.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*103.574*/("""{"""),format.raw/*103.575*/("""t.addEventListener("click",function()"""),format.raw/*103.612*/("""{"""),format.raw/*103.613*/("""p(n,r,e,t)"""),format.raw/*103.623*/("""}"""),format.raw/*103.624*/("""),s(t,"tg-sort-header")"""),format.raw/*103.647*/("""}"""),format.raw/*103.648*/(""")"""),format.raw/*103.649*/("""}"""),format.raw/*103.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*103.714*/("""{"""),format.raw/*103.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*103.839*/("""{"""),format.raw/*103.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*103.887*/("""}"""),format.raw/*103.888*/("""x(e,i)"""),format.raw/*103.894*/("""}"""),format.raw/*103.895*/("""}"""),format.raw/*103.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*104.58*/("""{"""),format.raw/*104.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*104.82*/("""}"""),format.raw/*104.83*/(""");
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
                  DATE: Tue Mar 14 23:15:19 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: e89137d0339a388b00a06cc1fef5e46d217550ec
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|5995->2406|6024->2414|6122->2485|6152->2494|6804->3120|6861->3161|6901->3163|6935->3170|6979->3187|7000->3199|7040->3201|7075->3218|7088->3223|7127->3224|7174->3240|7203->3242|7219->3249|7251->3260|7296->3278|7317->3290|7357->3292|7392->3309|7405->3314|7444->3315|7491->3331|7520->3333|7536->3340|7572->3355|7617->3373|7638->3385|7678->3387|7713->3404|7726->3409|7765->3410|7812->3426|7841->3428|7857->3435|7888->3445|7933->3463|7954->3475|7994->3477|8029->3494|8042->3499|8081->3500|8128->3516|8157->3518|8173->3525|8206->3537|8252->3556|8273->3568|8313->3570|8348->3587|8361->3592|8400->3593|8447->3609|8476->3611|8492->3618|8524->3629|8570->3648|8591->3660|8631->3662|8666->3679|8679->3684|8718->3685|8765->3701|8794->3703|8810->3710|8846->3725|8892->3744|8913->3756|8953->3758|8988->3775|9001->3780|9040->3781|9087->3797|9116->3799|9132->3806|9164->3817|9210->3836|9231->3848|9271->3850|9306->3867|9319->3872|9358->3873|9405->3889|9434->3891|9450->3898|9482->3909|9528->3928|9549->3940|9589->3942|9624->3959|9637->3964|9676->3965|9723->3981|9752->3983|9768->3990|9800->4001|9846->4020|9867->4032|9907->4034|9942->4051|9955->4056|9994->4057|10041->4073|10070->4075|10086->4082|10122->4097|10168->4116|10189->4128|10229->4130|10264->4147|10277->4152|10316->4153|10363->4169|10392->4171|10408->4178|10446->4195|10492->4214|10513->4226|10553->4228|10588->4245|10601->4250|10640->4251|10687->4267|10716->4269|10732->4276|10766->4289|10812->4308|10833->4320|10873->4322|10908->4339|10921->4344|10960->4345|11007->4361|11036->4363|11052->4370|11090->4387|11141->4408|11170->4410|11306->4518|11335->4519|11393->4549|11422->4550|11452->4553|11527->4600|11556->4601|11587->4605|11655->4645|11684->4646|11716->4651|11785->4693|11813->4694|11841->4695|11945->4772|11973->4773|12003->4776|12040->4786|12068->4787|12097->4789|12140->4804|12169->4805|12199->4808|12283->4864|12312->4865|12344->4870|12426->4925|12454->4926|12484->4929|12516->4934|12544->4935|12573->4937|12614->4950|12643->4951|12672->4952|12738->4990|12767->4991|12796->4993|12837->5006|12866->5007|12919->5032|12948->5033|12977->5035|13020->5050|13049->5051|13078->5052|13136->5082|13165->5083|13194->5085|13237->5100|13266->5101|13295->5102|13353->5132|13382->5133|13411->5135|13452->5148|13481->5149|13510->5150|13588->5200|13617->5201|13646->5203|13689->5218|13718->5219|13747->5220|13801->5246|13830->5247|13859->5249|13902->5264|13931->5265|13960->5266|14017->5295|14046->5296|14075->5298|14118->5313|14147->5314|14178->5318|14216->5328|14245->5329|14274->5330|14367->5395|14396->5396|14426->5398|14455->5399|14485->5401|14527->5414|14557->5415|14587->5416|14630->5430|14660->5431|14690->5433|14736->5450|14766->5451|14796->5452|14880->5507|14910->5508|14940->5510|14982->5523|15012->5524|15061->5544|15091->5545|15190->5614|15221->5615|15252->5616|15295->5629|15326->5630|15376->5650|15407->5651|15494->5708|15525->5709|15556->5710|15603->5727|15634->5728|15698->5762|15729->5763|15765->5769|15796->5770|15839->5783|15870->5784|15901->5785|16015->5869|16046->5870|16090->5884|16121->5885|16152->5886|16183->5887|16232->5906|16263->5907|16337->5951|16368->5952|16443->5997|16474->5998|16523->6017|16554->6018|16585->6019|16616->6020|16654->6028|16685->6029|16730->6044|16761->6045|16829->6083|16860->6084|16927->6121|16958->6122|16998->6132|17029->6133|17082->6156|17113->6157|17144->6158|17175->6159|17269->6223|17300->6224|17454->6348|17485->6349|17562->6396|17593->6397|17629->6403|17660->6404|17691->6405|17790->6475|17820->6476|17872->6499|17902->6500
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|60->29|60->29|61->30|61->30|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|99->68|100->69|102->71|102->71|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|107->76|108->77|108->77|108->77|110->79|110->79|111->80|112->81|112->81|113->82|113->82|113->82|114->83|116->85|116->85|117->86|119->88|119->88|120->89|121->90|121->90|122->91|122->91|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|130->99|130->99|130->99|131->100|131->100|132->101|132->101|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104
                  -- GENERATED --
              */
          