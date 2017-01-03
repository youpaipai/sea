/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：保证金list bean
 * 文件名称：DepositBean.java
 * 修改时间：2016-7-27
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.response.supplier;

/**
 * 保证金list 
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class DepositBean
{
    /**
     * 项目名称
     */
    private String projectName;
    
    /**
     * 项目编号
     */
    private String projectNum;
    
    /**
     * 是否完成退款
     */
    private String refund;

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectNum()
    {
        return projectNum;
    }

    public void setProjectNum(String projectNum)
    {
        this.projectNum = projectNum;
    }

    public String getRefund()
    {
        return refund;
    }

    public void setRefund(String refund)
    {
        this.refund = refund;
    }
    
}
