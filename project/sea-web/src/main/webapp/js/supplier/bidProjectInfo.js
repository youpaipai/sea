//定义一个js对象，以下所有属性和方法全部都设定成Bid对象属性和方法
var BidInfoProject = {};
// 服务器地址的根路径
BidInfoProject.contextPath = Main.contextPath;
BidInfoProject.queryConditionData = null;

/**
 * js所有事件、执行方法的入口
 */
BidInfoProject.initPage = function() {
	//1.我要投标点击事件
	$("#btnTender").bind("click",function(){
		alert(GetQueryString("tenderProjectId"));
		BidInfoProject.BidInfoProject();
	});
	
};

/**
 * 搜索条件获取
 */
BidInfoProject.queryCondition = function(){
	// 1.获取招标项目编号
	var tenderProjectId = GetQueryString("tenderProjectId");
	// 2.获取分包编号
	var subId = $("#subId").val();
	
	
	BidInfoProject.queryConditionData = {
			"tenderProjectId" : tenderProjectId,
			"subNum" : subNum
	};
	
	return BidInfoProject.queryConditionData;
};

/**
 * 按钮点击事件
 */
BidInfoProject.BidInfoProject = function() {
	var data = BidInfoProject.queryCondition();
	if(!data){
		return false;
	}
	BidInfoProject.addBidProject(data);
};

/**
 * 添加招标项目
 */
BidInfoProject.addBidProject = function(data) {
	if(!data){
		return false;
	}

	$.ajax({
		type : "POST",
		url : BidInfoProject.contextPath + "/supplier/addBidProject.do",
		datatype : "json",
		data : data,
		success : function(res) {
			if (res.success) {
				WebUtils.alert("操作成功！可在正在执行项目中查看已投标项目！");
			}else{
				WebUtils.alert(res.data.tipMsg);
			}
		},
		error : function() {
			WebUtils.alert("操作失败，如多次出现，请联系管理员！");
		}
	});
};

/**
 * 采用正则表达式获取地址栏参数：（ 强烈推荐，既实用又方便！）
 */

function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}
