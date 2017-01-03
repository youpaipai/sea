//定义一个js对象，以下所有属性和方法全部都设定成Login对象属性和方法
var Login = {};
//服务器地址的根路径
Login.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
Login.initPage = function(){
	$("#login_btn").bind("click", function(){
		Login.ajaxCheckLogin();
	});
};

//登录校验请求参数
Login.queryCondition = function(){
	var tipMsg = "";
	var rememberPwd = true;
	var loginAcc = $("#login_loginAcc_input").val();
	if(!loginAcc || !WebUtils.trim(loginAcc)){
		tipMsg = "用户名不能为空";
	}
	
	var password = $("#login_password_input").val();
	if(!tipMsg && !password ){
		tipMsg = "密码不能为空";
	}
	
	var loginCode = $("#login_loginCode_input").val();
	if(!tipMsg && (!loginCode || !WebUtils.trim(loginCode)) ){
		tipMsg = "验证码不能为空";
	}
	
	var rememberPass = $("#rememberPass").get(0);
	if(!rememberPass.checked){
		rememberPwd = false;
	}
	
	var jsRes = WebUtils.JsResponseFactory();
	if(tipMsg){
		jsRes.success = false;
		jsRes.tipMsg = tipMsg;
	}else{
		jsRes.success = true;
		jsRes.tipMsg = null;
		jsRes.data = {
				loginAcc : loginAcc,
				password : password,
				loginCode : loginCode,
				rememberPwd : rememberPwd
		};
	}
	
	return jsRes;
};

//登录click事件ajax请求
Login.ajaxCheckLogin = function(){
	var jsRes = Login.queryCondition();
	if(!jsRes.success){
		WebUtils.alert(jsRes.tipMsg);
		return false;
	}
	$.ajax({
		type : "POST",
		url : Login.contextPath + "/home//ajaxCheckLogin.do",
		datatype : "json",
		data : jsRes.data,
		success : function(res){
			try{
				if(res.success){
					WebUtils.alert("登录成功，成功后要进行页面跳转，我这边不做了");
				}else{
					WebUtils.alert(res.tipMsg);
				}
			}catch(e){
				WebUtils.alert(e);
			}
		},
		error : function(){
			
		}
	});
};