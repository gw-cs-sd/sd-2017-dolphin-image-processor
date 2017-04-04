
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

class segments extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,String,DBSample,String,String,String,List[DBSegment],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sampleId: String, userName: String, sample: DBSample, imagePath: String, displayWidth: String, displayHeight: String, segments: List[DBSegment], evalSummary: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.168*/("""

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
"""),format.raw/*14.1*/("""pre """),format.raw/*14.5*/("""{"""),format.raw/*14.6*/("""
    	"""),format.raw/*15.6*/("""text-align: left;
    	white-space: pre-line;
    	display: inline-block;
    	font-size:14px;
  	"""),format.raw/*19.4*/("""}"""),format.raw/*19.5*/("""
"""),format.raw/*20.1*/("""</style>


<table id="tg-cFHod" class="tg">
	<tr><td class="tg-j0tj" style="text-align: center;">sampleId """),_display_(/*24.64*/sampleId),format.raw/*24.72*/(""" """),format.raw/*24.73*/(""": """),_display_(/*24.76*/userName),format.raw/*24.84*/("""</td></tr>
    <tr><td class="tg-baqh" style="text-align: center;">
    	<img src="assets/"""),_display_(/*26.24*/imagePath),format.raw/*26.33*/("""" height=""""),_display_(/*26.44*/displayHeight),format.raw/*26.57*/("""" width=""""),_display_(/*26.67*/displayWidth),format.raw/*26.79*/("""" alt=""""),_display_(/*26.87*/sample/*26.93*/.getName()),format.raw/*26.103*/("""">
    	</td>
    </tr>
    <tr>
    <td class="tg-baqh" style="text-align: center;">
    <form action="backToSample" method='POST' enctype="multipart/form-data" id="backToSampleForm">
    <button type="submit" form="backToSampleForm" value=""""),_display_(/*32.59*/sample/*32.65*/.getUserId()),format.raw/*32.77*/(""""  name="backUserId" >Back</button>
    </form>
    <form action="viewExamination" method='POST' enctype="multipart/form-data" id="viewExaminationForm">
    <button type="submit" form="viewExaminationForm" value=""""),_display_(/*35.62*/sampleId),format.raw/*35.70*/(""""  name="sampleId" >Examine</button>
    <input type="hidden" value=""""),_display_(/*36.34*/imagePath),format.raw/*36.43*/("""" name="imagePath">
    </form>
    
    <form action="evaluateSample" method='POST' enctype="multipart/form-data" id="evaluateForm">
    <button type="submit" form="evaluateForm" value=""""),_display_(/*40.55*/sampleId),format.raw/*40.63*/(""""  name="sampleId" >Classify</button>
    </form>
    <div style="text-align: center;">
    	<pre>"""),_display_(/*43.12*/evalSummary),format.raw/*43.23*/("""</pre>
    </div>
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

	"""),_display_(/*69.3*/for((segment,i) <- segments.zipWithIndex) yield /*69.44*/ {_display_(Seq[Any](format.raw/*69.46*/("""
    	"""),format.raw/*70.6*/("""<tr>
    		<td """),_display_(/*71.12*/if(i % 2==0)/*71.24*/ {_display_(Seq[Any](format.raw/*71.26*/("""class="tg-j0tj"""")))}/*71.43*/else/*71.48*/{_display_(Seq[Any](format.raw/*71.49*/("""class="tg-baqh"""")))}),format.raw/*71.65*/(""">"""),_display_(/*71.67*/segment/*71.74*/.getLabel()),format.raw/*71.85*/("""</td>
    		<td """),_display_(/*72.12*/if(i % 2==0)/*72.24*/ {_display_(Seq[Any](format.raw/*72.26*/("""class="tg-6k2t"""")))}/*72.43*/else/*72.48*/{_display_(Seq[Any](format.raw/*72.49*/("""class="tg-yw4l"""")))}),format.raw/*72.65*/(""">"""),_display_(/*72.67*/segment/*72.74*/.getSegmentId()),format.raw/*72.89*/("""</td>
    		<td """),_display_(/*73.12*/if(i % 2==0)/*73.24*/ {_display_(Seq[Any](format.raw/*73.26*/("""class="tg-j0tj"""")))}/*73.43*/else/*73.48*/{_display_(Seq[Any](format.raw/*73.49*/("""class="tg-baqh"""")))}),format.raw/*73.65*/(""">"""),_display_(/*73.67*/segment/*73.74*/.getArea()),format.raw/*73.84*/("""</td>
    		<td """),_display_(/*74.12*/if(i % 2==0)/*74.24*/ {_display_(Seq[Any](format.raw/*74.26*/("""class="tg-j0tj"""")))}/*74.43*/else/*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""class="tg-baqh"""")))}),format.raw/*74.65*/(""">"""),_display_(/*74.67*/segment/*74.74*/.getHeight()),format.raw/*74.86*/("""</td>
     		<td """),_display_(/*75.13*/if(i % 2==0)/*75.25*/ {_display_(Seq[Any](format.raw/*75.27*/("""class="tg-j0tj"""")))}/*75.44*/else/*75.49*/{_display_(Seq[Any](format.raw/*75.50*/("""class="tg-baqh"""")))}),format.raw/*75.66*/(""">"""),_display_(/*75.68*/segment/*75.75*/.getWidth()),format.raw/*75.86*/("""</td>
     		<td """),_display_(/*76.13*/if(i % 2==0)/*76.25*/ {_display_(Seq[Any](format.raw/*76.27*/("""class="tg-j0tj"""")))}/*76.44*/else/*76.49*/{_display_(Seq[Any](format.raw/*76.50*/("""class="tg-baqh"""")))}),format.raw/*76.66*/(""">"""),_display_(/*76.68*/segment/*76.75*/.getPerimeter()),format.raw/*76.90*/("""</td>
     		<td """),_display_(/*77.13*/if(i % 2==0)/*77.25*/ {_display_(Seq[Any](format.raw/*77.27*/("""class="tg-j0tj"""")))}/*77.44*/else/*77.49*/{_display_(Seq[Any](format.raw/*77.50*/("""class="tg-baqh"""")))}),format.raw/*77.66*/(""">"""),_display_(/*77.68*/segment/*77.75*/.getMeanR()),format.raw/*77.86*/("""</td>
     		<td """),_display_(/*78.13*/if(i % 2==0)/*78.25*/ {_display_(Seq[Any](format.raw/*78.27*/("""class="tg-j0tj"""")))}/*78.44*/else/*78.49*/{_display_(Seq[Any](format.raw/*78.50*/("""class="tg-baqh"""")))}),format.raw/*78.66*/(""">"""),_display_(/*78.68*/segment/*78.75*/.getMeanG()),format.raw/*78.86*/("""</td>
     		<td """),_display_(/*79.13*/if(i % 2==0)/*79.25*/ {_display_(Seq[Any](format.raw/*79.27*/("""class="tg-j0tj"""")))}/*79.44*/else/*79.49*/{_display_(Seq[Any](format.raw/*79.50*/("""class="tg-baqh"""")))}),format.raw/*79.66*/(""">"""),_display_(/*79.68*/segment/*79.75*/.getMeanB()),format.raw/*79.86*/("""</td>
     		<td """),_display_(/*80.13*/if(i % 2==0)/*80.25*/ {_display_(Seq[Any](format.raw/*80.27*/("""class="tg-j0tj"""")))}/*80.44*/else/*80.49*/{_display_(Seq[Any](format.raw/*80.50*/("""class="tg-baqh"""")))}),format.raw/*80.66*/(""">"""),_display_(/*80.68*/segment/*80.75*/.getConvexity()),format.raw/*80.90*/("""</td>
     		<td """),_display_(/*81.13*/if(i % 2==0)/*81.25*/ {_display_(Seq[Any](format.raw/*81.27*/("""class="tg-j0tj"""")))}/*81.44*/else/*81.49*/{_display_(Seq[Any](format.raw/*81.50*/("""class="tg-baqh"""")))}),format.raw/*81.66*/(""">"""),_display_(/*81.68*/segment/*81.75*/.getCircularity()),format.raw/*81.92*/("""</td>
     		<td """),_display_(/*82.13*/if(i % 2==0)/*82.25*/ {_display_(Seq[Any](format.raw/*82.27*/("""class="tg-j0tj"""")))}/*82.44*/else/*82.49*/{_display_(Seq[Any](format.raw/*82.50*/("""class="tg-baqh"""")))}),format.raw/*82.66*/(""">"""),_display_(/*82.68*/segment/*82.75*/.getStdDevR()),format.raw/*82.88*/("""</td>
     		<td """),_display_(/*83.13*/if(i % 2==0)/*83.25*/ {_display_(Seq[Any](format.raw/*83.27*/("""class="tg-j0tj"""")))}/*83.44*/else/*83.49*/{_display_(Seq[Any](format.raw/*83.50*/("""class="tg-baqh"""")))}),format.raw/*83.66*/(""">"""),_display_(/*83.68*/segment/*83.75*/.getRelativeX()),format.raw/*83.90*/("""</td>
     		<td """),_display_(/*84.13*/if(i % 2==0)/*84.25*/ {_display_(Seq[Any](format.raw/*84.27*/("""class="tg-j0tj"""")))}/*84.44*/else/*84.49*/{_display_(Seq[Any](format.raw/*84.50*/("""class="tg-baqh"""")))}),format.raw/*84.66*/(""">"""),_display_(/*84.68*/segment/*84.75*/.getRelativeY()),format.raw/*84.90*/("""</td>
     		<td """),_display_(/*85.13*/if(i % 2==0)/*85.25*/ {_display_(Seq[Any](format.raw/*85.27*/("""class="tg-j0tj"""")))}/*85.44*/else/*85.49*/{_display_(Seq[Any](format.raw/*85.50*/("""class="tg-baqh"""")))}),format.raw/*85.66*/(""">"""),_display_(/*85.68*/segment/*85.75*/.getRelativeArea()),format.raw/*85.93*/("""</td>
     		<td """),_display_(/*86.13*/if(i % 2==0)/*86.25*/ {_display_(Seq[Any](format.raw/*86.27*/("""class="tg-j0tj"""")))}/*86.44*/else/*86.49*/{_display_(Seq[Any](format.raw/*86.50*/("""class="tg-baqh"""")))}),format.raw/*86.66*/(""">"""),_display_(/*86.68*/segment/*86.75*/.getSegmentCount()),format.raw/*86.93*/("""</td>
     		<td """),_display_(/*87.13*/if(i % 2==0)/*87.25*/ {_display_(Seq[Any](format.raw/*87.27*/("""class="tg-j0tj"""")))}/*87.44*/else/*87.49*/{_display_(Seq[Any](format.raw/*87.50*/("""class="tg-baqh"""")))}),format.raw/*87.66*/(""">"""),_display_(/*87.68*/segment/*87.75*/.getBloodStatus()),format.raw/*87.92*/("""</td>
    	</tr>
	""")))}),format.raw/*89.3*/("""
"""),format.raw/*90.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*92.50*/("""{"""),format.raw/*92.51*/(""""use strict";
function r(n,t)"""),format.raw/*93.16*/("""{"""),format.raw/*93.17*/("""
	"""),format.raw/*94.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*94.49*/("""{"""),format.raw/*94.50*/("""
		"""),format.raw/*95.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*96.28*/("""{"""),format.raw/*96.29*/("""
			"""),format.raw/*97.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*98.3*/("""}"""),format.raw/*98.4*/(""" """),format.raw/*98.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*100.2*/("""}"""),format.raw/*100.3*/("""
	"""),format.raw/*101.2*/("""return e
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""
"""),format.raw/*103.1*/("""function e(n,t)"""),format.raw/*103.16*/("""{"""),format.raw/*103.17*/("""
	"""),format.raw/*104.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*106.14*/("""{"""),format.raw/*106.15*/("""
			"""),format.raw/*107.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*109.3*/("""}"""),format.raw/*109.4*/("""
	"""),format.raw/*110.2*/("""),e
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/("""
"""),format.raw/*112.1*/("""function o(n)"""),format.raw/*112.14*/("""{"""),format.raw/*112.15*/(""" """),format.raw/*112.16*/("""return n.textContent||n.innerText||"" """),format.raw/*112.54*/("""}"""),format.raw/*112.55*/("""
"""),format.raw/*113.1*/("""function i(n)"""),format.raw/*113.14*/("""{"""),format.raw/*113.15*/("""i return n.innerHTML||"" """),format.raw/*113.40*/("""}"""),format.raw/*113.41*/("""
"""),format.raw/*114.1*/("""function u(n,t)"""),format.raw/*114.16*/("""{"""),format.raw/*114.17*/(""" """),format.raw/*114.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*114.48*/("""}"""),format.raw/*114.49*/("""
"""),format.raw/*115.1*/("""function a(n,t)"""),format.raw/*115.16*/("""{"""),format.raw/*115.17*/(""" """),format.raw/*115.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*115.48*/("""}"""),format.raw/*115.49*/("""
"""),format.raw/*116.1*/("""function c(n)"""),format.raw/*116.14*/("""{"""),format.raw/*116.15*/(""" """),format.raw/*116.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*116.66*/("""}"""),format.raw/*116.67*/("""
"""),format.raw/*117.1*/("""function f(n,t)"""),format.raw/*117.16*/("""{"""),format.raw/*117.17*/(""" """),format.raw/*117.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*117.44*/("""}"""),format.raw/*117.45*/("""
"""),format.raw/*118.1*/("""function s(n,t)"""),format.raw/*118.16*/("""{"""),format.raw/*118.17*/(""" """),format.raw/*118.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*118.47*/("""}"""),format.raw/*118.48*/("""
"""),format.raw/*119.1*/("""function d(n,t)"""),format.raw/*119.16*/("""{"""),format.raw/*119.17*/(""" 
	"""),format.raw/*120.2*/("""if(f(n,t))"""),format.raw/*120.12*/("""{"""),format.raw/*120.13*/(""" """),format.raw/*120.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*120.79*/("""}"""),format.raw/*120.80*/("""
"""),format.raw/*121.1*/("""}"""),format.raw/*121.2*/("""
"""),format.raw/*122.1*/("""function v(n)"""),format.raw/*122.14*/("""{"""),format.raw/*122.15*/(""" """),format.raw/*122.16*/("""d(n,L),d(n,E) """),format.raw/*122.30*/("""}"""),format.raw/*122.31*/("""
"""),format.raw/*123.1*/("""function l(n,t,e)"""),format.raw/*123.18*/("""{"""),format.raw/*123.19*/(""" """),format.raw/*123.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*123.75*/("""}"""),format.raw/*123.76*/("""
"""),format.raw/*124.1*/("""function g(n)"""),format.raw/*124.14*/("""{"""),format.raw/*124.15*/("""return function(t,r)"""),format.raw/*124.35*/("""{"""),format.raw/*124.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*124.105*/("""}"""),format.raw/*124.106*/("""}"""),format.raw/*124.107*/("""function h(n)"""),format.raw/*124.120*/("""{"""),format.raw/*124.121*/("""return function(t,r)"""),format.raw/*124.141*/("""{"""),format.raw/*124.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*124.199*/("""}"""),format.raw/*124.200*/("""}"""),format.raw/*124.201*/("""function m(n,t,r)"""),format.raw/*124.218*/("""{"""),format.raw/*124.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*124.253*/("""{"""),format.raw/*124.254*/("""return"""),format.raw/*124.260*/("""{"""),format.raw/*124.261*/("""str:n,index:t"""),format.raw/*124.274*/("""}"""),format.raw/*124.275*/("""}"""),format.raw/*124.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*124.360*/("""{"""),format.raw/*124.361*/("""return n.index"""),format.raw/*124.375*/("""}"""),format.raw/*124.376*/(""")"""),format.raw/*124.377*/("""}"""),format.raw/*124.378*/("""function p(n,t,r,o)"""),format.raw/*124.397*/("""{"""),format.raw/*124.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*124.442*/("""{"""),format.raw/*124.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*124.488*/("""{"""),format.raw/*124.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*124.508*/("""}"""),format.raw/*124.509*/(""")"""),format.raw/*124.510*/("""}"""),format.raw/*124.511*/("""l(n,o,i)"""),format.raw/*124.519*/("""}"""),format.raw/*124.520*/("""function x(n,t)"""),format.raw/*124.535*/("""{"""),format.raw/*124.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*124.574*/("""{"""),format.raw/*124.575*/("""t.addEventListener("click",function()"""),format.raw/*124.612*/("""{"""),format.raw/*124.613*/("""p(n,r,e,t)"""),format.raw/*124.623*/("""}"""),format.raw/*124.624*/("""),s(t,"tg-sort-header")"""),format.raw/*124.647*/("""}"""),format.raw/*124.648*/(""")"""),format.raw/*124.649*/("""}"""),format.raw/*124.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*124.714*/("""{"""),format.raw/*124.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*124.839*/("""{"""),format.raw/*124.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*124.887*/("""}"""),format.raw/*124.888*/("""x(e,i)"""),format.raw/*124.894*/("""}"""),format.raw/*124.895*/("""}"""),format.raw/*124.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*125.58*/("""{"""),format.raw/*125.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*125.82*/("""}"""),format.raw/*125.83*/(""");
</script>    
"""))
      }
    }
  }

  def render(sampleId:String,userName:String,sample:DBSample,imagePath:String,displayWidth:String,displayHeight:String,segments:List[DBSegment],evalSummary:String): play.twirl.api.HtmlFormat.Appendable = apply(sampleId,userName,sample,imagePath,displayWidth,displayHeight,segments,evalSummary)

  def f:((String,String,DBSample,String,String,String,List[DBSegment],String) => play.twirl.api.HtmlFormat.Appendable) = (sampleId,userName,sample,imagePath,displayWidth,displayHeight,segments,evalSummary) => apply(sampleId,userName,sample,imagePath,displayWidth,displayHeight,segments,evalSummary)

  def ref: this.type = this

}


}

/**/
object segments extends segments_Scope0.segments
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 12:51:17 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: c161f250fe3c19759cbf106f380550340e76fe42
                  MATRIX: 811->1|1073->167|1103->171|1159->201|1186->202|1289->278|1317->279|1345->281|1377->287|1404->288|1618->474|1647->475|1675->477|1707->483|1734->484|1967->689|1996->690|2024->692|2063->704|2091->705|2154->741|2182->742|2210->744|2249->756|2277->757|2339->792|2367->793|2395->795|2434->807|2462->808|2542->861|2570->862|2599->864|2639->876|2668->877|2739->920|2768->921|2797->923|2837->935|2866->936|2955->997|2984->998|3013->1000|3053->1012|3082->1013|3128->1031|3157->1032|3186->1034|3248->1068|3277->1069|3306->1070|3358->1094|3387->1095|3449->1129|3478->1130|3507->1131|3560->1155|3590->1156|3637->1174|3667->1175|3697->1176|3742->1192|3772->1193|3831->1223|3861->1224|3892->1226|4066->1371|4096->1372|4161->1408|4191->1409|4222->1411|4272->1432|4302->1433|4419->1521|4449->1522|4480->1524|4544->1559|4574->1560|4631->1588|4661->1589|4692->1591|4767->1637|4797->1638|4826->1640|4857->1644|4885->1645|4919->1652|5048->1754|5076->1755|5105->1757|5243->1868|5272->1876|5301->1877|5331->1880|5360->1888|5480->1981|5510->1990|5548->2001|5582->2014|5619->2024|5652->2036|5687->2044|5702->2050|5734->2060|6010->2309|6025->2315|6058->2327|6302->2544|6331->2552|6429->2623|6459->2632|6678->2824|6707->2832|6836->2934|6868->2945|7676->3727|7733->3768|7773->3770|7807->3777|7851->3794|7872->3806|7912->3808|7947->3825|7960->3830|7999->3831|8046->3847|8075->3849|8091->3856|8123->3867|8168->3885|8189->3897|8229->3899|8264->3916|8277->3921|8316->3922|8363->3938|8392->3940|8408->3947|8444->3962|8489->3980|8510->3992|8550->3994|8585->4011|8598->4016|8637->4017|8684->4033|8713->4035|8729->4042|8760->4052|8805->4070|8826->4082|8866->4084|8901->4101|8914->4106|8953->4107|9000->4123|9029->4125|9045->4132|9078->4144|9124->4163|9145->4175|9185->4177|9220->4194|9233->4199|9272->4200|9319->4216|9348->4218|9364->4225|9396->4236|9442->4255|9463->4267|9503->4269|9538->4286|9551->4291|9590->4292|9637->4308|9666->4310|9682->4317|9718->4332|9764->4351|9785->4363|9825->4365|9860->4382|9873->4387|9912->4388|9959->4404|9988->4406|10004->4413|10036->4424|10082->4443|10103->4455|10143->4457|10178->4474|10191->4479|10230->4480|10277->4496|10306->4498|10322->4505|10354->4516|10400->4535|10421->4547|10461->4549|10496->4566|10509->4571|10548->4572|10595->4588|10624->4590|10640->4597|10672->4608|10718->4627|10739->4639|10779->4641|10814->4658|10827->4663|10866->4664|10913->4680|10942->4682|10958->4689|10994->4704|11040->4723|11061->4735|11101->4737|11136->4754|11149->4759|11188->4760|11235->4776|11264->4778|11280->4785|11318->4802|11364->4821|11385->4833|11425->4835|11460->4852|11473->4857|11512->4858|11559->4874|11588->4876|11604->4883|11638->4896|11684->4915|11705->4927|11745->4929|11780->4946|11793->4951|11832->4952|11879->4968|11908->4970|11924->4977|11960->4992|12006->5011|12027->5023|12067->5025|12102->5042|12115->5047|12154->5048|12201->5064|12230->5066|12246->5073|12282->5088|12328->5107|12349->5119|12389->5121|12424->5138|12437->5143|12476->5144|12523->5160|12552->5162|12568->5169|12607->5187|12653->5206|12674->5218|12714->5220|12749->5237|12762->5242|12801->5243|12848->5259|12877->5261|12893->5268|12932->5286|12978->5305|12999->5317|13039->5319|13074->5336|13087->5341|13126->5342|13173->5358|13202->5360|13218->5367|13256->5384|13307->5405|13336->5407|13472->5515|13501->5516|13559->5546|13588->5547|13618->5550|13693->5597|13722->5598|13753->5602|13821->5642|13850->5643|13882->5648|13951->5690|13979->5691|14007->5692|14112->5769|14141->5770|14172->5773|14210->5783|14239->5784|14269->5786|14313->5801|14343->5802|14374->5805|14459->5861|14489->5862|14522->5867|14605->5922|14634->5923|14665->5926|14698->5931|14727->5932|14757->5934|14799->5947|14829->5948|14859->5949|14926->5987|14956->5988|14986->5990|15028->6003|15058->6004|15112->6029|15142->6030|15172->6032|15216->6047|15246->6048|15276->6049|15335->6079|15365->6080|15395->6082|15439->6097|15469->6098|15499->6099|15558->6129|15588->6130|15618->6132|15660->6145|15690->6146|15720->6147|15799->6197|15829->6198|15859->6200|15903->6215|15933->6216|15963->6217|16018->6243|16048->6244|16078->6246|16122->6261|16152->6262|16182->6263|16240->6292|16270->6293|16300->6295|16344->6310|16374->6311|16406->6315|16445->6325|16475->6326|16505->6327|16599->6392|16629->6393|16659->6395|16688->6396|16718->6398|16760->6411|16790->6412|16820->6413|16863->6427|16893->6428|16923->6430|16969->6447|16999->6448|17029->6449|17113->6504|17143->6505|17173->6507|17215->6520|17245->6521|17294->6541|17324->6542|17423->6611|17454->6612|17485->6613|17528->6626|17559->6627|17609->6647|17640->6648|17727->6705|17758->6706|17789->6707|17836->6724|17867->6725|17931->6759|17962->6760|17998->6766|18029->6767|18072->6780|18103->6781|18134->6782|18248->6866|18279->6867|18323->6881|18354->6882|18385->6883|18416->6884|18465->6903|18496->6904|18570->6948|18601->6949|18676->6994|18707->6995|18756->7014|18787->7015|18818->7016|18849->7017|18887->7025|18918->7026|18963->7041|18994->7042|19062->7080|19093->7081|19160->7118|19191->7119|19231->7129|19262->7130|19315->7153|19346->7154|19377->7155|19408->7156|19502->7220|19533->7221|19687->7345|19718->7346|19795->7393|19826->7394|19862->7400|19893->7401|19924->7402|20023->7472|20053->7473|20105->7496|20135->7497
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|50->19|50->19|51->20|55->24|55->24|55->24|55->24|55->24|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|63->32|63->32|63->32|66->35|66->35|67->36|67->36|71->40|71->40|74->43|74->43|100->69|100->69|100->69|101->70|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|115->84|115->84|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|120->89|121->90|123->92|123->92|124->93|124->93|125->94|125->94|125->94|126->95|127->96|127->96|128->97|129->98|129->98|129->98|131->100|131->100|132->101|133->102|133->102|134->103|134->103|134->103|135->104|137->106|137->106|138->107|140->109|140->109|141->110|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|144->113|145->114|145->114|145->114|145->114|145->114|145->114|146->115|146->115|146->115|146->115|146->115|146->115|147->116|147->116|147->116|147->116|147->116|147->116|148->117|148->117|148->117|148->117|148->117|148->117|149->118|149->118|149->118|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|151->120|151->120|151->120|152->121|152->121|153->122|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|154->123|154->123|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|156->125|156->125|156->125|156->125
                  -- GENERATED --
              */
          