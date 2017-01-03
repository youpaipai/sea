<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=11"></script>
</head>
<body >
	
	<!--系统消息-->
			<div class="reminder">
				<p class="todo">系统消息</p>
				<div class="tabbox">
					<table border="0" class="dicttab" cellpadding="3" cellspacing="1" width="97%" >
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>消息标题 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>消息内容 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>发布时间 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>系统发布 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>接收人 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>创建人 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>创建时间 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>修改人 ：${MessagesDetail.ID}</td>
						</tr>
						<tr style=" BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>修改时间 ：${MessagesDetail.ID}</td>
						</tr>
					</table>
					<p class="dicbtn" style="margin-left:-800px;">
						<button onclick="javascript:self.close();">关闭</button>
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