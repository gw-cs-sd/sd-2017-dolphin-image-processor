
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
    	<th class="tg-amwm">RelativeX</th>
    	<th class="tg-amwm">RelativeY</th>
    	<th class="tg-amwm">RelativeArea</th>
    	<th class="tg-amwm">SegmentCount</th>
    	<th class="tg-amwm">Blood Status</th>
    </tr>

	"""),_display_(/*56.3*/for((segment,i) <- segments.zipWithIndex) yield /*56.44*/ {_display_(Seq[Any](format.raw/*56.46*/("""
    	"""),format.raw/*57.6*/("""<tr>
    		<td """),_display_(/*58.12*/if(i % 2==0)/*58.24*/ {_display_(Seq[Any](format.raw/*58.26*/("""class="tg-j0tj"""")))}/*58.43*/else/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""class="tg-baqh"""")))}),format.raw/*58.65*/(""">"""),_display_(/*58.67*/segment/*58.74*/.getLabel()),format.raw/*58.85*/("""</td>
    		<td """),_display_(/*59.12*/if(i % 2==0)/*59.24*/ {_display_(Seq[Any](format.raw/*59.26*/("""class="tg-6k2t"""")))}/*59.43*/else/*59.48*/{_display_(Seq[Any](format.raw/*59.49*/("""class="tg-yw4l"""")))}),format.raw/*59.65*/(""">"""),_display_(/*59.67*/segment/*59.74*/.getSegmentId()),format.raw/*59.89*/("""</td>
    		<td """),_display_(/*60.12*/if(i % 2==0)/*60.24*/ {_display_(Seq[Any](format.raw/*60.26*/("""class="tg-j0tj"""")))}/*60.43*/else/*60.48*/{_display_(Seq[Any](format.raw/*60.49*/("""class="tg-baqh"""")))}),format.raw/*60.65*/(""">"""),_display_(/*60.67*/segment/*60.74*/.getArea()),format.raw/*60.84*/("""</td>
    		<td """),_display_(/*61.12*/if(i % 2==0)/*61.24*/ {_display_(Seq[Any](format.raw/*61.26*/("""class="tg-j0tj"""")))}/*61.43*/else/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""class="tg-baqh"""")))}),format.raw/*61.65*/(""">"""),_display_(/*61.67*/segment/*61.74*/.getHeight()),format.raw/*61.86*/("""</td>
     		<td """),_display_(/*62.13*/if(i % 2==0)/*62.25*/ {_display_(Seq[Any](format.raw/*62.27*/("""class="tg-j0tj"""")))}/*62.44*/else/*62.49*/{_display_(Seq[Any](format.raw/*62.50*/("""class="tg-baqh"""")))}),format.raw/*62.66*/(""">"""),_display_(/*62.68*/segment/*62.75*/.getWidth()),format.raw/*62.86*/("""</td>
     		<td """),_display_(/*63.13*/if(i % 2==0)/*63.25*/ {_display_(Seq[Any](format.raw/*63.27*/("""class="tg-j0tj"""")))}/*63.44*/else/*63.49*/{_display_(Seq[Any](format.raw/*63.50*/("""class="tg-baqh"""")))}),format.raw/*63.66*/(""">"""),_display_(/*63.68*/segment/*63.75*/.getPerimeter()),format.raw/*63.90*/("""</td>
     		<td """),_display_(/*64.13*/if(i % 2==0)/*64.25*/ {_display_(Seq[Any](format.raw/*64.27*/("""class="tg-j0tj"""")))}/*64.44*/else/*64.49*/{_display_(Seq[Any](format.raw/*64.50*/("""class="tg-baqh"""")))}),format.raw/*64.66*/(""">"""),_display_(/*64.68*/segment/*64.75*/.getMeanR()),format.raw/*64.86*/("""</td>
     		<td """),_display_(/*65.13*/if(i % 2==0)/*65.25*/ {_display_(Seq[Any](format.raw/*65.27*/("""class="tg-j0tj"""")))}/*65.44*/else/*65.49*/{_display_(Seq[Any](format.raw/*65.50*/("""class="tg-baqh"""")))}),format.raw/*65.66*/(""">"""),_display_(/*65.68*/segment/*65.75*/.getMeanG()),format.raw/*65.86*/("""</td>
     		<td """),_display_(/*66.13*/if(i % 2==0)/*66.25*/ {_display_(Seq[Any](format.raw/*66.27*/("""class="tg-j0tj"""")))}/*66.44*/else/*66.49*/{_display_(Seq[Any](format.raw/*66.50*/("""class="tg-baqh"""")))}),format.raw/*66.66*/(""">"""),_display_(/*66.68*/segment/*66.75*/.getMeanB()),format.raw/*66.86*/("""</td>
     		<td """),_display_(/*67.13*/if(i % 2==0)/*67.25*/ {_display_(Seq[Any](format.raw/*67.27*/("""class="tg-j0tj"""")))}/*67.44*/else/*67.49*/{_display_(Seq[Any](format.raw/*67.50*/("""class="tg-baqh"""")))}),format.raw/*67.66*/(""">"""),_display_(/*67.68*/segment/*67.75*/.getConvexity()),format.raw/*67.90*/("""</td>
     		<td """),_display_(/*68.13*/if(i % 2==0)/*68.25*/ {_display_(Seq[Any](format.raw/*68.27*/("""class="tg-j0tj"""")))}/*68.44*/else/*68.49*/{_display_(Seq[Any](format.raw/*68.50*/("""class="tg-baqh"""")))}),format.raw/*68.66*/(""">"""),_display_(/*68.68*/segment/*68.75*/.getCircularity()),format.raw/*68.92*/("""</td>
     		<td """),_display_(/*69.13*/if(i % 2==0)/*69.25*/ {_display_(Seq[Any](format.raw/*69.27*/("""class="tg-j0tj"""")))}/*69.44*/else/*69.49*/{_display_(Seq[Any](format.raw/*69.50*/("""class="tg-baqh"""")))}),format.raw/*69.66*/(""">"""),_display_(/*69.68*/segment/*69.75*/.getStdDevR()),format.raw/*69.88*/("""</td>
     		<td """),_display_(/*70.13*/if(i % 2==0)/*70.25*/ {_display_(Seq[Any](format.raw/*70.27*/("""class="tg-j0tj"""")))}/*70.44*/else/*70.49*/{_display_(Seq[Any](format.raw/*70.50*/("""class="tg-baqh"""")))}),format.raw/*70.66*/(""">"""),_display_(/*70.68*/segment/*70.75*/.getRelativeX()),format.raw/*70.90*/("""</td>
     		<td """),_display_(/*71.13*/if(i % 2==0)/*71.25*/ {_display_(Seq[Any](format.raw/*71.27*/("""class="tg-j0tj"""")))}/*71.44*/else/*71.49*/{_display_(Seq[Any](format.raw/*71.50*/("""class="tg-baqh"""")))}),format.raw/*71.66*/(""">"""),_display_(/*71.68*/segment/*71.75*/.getRelativeY()),format.raw/*71.90*/("""</td>
     		<td """),_display_(/*72.13*/if(i % 2==0)/*72.25*/ {_display_(Seq[Any](format.raw/*72.27*/("""class="tg-j0tj"""")))}/*72.44*/else/*72.49*/{_display_(Seq[Any](format.raw/*72.50*/("""class="tg-baqh"""")))}),format.raw/*72.66*/(""">"""),_display_(/*72.68*/segment/*72.75*/.getRelativeArea()),format.raw/*72.93*/("""</td>
     		<td """),_display_(/*73.13*/if(i % 2==0)/*73.25*/ {_display_(Seq[Any](format.raw/*73.27*/("""class="tg-j0tj"""")))}/*73.44*/else/*73.49*/{_display_(Seq[Any](format.raw/*73.50*/("""class="tg-baqh"""")))}),format.raw/*73.66*/(""">"""),_display_(/*73.68*/segment/*73.75*/.getSegmentCount()),format.raw/*73.93*/("""</td>
     		<td """),_display_(/*74.13*/if(i % 2==0)/*74.25*/ {_display_(Seq[Any](format.raw/*74.27*/("""class="tg-j0tj"""")))}/*74.44*/else/*74.49*/{_display_(Seq[Any](format.raw/*74.50*/("""class="tg-baqh"""")))}),format.raw/*74.66*/(""">"""),_display_(/*74.68*/segment/*74.75*/.getBloodStatus()),format.raw/*74.92*/("""</td>
    	</tr>
	""")))}),format.raw/*76.3*/("""
"""),format.raw/*77.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*79.50*/("""{"""),format.raw/*79.51*/(""""use strict";
function r(n,t)"""),format.raw/*80.16*/("""{"""),format.raw/*80.17*/("""
	"""),format.raw/*81.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*81.49*/("""{"""),format.raw/*81.50*/("""
		"""),format.raw/*82.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*83.28*/("""{"""),format.raw/*83.29*/("""
			"""),format.raw/*84.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*85.3*/("""}"""),format.raw/*85.4*/(""" """),format.raw/*85.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*87.2*/("""}"""),format.raw/*87.3*/("""
	"""),format.raw/*88.2*/("""return e
"""),format.raw/*89.1*/("""}"""),format.raw/*89.2*/("""
"""),format.raw/*90.1*/("""function e(n,t)"""),format.raw/*90.16*/("""{"""),format.raw/*90.17*/("""
	"""),format.raw/*91.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*93.14*/("""{"""),format.raw/*93.15*/("""
			"""),format.raw/*94.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/("""
	"""),format.raw/*97.2*/("""),e
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""
"""),format.raw/*99.1*/("""function o(n)"""),format.raw/*99.14*/("""{"""),format.raw/*99.15*/(""" """),format.raw/*99.16*/("""return n.textContent||n.innerText||"" """),format.raw/*99.54*/("""}"""),format.raw/*99.55*/("""
"""),format.raw/*100.1*/("""function i(n)"""),format.raw/*100.14*/("""{"""),format.raw/*100.15*/("""i return n.innerHTML||"" """),format.raw/*100.40*/("""}"""),format.raw/*100.41*/("""
"""),format.raw/*101.1*/("""function u(n,t)"""),format.raw/*101.16*/("""{"""),format.raw/*101.17*/(""" """),format.raw/*101.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*101.48*/("""}"""),format.raw/*101.49*/("""
"""),format.raw/*102.1*/("""function a(n,t)"""),format.raw/*102.16*/("""{"""),format.raw/*102.17*/(""" """),format.raw/*102.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*102.48*/("""}"""),format.raw/*102.49*/("""
"""),format.raw/*103.1*/("""function c(n)"""),format.raw/*103.14*/("""{"""),format.raw/*103.15*/(""" """),format.raw/*103.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*103.66*/("""}"""),format.raw/*103.67*/("""
"""),format.raw/*104.1*/("""function f(n,t)"""),format.raw/*104.16*/("""{"""),format.raw/*104.17*/(""" """),format.raw/*104.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*104.44*/("""}"""),format.raw/*104.45*/("""
"""),format.raw/*105.1*/("""function s(n,t)"""),format.raw/*105.16*/("""{"""),format.raw/*105.17*/(""" """),format.raw/*105.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*105.47*/("""}"""),format.raw/*105.48*/("""
"""),format.raw/*106.1*/("""function d(n,t)"""),format.raw/*106.16*/("""{"""),format.raw/*106.17*/(""" 
	"""),format.raw/*107.2*/("""if(f(n,t))"""),format.raw/*107.12*/("""{"""),format.raw/*107.13*/(""" """),format.raw/*107.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*107.79*/("""}"""),format.raw/*107.80*/("""
"""),format.raw/*108.1*/("""}"""),format.raw/*108.2*/("""
"""),format.raw/*109.1*/("""function v(n)"""),format.raw/*109.14*/("""{"""),format.raw/*109.15*/(""" """),format.raw/*109.16*/("""d(n,L),d(n,E) """),format.raw/*109.30*/("""}"""),format.raw/*109.31*/("""
"""),format.raw/*110.1*/("""function l(n,t,e)"""),format.raw/*110.18*/("""{"""),format.raw/*110.19*/(""" """),format.raw/*110.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*110.75*/("""}"""),format.raw/*110.76*/("""
"""),format.raw/*111.1*/("""function g(n)"""),format.raw/*111.14*/("""{"""),format.raw/*111.15*/("""return function(t,r)"""),format.raw/*111.35*/("""{"""),format.raw/*111.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*111.105*/("""}"""),format.raw/*111.106*/("""}"""),format.raw/*111.107*/("""function h(n)"""),format.raw/*111.120*/("""{"""),format.raw/*111.121*/("""return function(t,r)"""),format.raw/*111.141*/("""{"""),format.raw/*111.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*111.199*/("""}"""),format.raw/*111.200*/("""}"""),format.raw/*111.201*/("""function m(n,t,r)"""),format.raw/*111.218*/("""{"""),format.raw/*111.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*111.253*/("""{"""),format.raw/*111.254*/("""return"""),format.raw/*111.260*/("""{"""),format.raw/*111.261*/("""str:n,index:t"""),format.raw/*111.274*/("""}"""),format.raw/*111.275*/("""}"""),format.raw/*111.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*111.360*/("""{"""),format.raw/*111.361*/("""return n.index"""),format.raw/*111.375*/("""}"""),format.raw/*111.376*/(""")"""),format.raw/*111.377*/("""}"""),format.raw/*111.378*/("""function p(n,t,r,o)"""),format.raw/*111.397*/("""{"""),format.raw/*111.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*111.442*/("""{"""),format.raw/*111.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*111.488*/("""{"""),format.raw/*111.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*111.508*/("""}"""),format.raw/*111.509*/(""")"""),format.raw/*111.510*/("""}"""),format.raw/*111.511*/("""l(n,o,i)"""),format.raw/*111.519*/("""}"""),format.raw/*111.520*/("""function x(n,t)"""),format.raw/*111.535*/("""{"""),format.raw/*111.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*111.574*/("""{"""),format.raw/*111.575*/("""t.addEventListener("click",function()"""),format.raw/*111.612*/("""{"""),format.raw/*111.613*/("""p(n,r,e,t)"""),format.raw/*111.623*/("""}"""),format.raw/*111.624*/("""),s(t,"tg-sort-header")"""),format.raw/*111.647*/("""}"""),format.raw/*111.648*/(""")"""),format.raw/*111.649*/("""}"""),format.raw/*111.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*111.714*/("""{"""),format.raw/*111.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*111.839*/("""{"""),format.raw/*111.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*111.887*/("""}"""),format.raw/*111.888*/("""x(e,i)"""),format.raw/*111.894*/("""}"""),format.raw/*111.895*/("""}"""),format.raw/*111.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*112.58*/("""{"""),format.raw/*112.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*112.82*/("""}"""),format.raw/*112.83*/(""");
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
                  DATE: Thu Mar 16 21:24:42 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: f60357dbdad64b2ed385329286838f439cd3310a
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|5995->2406|6024->2414|6122->2485|6152->2494|6974->3290|7031->3331|7071->3333|7105->3340|7149->3357|7170->3369|7210->3371|7245->3388|7258->3393|7297->3394|7344->3410|7373->3412|7389->3419|7421->3430|7466->3448|7487->3460|7527->3462|7562->3479|7575->3484|7614->3485|7661->3501|7690->3503|7706->3510|7742->3525|7787->3543|7808->3555|7848->3557|7883->3574|7896->3579|7935->3580|7982->3596|8011->3598|8027->3605|8058->3615|8103->3633|8124->3645|8164->3647|8199->3664|8212->3669|8251->3670|8298->3686|8327->3688|8343->3695|8376->3707|8422->3726|8443->3738|8483->3740|8518->3757|8531->3762|8570->3763|8617->3779|8646->3781|8662->3788|8694->3799|8740->3818|8761->3830|8801->3832|8836->3849|8849->3854|8888->3855|8935->3871|8964->3873|8980->3880|9016->3895|9062->3914|9083->3926|9123->3928|9158->3945|9171->3950|9210->3951|9257->3967|9286->3969|9302->3976|9334->3987|9380->4006|9401->4018|9441->4020|9476->4037|9489->4042|9528->4043|9575->4059|9604->4061|9620->4068|9652->4079|9698->4098|9719->4110|9759->4112|9794->4129|9807->4134|9846->4135|9893->4151|9922->4153|9938->4160|9970->4171|10016->4190|10037->4202|10077->4204|10112->4221|10125->4226|10164->4227|10211->4243|10240->4245|10256->4252|10292->4267|10338->4286|10359->4298|10399->4300|10434->4317|10447->4322|10486->4323|10533->4339|10562->4341|10578->4348|10616->4365|10662->4384|10683->4396|10723->4398|10758->4415|10771->4420|10810->4421|10857->4437|10886->4439|10902->4446|10936->4459|10982->4478|11003->4490|11043->4492|11078->4509|11091->4514|11130->4515|11177->4531|11206->4533|11222->4540|11258->4555|11304->4574|11325->4586|11365->4588|11400->4605|11413->4610|11452->4611|11499->4627|11528->4629|11544->4636|11580->4651|11626->4670|11647->4682|11687->4684|11722->4701|11735->4706|11774->4707|11821->4723|11850->4725|11866->4732|11905->4750|11951->4769|11972->4781|12012->4783|12047->4800|12060->4805|12099->4806|12146->4822|12175->4824|12191->4831|12230->4849|12276->4868|12297->4880|12337->4882|12372->4899|12385->4904|12424->4905|12471->4921|12500->4923|12516->4930|12554->4947|12605->4968|12634->4970|12770->5078|12799->5079|12857->5109|12886->5110|12916->5113|12991->5160|13020->5161|13051->5165|13119->5205|13148->5206|13180->5211|13249->5253|13277->5254|13305->5255|13409->5332|13437->5333|13467->5336|13504->5346|13532->5347|13561->5349|13604->5364|13633->5365|13663->5368|13747->5424|13776->5425|13808->5430|13890->5485|13918->5486|13948->5489|13980->5494|14008->5495|14037->5497|14078->5510|14107->5511|14136->5512|14202->5550|14231->5551|14261->5553|14303->5566|14333->5567|14387->5592|14417->5593|14447->5595|14491->5610|14521->5611|14551->5612|14610->5642|14640->5643|14670->5645|14714->5660|14744->5661|14774->5662|14833->5692|14863->5693|14893->5695|14935->5708|14965->5709|14995->5710|15074->5760|15104->5761|15134->5763|15178->5778|15208->5779|15238->5780|15293->5806|15323->5807|15353->5809|15397->5824|15427->5825|15457->5826|15515->5855|15545->5856|15575->5858|15619->5873|15649->5874|15681->5878|15720->5888|15750->5889|15780->5890|15874->5955|15904->5956|15934->5958|15963->5959|15993->5961|16035->5974|16065->5975|16095->5976|16138->5990|16168->5991|16198->5993|16244->6010|16274->6011|16304->6012|16388->6067|16418->6068|16448->6070|16490->6083|16520->6084|16569->6104|16599->6105|16698->6174|16729->6175|16760->6176|16803->6189|16834->6190|16884->6210|16915->6211|17002->6268|17033->6269|17064->6270|17111->6287|17142->6288|17206->6322|17237->6323|17273->6329|17304->6330|17347->6343|17378->6344|17409->6345|17523->6429|17554->6430|17598->6444|17629->6445|17660->6446|17691->6447|17740->6466|17771->6467|17845->6511|17876->6512|17951->6557|17982->6558|18031->6577|18062->6578|18093->6579|18124->6580|18162->6588|18193->6589|18238->6604|18269->6605|18337->6643|18368->6644|18435->6681|18466->6682|18506->6692|18537->6693|18590->6716|18621->6717|18652->6718|18683->6719|18777->6783|18808->6784|18962->6908|18993->6909|19070->6956|19101->6957|19137->6963|19168->6964|19199->6965|19298->7035|19328->7036|19380->7059|19410->7060
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|60->29|60->29|61->30|61->30|87->56|87->56|87->56|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|107->76|108->77|110->79|110->79|111->80|111->80|112->81|112->81|112->81|113->82|114->83|114->83|115->84|116->85|116->85|116->85|118->87|118->87|119->88|120->89|120->89|121->90|121->90|121->90|122->91|124->93|124->93|125->94|127->96|127->96|128->97|129->98|129->98|130->99|130->99|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|131->100|132->101|132->101|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|138->107|138->107|138->107|138->107|138->107|138->107|139->108|139->108|140->109|140->109|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112
                  -- GENERATED --
              */
          