<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=1qw"></script>
    <style>
    	.logpadd .isLogin{ background-color:#B8BDC3;}
    </style>
    <script type="text/javascript">
    	$(function(){
    		Login.initPage();
    	});
    </script>
</head>
<body onkeydown="if(event.keyCode==13)Login.ajaxCheckLogin();">
	<div class="topheader">
		<div><a href="javascript:void(0)"><img src="${base }/images/logo.png"/></a></div>
	</div>
	<div class="middlebg">
		<div class="loginbox">
			<div class="logpadd">
				<form id="form_user" name="form_user" action="${base}/home/index.do" method="post">
					<p>用户登录</p>
					<div id="loginErrorMsg" style=" height: 42px;margin-bottom: -35px; color: red; line-height: 30px;"></div>
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
				<button id="login_btn" style="margin-top: 10px;">登录</button>
			</div>
		</div>
	</div>
	<p class="prompt">*为了您更流畅的体验，请IE7版本以下用户升级到IE9以上版本。</p>
</body>
</html>