//定义一个js对象，以下所有属性和方法全部都设定成Index对象属性和方法
var Index = {};
//服务器地址的根路径
Index.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
Index.initPage = function(){
	//时钟：
	Index.getTime();
};
//时钟
Index.getTime=function(){
	var date = new Date();
	var y = date.getFullYear();
	var m = date.getMonth()+1;
	var d = date.getDate();
	var h = date.getHours();
	var i = date.getMinutes();
	var s = date.getSeconds();
	$("#totay").html("今天是："+y+"年"+(m>9?m:("0"+m))+"月"+(d>9?d:("0"+d))+"日 "+(h>9?h:("0"+h))+":"+(i>9?i:("0"+i))+":"+(s>9?s:("0"+s)));
}