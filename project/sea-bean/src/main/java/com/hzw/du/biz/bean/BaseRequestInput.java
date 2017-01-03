/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础输入参数
 * 文件名称：BaseRequestInput.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean;

import java.util.ArrayList;
import java.util.List;

import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 基础输入参数
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseRequestInput extends BaseInput{
    
    /**
     * 支持多个接口同时调用，接口返回也按照调用顺序返回
     */
    protected List<BaseCommonInput> list = new ArrayList<BaseCommonInput>();

    /**
     * @return the list
     */
    public List<BaseCommonInput> getList() {
        return this.list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<BaseCommonInput> list) {
        this.list = list;
    }
}
