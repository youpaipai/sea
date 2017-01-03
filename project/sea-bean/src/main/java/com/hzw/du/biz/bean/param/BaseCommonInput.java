/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础输入参数
 * 文件名称：BaseCommonInput.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param;

import com.hzw.du.biz.bean.BaseInput;

/**
 * 基础输入参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseCommonInput extends BaseInput{
    /**
     * 功能编码，列入：Biz_001代表业务系统查询供应商列表
     */
    protected String functionCode;
    
    /**
     * 操作类型，1新增、2修改、3删除
     */
    private String operateType;

    /**
     * @return the functionCode
     */
    public String getFunctionCode() {
        return this.functionCode;
    }

    /**
     * @param functionCode the functionCode to set
     */
    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * @return the operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @param operateType the operateType to set
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }
}
