//定义一个js对象，以下所有属性和方法全部都设定成Login对象属性和方法
var Login = {};
//服务器地址的根路径
Login.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
Login.initPage = function(){
	Login.refreshVerifyCode();
	$("#login_btn").bind("click", function(){
		Login.ajaxCheckLogin();
	});
	$("#login_verifyCode_img, login_verifyCode_a").bind("click", function(){
		Login.refreshVerifyCode();
	});
};
Login.refreshVerifyCode = function(){
	$("#login_verifyCode_img").attr("src", Login.contextPath + "/verfycode/loginVerifyCode.do?'+Math.random()");
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
	if($("#login_btn").hasClass("isLogin")){
		return false;
	}
	$("#loginErrorMsg").html("");
	var jsRes = Login.queryCondition();
	if(!jsRes.success){
		//WebUtils.alert(jsRes.tipMsg);
		$("#loginErrorMsg").html(jsRes.tipMsg);
		return false;
	}
	$("#login_btn").addClass("isLogin");
	$.ajax({
		type : "POST",
		url : Login.contextPath + "/home//ajaxCheckLogin.do",
		datatype : "json",
		data : jsRes.data,
		success : function(res){
			try{
				$("#login_btn").removeClass("isLogin");
				if(res.success){
					//WebUtils.alert("登录成功，成功后要进行页面跳转，我这边不做了");
					$("#form_user").submit();
				}else{
					$("#loginErrorMsg").html(res.tipMsg);
					$("#login_verifyCode_img").click();
				}
			}catch(e){
				WebUtils.alert(e);
			}
		},
		error : function(){
			$("#login_btn").removeClass("isLogin");
		}
	});
};