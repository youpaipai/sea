//定义一个js对象，以下所有属性和方法全部都设定成Bid对象属性和方法
var Deposit = {};
// 服务器地址的根路径
Deposit.contextPath = Main.contextPath;

// js所有事件、执行方法的入口
Deposit.initPage = function() {
	//2.查询按钮点击事件
	$("#querybtn").bind("click",function(){
		Deposit.btnSearch();
	});
	
};

/**
 * 保证金搜索查询
 */
Deposit.btnSearch = function() {
	// 获取项目名称
	var projectName=$("#projectNmae").val();
	// 获取项目编号
	var projectNum=$("#projectNum").val();
	// 是否完成退款
	var refund=$("#refund").val();
	
	$.ajax({
		type : "POST",
		url : Deposit.contextPath + "/supplier/queryMyBid.do",
		datatype : "json",
		 data :{
			"projectName":projectName,
			"projectNum":projectNum,
			"refund":refund
		 },
		success : function(res) {
			if (res.success) {
				var msg = "";
				var list = res.data.depositList;
				if (list.length == 0) {
					msg = "<tr style='text-align: center;background-color: #fff;'>"
						+ 	"<td colspan='7'>"
						+ 		"<span class='w3'>无忧君没有查询到相关信息！</span>"
						+ 	"</td>"
						+ "</tr>";
				} else {
					for ( var i = 0; i < list.length; i++) {
						msg = "<tr style='text-align: center;background-color: #fff;'>"
							+ 		"<td>ceshimingzi</td>"
							+ 		"<td>15999999999</td>"
							+ 		"<td>第1包第2包</td"
							+ 		"<td>已退</td>"
							+ 		"<td>30006.3</td>"
							+       "<td>2016-06-30  12:11:12</td>"
							+ 		"<td><a href='javascript:void(0);'>详情</a></td>"
							+ "</tr>";
					};
				}
				$("#depositView tr").not(":first").remove();
				$("#depositView").append(msg);
			}else{
				WebUtils.alert(res.tipMsg);
			};
		},
		error : function() {
			WebUtils.alert("查询失败，如多次出现，请联系管理员！");
		}
	});
};


/**
 * 保证金上传查询
 */
Deposit.btnSearchUpload = function() {
	// 获取项目名称
	var projectName=$("#projectNmae").val();
	// 获取项目编号
	var projectNum=$("#projectNum").val();
	// 是否上传
	var uploadFlag=$("#uploadFlag").val();
	
	$.ajax({
		type : "POST",
		url : Deposit.contextPath + "/supplier/queryDepUpload.do",
		datatype : "json",
		 data :{
			"projectName":projectName,
			"projectNum":projectNum,
			"uploadFlag":uploadFlag
		 },
		success : function(res) {
			if (res.success) {
				var msg = "";
				var list = res.data.depositList;
				if (list.length == 0) {
					msg = "<tr style='text-align: center;background-color: #fff;'>"
						+ 	"<td colspan='7'>"
						+ 		"<span class='w3'>无忧君没有查询到相关信息！</span>"
						+ 	"</td>"
						+ "</tr>";
				} else {
					for ( var i = 0; i < list.length; i++) {
						msg = "<tr style='text-align: center;background-color: #fff;'>"
							+ 		"<td>ceshimingzi</td>"
							+ 		"<td>15999999999</td>"
							+ 		"<td>第1包第2包</td"
							+ 		"<td>已退</td>"
							+ 		"<td>30006.3</td>"
							+       "<td>2016-06-30  12:11:12</td>"
							+ 		"<td><a href='javascript:void(0);'>详情</a></td>"
							+ "</tr>";
					};
				}
				$("#depositView tr").not(":first").remove();
				$("#depositView").append(msg);
			}else{
				WebUtils.alert(res.tipMsg);
			};
		},
		error : function() {
			WebUtils.alert("查询失败，如多次出现，请联系管理员！");
		}
	});
};
