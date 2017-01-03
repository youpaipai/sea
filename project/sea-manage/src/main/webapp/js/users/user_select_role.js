//定义一个js对象，以下所有属性和方法全部都设定成UserSelectRole对象属性和方法
var UserSelectRole = {};
//服务器地址的根路径
UserSelectRole.contextPath = Main.contextPath;

//js所有事件、执行方法的入口
UserSelectRole.initPage = function(){
	//初始化数据
	UserSelectRole.initTree();
	//修改时：
	UserSelectRole.SelectAllId();
	//保存
	$("#savebtn").bind("click",function(){
		UserSelectRole.SaveAsSelects();
	});
	

};
//初始化数据
UserSelectRole.initTree=function(){
	var op=$("#op").val();
	var userId=$("#userId").val();
	var type=$("#type").val();
	
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
				pIdKey : "parentId",
				rootPId : "0"
			}
		}			
	};
	$.ajax({
		async : false,
		cache : false,
		type : 'POST',
		data:{
			//"roleId":roleId,
			"op":op,
			"userId":userId,
			"type":type
		},
		dataType : "json",
		url : "ajaxInitMenuAndButtonTree.html",
		error : function() {//请求失败处理函数
			alert('请求失败!');
		},
		success : function(data) { 
			//请求成功后处理函数  后台封装好的简单Json格式赋给treeNodes
			treeNodes = eval(data.menuList); 
			$.fn.zTree.init($("#tree"), setting,treeNodes);
		}
	});
}
//保存操作
UserSelectRole.SaveAsSelects=function(){
		var nodes = $.fn.zTree.getZTreeObj("tree");
		nodes = nodes.getCheckedNodes(true);
		var selectedIds;
		var count = 0;
		for ( var i = 0; i < nodes.length; i++) {
			var node = nodes[i];
			var parentNode = node.getParentNode();
			if (!node.isParent && null != parentNode) {
				selectedIds += node.id + "-" + parentNode.id + ":" + node.name + ";";
			} else {
				if (null == selectedIds) {
					selectedIds = node.id + ":" + node.name + ";";
				} else {
					selectedIds += node.id + ":" + node.name + ";";
				}
			}
			count = count + 1;
		}
		if (count == 0) {
			alert("请选择用户权限");
			return false;
		}
		selectedIds = selectedIds.substr(0, selectedIds.length - 1);
		window.returnValue = selectedIds;
		window.close();
};

UserSelectRole.SelectAllId=function(){
		var nodes = $.fn.zTree.getZTreeObj("tree");
		nodes = nodes.getCheckedNodes(true);
		var selectedIds;
		var count = 0;
		for ( var i = 0; i < nodes.length; i++) {
			var node = nodes[i];
			var parentNode = node.getParentNode();
			if (!node.isParent && null != parentNode) {
				selectedIds += node.id + "-" + parentNode.id + ":"
						+ node.name + ";";
				
			} else {
				if (null == selectedIds) {
					selectedIds = node.id + ":" + node.name + ";";
			
				} else {
					selectedIds += node.id + ":" + node.name + ";";
				}
			}
			count = count + 1;
		}

		if (count == 0) {
			alert("请选择用户权限");
			return false;
		}
		selectedIds = selectedIds.substr(0, selectedIds.length - 1);
		$("#selectIds").val(selectedIds);
};