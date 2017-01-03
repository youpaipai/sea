<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<meta http-equiv = "X-UA-Compatible" content = "IE=edge,chrome=1" />
	<meta name="renderer" content="webkit|ie-stand|ie-comp">
	
	<@headHtml />
	
	<link rel="stylesheet" type="text/css" href="${base}/css/style.css??v=${ req.version!'' }"/>
	
	<@styleHtml />
	
	<!-- JQuery -->
	<script type="text/javascript" src="${base}/js/plugin/jquery/jquery.min.js?v=${ req.version!'' }"></script>
	<script type="text/javascript" src="${base}/plugin/layer/layer.js?v=${ req.version!'' }"></script>
	<script type="text/javascript">
		var Main = {};
		Main.contextPath = "${base}";
	</script>
	<!-- 系统自定义公共方法 -->
	<script type="text/javascript" src="${base}/js/webUtils.js?v=${ req.version!'' }"></script>
	<script type="text/javascript" src="${base}/js/web/common/mainFrame.js?v=${ req.version!'' }"></script>
	<script type="text/javascript">
		MainFrame.initPageOnlyPro();
	</script>
	
	<@jsHtml />
	
</head>
<body >
	<div class="pcenter">
		<div class="log">
			<a href="javascript:void(0)">
				<img src="${base }/images/logo01.png"/>
				<span>业务系统</span>
			</a>
			<div class="ptime">
				<p style="text-align: right;margin-bottom: 5px;">
					<img src="${base }/images/tx.png" alt="" />欢迎您，
					<span><#if req.userName??>${ req.userName!'' }</#if></span> 
				</p>
				<p>今天是：2016-06-30 10:39 周四</p>
			</div>
		</div>
	</div>
	<div class="pmainbox">
		<div class="leftnav">
			<div>
				<img src="${base }/images/admin.png" alt="" />
				<p>首页</p>
			</div>
			<ul>
				<a href="javascrip:void(0);" class="set1">
					<li><img src="${base }/images/1.png"/><span>项目管理<img src="${base }/images/arrowr.png" alt=""  class="rarrow"/></span>
						<ul>
							<a href="javascript:void(0);" class="set1-1b"><li><img src="${base }/images/13.png" alt="" />项目立项</li></a>
							<a href="javascript:void(0);" class="set1-2b"><li><img src="${base }/images/3.png" alt="" />标段管理</li></a>
							<a href="javascript:void(0);" class="set1-3b"><li><img src="${base }/images/4.png" alt="" />正在执行项目</li></a>
							<a href="javascript:void(0);" class="set1-4b"><li><img src="${base }/images/m-disable.png" alt="" />已暂停项目</li></a>
							<a href="javascript:void(0);" class="set1-5b"><li><img src="${base }/images/alarm.png" alt="" />已到期项目</li></a>
						</ul>
					</li>
				</a>
				<a href="javascrip:void(0);" class="set3">
					<li><img src="${base }/images/14.png"/><span>个人中心<img src="${base }/images/arrowr.png" alt=""  class="rarrow"/></span>
						<ul>
							<a href="javascrip:void(0);" class="set3-1b"><li><img src="${base }/images/15.png" alt="" />密码修改</li></a>
							<a href="javascrip:void(0);" class="set3-2b"><li><img src="${base }/images/16.png" alt="" />个人信息</li></a>
							<a href="javascrip:void(0);" class="set3-3b"><li><img src="${base }/images/9.png" alt="" />消息中心</li></a>
							<a href="javascrip:void(0);" class="set3-4b"><li><img src="${base }/images/17.png" alt="" />安全退出</li></a>
						</ul>
					</li>
				</a>
			</ul>
		</div>
		<a href="javascript:void(0)" class="shousuo"><img src="${base }/images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<@positionHtml />
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="${base }/images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="${base }/images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="${base }/images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="${base }/images/exit.png" alt="" /></li></a>
				</ul>
			</div>
			<div>
				<@bodyHtml />
			</div>
			<div class="poptip">
				<p class="msg">您有<span> 3 </span>条信息未读！</p>
				<ul>
					<li><a href="javascript:void(0);"><img src="${base }/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="${base }/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
					<li><a href="javascript:void(0);"><img src="${base }/images/user.png"/><p><span style="color: #FBB321;">招标办一处</span> <span style="float: right;">2小时前</span></p><p>招标马上就要开始了！</p></a></li>
				</ul>
				<button>全部标为已读</button>
			</div>
				
		</div>
	</div>
</body>
</html>