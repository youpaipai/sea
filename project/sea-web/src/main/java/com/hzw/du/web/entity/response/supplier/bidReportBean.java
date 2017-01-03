/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：我的评标报告list bean
 * 文件名称：bidReportBean.java
 * 修改时间：2016-7-30
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.response.supplier;

/**
 * 我的评标报告
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class bidReportBean
{
    /**
     * 我的报价
     */
   private String myPrice;
   
   /**
    * 报价评分
    */
   private String pirceMark;
   
   /**
    * 商品评分
    */
   private String goodsMark;
   
   /**
    * 总分
    */
   private String sumMark;

    public String getMyPrice()
    {
        return myPrice;
    }
    
    public void setMyPrice(String myPrice)
    {
        this.myPrice = myPrice;
    }
    
    public String getPirceMark()
    {
        return pirceMark;
    }
    
    public void setPirceMark(String pirceMark)
    {
        this.pirceMark = pirceMark;
    }
    
    public String getGoodsMark()
    {
        return goodsMark;
    }
    
    public void setGoodsMark(String goodsMark)
    {
        this.goodsMark = goodsMark;
    }
    
    public String getSumMark()
    {
        return sumMark;
    }
    
    public void setSumMark(String sumMark)
    {
        this.sumMark = sumMark;
    }
   
   
}
