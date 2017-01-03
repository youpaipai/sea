<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
    <title>${ req.title!'' }</title>
    <#include "../common/head.ftl" />
    <script type="text/javascript" src="${base }/js/supplier/bidProject.js?v1=11"></script>
    <script type="text/javascript">
    	$(function(){
    		Bid.initPage();
    	});
    </script>
</head>
<body>

<div class="submain">
<div class="sech-main">
    <div class="sech-top">
    <div class="condNum clearfix">
        <span class="condTitle OneTLeft">招标类型：</span>
        <div class="condMain">
            <ul id="projectType_ul" class="clearfix notice">
                <li value="0" class="selNoticType"><a href="javascript:;" class="rangedata orangeColor">全部</a></li>
                <li value="1"><a href="javascript:;" class="rangedata" >工程类 </a></li>
                <li value="2"><a href="javascript:;" class="rangedata" >货物类</a></li>
                <li value="3"><a href="javascript:;" class="rangedata" >服务类</a></li>
            </ul>
        </div>
    </div>
    <div class="condNum clearfix">
    	<span class="condTitle OneTLeft">行业分类： </span>
	    <div class="condMain">
	        <ul class="clearfix">
	            <li>
	                <select name="" id="selbaseFirst" class="selbase">
	                	<option value="-1">全部</option>
	                    <option value="0">民事类</option>
	                    <option value="1">经济类</option>
	                    <option value="2">刑事行政</option>
	                    <option value="3">涉外类</option>
	                    <option value="4">公司类</option>
	                    <option value="5">其他非诉讼</option>
	
	                </select>
	            </li>
	            <li>
	                <select name="" id="selbaseSecond" class="selbase">
	                	<option value="-1">全部</option>
	                    <option value="0">民事类</option>
	                    <option value="1">经济类</option>
	                    <option value="2">刑事行政</option>
	                    <option value="3">涉外类</option>
	                    <option value="4">公司类</option>
	                    <option value="5">其他非诉讼</option>
	                </select>
	            </li>
	            <li>
	                <select name="" id="selbaseThird" class="selbase">
	                	<option value="-1">全部</option>
	                    <option value="0">民事类</option>
	                    <option value="1">经济类</option>
	                    <option value="2">刑事行政</option>
	                    <option value="3">涉外类</option>
	                    <option value="4">公司类</option>
	                    <option value="5">其他非诉讼</option>
	                </select>
	            </li>
	        </ul>
	    </div>
	</div>
    <div class="condNum clearfix">
      <span class="condTitle OneTLeft">发布时间：</span>
        <div class="condMain">
            <ul class="clearfix">
                <li>
                    <input type="date" name="" id="issuanceStart" class="datebase"/>
                </li>
                <li>至</li>
                <li>
                    <input type="date" name="" id="issuanceEnd" class="datebase"/>
                </li>
            </ul>
        </div>
    </div>
    <div class="condNum clearfix">
      <span class="condTitle OneTLeft">截止时间：</span>
        <div class="condMain">
            <ul class="clearfix">
                <li>
                    <input type="date" name="" id="closeStart" class="datebase"/>
                </li>
                <li>至</li>
                <li>
                    <input type="date" name="" id="closeEnd" class="datebase"/>
                </li>
            </ul>
			<button id="bidProject_search_btn" class="btnsearch">查询</button>
        </div>
    </div>
    </div>
    <div class="breadUsual clearfix">
        <div class="OneTLeft">
            <span>位置：</span>
            <a href="#">首页</a>
            <span class="page">&gt;</span>
            <a href="javascript:;">我要投标</a>
        </div>
        <div class="OneTRight">
            <a class="saveBtn" href="javascript:;" onclick="Bid.saveCh(this,'mesDetail')" >收起筛选&nbsp;∨</a>
        </div>
    </div>
	    <div class="mesDetail" id="mesDetail">
		    <div class="rankWap">
		        <span>小优为您找到相关结果：<span class="spfocus" id="spfocus_span"></span>条</span>
		    </div>
		    <div class="pieceNot" id="pieceNot_div">
		       
		    </div>
		    <div id="pages_div">
			    
		    </div>
        </div>
    </div>
</div>
</div>
</body>
</html>