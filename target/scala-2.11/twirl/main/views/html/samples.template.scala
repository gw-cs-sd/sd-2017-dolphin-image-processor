
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
<form action='populateDataSets' method='POST' enctype="multipart/form-data" id="populateDataSetsForm">
<table class="tg">
  <tr>
  	<th colspan="3">
  	Machine Learning
  	</th>
  </tr>
  <tr>
   <td class="tg-0idt">
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
	<input type="checkbox" id="relativeX" value="relativeX" name ="relativeX"><label for="relativeX"> relativeX</label><br>
	<input type="checkbox" id="relativeY" value="relativeY" name ="relativeY"><label for="relativeY"> relativeY</label><br>
	<input type="checkbox" id="relativeArea" value="relativeArea" name ="relativeArea"><label for="relativeArea"> relativeArea</label><br>
	<input type="checkbox" id="segmentCount" value="segmentCount" name ="segmentCount"><label for="segmentCount"> segmentCount</label><br>
	</td>
	<td class="tg-0idt">
	<p><b>Training Samples</b></p>
	"""),_display_(/*64.3*/for((sample,i) <- samples.zipWithIndex) yield /*64.42*/ {_display_(Seq[Any](format.raw/*64.44*/("""
	"""),format.raw/*65.2*/("""<input type="checkbox" id=i value=""""),_display_(/*65.38*/sample/*65.44*/.getSampleId()),format.raw/*65.58*/("""" name="training"""),_display_(/*65.75*/sample/*65.81*/.getSampleId()),format.raw/*65.95*/(""""><label for=i> """),_display_(/*65.112*/sample/*65.118*/.getName()),format.raw/*65.128*/("""</label><br>
	""")))}),format.raw/*66.3*/("""
	"""),format.raw/*67.2*/("""<br>
  	</td>
  	<td class="tg-0idt">
	<p><b>Test Samples</b></p>
	"""),_display_(/*71.3*/for((sample,i) <- samples.zipWithIndex) yield /*71.42*/ {_display_(Seq[Any](format.raw/*71.44*/("""
	"""),format.raw/*72.2*/("""<input type="checkbox" id=i value=""""),_display_(/*72.38*/sample/*72.44*/.getSampleId()),format.raw/*72.58*/("""" name="test"""),_display_(/*72.71*/sample/*72.77*/.getSampleId()),format.raw/*72.91*/(""""><label for=i> """),_display_(/*72.108*/sample/*72.114*/.getName()),format.raw/*72.124*/("""</label><br>
	""")))}),format.raw/*73.3*/("""
	"""),format.raw/*74.2*/("""<br>
  </td>
  </tr>
  <tr>
  	<td class="tg-0idt" colspan="3">
  	<button type="submit" form="populateDataSetsForm" value=""""),_display_(/*79.62*/userId),format.raw/*79.68*/(""""  name="userId" >Populate Data Sets</button><br>
  	<button type="submit" form="populateDataSetsForm" value=""""),_display_(/*80.62*/userId),format.raw/*80.68*/(""""  name="clearUserId" >Clear Data Sets</button>
  	</td>
  </tr>
</table>
</form>
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
"""),_display_(/*101.2*/for((sample,i) <- samples.zipWithIndex) yield /*101.41*/ {_display_(Seq[Any](format.raw/*101.43*/("""
  """),format.raw/*102.3*/("""<tr>
    <td """),_display_(/*103.10*/if(i % 2==0)/*103.22*/ {_display_(Seq[Any](format.raw/*103.24*/("""class="tg-j0tj"""")))}/*103.41*/else/*103.46*/{_display_(Seq[Any](format.raw/*103.47*/("""class="tg-baqh"""")))}),format.raw/*103.63*/(""">"""),_display_(/*103.65*/sample/*103.71*/.getSampleId()),format.raw/*103.85*/("""</td>
    <td """),_display_(/*104.10*/if(i % 2==0)/*104.22*/ {_display_(Seq[Any](format.raw/*104.24*/("""class="tg-6k2t"""")))}/*104.41*/else/*104.46*/{_display_(Seq[Any](format.raw/*104.47*/("""class="tg-yw4l"""")))}),format.raw/*104.63*/(""">"""),_display_(/*104.65*/sample/*104.71*/.getName()),format.raw/*104.81*/("""</td>
    <td """),_display_(/*105.10*/if(i % 2==0)/*105.22*/ {_display_(Seq[Any](format.raw/*105.24*/("""class="tg-j0tj"""")))}/*105.41*/else/*105.46*/{_display_(Seq[Any](format.raw/*105.47*/("""class="tg-baqh"""")))}),format.raw/*105.63*/(""">"""),_display_(/*105.65*/sample/*105.71*/.getWidth()),format.raw/*105.82*/("""</td>
    <td """),_display_(/*106.10*/if(i % 2==0)/*106.22*/ {_display_(Seq[Any](format.raw/*106.24*/("""class="tg-j0tj"""")))}/*106.41*/else/*106.46*/{_display_(Seq[Any](format.raw/*106.47*/("""class="tg-baqh"""")))}),format.raw/*106.63*/(""">"""),_display_(/*106.65*/sample/*106.71*/.getHeight()),format.raw/*106.83*/("""</td>
    <td """),_display_(/*107.10*/if(i % 2==0)/*107.22*/ {_display_(Seq[Any](format.raw/*107.24*/("""class="tg-6k2t"""")))}/*107.41*/else/*107.46*/{_display_(Seq[Any](format.raw/*107.47*/("""class="tg-yw4l"""")))}),format.raw/*107.63*/(""">"""),_display_(/*107.65*/sample/*107.71*/.getComment()),format.raw/*107.84*/("""</td>
    <td """),_display_(/*108.10*/if(i % 2==0)/*108.22*/ {_display_(Seq[Any](format.raw/*108.24*/("""class="tg-j0tj"""")))}/*108.41*/else/*108.46*/{_display_(Seq[Any](format.raw/*108.47*/("""class="tg-baqh"""")))}),format.raw/*108.63*/(""">"""),_display_(/*108.65*/sample/*108.71*/.getSegmentCount()),format.raw/*108.89*/("""</td>
    <td """),_display_(/*109.10*/if(i % 2==0)/*109.22*/ {_display_(Seq[Any](format.raw/*109.24*/("""class="tg-j0tj"""")))}/*109.41*/else/*109.46*/{_display_(Seq[Any](format.raw/*109.47*/("""class="tg-baqh"""")))}),format.raw/*109.63*/(""">"""),_display_(/*109.65*/sample/*109.71*/.getNumBytes()),format.raw/*109.85*/("""</td>
    <td """),_display_(/*110.10*/if(i % 2==0)/*110.22*/ {_display_(Seq[Any](format.raw/*110.24*/("""class="tg-j0tj"""")))}/*110.41*/else/*110.46*/{_display_(Seq[Any](format.raw/*110.47*/("""class="tg-baqh"""")))}),format.raw/*110.63*/(""">"""),_display_(/*110.65*/sample/*110.71*/.getR()),format.raw/*110.78*/("""</td>
    <td """),_display_(/*111.10*/if(i % 2==0)/*111.22*/ {_display_(Seq[Any](format.raw/*111.24*/("""class="tg-j0tj"""")))}/*111.41*/else/*111.46*/{_display_(Seq[Any](format.raw/*111.47*/("""class="tg-baqh"""")))}),format.raw/*111.63*/(""">"""),_display_(/*111.65*/sample/*111.71*/.getG()),format.raw/*111.78*/("""</td>
    <td """),_display_(/*112.10*/if(i % 2==0)/*112.22*/ {_display_(Seq[Any](format.raw/*112.24*/("""class="tg-j0tj"""")))}/*112.41*/else/*112.46*/{_display_(Seq[Any](format.raw/*112.47*/("""class="tg-baqh"""")))}),format.raw/*112.63*/(""">"""),_display_(/*112.65*/sample/*112.71*/.getB()),format.raw/*112.78*/("""</td>
    <td """),_display_(/*113.10*/if(i % 2==0)/*113.22*/ {_display_(Seq[Any](format.raw/*113.24*/("""class="tg-j0tj"""")))}/*113.41*/else/*113.46*/{_display_(Seq[Any](format.raw/*113.47*/("""class="tg-baqh"""")))}),format.raw/*113.63*/(""">"""),_display_(/*113.65*/sample/*113.71*/.getDateCreated()),format.raw/*113.88*/("""</td>
    <td """),_display_(/*114.10*/if(i % 2==0)/*114.22*/ {_display_(Seq[Any](format.raw/*114.24*/("""class="tg-j0tj"""")))}/*114.41*/else/*114.46*/{_display_(Seq[Any](format.raw/*114.47*/("""class="tg-baqh"""")))}),format.raw/*114.63*/(""">"""),_display_(/*114.65*/sample/*114.71*/.getBloodStatus()),format.raw/*114.88*/("""</td>
    <td """),_display_(/*115.10*/if(i % 2==0)/*115.22*/ {_display_(Seq[Any](format.raw/*115.24*/("""class="tg-j0tj"""")))}/*115.41*/else/*115.46*/{_display_(Seq[Any](format.raw/*115.47*/("""class="tg-baqh"""")))}),format.raw/*115.63*/(""">
        <input type="hidden" name="userId" value=""""),_display_(/*116.52*/sample/*116.58*/.getUserId()),format.raw/*116.70*/("""">
        <form action='viewSample' method='POST' enctype="multipart/form-data" id="viewSampleForm">
    	<button type="submit" form="viewSampleForm" value=""""),_display_(/*118.58*/sample/*118.64*/.getSampleId()),format.raw/*118.78*/(""""  name="sampleId" >View</button>
    	</form>
    	<!--  COMMENT OUT OLD "ADD TO TRAINING" AND "ADD TO TEST" BUTTONS
    	<form action='addToDataset' method='POST' enctype="multipart/form-data" id="addToDatasetForm">
    	<button type="submit" form="addToDatasetForm" value=""""),_display_(/*122.60*/sample/*122.66*/.getSampleId()),format.raw/*122.80*/(""""  name="trainingSampleId" >Add to TRAINING</button>
    	<button type="submit" form="addToDatasetForm" value=""""),_display_(/*123.60*/sample/*123.66*/.getSampleId()),format.raw/*123.80*/(""""  name="testSampleId" >Add to TEST</button>
    	</form>
    	-->
    	&nbsp
    	<form action='requestDeleteSample' method='POST' enctype="multipart/form-data" id="deleteSampleForm">
    	<button type="submit" form="deleteSampleForm" value=""""),_display_(/*128.60*/sample/*128.66*/.getSampleId()),format.raw/*128.80*/(""""  name="sampleId" >Delete</button>
    	</form>
    </td>
  </tr>
  """)))}),format.raw/*132.4*/("""
"""),format.raw/*133.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*135.50*/("""{"""),format.raw/*135.51*/(""""use strict";
function r(n,t)"""),format.raw/*136.16*/("""{"""),format.raw/*136.17*/("""
	"""),format.raw/*137.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*137.49*/("""{"""),format.raw/*137.50*/("""
		"""),format.raw/*138.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*139.28*/("""{"""),format.raw/*139.29*/("""
			"""),format.raw/*140.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*141.3*/("""}"""),format.raw/*141.4*/(""" """),format.raw/*141.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*143.2*/("""}"""),format.raw/*143.3*/("""
	"""),format.raw/*144.2*/("""return e
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/("""
"""),format.raw/*146.1*/("""function e(n,t)"""),format.raw/*146.16*/("""{"""),format.raw/*146.17*/("""
	"""),format.raw/*147.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*149.14*/("""{"""),format.raw/*149.15*/("""
			"""),format.raw/*150.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*152.3*/("""}"""),format.raw/*152.4*/("""
	"""),format.raw/*153.2*/("""),e
"""),format.raw/*154.1*/("""}"""),format.raw/*154.2*/("""
"""),format.raw/*155.1*/("""function o(n)"""),format.raw/*155.14*/("""{"""),format.raw/*155.15*/(""" """),format.raw/*155.16*/("""return n.textContent||n.innerText||"" """),format.raw/*155.54*/("""}"""),format.raw/*155.55*/("""
"""),format.raw/*156.1*/("""function i(n)"""),format.raw/*156.14*/("""{"""),format.raw/*156.15*/("""i return n.innerHTML||"" """),format.raw/*156.40*/("""}"""),format.raw/*156.41*/("""
"""),format.raw/*157.1*/("""function u(n,t)"""),format.raw/*157.16*/("""{"""),format.raw/*157.17*/(""" """),format.raw/*157.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*157.48*/("""}"""),format.raw/*157.49*/("""
"""),format.raw/*158.1*/("""function a(n,t)"""),format.raw/*158.16*/("""{"""),format.raw/*158.17*/(""" """),format.raw/*158.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*158.48*/("""}"""),format.raw/*158.49*/("""
"""),format.raw/*159.1*/("""function c(n)"""),format.raw/*159.14*/("""{"""),format.raw/*159.15*/(""" """),format.raw/*159.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*159.66*/("""}"""),format.raw/*159.67*/("""
"""),format.raw/*160.1*/("""function f(n,t)"""),format.raw/*160.16*/("""{"""),format.raw/*160.17*/(""" """),format.raw/*160.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*160.44*/("""}"""),format.raw/*160.45*/("""
"""),format.raw/*161.1*/("""function s(n,t)"""),format.raw/*161.16*/("""{"""),format.raw/*161.17*/(""" """),format.raw/*161.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*161.47*/("""}"""),format.raw/*161.48*/("""
"""),format.raw/*162.1*/("""function d(n,t)"""),format.raw/*162.16*/("""{"""),format.raw/*162.17*/(""" 
	"""),format.raw/*163.2*/("""if(f(n,t))"""),format.raw/*163.12*/("""{"""),format.raw/*163.13*/(""" """),format.raw/*163.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*163.79*/("""}"""),format.raw/*163.80*/("""
"""),format.raw/*164.1*/("""}"""),format.raw/*164.2*/("""
"""),format.raw/*165.1*/("""function v(n)"""),format.raw/*165.14*/("""{"""),format.raw/*165.15*/(""" """),format.raw/*165.16*/("""d(n,L),d(n,E) """),format.raw/*165.30*/("""}"""),format.raw/*165.31*/("""
"""),format.raw/*166.1*/("""function l(n,t,e)"""),format.raw/*166.18*/("""{"""),format.raw/*166.19*/(""" """),format.raw/*166.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*166.75*/("""}"""),format.raw/*166.76*/("""
"""),format.raw/*167.1*/("""function g(n)"""),format.raw/*167.14*/("""{"""),format.raw/*167.15*/("""return function(t,r)"""),format.raw/*167.35*/("""{"""),format.raw/*167.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*167.105*/("""}"""),format.raw/*167.106*/("""}"""),format.raw/*167.107*/("""function h(n)"""),format.raw/*167.120*/("""{"""),format.raw/*167.121*/("""return function(t,r)"""),format.raw/*167.141*/("""{"""),format.raw/*167.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*167.199*/("""}"""),format.raw/*167.200*/("""}"""),format.raw/*167.201*/("""function m(n,t,r)"""),format.raw/*167.218*/("""{"""),format.raw/*167.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*167.253*/("""{"""),format.raw/*167.254*/("""return"""),format.raw/*167.260*/("""{"""),format.raw/*167.261*/("""str:n,index:t"""),format.raw/*167.274*/("""}"""),format.raw/*167.275*/("""}"""),format.raw/*167.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*167.360*/("""{"""),format.raw/*167.361*/("""return n.index"""),format.raw/*167.375*/("""}"""),format.raw/*167.376*/(""")"""),format.raw/*167.377*/("""}"""),format.raw/*167.378*/("""function p(n,t,r,o)"""),format.raw/*167.397*/("""{"""),format.raw/*167.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*167.442*/("""{"""),format.raw/*167.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*167.488*/("""{"""),format.raw/*167.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*167.508*/("""}"""),format.raw/*167.509*/(""")"""),format.raw/*167.510*/("""}"""),format.raw/*167.511*/("""l(n,o,i)"""),format.raw/*167.519*/("""}"""),format.raw/*167.520*/("""function x(n,t)"""),format.raw/*167.535*/("""{"""),format.raw/*167.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*167.574*/("""{"""),format.raw/*167.575*/("""t.addEventListener("click",function()"""),format.raw/*167.612*/("""{"""),format.raw/*167.613*/("""p(n,r,e,t)"""),format.raw/*167.623*/("""}"""),format.raw/*167.624*/("""),s(t,"tg-sort-header")"""),format.raw/*167.647*/("""}"""),format.raw/*167.648*/(""")"""),format.raw/*167.649*/("""}"""),format.raw/*167.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*167.714*/("""{"""),format.raw/*167.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*167.839*/("""{"""),format.raw/*167.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*167.887*/("""}"""),format.raw/*167.888*/("""x(e,i)"""),format.raw/*167.894*/("""}"""),format.raw/*167.895*/("""}"""),format.raw/*167.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*168.58*/("""{"""),format.raw/*168.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*168.82*/("""}"""),format.raw/*168.83*/(""");
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
                  DATE: Thu Mar 16 21:24:42 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/samples.scala.html
                  HASH: a4f4e67183e3165944f87c7a25c233bd921058de
                  MATRIX: 771->1|925->60|953->62|1009->92|1036->93|1139->169|1167->170|1195->172|1227->178|1254->179|1468->365|1497->366|1525->368|1557->374|1584->375|1817->580|1846->581|1874->583|1913->595|1941->596|2004->632|2032->633|2060->635|2099->647|2127->648|2189->683|2217->684|2245->686|2284->698|2312->699|2392->752|2420->753|2448->755|2487->767|2515->768|2585->811|2613->812|2642->814|2682->826|2711->827|2800->888|2829->889|2858->891|2898->903|2927->904|2973->922|3002->923|3031->925|3093->959|3122->960|3151->961|3203->985|3232->986|3294->1020|3323->1021|3352->1022|3405->1046|3435->1047|3482->1065|3512->1066|3542->1067|3587->1083|3617->1084|3676->1114|3706->1115|3737->1117|3911->1262|3941->1263|4006->1299|4036->1300|4067->1302|4117->1323|4147->1324|4264->1412|4294->1413|4325->1415|4389->1450|4419->1451|4476->1479|4506->1480|4537->1482|4612->1528|4642->1529|4671->1531|4819->1652|4846->1658|4875->1659|4905->1662|4934->1670|4963->1671|5342->2023|5369->2029|5886->2519|5913->2525|7951->4537|8006->4576|8046->4578|8076->4581|8139->4617|8154->4623|8189->4637|8233->4654|8248->4660|8283->4674|8328->4691|8344->4697|8376->4707|8422->4723|8452->4726|8550->4798|8605->4837|8645->4839|8675->4842|8738->4878|8753->4884|8788->4898|8828->4911|8843->4917|8878->4931|8923->4948|8939->4954|8971->4964|9017->4980|9047->4983|9204->5113|9231->5119|9370->5231|9397->5237|10015->5828|10071->5867|10112->5869|10144->5873|10187->5888|10209->5900|10250->5902|10286->5919|10300->5924|10340->5925|10388->5941|10418->5943|10434->5949|10470->5963|10514->5979|10536->5991|10577->5993|10613->6010|10627->6015|10667->6016|10715->6032|10745->6034|10761->6040|10793->6050|10837->6066|10859->6078|10900->6080|10936->6097|10950->6102|10990->6103|11038->6119|11068->6121|11084->6127|11117->6138|11161->6154|11183->6166|11224->6168|11260->6185|11274->6190|11314->6191|11362->6207|11392->6209|11408->6215|11442->6227|11486->6243|11508->6255|11549->6257|11585->6274|11599->6279|11639->6280|11687->6296|11717->6298|11733->6304|11768->6317|11812->6333|11834->6345|11875->6347|11911->6364|11925->6369|11965->6370|12013->6386|12043->6388|12059->6394|12099->6412|12143->6428|12165->6440|12206->6442|12242->6459|12256->6464|12296->6465|12344->6481|12374->6483|12390->6489|12426->6503|12470->6519|12492->6531|12533->6533|12569->6550|12583->6555|12623->6556|12671->6572|12701->6574|12717->6580|12746->6587|12790->6603|12812->6615|12853->6617|12889->6634|12903->6639|12943->6640|12991->6656|13021->6658|13037->6664|13066->6671|13110->6687|13132->6699|13173->6701|13209->6718|13223->6723|13263->6724|13311->6740|13341->6742|13357->6748|13386->6755|13430->6771|13452->6783|13493->6785|13529->6802|13543->6807|13583->6808|13631->6824|13661->6826|13677->6832|13716->6849|13760->6865|13782->6877|13823->6879|13859->6896|13873->6901|13913->6902|13961->6918|13991->6920|14007->6926|14046->6943|14090->6959|14112->6971|14153->6973|14189->6990|14203->6995|14243->6996|14291->7012|14373->7066|14389->7072|14423->7084|14612->7245|14628->7251|14664->7265|14973->7546|14989->7552|15025->7566|15166->7679|15182->7685|15218->7699|15495->7948|15511->7954|15547->7968|15652->8042|15682->8044|15819->8152|15849->8153|15908->8183|15938->8184|15969->8187|16045->8234|16075->8235|16107->8239|16176->8279|16206->8280|16239->8285|16309->8327|16338->8328|16367->8329|16472->8406|16501->8407|16532->8410|16570->8420|16599->8421|16629->8423|16673->8438|16703->8439|16734->8442|16819->8498|16849->8499|16882->8504|16965->8559|16994->8560|17025->8563|17058->8568|17087->8569|17117->8571|17159->8584|17189->8585|17219->8586|17286->8624|17316->8625|17346->8627|17388->8640|17418->8641|17472->8666|17502->8667|17532->8669|17576->8684|17606->8685|17636->8686|17695->8716|17725->8717|17755->8719|17799->8734|17829->8735|17859->8736|17918->8766|17948->8767|17978->8769|18020->8782|18050->8783|18080->8784|18159->8834|18189->8835|18219->8837|18263->8852|18293->8853|18323->8854|18378->8880|18408->8881|18438->8883|18482->8898|18512->8899|18542->8900|18600->8929|18630->8930|18660->8932|18704->8947|18734->8948|18766->8952|18805->8962|18835->8963|18865->8964|18959->9029|18989->9030|19019->9032|19048->9033|19078->9035|19120->9048|19150->9049|19180->9050|19223->9064|19253->9065|19283->9067|19329->9084|19359->9085|19389->9086|19473->9141|19503->9142|19533->9144|19575->9157|19605->9158|19654->9178|19684->9179|19783->9248|19814->9249|19845->9250|19888->9263|19919->9264|19969->9284|20000->9285|20087->9342|20118->9343|20149->9344|20196->9361|20227->9362|20291->9396|20322->9397|20358->9403|20389->9404|20432->9417|20463->9418|20494->9419|20608->9503|20639->9504|20683->9518|20714->9519|20745->9520|20776->9521|20825->9540|20856->9541|20930->9585|20961->9586|21036->9631|21067->9632|21116->9651|21147->9652|21178->9653|21209->9654|21247->9662|21278->9663|21323->9678|21354->9679|21422->9717|21453->9718|21520->9755|21551->9756|21591->9766|21622->9767|21675->9790|21706->9791|21737->9792|21768->9793|21862->9857|21893->9858|22047->9982|22078->9983|22155->10030|22186->10031|22222->10037|22253->10038|22284->10039|22383->10109|22413->10110|22465->10133|22495->10134
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|63->32|63->32|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|98->67|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|103->72|104->73|105->74|110->79|110->79|111->80|111->80|132->101|132->101|132->101|133->102|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|140->109|140->109|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|146->115|146->115|146->115|146->115|146->115|146->115|146->115|147->116|147->116|147->116|149->118|149->118|149->118|153->122|153->122|153->122|154->123|154->123|154->123|159->128|159->128|159->128|163->132|164->133|166->135|166->135|167->136|167->136|168->137|168->137|168->137|169->138|170->139|170->139|171->140|172->141|172->141|172->141|174->143|174->143|175->144|176->145|176->145|177->146|177->146|177->146|178->147|180->149|180->149|181->150|183->152|183->152|184->153|185->154|185->154|186->155|186->155|186->155|186->155|186->155|186->155|187->156|187->156|187->156|187->156|187->156|188->157|188->157|188->157|188->157|188->157|188->157|189->158|189->158|189->158|189->158|189->158|189->158|190->159|190->159|190->159|190->159|190->159|190->159|191->160|191->160|191->160|191->160|191->160|191->160|192->161|192->161|192->161|192->161|192->161|192->161|193->162|193->162|193->162|194->163|194->163|194->163|194->163|194->163|194->163|195->164|195->164|196->165|196->165|196->165|196->165|196->165|196->165|197->166|197->166|197->166|197->166|197->166|197->166|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|198->167|199->168|199->168|199->168|199->168
                  -- GENERATED --
              */
          