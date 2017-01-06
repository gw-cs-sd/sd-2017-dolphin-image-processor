
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
    </tr>

	"""),_display_(/*41.3*/for((segment,i) <- segments.zipWithIndex) yield /*41.44*/ {_display_(Seq[Any](format.raw/*41.46*/("""
    	"""),format.raw/*42.6*/("""<tr>
    		<td """),_display_(/*43.12*/if(i % 2==0)/*43.24*/ {_display_(Seq[Any](format.raw/*43.26*/("""class="tg-j0tj"""")))}/*43.43*/else/*43.48*/{_display_(Seq[Any](format.raw/*43.49*/("""class="tg-baqh"""")))}),format.raw/*43.65*/(""">"""),_display_(/*43.67*/segment/*43.74*/.getLabel()),format.raw/*43.85*/("""</td>
    		<td """),_display_(/*44.12*/if(i % 2==0)/*44.24*/ {_display_(Seq[Any](format.raw/*44.26*/("""class="tg-6k2t"""")))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""class="tg-yw4l"""")))}),format.raw/*44.65*/(""">"""),_display_(/*44.67*/segment/*44.74*/.getSegmentId()),format.raw/*44.89*/("""</td>
    		<td """),_display_(/*45.12*/if(i % 2==0)/*45.24*/ {_display_(Seq[Any](format.raw/*45.26*/("""class="tg-j0tj"""")))}/*45.43*/else/*45.48*/{_display_(Seq[Any](format.raw/*45.49*/("""class="tg-baqh"""")))}),format.raw/*45.65*/(""">"""),_display_(/*45.67*/segment/*45.74*/.getArea()),format.raw/*45.84*/("""</td>
    		<td """),_display_(/*46.12*/if(i % 2==0)/*46.24*/ {_display_(Seq[Any](format.raw/*46.26*/("""class="tg-j0tj"""")))}/*46.43*/else/*46.48*/{_display_(Seq[Any](format.raw/*46.49*/("""class="tg-baqh"""")))}),format.raw/*46.65*/(""">"""),_display_(/*46.67*/segment/*46.74*/.getHeight()),format.raw/*46.86*/("""</td>
     		<td """),_display_(/*47.13*/if(i % 2==0)/*47.25*/ {_display_(Seq[Any](format.raw/*47.27*/("""class="tg-j0tj"""")))}/*47.44*/else/*47.49*/{_display_(Seq[Any](format.raw/*47.50*/("""class="tg-baqh"""")))}),format.raw/*47.66*/(""">"""),_display_(/*47.68*/segment/*47.75*/.getWidth()),format.raw/*47.86*/("""</td>
     		<td """),_display_(/*48.13*/if(i % 2==0)/*48.25*/ {_display_(Seq[Any](format.raw/*48.27*/("""class="tg-j0tj"""")))}/*48.44*/else/*48.49*/{_display_(Seq[Any](format.raw/*48.50*/("""class="tg-baqh"""")))}),format.raw/*48.66*/(""">"""),_display_(/*48.68*/segment/*48.75*/.getPerimeter()),format.raw/*48.90*/("""</td>
    	</tr>
	""")))}),format.raw/*50.3*/("""
"""),format.raw/*51.1*/("""</table>
<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*53.50*/("""{"""),format.raw/*53.51*/(""""use strict";
function r(n,t)"""),format.raw/*54.16*/("""{"""),format.raw/*54.17*/("""
	"""),format.raw/*55.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*55.49*/("""{"""),format.raw/*55.50*/("""
		"""),format.raw/*56.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*57.28*/("""{"""),format.raw/*57.29*/("""
			"""),format.raw/*58.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/(""" """),format.raw/*59.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*61.2*/("""}"""),format.raw/*61.3*/("""
	"""),format.raw/*62.2*/("""return e
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""
"""),format.raw/*64.1*/("""function e(n,t)"""),format.raw/*64.16*/("""{"""),format.raw/*64.17*/("""
	"""),format.raw/*65.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*67.14*/("""{"""),format.raw/*67.15*/("""
			"""),format.raw/*68.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
	"""),format.raw/*71.2*/("""),e
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
"""),format.raw/*73.1*/("""function o(n)"""),format.raw/*73.14*/("""{"""),format.raw/*73.15*/(""" """),format.raw/*73.16*/("""return n.textContent||n.innerText||"" """),format.raw/*73.54*/("""}"""),format.raw/*73.55*/("""
"""),format.raw/*74.1*/("""function i(n)"""),format.raw/*74.14*/("""{"""),format.raw/*74.15*/("""i return n.innerHTML||"" """),format.raw/*74.40*/("""}"""),format.raw/*74.41*/("""
"""),format.raw/*75.1*/("""function u(n,t)"""),format.raw/*75.16*/("""{"""),format.raw/*75.17*/(""" """),format.raw/*75.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*75.48*/("""}"""),format.raw/*75.49*/("""
"""),format.raw/*76.1*/("""function a(n,t)"""),format.raw/*76.16*/("""{"""),format.raw/*76.17*/(""" """),format.raw/*76.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*76.48*/("""}"""),format.raw/*76.49*/("""
"""),format.raw/*77.1*/("""function c(n)"""),format.raw/*77.14*/("""{"""),format.raw/*77.15*/(""" """),format.raw/*77.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*77.66*/("""}"""),format.raw/*77.67*/("""
"""),format.raw/*78.1*/("""function f(n,t)"""),format.raw/*78.16*/("""{"""),format.raw/*78.17*/(""" """),format.raw/*78.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*78.44*/("""}"""),format.raw/*78.45*/("""
"""),format.raw/*79.1*/("""function s(n,t)"""),format.raw/*79.16*/("""{"""),format.raw/*79.17*/(""" """),format.raw/*79.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*79.47*/("""}"""),format.raw/*79.48*/("""
"""),format.raw/*80.1*/("""function d(n,t)"""),format.raw/*80.16*/("""{"""),format.raw/*80.17*/(""" 
	"""),format.raw/*81.2*/("""if(f(n,t))"""),format.raw/*81.12*/("""{"""),format.raw/*81.13*/(""" """),format.raw/*81.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*81.79*/("""}"""),format.raw/*81.80*/("""
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""
"""),format.raw/*83.1*/("""function v(n)"""),format.raw/*83.14*/("""{"""),format.raw/*83.15*/(""" """),format.raw/*83.16*/("""d(n,L),d(n,E) """),format.raw/*83.30*/("""}"""),format.raw/*83.31*/("""
"""),format.raw/*84.1*/("""function l(n,t,e)"""),format.raw/*84.18*/("""{"""),format.raw/*84.19*/(""" """),format.raw/*84.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*84.75*/("""}"""),format.raw/*84.76*/("""
"""),format.raw/*85.1*/("""function g(n)"""),format.raw/*85.14*/("""{"""),format.raw/*85.15*/("""return function(t,r)"""),format.raw/*85.35*/("""{"""),format.raw/*85.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*85.105*/("""}"""),format.raw/*85.106*/("""}"""),format.raw/*85.107*/("""function h(n)"""),format.raw/*85.120*/("""{"""),format.raw/*85.121*/("""return function(t,r)"""),format.raw/*85.141*/("""{"""),format.raw/*85.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*85.199*/("""}"""),format.raw/*85.200*/("""}"""),format.raw/*85.201*/("""function m(n,t,r)"""),format.raw/*85.218*/("""{"""),format.raw/*85.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*85.253*/("""{"""),format.raw/*85.254*/("""return"""),format.raw/*85.260*/("""{"""),format.raw/*85.261*/("""str:n,index:t"""),format.raw/*85.274*/("""}"""),format.raw/*85.275*/("""}"""),format.raw/*85.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*85.360*/("""{"""),format.raw/*85.361*/("""return n.index"""),format.raw/*85.375*/("""}"""),format.raw/*85.376*/(""")"""),format.raw/*85.377*/("""}"""),format.raw/*85.378*/("""function p(n,t,r,o)"""),format.raw/*85.397*/("""{"""),format.raw/*85.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*85.442*/("""{"""),format.raw/*85.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*85.488*/("""{"""),format.raw/*85.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*85.508*/("""}"""),format.raw/*85.509*/(""")"""),format.raw/*85.510*/("""}"""),format.raw/*85.511*/("""l(n,o,i)"""),format.raw/*85.519*/("""}"""),format.raw/*85.520*/("""function x(n,t)"""),format.raw/*85.535*/("""{"""),format.raw/*85.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*85.574*/("""{"""),format.raw/*85.575*/("""t.addEventListener("click",function()"""),format.raw/*85.612*/("""{"""),format.raw/*85.613*/("""p(n,r,e,t)"""),format.raw/*85.623*/("""}"""),format.raw/*85.624*/("""),s(t,"tg-sort-header")"""),format.raw/*85.647*/("""}"""),format.raw/*85.648*/(""")"""),format.raw/*85.649*/("""}"""),format.raw/*85.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*85.714*/("""{"""),format.raw/*85.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*85.839*/("""{"""),format.raw/*85.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*85.887*/("""}"""),format.raw/*85.888*/("""x(e,i)"""),format.raw/*85.894*/("""}"""),format.raw/*85.895*/("""}"""),format.raw/*85.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*86.58*/("""{"""),format.raw/*86.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*86.82*/("""}"""),format.raw/*86.83*/(""");
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
                  DATE: Thu Jan 05 14:48:18 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/segments.scala.html
                  HASH: 24cb5cffb7c3c8bc180049f3c903c68ce911f29f
                  MATRIX: 804->1|1045->146|1075->150|1131->180|1158->181|1261->257|1289->258|1317->260|1349->266|1376->267|1590->453|1619->454|1647->456|1679->462|1706->463|1939->668|1968->669|1996->671|2035->683|2063->684|2126->720|2154->721|2182->723|2221->735|2249->736|2311->771|2339->772|2367->774|2406->786|2434->787|2514->840|2542->841|2571->843|2611->855|2640->856|2711->899|2740->900|2769->902|2809->914|2838->915|2927->976|2956->977|2985->979|3025->991|3054->992|3100->1010|3129->1011|3158->1013|3220->1047|3249->1048|3278->1049|3330->1073|3359->1074|3421->1108|3450->1109|3479->1110|3532->1134|3562->1135|3609->1153|3639->1154|3669->1155|3714->1171|3744->1172|3803->1202|3833->1203|3864->1205|4038->1350|4068->1351|4133->1387|4163->1388|4194->1390|4244->1411|4274->1412|4391->1500|4421->1501|4452->1503|4516->1538|4546->1539|4603->1567|4633->1568|4664->1570|4739->1616|4769->1617|4798->1619|4936->1730|4965->1738|4994->1739|5024->1742|5053->1750|5173->1843|5203->1852|5241->1863|5275->1876|5312->1886|5345->1898|5380->1906|5395->1912|5427->1922|5703->2171|5718->2177|5751->2189|6141->2553|6198->2594|6238->2596|6272->2603|6316->2620|6337->2632|6377->2634|6412->2651|6425->2656|6464->2657|6511->2673|6540->2675|6556->2682|6588->2693|6633->2711|6654->2723|6694->2725|6729->2742|6742->2747|6781->2748|6828->2764|6857->2766|6873->2773|6909->2788|6954->2806|6975->2818|7015->2820|7050->2837|7063->2842|7102->2843|7149->2859|7178->2861|7194->2868|7225->2878|7270->2896|7291->2908|7331->2910|7366->2927|7379->2932|7418->2933|7465->2949|7494->2951|7510->2958|7543->2970|7589->2989|7610->3001|7650->3003|7685->3020|7698->3025|7737->3026|7784->3042|7813->3044|7829->3051|7861->3062|7907->3081|7928->3093|7968->3095|8003->3112|8016->3117|8055->3118|8102->3134|8131->3136|8147->3143|8183->3158|8234->3179|8263->3181|8399->3289|8428->3290|8486->3320|8515->3321|8545->3324|8620->3371|8649->3372|8680->3376|8748->3416|8777->3417|8809->3422|8878->3464|8906->3465|8934->3466|9038->3543|9066->3544|9096->3547|9133->3557|9161->3558|9190->3560|9233->3575|9262->3576|9292->3579|9376->3635|9405->3636|9437->3641|9519->3696|9547->3697|9577->3700|9609->3705|9637->3706|9666->3708|9707->3721|9736->3722|9765->3723|9831->3761|9860->3762|9889->3764|9930->3777|9959->3778|10012->3803|10041->3804|10070->3806|10113->3821|10142->3822|10171->3823|10229->3853|10258->3854|10287->3856|10330->3871|10359->3872|10388->3873|10446->3903|10475->3904|10504->3906|10545->3919|10574->3920|10603->3921|10681->3971|10710->3972|10739->3974|10782->3989|10811->3990|10840->3991|10894->4017|10923->4018|10952->4020|10995->4035|11024->4036|11053->4037|11110->4066|11139->4067|11168->4069|11211->4084|11240->4085|11271->4089|11309->4099|11338->4100|11367->4101|11460->4166|11489->4167|11518->4169|11546->4170|11575->4172|11616->4185|11645->4186|11674->4187|11716->4201|11745->4202|11774->4204|11819->4221|11848->4222|11877->4223|11960->4278|11989->4279|12018->4281|12059->4294|12088->4295|12136->4315|12165->4316|12263->4385|12293->4386|12323->4387|12365->4400|12395->4401|12444->4421|12474->4422|12560->4479|12590->4480|12620->4481|12666->4498|12696->4499|12759->4533|12789->4534|12824->4540|12854->4541|12896->4554|12926->4555|12956->4556|13069->4640|13099->4641|13142->4655|13172->4656|13202->4657|13232->4658|13280->4677|13310->4678|13383->4722|13413->4723|13487->4768|13517->4769|13565->4788|13595->4789|13625->4790|13655->4791|13692->4799|13722->4800|13766->4815|13796->4816|13863->4854|13893->4855|13959->4892|13989->4893|14028->4903|14058->4904|14110->4927|14140->4928|14170->4929|14200->4930|14293->4994|14323->4995|14476->5119|14506->5120|14582->5167|14612->5168|14647->5174|14677->5175|14707->5176|14805->5246|14834->5247|14885->5270|14914->5271
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|49->18|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|57->26|57->26|57->26|72->41|72->41|72->41|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|81->50|82->51|84->53|84->53|85->54|85->54|86->55|86->55|86->55|87->56|88->57|88->57|89->58|90->59|90->59|90->59|92->61|92->61|93->62|94->63|94->63|95->64|95->64|95->64|96->65|98->67|98->67|99->68|101->70|101->70|102->71|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86
                  -- GENERATED --
              */
          