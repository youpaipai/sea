//定义一个js对象，以下所有属性和方法全部都设定成Role对象属性和方法
var Role = {};
//服务器地址的根路径
Role.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
Role.initPage = function(){

	//查询按钮事件
	$("#querybtn").bind("click", function(){
		
	});
	//跳转到角色信息页面
	$("#addbtn").bind("click",function(){
		Role.addRoleInfo();
	});
	//全选操作
	$("#allbtn").bind("click",function(){
		Role.selectAllRole();	
	})
	//停用操作
	$("#stopbtn").bind("click",function(){
		Role.ajaxStopRole();
		
	})
	//启用操作
	$("#startbtn").bind("click",function(){
		Role.ajaxStartRole();
		
	})
};
//全选、全不选操作
Role.selectAllRole=function(){
	if ($("#allbtn").prop('checked')) {			
		$('input[name="roleid"]').prop("checked",true);
	} else {
		$('input[name="roleid"]').prop("checked",false);
	}	
}

//启用
Role.ajaxStartRole=function(){
	//判断是否已选择菜单
	var role = $("input[name='roleid']");
	var selectCount = 0;
	var roleid="";
	for ( var i = 0; i < role.length; i++) {
		if (role[i].checked == true) {
			selectCount = selectCount + 1;
			roleid += role[i].value + "-";
		}
	}
	if (selectCount == 0) {
		alert("请选择角色");
		return;
	}else{
		if(confirm("确定启用角色吗")){
			//执行操作....
			$.ajax({
				type : "POST",
				url : Role.contextPath + "/role/ajaxHandleRole.do",
				datatype : "json",
				data :{"roleIds":roleid,"op":"start","status":0},
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
//停用
Role.ajaxStopRole=function(){
	//判断是否已选择角色
	var role = $("input[name='roleid']");
	var selectCount = 0;
	var roleid="";
	for ( var i = 0; i < role.length; i++) {
		if (role[i].checked == true) {
			selectCount = selectCount + 1;
			roleid += role[i].value + "-";
		}
	}
	if (selectCount == 0) {
		alert("请选择角色");
		return;
	}else{
		if(confirm("确定停用角色吗")){
			//执行操作....
			$.ajax({
				type : "POST",
				url : Role.contextPath + "/role/ajaxHandleRole.do",
				datatype : "json",
				data :{"roleIds":roleid,"op":"stop","status":1},
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
Role.ajaxEditRole=function(roleId){
	window.location.href=Role.contextPath + "/role/queryRoleInfo.do?roleId="+roleId+"&op=edit";
}
//跳转到添加用户信息页面
Role.addRoleInfo = function(){
	
	window.location.href=Role.contextPath+"/role/queryRoleInfo.do?op=add";
};


