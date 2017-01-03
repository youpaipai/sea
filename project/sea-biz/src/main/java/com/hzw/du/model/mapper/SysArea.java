/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_AREA  地区表， 序列seq_areaid]
 * 文件名称：SysArea.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_AREA  地区表， 序列seq_areaid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysArea extends BaseBean {
    /**
     * AREAID  NUMBER  N           主键id
     */
    private Long areaId;
    
    /**
     * AREANUM VARCHAR2(100)   Y           地区编码
     */
    private String areaNum;
    
    /**
     * AREANAME    VARCHAR2(100)   Y           地区名称
     */
    private String areaName;
    
    /**
     * AREATYPE    NUMBER  Y           地区级别：0 国家 1,省，1市，2区县
     */
    private Integer areaType;
    
    /**
     * PARENTID    NUMBER  Y           父级id
     */
    private Long pareantId;
    
    /**
     * STATUS  NUMBER  Y           状态 0：未删除  1：删除
     */
    private Integer status;

    /**
     * @return the areaId
     */
    public Long getAreaId() {
        return this.areaId;
    }

    /**
     * @param areaId the areaId to set
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * @return the areaNum
     */
    public String getAreaNum() {
        return this.areaNum;
    }

    /**
     * @param areaNum the areaNum to set
     */
    public void setAreaNum(String areaNum) {
        this.areaNum = areaNum;
    }

    /**
     * @return the areaName
     */
    public String getAreaName() {
        return this.areaName;
    }

    /**
     * @param areaName the areaName to set
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * @return the areaType
     */
    public Integer getAreaType() {
        return this.areaType;
    }

    /**
     * @param areaType the areaType to set
     */
    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    /**
     * @return the pareantId
     */
    public Long getPareantId() {
        return this.pareantId;
    }

    /**
     * @param pareantId the pareantId to set
     */
    public void setPareantId(Long pareantId) {
        this.pareantId = pareantId;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
