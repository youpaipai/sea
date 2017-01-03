<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <link rel="stylesheet" type="text/css" href="${base}/css/tabPane.css"/>
    <script type="text/javascript" src="${base }/js/users/users.js"></script>
    <script type="text/javascript" src="${base}/js/common/tabPane.js"></script>
    <script type="text/javascript">
    	$(function(){
    		Users.initPage();
    		 //处理用户分配权限页面
			$("#menuAndBtn").src="/ctp-manageweb/users/menuAndButtonTree.do";
			var tp = new TabPane("menu");
			tp.addTabPage({title:"用户权限" ,width:100 ,panel:"menuAndBtnDiv"});

	    	});
    </script>
</head>
<body >
	<div class="pmainbox">
		<a href="javascript:void(0)" class="shousuo"><img src="images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> > 招标人 [ 新增 ] </span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="${base }/images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="${base }/images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="${base }/images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="${base }/images/exit.png" alt="" /></li></a>
				</ul>
			</div>
			<div class="reminder dictionarybox tenderbox">
			   <p class="todo">基本信息</p>
			      <div class="topdda">
			        <table>
				      <#if op=='add'>		
					   <input type="hidden" id="op" value="add"/>
						<tr>
							<th><span>用户名：<span></span></th>
							<td><input type="text" name="" id="username" value="" /></td>			
							<th><span>账户：</span></th>
							<td><input type="text" name="" id="staffcode" value="" /></td>
						</tr>
						<tr>
							<th><span >性别：</span></th>
							<td>
							    <input type="radio" class="lock" id="lok"  name="gender" value="0"><label for="lok">男</label>	
							    <input type="radio" class="open" id="opn" name="gender" value="1" checked="checked"><label for="opn" style="margin-right:175px;">女</label>
							</td>
							<th><span>手机号：</span></th>
							<td><input type="text" name="" id="phone" value="" style="margin-top:10px;"/></td>
						</tr>
						<tr>
							<th><span>邮箱：</span></th>
							<td><input type="text" name="" id="email" value="" /></td>
							<th><span>固定电话：</span></th>
							<td><input type="text" name="" id="tel" value="" style="margin-right:70px;"/></td>
						</tr>
						<tr>
							<th><span>证件类型：</span></th>
							<td>	<select name="" class="" id="cardtype" style="margin:10px 80px 0px 0px;;width: auto !important;">
							    <option value="-1">请选择</option>
								<option value="1">啊啊啊啊 </option>
							</select></td>
							<th><span>证件号码：</span></th>
							<td>	<input type="text" name="cardno" id="" value="" style="margin-right:70px;"/></td>
						</tr>
						<tr>
							<th><span>角色：</span></th>
							<td><select name="" class="state" id="rolename" style="margin-right:160px;">
								<option value="-1">请选择</option>
								<option value="1">啊啊啊啊 </option>
							</select></td>
							<th>  <span>组织机构：</span></th>
							<td> <select name="" class="state" style="margin-top:10px;" id="orgname">
								<option value="-1">请选择</option>
								<option value="">啊啊啊啊 </option>
							</select></td>
						</tr>
						<tr>
							<th><span>所属部门：</span></th>
							<td>	<select name="" class="state"  id="deptname">
								<option value="-1">请选择</option>
								<option value="">啊啊啊啊 </option>
							</select></td>
						</tr>
					</#if>
					<!-- 修改 -->				
					<#if op=='edit'>	
						<input type="hidden" id="op" value="edit"/>
							<input type="hidden" id="userid" value="${u.userId }"/>
						<tr>
							<th><span>用户名：<span></span></th>
							<td><input type="text" name="" id="username" value="${u.userName }" /></td>			
							<th><span>账户：</span></th>
							<td><input type="text" name="" id="staffcode" value="${u.staffCode }" /></td>
						</tr>
						<tr>
							<th><span >性别：</span></th>
							<td>
							  <#if u.status==0 >
								<input type="radio" class="lock" id="lok" checked="checked" name="gender" value="0">
								<label for="lok">男</label>
								<input type="radio" class="open" id="opn" name="gender" value="1" >
								<label for="opn" style="margin-right:175px;">女</label>
							</#if>
							<#if u.status==1 >
								<input type="radio" class="lock" id="lok"  name="gender" value="0">
								<label for="lok">男</label>
								<input type="radio" class="open" id="opn" name="gender" checked="checked" value="1" >
								<label for="opn" style="margin-right:175px;">女</label>
						  </#if>
							</td>
							<th><span>手机号：</span></th>
							<td><input type="text" name="" id="phone" value="${u.phone }" style="margin-top:10px;"/></td>
						</tr>
						<tr>
							<th><span>邮箱：</span></th>
							<td><input type="text" name="" id="email" value="" /></td>
							<th><span>固定电话：</span></th>
							<td><input type="text" name="" id="tel" value="" style="margin-right:70px;"/></td>
						</tr>
						<tr>
							<th><span>证件类型：</span></th>
							<td>	<select name="" class="" id="cardtype" style="margin:10px 80px 0px 0px;;width: auto !important;">
							    <option value="-1">请选择</option>
								<option value="1">啊啊啊啊 </option>
							</select></td>
							<th><span>证件号码：</span></th>
							<td>	<input type="text" name="cardno" id="" value="" style="margin-right:70px;"/></td>
						</tr>
						<tr>
							<th><span>角色：</span></th>
							<td><select name="" class="state" id="rolename" style="margin-right:160px;">
								<option value="-1">请选择</option>
								<option value="1">啊啊啊啊 </option>
							</select></td>
							<th>  <span>组织机构：</span></th>
							<td> <select name="" class="state" style="margin-top:10px;" id="orgname">
								<option value="-1">请选择</option>
								<option value="">啊啊啊啊 </option>
							</select></td>
						</tr>
						<tr>
							<th><span>所属部门：</span></th>
							<td>	<select name="" class="state"  id="deptname">
								<option value="-1">请选择</option>
								<option value="">啊啊啊啊 </option>
							</select></td>
						</tr>
				</#if>
						</table>
						<div id="menu" style="width:600px;"></div>
						<!-- 应用菜单按钮里面的权限组功能 -->
						<div id="menuAndBtnDiv" style="padding:8px;">
							 <iframe src="" style="width:95%;height:500" id="menuAndBtn">
					 		</iframe>
						</div>			
					<p class="dicbtn addedbtn">
					<button class="querybtn" id="submitbtn"> 提交</button>
					<button>返回</button>
				</p>		
			</div>
			
			<div class="poptip">
				<p class="msg">您有<span> 3 </span>条信息未读！</p>
				<ul>
					<li><a href="javascript:void(0);"><img src="images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
				</ul>
				<button>全部标为已读</button>
			</div>
		</div>
	</div>
	<script src="${base }/js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>