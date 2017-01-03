<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/users/users.js"></script>
    <script type="text/javascript">
    	$(function(){
    		Users.initPage();
    	});
    </script>
</head>
<body>	
	<div class="pmainbox">	
		<a href="javascript:void(0)" class="shousuo"><img src="images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> > 招标人 [ 子用户列表 ] </span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="images/exit.png" alt="" /></li></a>
				</ul>
			</div>
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">招标人 [ 子用户列表 ] </p>
				<div class="topdda subus">
					<span style="margin: 0px 0px 20px -30px;display: block;">主账号信息：</span>
					<span>用户名：<span>${user.userName}</span></span>
					<span>手机号：<span>${user.phone}</span></span>
					<span>账户：<span>${user.staffCode}</span></span>
					<span>说明：<span>
							<#if user.status==1>
									启用
								<#elseif user.status==2>
									停用
								<#elseif user.status==3>
									锁定
								<#else>
									无效
								</#if>
								</span>
					</span>
				</div>
				<div class="tabbox tentabbtn">
					<table border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td>用户名</td>
							<td>手机号</td>
							<td>账户</td>
							<td>注册时间</td>
							<td>说明</td>
						</tr>
						<#if userChildList??>
						  <#list  userChildList as u>
							<tr style="text-align: center;background-color: #fff;">
								<td>${u.userName}</td>
								<td>${u.phone}</td>
								<td>ID：${u.staffCode }</td>
								<td>${u.regintime?datetime }</td>
								<td>
									<#if u.status==1>
										启用
									<#elseif u.status==2>
										停用
									<#elseif u.status==3>
										锁定
									<#else>
										无效
									</#if>
								</td>
							</tr>
							</#list>
						</#if>
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
			$('.leftnav ul a').click(function(){
				$('.leftnav ul a').css('background-color','#f4f4f4');
				$('.leftnav ul a').find('span').css('color','#95A1A8');
				$('.leftnav ul li ul a').find('li').removeClass('dd');
				$('.leftnav ul li ul a').find('li').css('color','#95A1A8');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
				$('.set3-1').find('li').find('img').attr('src','images/15.png');
				$('.set3-2').find('li').find('img').attr('src','images/16.png');
				$('.set3-3').find('li').find('img').attr('src','images/17.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
				if($(this).next('ul').is(':hidden')){
					$(this).css('background-color','#FF8B00');
					$(this).find('span').css('color','#fff');
					$(this).find('span').find('img').attr('src','images/arrowd.png');
					$(this).next('ul').slideToggle();
				}else{
					$(this).css('background-color','#FF8B00');
					$(this).find('span').css('color','#fff');
					$(this).find('span').find('img').attr('src','images/arrowr.png');
					$(this).next('ul').slideToggle();
				}
			})
			
			$('.leftnav ul li ul a').click(function(){
				$('.set1').find('img:first').attr('src','images/1.png');
				$('.set2').find('img:first').attr('src','images/6.png');
				$('.set3').find('img:first').attr('src','images/14.png');
				$(this).find('li').addClass('dd').parent().siblings().find('li').removeClass('dd');
				$(this).find('li').css('color','#fff').parent().siblings().find('li').css('color','#95A1A8');
			})
			
			$('.set1').click(function(){
				$(this).find('img:first').attr('src','images/1－1.png');
				$('.set2').find('img:first').attr('src','images/6.png');
				$('.set3').find('img:first').attr('src','images/14.png');
			})
			
			$('.set2').click(function(){
				$(this).find('img:first').attr('src','images/6-1.png');
				$('.set1').find('img:first').attr('src','images/1.png');
				$('.set3').find('img:first').attr('src','images/14.png');
			})
			
			$('.set3').click(function(){
				$(this).find('img:first').attr('src','images/14-1.png');
				$('.set1').find('img:first').attr('src','images/1.png');
				$('.set2').find('img:first').attr('src','images/6.png');
			})
			
			$('.set1-1').click(function(){
				$(this).find('li').find('img').attr('src','images/2－1.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
			})
			$('.set1-2').click(function(){
				$(this).find('li').find('img').attr('src','images/3－1.png');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
			})
			$('.set1-3').click(function(){
				$(this).find('li').find('img').attr('src','images/4－1.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
				$('.set1-4').find('li').find('img').attr('src','images/5.png');
			})
			$('.set1-4').click(function(){
				$(this).find('li').find('img').attr('src','images/5-1.png');
				$('.set1-2').find('li').find('img').attr('src','images/3.png');
				$('.set1-3').find('li').find('img').attr('src','images/4.png');
				$('.set1-1').find('li').find('img').attr('src','images/2.png');
			})
			
			$('.set3-1').click(function(){
				$(this).find('li').find('img').attr('src','images/15-1.png');
				$('.set3-2').find('li').find('img').attr('src','images/16.png');
				$('.set3-3').find('li').find('img').attr('src','images/17.png');
			})
			$('.set3-2').click(function(){
				$(this).find('li').find('img').attr('src','images/16-1.png');
				$('.set3-1').find('li').find('img').attr('src','images/15.png');
				$('.set3-3').find('li').find('img').attr('src','images/17.png');
			})
			$('.set3-3').click(function(){
				$(this).find('li').find('img').attr('src','images/17-1.png');
				$('.set3-2').find('li').find('img').attr('src','images/16.png');
				$('.set3-1').find('li').find('img').attr('src','images/15.png');
			})
			
			$('.set2-1').click(function(){
				$(this).find('li').find('img').attr('src','images/7-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-2').click(function(){
				$(this).find('li').find('img').attr('src','images/8-1.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-3').click(function(){
				$(this).find('li').find('img').attr('src','images/9-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-4').click(function(){
				$(this).find('li').find('img').attr('src','images/10-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-5').click(function(){
				$(this).find('li').find('img').attr('src','images/11-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-6').click(function(){
				$(this).find('li').find('img').attr('src','images/12-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
				$('.set2-7').find('li').find('img').attr('src','images/13.png');
			})
			$('.set2-7').click(function(){
				$(this).find('li').find('img').attr('src','images/13-1.png');
				$('.set2-2').find('li').find('img').attr('src','images/8.png');
				$('.set2-3').find('li').find('img').attr('src','images/9.png');
				$('.set2-4').find('li').find('img').attr('src','images/10.png');
				$('.set2-5').find('li').find('img').attr('src','images/11.png');
				$('.set2-6').find('li').find('img').attr('src','images/12.png');
				$('.set2-1').find('li').find('img').attr('src','images/7.png');
			})
			
			$('.shousuo').click(function(){
				if($('.leftnav').is(':visible')){
					$('.leftnav').hide();
					$(this).css('left','0px');
					$(this).find('img').attr('src','images/shou－1.png');
					$('.reminder').css('margin','25px 15px 0px 22px');
				}else{
					$('.leftnav').show();
					$(this).css('left','248px');
					$(this).find('img').attr('src','images/shou.png');
					$('.reminder').css('margin','25px 15px 0px 270px');
				}
				
			})
			
			/*隔行变色*/
			var item = $("tr"); 
            for(var i=0;i<item.length;i++){ 
                if(i%2!=0){ 
                    item[i].style.backgroundColor="#F4F8F9"; 
                } 
            }
            
            $('.prompt1').mouseenter(function(){
            	$('.poptip').show();
            })
          
            $('.poptip').mouseleave(function(){
          		$('.poptip').hide();
            });
		})
	</script>
	<script src="js/address.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(function(){
			$("#sjld").sjld("#shenfen","#chengshi","#quyu");
		});
	</script>
</body>
</html>