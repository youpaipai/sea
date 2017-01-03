/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 文件名称：LogManageController.java
 * 修改时间：2016-7-22
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzw.du.biz.bean.param.common.C007LogDetail;
import com.hzw.du.biz.bean.param.common.C007LogInput;
import com.hzw.du.biz.bean.param.common.C007LogOutput;
import com.hzw.du.biz.bean.param.common.C008LogDetail;
import com.hzw.du.biz.bean.param.common.C008LogInput;
import com.hzw.du.biz.bean.param.common.C008LogOutput;
import com.hzw.du.common.date.DateUtil;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.controller.base.BaseController;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.WebPager;
import com.hzw.du.web.entity.request.LogRequest;

/**
 * <一句话功能简述> 日志管理页面
 * <功能详细描述>系统管理员可以查询系统中所有操作的日志信息 代理机构、招标人、供应商等在系统中操作招标投标业务的操作日志信息，通过日志类型的搜索条件去查询。
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
@Controller
@RequestMapping("/logManage")
public class LogManageController extends BaseController{
    
    /**
     * 函数功能描述：查询日志管理
     * @param Model model
     * @return
     */
	@RequestMapping(value="/toLogManagePage")
	public String toLogManagePage(Model model){
	    BaseRequest req = new BaseRequest();
        req.setTitle("日志消息");
        model.addAttribute("req", req);
		return "/sys/sysLog";
	}
	
	/**
	 * 函数功能描述：根据日志类型进行条件查询
	 * @param type
	 * @return
	 */
	@RequestMapping("/ajaxFindLog")
    @ResponseBody
	public BaseResponse ajaxFindLog(LogRequest req){
	    BaseResponse res =new BaseResponse();
	    String tipMsg= null;
		try{
		    //1、参数校验条件设置
		    tipMsg = req.checkAjaxFindLog();
		    C007LogOutput  output =   null;
		    if(StringUtils.isEmpty(tipMsg)){
		        List<String > timeList = new ArrayList<String>();
	            //若开始时间不为空那么加上大于起始时间的查询条件
	            if(!StringUtils.isEmpty(req.getStartTime())){
	                timeList.add("gte," +req.getStartTime());
	            }
	            //若结束时间不为空那么加上小于起始时间的查询条件
	            if(!StringUtils.isEmpty(req.getEndTime())){
	                timeList.add("lte," + req.getEndTime());
	            }
	            
	            //2、设置条件开始查询
	            C007LogInput input = new C007LogInput();
	            input.setRoleName(req.getRoleName());
	            input.setLogType(req.getLogType());
	            input.setOperateTimeList(timeList);
	            //分页条件
	            input.setCurrentPage(req.getCurrentPage());
	            output = baseBiz.querySysLogList(input);
	            
	            //3、创建分页对象
	            WebPager webPager = WebPager.factoryBuilderPager(output.getTotalRows(), req.getCurrentPage());
	          //检查结果是否正确
	            checkOutput(output);
	            res.getData().put("webPager", webPager);
	            res.getData().put("logList",  output.getLogDetailList() );
		    }
		}catch(Exception e){
			processException(res, "查询日志失败", e);
		}
		processAjaxResult(res, tipMsg);
		return res;
	}
	
	
	/**
	 * 
	 * 函数功能描述：根据id查询该日志数据的详细信息
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/toLogDetailPage")
	public String toLogDetailPage(Model model,Integer logId){
	    BaseRequest req = new BaseRequest();
        req.setTitle("日志消息");
        //调用接口：getSysLogById   ||  响应参数：C008LogOutput         ||    请求参数：C008LogInput
        C008LogInput logInput = new C008LogInput();
        logInput.setLogId(Long.parseLong(logId.toString()));
        C008LogOutput  output =   baseBiz.getSysLogById(logInput);
        C008LogDetail logDetail = output.getLogDetail();
        model.addAttribute("logDetail", logDetail );
		model.addAttribute("req", req);
		return "/sys/sysLogDetail";
	}
}
