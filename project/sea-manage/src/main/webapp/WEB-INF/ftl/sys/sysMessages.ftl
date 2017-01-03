<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=11"></script>
</head>
<body >
	<div class="pcenter">
		<div class="log"><a href="javascript:void(0)"><img src="../images/logo01.png"/></a>
			<div class="ptime">
				<p style="text-align: right;margin-bottom: 5px;"><img src="../images/tx.png" alt="" />欢迎您，<span>供应商用户</span> </p>
				<p>今天是：2016-06-30 10:39 周四</p>
			</div>
		</div>
	</div>
	<div class="pmainbox">
		<div class="leftnav">
			<div>
				<img src="../images/admin.png" alt="" />
				<p>qqnicheng</p>
			</div>
			<ul>
				<a href="javascrip:void(0);" class="set1">
					<li><img src="../images/1.png"/><span>基础管理<img src="../images/arrowd.png" alt=""  class="rarrow"/></span>
						<ul>
							<a href="javascrip:void(0);" class="set1-1"><li><img src="../images/2.png" alt="" />数据字典</li></a>
							<a href="javascrip:void(0);" class="set1-2"><li><img src="../images/3.png" alt="" />角色管理</li></a>
							<a href="javascrip:void(0);" class="set1-3"><li><img src="../images/4.png" alt="" />权限管理</li></a>
							<a href="javascrip:void(0);" class="set1-4"><li><img src="../images/5.png" alt="" />菜单管理</li></a>
						</ul>
					</li>
				</a>
				<a href="javascrip:void(0);" class="set2">
					<li><img src="../images/6.png"/><span>用户管理<img src="../images/arrowd.png" alt=""  class="rarrow"/></span>
						<ul>
							<a href="javascrip:void(0);" class="set2-1"><li><img src="../images/7.png" alt="" />系统管理员</li></a>
							<a href="javascrip:void(0);" class="set2-2"><li><img src="../images/8.png" alt="" />代理机构</li></a>
							<a href="javascrip:void(0);" class="set2-3"><li><img src="../images/9-1.png" alt="" />招标人</li></a>
							<a href="javascrip:void(0);" class="set2-4"><li><img src="../images/10.png" alt="" />供应商</li></a>
							<a href="javascrip:void(0);" class="set2-5"><li><img src="../images/11.png" alt="" />专家</li></a>
							<a href="javascrip:void(0);" class="set2-6"><li><img src="../images/12.png" alt="" />监管机构</li></a>
							<a href="javascrip:void(0);" class="set2-7"><li><img src="../images/13.png" alt="" />信息员</li></a>
						</ul>
					</li>
				</a>
				<a href="javascrip:void(0);" class="set3">
					<li><img src="../images/14.png"/><span>个人中心<img src="../images/arrowd.png" alt=""  class="rarrow"/></span>
						<ul>
							<a href="javascrip:void(0);" class="set3-1"><li><img src="../images/15.png" alt="" />密码修改</li></a>
							<a href="javascrip:void(0);" class="set3-2"><li><img src="../images/16.png" alt="" />个人信息</li></a>
							<a href="javascrip:void(0);" class="set3-3"><li><img src="../images/17.png" alt="" />安全退出</li></a>
						</ul>
					</li>
				</a>
			</ul>
		</div>
		<a href="javascript:void(0)" class="shousuo"><img src="../images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> > 系统消息</span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="../images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="../images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="../images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="../images/exit.png" alt="" /></li></a>
				</ul>
			</div>
	
		<!--系统消息的查询显示-->
		
			<div class="reminder dictionarybox">
				<p class="todo">系统消息</p>
				<div class="topdda">
					<span>标题：</span>
					<input type="text" name="" id="" value="" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<span>发布时间：</span>
					<input type="text" name="" id="" value="等待时间插件替换" />
					<p class="dicbtn">
						<button class="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
				<div class="tabbox tentabbtn">
				<!-- 打开新增页面 -->
				<button style="margin-left: 16px;" onclick="javascript:window.open('toaddMessagesPage.do','','height=800,width=1500')""><img src="../images/add.png" alt="" />发布系统消息</button>
				<p class="todo"></p>
					<table border="0" class="dicttab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center; BACKGROUND-COLOR: #fff; font-weight: bold">
							<td>ID</td>
							<td>标题</td>
							<td>创建人</td>
							<td>发布时间</td>
							<td>操作</td>	
						</tr>
						
						<#if SysMessagesList ?size gt 0 >
						<#list SysMessagesList as messages>
							<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
								<td>${messages.id}</td>
								<td>${messages.title}</td>
								<td>${messages.create}</td>
								<td>${messages.date}</td>
								<td><a href="javascript:window.open('toMessagesDetailPage.do','','height=600,width=1300')"">查看</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">删除</a></td>
							</tr>
						</#list>
						<#else>
							<tr><td collspan="5">暂无数据</td></tr>
						</#if>
						
					</table>
				</div>
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
					<li><a href="javascript:void(0);"><img src="../images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="../images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="../images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
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
	<script src="../js/address.js" type="text/javascript" charset="utf-8"></script>
	<script src="../js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>