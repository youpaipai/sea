//定义一个js对象，以下所有属性和方法全部都设定成Bid对象属性和方法
var upVoucher = {};
// 服务器地址的根路径
upVoucher.contextPath = Main.contextPath;

// js所有事件、执行方法的入口
upVoucher.initPage = function() {
	
	//2.提交按钮点击事件
	$("#btnSubmit").bind("click",function(){
		upVoucher.btnSubmit();
	});
};

/**
 * 提交上传
 */
upVoucher.btnSubmit = function() {
	// 获取招标项目ID
	var tenderProjectNum=$("#tenderProjectNum").html();
	//获取文件id
	var fileId=$("#UPLOAD_FILE_ID").val();
	//获取分包id
	var subId='1';
	//获取用户id
	var userId="27149";
	
	$.ajax({
		type : "POST",
		url : upVoucher.contextPath + "/BidProcess/upVoucher.do",
		datatype : "json",
		data :{
			"tenderProjectId":tenderProjectNum,
			"fileId":fileId,
			"subId":subId,
			"userId":userId
		 },
		success : function(res) {
			if (res.success) {
				WebUtils.alert(res.tipMsg);
			}else{
				WebUtils.alert(res.tipMsg);
			};
		},
		error : function() {
			WebUtils.alert("上传失败，如多次出现，请联系管理员！");
		}
	});
};
