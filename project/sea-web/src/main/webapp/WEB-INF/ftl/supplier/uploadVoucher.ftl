<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/supplier/uploadVoucher.js?v1=11"></script>
    <script type="text/javascript">
    	$(function(){
    		upVoucher.initPage();
    	});
    </script>
</head>
<body >
	<div class="bidder-navbox">
		<div class="projectname">
			<p class="biddername">中国农业银行股份有限公司河北省分行营业网点部分建设主材产品入围供应商选择项目</p>
			<p class="biddnum">项目编号：<span id="tenderProjectNum">A-1505A1215</span>币种：<span>人民币</span>总金额：<span>300万</span></p>
		</div>
		<ul class="biddernav">
			<li><a href="javascript:void(0);">项目操作</a>
				<ul>
					<li><a href="javascript:void(0);">项目信息</a></li>
					<li><a href="javascript:void(0);">标段/分包</a></li>
					<li><a href="javascript:void(0);">下载招标文件</a></li>
					<li><a href="javascript:void(0);">我的异议</a></li>
				</ul>
			</li>
			<li class="nav-arrow"><img src="${base}/images/navarrow.png"/></li>
			<li class="active-voucher"><a href="javascript:void(0);">保证金</a>
				<ul>
					<li class="active-voucher1"><a href="javascript:void(0);">上传付费凭证</a></li>
					<li><a href="javascript:void(0);">退还保证金</a></li>
				</ul>
			</li>
			<li class="nav-arrow"><img src="${base}/images/navarrow.png"/></li>
			<li><a href="javascript:void(0);">投标文件</a>
				<ul>
					<li><a href="javascript:void(0);">上传投标文件</a></li>
					<li><a href="javascript:void(0);">解密投标文件情况</a></li>
				</ul>
			</li>
			<li class="nav-arrow"><img src="${base}/images/navarrow.png"/></li>
			<li><a href="javascript:void(0);">开标</a>
				<ul>
					<li><a href="javascript:void(0);">签到情况</a></li>
					<li><a href="javascript:void(0);">投标信息</a></li>
				</ul>
			</li>
			<li class="nav-arrow"><img src="${base}/images/navarrow.png"/></li>
			<li><a href="javascript:void(0);">评标</a>
				<ul>
					<li><a href="javascript:void(0);">我的评标报告</a></li>
				</ul>
			</li>
			<li class="nav-arrow"><img src="${base}/images/navarrow.png"/></li>
			<li><a href="javascript:void(0);">中标结果</a>
				<ul>
					<li><a href="javascript:void(0);">中标人/候选人</a></li>
					<li><a href="javascript:void(0);">中标公告</a></li>
					<li><a href="javascript:void(0);">中标结果通知书</a></li>
				</ul>
			</li>
		</ul>
		<div class="paylocation">
			<p>当前位置：保证金 > <a href="javascript:void(0);">上传付费凭证</a></p>
		</div>
		<div class="paymentbox">
			<p class="paymentboxp">上传付费凭证</p>
			<div class="leftpay">
				<ul>
					<li class="activevv"><span></span>上传付费凭证</li>
					<li><span></span>下载招标文件</li>
					<li><span></span>上传投标文件</li>
					<li><span></span>我的评估报告</li>
					<li><span></span>中标结果</li>
				</ul>
				<div class="bfbd">
					<#if fileId??>
					<div id="downDivFILE_ID">
						<a href="${base }/download/downloadFile.do?fileId=${fileId! }">${fileName! }</a>
						&nbsp;&nbsp;
						<button class="btn btn-sm btn-info" type="button" onclick="WebUtils.againUpload('FILE_ID')">重新上传附件</button>
					</div>
					</#if>
					<span class="filetext">上传投标文件：</span>
					<div id="fileDivFILE_ID" <#if fileId??>style="display: none;"</#if>>
						<input type="hidden" name="TTFILEID" id="UPLOAD_FILE_ID" value="" />
						<#assign wjlx="FILE_ID" />
						<#assign fileSize="10MB"/>
						<#assign formart="*.docx;*.doc;*.zip" />
						<#assign isMulti="false" />
						<#assign disabled="false" />
						<#assign delFile="delFileByPathName" />
						<#assign fileDir="bmfj" />
						<#include "../file/upload.ftl" />
						<span style="padding: 0; margin: 0" id="FILE_ID_XS"></span>
					</div>
					<button type="button" style="margin-top:50px;" id="btnSubmit">提交</button>
				</div>
			</div>
		</div>
	</div>
	<script src="${base}/js/commen.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>