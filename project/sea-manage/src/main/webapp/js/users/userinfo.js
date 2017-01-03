//定义一个js对象，以下所有属性和方法全部都设定成userinfo对象属性和方法
var UserInfo = {};
//服务器地址的根路径
UserInfo.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
UserInfo.initPage = function()
{
	//验证:手机号码是否唯一
	$("#phone").bind("blur",function(){
		UserInfo.ajaxCheckMobliePhone();
	});
	//完善用户信息
	$("#submitbtn").bind("click",function(){
		UserInfo.updateUserInfoSubmit();
	});
};

//验证：手机号码是否唯一
UserInfo.ajaxCheckMobliePhone=function(){
	debugger;
	//校验的数据
	var phone = $("#phone").val();
	var flag = true;
	//执行ajax
	$.ajax({
		type : "POST",
		url : UserInfo.contextPath + "/users/ajaxCheckMobliePhone.do",
		datatype : "json",
		async: false,
		data : {"phone" : phone},
		success : function(res){
			if(res.success){
				$("#PhoneError").html(res.tipMsg);
			}else{
				$("#PhoneError").html(res.tipMsg);
				flag =  false;
			}
		},
		error : function(){
//			$("#PhoneError").html(res.tipMsg);
		}
	});
	return flag;
	};


UserInfo.EditCondition = function(){
	var tipMsg = "";
	//姓名不能为空
	var username=$("#username").val();
	if(!username|| !WebUtils.trim(username)){
		tipMsg = "用户名不能为空";
	}
	//所属机构不能为空
	var organizationId=$("#organizationId").val();
	if(!organizationId|| !WebUtils.trim(organizationId)){
		tipMsg = "所属机构不能为空";
	}
	//办公电话不能为空
	var telno=$("#telno").val();
	if(!telno||!WebUtils.trim(telno)){
		tipMsg="固定电话不能为空";
	}else{
		var regTelNo=/^0\d{2,3}-\d{7,8}$/;
		if(!regTelNo.test(telno)){
			tipMsg="固定电话验证不合法";
		}	
	}	
	//手机号不能为空
	var phone=$("#phone").val();
		//验证手机号码是否合法
		var regPhone = /^0?1[3|4|5|8][0-9]\d{8}$/;
		if(!regPhone.test(phone)){
			tipMsg="手机号码不合法";
		}
	//电子邮箱不能为空
	var email=$("#email").val();
	if(!email|| !WebUtils.trim(email)){
		tipMsg="邮箱不能为空";
	}else{
		var regEmail =/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if(!regEmail.test(email)){
			tipMsg="邮箱验证不合法";
		}
	}	
	
	var jsRes = WebUtils.JsResponseFactory();
	if(tipMsg){
		jsRes.success = false;
		jsRes.tipMsg = tipMsg;
	}else{
		//数据
		jsRes.success = true;
		jsRes.tipMsg = null;
			var userid=$("#userid").val();
			//修改：
			jsRes.data = {
					"username" : username,
					"organizationId" : organizationId,
					"telno" : telno,			
					"phone" : phone,
					"email" : email,
					"userid" : userid
			};
		}
	//返回数据
	return jsRes;
};

//完善用户数据信息
UserInfo.updateUserInfoSubmit=function(){
	//接收用户数据信息
	var jsRes = UserInfo.EditCondition();
	if(!jsRes.success){
		WebUtils.alert(jsRes.tipMsg);
		return false;
	}
	if(!UserInfo.ajaxCheckMobliePhone()){
		return false;
	}
	$.ajax({
		type : "POST",
		url : UserInfo.contextPath + "/users/ajaxEditUsersInfo.do",
		datatype : "json",
		data :jsRes.data,
		success : function(res){
			try{
				if(res.success){
					//修改成功
					alert("个人信息修改成功！");
					//返回个人中心
			      	window.location.href= UserInfo.contextPath +"/personal/toPersonalPage.do"; 
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
	
	
	
	

  
	




