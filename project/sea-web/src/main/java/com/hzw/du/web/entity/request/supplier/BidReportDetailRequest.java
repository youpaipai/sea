package com.hzw.du.web.entity.request.supplier;

import com.hzw.du.web.entity.BaseRequest;


public class BidReportDetailRequest extends BaseRequest
{
    //招标项目编号
    private String tenderProjectNum;
    
    //分包编号
    private String subNum;

    public String getTenderProjectNum()
    {
        return tenderProjectNum;
    }

    public void setTenderProjectNum(String tenderProjectNum)
    {
        this.tenderProjectNum = tenderProjectNum;
    }

    public String getSubNum()
    {
        return subNum;
    }

    public void setSubNum(String subNum)
    {
        this.subNum = subNum;
    }
    
    
    
}
