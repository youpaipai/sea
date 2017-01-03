<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=111"></script>
    <script type="text/javascript">

    </script>
</head>
<body >
	<div class="pcenter">
		<div class="log"><a href="javascript:void(0)"><img src="${base}/images/logo01.png"/></a>
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
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> >数据字典</span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="../images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="../images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="../images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="../images/exit.png" alt="" /></li></a>
				</ul>
			</div>
	
				<!--数据字典-->
				<div class="reminder dictionarybox">
				<p class="todo">数据字典</p>
				<div class="topdda">
					<span>字典类型：</span>
					<select name="">
						<option value="">采购方式</option>
						<option value="">采购方式</option>
						<option value="">采购方式</option>
					</select>
					<span>字典Key：</span>
					<input type="text" name="" id="" value="" />
					<p>
						<span>字典值：</span>
						<input type="text" name="" id="" value="" />
					</p>
					<p class="dicbtn">
						<button class="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
				<p class="todo"></p>
				<div class="tabbox">
					<table border="0" class="dicttab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center; BACKGROUND-COLOR: #fff; font-weight: bold">
							<td style="width: 270px;">ID</td>
							<td>字典类型</td>
							<td style="width: 250px;">操作</td>
						</tr>
						<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
							<td>1</td>
							<td>项目分类</td>
							<td><a href="javascript:void(0);">删除</a><a href="javascript:void(0);" class="openandcut"><img src="${base }/images/arrowr.png"/></a></td>
							<tr>
								<td colspan="4" style="padding: 0px;"><table border="0" class="dictsontab" cellpadding="3" cellspacing="0" width="100%" align="center" >
								<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
									<td style="width: 270px;"></td>
									<td>字典key</td>
									<td>字典值</td>
									<td style="width: 250px;"></td>
								</tr>
								<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
									<td></td>
									<td>1</td>
									<td>工程类</td>
									<td><a href="">修改</a>&nbsp;&nbsp;|<a href="">删除</a></td>
								</tr>
								<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
									<td></td>
									<td>2</td>
									<td>货物类</td>
									<td><a href="">修改</a>&nbsp;&nbsp;|<a href="">删除</a></td>
								</tr>
								<tr style="background-color: #fff;"><td style="padding: 0px 0px 6px 0px;" colspan="4"><p class="addrow"><button class="adad">+添加</button></p>	</td></tr>
							</table></td>
							</tr>	
						</tr>
						<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
							<td>2</td>
							<td>行业分类</td>
							<td><a href="javascript:void(0);">删除</a><a href="javascript:void(0);" class="openandcut"><img src="${base }/images/arrowr.png"/></a></td>
							<tr>
								<td colspan="4" style="padding: 0px;"><table border="0" class="dictsontab" cellpadding="3" cellspacing="0" width="100%" align="center" >
								<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
									<td style="width: 270px;"></td>
									<td>字典key</td>
									<td>字典值</td>
									<td style="width: 250px;"></td>
								</tr>
								<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
									<td></td>
									<td>1</td>
									<td>工程类</td>
									<td><a href="">修改</a>&nbsp;&nbsp;|<a href="">删除</a></td>
								</tr>
								<tr style="text-align: center; BACKGROUND-COLOR: #fff;">
									<td></td>
									<td>2</td>
									<td>货物类</td>
									<td><a href="">修改</a>&nbsp;&nbsp;|<a href="">删除</a></td>
								</tr>
								<tr style="background-color: #fff;"><td style="padding: 0px 0px 6px 0px;" colspan="4"><p class="addrow"><button class="adad">+添加</button></p>	</td></tr>
							</table></td>
							</tr>
						</tr>
						<tr style="background-color: #fff;"><td style="padding: 0px 0px 6px 0px;" colspan="4"><p class="addrow1"><button>+新增</button></p>	</td></tr>
					</table>
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
</body>
</html>