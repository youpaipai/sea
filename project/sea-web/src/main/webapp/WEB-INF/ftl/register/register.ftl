<!doctype html>
<html lang="en">
<head>
	<title>用户注册</title>
	<#include "../common/head.ftl" />
	<script type="text/javascript" src="${base }/js/register/register.js?v=111"></script>
	<script type="text/javascript">
		$(function(){
			Register.initPage();
		});
	</script>
</head>
<body style="background-color: #F4F4F4">
	<div class="buss-topheader buss-line">
		<div><a href="javascript:void(0)"><img src="${base }/images/logo.png"/></a>
			<p>我已经注册，马上 <a href="javascript:void(0);">登录</a></p>
		</div>
	</div>
	<div class="buss-regbox" >
		<p class="buss-regtitle"><span>用户注册</span><a href="javascript:void(0)"><img src="${base }/images/re-1.png" alt="" /> 返回首页</a></p>
		<div class="buss-reginput">
			<p style="width:150%;">
				<span>*</span>登录名：<input type="text" name="staffCode" id="staffCode_input" value="" maxlength="20" placeholder="请输入登录名 "/>
				<img id="staffCode_img" src="" /><span id="staffCode_error" class="errortip"></span>
			</p>
			<p style="width:150%;">
				<span>*</span>用户名：<input type="text" name="userName" id="userName_input" value="" maxlength="20" placeholder="请输入用户名"/>
				<img id="userName_img" src="" alt="" /><span id="userName_error" class="errortip"></span>
			</p>
			<p style="width:150%;">
				<span>*</span>手机号：<input type="text" name="phone" id="phone_input" value="" maxlength="11" placeholder="请输入手机号 "/>
				<img id="phone_img" src="" alt="" /><span id="phone_error" class="errortip"></span>
			</p>
			<p class="buss-phonecode">
				<span>*</span>手机验证码：<input type="text" name="phoneCode" id="phoneCode_input" value=""  placeholder="请输入手机收到的验证码"/><button>获得验证码</button>
				<img id="phoneCode_img" src="" alt="" /><span id="phoneCode_error" class="errortip"></span>
			</p>
			<p class="buss-regpwd">
				<span>*</span>密码：<input type="password" name="password" id="password_input" value="" maxlength="20" placeholder="请输入密码"/>
				<img id="password_img" src="" alt="" /><span id="password_error" class="errortip"></span>
			</p>
			<p class="buss-cofpwd">
				<span>*</span>确认密码：<input type="password" name="passwordChecked" id="passwordChecked_input" value="" maxlength="20" placeholder="请再次输入密码，保持一致"/>
				<img id="passwordChecked_img" src="" alt="" /><span id="passwordChecked_error" class="errortip"></span>
			</p>
			<p class="buss-clause">
				<input type="checkbox"  name="clauseChecked" id="clauseChecked_box" />我已阅读并同意
				<span style="position:static;"><a href="javascript:void(0);">《江苏省国际招标公司业务管理平台注册条款》</a></span>
				<img id="clauseChecked_img" src="" alt="" /><span id="clauseChecked_error" class="errortip"></span>
			</p>
			<button class="buss-comit" id="submit_btn">立即提交</button>
			<div class="buss-regbot">
				<p class="buss-reline"></p>
				<p style="position:static;">我有账号，<span style="position:static;"><a href="javascript:void(0);">直接登录</a></span></p>
				<p class="buss-rerline"></p>
			</div>
		</div>
	</div>

</body>
</html>
