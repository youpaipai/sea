/**
 * 动态新增一个文件上传
 */
function addUpload(wjlx,fileType,disabled,fileSize,fileNumber){
	if(fileSize==null||fileSize==""){
		fileSize="200MB";
	}
	if(fileType==""){
		fileType="*.*";
	}
	
	var buttonClass='';
	if(disabled=="true"){
		buttonClass='disabled';
	}
	if(!fileNumber){
		fileNumber="1";
	}
	
	 $("#uploadify_"+wjlx).uploadify({
	        'id':"uploadify_"+wjlx,
	        //开启调试
	        'debug' : false,
	        //是否自动上传
	        'auto':true,
	        'buttonClass':buttonClass,
	        'disabled':disabled,
	        //超时时间
	        'successTimeout':120,
	        //附带值
	        'formData':'',
	        'progressData':'speed',//speed显示上传速度，percentage显示百分比
	        //flash
	        'swf': base+"/js/jquery.uploadify/uploadify.swf",
	        //不执行默认的onSelect事件
	        'overrideEvents' : ['onDialogClose'],
	        //文件选择后的容器ID
	        'queueID':wjlx+'_Queue',
	        //服务器端脚本使用的文件对象的名称 $_FILES个['upload']
	        'fileObjName':'myFile',
	        //上传处理程序
	        'uploader':base+'/FileOperation/upload.action?wjlx='+wjlx,
	        //浏览按钮的背景图片路径
	       // 'buttonImage':'${pageContext.request.contextPath}/js/jquery.uploadify/uploadify-cancel.png',
	        //浏览按钮的宽度
	        'width':'80',
	        //浏览按钮的高度
	        'height':'24',
	        'lineheight':'14',
	        //expressInstall.swf文件的路径。
	        //'expressInstall':'expressInstall.swf',
	        //在浏览窗口底部的文件类型下拉菜单中显示的文本
	        'fileTypeDesc':'支持的格式：',
	        //允许上传的文件后缀
	       	'fileTypeExts':fileType,
	        //上传文件的大小限制
	        'fileSizeLimit':fileSize,
	        'buttonText' : '选择文件',//浏览按钮
	        //上传数量
	        'queueSizeLimit' : fileNumber,
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
	                    alert("上传的文件数量已经超出系统限制的"+$('#uploadify_'+wjlx).uploadify('settings','queueSizeLimit')+"个文件！");
	                    break;
	                case -110:
	                    alert("文件 ["+file.name+"] 大小超出系统限制的"+$('#uploadify_'+wjlx).uploadify('settings','fileSizeLimit')+"大小！");
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
	           
	        },
	        //上传到服务器，服务器返回相应信息到data里
	        'onUploadSuccess':function(file, data, response){
	        	UploadSuccess(file,data,response);
	        },
	        'onInit':function(){
	        	
	        }
	    });
	
}