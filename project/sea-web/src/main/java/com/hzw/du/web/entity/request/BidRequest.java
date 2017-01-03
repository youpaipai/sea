/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：BidRequest.java
 * 修改时间：2016-7-25
 * 修改人：王继洋
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.request;

import com.hzw.du.web.entity.BaseRequest;

/**
 * 投标项目请求bean
 * <功能详细描述>
 * @author 王继洋
 * @version V1.0[产品/模块版本]
 */
public class BidRequest extends BaseRequest{
    /**
     * 公告类型 1:招标公告 2:更正公告 3:中标公告 4.中标候选人公示
     */
    private String bidType;

    /**
     *  发布起始时间
     */
    private String openBIdStratTime;

    /**
     * 发布结束时间
     */
    private String openBidEndTime;

    /**
     * 截止时间起始时间
     */
    private String closeStart;

    /**
     * 截止时间结束时间
     */
    private String closeEnd;

    public String getCloseStart() {
        return closeStart;
    }

    public void setCloseStart(String closeStart) {
        this.closeStart = closeStart;
    }

    public String getCloseEnd() {
        return closeEnd;
    }

    public void setCloseEnd(String closeEnd) {
        this.closeEnd = closeEnd;
    }

    public String getOpenBIdStratTime() {
        return openBIdStratTime;
    }

    public void setOpenBIdStratTime(String openBIdStratTime) {
        this.openBIdStratTime = openBIdStratTime;
    }

    public String getOpenBidEndTime() {
        return openBidEndTime;
    }

    public void setOpenBidEndTime(String openBidEndTime) {
        this.openBidEndTime = openBidEndTime;
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType;
    }
}
