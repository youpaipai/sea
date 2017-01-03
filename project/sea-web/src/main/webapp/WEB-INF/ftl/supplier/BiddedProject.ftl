<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base}/js/supplier/BiddedProject.js?v1=11"></script>
    <script type="text/javascript">
	    $(function(){
	    	Bidded.initPage();
		});
    </script>
</head>
<body >
		<div class="rightnav">
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">已完成项目</p>
				<div class="topdda">
					<span>项目名称：</span>
					<input type="text" id="projectName"/>
					<span>项目编号：</span>
					<input type="text"id="projectNum"/>
					<span>是否中标：</span>
					<select name="" id="bidStatus" class="state" style="width: 100px !important;">
						<option value="">全部</option>
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
					<p class="dicbtn">
						<button class="querybtn" id="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
				<p class="todo"></p>
				<div class="tabbox tentabbtn">
				<span>小优为您找到相关结果：<span class="spfocus" id="spfocus_span"></span>条</span>
					<table id="myBidProject" border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td>序号</td>
							<td>项目名称</td>
							<td>项目编号</td>
							<td>是否中标</td>
							<td>包号</td>
							<td>操作</td>
						</tr>
					</table>
				</div>
				 <div class="pieceNot" id="pieceNot_div">
		       
		    	 </div>
		    	<div id="pages_div">
	
				</div>
			</div>
		</div>
	<script type="text/javascript">
		$(function(){
			/*隔行变色*/
			var item = $("tr"); 
            for(var i=0;i<item.length;i++){ 
                if(i%2!=0){ 
                    item[i].style.backgroundColor="#F4F8F9"; 
                } 
            } 
            
		});
		
		
	</script>
	<script src="${base}/js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>