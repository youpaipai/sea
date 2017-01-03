/**
 * 用户注册用的js
 */
//定义一个js对象，以下所有属性和方法全部都设定成Register对象的属性和方法
var Register = {};

// 服务器地址的根路径
Register.contextPath = Main.contextPath;

//页面加载时调用的初始化方法
Register.initPage = function(){
	//设置输入框里的默认显示信息
	$('input, textarea').placeholder({customClass:'my-placeholder'});
	//设置默认的规则提示信息
	Register.setDefaultTipMessage();
	//绑定登录名失焦时的校验事件
	$("#staffCode_input").bind("blur",function(){
		Register.checkStaffCode();
	});
	//绑定登录名得到焦点时给出规则的事件
	$("#staffCode_input").bind("focus",function(){
		$("#staffCode_error").html("* 4-20位大小写英文字母或数字，一旦设定将不可修改");
		$("#staffCode_error").css("color","blue");
	});
	//绑定用户名失焦时的校验事件
	$("#userName_input").bind("blur",function(){
		Register.checkUserName();
	});
	//绑定用户名得到焦点时给出规则的事件
	$("#userName_input").bind("focus",function(){
		$("#userName_error").html("* 2-20位任意字符");
		$("#userName_error").css("color","blue");
	});
	//绑定手机号失焦时的校验事件
	$("#phone_input").bind("blur",function(){
		Register.checkPhone();
	});
	//绑定手机号得到焦点时给出规则的事件
	$("#phone_input").bind("focus",function(){
		$("#phone_error").html("* 手机号不能为空！");
		$("#phone_error").css("color","blue");
	});
	//绑定验证码失焦时的校验事件
	$("#phoneCode_input").bind("blur",function(){
		Register.checkPhoneCode();
	});
	//绑定登录名得到焦点时给出规则的事件
	$("#phoneCode_input").bind("focus",function(){
		$("#phoneCode_error").html("* 验证码不能为空！");
		$("#phoneCode_error").css("color","blue");
	});
	//绑定密码失焦时的校验事件
	$("#password_input").bind("blur",function(){
		Register.checkPassword();
	});
	//绑定登录名得到焦点时给出规则的事件
	$("#password_input").bind("focus",function(){
		$("#password_error").html("* 8~20位大小写英文字母、数字、下划线（至少包含2种）");
		$("#password_error").css("color","blue");
	});
	//绑定确认失焦时的校验事件
	$("#passwordChecked_input").bind("blur",function(){
		Register.checkPasswordChecked();
	});
	//绑定登录名得到焦点时给出规则的事件
	$("#passwordChecked_input").bind("focus",function(){
		$("#passwordChecked_error").html("* 确认密码不能为空！");
		$("#passwordChecked_error").css("color","blue");
	});
	//绑定确认失焦时的校验事件
	$("#clauseChecked_box").bind("click",function(){
		Register.checkClauseChecked();
	});
	//立即提交注册
	$("#submit_btn").bind("click",function(){
		Register.registerBasicInformation();
	});
};

/**
 * 设置默认的规则提示信息
 */
Register.setDefaultTipMessage = function(){
	//登录名
	$("#staffCode_error").html("* 4-20位大小写英文字母或数字，一旦设定将不可修改");
	//用户名
	$("#userName_error").html("* 2-20位任意字符");
	//手机号
	$("#phone_error").html("* 手机号不能为空！");
	//验证码
	$("#phoneCode_error").html("* 验证码不能为空！");
	//密码
	$("#password_error").html("* 8~20位大小写英文字母、数字、下划线（至少包含2种）");
	//确认密码
	$("#passwordChecked_error").html("* 确认密码不能为空！");
	//默认不勾选"条款确认"
	$("#submit_btn").attr({"disabled":"disabled"});
	$("#submit_btn").css("background-color","grey");
};
/**
 * 即时检查输入的信息--登录名
 * 规则：4-20位英文字母（区分大小写）、数字
 * 同时校验唯一性：不得与其他人的登录名和手机号重复
 */
Register.checkStaffCode = function(){
	//定义校验规则
	var reg = /^[a-zA-Z0-9]{4,20}$/;
	//获取输入的登录名
	var staffCode = $("#staffCode_input").val();
	//去除所有空格
	var staffCode_NoSpace = staffCode.replace(/\s+/g,"");
	//判断是否为空
	if(staffCode_NoSpace==null || staffCode_NoSpace==""){
		$("#staffCode_error").html("登录名不能为空！");
		$("#staffCode_error").css("color","red");
		//$("#staffCode_img").attr("src","../images/tip-2.png");
		return false;
	}
	//校验：不符合规则则给出提示
	if(!reg.test(staffCode)){
		$("#staffCode_error").html("登录名不符合要求！");
		$("#staffCode_error").css("color","red");
		return false;
	}else{
		$("#staffCode_error").html("");
	}
	//校验的数据
	var data = {"staffCode" : staffCode};
	//校验唯一性
	$.ajax({
		type : "POST",
		url : Main.contextPath + "/register/queryStaffCode",
		dataType : "json",
		data : data,
		success : function(res){
			if(res.success){
				$("#staffCode_error").html("登录名可用！");
				$("#staffCode_error").css("color","green");
			}else{
				$("#staffCode_error").html(res.tipMsg);
				$("#staffCode_error").css("color","red");
			}
		},
		error : function(){
//			$("#staffCode_error").html(res.tipMsg);
//			$("#staffCode_error").css("color","red");
		}
	});
	
	return true;
};
/**
 * 即时检查输入的信息--用户名
 * 规则：不限制中英文、数字、特殊字符（长度限制2-20个字）
 */
Register.checkUserName = function(){
	//获取输入的用户名
	var userName = $("#userName_input").val();
	//去除所有空格
	var userName_NoSpace = userName.replace(/\s+/g,"");
	//判断是否为空
	if(userName_NoSpace==null || userName_NoSpace==""){
		$("#userName_error").html("用户名不能为空！");
		$("#userName_error").css("color","red");
		return false;
	}
	//校验：不符合规则则给出提示
	if(!(userName.length>=2 && userName.length<=20)){
		$("#userName_error").html("用户名不符合要求！");
		$("#userName_error").css("color","red");
		return false;
	}else{
		$("#userName_error").html("用户名可用");
		$("#userName_error").css("color","green");
	}
	
	return true;
};
/**
 * 即时检查输入的信息--手机号
 * 规则：以1[3|4|5|7|8]开头的11位数字
 * 同时校验唯一性：不得与其他人的登录名和手机号重复
 */
Register.checkPhone = function(){
	//定义校验规则
	var reg = /^1[3|4|5|7|8]\d{9}$/;
	//获取输入的手机号
	var phone = $("#phone_input").val();
	//去除所有空格
	var phone_NoSpace = phone.replace(/\s+/g,"");
	//判断是否为空
	if(phone_NoSpace==null || phone_NoSpace==""){
		$("#phone_error").html("手机号不能为空！");
		$("#phone_error").css("color","red !important");
		return false;
	}
	//校验：不符合规则则给出提示
	if(!reg.test(phone)){
		$("#phone_error").html("手机号不符合要求！");
		$("#phone_error").css("color","red");
		return false;
	}else{
		$("#phone_error").html("");
	}
	//校验的数据
	var data = {"phone" : phone};
	//校验唯一性
	$.ajax({
		type : "POST",
		url : Main.contextPath + "/register/queryPhone",
		dataType : "json",
		data : data,
		success : function(res){
			if(res.success){
				$("#phone_error").html("手机号可用！");
				$("#phone_error").css("color","green");
			}else{
				$("#phone_error").html("手机号已存在！");
				$("#phone_error").css("color","red");
			}
		},
		error : function(){
//			$("#phone_error").html(res.tipMsg);
//			$("#phone_error").css("color","red");
		}
	});
	
	return true;
};
/**
 * 即时检查输入的信息--验证码
 * 规则：待定【4位（或者6位） 数字（或者字母）】？
 */
Register.checkPhoneCode = function(){
	var phoneCode = $("#phoneCode_input").val();
	
	return true;
};
/**
 * 即时检查输入的信息--密码
 * 规则：8~20位英文字母（区分大小写）、数字、下划线（至少包含2种），字母或数字开头
 */
Register.checkPassword = function(){
	//定义校验规则:除长度外的其他规则
	var reg = /^[a-zA-Z0-9]*(([a-zA-Z]+[0-9_]+)|([0-9]+[a-zA-Z_]+))[a-zA-Z_0-9]*$/;
	//获取输入的密码
	var password = $("#password_input").val();
	//去除所有空格
	var password_NoSpace = password.replace(/\s+/g,"");
	//判断是否为空
	if(password_NoSpace==null || password_NoSpace==""){
		$("#password_error").html("密码不能为空！");
		$("#password_error").css("color","red");
		return false;
	}
	//校验：不符合规则则给出提示
	if(!reg.test(password) && (password.length<=8 || password.length>=20)){
		$("#password_error").html("密码不符合要求！");
		$("#password_error").css("color","red");
		return false;
	}else{
		$("#password_error").html("密码符合规则！");
		$("#password_error").css("color","green");
	}
	
	return true;
};
/**
 * 即时检查输入的信息--确认密码
 * 规则：8~20位英文字母（区分大小写）、数字、下划线（至少包含2种），字母或数字开头
 */
Register.checkPasswordChecked = function(){
	//获取输入的密码
	var password = $("#password_input").val();
	//获取输入的确认密码
	var passwordChecked = $("#passwordChecked_input").val();
	//去除所有空格
	password = password.replace(/\s+/g,"");
	passwordChecked = passwordChecked.replace(/\s+/g,"");
	//判断是否为空
	if(passwordChecked==null || passwordChecked==""){
		$("#passwordChecked_error").html("确认密码不能为空！");
		$("#passwordChecked_error").css("color","red");
		return false;
	}
	//校验：不符合规则则给出提示
	if(passwordChecked != password){
		$("#passwordChecked_error").html("两次输入的密码不一致！");
		$("#passwordChecked_error").css("color","red");
		return false;
	}else{
		$("#passwordChecked_error").html("两次输入的密码一致！");
		$("#passwordChecked_error").css("color","green");
	}
	
	return true;
};
/**
 * 即时检查输入的信息--条款确认，并启用/禁用提交操作
 */
Register.checkClauseChecked = function(){
	//获取条款确认的选中状态
	var clauseChecked = $("input[name='clauseChecked']").get(0).checked;
	//判断是否同意条款
	if(clauseChecked){
		//确认勾选：启用提交操作
		$("#submit_btn").removeAttr("disabled");
		$("#submit_btn").css("background-color","#187BF2");
		return true;
	}else{
		//未勾选：禁用提交操作
		$("#submit_btn").attr({"disabled":"disabled"});
		$("#submit_btn").css("background-color","grey");
		return false;
	}
};
/**
 * 检查输入的所有信息
 */
Register.checkAllInputedData = function(){
	var checkRet = {
		success : false,
		data : ""
	};
	//1、进行所有数据的校验
	//1.1、登录名校验
	if(!Register.checkStaffCode()){
		return false;
	}
	//1.2、用户名校验
	if(!Register.checkUserName()){
		return false;
	}
	//1.3、手机号校验
	if(!Register.checkPhone()){
		return false;
	}
	//1.4、验证码校验
	if(!Register.checkPhoneCode()){
		return false;
	}
	//1.5、密码校验
	if(!Register.checkPassword()){
		return false;
	}
	//1.6、确认密码校验
	if(!Register.checkPasswordChecked()){
		return false;
	}
	//1.7、确认条款校验
	if(!Register.checkClauseChecked()){
		return false;
	}
	//2、封装校验通过的数据
	//2.1、获取输入的登录名
	var staffCode = $("#staffCode_input").val();
	//2.2、获取输入的用户名
	var userName = $("#userName_input").val();
	//2.3、获取输入的手机号
	var phone = $("#phone_input").val();
	//2.4、获取输入的密码
	var password = $("#password_input").val();
	//2.5、获取输入的验证码
	var phoneCode = $("#phoneCode_input").val();
	
	//3、拼接数据
	var data = "&staffCode="+staffCode+"&userName="+userName+"&phone="+phone+"&password="+password+"&phoneCode="+phoneCode ;
	checkRet.success = true;
	checkRet.data = data;
	
	return checkRet;
};
/**
 * 提交注册基本信息
 */
Register.registerBasicInformation = function(){
	//检验所有信息
	var result = Register.checkAllInputedData();
	
	//校验通过
	if(result.success){
		$.ajax({
			type : "POST",
			url : Main.contextPath + "/register/registerBasicInformation",
			datatype : "json",
			data : result.data,
			success : function(res){
				if(res.success){
					WebUtils.alert("注册成功");
				}else{
					WebUtils.alert(res.tipMsg);
				}
			},
			error : function(){
				WebUtils.alert(res.tipMsg);
			}
		});
	}
};

