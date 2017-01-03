/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_CONFIG  系统配置项表， 序列seq_configid]
 * 文件名称：SysConfig.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_CONFIG  系统配置项表， 序列seq_configid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysConfig extends BaseBean {
    
    /**
     * CONFIGID    VARCHAR2(36)    N           配置编号
     */
    private Long configId;
    
    /**
     * CONFIGKEY   VARCHAR2(500)   Y           配置项名称
     */
    private String configKey;
    
    /**
     * CONFIGVALUE VARCHAR2(500)   Y           配置项值
     */
    private String configValue;
    
    /**
     * CONFIGNAME  VARCHAR2(500)   Y           配置项中文名称
     */
    private String configName;
    
    /**
     * CONFIGNOTE  VARCHAR2(4000)  Y           备注
     */
    private String configNote;
    
    /***
     * DICTID  NUMBER  Y           配置项类别
     */
    private Integer dictId;
    
    /**
     * SHOWTYPE    NUMBER  Y           页面展示类型 0:文本框 1:时间 2:下拉框 3:多选
     */
    private Integer showType;
    
    /**
     * ISLEVEL NUMBER  Y           级别 0:系统级  1:业务级
     */
    private Integer isLevel;
    
    /**
     * PROMPT  NUMBER  Y           提示语配置 
     */
    private Long prompt;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    
    /**
     * STATUS  NUMBER  Y           0:未删除  1：已删除
     */
    private Integer status;

    /**
     * @return the configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @param configId the configId to set
     */
    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    /**
     * @return the configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @param configKey the configKey to set
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    /**
     * @return the configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @param configValue the configValue to set
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * @return the configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @param configName the configName to set
     */
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    /**
     * @return the configNote
     */
    public String getConfigNote() {
        return this.configNote;
    }

    /**
     * @param configNote the configNote to set
     */
    public void setConfigNote(String configNote) {
        this.configNote = configNote;
    }

    /**
     * @return the dictId
     */
    public Integer getDictId() {
        return this.dictId;
    }

    /**
     * @param dictId the dictId to set
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    /**
     * @return the showType
     */
    public Integer getShowType() {
        return this.showType;
    }

    /**
     * @param showType the showType to set
     */
    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    /**
     * @return the isLevel
     */
    public Integer getIsLevel() {
        return this.isLevel;
    }

    /**
     * @param isLevel the isLevel to set
     */
    public void setIsLevel(Integer isLevel) {
        this.isLevel = isLevel;
    }

    /**
     * @return the prompt
     */
    public Long getPrompt() {
        return this.prompt;
    }

    /**
     * @param prompt the prompt to set
     */
    public void setPrompt(Long prompt) {
        this.prompt = prompt;
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
