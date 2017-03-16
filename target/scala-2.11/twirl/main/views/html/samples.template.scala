
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object samples_Scope0 {
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

class samples extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,List[DBSample],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userId: String, userName: String, samples: List[DBSample]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""
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

<table id="tg-cFHod" class="tg" >
	<tr><td class="tg-j0tj" colspan="2" style="text-align: center;">userId: """),_display_(/*16.75*/userId),format.raw/*16.81*/(""" """),format.raw/*16.82*/(""": """),_display_(/*16.85*/userName),format.raw/*16.93*/(""" """),format.raw/*16.94*/("""</td></tr>
    <tr><td class="tg-j0tj" colspan="2" style="text-align: center;"></td></tr>
    <tr>
    	<td class="tg-j0tj" style="text-align: center;">
    	<form action='addSample' method='POST' enctype="multipart/form-data" id="addSampleForm">
    	<input type='file' name='fileupload'>
    	<button type="submit" form="addSampleForm" value=""""),_display_(/*22.57*/userId),format.raw/*22.63*/(""""  name="userId" >Add</button>
    	<br>
    	This image is best described as:
    	<br>
		<input type="radio" name="bloodStatusRadio" value="notBlood"> Not Blood<br>
		<input type="radio" name="bloodStatusRadio" value="blood" checked> Blood<br>
    	</form>
    	</td>
    	<td class="tg-j0tj" style="text-align: center;">
    	<form action='backToUsers' method='POST' enctype="multipart/form-data" id="backToUsersForm">
    	<button type="submit" form="backToUsersForm" value=""""),_display_(/*32.59*/userId),format.raw/*32.65*/(""""  name="backUserId" >Back</button>
    	</form>
    	</td>
    </tr>
</table>
<table class="tg">
  <tr>
  	<th>
  	Machine Learning
  	</th>
  </tr>
  <tr>
   <td class="tg-0idt">
   <form action='populateTrainingSet' method='POST' enctype="multipart/form-data" id="populateTrainingSetForm">
	<p><b>Attributes</b></p>
	<input type="checkbox" id="area" value="area" name="area"><label for="area"> area</label><br>
	<input type="checkbox" id="width" value="width" name="width"><label for="width"> width</label><br>
	<input type="checkbox" id="height" value="height" name="height"><label for="height"> height</label><br>
	<input type="checkbox" id="perimeter" value="perimeter" name="perimeter"><label for="perimeter"> perimeter</label><br>
	<input type="checkbox" id="meanR" value="meanR" name="meanR"><label for="meanR"> meanR</label><br>
	<input type="checkbox" id="meanG" value="meanG" name="meanG"><label for="meanG"> meanG</label><br>
	<input type="checkbox" id="meanB" value="meanB" name="meanB"><label for="meanB"> meanB</label><br>
	<input type="checkbox" id="convexity" value="convexity" name="convexity"><label for="convexity"> convexity</label><br>
	<input type="checkbox" id="circularity" value="circularity" name="circularity"><label for="circularity"> circularity</label><br>
	<input type="checkbox" id="stdDevR" value="stdDevR" name ="stdDevR"><label for="stdDevR"> stdDevR</label><br>
	<p><b>Samples</b></p>
	"""),_display_(/*58.3*/for((sample,i) <- samples.zipWithIndex) yield /*58.42*/ {_display_(Seq[Any](format.raw/*58.44*/("""
	"""),format.raw/*59.2*/("""<input type="checkbox" id=i value=""""),_display_(/*59.38*/sample/*59.44*/.getSampleId()),format.raw/*59.58*/("""" name=""""),_display_(/*59.67*/sample/*59.73*/.getSampleId()),format.raw/*59.87*/(""""><label for=i> """),_display_(/*59.104*/sample/*59.110*/.getName()),format.raw/*59.120*/("""</label><br>
	""")))}),format.raw/*60.3*/("""
	"""),format.raw/*61.2*/("""<br>
	<button type="submit" form="populateTrainingSetForm" value=""""),_display_(/*62.63*/userId),format.raw/*62.69*/(""""  name="userId" >Populate Training Set</button>
	</form>  
  	</td>
  </tr>
</table>
<table id="tg-cFHod" class="tg">
<tr>
    <th class="tg-9hbo">id</th>
    <th class="tg-9hbo">name</th>
    <th class="tg-amwm">w</th>
    <th class="tg-amwm">h</th>
    <th class="tg-amwm">note</th>
    <th class="tg-amwm">segmentCount</th>
    <th class="tg-amwm">bytes</th>
    <th class="tg-amwm">R</th>
    <th class="tg-amwm">G</th>
    <th class="tg-amwm">B</th>
    <th class="tg-amwm">Date</th>
    <th class="tg-amwm">bloodStatus</th>
    <th class="tg-amwm">Action</th>
</tr>
"""),_display_(/*83.2*/for((sample,i) <- samples.zipWithIndex) yield /*83.41*/ {_display_(Seq[Any](format.raw/*83.43*/("""
  """),format.raw/*84.3*/("""<tr>
    <td """),_display_(/*85.10*/if(i % 2==0)/*85.22*/ {_display_(Seq[Any](format.raw/*85.24*/("""class="tg-j0tj"""")))}/*85.41*/else/*85.46*/{_display_(Seq[Any](format.raw/*85.47*/("""class="tg-baqh"""")))}),format.raw/*85.63*/(""">"""),_display_(/*85.65*/sample/*85.71*/.getSampleId()),format.raw/*85.85*/("""</td>
    <td """),_display_(/*86.10*/if(i % 2==0)/*86.22*/ {_display_(Seq[Any](format.raw/*86.24*/("""class="tg-6k2t"""")))}/*86.41*/else/*86.46*/{_display_(Seq[Any](format.raw/*86.47*/("""class="tg-yw4l"""")))}),format.raw/*86.63*/(""">"""),_display_(/*86.65*/sample/*86.71*/.getName()),format.raw/*86.81*/("""</td>
    <td """),_display_(/*87.10*/if(i % 2==0)/*87.22*/ {_display_(Seq[Any](format.raw/*87.24*/("""class="tg-j0tj"""")))}/*87.41*/else/*87.46*/{_display_(Seq[Any](format.raw/*87.47*/("""class="tg-baqh"""")))}),format.raw/*87.63*/(""">"""),_display_(/*87.65*/sample/*87.71*/.getWidth()),format.raw/*87.82*/("""</td>
    <td """),_display_(/*88.10*/if(i % 2==0)/*88.22*/ {_display_(Seq[Any](format.raw/*88.24*/("""class="tg-j0tj"""")))}/*88.41*/else/*88.46*/{_display_(Seq[Any](format.raw/*88.47*/("""class="tg-baqh"""")))}),format.raw/*88.63*/(""">"""),_display_(/*88.65*/sample/*88.71*/.getHeight()),format.raw/*88.83*/("""</td>
    <td """),_display_(/*89.10*/if(i % 2==0)/*89.22*/ {_display_(Seq[Any](format.raw/*89.24*/("""class="tg-6k2t"""")))}/*89.41*/else/*89.46*/{_display_(Seq[Any](format.raw/*89.47*/("""class="tg-yw4l"""")))}),format.raw/*89.63*/(""">"""),_display_(/*89.65*/sample/*89.71*/.getComment()),format.raw/*89.84*/("""</td>
    <td """),_display_(/*90.10*/if(i % 2==0)/*90.22*/ {_display_(Seq[Any](format.raw/*90.24*/("""class="tg-j0tj"""")))}/*90.41*/else/*90.46*/{_display_(Seq[Any](format.raw/*90.47*/("""class="tg-baqh"""")))}),format.raw/*90.63*/(""">"""),_display_(/*90.65*/sample/*90.71*/.getSegmentCount()),format.raw/*90.89*/("""</td>
    <td """),_display_(/*91.10*/if(i % 2==0)/*91.22*/ {_display_(Seq[Any](format.raw/*91.24*/("""class="tg-j0tj"""")))}/*91.41*/else/*91.46*/{_display_(Seq[Any](format.raw/*91.47*/("""class="tg-baqh"""")))}),format.raw/*91.63*/(""">"""),_display_(/*91.65*/sample/*91.71*/.getNumBytes()),format.raw/*91.85*/("""</td>
    <td """),_display_(/*92.10*/if(i % 2==0)/*92.22*/ {_display_(Seq[Any](format.raw/*92.24*/("""class="tg-j0tj"""")))}/*92.41*/else/*92.46*/{_display_(Seq[Any](format.raw/*92.47*/("""class="tg-baqh"""")))}),format.raw/*92.63*/(""">"""),_display_(/*92.65*/sample/*92.71*/.getR()),format.raw/*92.78*/("""</td>
    <td """),_display_(/*93.10*/if(i % 2==0)/*93.22*/ {_display_(Seq[Any](format.raw/*93.24*/("""class="tg-j0tj"""")))}/*93.41*/else/*93.46*/{_display_(Seq[Any](format.raw/*93.47*/("""class="tg-baqh"""")))}),format.raw/*93.63*/(""">"""),_display_(/*93.65*/sample/*93.71*/.getG()),format.raw/*93.78*/("""</td>
    <td """),_display_(/*94.10*/if(i % 2==0)/*94.22*/ {_display_(Seq[Any](format.raw/*94.24*/("""class="tg-j0tj"""")))}/*94.41*/else/*94.46*/{_display_(Seq[Any](format.raw/*94.47*/("""class="tg-baqh"""")))}),format.raw/*94.63*/(""">"""),_display_(/*94.65*/sample/*94.71*/.getB()),format.raw/*94.78*/("""</td>
    <td """),_display_(/*95.10*/if(i % 2==0)/*95.22*/ {_display_(Seq[Any](format.raw/*95.24*/("""class="tg-j0tj"""")))}/*95.41*/else/*95.46*/{_display_(Seq[Any](format.raw/*95.47*/("""class="tg-baqh"""")))}),format.raw/*95.63*/(""">"""),_display_(/*95.65*/sample/*95.71*/.getDateCreated()),format.raw/*95.88*/("""</td>
    <td """),_display_(/*96.10*/if(i % 2==0)/*96.22*/ {_display_(Seq[Any](format.raw/*96.24*/("""class="tg-j0tj"""")))}/*96.41*/else/*96.46*/{_display_(Seq[Any](format.raw/*96.47*/("""class="tg-baqh"""")))}),format.raw/*96.63*/(""">"""),_display_(/*96.65*/sample/*96.71*/.getBloodStatus()),format.raw/*96.88*/("""</td>
    <td """),_display_(/*97.10*/if(i % 2==0)/*97.22*/ {_display_(Seq[Any](format.raw/*97.24*/("""class="tg-j0tj"""")))}/*97.41*/else/*97.46*/{_display_(Seq[Any](format.raw/*97.47*/("""class="tg-baqh"""")))}),format.raw/*97.63*/(""">
        <input type="hidden" name="userId" value=""""),_display_(/*98.52*/sample/*98.58*/.getUserId()),format.raw/*98.70*/("""">
        <form action='viewSample' method='POST' enctype="multipart/form-data" id="viewSampleForm">
    	<button type="submit" form="viewSampleForm" value=""""),_display_(/*100.58*/sample/*100.64*/.getSampleId()),format.raw/*100.78*/(""""  name="sampleId" >View</button>
    	</form>
    	<form action='addToDataset' method='POST' enctype="multipart/form-data" id="addToDatasetForm">
    	<button type="submit" form="addToDatasetForm" value=""""),_display_(/*103.60*/sample/*103.66*/.getSampleId()),format.raw/*103.80*/(""""  name="trainingSampleId" >Add to TRAINING</button>
    	<button type="submit" form="addToDatasetForm" value=""""),_display_(/*104.60*/sample/*104.66*/.getSampleId()),format.raw/*104.80*/(""""  name="testSampleId" >Add to TEST</button>
    	</form>
    	&nbsp
    	<form action='requestDeleteSample' method='POST' enctype="multipart/form-data" id="deleteSampleForm">
    	<button type="submit" form="deleteSampleForm" value=""""),_display_(/*108.60*/sample/*108.66*/.getSampleId()),format.raw/*108.80*/(""""  name="sampleId" >Delete</button>
    	</form>
    </td>
  </tr>
  """)))}),format.raw/*112.4*/("""
"""),format.raw/*113.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*115.50*/("""{"""),format.raw/*115.51*/(""""use strict";
function r(n,t)"""),format.raw/*116.16*/("""{"""),format.raw/*116.17*/("""
	"""),format.raw/*117.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*117.49*/("""{"""),format.raw/*117.50*/("""
		"""),format.raw/*118.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*119.28*/("""{"""),format.raw/*119.29*/("""
			"""),format.raw/*120.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*121.3*/("""}"""),format.raw/*121.4*/(""" """),format.raw/*121.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*123.2*/("""}"""),format.raw/*123.3*/("""
	"""),format.raw/*124.2*/("""return e
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/("""
"""),format.raw/*126.1*/("""function e(n,t)"""),format.raw/*126.16*/("""{"""),format.raw/*126.17*/("""
	"""),format.raw/*127.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*129.14*/("""{"""),format.raw/*129.15*/("""
			"""),format.raw/*130.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*132.3*/("""}"""),format.raw/*132.4*/("""
	"""),format.raw/*133.2*/("""),e
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/("""
"""),format.raw/*135.1*/("""function o(n)"""),format.raw/*135.14*/("""{"""),format.raw/*135.15*/(""" """),format.raw/*135.16*/("""return n.textContent||n.innerText||"" """),format.raw/*135.54*/("""}"""),format.raw/*135.55*/("""
"""),format.raw/*136.1*/("""function i(n)"""),format.raw/*136.14*/("""{"""),format.raw/*136.15*/("""i return n.innerHTML||"" """),format.raw/*136.40*/("""}"""),format.raw/*136.41*/("""
"""),format.raw/*137.1*/("""function u(n,t)"""),format.raw/*137.16*/("""{"""),format.raw/*137.17*/(""" """),format.raw/*137.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*137.48*/("""}"""),format.raw/*137.49*/("""
"""),format.raw/*138.1*/("""function a(n,t)"""),format.raw/*138.16*/("""{"""),format.raw/*138.17*/(""" """),format.raw/*138.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*138.48*/("""}"""),format.raw/*138.49*/("""
"""),format.raw/*139.1*/("""function c(n)"""),format.raw/*139.14*/("""{"""),format.raw/*139.15*/(""" """),format.raw/*139.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*139.66*/("""}"""),format.raw/*139.67*/("""
"""),format.raw/*140.1*/("""function f(n,t)"""),format.raw/*140.16*/("""{"""),format.raw/*140.17*/(""" """),format.raw/*140.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*140.44*/("""}"""),format.raw/*140.45*/("""
"""),format.raw/*141.1*/("""function s(n,t)"""),format.raw/*141.16*/("""{"""),format.raw/*141.17*/(""" """),format.raw/*141.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*141.47*/("""}"""),format.raw/*141.48*/("""
"""),format.raw/*142.1*/("""function d(n,t)"""),format.raw/*142.16*/("""{"""),format.raw/*142.17*/(""" 
	"""),format.raw/*143.2*/("""if(f(n,t))"""),format.raw/*143.12*/("""{"""),format.raw/*143.13*/(""" """),format.raw/*143.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*143.79*/("""}"""),format.raw/*143.80*/("""
"""),format.raw/*144.1*/("""}"""),format.raw/*144.2*/("""
"""),format.raw/*145.1*/("""function v(n)"""),format.raw/*145.14*/("""{"""),format.raw/*145.15*/(""" """),format.raw/*145.16*/("""d(n,L),d(n,E) """),format.raw/*145.30*/("""}"""),format.raw/*145.31*/("""
"""),format.raw/*146.1*/("""function l(n,t,e)"""),format.raw/*146.18*/("""{"""),format.raw/*146.19*/(""" """),format.raw/*146.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*146.75*/("""}"""),format.raw/*146.76*/("""
"""),format.raw/*147.1*/("""function g(n)"""),format.raw/*147.14*/("""{"""),format.raw/*147.15*/("""return function(t,r)"""),format.raw/*147.35*/("""{"""),format.raw/*147.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*147.105*/("""}"""),format.raw/*147.106*/("""}"""),format.raw/*147.107*/("""function h(n)"""),format.raw/*147.120*/("""{"""),format.raw/*147.121*/("""return function(t,r)"""),format.raw/*147.141*/("""{"""),format.raw/*147.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*147.199*/("""}"""),format.raw/*147.200*/("""}"""),format.raw/*147.201*/("""function m(n,t,r)"""),format.raw/*147.218*/("""{"""),format.raw/*147.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*147.253*/("""{"""),format.raw/*147.254*/("""return"""),format.raw/*147.260*/("""{"""),format.raw/*147.261*/("""str:n,index:t"""),format.raw/*147.274*/("""}"""),format.raw/*147.275*/("""}"""),format.raw/*147.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*147.360*/("""{"""),format.raw/*147.361*/("""return n.index"""),format.raw/*147.375*/("""}"""),format.raw/*147.376*/(""")"""),format.raw/*147.377*/("""}"""),format.raw/*147.378*/("""function p(n,t,r,o)"""),format.raw/*147.397*/("""{"""),format.raw/*147.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*147.442*/("""{"""),format.raw/*147.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*147.488*/("""{"""),format.raw/*147.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*147.508*/("""}"""),format.raw/*147.509*/(""")"""),format.raw/*147.510*/("""}"""),format.raw/*147.511*/("""l(n,o,i)"""),format.raw/*147.519*/("""}"""),format.raw/*147.520*/("""function x(n,t)"""),format.raw/*147.535*/("""{"""),format.raw/*147.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*147.574*/("""{"""),format.raw/*147.575*/("""t.addEventListener("click",function()"""),format.raw/*147.612*/("""{"""),format.raw/*147.613*/("""p(n,r,e,t)"""),format.raw/*147.623*/("""}"""),format.raw/*147.624*/("""),s(t,"tg-sort-header")"""),format.raw/*147.647*/("""}"""),format.raw/*147.648*/(""")"""),format.raw/*147.649*/("""}"""),format.raw/*147.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*147.714*/("""{"""),format.raw/*147.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*147.839*/("""{"""),format.raw/*147.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*147.887*/("""}"""),format.raw/*147.888*/("""x(e,i)"""),format.raw/*147.894*/("""}"""),format.raw/*147.895*/("""}"""),format.raw/*147.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*148.58*/("""{"""),format.raw/*148.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*148.82*/("""}"""),format.raw/*148.83*/(""");
</script>    
"""))
      }
    }
  }

  def render(userId:String,userName:String,samples:List[DBSample]): play.twirl.api.HtmlFormat.Appendable = apply(userId,userName,samples)

  def f:((String,String,List[DBSample]) => play.twirl.api.HtmlFormat.Appendable) = (userId,userName,samples) => apply(userId,userName,samples)

  def ref: this.type = this

}


}

/**/
object samples extends samples_Scope0.samples
              /*
                  -- GENERATED --
                  DATE: Wed Mar 15 23:42:30 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/samples.scala.html
                  HASH: f9be052ddd3bc596bf8e7169ea10a960f95ff975
                  MATRIX: 771->1|925->60|953->62|1009->92|1036->93|1139->169|1167->170|1195->172|1227->178|1254->179|1468->365|1497->366|1525->368|1557->374|1584->375|1817->580|1846->581|1874->583|1913->595|1941->596|2004->632|2032->633|2060->635|2099->647|2127->648|2189->683|2217->684|2245->686|2284->698|2312->699|2392->752|2420->753|2448->755|2487->767|2515->768|2585->811|2613->812|2642->814|2682->826|2711->827|2800->888|2829->889|2858->891|2898->903|2927->904|2973->922|3002->923|3031->925|3093->959|3122->960|3151->961|3203->985|3232->986|3294->1020|3323->1021|3352->1022|3405->1046|3435->1047|3482->1065|3512->1066|3542->1067|3587->1083|3617->1084|3676->1114|3706->1115|3737->1117|3911->1262|3941->1263|4006->1299|4036->1300|4067->1302|4117->1323|4147->1324|4264->1412|4294->1413|4325->1415|4389->1450|4419->1451|4476->1479|4506->1480|4537->1482|4612->1528|4642->1529|4671->1531|4819->1652|4846->1658|4875->1659|4905->1662|4934->1670|4963->1671|5342->2023|5369->2029|5886->2519|5913->2525|7390->3976|7445->4015|7485->4017|7515->4020|7578->4056|7593->4062|7628->4076|7664->4085|7679->4091|7714->4105|7759->4122|7775->4128|7807->4138|7853->4154|7883->4157|7978->4225|8005->4231|8626->4826|8681->4865|8721->4867|8752->4871|8794->4886|8815->4898|8855->4900|8890->4917|8903->4922|8942->4923|8989->4939|9018->4941|9033->4947|9068->4961|9111->4977|9132->4989|9172->4991|9207->5008|9220->5013|9259->5014|9306->5030|9335->5032|9350->5038|9381->5048|9424->5064|9445->5076|9485->5078|9520->5095|9533->5100|9572->5101|9619->5117|9648->5119|9663->5125|9695->5136|9738->5152|9759->5164|9799->5166|9834->5183|9847->5188|9886->5189|9933->5205|9962->5207|9977->5213|10010->5225|10053->5241|10074->5253|10114->5255|10149->5272|10162->5277|10201->5278|10248->5294|10277->5296|10292->5302|10326->5315|10369->5331|10390->5343|10430->5345|10465->5362|10478->5367|10517->5368|10564->5384|10593->5386|10608->5392|10647->5410|10690->5426|10711->5438|10751->5440|10786->5457|10799->5462|10838->5463|10885->5479|10914->5481|10929->5487|10964->5501|11007->5517|11028->5529|11068->5531|11103->5548|11116->5553|11155->5554|11202->5570|11231->5572|11246->5578|11274->5585|11317->5601|11338->5613|11378->5615|11413->5632|11426->5637|11465->5638|11512->5654|11541->5656|11556->5662|11584->5669|11627->5685|11648->5697|11688->5699|11723->5716|11736->5721|11775->5722|11822->5738|11851->5740|11866->5746|11894->5753|11937->5769|11958->5781|11998->5783|12033->5800|12046->5805|12085->5806|12132->5822|12161->5824|12176->5830|12214->5847|12257->5863|12278->5875|12318->5877|12353->5894|12366->5899|12405->5900|12452->5916|12481->5918|12496->5924|12534->5941|12577->5957|12598->5969|12638->5971|12673->5988|12686->5993|12725->5994|12772->6010|12853->6064|12868->6070|12901->6082|13090->6243|13106->6249|13142->6263|13379->6472|13395->6478|13431->6492|13572->6605|13588->6611|13624->6625|13891->6864|13907->6870|13943->6884|14048->6958|14078->6960|14215->7068|14245->7069|14304->7099|14334->7100|14365->7103|14441->7150|14471->7151|14503->7155|14572->7195|14602->7196|14635->7201|14705->7243|14734->7244|14763->7245|14868->7322|14897->7323|14928->7326|14966->7336|14995->7337|15025->7339|15069->7354|15099->7355|15130->7358|15215->7414|15245->7415|15278->7420|15361->7475|15390->7476|15421->7479|15454->7484|15483->7485|15513->7487|15555->7500|15585->7501|15615->7502|15682->7540|15712->7541|15742->7543|15784->7556|15814->7557|15868->7582|15898->7583|15928->7585|15972->7600|16002->7601|16032->7602|16091->7632|16121->7633|16151->7635|16195->7650|16225->7651|16255->7652|16314->7682|16344->7683|16374->7685|16416->7698|16446->7699|16476->7700|16555->7750|16585->7751|16615->7753|16659->7768|16689->7769|16719->7770|16774->7796|16804->7797|16834->7799|16878->7814|16908->7815|16938->7816|16996->7845|17026->7846|17056->7848|17100->7863|17130->7864|17162->7868|17201->7878|17231->7879|17261->7880|17355->7945|17385->7946|17415->7948|17444->7949|17474->7951|17516->7964|17546->7965|17576->7966|17619->7980|17649->7981|17679->7983|17725->8000|17755->8001|17785->8002|17869->8057|17899->8058|17929->8060|17971->8073|18001->8074|18050->8094|18080->8095|18179->8164|18210->8165|18241->8166|18284->8179|18315->8180|18365->8200|18396->8201|18483->8258|18514->8259|18545->8260|18592->8277|18623->8278|18687->8312|18718->8313|18754->8319|18785->8320|18828->8333|18859->8334|18890->8335|19004->8419|19035->8420|19079->8434|19110->8435|19141->8436|19172->8437|19221->8456|19252->8457|19326->8501|19357->8502|19432->8547|19463->8548|19512->8567|19543->8568|19574->8569|19605->8570|19643->8578|19674->8579|19719->8594|19750->8595|19818->8633|19849->8634|19916->8671|19947->8672|19987->8682|20018->8683|20071->8706|20102->8707|20133->8708|20164->8709|20258->8773|20289->8774|20443->8898|20474->8899|20551->8946|20582->8947|20618->8953|20649->8954|20680->8955|20779->9025|20809->9026|20861->9049|20891->9050
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|63->32|63->32|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|92->61|93->62|93->62|114->83|114->83|114->83|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|124->93|124->93|124->93|124->93|124->93|124->93|124->93|124->93|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|128->97|129->98|129->98|129->98|131->100|131->100|131->100|134->103|134->103|134->103|135->104|135->104|135->104|139->108|139->108|139->108|143->112|144->113|146->115|146->115|147->116|147->116|148->117|148->117|148->117|149->118|150->119|150->119|151->120|152->121|152->121|152->121|154->123|154->123|155->124|156->125|156->125|157->126|157->126|157->126|158->127|160->129|160->129|161->130|163->132|163->132|164->133|165->134|165->134|166->135|166->135|166->135|166->135|166->135|166->135|167->136|167->136|167->136|167->136|167->136|168->137|168->137|168->137|168->137|168->137|168->137|169->138|169->138|169->138|169->138|169->138|169->138|170->139|170->139|170->139|170->139|170->139|170->139|171->140|171->140|171->140|171->140|171->140|171->140|172->141|172->141|172->141|172->141|172->141|172->141|173->142|173->142|173->142|174->143|174->143|174->143|174->143|174->143|174->143|175->144|175->144|176->145|176->145|176->145|176->145|176->145|176->145|177->146|177->146|177->146|177->146|177->146|177->146|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|179->148|179->148|179->148|179->148
                  -- GENERATED --
              */
          