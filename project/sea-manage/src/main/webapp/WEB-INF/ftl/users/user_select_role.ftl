<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/users/user_select_role.js"></script>
    <script type="text/javascript" src="${base }/js/tree/jquery.ztree.core-3.5.min.js"></script>
   <script type="text/javascript" src="${base }/js/tree/jquery.ztree.excheck-3.5.js"></script> 
    <script type="text/javascript">
    	$(function(){
    		UserSelectRole.initPage();
    	});
    </script>
</head>
<body>	
		<input type="hidden" name="op" id="op" value="${op}" />
		<input type="hidden" name="userId" id="userId" value="${userId }"/>
		<input type="hidden" name="type" id="type" value="${type }"/>
		<div style="">
		  <ul id="tree" class="ztree">
		  </ul>
		  <input type="hidden" value="" id="selectIds">
		  <#if showButton==true>
			 <input name="df" type="button" class="myBtn"  id ="savebtn" value="保存"> 
			 <input type="button" value="关闭"  onclick="closeWindow();" />
		  </#if>
	   </div>
</body>

</html>