/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：已投标项目请求bean
 * 文件名称：BiddingRequest.java
 * 修改时间：2016-7-27
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.request.supplier;

/**
 * <一句话功能简述> TODO
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class BiddingRequest
{
    /**
     * 项目名称
     */
    private String projectNum;
    
    /**
     * 项目编号
     */
    private String projectName;

    public String getProjectNum()
    {
        return projectNum;
    }

    public void setProjectNum(String projectNum)
    {
        this.projectNum = projectNum;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }
    
    
}
