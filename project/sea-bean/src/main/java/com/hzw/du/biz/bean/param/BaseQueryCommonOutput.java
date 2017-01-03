/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础查询功能输出参数
 * 文件名称：BaseQueryCommonInput.java
 * 修改时间：2016年7月26日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.param;

/**
 * 基础查询功能输出参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseQueryCommonOutput extends BaseCommonOutput{
    
    /**
     * 共有多少条记录
     */
    private int totalRows;

    /**
     * @return the totalRows
     */
    public int getTotalRows() {
        return this.totalRows;
    }

    /**
     * @param totalRows the totalRows to set
     */
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }
    
}
