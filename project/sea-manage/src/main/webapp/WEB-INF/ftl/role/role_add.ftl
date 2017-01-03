<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
      <link  rel="stylesheet" type="text/css"  href="${base }/css/zTreeStyle/zTreeStyle.css"/>
     <script type="text/javascript" src="${base }/js/role/role_menu_button.js"></script>
	<script type="text/javascript" src="${base }/js/tree/jquery.ztree.core-3.5.min.js"></script>
	<script type="text/javascript"src="${base }/js/tree/jquery.ztree.excheck-3.5.js"></script>
     
    <script type="text/javascript">
    	$(function(){	
    		RoleMenuButton.initPage();   		
	    });
    </script>
  </head>
<body >
	<div class="pmainbox">
		<a href="javascript:void(0)" class="shousuo"><img src="images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">角色管理</a> > 角色 [ 新增 ] </span>
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
			        <table class="menutable">
				      <#if op=='add'>		
					   <input type="hidden" id="op" value="add"/>
						<tr>
							<td><span>角色名称：</span></td>
							<td><input type="text" name="rolename" id="rolename" value="" class="margin_tr" /></td>			
						
						</tr>
						<tr>
							<td><span>角色类型：</span></td>
							<td>
								<select id="type" name="type" style="width:145px;margin-top:10px;" >
									<option value="-1">请选择</option>
									<option></option>
								</select>
							</td>
						</tr>
						<tr>
							<td><span>角色权限：</span>
								<ul id="tree" class="ztree" style="margin-left:90px;">
								</ul>
								<input type="hidden" value="" id="selectIds">
							</td>
						</tr>
					</#if>
					<!-- 修改 -->				
					<#if op=='edit'>	
						<input type="hidden" id="op" value="edit"/>
						<input type="hidden" id="roleid" value="${r.roleId}"/>
							<tr>
							<td><span>角色名称：<span></span></td>
							<td><input type="text" name="rolename" id="rolename" value="${r.rolename }"  class="margin_tr"/></td>						
						</tr>
						<tr>
							<td><span>角色类型：</span></td>
							<td>
								<select id="type" name="type"   style="width:145px;margin-top:10px;" >
									<option value="" >请选择</option>
									<option></option>
								</select>
							</td>
						</tr>
				    </#if>
				  </table>
				
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