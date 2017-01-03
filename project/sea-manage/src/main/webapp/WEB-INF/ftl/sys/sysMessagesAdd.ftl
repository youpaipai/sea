<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/home/login.js?v1=11"></script>
</head>
<body >

<!--系统消息的发布（仅后台管理员可以）-->
		
		<div class="reminder dictionarybox">
				<p class="todo">发布消息</p>
				<div class="topdda">
					<span>标题：&nbsp;&nbsp;&nbsp;</span>
					<input type="text" name="title" id="" value=""  />
					<br><br>
					<p class="remarks">
					<span style="margin-left:-20px;">接收人：</span>
					<textarea name="" rows="3" cols="54" readonly="readonly">{传参接收人信息}</textarea>
					</p>
					<p style="margin-left:370px;">
					<button onclick="javascript:window.open('toaddPersonPage.do','','height=800,width=1500')">选择接收人</button>
					</p>
					<br>
					<p class="remarks">
						<span style="margin-left:-16px;">内容：</span>&nbsp;&nbsp;
						<textarea name="remark" rows="10" cols="54"></textarea>
					</p>
					
				</div>
				<p class="dicbtn addedbtn">
					<button class="querybtn" onclick="">提交</button>
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