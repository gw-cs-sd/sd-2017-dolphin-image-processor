
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
"""),_display_(/*53.2*/for((sample,i) <- samples.zipWithIndex) yield /*53.41*/ {_display_(Seq[Any](format.raw/*53.43*/("""
  """),format.raw/*54.3*/("""<tr>
    <td """),_display_(/*55.10*/if(i % 2==0)/*55.22*/ {_display_(Seq[Any](format.raw/*55.24*/("""class="tg-j0tj"""")))}/*55.41*/else/*55.46*/{_display_(Seq[Any](format.raw/*55.47*/("""class="tg-baqh"""")))}),format.raw/*55.63*/(""">"""),_display_(/*55.65*/sample/*55.71*/.getSampleId()),format.raw/*55.85*/("""</td>
    <td """),_display_(/*56.10*/if(i % 2==0)/*56.22*/ {_display_(Seq[Any](format.raw/*56.24*/("""class="tg-6k2t"""")))}/*56.41*/else/*56.46*/{_display_(Seq[Any](format.raw/*56.47*/("""class="tg-yw4l"""")))}),format.raw/*56.63*/(""">"""),_display_(/*56.65*/sample/*56.71*/.getName()),format.raw/*56.81*/("""</td>
    <td """),_display_(/*57.10*/if(i % 2==0)/*57.22*/ {_display_(Seq[Any](format.raw/*57.24*/("""class="tg-j0tj"""")))}/*57.41*/else/*57.46*/{_display_(Seq[Any](format.raw/*57.47*/("""class="tg-baqh"""")))}),format.raw/*57.63*/(""">"""),_display_(/*57.65*/sample/*57.71*/.getWidth()),format.raw/*57.82*/("""</td>
    <td """),_display_(/*58.10*/if(i % 2==0)/*58.22*/ {_display_(Seq[Any](format.raw/*58.24*/("""class="tg-j0tj"""")))}/*58.41*/else/*58.46*/{_display_(Seq[Any](format.raw/*58.47*/("""class="tg-baqh"""")))}),format.raw/*58.63*/(""">"""),_display_(/*58.65*/sample/*58.71*/.getHeight()),format.raw/*58.83*/("""</td>
    <td """),_display_(/*59.10*/if(i % 2==0)/*59.22*/ {_display_(Seq[Any](format.raw/*59.24*/("""class="tg-6k2t"""")))}/*59.41*/else/*59.46*/{_display_(Seq[Any](format.raw/*59.47*/("""class="tg-yw4l"""")))}),format.raw/*59.63*/(""">"""),_display_(/*59.65*/sample/*59.71*/.getComment()),format.raw/*59.84*/("""</td>
    <td """),_display_(/*60.10*/if(i % 2==0)/*60.22*/ {_display_(Seq[Any](format.raw/*60.24*/("""class="tg-j0tj"""")))}/*60.41*/else/*60.46*/{_display_(Seq[Any](format.raw/*60.47*/("""class="tg-baqh"""")))}),format.raw/*60.63*/(""">"""),_display_(/*60.65*/sample/*60.71*/.getSegmentCount()),format.raw/*60.89*/("""</td>
    <td """),_display_(/*61.10*/if(i % 2==0)/*61.22*/ {_display_(Seq[Any](format.raw/*61.24*/("""class="tg-j0tj"""")))}/*61.41*/else/*61.46*/{_display_(Seq[Any](format.raw/*61.47*/("""class="tg-baqh"""")))}),format.raw/*61.63*/(""">"""),_display_(/*61.65*/sample/*61.71*/.getNumBytes()),format.raw/*61.85*/("""</td>
    <td """),_display_(/*62.10*/if(i % 2==0)/*62.22*/ {_display_(Seq[Any](format.raw/*62.24*/("""class="tg-j0tj"""")))}/*62.41*/else/*62.46*/{_display_(Seq[Any](format.raw/*62.47*/("""class="tg-baqh"""")))}),format.raw/*62.63*/(""">"""),_display_(/*62.65*/sample/*62.71*/.getR()),format.raw/*62.78*/("""</td>
    <td """),_display_(/*63.10*/if(i % 2==0)/*63.22*/ {_display_(Seq[Any](format.raw/*63.24*/("""class="tg-j0tj"""")))}/*63.41*/else/*63.46*/{_display_(Seq[Any](format.raw/*63.47*/("""class="tg-baqh"""")))}),format.raw/*63.63*/(""">"""),_display_(/*63.65*/sample/*63.71*/.getG()),format.raw/*63.78*/("""</td>
    <td """),_display_(/*64.10*/if(i % 2==0)/*64.22*/ {_display_(Seq[Any](format.raw/*64.24*/("""class="tg-j0tj"""")))}/*64.41*/else/*64.46*/{_display_(Seq[Any](format.raw/*64.47*/("""class="tg-baqh"""")))}),format.raw/*64.63*/(""">"""),_display_(/*64.65*/sample/*64.71*/.getB()),format.raw/*64.78*/("""</td>
    <td """),_display_(/*65.10*/if(i % 2==0)/*65.22*/ {_display_(Seq[Any](format.raw/*65.24*/("""class="tg-j0tj"""")))}/*65.41*/else/*65.46*/{_display_(Seq[Any](format.raw/*65.47*/("""class="tg-baqh"""")))}),format.raw/*65.63*/(""">"""),_display_(/*65.65*/sample/*65.71*/.getDateCreated()),format.raw/*65.88*/("""</td>
    <td """),_display_(/*66.10*/if(i % 2==0)/*66.22*/ {_display_(Seq[Any](format.raw/*66.24*/("""class="tg-j0tj"""")))}/*66.41*/else/*66.46*/{_display_(Seq[Any](format.raw/*66.47*/("""class="tg-baqh"""")))}),format.raw/*66.63*/(""">"""),_display_(/*66.65*/sample/*66.71*/.getBloodStatus()),format.raw/*66.88*/("""</td>
    <td """),_display_(/*67.10*/if(i % 2==0)/*67.22*/ {_display_(Seq[Any](format.raw/*67.24*/("""class="tg-j0tj"""")))}/*67.41*/else/*67.46*/{_display_(Seq[Any](format.raw/*67.47*/("""class="tg-baqh"""")))}),format.raw/*67.63*/(""">
        <input type="hidden" name="userId" value=""""),_display_(/*68.52*/sample/*68.58*/.getUserId()),format.raw/*68.70*/("""">
        <form action='viewSample' method='POST' enctype="multipart/form-data" id="viewSampleForm">
    	<button type="submit" form="viewSampleForm" value=""""),_display_(/*70.58*/sample/*70.64*/.getSampleId()),format.raw/*70.78*/(""""  name="sampleId" >View</button>
    	</form>
    	&nbsp
    	<form action='requestDeleteSample' method='POST' enctype="multipart/form-data" id="deleteSampleForm">
    	<button type="submit" form="deleteSampleForm" value=""""),_display_(/*74.60*/sample/*74.66*/.getSampleId()),format.raw/*74.80*/(""""  name="sampleId" >Delete</button>
    	</form>
    </td>
  </tr>
  """)))}),format.raw/*78.4*/("""
"""),format.raw/*79.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*81.50*/("""{"""),format.raw/*81.51*/(""""use strict";
function r(n,t)"""),format.raw/*82.16*/("""{"""),format.raw/*82.17*/("""
	"""),format.raw/*83.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*83.49*/("""{"""),format.raw/*83.50*/("""
		"""),format.raw/*84.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*85.28*/("""{"""),format.raw/*85.29*/("""
			"""),format.raw/*86.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/(""" """),format.raw/*87.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*89.2*/("""}"""),format.raw/*89.3*/("""
	"""),format.raw/*90.2*/("""return e
"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/("""
"""),format.raw/*92.1*/("""function e(n,t)"""),format.raw/*92.16*/("""{"""),format.raw/*92.17*/("""
	"""),format.raw/*93.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*95.14*/("""{"""),format.raw/*95.15*/("""
			"""),format.raw/*96.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*98.3*/("""}"""),format.raw/*98.4*/("""
	"""),format.raw/*99.2*/("""),e
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""
"""),format.raw/*101.1*/("""function o(n)"""),format.raw/*101.14*/("""{"""),format.raw/*101.15*/(""" """),format.raw/*101.16*/("""return n.textContent||n.innerText||"" """),format.raw/*101.54*/("""}"""),format.raw/*101.55*/("""
"""),format.raw/*102.1*/("""function i(n)"""),format.raw/*102.14*/("""{"""),format.raw/*102.15*/("""i return n.innerHTML||"" """),format.raw/*102.40*/("""}"""),format.raw/*102.41*/("""
"""),format.raw/*103.1*/("""function u(n,t)"""),format.raw/*103.16*/("""{"""),format.raw/*103.17*/(""" """),format.raw/*103.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*103.48*/("""}"""),format.raw/*103.49*/("""
"""),format.raw/*104.1*/("""function a(n,t)"""),format.raw/*104.16*/("""{"""),format.raw/*104.17*/(""" """),format.raw/*104.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*104.48*/("""}"""),format.raw/*104.49*/("""
"""),format.raw/*105.1*/("""function c(n)"""),format.raw/*105.14*/("""{"""),format.raw/*105.15*/(""" """),format.raw/*105.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*105.66*/("""}"""),format.raw/*105.67*/("""
"""),format.raw/*106.1*/("""function f(n,t)"""),format.raw/*106.16*/("""{"""),format.raw/*106.17*/(""" """),format.raw/*106.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*106.44*/("""}"""),format.raw/*106.45*/("""
"""),format.raw/*107.1*/("""function s(n,t)"""),format.raw/*107.16*/("""{"""),format.raw/*107.17*/(""" """),format.raw/*107.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*107.47*/("""}"""),format.raw/*107.48*/("""
"""),format.raw/*108.1*/("""function d(n,t)"""),format.raw/*108.16*/("""{"""),format.raw/*108.17*/(""" 
	"""),format.raw/*109.2*/("""if(f(n,t))"""),format.raw/*109.12*/("""{"""),format.raw/*109.13*/(""" """),format.raw/*109.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*109.79*/("""}"""),format.raw/*109.80*/("""
"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/("""
"""),format.raw/*111.1*/("""function v(n)"""),format.raw/*111.14*/("""{"""),format.raw/*111.15*/(""" """),format.raw/*111.16*/("""d(n,L),d(n,E) """),format.raw/*111.30*/("""}"""),format.raw/*111.31*/("""
"""),format.raw/*112.1*/("""function l(n,t,e)"""),format.raw/*112.18*/("""{"""),format.raw/*112.19*/(""" """),format.raw/*112.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*112.75*/("""}"""),format.raw/*112.76*/("""
"""),format.raw/*113.1*/("""function g(n)"""),format.raw/*113.14*/("""{"""),format.raw/*113.15*/("""return function(t,r)"""),format.raw/*113.35*/("""{"""),format.raw/*113.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*113.105*/("""}"""),format.raw/*113.106*/("""}"""),format.raw/*113.107*/("""function h(n)"""),format.raw/*113.120*/("""{"""),format.raw/*113.121*/("""return function(t,r)"""),format.raw/*113.141*/("""{"""),format.raw/*113.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*113.199*/("""}"""),format.raw/*113.200*/("""}"""),format.raw/*113.201*/("""function m(n,t,r)"""),format.raw/*113.218*/("""{"""),format.raw/*113.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*113.253*/("""{"""),format.raw/*113.254*/("""return"""),format.raw/*113.260*/("""{"""),format.raw/*113.261*/("""str:n,index:t"""),format.raw/*113.274*/("""}"""),format.raw/*113.275*/("""}"""),format.raw/*113.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*113.360*/("""{"""),format.raw/*113.361*/("""return n.index"""),format.raw/*113.375*/("""}"""),format.raw/*113.376*/(""")"""),format.raw/*113.377*/("""}"""),format.raw/*113.378*/("""function p(n,t,r,o)"""),format.raw/*113.397*/("""{"""),format.raw/*113.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*113.442*/("""{"""),format.raw/*113.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*113.488*/("""{"""),format.raw/*113.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*113.508*/("""}"""),format.raw/*113.509*/(""")"""),format.raw/*113.510*/("""}"""),format.raw/*113.511*/("""l(n,o,i)"""),format.raw/*113.519*/("""}"""),format.raw/*113.520*/("""function x(n,t)"""),format.raw/*113.535*/("""{"""),format.raw/*113.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*113.574*/("""{"""),format.raw/*113.575*/("""t.addEventListener("click",function()"""),format.raw/*113.612*/("""{"""),format.raw/*113.613*/("""p(n,r,e,t)"""),format.raw/*113.623*/("""}"""),format.raw/*113.624*/("""),s(t,"tg-sort-header")"""),format.raw/*113.647*/("""}"""),format.raw/*113.648*/(""")"""),format.raw/*113.649*/("""}"""),format.raw/*113.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*113.714*/("""{"""),format.raw/*113.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*113.839*/("""{"""),format.raw/*113.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*113.887*/("""}"""),format.raw/*113.888*/("""x(e,i)"""),format.raw/*113.894*/("""}"""),format.raw/*113.895*/("""}"""),format.raw/*113.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*114.58*/("""{"""),format.raw/*114.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*114.82*/("""}"""),format.raw/*114.83*/(""");
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
                  DATE: Fri Feb 24 15:06:44 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/samples.scala.html
                  HASH: f4ad51641d7fb464c57d4b308bead5eb037adb3a
                  MATRIX: 771->1|925->60|953->62|1009->92|1036->93|1139->169|1167->170|1195->172|1227->178|1254->179|1468->365|1497->366|1525->368|1557->374|1584->375|1817->580|1846->581|1874->583|1913->595|1941->596|2004->632|2032->633|2060->635|2099->647|2127->648|2189->683|2217->684|2245->686|2284->698|2312->699|2392->752|2420->753|2448->755|2487->767|2515->768|2585->811|2613->812|2642->814|2682->826|2711->827|2800->888|2829->889|2858->891|2898->903|2927->904|2973->922|3002->923|3031->925|3093->959|3122->960|3151->961|3203->985|3232->986|3294->1020|3323->1021|3352->1022|3405->1046|3435->1047|3482->1065|3512->1066|3542->1067|3587->1083|3617->1084|3676->1114|3706->1115|3737->1117|3911->1262|3941->1263|4006->1299|4036->1300|4067->1302|4117->1323|4147->1324|4264->1412|4294->1413|4325->1415|4389->1450|4419->1451|4476->1479|4506->1480|4537->1482|4612->1528|4642->1529|4671->1531|4819->1652|4846->1658|4875->1659|4905->1662|4934->1670|4963->1671|5342->2023|5369->2029|5886->2519|5913->2525|6527->3113|6582->3152|6622->3154|6653->3158|6695->3173|6716->3185|6756->3187|6791->3204|6804->3209|6843->3210|6890->3226|6919->3228|6934->3234|6969->3248|7012->3264|7033->3276|7073->3278|7108->3295|7121->3300|7160->3301|7207->3317|7236->3319|7251->3325|7282->3335|7325->3351|7346->3363|7386->3365|7421->3382|7434->3387|7473->3388|7520->3404|7549->3406|7564->3412|7596->3423|7639->3439|7660->3451|7700->3453|7735->3470|7748->3475|7787->3476|7834->3492|7863->3494|7878->3500|7911->3512|7954->3528|7975->3540|8015->3542|8050->3559|8063->3564|8102->3565|8149->3581|8178->3583|8193->3589|8227->3602|8270->3618|8291->3630|8331->3632|8366->3649|8379->3654|8418->3655|8465->3671|8494->3673|8509->3679|8548->3697|8591->3713|8612->3725|8652->3727|8687->3744|8700->3749|8739->3750|8786->3766|8815->3768|8830->3774|8865->3788|8908->3804|8929->3816|8969->3818|9004->3835|9017->3840|9056->3841|9103->3857|9132->3859|9147->3865|9175->3872|9218->3888|9239->3900|9279->3902|9314->3919|9327->3924|9366->3925|9413->3941|9442->3943|9457->3949|9485->3956|9528->3972|9549->3984|9589->3986|9624->4003|9637->4008|9676->4009|9723->4025|9752->4027|9767->4033|9795->4040|9838->4056|9859->4068|9899->4070|9934->4087|9947->4092|9986->4093|10033->4109|10062->4111|10077->4117|10115->4134|10158->4150|10179->4162|10219->4164|10254->4181|10267->4186|10306->4187|10353->4203|10382->4205|10397->4211|10435->4228|10478->4244|10499->4256|10539->4258|10574->4275|10587->4280|10626->4281|10673->4297|10754->4351|10769->4357|10802->4369|10990->4530|11005->4536|11040->4550|11295->4778|11310->4784|11345->4798|11449->4872|11478->4874|11614->4982|11643->4983|11701->5013|11730->5014|11760->5017|11835->5064|11864->5065|11895->5069|11963->5109|11992->5110|12024->5115|12093->5157|12121->5158|12149->5159|12253->5236|12281->5237|12311->5240|12348->5250|12376->5251|12405->5253|12448->5268|12477->5269|12507->5272|12591->5328|12620->5329|12652->5334|12734->5389|12762->5390|12792->5393|12825->5398|12854->5399|12884->5401|12926->5414|12956->5415|12986->5416|13053->5454|13083->5455|13113->5457|13155->5470|13185->5471|13239->5496|13269->5497|13299->5499|13343->5514|13373->5515|13403->5516|13462->5546|13492->5547|13522->5549|13566->5564|13596->5565|13626->5566|13685->5596|13715->5597|13745->5599|13787->5612|13817->5613|13847->5614|13926->5664|13956->5665|13986->5667|14030->5682|14060->5683|14090->5684|14145->5710|14175->5711|14205->5713|14249->5728|14279->5729|14309->5730|14367->5759|14397->5760|14427->5762|14471->5777|14501->5778|14533->5782|14572->5792|14602->5793|14632->5794|14726->5859|14756->5860|14786->5862|14815->5863|14845->5865|14887->5878|14917->5879|14947->5880|14990->5894|15020->5895|15050->5897|15096->5914|15126->5915|15156->5916|15240->5971|15270->5972|15300->5974|15342->5987|15372->5988|15421->6008|15451->6009|15550->6078|15581->6079|15612->6080|15655->6093|15686->6094|15736->6114|15767->6115|15854->6172|15885->6173|15916->6174|15963->6191|15994->6192|16058->6226|16089->6227|16125->6233|16156->6234|16199->6247|16230->6248|16261->6249|16375->6333|16406->6334|16450->6348|16481->6349|16512->6350|16543->6351|16592->6370|16623->6371|16697->6415|16728->6416|16803->6461|16834->6462|16883->6481|16914->6482|16945->6483|16976->6484|17014->6492|17045->6493|17090->6508|17121->6509|17189->6547|17220->6548|17287->6585|17318->6586|17358->6596|17389->6597|17442->6620|17473->6621|17504->6622|17535->6623|17629->6687|17660->6688|17814->6812|17845->6813|17922->6860|17953->6861|17989->6867|18020->6868|18051->6869|18150->6939|18180->6940|18232->6963|18262->6964
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|63->32|63->32|84->53|84->53|84->53|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|101->70|101->70|101->70|105->74|105->74|105->74|109->78|110->79|112->81|112->81|113->82|113->82|114->83|114->83|114->83|115->84|116->85|116->85|117->86|118->87|118->87|118->87|120->89|120->89|121->90|122->91|122->91|123->92|123->92|123->92|124->93|126->95|126->95|127->96|129->98|129->98|130->99|131->100|131->100|132->101|132->101|132->101|132->101|132->101|132->101|133->102|133->102|133->102|133->102|133->102|134->103|134->103|134->103|134->103|134->103|134->103|135->104|135->104|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107|138->107|138->107|139->108|139->108|139->108|140->109|140->109|140->109|140->109|140->109|140->109|141->110|141->110|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|144->113|145->114|145->114|145->114|145->114
                  -- GENERATED --
              */
          