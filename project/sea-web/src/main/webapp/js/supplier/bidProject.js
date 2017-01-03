//定义一个js对象，以下所有属性和方法全部都设定成Bid对象属性和方法
var Bid = {};
// 服务器地址的根路径
Bid.contextPath = Main.contextPath;
Bid.queryConditionData = null;

/**
 * js所有事件、执行方法的入口
 */
Bid.initPage = function() {
	
	//1、查询默认
	Bid.bidProject_search_btnClick();
	
	//2.查询按钮点击事件
	$("#bidProject_search_btn").bind("click",function(){
		Bid.bidProject_search_btnClick();
	});
	
	//3.招标类型选择事件
	$(".notice li").bind("click", function() {
		$(this).find('a').addClass('orangeColor');
		$(this).siblings().find('a').removeClass('orangeColor');
		$(this).addClass('selNoticType');
		$(this).siblings().removeClass('selNoticType');
	});
};

/**
 * 搜索条件获取
 */
Bid.queryCondition = function(){
	// 1.获取招标类型
	var projectType = $("#projectType_ul>.selNoticType").val();
	// 2.获取行业分类
	var industryFirst = $("#selbaseFirst").val(); // 一级分类
	var industrySecond = $("#selbaseSecond").val(); // 二级分类
	var industryThird = $("#selbaseThird").val(); // 三级分类
	// 3.获取发布时间
	var issuanceStart = $("#issuanceStart").val(); // 发布起始时间
	var issuanceEnd = $("#issuanceEnd").val(); // 发布结束时间
	// 4.获取截止时间
	var closeStart = $("#closeStart").val(); // 截止起始时间
	var closeEnd = $("#closeEnd").val(); // 截止结束时间
	Bid.queryConditionData = {
			"projectType" : projectType,
			"industryFirst" : industryFirst,
			"industrySecond" : industrySecond,
			"industryThird" : industryThird,
			"openBIdStratTime" : issuanceStart,
			"openBidEndTime" : issuanceEnd,
			"closeStart" : closeStart,
			"closeEnd" : closeEnd	
	};
	
	return Bid.queryConditionData;
};

/**
 * 按钮点击事件
 */
Bid.bidProject_search_btnClick = function() {
	var data = Bid.queryCondition();
	if(!data){
		return false;
	}
	Bid.ajaxBidProject(data, 1);
};

/**
 * 条件查询招标项目
 */
Bid.ajaxBidProject = function(data, currentPage) {
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
		url : Bid.contextPath + "/supplier/ajaxBidProject.do",
		datatype : "json",
		data : data,
		success : function(res) {
			$("#pieceNot_div").html("");
			$("#spfocus_span").html("0");
			if (res.success) {
				Bid.queryConditionData = data;
				var list = res.data.noticeList;
				if (list.length == 0) {
					$("#pieceNot_div").append(Bid.tipMsgHtml("没有查询到相关数据!"));
				} else {
					for ( var i = 0; i < list.length; i++) {
						var dlHtml = "<dl class='mesWap'>"
								+ 	"<dt>"
								+ 		"<a href='"+ Bid.contextPath + "/supplier/bidProjectInfo.do' target='_blank'>"
								+		 	"<span class=\"Type1\">招标</span>"
								+ 		 	"<span class=\"comName\">"+list[i].title+"</span>"
								+ 		"</a>"
								+   "</dt>"
								+ 	"<dd>"
								+ 		"<a href='"+ Bid.contextPath + "/supplier/bidProjectInfo.do?tenderProjectId="+list[i].tenderProjectId+"' target='_blank'>"
								+ 			"<span class=\"comName\">"+ list[i].content + "</span>"
								+ 			"<span class=\"w2\">汽车制造业</span>"
								+ 			"<span class=\"w1\">"+ list[i].openBidTime + "</span>"
								+ 			"<span class=\"w1\">还剩<em class=\"orangeColor\">"+list[i].remainTime+"</em>天</span>"
								+ 			"<span class=\"w3\">1我要投标</span>"
								+ 		"</a>"
								+ 	"</dd>"
								+ "</dl>";
						$("#pieceNot_div").append(dlHtml);
					}
				}
				
				Bid.webPages(currentPage, res.data.webPager);
				
			}else{
				$("#pieceNot_div").append(Bid.tipMsgHtml(res.tipMsg));
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
Bid.tipMsgHtml = function(tipMsg){
	var tipMsgHtml = "<dl class='mesWap'>"
			+ 	"<dd>"
			+ 		"<span class='comName'>"+ tipMsg +"</span>"
			+ 	"</dd>"
			+"</dl>";
	return tipMsgHtml;
};

Bid.webPages = function(currentPage, webPager){
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
					  +		'<li><a href="javascript:void(0)" onclick="Bid.webPagesClick(1, '+ currentPage +','+ webPager.totalPages +')" >首页</a></li>'
					  +		'<li><a href="javascript:void(0)" onclick="Bid.webPagesClick('+ (currentPage - 1) +','+ currentPage +',' + webPager.totalPages +')">上一页</a></li>';
		for(var i=0; i < webPager.showPagesList.length; i++){
			if(webPager.showPagesList[i] == currentPage){
				pagesHtml +='<li class="active"><a href="javascript:void(0)">'+ webPager.showPagesList[i] +'</a></li>';
			}else{
				pagesHtml +='<li><a href="javascript:void(0)" onclick="Bid.webPagesClick('+ webPager.showPagesList[i] +',' + currentPage +','+ webPager.totalPages +')">'+ webPager.showPagesList[i] +'</a></li>';
			}
		}
		pagesHtml +=		'<li><a href="javascript:void(0)" onclick="Bid.webPagesClick('+ (currentPage + 1) +',' + currentPage +','+ webPager.totalPages +')">下一页</a></li>'
				  +			'<li><a href="javascript:void(0)" onclick="Bid.webPagesClick('+ webPager.totalPages +',' + currentPage +','+ webPager.totalPages +')">尾页</a></li>'
				  +		'</ul>';
		$("#pages_div").html(pagesHtml);
	}
};
/**
 * queryPage要查询的页数
 * currentPage当前页的页数
 * totalPage总页数
 */
Bid.webPagesClick = function(queryPage, currentPage, totalPage){
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
	Bid.ajaxBidProject(Bid.queryConditionData, queryPage);
};

/**
 * 展开伸缩
 */
Bid.saveCh = function (a, b) {
        $(a).parents(".breadUsual").siblings("#" + b).slideToggle();
        $(a).toggleClass("save").html("展开筛选&nbsp;&and;");
        if ($(a).hasClass("save")) {
            $(a).html("展开筛选&nbsp;&and;");
        } else {
            $(a).html("收起筛选&nbsp;&or;");
        }
};