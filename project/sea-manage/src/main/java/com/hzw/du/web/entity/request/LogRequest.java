/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：LogRequest.java
 * 修改时间：2016-7-29
 * 修改人：丁乙宁
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.request;

import java.util.Date;

import com.hzw.du.common.date.DateUtil;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.entity.BaseRequest;

/**
 * <一句话功能简述> 日志管理条件查询请求Bean
 * <功能详细描述>
 * @author 丁乙宁
 * @version V1.0[产品/模块版本]
 */
public class LogRequest extends BaseRequest
{
    private final String DATE_FORMAT_STRING = "yyyyMMddHHmmss";
    //角色
    private String roleName;
    //类型 
    private Integer logType;
    //开始时间
    private String startTime;
    //结束时间
    private String endTime;
    
    public String checkAjaxFindLog(){
        String tipMsg = null;
        Date startDate = null;
        if(!StringUtils.isEmpty(startTime)){
            startDate = DateUtil.StringToDate(startTime);
        }
        Date endDate = null;
        if(!StringUtils.isEmpty(endTime)){
            endDate = DateUtil.StringToDate(endTime);
        }
        if(startDate != null && endDate != null){
            if(startDate.getTime() > endDate.getTime()){
                Date temp = startDate;
                startDate = endDate;
                endDate = temp; 
            }
        }
        if(startDate != null){
            startTime = DateUtil.dateToString(startDate, DATE_FORMAT_STRING);
        }
        
        if(endDate != null){
            endTime = DateUtil.dateToString(endDate, DATE_FORMAT_STRING);
        }
        return tipMsg;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public Integer getLogType()
    {
        return logType;
    }

    public void setLogType(Integer logType)
    {
        this.logType = logType;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

}
