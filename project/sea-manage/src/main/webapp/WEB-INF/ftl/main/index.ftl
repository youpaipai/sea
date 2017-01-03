<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/main/index.js"></script>
	<script type="text/javascript">
    	$(function(){
    		Index.initPage();
    	});
	 </script>
</head>
<body >
	<div class="pcenter">
		<div class="log"><a href="javascript:void(0)"><img src="${base }/images/logo01.png"/></a>
			<div class="ptime">
				<p style="text-align: right;margin-bottom: 5px;"><img src="${base }/images/tx.png" alt="" />欢迎您，<span>供应商用户</span> </p>
				<p id="totay"></p>
			</div>
		</div>
	</div>
	<div class="pmainbox">
		<div class="leftnav">
			<div>
				<img src="${base }/images/admin.png" alt="" />
				<p>qqnicheng</p>
			</div>
			<ul>		
			<a href="javascrip:void(0);" class="set1">
					<li>
				   <#list menuList as parent>
				      <#if parent.parentId == 0>
					  	<img src="${base }/images/1.png"/><span>${parent.menuName }<img src="${base }/images/arrowd.png" alt=""  class="rarrow"/></span>
					  </#if>
						<ul>
						<#list menuList as child>
							<#if child.parentId==parent.menuId>
								<a href="${child.urlPath }" class="set1-1"><li><img src="${base }/images/2.png" alt="" />${child.menuName }</li></a>
							</#if>
						</#list>
						</ul>
					</#list>
					</li>
				</a>
			</ul>
		</div>	
	</div>
	<script type="text/javascript">	
		function jump(){
        	location.href='added.html';
        }
	</script>
	<script src="${base }/js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>