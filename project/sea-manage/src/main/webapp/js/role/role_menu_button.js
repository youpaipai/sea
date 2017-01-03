//定义一个js对象，以下所有属性和方法全部都设定成RoleRoleMenuButton对象属性和方法
var RoleMenuButton = {};
//服务器地址的根路径
RoleMenuButton.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
RoleMenuButton.initPage = function(){
	//初始化数据
	RoleMenuButton.initTree();
	
	//完善用户信息
	$("#submitbtn").bind("click",function(){
		RoleMenuButton.addRoleSubmit();
	})
};
//初始化数据
RoleMenuButton.initTree=function(){	
	var op=$("#op").val();
	//setting参数
	var setting = {
			check : {
				//设置 zTree 的节点上是否显示 checkbox / radio
				enable : true,
				//勾选框类型[setting.check.enable = true 时生效]
				chkStyle : "checkbox"
			},
			view : {
				//设置是否允许同时选中多个节点
				selectedMulti : false
			},
			data : {
				simpleData : {
					enable : true,
					//节点数据中保存唯一标识的属性名称
					idKey : "id",
					//节点数据中保存其父节点唯一标识的属性名称
					pIdKey : "pId",
					rootPId : "0"
				}
			},
			checkable : true
			
		};
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		data:{"op":op},
		url : RoleMenuButton.contextPath+"/role/queryInitTree.do",
		error : function() {//请求失败处理函数
			WebUtils.alert('请求失败!');
		},
		success : function(res) { 
			//加载树形菜单 默认展开
			$.fn.zTree.init($("#tree"), setting,res.data.buttonList).expandAll(true);
		}
	});
			
}

//完善角色信息校验请求参数
RoleMenuButton.addCondition = function(){
	var tipMsg = "";
	//角色名称
	var rolename = $("#rolename").val();
	if(rolename==""||rolename==null){
		tipMsg = "角色名称不能为空";
	}	
	var type=$("#type").val();
	if(tipMsg==""&&(!type|| type==-1)){
		tipMsg = "请选择角色类型";
	}
	// 选择角色-菜单-权限 调用角色权限方法
	RoleMenuButton.selectAllTrees();
	var roleBtn = $("#selectIds").val();
	var role_menu_buttons = "";
	if (roleBtn != "") {
		//分割字符串 以,分割
		role_menu_buttons = RoleMenuButton.splitRoleMenuButton(roleBtn);
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
					roleName:rolename,
					type:type,
					op:op,
					menuIds:role_menu_buttons
			};
		}else{
			var roleid=$("#roleid").val();
			//修改：
			jsRes.data = {
					roleName : rolename,
					type:type,
					roleId:roleid,
					op:op,
					menuIds:role_menu_buttons
			};
		} 
	}
	//返回数据
	return jsRes;
};

//完善用户数据信息
RoleMenuButton.addRoleSubmit=function(){
	//接收用户数据信息
	var jsRes = RoleMenuButton.addCondition();
	if(!jsRes.success){
		WebUtils.alert(jsRes.tipMsg);
		return false;
	}
	var url="";
	var op=$("#op").val();
	if(!op&&op=="add"){
		//添加：url
		url= RoleMenuButton.contextPath + "/role/ajaxSaveRoleInfo.do";
	}else{
		//修改：url
		url= RoleMenuButton.contextPath + "/role/ajaxSaveRoleInfo.do";
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

//选择权限 赋值到隐藏域中
RoleMenuButton.selectAllTrees = function() {
	var nodes = $.fn.zTree.getZTreeObj("tree");
	nodes = nodes.getCheckedNodes(true);
	var selectedIds;
	var count = 0;
	for ( var i = 0; i < nodes.length; i++) {
		var nodeOne = nodes[i];
		//判断当前节点是否是父节点
		if (!nodeOne.isParent) {
			//获取父节点
			var parentNode = nodeOne.getParentNode();
			selectedIds += nodeOne.id + "-" + parentNode.id + ":"
					+ nodeOne.name + ";";	
			
		} else {
			if (null == selectedIds) {
				selectedIds = nodeOne.id + ":" + nodeOne.name + ";";
			} else {
				selectedIds += nodeOne.id + ":" + nodeOne.name + ";";
			}
		}
		count = count + 1;
	}
	if (count == 0) {
		WebUtils.alert("请选择角色权限");
		return false;
	}
	selectedIds = selectedIds.substr(0, selectedIds.length - 1);
	$("#selectIds").val(selectedIds);
}

//分割字符串
RoleMenuButton.splitRoleMenuButton = function(menuBtn) {
	// 0:编号 1：值
	buttons = new Array();
	menu_button = new Array();
	// 分割传递过来的字符串
	menu_button = menuBtn.split(";");

	var ids = new Array();
	var values = new Array();
	
	for ( var i = 0; i < menu_button.length; i++) {
		m = new Array();
		// 分割成各组字符串
		m = menu_button[i].split(":");
		ids[i] = m[0];
		values[i] = m[1];
	}
	buttons[0] = ids;
	buttons[1] = values;
	return buttons;
}