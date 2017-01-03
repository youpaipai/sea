//定义一个js对象，以下所有属性和方法全部都设定成users对象属性和方法
var Users = {};
//服务器地址的根路径
Users.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
Users.initPage = function()
{	
	//查询按钮事件
	$("#querybtn").bind("click", function(){
		users.queryUsers();
	});
	//跳转到用户信息页面
	$("#addbtn").bind("click",function(){
		alert(1);
		Users.addUserInfo();
	});
	//完善用户信息页面
	//验证：账号是否唯一
	$("#staffcode").bind("blur",function(){
		Users.ajaxCheckStaffcode();
	})
	//验证:手机号码是否唯一
	$("#phone").bind("blur",function(){
		Users.ajaxCheckPhone();
	})
	//完善用户信息
	$("#submitbtn").bind("click",function(){
		Users.addUserSubmit();
	})
	//全选操作
	$("#allbtn").bind("click",function(){
		Users.selectAllUsers();	
	})
	//跳转到详情页面--子用户数据列表
	$("#detailbtn").bind("click",function(){
		Users.detailPage();
	})
	//停用操作
	$("#stopbtn").bind("click",function(){
		Users.ajaxStopUser();
		
	})
	//删除操作
	$("#delbtn").bind("click",function(){
		Users.ajaxDelUser();		
	})
};
//全选、全不选操作
Users.selectAllUsers=function(){
	if ($("#allbtn").prop('checked')) {			
		$('input[name="userid"]').prop("checked",true);
	} else {
		$('input[name="userid"]').prop("checked",false);
	}	
}
//验证：账号是否唯一
Users.ajaxCheckStaffcode=function(){
	var tipMsg = "";
	//账号
	var staffcode = $("#staffcode").val();
	//执行ajax
	$.ajax({
		type : "POST",
		url : Users.contextPath + "/users/ajaxCheckStaffcode.do",
		datatype : "json",
		data :{"staffcode":staffcode},
		success : function(res){
			try{
				if(res.success){
					//验证成功
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
}
//验证：手机号码是否唯一
Users.ajaxCheckPhone=function(){
	var tipMsg = "";
	var phone = $("#phone").val();
	//执行ajax
	$.ajax({
		type : "POST",
		url : Users.contextPath + "/users/ajaxCheckPhone.do",
		datatype : "json",
		data :{"phone":phone},
		success : function(res){
			try{
				if(res.success){
					//验证成功
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
}
//完善用户信息校验请求参数
Users.addCondition = function(){
	var tipMsg = "";
	//用户名
	var username = $("#username").val();
	if(!username|| !WebUtils.trim(username)){
		tipMsg = "用户名不能为空";
	}
	//账号
	var staffcode = $("#staffcode").val();
	if(!staffcode ||!WebUtils.trim(staffcode)){	
		tipMsg = "账号不能为空";
	}
	//手机号码
	var phone = $("#phone").val();
	if(!phone || !WebUtils.trim(phone)){
		tipMsg = "手机号码不能为空";
	}else{
		//验证手机号码是否合法
		var regPhone = /^0?1[3|4|5|8][0-9]\d{8}$/;
		if(!regPhone.test(phone)){
			tipMsg="手机号码不合法";
		}
	}
	//性别
	var gender=$("input[name='gender']:checked").val();
	//验证邮箱是否合法
	var email=$("#email").val();
	if(!email|| !WebUtils.trim(email)){ 
		tipMsg="邮箱不能为空";
	}else{
		var regEmail =/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if(!regEmail.test(email)){
			tipMsg="邮箱验证不合法";
		}
	}	
	//固定电话
	var tel=$("#tel").val();
	if(!tel||!webUtils.trim(tel)){
		tipMsg="固定电话不能为空";
	}else{
		var regTel=/^0\d{2,3}-\d{7,8}$/;
		if(!regTel.test(tel)){
			tipMsg="固定电话验证不合法";
		}	
	}	
	//证件类型
	var cardtype=$("#cardtype").val();
	if(!cardtype||cardtype<=0){
		tipMsg="请选择证件类型";
	}
	//证件号码
	var cardno=$("#cardno").val();	
	if(!cardno || !webUtils.trim(cardno)){
		tipMsg="证件号码不能为空";
	}
	//角色类型
	var rolename=$("#rolename").val();	
	if(!rolename||rolename<=0){
		tipMsg="请选择角色类型";
	}
	//组织机构类型
	var orgname=$("#orgname").val();
	if(!orgname||orgname<=0){
		tipMsg="请选择组织机构类型";
	}	
	//部门
	var deptname=$("#deptname").val();		
	if(!deptname||deptname<=0){
		tipMsg="请选择部门类型";
	}
	var jsRes = WebUtils.JsResponseFactory();
	if(tipMsg){
		jsRes.success = false;
		jsRes.tipMsg = tipMsg;
	}else{
		//数据
		jsRes.success = true;
		jsRes.tipMsg = null;
		var op=$("#op").val();
		if(op!=""&&op=="add"){
			//添加：
			jsRes.data = {
					username : username,
					staffcode:staffcode,
					gender:gender,
					phone:phone,
					email : email,
					tel:tel,
					cardtype : cardtype,
					cardno:cardno,						
					rolename:rolename,
					orgname:orgname,
					deptname:deptname
			};
		}else{
			var userid=$("#userid").val();
			//修改：
			jsRes.data = {
					username : username,
					staffcode:staffcode,
					gender:gender,
					phone:phone,
					email : email,
					tel:tel,
					cardtype : cardtype,
					cardno:cardno,						
					rolename:rolename,
					orgname:orgname,
					deptname:deptname,
					userid:userid
			};
		} 
	}
	//返回数据
	return jsRes;
};
//跳转到添加用户信息页面
Users.addUserInfo = function(){
	window.location.href=Users.contextPath+"/users/addUser.do";
};
//完善用户数据信息
Users.addUserSubmit=function(){
	//接收用户数据信息
	var jsRes = Users.addCondition();
	if(!jsRes.success){
		WebUtils.alert(jsRes.tipMsg);
		return false;
	}
	var url="";
	var op=$("#op").val();
	if(!op&&op=="add"){
		//添加：url
		url= Users.contextPath + "/users/ajaxAddUserInfo.do";
	}else{
		//修改：url
		url= Users.contextPath + "/users/ajaxEditUserInfo.do";
	}
	$.ajax({
		type : "POST",
		url :url,
		datatype : "json",
		data :jsRes.data,
		success : function(res){
			try{
				if(res.success){
					//添加、修改成功
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
}

//详情--子用户数据列表
Users.detailPage=function(){
	var index=$("#index").val();
	//获取主用户数据
	var userid=$("#userid"+index).val();
	var username=$("#username"+index).val();
	var phone=$("#phone"+index).val();
	var staffcode=$("#staffcode"+index).val();
	var status=$("#status"+index).val();	
	window.location.href=Users.contextPath + "/users/detailPage.do?userid="+userid+"&username="+encodeURI(encodeURI(username))+"&phone="+phone+"&staffcode="+encodeURI(encodeURI(staffcode))+"&status="+status;
}
//启用
Users.ajaxStartUser=function(userId){
	if(confirm("确定启用户吗")){
		//执行操作....
		$.ajax({
			type : "POST",
			url : Users.contextPath + "/users/ajaxHandleUser.do",
			datatype : "json",
			data :{"userIds":userId,"op":"start"},
			success : function(res){
				try{
					if(res.success){
						//验证成功
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
	}  
}
//停用
Users.ajaxStopUser=function(){
	//判断是否已选择用户
	var users = $("input[name='userid']");
	var selectCount = 0;
	var userid="";
	for ( var i = 0; i < users.length; i++) {
		if (users[i].checked == true) {
			selectCount = selectCount + 1;
			userid += users[i].value + "-";
		}
	}
	if (selectCount == 0) {
		alert("请选择用户");
		return;
	}else{
		if(confirm("确定停用用户吗")){
			//执行操作....
			$.ajax({
				type : "POST",
				url : Users.contextPath + "/users/ajaxHandleUser.do",
				datatype : "json",
				data :{"userIds":userid,"op":"stop"},
				success : function(res){
					try{
						if(res.success){
							//验证成功
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
		}
	}
	
}
//删除
Users.ajaxDelUser=function(){
	//判断是否已选择用户
	var users = $("input[name='userid']");
	var selectCount = 0;
	var userid="";
	for ( var i = 0; i < users.length; i++) {
		if (users[i].checked == true) {
			selectCount = selectCount + 1;
			userid += users[i].value + "-";
		}
	}
	if (selectCount == 0) {
		alert("请选择用户");
		return;
	}else{
		if(confirm("确定删除用户吗")){
			//执行操作....
			$.ajax({
				type : "POST",
				url : Users.contextPath + "/users/ajaxHandleUser.do",
				datatype : "json",
				data :{"userIds":userid,"op":"del"},
				success : function(res){
					try{
						if(res.success){
							//验证成功
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
		}
   }
}
//修改
Users.ajaxEditUser=function(userId){
	window.location.href=Users.contextPath + "/users/ajaxEditUser.do?userid="+userId;
}



