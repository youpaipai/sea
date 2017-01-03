/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础输出参数
 * 文件名称：BaseOutput.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean;

import java.util.List;

import com.hzw.du.biz.bean.param.BaseCommonOutput;

/**
 * 基础输出参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseResponseOutput extends BaseOutput{
    
    protected List<BaseCommonOutput> list;

    /**
     * @return the list
     */
    public List<BaseCommonOutput> getList() {
        return this.list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<BaseCommonOutput> list) {
        this.list = list;
    }

}
