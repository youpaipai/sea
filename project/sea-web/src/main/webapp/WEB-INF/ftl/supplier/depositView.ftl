<!doctype html>
<html lang="en">
<head>
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
</head>
<body >
	<div class="pmainbox">
		<div class="rightnav">
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">保证金查看</p>
				<div class="topdda margin">
					<span>项目名称：</span>
					<input type="text" name="" id="projectNmae" value="" />
					<span>项目编号：</span>
					<input type="text" name="" id="projectNum" value="" />
					<span>是否完成退款：</span>
					<select name="" id="refund" class="state" style="width: 100px !important;">
						<option value="">全部</option>
						<option value="">已退</option>
						<option value="">未退</option>
					</select>
					<p class="dicbtn">
						<button class="querybtn" id="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
				<p class="todo"></p>
				<div class="tabbox tentabbtn">
					<p class="unitofvalue">金额单位：<span>元</span></p>
					<table id="depositView" border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td>项目名称</td>
							<td>项目编号</td>
							<td>包号</td>
							<td>是否退款</td>
							<td>退款金额</td>
							<td>退款时间</td>
							<td>操作</td>
						</tr>
					</table>
				</div>
				<p class="common">共<span>1256</span>条记录</p>
				<ul class="dicpage">
					<li><a href="javascript:void(0)">首页</a></li>
					<li><a href="javascript:void(0)">上一页</a></li>
					<li class="active"><a href="javascript:void(0)">1</a></li>
					<li><a href="javascript:void(0)">2</a></li>
					<li><a href="javascript:void(0)">3</a></li>
					<li><a href="javascript:void(0)">4</a></li>
					<li><a href="javascript:void(0)">5....</a></li>
					<li><a href="javascript:void(0)">下一页</a></li>
					<li><a href="javascript:void(0)">尾页</a></li>
				</ul>
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
            
		})
		
	</script>
</body>
</html>