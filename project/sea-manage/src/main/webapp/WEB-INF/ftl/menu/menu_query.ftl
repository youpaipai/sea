<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
	<script type="text/javascript" src="${base }/js/menu/menu.js"></script>
	<script type="text/javascript">
    	$(function(){
    		Menu.initPage();
    	});
	 </script>
</head>
<body >
	<div class="pmainbox">
		<a href="javascript:void(0)" class="shousuo"><img src="${base}/images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> > 菜单管理 </span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="${base}/images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="${base}/images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="${base}/images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="${base}/images/exit.png" alt="" /></li></a>
				</ul>
			</div>
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">菜单管理 </p>
				<div class="tabbox tentabbtn">
					<button style="margin-left: 16px;" id="addbtn"><img src="${base}/images/add.png" alt="" />新增角色</button>
					<button id="startbtn"><img src="${base}/images/m-enable.png" alt="" />启用</button>
					<button id="stopbtn"><img src="${base}/images/m-disable.png" alt="" />停用</button>
					<button id="loadbtn"><img src="${base}/images/m-refresh.png" alt="" />刷新</button>
					<table border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td><input type="checkbox" name="" id="allbtn" value="" /></td>
							<td>菜单名称</td>
							<td>父菜单</td>
							<td>链接地址</td>
							<td>创建时间</td>
							<td>状态</td>
							<td>操作</td>
						</tr>
						<#if menuList??>
							<#list menuList as m>
								<tr style="text-align: center;background-color: #fff;">
									<!-- 全选 -->
									<td><input type="checkbox" name="menuid" id="" value="${m.menuId }" /></td>
									<td>${m.menuName}</td>
									<td>
										<#if m.parentId==0>
											${m.parentName }
										<#else>
										    ${m.parentName}
										</#if>
									</td>
									<td>${m.urlPath }</td>
									<td>${m.createTime ?datetime}</td>
									<td>
									<#if m.status==0>
									       启用
								   <#else>
									       无效
								   </#if>
								   </td>
								   <td><a id="editbtn" href="javascript:Menu.ajaxEditMenu(${m.menuId });">修改</a></td>
								</tr>
						</#list>
					  </#if>
					</table>
					  <#if menuList?size==0>
					  	<div>对不起 没有数据信息</div>
					  </#if>
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
			<div class="poptip">
				<p class="msg">您有<span> 3 </span>条信息未读！</p>
				<ul>
					<li><a href="javascript:void(0);"><img src="${base}/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="${base}/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="${base}/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
				</ul>
				<button>全部标为已读</button>
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