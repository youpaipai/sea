<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=qwe"></script>
    <script type="text/javascript">
    	$(function(){
    		Login.initPage();
    	});
    </script>
</head>
<body onkeydown="if(event.keyCode==13)Login.ajaxCheckLogin();">
	<div class="topheader">
		<div><a href="javascript:void(0)"><img src="${base }/images/managerlogo.png"/></a></div>
	</div>
	<div class="middlebg">
		<div class="loginbox">
			<div class="logpadd">
				<form id="form_user" name="form_user" action="${base}/home/index.do" method="post">
					<p>用户登录</p>
					<p class="username">
						<img src="${base }/images/tel-1.png"/>
						<input id="login_loginAcc_input" type="text" placeholder="请输入用户名 / 手机号"/>
					</p>
					<p class="username">
						<img src="${base }/images/pik-1.png"/>
						<input id="login_password_input" type="password" placeholder="请输入您的密码"/>
					</p>
					<div class="vrbox">
						<p class="username vrcode" style="width:130px;">
							<img src="${base }/images/num.png"/>
							<input id="login_loginCode_input" type="text" placeholder="验证码"/>
						</p>
						<img id="login_verifyCode_img" class="vrimg" style="width:100px;curson:pointer;" />
					</div>
					<div class="remember">
						<input type="checkbox" name="rememberPwd" id="rememberPass" checked="checked"/>
						<label for="rememberPass">记住密码</label>
						<a href="javascript:void(0)">免费注册</a>
					</div>
				</form>
				<button id="login_btn">登录</button>
				
				<a href="${base }/logManage/toLogManagePage.do">跳转日志管理页面</a><br>
				<a href="${base }/sysMessages/toSysMessagesPage.do">跳转系统消息页面</a><br>
				<a href="${base }/helpManage/toHelpManagePage.do">跳转帮助页面</a><br>
				<a href="${base }/users/toUserManagePage.do">跳转个人信息</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="${base }/dictionary/toDictionaryManagePage.do">跳转数据字典</a><br>
				<a href="${base }/password/toUpdatePasswordPage.do">跳转密码修改</a>&nbsp;&nbsp;&nbsp;<a href="${base }/personal/toPersonalPage.do">跳转个人中心</a>
				
			</div>
		</div>
	</div>
	<p class="prompt">*为了您更流畅的体验，请IE7版本以下用户升级到IE9以上版本。</p>
</body>
</html>