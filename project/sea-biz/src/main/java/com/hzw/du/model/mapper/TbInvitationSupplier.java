/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[TB_INVITATION_SUPPLIER 投标邀请书关系表]
 * 文件名称：TbInvitationSupplier.java
 * 修改时间：2016年7月21日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [TB_INVITATION_SUPPLIER 投标邀请书关系表]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class TbInvitationSupplier extends BaseBean {
    
    /**
     * STANDARDID  NUMBER  Y           参标供应商ID
     */
    private Long standardId;
    
    /**
     * INVITATIONID    NUMBER  Y           投标邀请书ID
     */
    private Long invitationId;

    /**
     * @return the standardId
     */
    public Long getStandardId() {
        return this.standardId;
    }

    /**
     * @param standardId the standardId to set
     */
    public void setStandardId(Long standardId) {
        this.standardId = standardId;
    }

    /**
     * @return the invitationId
     */
    public Long getInvitationId() {
        return this.invitationId;
    }

    /**
     * @param invitationId the invitationId to set
     */
    public void setInvitationId(Long invitationId) {
        this.invitationId = invitationId;
    }

}
