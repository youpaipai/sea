<#include "../common/main_frame.ftl" />

<#-- head中的公共部分 -->
<#macro headHtml>  
	<title>${ req.title!'' }</title>
</#macro> 

<#-- head中的 css 部分-->
<#macro styleHtml>  
	<style>
		
	</style>
</#macro> 

<#-- head中的 js 部分 -->
<#macro jsHtml>
	<script type="text/javascript">
		
	</script>
</#macro> 

<#-- 当前位置  html -->
<#macro positionHtml> 
	<span class="position">
		<span>当前位置：</span>
		<a href="javascript:void(0);">项目管理 </a> 
		<span>&gt;项目立项</span>
	</span>
</#macro> 

<#-- body中的 html -->
<#macro bodyHtml>  
	
</#macro> 