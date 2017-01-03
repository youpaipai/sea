/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：基础controller
 * 文件名称：BaseController.java
 * 修改时间：2016-3-7
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.controller.base;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hzw.du.biz.request.BaseBiz;
import com.hzw.du.biz.request.BussinessBiz;
import com.hzw.du.biz.request.ManageBiz;
import com.hzw.du.biz.request.PortalBiz;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.SessionUser;
import com.hzw.du.web.session.SpringApplicationContext;

import ch.qos.logback.classic.Logger;

/**
 * 基础controller
 * 
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public abstract class BaseController {
    protected Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    @Qualifier("bizHttpRequest")
    protected BaseBiz baseBiz;
    
    @Autowired
    @Qualifier("bizHttpRequest")
    protected BussinessBiz bussinessBiz;
    
    @Autowired
    @Qualifier("bizHttpRequest")
    protected ManageBiz manageBiz;
    
    @Autowired
    @Qualifier("bizHttpRequest")
    protected PortalBiz portalBiz;
    
    /**
     * 函数功能描述：获取当前session会话的对象，所有的有关session的 数据都必须保存该对象中，不要保存到httpsession中
     * @return
     */
    protected SessionUser getWebSessionUser(){
        return (SessionUser)SpringApplicationContext.getBean("sessionUser");
    }
    
    /**
     * 
     * 函数功能描述：处理ajax捕获的异常
     * @param res 返回对象
     * @param tipMsg 返回错误提示
     * @param e 异常对象
     */
    protected void processException(BaseResponse res, String tipMsg, Exception e){
        if(StringUtils.isEmpty(tipMsg)){
            if(StringUtils.isEmpty(e.getMessage())){
                tipMsg = "未知错误";
            }else{
                tipMsg = e.getMessage();
            }
        }
        log.error(tipMsg, e);
        
        res.setSuccess(false);
        res.setTipMsg(tipMsg);
    }
    
    /**
     * 
     * 函数功能描述：处理ajax返回结果tipMsg
     * @param res
     * @param tipMsg
     */
    protected void processAjaxResult(BaseResponse res, String tipMsg){
        if(!res.isSuccess()){
            return;
        }
        if(StringUtils.isEmpty(tipMsg)){
            res.setSuccess(true);
            res.setTipMsg(null);
        }else{
            res.setSuccess(false);
            res.setTipMsg(tipMsg);
        }
    }

    /**
     * @return the baseBiz
     */
    public BaseBiz getBaseBiz() {
        return this.baseBiz;
    }
    /**
     * @param baseBiz the baseBiz to set
     */
    public void setBaseBiz(BaseBiz baseBiz) {
        this.baseBiz = baseBiz;
    }
    /**
     * @return the bussinessBiz
     */
    public BussinessBiz getBussinessBiz() {
        return this.bussinessBiz;
    }
    /**
     * @param bussinessBiz the bussinessBiz to set
     */
    public void setBussinessBiz(BussinessBiz bussinessBiz) {
        this.bussinessBiz = bussinessBiz;
    }
    /**
     * @return the manageBiz
     */
    public ManageBiz getManageBiz() {
        return this.manageBiz;
    }
    /**
     * @param manageBiz the manageBiz to set
     */
    public void setManageBiz(ManageBiz manageBiz) {
        this.manageBiz = manageBiz;
    }
    /**
     * @return the portalBiz
     */
    public PortalBiz getPortalBiz() {
        return this.portalBiz;
    }
    /**
     * @param portalBiz the portalBiz to set
     */
    public void setPortalBiz(PortalBiz portalBiz) {
        this.portalBiz = portalBiz;
    }
    
    
}
