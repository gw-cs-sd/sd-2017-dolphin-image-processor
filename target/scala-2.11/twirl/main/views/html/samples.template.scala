
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
    	</form>
    	</td>
    	<td class="tg-j0tj" style="text-align: center;">
    	<form action='backToUsers' method='POST' enctype="multipart/form-data" id="backToUsersForm">
    	<button type="submit" form="backToUsersForm" value=""""),_display_(/*27.59*/userId),format.raw/*27.65*/(""""  name="backUserId" >Back</button>
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
    <th class="tg-amwm">Action</th>
</tr>
"""),_display_(/*47.2*/for((sample,i) <- samples.zipWithIndex) yield /*47.41*/ {_display_(Seq[Any](format.raw/*47.43*/("""
  """),format.raw/*48.3*/("""<tr>
    <td """),_display_(/*49.10*/if(i % 2==0)/*49.22*/ {_display_(Seq[Any](format.raw/*49.24*/("""class="tg-j0tj"""")))}/*49.41*/else/*49.46*/{_display_(Seq[Any](format.raw/*49.47*/("""class="tg-baqh"""")))}),format.raw/*49.63*/(""">"""),_display_(/*49.65*/sample/*49.71*/.getSampleId()),format.raw/*49.85*/("""</td>
    <td """),_display_(/*50.10*/if(i % 2==0)/*50.22*/ {_display_(Seq[Any](format.raw/*50.24*/("""class="tg-6k2t"""")))}/*50.41*/else/*50.46*/{_display_(Seq[Any](format.raw/*50.47*/("""class="tg-yw4l"""")))}),format.raw/*50.63*/(""">"""),_display_(/*50.65*/sample/*50.71*/.getName()),format.raw/*50.81*/("""</td>
    <td """),_display_(/*51.10*/if(i % 2==0)/*51.22*/ {_display_(Seq[Any](format.raw/*51.24*/("""class="tg-j0tj"""")))}/*51.41*/else/*51.46*/{_display_(Seq[Any](format.raw/*51.47*/("""class="tg-baqh"""")))}),format.raw/*51.63*/(""">"""),_display_(/*51.65*/sample/*51.71*/.getWidth()),format.raw/*51.82*/("""</td>
    <td """),_display_(/*52.10*/if(i % 2==0)/*52.22*/ {_display_(Seq[Any](format.raw/*52.24*/("""class="tg-j0tj"""")))}/*52.41*/else/*52.46*/{_display_(Seq[Any](format.raw/*52.47*/("""class="tg-baqh"""")))}),format.raw/*52.63*/(""">"""),_display_(/*52.65*/sample/*52.71*/.getHeight()),format.raw/*52.83*/("""</td>
    <td """),_display_(/*53.10*/if(i % 2==0)/*53.22*/ {_display_(Seq[Any](format.raw/*53.24*/("""class="tg-6k2t"""")))}/*53.41*/else/*53.46*/{_display_(Seq[Any](format.raw/*53.47*/("""class="tg-yw4l"""")))}),format.raw/*53.63*/(""">"""),_display_(/*53.65*/sample/*53.71*/.getComment()),format.raw/*53.84*/("""</td>
    <td """),_display_(/*54.10*/if(i % 2==0)/*54.22*/ {_display_(Seq[Any](format.raw/*54.24*/("""class="tg-j0tj"""")))}/*54.41*/else/*54.46*/{_display_(Seq[Any](format.raw/*54.47*/("""class="tg-baqh"""")))}),format.raw/*54.63*/(""">"""),_display_(/*54.65*/sample/*54.71*/.getSegmentCount()),format.raw/*54.89*/("""</td>
    <td """),_display_(/*55.10*/if(i % 2==0)/*55.22*/ {_display_(Seq[Any](format.raw/*55.24*/("""class="tg-j0tj"""")))}/*55.41*/else/*55.46*/{_display_(Seq[Any](format.raw/*55.47*/("""class="tg-baqh"""")))}),format.raw/*55.63*/(""">"""),_display_(/*55.65*/sample/*55.71*/.getNumBytes()),format.raw/*55.85*/("""</td>
    <td """),_display_(/*56.10*/if(i % 2==0)/*56.22*/ {_display_(Seq[Any](format.raw/*56.24*/("""class="tg-j0tj"""")))}/*56.41*/else/*56.46*/{_display_(Seq[Any](format.raw/*56.47*/("""class="tg-baqh"""")))}),format.raw/*56.63*/(""">"""),_display_(/*56.65*/sample/*56.71*/.getR()),format.raw/*56.78*/("""</td>
    <td """),_display_(/*57.10*/if(i % 2==0)/*57.22*/ {_display_(Seq[Any](format.raw/*57.24*/("""class="tg-j0tj"""")))}/*57.41*/else/*57.46*/{_display_(Seq[Any](format.raw/*57.47*/("""class="tg-baqh"""")))}),format.raw/*57.63*/(""">"""),_display_(/*57.65*/sample/*57.71*/.getG()),format.raw/*57.78*/("""</td>
    <td """),_display_(/*58.10*/if(i % 2==0)/*58.22*/ {_display_(Seq[Any](format.raw/*58.24*/("""class="tg-j0tj"""")))}/*58.41*/else/*58.46*/{_display_(Seq[Any](format.raw/*58.47*/("""class="tg-baqh"""")))}),format.raw/*58.63*/(""">"""),_display_(/*58.65*/sample/*58.71*/.getB()),format.raw/*58.78*/("""</td>
    <td """),_display_(/*59.10*/if(i % 2==0)/*59.22*/ {_display_(Seq[Any](format.raw/*59.24*/("""class="tg-j0tj"""")))}/*59.41*/else/*59.46*/{_display_(Seq[Any](format.raw/*59.47*/("""class="tg-baqh"""")))}),format.raw/*59.63*/(""">"""),_display_(/*59.65*/sample/*59.71*/.getDateCreated()),format.raw/*59.88*/("""</td>
    <td """),_display_(/*60.10*/if(i % 2==0)/*60.22*/ {_display_(Seq[Any](format.raw/*60.24*/("""class="tg-j0tj"""")))}/*60.41*/else/*60.46*/{_display_(Seq[Any](format.raw/*60.47*/("""class="tg-baqh"""")))}),format.raw/*60.63*/(""">
        <input type="hidden" name="userId" value=""""),_display_(/*61.52*/sample/*61.58*/.getUserId()),format.raw/*61.70*/("""">
        <form action='viewSample' method='POST' enctype="multipart/form-data" id="viewSampleForm">
    	<button type="submit" form="viewSampleForm" value=""""),_display_(/*63.58*/sample/*63.64*/.getSampleId()),format.raw/*63.78*/(""""  name="viewSampleId" >View</button>
    	</form>
    	&nbsp
    	<form action='deleteSample' method='POST' enctype="multipart/form-data" id="deleteSampleForm">
    	<button type="submit" form="deleteSampleForm" value=""""),_display_(/*67.60*/sample/*67.66*/.getSampleId()),format.raw/*67.80*/(""""  name="deleteSampleId" >Delete</button>
    	</form>
    </td>
  </tr>
  """)))}),format.raw/*71.4*/("""
"""),format.raw/*72.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*74.50*/("""{"""),format.raw/*74.51*/(""""use strict";
function r(n,t)"""),format.raw/*75.16*/("""{"""),format.raw/*75.17*/("""
	"""),format.raw/*76.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*76.49*/("""{"""),format.raw/*76.50*/("""
		"""),format.raw/*77.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*78.28*/("""{"""),format.raw/*78.29*/("""
			"""),format.raw/*79.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/(""" """),format.raw/*80.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*82.2*/("""}"""),format.raw/*82.3*/("""
	"""),format.raw/*83.2*/("""return e
"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""
"""),format.raw/*85.1*/("""function e(n,t)"""),format.raw/*85.16*/("""{"""),format.raw/*85.17*/("""
	"""),format.raw/*86.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*88.14*/("""{"""),format.raw/*88.15*/("""
			"""),format.raw/*89.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*91.3*/("""}"""),format.raw/*91.4*/("""
	"""),format.raw/*92.2*/("""),e
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""
"""),format.raw/*94.1*/("""function o(n)"""),format.raw/*94.14*/("""{"""),format.raw/*94.15*/(""" """),format.raw/*94.16*/("""return n.textContent||n.innerText||"" """),format.raw/*94.54*/("""}"""),format.raw/*94.55*/("""
"""),format.raw/*95.1*/("""function i(n)"""),format.raw/*95.14*/("""{"""),format.raw/*95.15*/("""i return n.innerHTML||"" """),format.raw/*95.40*/("""}"""),format.raw/*95.41*/("""
"""),format.raw/*96.1*/("""function u(n,t)"""),format.raw/*96.16*/("""{"""),format.raw/*96.17*/(""" """),format.raw/*96.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*96.48*/("""}"""),format.raw/*96.49*/("""
"""),format.raw/*97.1*/("""function a(n,t)"""),format.raw/*97.16*/("""{"""),format.raw/*97.17*/(""" """),format.raw/*97.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*97.48*/("""}"""),format.raw/*97.49*/("""
"""),format.raw/*98.1*/("""function c(n)"""),format.raw/*98.14*/("""{"""),format.raw/*98.15*/(""" """),format.raw/*98.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*98.66*/("""}"""),format.raw/*98.67*/("""
"""),format.raw/*99.1*/("""function f(n,t)"""),format.raw/*99.16*/("""{"""),format.raw/*99.17*/(""" """),format.raw/*99.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*99.44*/("""}"""),format.raw/*99.45*/("""
"""),format.raw/*100.1*/("""function s(n,t)"""),format.raw/*100.16*/("""{"""),format.raw/*100.17*/(""" """),format.raw/*100.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*100.47*/("""}"""),format.raw/*100.48*/("""
"""),format.raw/*101.1*/("""function d(n,t)"""),format.raw/*101.16*/("""{"""),format.raw/*101.17*/(""" 
	"""),format.raw/*102.2*/("""if(f(n,t))"""),format.raw/*102.12*/("""{"""),format.raw/*102.13*/(""" """),format.raw/*102.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*102.79*/("""}"""),format.raw/*102.80*/("""
"""),format.raw/*103.1*/("""}"""),format.raw/*103.2*/("""
"""),format.raw/*104.1*/("""function v(n)"""),format.raw/*104.14*/("""{"""),format.raw/*104.15*/(""" """),format.raw/*104.16*/("""d(n,L),d(n,E) """),format.raw/*104.30*/("""}"""),format.raw/*104.31*/("""
"""),format.raw/*105.1*/("""function l(n,t,e)"""),format.raw/*105.18*/("""{"""),format.raw/*105.19*/(""" """),format.raw/*105.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*105.75*/("""}"""),format.raw/*105.76*/("""
"""),format.raw/*106.1*/("""function g(n)"""),format.raw/*106.14*/("""{"""),format.raw/*106.15*/("""return function(t,r)"""),format.raw/*106.35*/("""{"""),format.raw/*106.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*106.105*/("""}"""),format.raw/*106.106*/("""}"""),format.raw/*106.107*/("""function h(n)"""),format.raw/*106.120*/("""{"""),format.raw/*106.121*/("""return function(t,r)"""),format.raw/*106.141*/("""{"""),format.raw/*106.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*106.199*/("""}"""),format.raw/*106.200*/("""}"""),format.raw/*106.201*/("""function m(n,t,r)"""),format.raw/*106.218*/("""{"""),format.raw/*106.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*106.253*/("""{"""),format.raw/*106.254*/("""return"""),format.raw/*106.260*/("""{"""),format.raw/*106.261*/("""str:n,index:t"""),format.raw/*106.274*/("""}"""),format.raw/*106.275*/("""}"""),format.raw/*106.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*106.360*/("""{"""),format.raw/*106.361*/("""return n.index"""),format.raw/*106.375*/("""}"""),format.raw/*106.376*/(""")"""),format.raw/*106.377*/("""}"""),format.raw/*106.378*/("""function p(n,t,r,o)"""),format.raw/*106.397*/("""{"""),format.raw/*106.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*106.442*/("""{"""),format.raw/*106.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*106.488*/("""{"""),format.raw/*106.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*106.508*/("""}"""),format.raw/*106.509*/(""")"""),format.raw/*106.510*/("""}"""),format.raw/*106.511*/("""l(n,o,i)"""),format.raw/*106.519*/("""}"""),format.raw/*106.520*/("""function x(n,t)"""),format.raw/*106.535*/("""{"""),format.raw/*106.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*106.574*/("""{"""),format.raw/*106.575*/("""t.addEventListener("click",function()"""),format.raw/*106.612*/("""{"""),format.raw/*106.613*/("""p(n,r,e,t)"""),format.raw/*106.623*/("""}"""),format.raw/*106.624*/("""),s(t,"tg-sort-header")"""),format.raw/*106.647*/("""}"""),format.raw/*106.648*/(""")"""),format.raw/*106.649*/("""}"""),format.raw/*106.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*106.714*/("""{"""),format.raw/*106.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*106.839*/("""{"""),format.raw/*106.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*106.887*/("""}"""),format.raw/*106.888*/("""x(e,i)"""),format.raw/*106.894*/("""}"""),format.raw/*106.895*/("""}"""),format.raw/*106.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*107.58*/("""{"""),format.raw/*107.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*107.82*/("""}"""),format.raw/*107.83*/(""");
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
                  DATE: Mon Jan 02 23:08:47 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/samples.scala.html
                  HASH: e02a2ab49eaf6f074a1f6cf08af921d3f5426cbd
                  MATRIX: 771->1|925->60|953->62|1009->92|1036->93|1139->169|1167->170|1195->172|1227->178|1254->179|1468->365|1497->366|1525->368|1557->374|1584->375|1817->580|1846->581|1874->583|1913->595|1941->596|2004->632|2032->633|2060->635|2099->647|2127->648|2189->683|2217->684|2245->686|2284->698|2312->699|2392->752|2420->753|2448->755|2487->767|2515->768|2585->811|2613->812|2642->814|2682->826|2711->827|2800->888|2829->889|2858->891|2898->903|2927->904|2973->922|3002->923|3031->925|3093->959|3122->960|3151->961|3203->985|3232->986|3294->1020|3323->1021|3352->1022|3405->1046|3435->1047|3482->1065|3512->1066|3542->1067|3587->1083|3617->1084|3676->1114|3706->1115|3737->1117|3911->1262|3941->1263|4006->1299|4036->1300|4067->1302|4117->1323|4147->1324|4264->1412|4294->1413|4325->1415|4389->1450|4419->1451|4476->1479|4506->1480|4537->1482|4612->1528|4642->1529|4671->1531|4819->1652|4846->1658|4875->1659|4905->1662|4934->1670|4963->1671|5342->2023|5369->2029|5666->2299|5693->2305|6265->2851|6320->2890|6360->2892|6391->2896|6433->2911|6454->2923|6494->2925|6529->2942|6542->2947|6581->2948|6628->2964|6657->2966|6672->2972|6707->2986|6750->3002|6771->3014|6811->3016|6846->3033|6859->3038|6898->3039|6945->3055|6974->3057|6989->3063|7020->3073|7063->3089|7084->3101|7124->3103|7159->3120|7172->3125|7211->3126|7258->3142|7287->3144|7302->3150|7334->3161|7377->3177|7398->3189|7438->3191|7473->3208|7486->3213|7525->3214|7572->3230|7601->3232|7616->3238|7649->3250|7692->3266|7713->3278|7753->3280|7788->3297|7801->3302|7840->3303|7887->3319|7916->3321|7931->3327|7965->3340|8008->3356|8029->3368|8069->3370|8104->3387|8117->3392|8156->3393|8203->3409|8232->3411|8247->3417|8286->3435|8329->3451|8350->3463|8390->3465|8425->3482|8438->3487|8477->3488|8524->3504|8553->3506|8568->3512|8603->3526|8646->3542|8667->3554|8707->3556|8742->3573|8755->3578|8794->3579|8841->3595|8870->3597|8885->3603|8913->3610|8956->3626|8977->3638|9017->3640|9052->3657|9065->3662|9104->3663|9151->3679|9180->3681|9195->3687|9223->3694|9266->3710|9287->3722|9327->3724|9362->3741|9375->3746|9414->3747|9461->3763|9490->3765|9505->3771|9533->3778|9576->3794|9597->3806|9637->3808|9672->3825|9685->3830|9724->3831|9771->3847|9800->3849|9815->3855|9853->3872|9896->3888|9917->3900|9957->3902|9992->3919|10005->3924|10044->3925|10091->3941|10172->3995|10187->4001|10220->4013|10408->4174|10423->4180|10458->4194|10710->4419|10725->4425|10760->4439|10870->4519|10899->4521|11035->4629|11064->4630|11122->4660|11151->4661|11181->4664|11256->4711|11285->4712|11316->4716|11384->4756|11413->4757|11445->4762|11514->4804|11542->4805|11570->4806|11674->4883|11702->4884|11732->4887|11769->4897|11797->4898|11826->4900|11869->4915|11898->4916|11928->4919|12012->4975|12041->4976|12073->4981|12155->5036|12183->5037|12213->5040|12245->5045|12273->5046|12302->5048|12343->5061|12372->5062|12401->5063|12467->5101|12496->5102|12525->5104|12566->5117|12595->5118|12648->5143|12677->5144|12706->5146|12749->5161|12778->5162|12807->5163|12865->5193|12894->5194|12923->5196|12966->5211|12995->5212|13024->5213|13082->5243|13111->5244|13140->5246|13181->5259|13210->5260|13239->5261|13317->5311|13346->5312|13375->5314|13418->5329|13447->5330|13476->5331|13530->5357|13559->5358|13589->5360|13633->5375|13663->5376|13693->5377|13751->5406|13781->5407|13811->5409|13855->5424|13885->5425|13917->5429|13956->5439|13986->5440|14016->5441|14110->5506|14140->5507|14170->5509|14199->5510|14229->5512|14271->5525|14301->5526|14331->5527|14374->5541|14404->5542|14434->5544|14480->5561|14510->5562|14540->5563|14624->5618|14654->5619|14684->5621|14726->5634|14756->5635|14805->5655|14835->5656|14934->5725|14965->5726|14996->5727|15039->5740|15070->5741|15120->5761|15151->5762|15238->5819|15269->5820|15300->5821|15347->5838|15378->5839|15442->5873|15473->5874|15509->5880|15540->5881|15583->5894|15614->5895|15645->5896|15759->5980|15790->5981|15834->5995|15865->5996|15896->5997|15927->5998|15976->6017|16007->6018|16081->6062|16112->6063|16187->6108|16218->6109|16267->6128|16298->6129|16329->6130|16360->6131|16398->6139|16429->6140|16474->6155|16505->6156|16573->6194|16604->6195|16671->6232|16702->6233|16742->6243|16773->6244|16826->6267|16857->6268|16888->6269|16919->6270|17013->6334|17044->6335|17198->6459|17229->6460|17306->6507|17337->6508|17373->6514|17404->6515|17435->6516|17534->6586|17564->6587|17616->6610|17646->6611
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|58->27|58->27|78->47|78->47|78->47|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|94->63|94->63|94->63|98->67|98->67|98->67|102->71|103->72|105->74|105->74|106->75|106->75|107->76|107->76|107->76|108->77|109->78|109->78|110->79|111->80|111->80|111->80|113->82|113->82|114->83|115->84|115->84|116->85|116->85|116->85|117->86|119->88|119->88|120->89|122->91|122->91|123->92|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|129->98|129->98|129->98|129->98|129->98|129->98|130->99|130->99|130->99|130->99|130->99|130->99|131->100|131->100|131->100|131->100|131->100|131->100|132->101|132->101|132->101|133->102|133->102|133->102|133->102|133->102|133->102|134->103|134->103|135->104|135->104|135->104|135->104|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|137->106|138->107|138->107|138->107|138->107
                  -- GENERATED --
              */
          