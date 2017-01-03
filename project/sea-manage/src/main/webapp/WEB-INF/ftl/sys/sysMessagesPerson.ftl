<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=11"></script>
</head>
<body >
	
	<!--选择接收人-->
		<div class="reminder dictionarybox">
				<p class="todo">选择接收人</p>
				<div class="topdda">
					<span>所属机构：</span>
					<input type="text" name="" id="" value="" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<span>姓名：</span>
					<input type="text" name="" id="" value="" />
					<p class="dicbtn">
						<button class="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
		
			<div class="reminder dictionarybox">
				<p class="todo">接收人列表</p>
				<div class="tabbox">
					<table border="0" class="dicttab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center; BACKGROUND-COLOR: #fff; font-weight: bold">
							<td><input type="checkbox"/></td>
							<td>ID</td>
							<td>姓名</td>
							<td>所属机构</td>
						</tr>
						
						<tr style="text-align: center; BACKGROUND-COLOR: #fff; font-weight: bold">
							<td><input type="checkbox"/></td>
							<td>1</td>
							<td>咨询处</td>
							<td>admin</td>
						</tr>
						
					</table>
				</div>
					<p class="dicbtn addedbtn">
						<button class="querybtn" onclick="">提交</button>
						<button onclick="javascript:self.close();">返回</button>
					</p>
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
	<script src="../js/address.js" type="text/javascript" charset="utf-8"></script>
	<script src="../js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>