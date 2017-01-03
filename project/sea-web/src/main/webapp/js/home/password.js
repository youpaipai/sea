var Password ={};
//服务器地址的根路径
Password.contextPath = Main.contextPath;

//修改密码提交
Password.updatePasswordSubmit=function(){
	if(Password.checkPassword() && Password.checkEHNewPassword() && Password.checkNewPassword() && Password.checkTNewPassword()){
		$.ajax({
			url:  Password.contextPath + "/password/toUpdatePasswordSub.do",
			datatype:'json',
			type:'POST',
			async:false,
			data: $("#update_form").serialize(),
			success:function(res)
			{
				if (res.success) {
					// 密码修改成功
						alert(res.tipMsg);
					//返回登录页面
			      	window.location.href= Password.contextPath +"/home/login.do"; 
				}
				else
				{
					alert(res.tipMsg);
				}
			},
			error:function(XMLHttpRequest, textStatus, errorThrown)
			{
				alert(errorThrown);
			}
		});
	}
};

//清空错误信息
Password.removeStyle=function(){
	$("#passWordError").html("");
};

//检查旧密码
Password.checkPassword=function(){
	var password = $("#password").val();
	if(password=="" || password==null){
		$("#passWordError").html("请输入旧密码!");
		return false;
	}
	return true;
};

//检查密码输入不能为空
Password.checkNewPassword=function(){
	var newpassword = $("#newpassword").val();
	if(newpassword=="" || newpassword==null){
		$("#passWordError").html("请输入新密码!");
		return false;
	}
	return true;
};

//检查确认新密码
Password.checkEHNewPassword=function (){
	var password = $("#password").val();
	var newpassword = $("#newpassword").val();
	var ENnewpassword = $("#ENnewpassword").val();
	if(newpassword != ENnewpassword){
		$("#passWordError").html("请确认两次输入密码一致!");
		return false;
	}else if(password==newpassword){
		$("#passWordError").html("新输入密码不可与旧密码一致!");
		return false;
	}
	return true;
};

//检查新密码
Password.checkTNewPassword=function(){
	var newpassword = $("#newpassword").val();
	// 规则：8~20位英文字母（区分大小写）、数字、下划线（至少包含2种），字母或数字开头
	var reg=/^[a-zA-Z0-9]*(([a-zA-Z]+[0-9_]+)|([0-9]+[a-zA-Z_]+))[a-zA-Z_0-9]*$/;

	//去除所有空格
	newpassword = newpassword.replace(/\s+/g,"");
	if(!reg.test(newpassword)){
	$("#passWordError").html("请输入8~20位英文字母（区分大小写）、数字、下划线（至少包含2种），字母或数字开头!"); 
		return false;
	}
	return true;
};


