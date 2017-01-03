<!--装载文件-->
<link href="${base }/plugin/jquery.uploadify/uploadify.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base }/plugin/jquery.uploadify/swfobject.js"></script>
<script type="text/javascript" src="${base }/plugin/jquery.uploadify/jquery.uploadify.js"></script>
<style type="text/css">
	.border0 {
		width:80%;
		line-height:25px;
	}
	.border0 td {
		border:0;
	}
</style>   
<!--ready事件-->
<script type="text/javascript">
	$(function(){
		var fileSize="${fileSize}";
		if(fileSize==null||fileSize==""){
				fileSize="200MB";
		}
		var formart="*.*";
		if("${formart}"!=""){
			formart="${formart}";
		}
		var buttonClass='';
		if("${disabled}"=="true"){
			buttonClass='disabled';
		}
		 $("#uploadify_${wjlx}").uploadify({
			'id':"uploadify_${wjlx}",
			//开启调试
			'debug' : false,
			//是否自动上传
			'auto':true,
			'buttonClass':buttonClass,
			'disabled':'${disabled}',
			//超时时间
			'successTimeout':120,
			//附带值
			'formData':'',
			'progressData':'speed',//speed显示上传速度，percentage显示百分比
			//flash
			'swf': "${base }/plugin/jquery.uploadify/uploadify.swf",
			//不执行默认的onSelect事件
			'overrideEvents' : ['onDialogClose'],
			//文件选择后的容器ID
			'queueID':'${wjlx}_Queue',
			//服务器端脚本使用的文件对象的名称 $_FILES个['upload']
			'fileObjName':'uploadifyFile',
			//上传处理程序
			'uploader':'${base }/upload/uploadFile.do;jsessionid=?wjlx=${wjlx}&isMulti=${isMulti}&fileDir=${fileDir}',
			//浏览按钮的背景图片路径
			// 'buttonImage':'${base }/js/jquery.uploadify/uploadify-cancel.png',
			//浏览按钮的宽度
			'width':'180',
			//浏览按钮的高度
			'height':'24',
			'lineheight':'14',
			//expressInstall.swf文件的路径。
			//'expressInstall':'expressInstall.swf',
			//在浏览窗口底部的文件类型下拉菜单中显示的文本
			'fileTypeDesc':'支持的格式：',
			//允许上传的文件后缀
			'fileTypeExts':formart,
			//上传文件的大小限制
			'fileSizeLimit':fileSize,
			'buttonText' : '选择文件',//浏览按钮
			//上传数量
			//  'queueSizeLimit' : 1,
			'multi' : ${isMulti},
			//每次更新上载的文件的进展
			'onUploadProgress' : function(file, bytesUploaded, bytesTotal, totalBytesUploaded, totalBytesTotal) {
			     //有时候上传进度什么想自己个性化控制，可以利用这个方法
			     //使用方法见官方说明
			},
			//选择上传文件后调用
			'onSelect' : function(file) {
				
			},
			//返回一个错误，选择文件的时候触发
			'onSelectError':function(file, errorCode, errorMsg){
			    switch(errorCode) {
			        case -100:
			            alert("上传的文件数量已经超出系统限制的"+$('#uploadify_${wjlx}').uploadify('settings','queueSizeLimit')+"个文件！");
			            break;
			        case -110:
			            alert("文件 ["+file.name+"] 大小超出系统限制的"+$('#uploadify_${wjlx}').uploadify('settings','fileSizeLimit')+"大小！");
			            break;
			        case -120:
			            alert("文件 ["+file.name+"] 大小异常！");
			            break;
			        case -130:
			            alert("文件 ["+file.name+"] 类型不正确！");
			            break;
			    }
			},
			//检测FLASH失败调用
			'onFallback':function(){
				alert("您未安装FLASH控件，无法上传图片！请安装FLASH控件后再试。");
			},
			//上传到服务器，服务器返回相应信息到data里
			'onUploadSuccess':function(file, data, response){
				UploadSuccess_${wjlx}(data,response,'${wjlx}',${isMulti});
			},
			'onInit':function(){
			}
	    });
	});
	
	function UploadSuccess_${wjlx}(data, response,wjlx,isMulti) {
		var json = jQuery.parseJSON(data); //转换json对象。
		var res = json.data.res;
		if (json.tipMsg == "success") {
			$("#UPLOAD_" + wjlx).val(res.fileId);
			$("#" + wjlx + "_XS").append('<p id="wj_'+res.fileId+'"><a href="${base }/download/downloadFile.do?fileId='
									+ res.fileId +'">'
									+ res.oldFileName
									+ '</a>'
									+ '&nbsp;&nbsp;&nbsp;&nbsp;<a style="cursor:pointer;" onclick="${delFile}(\''
									+ res.fileId + '\',\'' + wjlx + '\','+isMulti+')">删除</a></p>');
		}
		else
		{
			alert(json.tipMsg);
		}
		if(!isMulti) {
			$("#" + wjlx).val(res.fileId);
			$('#uploadify_' + wjlx).uploadify('disable', true);
		}
	}
	function delFileByPathName(fileId, wjlx, isMulti, filePath, fileName) {
		if (!confirm("确定删除该文件吗？")) {
			return;
		}
		$.ajax({
			url : "${base }/upload/deleteFile.do",
			data : {'fileId':fileId},
			type : "POST",
			async : false,
			success : function(data) {
				var json = jQuery.parseJSON(data); //转换json对象。
				if (json.tipMsg == "success") {
					$("#wj_" + fileId).remove();
					if (!isMulti) {
						$('#uploadify_' + wjlx).uploadify('disable', false);
						$('#' + wjlx).val("");
					}
					alert("删除成功");
				} else {
					alert("删除失败");
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("删除失败");
			}
		});
	}
	function delFileById(fileId, wjlx,isMulti) {
		if (!confirm("确定删除该文件吗？")) {
			return;
		}
		$.ajax({
				url : "${base }/upload/deleteFile.do",
				data : {'fileId':fileId},
				type : "POST",
				async : false,
				success : function(data) {
					var json = jQuery.parseJSON(data); //转换json对象。
					if (json.tipMsg == "success") {
						$("#wj_" + fileId).remove();
						if (!isMulti) {
							$('#uploadify_' + wjlx).uploadify(
									'disable', false);
							$('#' + wjlx).val("");
						}
						alert("删除成功");
					}else {
						alert("删除失败");
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("删除失败");
				}
			});
	}
	
	// 重置按钮
	function resetFile(fileId,filePath,fileName,wjlx,isMulti){
		if (!confirm("确定重置吗？")) {
			return;
		}
		$.ajax({
			url : "${base }/upload/deleteFile.do",
			data : {'fileId':fileId},
			type : "POST",
			async : false,
			success : function(data) {
				var json = jQuery.parseJSON(data); //转换json对象。
				if (json.tipMsg == jsonall) {
					$("#wj_" + fileId).remove();
					if(!isMulti){
						$('#uploadify_' + wjlx).uploadify('disable', false);
					 	$('#' + wjlx).val("");
					}
				} else {
					alert("重置失败");
				}
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("重置失败");
			}
		});
	}
</script>
<div id="${wjlx}_Queue" style="width:200px;padding: 0;margin: 0;border: 0;"></div>
<table class="border0" style="margin: 0;padding: 0">
	<tr>
		<td style="width:120px;"><input type="file" name="uploadifyFiles" id="uploadify_${wjlx}" /></td>
	</tr>
</table> 