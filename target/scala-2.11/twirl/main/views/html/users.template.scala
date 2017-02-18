
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[DBUser],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, users: List[DBUser]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
         """),format.raw/*8.108*/("""
         """),format.raw/*9.111*/("""
        """),format.raw/*10.108*/("""
    """),format.raw/*11.5*/("""</head>
    <body>
<style type="text/css">
.tg  """),format.raw/*14.6*/("""{"""),format.raw/*14.7*/("""border-collapse:collapse;border-spacing:0;border-color:#999;margin:0px auto;"""),format.raw/*14.83*/("""}"""),format.raw/*14.84*/("""
"""),format.raw/*15.1*/(""".tg td"""),format.raw/*15.7*/("""{"""),format.raw/*15.8*/("""font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#444;background-color:#F7FDFA;"""),format.raw/*15.194*/("""}"""),format.raw/*15.195*/("""
"""),format.raw/*16.1*/(""".tg th"""),format.raw/*16.7*/("""{"""),format.raw/*16.8*/("""font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#999;color:#fff;background-color:#26ADE4;"""),format.raw/*16.213*/("""}"""),format.raw/*16.214*/("""
"""),format.raw/*17.1*/(""".tg .tg-baqh"""),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""text-align:center;vertical-align:top"""),format.raw/*17.50*/("""}"""),format.raw/*17.51*/("""
"""),format.raw/*18.1*/(""".tg .tg-9hbo"""),format.raw/*18.13*/("""{"""),format.raw/*18.14*/("""font-weight:bold;vertical-align:top"""),format.raw/*18.49*/("""}"""),format.raw/*18.50*/("""
"""),format.raw/*19.1*/(""".tg .tg-amwm"""),format.raw/*19.13*/("""{"""),format.raw/*19.14*/("""font-weight:bold;text-align:center;vertical-align:top"""),format.raw/*19.67*/("""}"""),format.raw/*19.68*/("""
"""),format.raw/*20.1*/(""".tg .tg-6k2t"""),format.raw/*20.13*/("""{"""),format.raw/*20.14*/("""background-color:#D2E4FC;vertical-align:top"""),format.raw/*20.57*/("""}"""),format.raw/*20.58*/("""
"""),format.raw/*21.1*/(""".tg .tg-j0tj"""),format.raw/*21.13*/("""{"""),format.raw/*21.14*/("""background-color:#D2E4FC;text-align:center;vertical-align:top"""),format.raw/*21.75*/("""}"""),format.raw/*21.76*/("""
"""),format.raw/*22.1*/(""".tg .tg-yw4l"""),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""vertical-align:top"""),format.raw/*22.32*/("""}"""),format.raw/*22.33*/("""
"""),format.raw/*23.1*/("""th.tg-sort-header::-moz-selection """),format.raw/*23.35*/("""{"""),format.raw/*23.36*/(""" """),format.raw/*23.37*/("""background:transparent; """),format.raw/*23.61*/("""}"""),format.raw/*23.62*/("""th.tg-sort-header::selection      """),format.raw/*23.96*/("""{"""),format.raw/*23.97*/(""" """),format.raw/*23.98*/("""background:transparent; """),format.raw/*23.122*/("""}"""),format.raw/*23.123*/("""th.tg-sort-header """),format.raw/*23.141*/("""{"""),format.raw/*23.142*/(""" """),format.raw/*23.143*/("""cursor:pointer; """),format.raw/*23.159*/("""}"""),format.raw/*23.160*/("""table th.tg-sort-header:after """),format.raw/*23.190*/("""{"""),format.raw/*23.191*/("""  """),format.raw/*23.193*/("""content:'';  float:right;  margin-top:7px;  border-width:0 4px 4px;  border-style:solid;  border-color:#404040 transparent;  visibility:hidden;  """),format.raw/*23.338*/("""}"""),format.raw/*23.339*/("""table th.tg-sort-header:hover:after """),format.raw/*23.375*/("""{"""),format.raw/*23.376*/("""  """),format.raw/*23.378*/("""visibility:visible;  """),format.raw/*23.399*/("""}"""),format.raw/*23.400*/("""table th.tg-sort-desc:after,table th.tg-sort-asc:after,table th.tg-sort-asc:hover:after """),format.raw/*23.488*/("""{"""),format.raw/*23.489*/("""  """),format.raw/*23.491*/("""visibility:visible;  opacity:0.4;  """),format.raw/*23.526*/("""}"""),format.raw/*23.527*/("""table th.tg-sort-desc:after """),format.raw/*23.555*/("""{"""),format.raw/*23.556*/("""  """),format.raw/*23.558*/("""border-bottom:none;  border-width:4px 4px 0;  """),format.raw/*23.604*/("""}"""),format.raw/*23.605*/("""
"""),format.raw/*24.1*/("""</style>

    <form action='addNewUser' method='POST' enctype="multipart/form-data" id="addNewUserForm">
    <table class="tg">
    <tr><td>
    User: <input type="text" name="newUserName"><button type="submit" form="addNewUserForm" value="0" name="userId" >Add New User</button>
    </td></tr>
    </table>
    </form>
    
    <table id="tg-cFHod" class="tg">
    <tr>
    	<th class="tg-amwm">Id</th>
    	<th class="tg-9hbo">User</th>
    	<th class="tg-amwm">Samples</th>
    	<th class="tg-amwm">Last Sample</th>
    	<th class="tg-amwm">Action</th>
    </tr>
    """),format.raw/*42.75*/("""
    """),format.raw/*43.130*/("""
    """),format.raw/*44.82*/("""
	"""),_display_(/*45.3*/for((user,i) <- users.zipWithIndex) yield /*45.38*/ {_display_(Seq[Any](format.raw/*45.40*/("""
    	"""),format.raw/*46.6*/("""<tr>
    		<td """),_display_(/*47.12*/if(i % 2==0)/*47.24*/ {_display_(Seq[Any](format.raw/*47.26*/("""class="tg-j0tj"""")))}/*47.43*/else/*47.48*/{_display_(Seq[Any](format.raw/*47.49*/("""class="tg-baqh"""")))}),format.raw/*47.65*/(""">"""),_display_(/*47.67*/user/*47.71*/.getUserId()),format.raw/*47.83*/("""</td>
    		<td """),_display_(/*48.12*/if(i % 2==0)/*48.24*/ {_display_(Seq[Any](format.raw/*48.26*/("""class="tg-6k2t"""")))}/*48.43*/else/*48.48*/{_display_(Seq[Any](format.raw/*48.49*/("""class="tg-yw4l"""")))}),format.raw/*48.65*/(""">"""),_display_(/*48.67*/user/*48.71*/.getName()),format.raw/*48.81*/("""</td>
    		<td """),_display_(/*49.12*/if(i % 2==0)/*49.24*/ {_display_(Seq[Any](format.raw/*49.26*/("""class="tg-j0tj"""")))}/*49.43*/else/*49.48*/{_display_(Seq[Any](format.raw/*49.49*/("""class="tg-baqh"""")))}),format.raw/*49.65*/(""">0</td>
    		<td """),_display_(/*50.12*/if(i % 2==0)/*50.24*/ {_display_(Seq[Any](format.raw/*50.26*/("""class="tg-j0tj"""")))}/*50.43*/else/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""class="tg-baqh"""")))}),format.raw/*50.65*/(""">-</td>
    		<td """),_display_(/*51.12*/if(i % 2==0)/*51.24*/ {_display_(Seq[Any](format.raw/*51.26*/("""class="tg-j0tj"""")))}/*51.43*/else/*51.48*/{_display_(Seq[Any](format.raw/*51.49*/("""class="tg-baqh"""")))}),format.raw/*51.65*/(""">
    		<form action='loginUser' method='POST' enctype="multipart/form-data" id="loginUserForm"><button type="submit" form="loginUserForm" value=""""),_display_(/*52.146*/user/*52.150*/.getUserId()),format.raw/*52.162*/(""""  name="userId" >Login</button>
    		</form>
    		&nbsp
    		<form action='requestDeleteUser' method='POST' enctype="multipart/form-data" id="deleteUserForm">
    		<button type="submit" form="deleteUserForm" value=""""),_display_(/*56.59*/user/*56.63*/.getUserId()),format.raw/*56.75*/(""""  name="userId" >Delete</button>
    		</form>
    		</td>
    	</tr>
	""")))}),format.raw/*60.3*/("""
    """),format.raw/*61.5*/("""</table>
   
"""),format.raw/*76.4*/("""
 	"""),format.raw/*77.3*/("""<form action='user' method='POST' enctype="multipart/form-data" id="UserLoginForm">
    </form>
    

<script type="text/javascript" charset="utf-8">
var TgTableSort=window.TgTableSort||function(n,t)"""),format.raw/*82.50*/("""{"""),format.raw/*82.51*/(""""use strict";
function r(n,t)"""),format.raw/*83.16*/("""{"""),format.raw/*83.17*/("""
	"""),format.raw/*84.2*/("""for(var e=[],o=n.childNodes,i=0;i<o.length;++i)"""),format.raw/*84.49*/("""{"""),format.raw/*84.50*/("""
		"""),format.raw/*85.3*/("""var u=o[i];
		if("."==t.substring(0,1))"""),format.raw/*86.28*/("""{"""),format.raw/*86.29*/("""
			"""),format.raw/*87.4*/("""var a=t.substring(1);f(u,a)&&e.push(u)
		"""),format.raw/*88.3*/("""}"""),format.raw/*88.4*/(""" """),format.raw/*88.5*/("""else u.nodeName.toLowerCase()==t&&e.push(u);
		var c=r(u,t);e=e.concat(c)
	"""),format.raw/*90.2*/("""}"""),format.raw/*90.3*/("""
	"""),format.raw/*91.2*/("""return e
"""),format.raw/*92.1*/("""}"""),format.raw/*92.2*/("""
"""),format.raw/*93.1*/("""function e(n,t)"""),format.raw/*93.16*/("""{"""),format.raw/*93.17*/("""
	"""),format.raw/*94.2*/("""var e=[],o=r(n,"tr");
	return o.forEach(
		function(n)"""),format.raw/*96.14*/("""{"""),format.raw/*96.15*/("""
			"""),format.raw/*97.4*/("""var o=r(n,"td");
			t>=0&&t<o.length&&e.push(o[t])
		"""),format.raw/*99.3*/("""}"""),format.raw/*99.4*/("""
	"""),format.raw/*100.2*/("""),e
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""
"""),format.raw/*102.1*/("""function o(n)"""),format.raw/*102.14*/("""{"""),format.raw/*102.15*/(""" """),format.raw/*102.16*/("""return n.textContent||n.innerText||"" """),format.raw/*102.54*/("""}"""),format.raw/*102.55*/("""
"""),format.raw/*103.1*/("""function i(n)"""),format.raw/*103.14*/("""{"""),format.raw/*103.15*/("""i return n.innerHTML||"" """),format.raw/*103.40*/("""}"""),format.raw/*103.41*/("""
"""),format.raw/*104.1*/("""function u(n,t)"""),format.raw/*104.16*/("""{"""),format.raw/*104.17*/(""" """),format.raw/*104.18*/("""var r=e(n,t); return r.map(o) """),format.raw/*104.48*/("""}"""),format.raw/*104.49*/("""
"""),format.raw/*105.1*/("""function a(n,t)"""),format.raw/*105.16*/("""{"""),format.raw/*105.17*/(""" """),format.raw/*105.18*/("""var r=e(n,t); return r.map(i) """),format.raw/*105.48*/("""}"""),format.raw/*105.49*/("""
"""),format.raw/*106.1*/("""function c(n)"""),format.raw/*106.14*/("""{"""),format.raw/*106.15*/(""" """),format.raw/*106.16*/("""var t=n.className||""; return t.match(/\S+/g)||[] """),format.raw/*106.66*/("""}"""),format.raw/*106.67*/("""
"""),format.raw/*107.1*/("""function f(n,t)"""),format.raw/*107.16*/("""{"""),format.raw/*107.17*/(""" """),format.raw/*107.18*/("""return-1!=c(n).indexOf(t) """),format.raw/*107.44*/("""}"""),format.raw/*107.45*/("""
"""),format.raw/*108.1*/("""function s(n,t)"""),format.raw/*108.16*/("""{"""),format.raw/*108.17*/(""" """),format.raw/*108.18*/("""f(n,t)||(n.className+=" "+t) """),format.raw/*108.47*/("""}"""),format.raw/*108.48*/("""
"""),format.raw/*109.1*/("""function d(n,t)"""),format.raw/*109.16*/("""{"""),format.raw/*109.17*/(""" 
	"""),format.raw/*110.2*/("""if(f(n,t))"""),format.raw/*110.12*/("""{"""),format.raw/*110.13*/(""" """),format.raw/*110.14*/("""var r=c(n),e=r.indexOf(t); r.splice(e,1),n.className=r.join(" ") """),format.raw/*110.79*/("""}"""),format.raw/*110.80*/("""
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/("""
"""),format.raw/*112.1*/("""function v(n)"""),format.raw/*112.14*/("""{"""),format.raw/*112.15*/(""" """),format.raw/*112.16*/("""d(n,L),d(n,E) """),format.raw/*112.30*/("""}"""),format.raw/*112.31*/("""
"""),format.raw/*113.1*/("""function l(n,t,e)"""),format.raw/*113.18*/("""{"""),format.raw/*113.19*/(""" """),format.raw/*113.20*/("""r(n,"."+E).map(v),r(n,"."+L).map(v),e==T?s(t,E):s(t,L) """),format.raw/*113.75*/("""}"""),format.raw/*113.76*/("""
"""),format.raw/*114.1*/("""function g(n)"""),format.raw/*114.14*/("""{"""),format.raw/*114.15*/("""return function(t,r)"""),format.raw/*114.35*/("""{"""),format.raw/*114.36*/("""var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e"""),format.raw/*114.105*/("""}"""),format.raw/*114.106*/("""}"""),format.raw/*114.107*/("""function h(n)"""),format.raw/*114.120*/("""{"""),format.raw/*114.121*/("""return function(t,r)"""),format.raw/*114.141*/("""{"""),format.raw/*114.142*/("""var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)"""),format.raw/*114.199*/("""}"""),format.raw/*114.200*/("""}"""),format.raw/*114.201*/("""function m(n,t,r)"""),format.raw/*114.218*/("""{"""),format.raw/*114.219*/("""var e=u(n,t),o=e.map(function(n,t)"""),format.raw/*114.253*/("""{"""),format.raw/*114.254*/("""return"""),format.raw/*114.260*/("""{"""),format.raw/*114.261*/("""str:n,index:t"""),format.raw/*114.274*/("""}"""),format.raw/*114.275*/("""}"""),format.raw/*114.276*/("""),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n)"""),format.raw/*114.360*/("""{"""),format.raw/*114.361*/("""return n.index"""),format.raw/*114.375*/("""}"""),format.raw/*114.376*/(""")"""),format.raw/*114.377*/("""}"""),format.raw/*114.378*/("""function p(n,t,r,o)"""),format.raw/*114.397*/("""{"""),format.raw/*114.398*/("""for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c)"""),format.raw/*114.442*/("""{"""),format.raw/*114.443*/("""var s=e(n,c),d=a(n,c);s.forEach(function(n,t)"""),format.raw/*114.488*/("""{"""),format.raw/*114.489*/("""n.innerHTML=d[u[t]]"""),format.raw/*114.508*/("""}"""),format.raw/*114.509*/(""")"""),format.raw/*114.510*/("""}"""),format.raw/*114.511*/("""l(n,o,i)"""),format.raw/*114.519*/("""}"""),format.raw/*114.520*/("""function x(n,t)"""),format.raw/*114.535*/("""{"""),format.raw/*114.536*/("""var r=t.length;t.forEach(function(t,e)"""),format.raw/*114.574*/("""{"""),format.raw/*114.575*/("""t.addEventListener("click",function()"""),format.raw/*114.612*/("""{"""),format.raw/*114.613*/("""p(n,r,e,t)"""),format.raw/*114.623*/("""}"""),format.raw/*114.624*/("""),s(t,"tg-sort-header")"""),format.raw/*114.647*/("""}"""),format.raw/*114.648*/(""")"""),format.raw/*114.649*/("""}"""),format.raw/*114.650*/("""var T=1,N=-1,E="tg-sort-asc",L="tg-sort-desc";return function(t)"""),format.raw/*114.714*/("""{"""),format.raw/*114.715*/("""var e=n.getElementById(t),o=r(e,"tr"),i=o.length>0?r(o[0],"td"):[];0==i.length&&(i=r(o[0],"th"));for(var u=1;u<o.length;++u)"""),format.raw/*114.839*/("""{"""),format.raw/*114.840*/("""var a=r(o[u],"td");if(a.length!=i.length)return"""),format.raw/*114.887*/("""}"""),format.raw/*114.888*/("""x(e,i)"""),format.raw/*114.894*/("""}"""),format.raw/*114.895*/("""}"""),format.raw/*114.896*/("""(document);
	document.addEventListener("DOMContentLoaded",function(n)"""),format.raw/*115.58*/("""{"""),format.raw/*115.59*/("""TgTableSort("tg-cFHod")"""),format.raw/*115.82*/("""}"""),format.raw/*115.83*/(""");
</script>    
    
   


    """),format.raw/*121.94*/("""
    
        """),format.raw/*126.12*/("""
    """),format.raw/*127.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,users:List[DBUser]): play.twirl.api.HtmlFormat.Appendable = apply(title,users)

  def f:((String,List[DBUser]) => play.twirl.api.HtmlFormat.Appendable) = (title,users) => apply(title,users)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Fri Feb 17 23:23:48 EST 2017
                  SOURCE: C:/Users/Andrew/play-java-1/app/views/users.scala.html
                  HASH: d090a33e5860db51999cec28b162103a623b867e
                  MATRIX: 758->1|889->37|919->41|1001->149|1037->159|1071->167|1096->172|1143->289|1182->401|1221->510|1254->516|1332->567|1360->568|1464->644|1493->645|1522->647|1555->653|1583->654|1798->840|1828->841|1857->843|1890->849|1918->850|2152->1055|2182->1056|2211->1058|2251->1070|2280->1071|2344->1107|2373->1108|2402->1110|2442->1122|2471->1123|2534->1158|2563->1159|2592->1161|2632->1173|2661->1174|2742->1227|2771->1228|2800->1230|2840->1242|2869->1243|2940->1286|2969->1287|2998->1289|3038->1301|3067->1302|3156->1363|3185->1364|3214->1366|3254->1378|3283->1379|3329->1397|3358->1398|3387->1400|3449->1434|3478->1435|3507->1436|3559->1460|3588->1461|3650->1495|3679->1496|3708->1497|3761->1521|3791->1522|3838->1540|3868->1541|3898->1542|3943->1558|3973->1559|4032->1589|4062->1590|4093->1592|4267->1737|4297->1738|4362->1774|4392->1775|4423->1777|4473->1798|4503->1799|4620->1887|4650->1888|4681->1890|4745->1925|4775->1926|4832->1954|4862->1955|4893->1957|4968->2003|4998->2004|5027->2006|5643->2664|5678->2795|5712->2878|5742->2882|5793->2917|5833->2919|5867->2926|5911->2943|5932->2955|5972->2957|6007->2974|6020->2979|6059->2980|6106->2996|6135->2998|6148->3002|6181->3014|6226->3032|6247->3044|6287->3046|6322->3063|6335->3068|6374->3069|6421->3085|6450->3087|6463->3091|6494->3101|6539->3119|6560->3131|6600->3133|6635->3150|6648->3155|6687->3156|6734->3172|6781->3192|6802->3204|6842->3206|6877->3223|6890->3228|6929->3229|6976->3245|7023->3265|7044->3277|7084->3279|7119->3296|7132->3301|7171->3302|7218->3318|7394->3466|7408->3470|7442->3482|7694->3707|7707->3711|7740->3723|7847->3800|7880->3806|7922->4387|7953->4391|8185->4595|8214->4596|8272->4626|8301->4627|8331->4630|8406->4677|8435->4678|8466->4682|8534->4722|8563->4723|8595->4728|8664->4770|8692->4771|8720->4772|8824->4849|8852->4850|8882->4853|8919->4863|8947->4864|8976->4866|9019->4881|9048->4882|9078->4885|9162->4941|9191->4942|9223->4947|9305->5002|9333->5003|9364->5006|9397->5011|9426->5012|9456->5014|9498->5027|9528->5028|9558->5029|9625->5067|9655->5068|9685->5070|9727->5083|9757->5084|9811->5109|9841->5110|9871->5112|9915->5127|9945->5128|9975->5129|10034->5159|10064->5160|10094->5162|10138->5177|10168->5178|10198->5179|10257->5209|10287->5210|10317->5212|10359->5225|10389->5226|10419->5227|10498->5277|10528->5278|10558->5280|10602->5295|10632->5296|10662->5297|10717->5323|10747->5324|10777->5326|10821->5341|10851->5342|10881->5343|10939->5372|10969->5373|10999->5375|11043->5390|11073->5391|11105->5395|11144->5405|11174->5406|11204->5407|11298->5472|11328->5473|11358->5475|11387->5476|11417->5478|11459->5491|11489->5492|11519->5493|11562->5507|11592->5508|11622->5510|11668->5527|11698->5528|11728->5529|11812->5584|11842->5585|11872->5587|11914->5600|11944->5601|11993->5621|12023->5622|12122->5691|12153->5692|12184->5693|12227->5706|12258->5707|12308->5727|12339->5728|12426->5785|12457->5786|12488->5787|12535->5804|12566->5805|12630->5839|12661->5840|12697->5846|12728->5847|12771->5860|12802->5861|12833->5862|12947->5946|12978->5947|13022->5961|13053->5962|13084->5963|13115->5964|13164->5983|13195->5984|13269->6028|13300->6029|13375->6074|13406->6075|13455->6094|13486->6095|13517->6096|13548->6097|13586->6105|13617->6106|13662->6121|13693->6122|13761->6160|13792->6161|13859->6198|13890->6199|13930->6209|13961->6210|14014->6233|14045->6234|14076->6235|14107->6236|14201->6300|14232->6301|14386->6425|14417->6426|14494->6473|14525->6474|14561->6480|14592->6481|14623->6482|14722->6552|14752->6553|14804->6576|14834->6577|14901->6704|14946->6844|14980->6850
                  LINES: 27->1|32->1|34->3|37->6|38->7|38->7|38->7|39->8|40->9|41->10|42->11|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|73->42|74->43|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|87->56|87->56|87->56|91->60|92->61|94->76|95->77|100->82|100->82|101->83|101->83|102->84|102->84|102->84|103->85|104->86|104->86|105->87|106->88|106->88|106->88|108->90|108->90|109->91|110->92|110->92|111->93|111->93|111->93|112->94|114->96|114->96|115->97|117->99|117->99|118->100|119->101|119->101|120->102|120->102|120->102|120->102|120->102|120->102|121->103|121->103|121->103|121->103|121->103|122->104|122->104|122->104|122->104|122->104|122->104|123->105|123->105|123->105|123->105|123->105|123->105|124->106|124->106|124->106|124->106|124->106|124->106|125->107|125->107|125->107|125->107|125->107|125->107|126->108|126->108|126->108|126->108|126->108|126->108|127->109|127->109|127->109|128->110|128->110|128->110|128->110|128->110|128->110|129->111|129->111|130->112|130->112|130->112|130->112|130->112|130->112|131->113|131->113|131->113|131->113|131->113|131->113|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|132->114|133->115|133->115|133->115|133->115|139->121|141->126|142->127
                  -- GENERATED --
              */
          