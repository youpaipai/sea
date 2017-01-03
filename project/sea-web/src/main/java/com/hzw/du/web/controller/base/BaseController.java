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

import java.util.Map;

import org.apache.jcs.access.exception.CacheException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.bean.ConstantBean;
import com.hzw.du.biz.bean.param.common.C018ConstantInput;
import com.hzw.du.biz.bean.param.common.C018ConstantOutput;
import com.hzw.du.biz.request.BaseBiz;
import com.hzw.du.biz.request.BussinessBiz;
import com.hzw.du.biz.request.ManageBiz;
import com.hzw.du.biz.request.PortalBiz;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.web.entity.BaseRequest;
import com.hzw.du.web.entity.BaseResponse;
import com.hzw.du.web.entity.SessionUser;
import com.hzw.du.web.exception.WebException;
import com.hzw.du.web.jcs.JcsMap;
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
    
    /**
     * 60分钟缓存对象
     */
    @Autowired
    @Qualifier("cache60")
    private JcsMap cache60;
    //字典缓存中存放分组key
    private final String DICTIONARY_GROUP_FLAG = "dictionary_group_flag";
    
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
    
    //版本号，留给静态文件引入用
    @Value("#{application['version']?:''}")
    private String version;
    
    protected final String DATE_FORMAT_TIME = "yyyy-MM-dd";
    
    protected void execute(BaseRequest req, String title){
        req.setVersion(version);
        req.setTitle(title);
        SessionUser user = getWebSessionUser();
        req.setUserName(user.getUserName());
    }
    
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
        String _tipMsg = null;
        if(e instanceof WebException){
            _tipMsg = e.getMessage();
        }
        if(StringUtils.isEmpty(_tipMsg)){
            _tipMsg = tipMsg;
        }
        if(StringUtils.isEmpty(_tipMsg)){
            _tipMsg = e.getMessage();
        }
        if(StringUtils.isEmpty(_tipMsg)){
            _tipMsg = "未知错误";
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
     * 
     * 函数功能描述：处理行业分类
     * @param res
     * @param tipMsg
     */
    protected String rtnProjectTypeDesc(String projectType){
        if(StringUtils.isEmpty(projectType)){
            return null;
        }
        
        //待处理
        
        return projectType;
    }

    /**
     * 
     * 函数功能描述：处理返回的output，校验返回是否成功
     * @param output
     */
    protected void checkOutput(BaseCommonOutput output){
        if(!BizErrorCode.SUCCESS_CODE.equals(output.getErrorCode())){
            throw new WebException(output.getErrorCode(), output.getErrorMsg());
        }
    }
    
    /**
     * 
     * 函数功能描述：处理返回的output，校验返回是否成功
     * @param output
     * @param tipMsg 自定义异常信息，优先使用
     */
    protected void checkOutput(BaseCommonOutput output, String tipMsg){
        if(!BizErrorCode.SUCCESS_CODE.equals(output.getErrorCode())){
            throw new WebException(output.getErrorCode(), tipMsg);
        }
    }
    
    /**
     * 
     * 函数功能描述：比较两个long类型值是否相等
     * @param value1
     * @param value2
     * @return
     */
    protected boolean diffLongObjValue(Long value1, Long value2){
        if(value1 == null || value2 == null){
            return false;
        }
        return value1.longValue() == value2.longValue();
    }
    
    /**
     * 
     * 函数功能描述：字典列表查询
     * @param key
     * @return
     */
    protected ConstantBean queryDictionary(String key){
        Object obj = cache60.get(key);
        //如果obj为nll，那么去调接口查询字典数据，并把数据放到cache中
        if(obj == null){
            try{
                queryDictionary(cache60, DICTIONARY_GROUP_FLAG);
            }catch(CacheException e){
                log.error("查询字典数据失败", e);
                throw new WebException("查询字典数据失败");
            }
        }
        obj = cache60.get(key);
        if(obj == null){
            throw new WebException("查询字典数据失败");
        }
        
        return (ConstantBean)obj;
    }
    
    //调用字典接口并处理返回信息
    private void queryDictionary(JcsMap cache60, String groupKey) throws CacheException{
        C018ConstantInput input = new C018ConstantInput();
        C018ConstantOutput output = baseBiz.queryConstantList(input);
        
        checkOutput(output);
        
        Map<String, ConstantBean> constantMap = output.getConstantMap();
        for(Map.Entry<String, ConstantBean> entry : constantMap.entrySet()){
            cache60.put(entry.getKey(), entry.getValue());
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

    /**
     * @return the cache60
     */
    public JcsMap getCache60() {
        return this.cache60;
    }

    /**
     * @param cache60 the cache60 to set
     */
    public void setCache60(JcsMap cache60) {
        this.cache60 = cache60;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    
}
