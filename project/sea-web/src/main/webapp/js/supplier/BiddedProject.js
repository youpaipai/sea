//定义一个js对象，以下所有属性和方法全部都设定成Bidded对象属性和方法
var Bidded = {};
// 服务器地址的根路径
Bidded.contextPath = Main.contextPath;
Bidded.queryConditionData = null;

// js所有事件、执行方法的入口
Bidded.initPage = function() {
	
	//1.初始查询
	Bidded.BiddedProject_search_btnClick();
	
	//2.查询按钮点击事件
	$("#querybtn").bind("click",function(){
		Bidded.BiddedProject_search_btnClick();
	});
	
};

/**
 * 搜索条件获取
 */
Bidded.queryCondition = function(){
	// 获取项目名称
	var tenderProjectName=$("#projectName").val();
	// 获取项目编号
	var tenderProjectNum=$("#projectNum").val();
	// 是否中标
	var bidStatus=$("#bidStatus").val();
	
	Bidded.queryConditionData = {
			"tenderProjectName" : tenderProjectName,
			"tenderProjectNum" : tenderProjectNum,
			"bidStatus" : bidStatus
	};
	
	return Bidded.queryConditionData;
};

/**
 * 按钮点击事件
 */
Bidded.BiddedProject_search_btnClick = function() {
	var data =Bidded.queryCondition();
	if(!data){
		return false;
	}
	Bidded.ajaxBiddedProject(data, 1);
};

/**
 * 条件查询已完成项目
 */
Bidded.ajaxBiddedProject = function(data ,currentPage) {
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
		url : Bidded.contextPath + "/supplier/queryBiddedProject.do",
		datatype : "json",
		 data : data,
		success : function(res) {
			$("#pieceNot_div").html("");
			$("#spfocus_span").html("0");
			$("#myBidProject tr").not(":first").remove();
			if (res.success) {
				Bidded.queryConditionData = data;
				var list = res.data.biddedList;
				if (list.length == 0) {
					$("#myBidProject").append(Bidded.tipMsgHtml("没有查询到相关数据!"));
				} else {
					for ( var i = 0; i < list.length; i++) {
						var trHtml = "<tr style='text-align: center;background-color: #fff;'>"
									+ 	"<td>"+(i+1)+"</td>"
									+ 	"<td>"+list[i].projectName+"</td>"
									+ 	"<td>"+list[i].projectNum+"</td>"
									+ 	"<td><img src='"+Bidded.contextPath+"/images/tip-3.png'/></td>"
									+ 	"<td>"+list[i].subName+"</td>"
									+ 	"<td><a href='javascript:void(0);'>详情</a></td>"
									+ "</tr>";
						$("#myBidProject").append(trHtml);
					}
				}
				Bidded.webPages(currentPage,res.data.webPager);
				
			}else{
				$("#pieceNot_div").append(Bidded.tipMsgHtml(res.tipMsg));
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
Bidded.tipMsgHtml = function(tipMsg){
	var tipMsgHtml = "<tr style='text-align: center;background-color: #fff;'>"
					+	"<td colspan='6'>"+tipMsg+"</td>"
					+"</tr>";
	return tipMsgHtml;
};

Bidded.webPages = function(currentPage, webPager){
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
					  +		'<li><a href="javascript:void(0)" onclick="Bidded.webPagesClick(1, '+ currentPage +','+ webPager.totalPages +')" >首页</a></li>'
					  +		'<li><a href="javascript:void(0)" onclick="Bidded.webPagesClick('+ (currentPage - 1) +','+ currentPage +',' + webPager.totalPages +')">上一页</a></li>';
		for(var i=0; i < webPager.showPagesList.length; i++){
			if(webPager.showPagesList[i] == currentPage){
				pagesHtml +='<li class="active"><a href="javascript:void(0)">'+ webPager.showPagesList[i] +'</a></li>';
			}else{
				pagesHtml +='<li><a href="javascript:void(0)" onclick="Bidded.webPagesClick('+ webPager.showPagesList[i] +',' + currentPage +','+ webPager.totalPages +')">'+ webPager.showPagesList[i] +'</a></li>';
			}
		}
		pagesHtml +=		'<li><a href="javascript:void(0)" onclick="Bidded.webPagesClick('+ (currentPage + 1) +',' + currentPage +','+ webPager.totalPages +')">下一页</a></li>'
				  +			'<li><a href="javascript:void(0)" onclick="Bidded.webPagesClick('+ webPager.totalPages +',' + currentPage +','+ webPager.totalPages +')">尾页</a></li>'
				  +		'</ul>';
		$("#pages_div").html(pagesHtml);
	}
};
/**
 * queryPage要查询的页数
 * currentPage当前页的页数
 * totalPage总页数
 */
Bidded.webPagesClick = function(queryPage, currentPage, totalPage){
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
	Bidded.ajaxBiddedProject(Bidded.queryConditionData, queryPage);
};



