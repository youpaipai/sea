/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
 * 文件名称：SysButton.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_BUTTON  按钮初始表， 序列seq_buttonid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysButton extends BaseBean {
    
    /**
     * BUTTONID    NUMBER  N           按钮ID
     */
    private Long buttonId;
    
    /**
     * BUTTONNAME  VARCHAR2(100)   Y           按钮名称
     */
    private String buttonName;
    /**
     * URL VARCHAR2(100)   Y           图标路径
     */
    private String url;
    
    /**
     * FUNCTIONNAME    VARCHAR2(100)   Y           方法名
     */
    private String functionName;

    /**
     * @return the buttonId
     */
    public Long getButtonId() {
        return this.buttonId;
    }

    /**
     * @param buttonId the buttonId to set
     */
    public void setButtonId(Long buttonId) {
        this.buttonId = buttonId;
    }

    /**
     * @return the buttonName
     */
    public String getButtonName() {
        return this.buttonName;
    }

    /**
     * @param buttonName the buttonName to set
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @param functionName the functionName to set
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
