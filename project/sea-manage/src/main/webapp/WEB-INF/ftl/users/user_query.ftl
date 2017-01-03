<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/users/users.js"></script>
    <script type="text/javascript">
    	$(function(){
    		Users.initPage();
    	});
    </script>
</head>
<body>	
	<div class="pmainbox">	
		<a href="javascript:void(0)" class="shousuo"><img src="images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> > 招标人</span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="${base }/images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="${base }/images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="${base }/images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="${base }/images/exit.png" alt="" /></li></a>
				</ul>
			</div>
		
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">招标人</p>
				<div class="topdda">
					<span>用户名：</span>
					<input type="text" name="" id="username" value="" />
					<span>手机号：</span>
					<input type="text" name="" id="phone" value="" />
					<span>账户：</span>
					<input type="text" name="" id="staffcode" value="" />
				
					<p class="dicbtn">
						<button class="querybtn" id="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
				<p class="todo"></p>
				<div class="tabbox tentabbtn">
					<!--初始化用户管理页面的按钮  -->
					<#include "../button/button_query.ftl" />
					<button style="margin-left: 16px;" id="addbtn"><img src="${base }/images/add.png" alt="" />添加</button>
					<button id="stopbtn"><img src="${base }/images/9a.png" alt="" />停用</button>
					<button  id="delbtn"><img src="${base }/images/10a.png" alt="" />删除</button>
					<table border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td><input type="checkbox" name="" id="allbtn" value="" /></td>
							<td>用户名</td>
							<td>手机号</td>
							<td>账户</td>
							<td>注册时间</td>
							<td>子账户数</td>
							<td>说明</td>
							<td>操作</td>
						</tr>
					<#if userList??>
						<#list userList as u>	
						<tr style="text-align: center;background-color: #fff;">
							<td><input type="checkbox" name="userid" id="" value="${u.userId }" /></td>
							<td>${u.userName }</td>
							<td>${u.phone }</td>
							<td>ID：${u.staffCode }</td>
							<td>${u.regintime?datetime }</td>
							<td>3 <a href="javascript:void(0)" id="detailbtn" value="">详情</a></td>
							<td>
								<#if u.status==1>
									启用
								<#elseif u.status==2>
									停用
								<#elseif u.status==3>
									锁定
								<#else>
									无效
								</#if>
							</td>
							<td><a href="javascript:Users.ajaxEditUser(${u.userId });" id="editbtn">修改</a> | <a href="javascript:Users.ajaxStartUser(${u.userId });" id="startbtn">启用</a> </td>
						</tr>
					</#list>
				</#if>
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
			<div class="poptip">
				<p class="msg">您有<span> 3 </span>条信息未读！</p>
				<ul>
					<li><a href="javascript:void(0);"><img src="${base }/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="${base }/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="${base }/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
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
            
            $('.prompt1').mouseenter(function(){
            	$('.poptip').show();
            })
          
            $('.poptip').mouseleave(function(){
          		$('.poptip').hide();
            });
            $("#sjld").sjld("#shenfen","#chengshi","#quyu");
		})
	</script>
	<script src="${base}/js/address.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>