//定义一个js对象，以下所有属性和方法全部都设定成Bid对象属性和方法
var Exception = {};
// 服务器地址的根路径
Exception.contextPath = Main.contextPath;
Exception.queryConditionData = null;

/**
 * js所有事件、执行方法的入口
 */
Exception.initPage = function() {
	
	//1.初始查询
	Exception.exceptionProject_search_btnClick();
	
	//2.查询按钮点击事件
	$("#querybtn").bind("click",function(){
		Exception.exceptionProject_search_btnClick();
	});
};

/**
 * 搜索条件获取
 */
Exception.queryCondition = function(){
	// 获取项目名称
	var tenderProjectName=$("#tenderProjectName").val();
	alert(tenderProjectName);
	// 获取项目编号
	var tenderProjectNum=$("#tenderProjectNum").val();
	Exception.queryConditionData = {
			"tenderProjectName" : tenderProjectName,
			"tenderProjectNum" : tenderProjectNum	
	};
	
	return Exception.queryConditionData;
};


/**
 * 按钮点击事件
 */
Exception.exceptionProject_search_btnClick = function(){
		var data = Exception.queryCondition();
		if(!data){
			return false;
		}
		Exception.ajaxExceptionProject(data, 1);
};


/**
 * 条件查询异常项目
 */
Exception.ajaxExceptionProject = function(data, currentPage) {
	if(!data){
		return false;
	}
	$("#pieceNot_div").html("");
	$("#pagesHtml").html("");
	if(currentPage <= 0){
		currentPage = 1;
	}
	data.currentPage = currentPage;
	$.ajax({
		type : "POST",
		url : Exception.contextPath + "/supplier/queryExePro.do",
		datatype : "json",
		 data : data,
		success : function(res) {
			$("#pieceNot_div").html("");
			$("#pagesHtml").html("");
			if (res.success) {
				$("#spfocus_span").html("0");
				Exception.queryConditionData = data;
				var list = res.data.exceptionList;
				if (list.length == 0) {
					$("#exceptionList").append(Exception.tipMsgHtml("没有查询到相关数据!"));
				} else {
					for ( var i = 0; i < list.length; i++) {
						var trHtml = "<tr style='text-align: center;background-color: #fff;'>"
									+	"<td>"+(i+1)+"</td>"
									+ 	"<td>"+list[i].tenderProjectName+"</td>"
									+ 	"<td>"+list[i].tenderProjectNum+"</td>"
									+	"<td>"+list[i].setUser+"</td>"
									+ 	"<td>"+list[i].phone+"</td>"
									+	"<td>"+list[i].setDate+"</td>"
									+	"<td>"+list[i].result+"</td>"
									+ 	"<td><a href='javascript:void(0);'>详情</a></td>"
									+ "</tr>";
						
						$("#exceptionList").append(trHtml);
					}
				}
				Exception.webPages(currentPage, res.data.webPager);
				
			}else{
				$("#exceptionList").append(Exception.tipMsgHtml(res.tipMsg));
			}
		},
		error : function() {
			WebUtils.alert("查询失败，如多次出现，请联系管理员！");
		}
	});
};

/**
 * 查询结果为0，或者查询失败提示html
 */
Exception.tipMsgHtml = function(tipMsg){
	var tipMsgHtml= "<tr style='text-align: center;background-color: #fff;'>"
		+				"<td colspan='8'>"
		+ 					"<span>"+ tipMsg +"</span>"
		+				"</td>"
		+			"</tr>";
	return tipMsgHtml;
};

Exception.webPages = function(currentPage, webPager){
	$("#pages_div").html("");
	if(!webPager){
		return false;
	}
	if(typeof(webPager) !== "object"){
		return false;
	}
	if(!currentPage){
		currentPage = 1;
	}
	
	$("#spfocus_span").html(webPager.totalRows);
	if(webPager.totalPages > 0){
		var pagesHtml = ''
			//'<p class="common" style="float:left;margin-left:20px">共<span>'+ webPager.totalPages +'</span>条记录</p>'
					  +	'<ul class="dicpage" style="width:35%">'
					  +		'<li><a href="javascript:void(0)" onclick="Exception.webPagesClick(1, '+ currentPage +','+ webPager.totalPages +')" >首页</a></li>'
					  +		'<li><a href="javascript:void(0)" onclick="Exception.webPagesClick('+ (currentPage - 1) +','+ currentPage +',' + webPager.totalPages +')">上一页</a></li>';
		for(var i=0; i < webPager.showPagesList.length; i++){
			if(webPager.showPagesList[i] == currentPage){
				pagesHtml +='<li class="active"><a href="javascript:void(0)">'+ webPager.showPagesList[i] +'</a></li>';
			}else{
				pagesHtml +='<li><a href="javascript:void(0)" onclick="Exception.webPagesClick('+ webPager.showPagesList[i] +',' + currentPage +','+ webPager.totalPages +')">'+ webPager.showPagesList[i] +'</a></li>';
			}
		}
		pagesHtml +=		'<li><a href="javascript:void(0)" onclick="Exception.webPagesClick('+ (currentPage + 1) +',' + currentPage +','+ webPager.totalPages +')">下一页</a></li>'
				  +			'<li><a href="javascript:void(0)" onclick="Exception.webPagesClick('+ webPager.totalPages +',' + currentPage +','+ webPager.totalPages +')">尾页</a></li>'
				  +		'</ul>';
		$("#pages_div").html(pagesHtml);
	}
};
/**
 * queryPage要查询的页数
 * currentPage当前页的页数
 * totalPage总页数
 */
Exception.webPagesClick = function(queryPage, currentPage, totalPage){
	if(totalPage <= 0){
		return false;
	}
	if(!queryPage || queryPage<=0){
		return false;
	}
	if(queryPage == currentPage){
		return false;
	}
	if(queryPage > totalPage){
		return false;
	}
	Exception.ajaxBidProject(Exception.queryConditionData, queryPage);
};