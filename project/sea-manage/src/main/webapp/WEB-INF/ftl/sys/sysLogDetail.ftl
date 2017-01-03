<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
</head>
<body >

			<!--日志管理-->
			<div class="reminder">
				<p class="todo">日志详情</p>
				<div class="tabbox logdatail">
					<p>
							<span  class="leftlogname">操作人 ：</span><span>${logDetail.operator!''}</span>
						</p>
						<p>
							<span class="leftlogname">角色 ：</span><span>${logDetail.roleName!''}</span>
						</p>
						<p>
							<span class="leftlogname">IP地址 ：</span><span>${logDetail.ipAddr!''}</span>
						</p>
						<p>
							<span class="leftlogname">操作时间 ：</span><span>${(logDetail.operateTime?string('yyyy-MM-dd'))!''}</span>
						<p>
							<span class="leftlogname">操作菜单 ：</span><span>${logDetail.menuName!''}</span>
						</p>
						<p>
							<span class="leftlogname">操作按钮 ：</span><span>${logDetail.buttonName!''}</span>
						</p>
						<p>
							<span class="leftlogname">接收人 ：</span><span>${logDetail.receiverName!''}</span>
						</p>
						<p>
							<span class="leftlogname">创建人 ：</span><span>${logDetail.createUser!''}</span>
						</p>
						<p>
							<span class="leftlogname">创建时间 ：</span><span>${(logDetail.createTime?string('yyyy-MM-dd'))!''}</span>
						</p>
						<p>
						<#if logDetail.status==0>
							<span class="leftlogname">状态 ：</span><span>未删除</span>
						<#else>
							<span class="leftlogname">状态 ：</span><span>已删除</span>
						</#if>
						</p>
						<p>
							<span class="leftlogname">操作内容 ：</span><span>${logDetail.operateNote!''}</span>
						</p>
						<p>
							<span class="leftlogname">备注 ：</span><span>${logDetail.remark!''}</span>
						</p>

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
	<script src="../js/address.js" type="text/javascript" charset="utf-8"></script>
	<script src="../js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>