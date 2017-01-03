<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=11"></script>
</head>
<body >

<!--添加帮助消息-->
		<div class="reminder dictionarybox">
				<div class="topdda">
				<p class="todo">帮助信息</p>
				<div class="topdda" >
					<span>帮助标题：</span>
					<input type="text" name="" id="" value="">
					<br><br>
					<span>帮助分类：</span>
						<select name="">
						<option value="0">请选择</option>
						<option value="1">帮助分类</option>
						<option value="2">帮助分类</option>
					</select>
						<br><br>
					<p class="remarks">
						<span style="margin-left:-16px;">帮助内容：</span>
						<textarea name="" rows="10" cols="60"></textarea>
					</p>
					<br><br>
					<span>说明附件：</span>
					<input type="file" name=""  onchange="" >
				</div>
				<p class="dicbtn addedbtn">
					<button class="querybtn">提交</button>
					<button onclick="javascript:self.close();">返回</button>
				</p>
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
		})
	</script>
	<script src="../js/address.js" type="text/javascript" charset="utf-8"></script>
	<script src="../js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>