var WebUtils = {};
WebUtils.contextPath = Main.contextPath;

/**
 * 弹出框
 */
WebUtils.alert = function(tipMsg){
	try{
		alert(tipMsg);
	}catch(e){
		
	}
}
/**
 * 浏览器日志输出
 */
WebUtils.log = function(tipMsg){
	try{
		console.log(tipMsg);
	}catch(e){
	}
}
/**
 * 生产校验参数结果对象
 */
WebUtils.JsResponseFactory = function(){
	var Response =  {
			success : true,
			tipMsg : "",
			data : {}
		};
	return Response;
};
/**
 * 去字符串两端空格
 */
WebUtils.trim = function(str){
	if(typeof(str) !== "string"){
		return str;
	}
	if(str){
		str = $.trim(str);
	}
	return str;
};
