
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
		<input type="radio" name="bloodStatusRadio" value="unknown"> You Tell Me<br>
    	</form>
    	</td>
    	<td class="tg-j0tj" style="text-align: center;">
    	<form action='backToUsers' method='POST' enctype="multipart/form-data" id="backToUsersForm">
    	<button type="submit" form="backToUsersForm" value=""""),_display_(/*33.59*/userId),format.raw/*33.65*/(""""  name="backUserId" >Back</button>
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
	"""),_display_(/*65.3*/for((sample,i) <- samples.zipWithIndex) yield /*65.42*/ {_display_(Seq[Any](format.raw/*65.44*/("""
	"""),format.raw/*66.2*/("""<input type="checkbox" id=i value=""""),_display_(/*66.38*/sample/*66.44*/.getSampleId()),format.raw/*66.58*/("""" name="training"""),_display_(/*66.75*/sample/*66.81*/.getSampleId()),format.raw/*66.95*/(""""><label for=i> """),_display_(/*66.112*/sample/*66.118*/.getName()),format.raw/*66.128*/("""</label><br>
	""")))}),format.raw/*67.3*/("""
	"""),format.raw/*68.2*/("""<br>
  	</td>
  	<td class="tg-0idt">
	<p><b>Test Samples</b></p>
	"""),_display_(/*72.3*/for((sample,i) <- samples.zipWithIndex) yield /*72.42*/ {_display_(Seq[Any](format.raw/*72.44*/("""
	"""),format.raw/*73.2*/("""<input type="checkbox" id=i value=""""),_display_(/*73.38*/sample/*73.44*/.getSampleId()),format.raw/*73.58*/("""" name="test"""),_display_(/*73.71*/sample/*73.77*/.getSampleId()),format.raw/*73.91*/(""""><label for=i> """),_display_(/*73.108*/sample/*73.114*/.getName()),format.raw/*73.124*/("""</label><br>
	""")))}),format.raw/*74.3*/("""
	"""),format.raw/*75.2*/("""<br>
  </td>
  </tr>
  <tr>
  	<td class="tg-0idt" colspan="3">
  	<button type="submit" form="populateDataSetsForm" value=""""),_display_(/*80.62*/userId),format.raw/*80.68*/(""""  name="userId" >Populate Data Sets</button><br>
  	<button type="submit" form="populateDataSetsForm" value=""""),_display_(/*81.62*/userId),format.raw/*81.68*/(""""  name="clearUserId" >Clear Data Sets</button>
  	</td>
  </tr>
</table>
</form>
<form action='runClassifier' method='POST' enctype="multipart/form-data" id="runClassifierForm">
<table id="tg-cFHod" class="tg">
<tr>
	<td class="tg-0idt">
		<button type="submit" form="runClassifierForm" value=""""),_display_(/*90.58*/userId),format.raw/*90.64*/(""""  name="userId" >Run Classifier</button>
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
"""),_display_(/*111.2*/for((sample,i) <- samples.zipWithIndex) yield /*111.41*/ {_display_(Seq[Any](format.raw/*111.43*/("""
  """),format.raw/*112.3*/("""<tr>
    <td """),_display_(/*113.10*/if(i % 2==0)/*113.22*/ {_display_(Seq[Any](format.raw/*113.24*/("""class="tg-j0tj"""")))}/*113.41*/else/*113.46*/{_display_(Seq[Any](format.raw/*113.47*/("""class="tg-baqh"""")))}),format.raw/*113.63*/(""">"""),_display_(/*113.65*/sample/*113.71*/.getSampleId()),format.raw/*113.85*/("""</td>
    <td """),_display_(/*114.10*/if(i % 2==0)/*114.22*/ {_display_(Seq[Any](format.raw/*114.24*/("""class="tg-6k2t"""")))}/*114.41*/else/*114.46*/{_display_(Seq[Any](format.raw/*114.47*/("""class="tg-yw4l"""")))}),format.raw/*114.63*/(""">"""),_display_(/*114.65*/sample/*114.71*/.getName()),format.raw/*114.81*/("""</td>
    <td """),_display_(/*115.10*/if(i % 2==0)/*115.22*/ {_display_(Seq[Any](format.raw/*115.24*/("""class="tg-j0tj"""")))}/*115.41*/else/*115.46*/{_display_(Seq[Any](format.raw/*115.47*/("""class="tg-baqh"""")))}),format.raw/*115.63*/(""">"""),_display_(/*115.65*/sample/*115.71*/.getWidth()),format.raw/*115.82*/("""</td>
    <td """),_display_(/*116.10*/if(i % 2==0)/*116.22*/ {_display_(Seq[Any](format.raw/*116.24*/("""class="tg-j0tj"""")))}/*116.41*/else/*116.46*/{_display_(Seq[Any](format.raw/*116.47*/("""class="tg-baqh"""")))}),format.raw/*116.63*/(""">"""),_display_(/*116.65*/sample/*116.71*/.getHeight()),format.raw/*116.83*/("""</td>
    <td """),_display_(/*117.10*/if(i % 2==0)/*117.22*/ {_display_(Seq[Any](format.raw/*117.24*/("""class="tg-6k2t"""")))}/*117.41*/else/*117.46*/{_display_(Seq[Any](format.raw/*117.47*/("""class="tg-yw4l"""")))}),format.raw/*117.63*/(""">"""),_display_(/*117.65*/sample/*117.71*/.getComment()),format.raw/*117.84*/("""</td>
    <td """),_display_(/*118.10*/if(i % 2==0)/*118.22*/ {_display_(Seq[Any](format.raw/*118.24*/("""class="tg-j0tj"""")))}/*118.41*/else/*118.46*/{_display_(Seq[Any](format.raw/*118.47*/("""class="tg-baqh"""")))}),format.raw/*118.63*/(""">"""),_display_(/*118.65*/sample/*118.71*/.getSegmentCount()),format.raw/*118.89*/("""</td>
    <td """),_display_(/*119.10*/if(i % 2==0)/*119.22*/ {_display_(Seq[Any](format.raw/*119.24*/("""class="tg-j0tj"""")))}/*119.41*/else/*119.46*/{_display_(Seq[Any](format.raw/*119.47*/("""class="tg-baqh"""")))}),format.raw/*119.63*/(""">"""),_display_(/*119.65*/sample/*119.71*/.getNumBytes()),format.raw/*119.85*/("""</td>
    <td """),_display_(/*120.10*/if(i % 2==0)/*120.22*/ {_display_(Seq[Any](format.raw/*120.24*/("""class="tg-j0tj"""")))}/*120.41*/else/*120.46*/{_display_(Seq[Any](format.raw/*120.47*/("""class="tg-baqh"""")))}),format.raw/*120.63*/(""">"""),_display_(/*120.65*/sample/*120.71*/.getR()),format.raw/*120.78*/("""</td>
    <td """),_display_(/*121.10*/if(i % 2==0)/*121.22*/ {_display_(Seq[Any](format.raw/*121.24*/("""class="tg-j0tj"""")))}/*121.41*/else/*121.46*/{_display_(Seq[Any](format.raw/*121.47*/("""class="tg-baqh"""")))}),format.raw/*121.63*/(""">"""),_display_(/*121.65*/sample/*121.71*/.getG()),format.raw/*121.78*/("""</td>
    <td """),_display_(/*122.10*/if(i % 2==0)/*122.22*/ {_display_(Seq[Any](format.raw/*122.24*/("""class="tg-j0tj"""")))}/*122.41*/else/*122.46*/{_display_(Seq[Any](format.raw/*122.47*/("""class="tg-baqh"""")))}),format.raw/*122.63*/(""">"""),_display_(/*122.65*/sample/*122.71*/.getB()),format.raw/*122.78*/("""</td>
    <td """),_display_(/*123.10*/if(i % 2==0)/*123.22*/ {_display_(Seq[Any](format.raw/*123.24*/("""class="tg-j0tj"""")))}/*123.41*/else/*123.46*/{_display_(Seq[Any](format.raw/*123.47*/("""class="tg-baqh"""")))}),format.raw/*123.63*/(""">"""),_display_(/*123.65*/sample/*123.71*/.getDateCreated()),format.raw/*123.88*/("""</td>
    <td """),_display_(/*124.10*/if(i % 2==0)/*124.22*/ {_display_(Seq[Any](format.raw/*124.24*/("""class="tg-j0tj"""")))}/*124.41*/else/*124.46*/{_display_(Seq[Any](format.raw/*124.47*/("""class="tg-baqh"""")))}),format.raw/*124.63*/(""">"""),_display_(/*124.65*/sample/*124.71*/.getBloodStatus()),format.raw/*124.88*/("""</td>
    <td """),_display_(/*125.10*/if(i % 2==0)/*125.22*/ {_display_(Seq[Any](format.raw/*125.24*/("""class="tg-j0tj"""")))}/*125.41*/else/*125.46*/{_display_(Seq[Any](format.raw/*125.47*/("""class="tg-baqh"""")))}),format.raw/*125.63*/(""">
        <input type="hidden" name="userId" value=""""),_display_(/*126.52*/sample/*126.58*/.getUserId()),format.raw/*126.70*/("""">
        <form action='viewSample' method='POST' enctype="multipart/form-data" id="viewSampleForm">
    	<button type="submit" form="viewSampleForm" value=""""),_display_(/*128.58*/sample/*128.64*/.getSampleId()),format.raw/*128.78*/(""""  name="sampleId" >View</button>
    	</form>
    	<!--  COMMENT OUT OLD "ADD TO TRAINING" AND "ADD TO TEST" BUTTONS
    	<form action='addToDataset' method='POST' enctype="multipart/form-data" id="addToDatasetForm">
    	<button type="submit" form="addToDatasetForm" value=""""),_display_(/*132.60*/sample/*132.66*/.getSampleId()),format.raw/*132.80*/(""""  name="trainingSampleId" >Add to TRAINING</button>
    	<button type="submit" form="addToDatasetForm" value=""""),_display_(/*133.60*/sample/*133.66*/.getSampleId()),format.raw/*133.80*/(""""  name="testSampleId" >Add to TEST</button>
    	</form>
    	-->
    	&nbsp
    	<form action='requestDeleteSample' method='POST' enctype="multipart/form-data" id="deleteSampleForm">
    	<button type="submit" form="deleteSampleForm" value=""""),_display_(/*138.60*/sample/*138.66*/.getSampleId()),format.raw/*138.80*/(""""  name="sampleId" >Delete</button>
    	</form>
    	&nbsp
    	<form action='runClassifierSample' method='POST' enctype="multipart/form-data" id="runClassifierSampleForm">
    	<button type="submit" form="runClassifierSampleForm" value=""""),_display_(/*142.67*/sample/*142.73*/.getSampleId()),format.raw/*142.87*/(""""  name="sampleId" >Run Classifier</button>
    	</form>
    </td>
  </tr>
  """)))}),format.raw/*146.4*/("""
"""),format.raw/*147.1*/("""</table>
<script type="text/javascript" charset="utf-8">
function checkAllAttributes()
"""),format.raw/*150.1*/("""{"""),format.raw/*150.2*/("""
	"""),format.raw/*151.2*/("""document.getElementById("area").checked = true;
	document.getElementById("width").checked = true;
	document.getElementById("height").checked = true;
	document.getElementById("perimeter").checked = true;
	document.getElementById("meanR").checked = true;
	document.getElementById("meanG").checked = true;
	document.getElementById("meanB").checked = true;
	document.getElementById("convexity").checked = true;
	document.getElementById("circularity").checked = true;
	document.getElementById("stdDevR").checked = true;
	document.getElementById("relativeX").checked = true;
	document.getElementById("relativeY").checked = true;
	document.getElementById("relativeArea").checked = true;
	document.getElementById("segmentCount").checked = true;
"""),format.raw/*165.1*/("""}"""),format.raw/*165.2*/("""
"""),format.raw/*166.1*/("""function uncheckAllAttributes()
"""),format.raw/*167.1*/("""{"""),format.raw/*167.2*/("""
	"""),format.raw/*168.2*/("""document.getElementById("area").checked = false;
	document.getElementById("width").checked = false;
	document.getElementById("height").checked = false;
	document.getElementById("perimeter").checked = false;
	document.getElementById("meanR").checked = false;
	document.getElementById("meanG").checked = false;
	document.getElementById("meanB").checked = false;
	document.getElementById("convexity").checked = false;
	document.getElementById("circularity").checked = false;
	document.getElementById("stdDevR").checked = false;
	document.getElementById("relativeX").checked = false;
	document.getElementById("relativeY").checked = false;
	document.getElementById("relativeArea").checked = false;
	document.getElementById("segmentCount").checked = false;
"""),format.raw/*182.1*/("""}"""),format.raw/*182.2*/("""
"""),format.raw/*183.1*/("""var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*183.50*/("""{"""),format.raw/*183.51*/(""""use strict";
function r(n,t)"""),format.raw/*184.16*/("""{"""),format.raw/*184.17*/("""
	"""),format.raw/*185.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*185.49*/("""{"""),format.raw/*185.50*/("""
		"""),format.raw/*186.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*187.28*/("""{"""),format.raw/*187.29*/("""
			"""),format.raw/*188.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*189.3*/("""}"""),format.raw/*189.4*/(""" """),format.raw/*189.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*191.2*/("""}"""),format.raw/*191.3*/("""
	"""),format.raw/*192.2*/("""return e
"""),format.raw/*193.1*/("""}"""),format.raw/*193.2*/("""
"""),format.raw/*194.1*/("""function e(n,t)"""),format.raw/*194.16*/("""{"""),format.raw/*194.17*/("""
	"""),format.raw/*195.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*197.14*/("""{"""),format.raw/*197.15*/("""
			"""),format.raw/*198.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*200.3*/("""}"""),format.raw/*200.4*/("""
	"""),format.raw/*201.2*/("""),e
"""),format.raw/*202.1*/("""}"""),format.raw/*202.2*/("""
"""),format.raw/*203.1*/("""function o(n)"""),format.raw/*203.14*/("""{"""),format.raw/*203.15*/(""" """),format.raw/*203.16*/("""return n.textContent||n.innerText||"" """),format.raw/*203.54*/("""}"""),format.raw/*203.55*/("""
"""),format.raw/*204.1*/("""function i(n)"""),format.raw/*204.14*/("""{"""),format.raw/*204.15*/("""i return n.innerHTML||"" """),format.raw/*204.40*/("""}"""),format.raw/*204.41*/("""
"""),format.raw/*205.1*/("""function u(n,t)"""),format.raw/*205.16*/("""{"""),format.raw/*205.17*/(""" """),format.raw/*205.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*205.48*/("""}"""),format.raw/*205.49*/("""
"""),format.raw/*206.1*/("""function a(n,t)"""),format.raw/*206.16*/("""{"""),format.raw/*206.17*/(""" """),format.raw/*206.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*206.48*/("""}"""),format.raw/*206.49*/("""
"""),format.raw/*207.1*/("""function c(n)"""),format.raw/*207.14*/("""{"""),format.raw/*207.15*/(""" """),format.raw/*207.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*207.66*/("""}"""),format.raw/*207.67*/("""
"""),format.raw/*208.1*/("""function f(n,t)"""),format.raw/*208.16*/("""{"""),format.raw/*208.17*/(""" """),format.raw/*208.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*208.44*/("""}"""),format.raw/*208.45*/("""
"""),format.raw/*209.1*/("""function s(n,t)"""),format.raw/*209.16*/("""{"""),format.raw/*209.17*/(""" """),format.raw/*209.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*209.47*/("""}"""),format.raw/*209.48*/("""
"""),format.raw/*210.1*/("""function d(n,t)"""),format.raw/*210.16*/("""{"""),format.raw/*210.17*/(""" 
	"""),format.raw/*211.2*/("""if(f(n,t))"""),format.raw/*211.12*/("""{"""),format.raw/*211.13*/(""" """),format.raw/*211.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*211.79*/("""}"""),format.raw/*211.80*/("""
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""
"""),format.raw/*213.1*/("""function v(n)"""),format.raw/*213.14*/("""{"""),format.raw/*213.15*/(""" """),format.raw/*213.16*/("""d(n,L),d(n,E) """),format.raw/*213.30*/("""}"""),format.raw/*213.31*/("""
"""),format.raw/*214.1*/("""function l(n,t,e)"""),format.raw/*214.18*/("""{"""),format.raw/*214.19*/(""" """),format.raw/*214.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*214.75*/("""}"""),format.raw/*214.76*/("""
"""),format.raw/*215.1*/("""function g(n)"""),format.raw/*215.14*/("""{"""),format.raw/*215.15*/("""return function(t,r)"""),format.raw/*215.35*/("""{"""),format.raw/*215.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*215.105*/("""}"""),format.raw/*215.106*/("""}"""),format.raw/*215.107*/("""function h(n)"""),format.raw/*215.120*/("""{"""),format.raw/*215.121*/("""return function(t,r)"""),format.raw/*215.141*/("""{"""),format.raw/*215.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*215.199*/("""}"""),format.raw/*215.200*/("""}"""),format.raw/*215.201*/("""function m(n,t,r)"""),format.raw/*215.218*/("""{"""),format.raw/*215.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*215.253*/("""{"""),format.raw/*215.254*/("""return"""),format.raw/*215.260*/("""{"""),format.raw/*215.261*/("""str:n,index:t"""),format.raw/*215.274*/("""}"""),format.raw/*215.275*/("""}"""),format.raw/*215.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*215.360*/("""{"""),format.raw/*215.361*/("""return n.index"""),format.raw/*215.375*/("""}"""),format.raw/*215.376*/(""")"""),format.raw/*215.377*/("""}"""),format.raw/*215.378*/("""function p(n,t,r,o)"""),format.raw/*215.397*/("""{"""),format.raw/*215.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*215.442*/("""{"""),format.raw/*215.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*215.488*/("""{"""),format.raw/*215.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*215.508*/("""}"""),format.raw/*215.509*/(""")"""),format.raw/*215.510*/("""}"""),format.raw/*215.511*/("""l(n,o,i)"""),format.raw/*215.519*/("""}"""),format.raw/*215.520*/("""function x(n,t)"""),format.raw/*215.535*/("""{"""),format.raw/*215.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*215.574*/("""{"""),format.raw/*215.575*/("""t.addEventListener("click",function()"""),format.raw/*215.612*/("""{"""),format.raw/*215.613*/("""p(n,r,e,t)"""),format.raw/*215.623*/("""}"""),format.raw/*215.624*/("""),s(t,"tg-sort-header")"""),format.raw/*215.647*/("""}"""),format.raw/*215.648*/(""")"""),format.raw/*215.649*/("""}"""),format.raw/*215.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*215.714*/("""{"""),format.raw/*215.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*215.839*/("""{"""),format.raw/*215.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*215.887*/("""}"""),format.raw/*215.888*/("""x(e,i)"""),format.raw/*215.894*/("""}"""),format.raw/*215.895*/("""}"""),format.raw/*215.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*216.58*/("""{"""),format.raw/*216.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*216.82*/("""}"""),format.raw/*216.83*/(""");
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
                  DATE: Wed Mar 29 22:56:51 EDT 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/samples.scala.html
                  HASH: 135520d460dd9d458f5c00cc1e4e28c59ee9fd29
                  MATRIX: 771->1|925->60|953->62|1009->92|1036->93|1139->169|1167->170|1195->172|1227->178|1254->179|1468->365|1497->366|1525->368|1557->374|1584->375|1817->580|1846->581|1874->583|1913->595|1941->596|2004->632|2032->633|2060->635|2099->647|2127->648|2189->683|2217->684|2245->686|2284->698|2312->699|2392->752|2420->753|2448->755|2487->767|2515->768|2585->811|2613->812|2642->814|2682->826|2711->827|2800->888|2829->889|2858->891|2898->903|2927->904|2973->922|3002->923|3031->925|3093->959|3122->960|3151->961|3203->985|3232->986|3294->1020|3323->1021|3352->1022|3405->1046|3435->1047|3482->1065|3512->1066|3542->1067|3587->1083|3617->1084|3676->1114|3706->1115|3737->1117|3911->1262|3941->1263|4006->1299|4036->1300|4067->1302|4117->1323|4147->1324|4264->1412|4294->1413|4325->1415|4389->1450|4419->1451|4476->1479|4506->1480|4537->1482|4612->1528|4642->1529|4671->1531|4819->1652|4846->1658|4875->1659|4905->1662|4934->1670|4963->1671|5342->2023|5369->2029|5966->2599|5993->2605|8031->4617|8086->4656|8126->4658|8156->4661|8219->4697|8234->4703|8269->4717|8313->4734|8328->4740|8363->4754|8408->4771|8424->4777|8456->4787|8502->4803|8532->4806|8630->4878|8685->4917|8725->4919|8755->4922|8818->4958|8833->4964|8868->4978|8908->4991|8923->4997|8958->5011|9003->5028|9019->5034|9051->5044|9097->5060|9127->5063|9284->5193|9311->5199|9450->5311|9477->5317|9809->5622|9836->5628|10444->6209|10500->6248|10541->6250|10573->6254|10616->6269|10638->6281|10679->6283|10715->6300|10729->6305|10769->6306|10817->6322|10847->6324|10863->6330|10899->6344|10943->6360|10965->6372|11006->6374|11042->6391|11056->6396|11096->6397|11144->6413|11174->6415|11190->6421|11222->6431|11266->6447|11288->6459|11329->6461|11365->6478|11379->6483|11419->6484|11467->6500|11497->6502|11513->6508|11546->6519|11590->6535|11612->6547|11653->6549|11689->6566|11703->6571|11743->6572|11791->6588|11821->6590|11837->6596|11871->6608|11915->6624|11937->6636|11978->6638|12014->6655|12028->6660|12068->6661|12116->6677|12146->6679|12162->6685|12197->6698|12241->6714|12263->6726|12304->6728|12340->6745|12354->6750|12394->6751|12442->6767|12472->6769|12488->6775|12528->6793|12572->6809|12594->6821|12635->6823|12671->6840|12685->6845|12725->6846|12773->6862|12803->6864|12819->6870|12855->6884|12899->6900|12921->6912|12962->6914|12998->6931|13012->6936|13052->6937|13100->6953|13130->6955|13146->6961|13175->6968|13219->6984|13241->6996|13282->6998|13318->7015|13332->7020|13372->7021|13420->7037|13450->7039|13466->7045|13495->7052|13539->7068|13561->7080|13602->7082|13638->7099|13652->7104|13692->7105|13740->7121|13770->7123|13786->7129|13815->7136|13859->7152|13881->7164|13922->7166|13958->7183|13972->7188|14012->7189|14060->7205|14090->7207|14106->7213|14145->7230|14189->7246|14211->7258|14252->7260|14288->7277|14302->7282|14342->7283|14390->7299|14420->7301|14436->7307|14475->7324|14519->7340|14541->7352|14582->7354|14618->7371|14632->7376|14672->7377|14720->7393|14802->7447|14818->7453|14852->7465|15041->7626|15057->7632|15093->7646|15402->7927|15418->7933|15454->7947|15595->8060|15611->8066|15647->8080|15924->8329|15940->8335|15976->8349|16248->8593|16264->8599|16300->8613|16413->8695|16443->8697|16561->8787|16590->8788|16621->8791|17400->9542|17429->9543|17459->9545|17520->9578|17549->9579|17580->9582|18373->10347|18402->10348|18432->10350|18510->10399|18540->10400|18599->10430|18629->10431|18660->10434|18736->10481|18766->10482|18798->10486|18867->10526|18897->10527|18930->10532|19000->10574|19029->10575|19058->10576|19163->10653|19192->10654|19223->10657|19261->10667|19290->10668|19320->10670|19364->10685|19394->10686|19425->10689|19510->10745|19540->10746|19573->10751|19656->10806|19685->10807|19716->10810|19749->10815|19778->10816|19808->10818|19850->10831|19880->10832|19910->10833|19977->10871|20007->10872|20037->10874|20079->10887|20109->10888|20163->10913|20193->10914|20223->10916|20267->10931|20297->10932|20327->10933|20386->10963|20416->10964|20446->10966|20490->10981|20520->10982|20550->10983|20609->11013|20639->11014|20669->11016|20711->11029|20741->11030|20771->11031|20850->11081|20880->11082|20910->11084|20954->11099|20984->11100|21014->11101|21069->11127|21099->11128|21129->11130|21173->11145|21203->11146|21233->11147|21291->11176|21321->11177|21351->11179|21395->11194|21425->11195|21457->11199|21496->11209|21526->11210|21556->11211|21650->11276|21680->11277|21710->11279|21739->11280|21769->11282|21811->11295|21841->11296|21871->11297|21914->11311|21944->11312|21974->11314|22020->11331|22050->11332|22080->11333|22164->11388|22194->11389|22224->11391|22266->11404|22296->11405|22345->11425|22375->11426|22474->11495|22505->11496|22536->11497|22579->11510|22610->11511|22660->11531|22691->11532|22778->11589|22809->11590|22840->11591|22887->11608|22918->11609|22982->11643|23013->11644|23049->11650|23080->11651|23123->11664|23154->11665|23185->11666|23299->11750|23330->11751|23374->11765|23405->11766|23436->11767|23467->11768|23516->11787|23547->11788|23621->11832|23652->11833|23727->11878|23758->11879|23807->11898|23838->11899|23869->11900|23900->11901|23938->11909|23969->11910|24014->11925|24045->11926|24113->11964|24144->11965|24211->12002|24242->12003|24282->12013|24313->12014|24366->12037|24397->12038|24428->12039|24459->12040|24553->12104|24584->12105|24738->12229|24769->12230|24846->12277|24877->12278|24913->12284|24944->12285|24975->12286|25074->12356|25104->12357|25156->12380|25186->12381
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|64->33|64->33|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|98->67|99->68|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|105->74|106->75|111->80|111->80|112->81|112->81|121->90|121->90|142->111|142->111|142->111|143->112|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|147->116|147->116|147->116|147->116|147->116|147->116|147->116|147->116|147->116|147->116|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|150->119|150->119|150->119|150->119|150->119|150->119|150->119|150->119|150->119|150->119|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|153->122|153->122|153->122|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|156->125|156->125|156->125|156->125|156->125|156->125|156->125|157->126|157->126|157->126|159->128|159->128|159->128|163->132|163->132|163->132|164->133|164->133|164->133|169->138|169->138|169->138|173->142|173->142|173->142|177->146|178->147|181->150|181->150|182->151|196->165|196->165|197->166|198->167|198->167|199->168|213->182|213->182|214->183|214->183|214->183|215->184|215->184|216->185|216->185|216->185|217->186|218->187|218->187|219->188|220->189|220->189|220->189|222->191|222->191|223->192|224->193|224->193|225->194|225->194|225->194|226->195|228->197|228->197|229->198|231->200|231->200|232->201|233->202|233->202|234->203|234->203|234->203|234->203|234->203|234->203|235->204|235->204|235->204|235->204|235->204|236->205|236->205|236->205|236->205|236->205|236->205|237->206|237->206|237->206|237->206|237->206|237->206|238->207|238->207|238->207|238->207|238->207|238->207|239->208|239->208|239->208|239->208|239->208|239->208|240->209|240->209|240->209|240->209|240->209|240->209|241->210|241->210|241->210|242->211|242->211|242->211|242->211|242->211|242->211|243->212|243->212|244->213|244->213|244->213|244->213|244->213|244->213|245->214|245->214|245->214|245->214|245->214|245->214|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|246->215|247->216|247->216|247->216|247->216
                  -- GENERATED --
              */
          