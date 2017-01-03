<!doctype html>
<html lang="en">
<head>
	
	<title>Document</title>
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
</head>
<body >
<#assign fileId='21' >
	<#if fileId??>
	<div id="downDivFILE_ID">
		<a href="${base }/download/downloadFile.do?fileId=${fileId! }">${fileId! }</a>
		&nbsp;&nbsp;
		<button class="btn btn-sm btn-info" type="button" onclick="WebUtils.againUpload('FILE_ID')">重新上传附件</button>
	</div>
	</#if>
	<div id="fileDivFILE_ID" <#if fileId??>style="display: none;"</#if>>
		<span>文件：</span>
		<input type="hidden" name="FILE_ID" id="UPLOAD_FILE_ID" value="" />
		<#assign wjlx="FILE_ID" />
		<#assign fileSize="10MB" />
		<#assign formart="*.docx;*.doc" />
		<#assign isMulti="false" />
		<#assign disabled="false" />
		<#assign delFile="delFileByPathName" />
		<#assign fileDir="bmfj" />
		<#include "../file/upload.ftl" />
		<span style="padding: 0; margin: 0" id="FILE_ID_XS"></span>
	</div>
				
</body>
</html>