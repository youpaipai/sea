//定义一个js对象，以下所有属性和方法全部都设定成Bid对象属性和方法
var Bidding = {};
// 服务器地址的根路径
Bidding.contextPath = Main.contextPath;
Bidding.queryConditionData = null;

/**
 * js所有事件、执行方法的入口
 */
Bidding.initPage = function() {
	
	//1.初始查询
	Bidding.bidding_search_btnClick();
	
	//2.查询按钮点击事件
	$("#querybtn").bind("click",function(){
		Bidding.bidding_search_btnClick();
	});
};

/**
 * 获取搜索条件
 */
Bidding.queryCondition=function(){
	// 1.获取项目名称
	var projectName = $("#projectNmae").val();
	// 2.获取项目编号
	var projectNum = $("#projectNum").val();
	// 3.获取开标时间(起始)
	var startTime = $("#startTime").val();
	// 4.获取开标时间(结束)
	var endTime=$("#endTime").val();
	
	Bidding.queryConditionData = {
			"tenderProjectName" : projectName,
			"tenderProjectNum" : projectNum,
			"startTime" : startTime,
			"endTime" : endTime
	};
	
	return Bidding.queryConditionData;
};


/**
 * 按钮点击事件
 */
Bidding.bidding_search_btnClick=function(){
	var data = Bidding.queryCondition();
	if(!data){
		return false;
	}
	Bidding.ajaxBiddingProject(data,1);
};


/**
 * 条件查询招标项目
 */
Bidding.ajaxBiddingProject = function(data , currentPage) {
	if(!data){
		return false;
	}	
	$("#pagesHtml").html("");
	if(currentPage <= 0){
		currentPage = 1;
	}
	
	data.currentPage = currentPage;
	$.ajax({
		type : "POST",
		url : Bidding.contextPath + "/supplier/queryBidding.do",
		datatype : "json",
		data : data,
		success : function(res) {
			$("#spfocus_span").html("0");
			$("#biddingList tr").not(":first").remove();
			if (res.success) {
				Bidding.queryConditionData = data;
				var list = res.data.biddingList;
				alert(list.length);
				$("#spfocus_span").html(list.length);
				if (list.length == 0) {
					$("#biddingList").append(Bidding.tipMsgHtml("没有查询到相关数据!"));
				} else {
					for ( var i = 0; i < list.length; i++) {
						var trHtml = "<tr style='text-align: center;background-color: #fff;'>"
								+		"<td>"+(i+1)+"</td>"
								+ 		"<td>"+list[i].tenderProjectName+"</td>"
								+ 		"<td>"+list[i].tenderProjectNum+"</td>"
								+		"<td>"+list[i].openBidTime+"</td>"
								+ 		"<td>"+list[i].unfinished+"</td>"
								+ 		"<td><a href='javascript:void(0);'>取消投标</a> | <a href='javascript:void(0);'>详情</a></td>"
								+ "</tr>";
						$("#biddingList").append(trHtml);
					}
				}
				//拼接html
				Bidding.webPages(currentPage,res.data.webPager);
				
			}else{
				$("#biddingList").append(Bidding.tipMsgHtml(res.tipMsg));
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
Bidding.tipMsgHtml = function(tipMsg){
	var tipMsgHtml= "<tr style='text-align: center;background-color: #fff;'>"
		+				"<td colspan='6'>"
		+ 					"<span>"+ tipMsg +"</span>"
		+				"</td>"
		+			"</tr>";
	return tipMsgHtml;	
};


Bidding.webPages = function(currentPage, webPager){
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
	if(webPager.totalPages > 0){
		var pagesHtml = ''
			//'<p class="common" style="float:left;margin-left:20px">共<span>'+ webPager.totalPages +'</span>条记录</p>'
					  +	'<ul class="dicpage" style="width:35%">'
					  +		'<li><a href="javascript:void(0)" onclick="Bidding.webPagesClick(1, '+ currentPage +','+ webPager.totalPages +')" >首页</a></li>'
					  +		'<li><a href="javascript:void(0)" onclick="Bidding.webPagesClick('+ (currentPage - 1) +','+ currentPage +',' + webPager.totalPages +')">上一页</a></li>';
		for(var i=0; i < webPager.showPagesList.length; i++){
			if(webPager.showPagesList[i] == currentPage){
				pagesHtml +='<li class="active"><a href="javascript:void(0)">'+ webPager.showPagesList[i] +'</a></li>';
			}else{
				pagesHtml +='<li><a href="javascript:void(0)" onclick="Bidding.webPagesClick('+ webPager.showPagesList[i] +',' + currentPage +','+ webPager.totalPages +')">'+ webPager.showPagesList[i] +'</a></li>';
			}
		}
		pagesHtml +=		'<li><a href="javascript:void(0)" onclick="Bidding.webPagesClick('+ (currentPage + 1) +',' + currentPage +','+ webPager.totalPages +')">下一页</a></li>'
				  +			'<li><a href="javascript:void(0)" onclick="Bidding.webPagesClick('+ webPager.totalPages +',' + currentPage +','+ webPager.totalPages +')">尾页</a></li>'
				  +		'</ul>';
		$("#pages_div").html(pagesHtml);
	}
};
/**
 * queryPage要查询的页数
 * currentPage当前页的页数
 * totalPage总页数
 */
Bidding.webPagesClick = function(queryPage, currentPage, totalPage){
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
	Bidding.ajaxBidProject(Bidding.queryConditionData, queryPage);
};


