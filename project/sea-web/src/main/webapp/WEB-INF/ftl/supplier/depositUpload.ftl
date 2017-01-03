<!doctype html>
<html lang="en">
<head>
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
</head>
<body >
	<div class="pmainbox">
		<div class="rightnav">
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">保证金上传</p>
				<div class="topdda margin">
					<span>项目名称：</span>
					<input type="text" name="" id="projectNmae" value="" />
					<span>项目编号：</span>
					<input type="text" name="" id="projectNum" value="" />
					<span>是否上传：</span>
					<select id="uploadFlag">
						<option>全部</option>
						<option>是</option>
						<option>否</option>
					</select>
					<p class="dicbtn">
						<button class="querybtn">查询</button>
						<button>重置</button>
					</p>
				</div>
				<p class="todo"></p>
				<div class="tabbox tentabbtn">
					<p class="unitofvalue">金额单位：<span>元</span></p>
					<table border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td>项目名称</td>
							<td>项目编号</td>
							<td>包号</td>
							<td>上传凭证时间</td>
							<td>操作</td>
						</tr>
						<tr style="text-align: center;background-color: #fff;">
							<td>ceshimingzi</td>
							<td>15999999999</td>
							<td>第1包第2包</td>
							<td>2016-06-30  12:11:12</td>
							<td><a href="javascript:void(0);">详情</a></td>
						</tr>
						<tr style="text-align: center;background-color: #fff;">
							<td>ceshimingzi</td>
							<td>15999999999</td>
							<td>2016-07-10</td>
							<td>第1包第2包</td>
							<td><a href="javascript:void(0);">详情</a></td>
						</tr>
						<tr style="text-align: center;background-color: #fff;">
							<td>ceshimingzi</td>
							<td>15999999999</td>
							<td>2016-07-10</td>
							<td>第1包第2包</td>
							<td><a href="javascript:void(0);">上传</a></td>
						</tr>
						<tr style="text-align: center;background-color: #fff;">
							<td>ceshimingzi</td>
							<td>15999999999</td>
							<td>2016-07-10</td>
							<td>第1包第2包</td>
							<td><a href="javascript:void(0);">上传</a></td>
						</tr>
					</table>
				</div>
				<p class="common">共<span>1256</span>条记录</p>
				<ul class="dicpage">
					<li><a href="javascript:void(0)">首页</a></li>
					<li><a href="javascript:void(0)">上一页</a></li>
					<li class="active"><a href="javascript:void(0)">1</a></li>
					<li><a href="javascript:void(0)">2</a></li>
					<li><a href="javascript:void(0)">3</a></li>
					<li><a href="javascript:void(0)">4</a></li>
					<li><a href="javascript:void(0)">5....</a></li>
					<li><a href="javascript:void(0)">下一页</a></li>
					<li><a href="javascript:void(0)">尾页</a></li>
				</ul>
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
	<script src="js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>