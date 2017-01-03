//定义一个js对象，以下所有属性和方法全部都设定成MenuButton对象属性和方法
var MenuButton = {};
// 服务器地址的根路径
MenuButton.contextPath = Main.contextPath;

// js所有事件、执行方法的入口
MenuButton.initPage = function() {
	// 初始化数据
	MenuButton.initTree();
	// 权限
	MenuButton.selectAllTrees();

	// 完善用户信息
	$("#submitbtn").bind("click", function() {
		MenuButton.addMenuSubmit();
	})
};
// 初始化数据
MenuButton.initTree = function() {
	var op=$("#op").val();	
	// setting参数
	var setting = {
		check : {
			// 设置 zTree 的节点上是否显示 checkbox / radio
			enable : true,
			// 勾选框类型[setting.check.enable = true 时生效]
			chkStyle : "checkbox"
		},
		view : {
			// 设置是否允许同时选中多个节点
			selectedMulti : false
		},
		data : {
			simpleData : {
				enable : true,
				// 节点数据中保存唯一标识的属性名称
				idKey : "id",
				// 节点数据中保存其父节点唯一标识的属性名称
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
		url : MenuButton.contextPath + "/menu/queryInitTree.do",
		error : function() {// 请求失败处理函数
			alert('请求失败!');
		},
		success : function(res) {
			// 加载树形菜单 默认展开
			$.fn.zTree.init($("#tree"), setting, res.data.buttonList).expandAll(true);
		}
	});

}

// 选择权限 赋值到隐藏域中
MenuButton.selectAllTrees = function() {
	var nodes = $.fn.zTree.getZTreeObj("tree");

	nodes = nodes.getCheckedNodes(true);
	var selectedIds;
	var count = 0;
	for ( var i = 0; i < nodes.length; i++) {
		var nodeOne = nodes[i];
		if (null == selectedIds) {
			selectedIds = nodeOne.id + ":" + nodeOne.name + ";";
		} else {
			selectedIds += nodeOne.id + ":" + nodeOne.name + ";";
		}
		count = count + 1;
	}
	if (count == 0) {
		WebUtils.alert("请选择菜单权限");
		return false;
	}
	selectedIds = selectedIds.substr(0, selectedIds.length - 1);
	$("#selectIds").val(selectedIds);
}

// 完善菜单信息校验请求参数
MenuButton.addCondition = function() {
	var tipMsg = "";
	// 菜单名称
	var menuname = $("#menuname").val();
	if (!menuname || !WebUtils.trim(menuname)) {
		tipMsg = "菜单名称不能为空";
	}
	// url
	var urlpath = $("#urlpath").val();
	if (tipMsg==""&&(!urlpath || !WebUtils.trim(urlpath))) {
		tipMsg = "菜单路径不能为空";
	}
	var parentId = $("#parentid").val();
	// 选择菜单-权限 调用菜单权限方法
	MenuButton.selectAllTrees();
	var menuBtn = $("#selectIds").val();
	var menu_buttons = "";
	if (menuBtn != "") {
		menu_buttons = MenuButton.splitMenuButton(menuBtn);
	}
	var jsRes = WebUtils.JsResponseFactory();
	if (tipMsg) {
		jsRes.success = false;
		jsRes.tipMsg = tipMsg;
	} else {
		// 数据
		jsRes.success = true;
		jsRes.tipMsg = null;
		var op = $("#op").val();
		if (op != "" && op == "add") {
			// 添加：
			jsRes.data = {
				menuName : menuname,
				urlPath : urlpath,
				parentId : parentId,
				op : op,
				buttonIds : menu_buttons

			};
		} else {
			var menuid = $("#menuid").val();
			// 修改：
			jsRes.data = {
				menuName : menuname,
				urlPath : urlpath,
				parentId : parentId,
				menuId : menuid,
				op : op,
				buttonIds : menu_buttons

			};
		}
	}
	// 返回数据
	return jsRes;
};

// 完善用户数据信息
MenuButton.addMenuSubmit = function() {
	// 接收用户数据信息
	var jsRes = MenuButton.addCondition();
	if (!jsRes.success) {
		WebUtils.alert(jsRes.tipMsg);
		return false;
	}
	var url = "";
	var op = $("#op").val();
	if (!op && op == "add") {
		// 添加：url
		url = Menu.contextPath + "/menu/ajaxSaveMenuInfo.do";
	} else {
		// 修改：url
		url = Menu.contextPath + "/menu/ajaxSaveMenuInfo.do";
	}
	$.ajax({
		type : "POST",
		url : url,
		datatype : "json",
		data : jsRes.data,
		success : function(res) {
			try {
				if (res.success) {
					// 添加、修改成功
				} else {
					WebUtils.alert(res.tipMsg);
				}
			} catch (e) {
				WebUtils.alert(e);
			}
		},
		error : function() {
		}
	});
}

//分割字符串
MenuButton.splitMenuButton = function(menuBtn) {
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
