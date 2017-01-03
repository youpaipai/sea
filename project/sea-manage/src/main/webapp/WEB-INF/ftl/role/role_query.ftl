<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
	<script type="text/javascript" src="${base }/js/role/role.js"></script>
	<script type="text/javascript">
    	$(function(){
    		Role.initPage();
    	});
	 </script>
</head>
	<div class="pmainbox">
		<a href="javascript:void(0)" class="shousuo"><img src="images/shou.png"/></a>
		<div class="rightnav">
			<div class="pnav">
				<span class="position">当前位置：<a href="javascript:void(0);">用户管理</a> > 角色管理 </span>
				<ul class="righttip">
					<a href="javascript:void(0);" class="prompt1"><li><img src="images/message.png" alt="" /><span class="tip1">8</span></li></a>
					<a href="javascript:void(0);" class="prompt2"><li><img src="images/mail.png" alt="" /><span class="tip2">8</span></li></a>
					<a href="javascript:void(0);" class="prompt3"><li><img src="images/more03.png" alt="" /><span class="tip3">8</span></li></a>
					<a href="javascript:void(0);" title="退出系统"><li><img src="images/exit.png" alt="" /></li></a>
				</ul>
			</div>
			<div class="reminder dictionarybox tenderbox">
				<p class="todo">角色管理 </p>
				<div class="tabbox tentabbtn">
					<button style="margin-left: 16px;" id="addbtn"><img src="${base }/images/add.png" alt="" />新增角色</button>
					<button id="startbtn"><img src="${base}/images/m-enable.png" alt="" />启用</button>
					<button id="stopbtn"><img src="${base}/images/m-disable.png" alt="" />停用</button>
					<table border="0" class="dicttab tendertab" cellpadding="3" cellspacing="1" width="97%" align="center" >
						<tr style="text-align: center;font-weight: bold;background-color: #E6E6E6;">
							<td><input type="checkbox" name="" id="allbtn" value="" /></td>
							<td>角色名</td>
							<td>创建人</td>
							<td>状态</td>
							<td colspan="3">操作</td>
						</tr>
						<#if roleList??>
							<#list roleList as r>
								<tr style="text-align: center;background-color: #fff;">
									<!-- 全选 -->
									<td><input type="checkbox" name="roleid" id="" value="${r.roleId}" /></td>
									<td>${r.roleName }</td>
									<td>${r.createId }</td>
									<td>
									   <#if r.status==0>
										       启用
									   <#else>
										       无效
									   </#if>
								   </td>
									<td><a href="javascript:Role.ajaxEditRole(${r.roleId });">修改</a> </td>
								</tr>
							</#list>
					  </#if>
					</table>
					  <#if roleList?size==0>
					  	<div>对不起 没有数据信息</div>
					  </#if>
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
            
            $('.prompt1').mouseleave(function(){
            	if($('.poptip').hasClass('gg')){
            		$('.poptip').show();
            	}else{
            		$('.poptip').hide();
            	}
            })
             
            $('.poptip').hover(function(){
          		$(this).show();
            	$('.poptip').addClass('gg');
            },function(){
            	$('.poptip').removeClass('gg');
            	$(this).hide();
            })
		})
	</script>

</body>
</html>