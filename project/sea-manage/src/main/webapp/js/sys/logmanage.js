//定义一个js对象，以下所有属性和方法全部都设定成Log对象属性和方法
var LogManage = {};
//服务器地址的根路径
LogManage.contextPath = Main.contextPath;
//分页查询条件
LogManage.queryConditionData = null;

LogManage.initPage = function(){
	LogManage.query_log_btnClick();
	//查询click事件
	$("#query_log_btn").bind("click", function(){
		var startTime = $("#startTime").val();
		var endTime = $("#endTime").val();
		if(endTime<startTime){
			alert("结束时间不能大于起始时间!");
			return;
		}
		LogManage.query_log_btnClick();
	});
};

	//查询条件
	LogManage.queryCondition = function(){
		var logType = $("#logType").val();
		var roleName = $("#roleName").val();
		var startTime = $("#startTime").val();
		var endTime = $("#endTime").val();
		var data = {
			logType : logType , 
			roleName : roleName , 
			startTime:startTime , 
			endTime:endTime
		};
		return data;
	};
	//查询click事件方法
	LogManage.query_log_btnClick = function(){
		var data = LogManage.queryCondition();
		if(!data){
			return false;
		}
		LogManage.ajaxFindLog(data, 1);
	};

	//日志消息条件查询click事件ajax请求
	LogManage.ajaxFindLog = function(data, currentPage){
		if(!data){
			return false;
		}
		$("#logListTAb").html("");
		if(currentPage <= 0){
			currentPage = 1;
		}
		data.currentPage = currentPage;
	$.ajax({
		type : "POST",
		url : LogManage.contextPath + "/logManage/ajaxFindLog.do",
		datatype : "json",
		data :  data,
		success : function(res){
			try{
				var thHtml = "<tr style=\"text-align: center; BACKGROUND-COLOR: #fff;  font-weight: bold\">"
							  +			"<td>操作时间</td>"
							  +			"<td>日志类型</td>"
							  +			"<td>角色</td>"
							  +			"<td>操作人名称</td>"
							  +			"<td>操作IP</td>"
							  +			"<td>操作</td>"
							  + 	"</tr>";
				$("#logListTAb").html(thHtml);
				if(res.success){
					LogManage.queryConditionData = data;
					var logList = res.data.logList;
					var trHtml = "";
					if(logList && logList.length > 0){
						var backgroundColor = "";
						for(var i =0; i< logList.length; i++){
							var item = logList[i];
							if(i%2 == 0){
								backgroundColor = "#F4F8F9";
							}else{
								backgroundColor = "#fff;";
							}
							var logType="";
							if(item.logType==0){
								logType="登陆日志";
							}else if(item.logType==1){
								logType="系统日志";
							}else if(item.logType==2){
								logType="业务日志";
							}else if(item.logType==3){
								logType="开评标日志";
							}else if(item.logType==4){
								logType="门户日志";
							}
							trHtml += "<tr style=\"text-align: center; BACKGROUND-COLOR: "+ backgroundColor +";\">"
										  +			"<td>"+new Date(item.operateTime).format("yyyy-MM-dd")+"</td>"
										  +			"<td>"+logType+"</td>"
										  +			"<td>"+item.roleName+"</td>"
										  +			"<td>"+item.operator+"</td>"
										  +			"<td>"+item.ipaddr+"</td>"
										  +			"<td>" 
										  //+ 					"<a href=\"javascript:window.open('toLogDetailPage.do?logId="+ item.logId +"','height=800,width=1500')\">查看</a>" 
										  + 					"<a href='javascript:;' onclick='LogManage.ajaxLogDetail("+ item.logId +" )'>查看</a>" 
										  + 			"</td>"
										  +	"</tr>";
						}
					}else{
						trHtml += "<tr><td colspan='7' style='text-align:center;BACKGROUND-COLOR: #fff;'>暂无数据</td></tr>";
					}
					$("#logListTAb").append(trHtml);
					LogManage.webPages(currentPage, res.data.webPager);
				}else{
					WebUtils.alert(res.tipMsg);
				}
			}catch(e){
				WebUtils.alert(e);
			}
		},
		error : function(e){
			WebUtils.alert(e.message );
		}
	});
	
	//分页
	LogManage.webPages = function(currentPage, webPager){
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
		$("#spfocus_span").html(webPager.totalPages);
		if(webPager.totalPages > 0){
			var pagesHtml = ''
				//'<p class="common" style="float:left;margin-left:20px">共<span>'+ webPager.totalPages +'</span>条记录</p>'
						  +	'<ul class="dicpage" style="width:35%">'
						  +		'<li><a href="javascript:void(0)" onclick="LogManage.webPagesClick(1, '+ currentPage +','+ webPager.totalPages +')" >首页</a></li>'
						  +		'<li><a href="javascript:void(0)" onclick="LogManage.webPagesClick('+ (currentPage - 1) +','+ currentPage +',' + webPager.totalPages +')">上一页</a></li>';
			for(var i=0; i < webPager.showPagesList.length; i++){
				if(webPager.showPagesList[i] == currentPage){
					pagesHtml +='<li class="active"><a href="javascript:void(0)">'+ webPager.showPagesList[i] +'</a></li>';
				}else{
					pagesHtml +='<li><a href="javascript:void(0)" onclick="LogManage.webPagesClick('+ webPager.showPagesList[i] +',' + currentPage +','+ webPager.totalPages +')">'+ webPager.showPagesList[i] +'</a></li>';
				}
			}
			pagesHtml +=		'<li><a href="javascript:void(0)" onclick="LogManage.webPagesClick('+ (currentPage + 1) +',' + currentPage +','+ webPager.totalPages +')">下一页</a></li>'
					  +			'<li><a href="javascript:void(0)" onclick="LogManage.webPagesClick('+ webPager.totalPages +',' + currentPage +','+ webPager.totalPages +')">尾页</a></li>'
					  +		'</ul>';
			$("#pages_div").html(pagesHtml);
		}
	};
	/**
	 * queryPage要查询的页数
	 * currentPage当前页的页数
	 * totalPage总页数
	 */
	LogManage.webPagesClick = function(queryPage, currentPage, totalPage){
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
		LogManage.ajaxFindLog(LogManage.queryConditionData, queryPage);
	};
	
	LogManage.ajaxLogDetail = function(logId){
		$.ajax({
			type : "POST",
			url : LogManage.contextPath + "/logManage/toLogDetailPage.do",
			data :  {logId : logId},
			success :  function(html) {
				//页面层
				layer.open({
				  type: 1,
				  skin: 'layui-layer-rim', //加上边框
				  area: ['1200px', '600px'], //宽高
				  content:  html
				});
			}
		});
		
	};
	
};