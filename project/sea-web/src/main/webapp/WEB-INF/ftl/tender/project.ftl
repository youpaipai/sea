<#include "../common/main_frame.ftl" />

<#-- head中的公共部分 -->
<#macro headHtml>  
	<title>${ req.title!'' }</title>
</#macro> 

<#-- head中的 css 部分-->
<#macro styleHtml>  
	<style>
		.dtree {
			font-family: Verdana, Geneva, Arial, Helvetica, sans-serif;
			font-size: 11px;
			color: #666;
			white-space: nowrap;
		}
		.dtree img {
			border: 0px;
			vertical-align: middle !important;
			margin: 0px !important;
		}
		.dtree a {
			color: #333;
			text-decoration: none;
		}
		.dtree a.node, .dtree a.nodeSel {
			white-space: nowrap;
			padding: 1px 2px 1px 2px;
		}
		.dtree a.node:hover, .dtree a.nodeSel:hover {
			color: #333;
			text-decoration: underline;
		}
		.dtree a.nodeSel {
			background-color: #c0d2ec;
		}
		.dtree .clip {
			overflow: hidden;
		}
	</style>
</#macro> 

<#-- head中的 js 部分 -->
<#macro jsHtml>  
	<script src="${base}/js/dtree.js?v=${ req.version!'' }1" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="${base }/js/tender/project.js?v=${ req.version!'' }1"></script>
    <script src="${base }/js/address.js" type="text/javascript" charset="utf-8"></script>
	<script src="${base }/js/jquery.placeholder.min.js" type="text/javascript" charset="utf-8"></script>
	
    <script type="text/javascript">
    	$(function(){
    		Project.initPage();
    	});
    </script>
	<script type="text/javascript">
		$(function(){
			$("#sjld").sjld("#shenfen","#chengshi","#quyu");
			$("#sjld11").sjld("#shenfen1","#chengshi1","#quyu1");
			$('input, textarea').placeholder({customClass:'my-placeholder'});
			
			$('.dropselect').click(function(){
				$('.fsf').show();
				
			})
			
			$('.fsf').mouseleave(function(){
            	if($('.fsf').hasClass('gg')){
            		$('.fsf').show();
            	}else{
            		$('.fsf').hide();
            	}
            })
             
            $('.fsf').hover(function(){
          		$(this).show();
            	$('.fsf').addClass('gg');
            },function(){
            	$('.fsf').removeClass('gg');
            	$(this).hide();
            })
            
            $('.addcontacts').click(function(){
            	$(this).parent().after("<div class=\"topdda project-p client-contact\"><p><span class=\"prohect-pname\" style=\"margin-left: -40px;\">*</span>委托联系人姓名：<input type=\"text\" placeholder=\"请填写真实姓名\" style=\"width: 350px !important;\"></p><p><span class=\"prohect-pname\" style=\"margin-left: 16px;\">*</span>手机号：<input type=\"text\" placeholder=\"请输入真实有效的手机号\" style=\"width: 350px !important;\"></p><p><span class=\"prohect-pname\" style=\"margin-left: 30px;\">*</span>电话：<input type=\"text\" placeholder=\"\" style=\"width: 350px !important;\"></p><p><span class=\"prohect-pname\" style=\"margin-left: 30px;\">*</span>传真：<input type=\"text\" placeholder=\"\" style=\"width: 350px !important;\"></p><p><span class=\"prohect-pname\" style=\"margin-left: 30px;\">*</span>邮箱：<input type=\"email\" placeholder=\"\" style=\"width: 350px !important;\"></p><p><span class=\"prohect-pname\" style=\"margin-left: 2px;\">*</span>委托合同：<input type=\"text\" placeholder=\"\" style=\"width: 350px !important;\"></p><button type=\"button\" style=\"margin: 30px 20px 0px 212px;\" class=\"delecontacts\">+删除此栏</button></div>");
            	$('input, textarea').placeholder({customClass:'my-placeholder'});
            })
            
            $(document).on("click",".delecontacts",function(){
		        $(this).parent().remove();
		    });
           
		})
		 function test(){
				var count = 0;
				var obj = document.all.authority;	
				
				for(i=0;i<obj.length;i++){
					if(obj[i].checked){					
						$("input[name=industry]")[0].value += obj[i].value+='/';
						count ++;				
					}
				}	
			}
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
	<div class="reminder dictionarybox tenderbox">
		<p class="todo">项目信息</p>
		<div class="topdda project-p">
			<p><span class="prohect-pname">*</span>项目名称：
				<input type="text" placeholder="请输入项目名称"  style="width: 350px !important;"/>
				<img src="${base }/images/tip-3.png" alt="" />
			</p>
			<p style="position: relative;"><span class="prohect-pname">*</span>所属行业：
				<input type="text" placeholder="变压器/电脑主机/机械/耗材" name="industry" class="dropselect" style="width: 350px !important;margin-right: -15px !important;" readonly="readonly"/>
				<img src="${base }/images/droparrow.png" alt="" class="drowimg">
			</p>
			<p style="float: left;"><span style="float: left;margin-right: 4px;" class="prohect-pname">*</span>所在地区：
				<div id="sjld" style="width:520px;margin:24px auto;position:relative;">
				<div class="m_zlxg" id="shenfen" >
					<p title="">选择省份</p>
					<div class="m_zlxg2">
						<ul></ul>
					</div>
				</div>
				<div class="m_zlxg" id="chengshi">
					<p title="">选择城市</p>
					<div class="m_zlxg2">
						<ul></ul>
					</div>
				</div>
				<div class="m_zlxg" id="quyu">
					<p title="">选择区域</p>
					<div class="m_zlxg2">
						<ul></ul>
					</div>
				</div>
				<input id="sfdq_num" type="hidden" value="" />
				<input id="csdq_num" type="hidden" value="" />
				<input id="sfdq_tj" type="hidden" value="" />
				<input id="csdq_tj" type="hidden" value="" />
				<input id="qydq_tj" type="hidden" value="" />
			</div>
			</p>
			<p style="clear: both;padding-top: 15px;"><span class="prohect-pname">*</span>资金来源：
				<select name="" class="errortip-border">
					<option value="">请选择</option>
				</select>
				<img src="${base }/images/tip-2.png" alt="" /><span style="color: #FE8A00;vertical-align: middle;">选项不能为空！</span>
			</p>
			<p class="buss-infradio pjp"><span class="prohect-pname">*</span>采购方式：<input type="radio" class="mr" id="mr" checked="checked" name="sex"> <label for="mr">国内</label> <input type="radio" class="ms" id="ms" name="sex"> <label for="ms">国际</label></p>
			<select name="" style="margin-left: 97px;">
				<option value="">公开招标</option>
			</select>
			<p style="margin-left: 45px"><span class="prohect-pname">*</span>币种：
				<select name="">
					<option value="">人民币</option>
				</select>
			</p>
			<p><span class="prohect-pname">*</span>委托金额：
				<input type="text" name="" id="" value="" />（单位：<span class="pjpmoney">万元</span>）
			</p>
			<p class="buss-infradio pjp"><span class="prohect-pname">*</span>招标标准：<input type="radio" class="mr" id="prp" checked="checked" name="mon"> <label for="prp">排名</label> <input type="radio" class="ms" id="pjp" name="mon"> <label for="pjp">价格</label>
				<span style="margin-left: 30px;">前<input type="text" style="margin-left: 10px;margin-right: 10px !important;"/>名</span>
			</p>
			<div class="dtree fsf profsf">
				<script type="text/javascript">
					var d = new dTree('d');
					d.add(0,-1,'主营产品');
					d.add(1,0,'authority','日常工作','日常工作');
					d.add(2,1,'authority','新建工作','新建工作');
					d.add(3,2,'authority','人事','人事 ');
					d.add(4,2,'authority','财务','财务');
					d.add(5,2,'authority','客服','客服');
			        d.add(15,3,'authority','请假申请','请假申请');
					d.add(16,3,'authority','出差申请','出差申请');
					d.add(17,3,'authority','招聘申请','招聘申请');
					
					// dTree实例属性以此为：  节点ID，父类ID，chechbox的名称，chechbox的值，chechbox的显示名称，chechbox是否被选中--默认是不选，chechbox是否可用：默认是可用，节点链接：默认是虚链接
					d.add(6,0,'authority','一级菜单2','一级菜单2 ',false,false);
					d.add(7,6,'authority','二级菜单2','二级菜单2 ',false,false);
					d.add(8,7,'authority','用户管理','用户管理 ',false,false);
					d.add(9,7,'authority','用户组管理','用户组管理 ',false,false);
					
					
					d.add(11,0,'authority','一级菜单3','一级菜单3 ');
					d.add(12,11,'authority','二级菜单3','二级菜单3 ');
					d.add(13,12,'authority','用户管理','用户管理 ');
					d.add(14,12,'authority','用户组管理','用户组管理 ');		
			
					document.write(d);
					
					d.openAll();
				</script>
				<button onclick='test();'>确定选择</button>
			</div>
		</div>
		<p class="todo">委托单位</p>
		<div class="topdda project-p">
			<p><span class="prohect-pname" style="margin-left: -28px;">*</span>委托单位名称：
				<input type="text" placeholder="请输入委托单位名称" style="width: 350px !important;"/>
			</p>
			<p style="float: left;"><span style="float: left;margin-right: 4px;" class="prohect-pname">*</span>所在地区：
				<div id="sjld11" style="width:520px;margin:24px auto;position:relative;">
				<div class="m_zlxg" id="shenfen1" >
					<p title="">选择省份</p>
					<div class="m_zlxg2">
						<ul></ul>
					</div>
				</div>
				<div class="m_zlxg" id="chengshi1">
					<p title="">选择城市</p>
					<div class="m_zlxg2">
						<ul></ul>
					</div>
				</div>
				<div class="m_zlxg" id="quyu1">
					<p title="">选择区域</p>
					<div class="m_zlxg2">
						<ul></ul>
					</div>
				</div>
				<input id="sfdq_num" type="hidden" value="" />
				<input id="csdq_num" type="hidden" value="" />
				<input id="sfdq_tj" type="hidden" value="" />
				<input id="csdq_tj" type="hidden" value="" />
				<input id="qydq_tj" type="hidden" value="" />
			</div>
			</p>
			<p style="position: relative;clear: both;padding-top: 10px;"><span class="prohect-pname" style="margin-left: -28px;">*</span>委托单位地址：
				<input type="text" style="width:350px !important"/>
			</p>
			<p class="buss-infradio pjp"><span class="prohect-pname" style="margin-left: -28px;">*</span>是否为新业主：<input type="radio" class="mr" id="ownerp" checked="checked" name="owner"> <label for="ownerp">是</label> <input type="radio" class="ms" id="ownerp1" name="owner"> <label for="ownerp1">否</label></p>
			<p>
				<span class="prohect-pname">*</span>营业执照：
			</p>
			<p>
				<span class="prohect-pname">*</span>委托合同：
			</p>
		</div>
		<p class="todo">委托单位联系人信息</p>
		<div class="topdda project-p client-contact">
			<p><span class="prohect-pname" style="margin-left: -40px;">*</span>委托联系人姓名：
				<input type="text" placeholder="请填写真实姓名" style="width: 350px !important;"/>
			</p>
			<p><span class="prohect-pname" style="margin-left: 16px;">*</span>手机号：
				<input type="text" placeholder="请输入真是有效的手机号码" style="width: 350px !important;"/>
			</p>
			<p><span class="prohect-pname" style="margin-left: 30px;">*</span>电话：
				<input type="text" placeholder="" style="width: 350px !important;"/>
			</p>
			<p><span class="prohect-pname" style="margin-left: 30px;">*</span>传真：
				<input type="text" placeholder="" style="width: 350px !important;"/>
			</p>
			<p><span class="prohect-pname" style="margin-left: 30px;">*</span>邮箱：
				<input type="email" placeholder="" style="width: 350px !important;"/>
			</p>
			<p><span class="prohect-pname" style="margin-left: 2px;">*</span>委托合同：
				<input type="text" placeholder="" style="width: 350px !important;"/>
			</p>
			<button type="button" class="addcontacts">+新增联系人</button><button type="button" class="delecontacts">+删除此栏</button>
		</div>
		<button type="button" class="pjpcomfit">确认提交</button>
	</div>
</#macro> 