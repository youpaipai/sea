//定义一个js对象，以下所有属性和方法全部都设定成Menu对象属性和方法
var Menu = {};
//服务器地址的根路径
Menu.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
Menu.initPage = function(){

	//查询按钮事件
	$("#querybtn").bind("click", function(){
		
	});
	//跳转到菜单信息页面
	$("#addbtn").bind("click",function(){
		Menu.addMenuInfo();
	});

	//全选操作
	$("#allbtn").bind("click",function(){
		Menu.selectAllMenu();	
	})
	//停用操作
	$("#stopbtn").bind("click",function(){
		Menu.ajaxStopMenu();
		
	})
	//启用操作
	$("#startbtn").bind("click",function(){
		Menu.ajaxStartMenu();
		
	})

};
//全选、全不选操作
Menu.selectAllMenu=function(){
	if ($("#allbtn").prop('checked')) {			
		$('input[name="menuid"]').prop("checked",true);
	} else {
		$('input[name="menuid"]').prop("checked",false);
	}	
}

//启用
Menu.ajaxStartMenu=function(){
	//判断是否已选择菜单
	var menu = $("input[name='menuid']");
	var selectCount = 0;
	var menuid="";
	for ( var i = 0; i < menu.length; i++) {
		if (menu[i].checked == true) {
			selectCount = selectCount + 1;
			menuid += menu[i].value + "-";
		}
	}
	if (selectCount == 0) {
		alert("请选择菜单");
		return;
	}else{
		if(confirm("确定启用户吗")){
			//执行操作....
			$.ajax({
				type : "POST",
				url : Menu.contextPath + "/menu/ajaxHandleMenu.do",
				datatype : "json",
				data :{"menuIds":menuid,"op":"start","status":0},
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
Menu.ajaxStopMenu=function(){
	//判断是否已选择菜单
	var menu = $("input[name='menuid']");
	var selectCount = 0;
	var menuid="";
	for ( var i = 0; i < menu.length; i++) {
		if (menu[i].checked == true) {
			selectCount = selectCount + 1;
			menuid += menu[i].value + "-";
		}
	}
	if (selectCount == 0) {
		alert("请选择菜单");
		return;
	}else{
		if(confirm("确定停用菜单吗")){
			//执行操作....
			$.ajax({
				type : "POST",
				url : Menu.contextPath + "/menu/ajaxHandleMenu.do",
				datatype : "json",
				data :{"menuIds":menuid,"op":"stop","status":1},
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
Menu.ajaxEditMenu=function(menuId){
	window.location.href=Menu.contextPath + "/menu/queryMenuInfo.do?menuId="+menuId+"&op=edit";
}
//跳转到添加用户信息页面
Menu.addMenuInfo = function(){
	window.location.href=Menu.contextPath+"/menu/queryMenuInfo.do?op=add";
};
//权限页面
Menu.ajaxMenuButton=function(menuId){
	window.location.href=Menu.contextPath+"/menu/queryInitMenuButton.do";
}




