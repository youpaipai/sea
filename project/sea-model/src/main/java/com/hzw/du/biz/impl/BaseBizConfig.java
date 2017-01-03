/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BaseBizConfig.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;

import com.hzw.du.biz.MemcachedBiz;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.BaseQueryCommonInput;
import com.hzw.du.biz.bean.param.common.C003ProjectInput;
import com.hzw.du.biz.bean.param.common.C003ProjectOutput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectInput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectOutput;
import com.hzw.du.biz.check.BaseInputCheck;
import com.hzw.du.biz.exception.BizException;
import com.hzw.du.common.date.DateUtil;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.model.dao.BaseDao;
import com.hzw.du.model.dao.BizDao;
import com.hzw.du.model.dao.ManageDao;
import com.hzw.du.model.dao.PortalDao;
import com.hzw.du.model.exception.DaoException;
import com.hzw.du.model.mapper.BaseBean;
import com.hzw.du.model.mapper.TbProject;
import com.hzw.du.model.mapper.TbPurchaseFile;
import com.hzw.du.model.mapper.TbTenderProject;
import com.hzw.du.model.page.MybatisPager;

import ch.qos.logback.classic.Logger;

/**
 * 基础业务服务
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public abstract class BaseBizConfig {

    protected Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    /**
     * 公共dao
     */
    protected BaseDao baseDao;

    /**
     * 业务系统dao
     */
    protected BizDao bizDao;

    /**
     * 后台管理dao
     */
    protected ManageDao manageDao;

    /**
     * 门户网站dao
     */
    protected PortalDao portalDao;
    
    /**
     * memcached缓存Biz
     */
    protected MemcachedBiz memcachedBiz;
    
    /**
     * 时间日期格式化字符，统一采用这种格式日期
     */
    protected String DATE_FORMAT_STRING = "yyyyMMddHHmmss";

    /**
     * 
     * 函数功能描述：设置默认的值，如操作用户编号，更新时间戳等
     * @param baseBean
     * @param userId
     */
    protected void setOpaUserAndDate(BaseBean baseBean, Long userId) {
        baseBean.setCreateUser(userId);
        baseBean.setCreateTime(DateUtil.getCurrentDate());
        baseBean.setUpdateUser(userId);
        baseBean.setUpdateTime(baseBean.getCreateTime());
    }
    
    /**
     * 
     * 函数功能描述：设置默认的值，如操作用户编号，更新时间戳等
     * @param baseBean
     * @param userId
     */
    protected void setUpdateUserAnddDate(BaseBean baseBean, Long userId) {
        baseBean.setUpdateUser(userId);
        baseBean.setUpdateTime(baseBean.getCreateTime());
    }
    
    /**
     * 
     * 函数功能描述：校验插入一条记录是否成功，根据影响行数来判断
     * @param rows
     */
    protected void checkInsert(Integer rows) {
        if (rows == null || rows <= 0) {
            throw new BizException(BizErrorCode.ERROR_CODE_0001, BizErrorCode.ERROR_Msg_0001);
        }
    }

    protected void checkInsert(Integer rows, String errorMsg) {
        if (rows == null || rows <= 0) {
            throw new BizException(BizErrorCode.ERROR_CODE_0001, errorMsg);
        }
    }

    /**
     * 
     * 函数功能描述：校验修改一条或者多条记录是否成功，根据影响行数来判断
     * @param rows
     */
    protected void checkUpdate(Integer rows) {
        if (rows == null || rows <= 0) {
            throw new BizException(BizErrorCode.ERROR_CODE_0002, BizErrorCode.ERROR_Msg_0002);
        }
    }

    protected void checkUpdate(Integer rows, String errorMsg) {
        if (rows == null || rows <= 0) {
            throw new BizException(BizErrorCode.ERROR_CODE_0002, errorMsg);
        }
    }

    /**
     * 
     * 函数功能描述：校验删除“一条"记录是否成功，根据影响行数来判断
     * @param rows
     */
    protected void checkDelete(Integer rows) {
        if (rows == null || rows <= 0) {
            throw new BizException(BizErrorCode.ERROR_CODE_0002, BizErrorCode.ERROR_Msg_0003);
        }
    }

    protected void checkDelete(Integer rows, String errorMsg) {
        if (rows == null || rows <= 0) {
            throw new BizException(BizErrorCode.ERROR_CODE_0002, errorMsg);
        }
    }

    /**
     * 
     * 函数功能描述：校验对象是否为null
     * @param obj
     */
    protected void checkObjIsNull(Object obj) {
        if (obj == null) {
            throw new BizException(BizErrorCode.ERROR_CODE_0004, BizErrorCode.ERROR_Msg_0004);
        }
    }

    protected void checkObjIsNull(Object obj, String errorMsg) {
        if (obj == null) {
            throw new BizException(BizErrorCode.ERROR_CODE_0004, errorMsg);
        }
    }

    /**
     * 
     * 函数功能描述：新增、修改、删除，校验是否有操作类型
     * @param obj
     */
    protected void checkOperateType(BaseCommonInput input) {
        if (StringUtils.isEmpty(input.getOperateType())) {
            throw new BizException(BizErrorCode.ERROR_CODE_0005, BizErrorCode.ERROR_Msg_0005);
        } else {
            throw new BizException(BizErrorCode.ERROR_CODE_0006, BizErrorCode.ERROR_Msg_0006);
        }
    }

    /**
     * 
     * 函数功能描述：处理异常信息（使用自定义异常码、自定义的异常信息）
     * @param e  异常对象
     * @param output 输入参数对象
     * @param newErrorCode 自定义异常码
     * @param newErrorMsg 自定义的异常信息
     */
    protected void exProcess(Exception e, BaseCommonOutput output, String newErrorCode,
            String newErrorMsg) {
        if (StringUtils.isEmpty(newErrorCode)) {
            newErrorCode = BizErrorCode.UNKNOW_ERROR_CODE;
            newErrorMsg = BizErrorCode.UNKNOW_ERROR_Msg_9999;
        }
        if (StringUtils.isEmpty(newErrorMsg)) {
            newErrorMsg = BizErrorCode.UNKNOW_ERROR_Msg_9999;
        }
        log.error("errorCode=[" + newErrorCode + "]；errorMsg=[" + newErrorMsg + "]", e);
        output.setErrorCode(newErrorCode);
        output.setErrorMsg(newErrorMsg);
    }

    /**
     * 
     * 函数功能描述：处理异常信息（如果异常信息没有，那么使用自定义的异常信息）
     * @param e  异常对象
     * @param output 输入参数对象
     * @param newErrorMsg 自定义的异常信息
     */
    protected void exProcess(Exception e, BaseCommonOutput output, String newErrorMsg) {
        String errorCode = null;
        String errorMsg = null;
        if (e instanceof DaoException) {
            DaoException daoE = (DaoException) e;
            errorCode = daoE.getErrorCode();
            errorMsg = daoE.getErrorMsg();
        } else if (e instanceof BizException) {
            BizException daoE = (BizException) e;
            errorCode = daoE.getErrorCode();
            errorMsg = daoE.getErrorMsg();
        }
        if (StringUtils.isEmpty(errorCode)) {
            errorCode = BizErrorCode.UNKNOW_ERROR_CODE;
        }
        if (StringUtils.isEmpty(errorMsg)) {
            errorMsg = newErrorMsg;
        }
        log.error("errorCode=[" + errorCode + "]；errorMsg=[" + errorMsg + "]", e);
        output.setErrorCode(errorCode);
        output.setErrorMsg(errorMsg);
    }
    
    /**
     * 
     * 函数功能描述：处理异常信息（直接处理异常信息）
     * @param e  异常对象
     * @param output 输入参数对象
     */
    protected void exProcess(Exception e, BaseCommonOutput output) {
        String errorCode = null;
        String errorMsg = null;
        if (e instanceof DaoException) {
            DaoException daoE = (DaoException) e;
            errorCode = daoE.getErrorCode();
            errorMsg = daoE.getErrorMsg();
        } else if (e instanceof BizException) {
            BizException daoE = (BizException) e;
            errorCode = daoE.getErrorCode();
            errorMsg = daoE.getErrorMsg();
        }
        if (StringUtils.isEmpty(errorCode)) {
            errorCode = BizErrorCode.UNKNOW_ERROR_CODE;
            errorMsg = BizErrorCode.UNKNOW_ERROR_Msg_9999;
        }
        if (StringUtils.isEmpty(errorMsg)) {
            errorMsg = BizErrorCode.UNKNOW_ERROR_Msg_9999;
        }
        log.error("errorCode=[" + errorCode + "]；errorMsg=[" + errorMsg + "]", e);
        output.setErrorCode(errorCode);
        output.setErrorMsg(errorMsg);
    }

    /**
     * 
     * 函数功能描述：处理成功信息
     * @param output
     */
    protected void successProcess(BaseCommonOutput output) {
        output.setErrorCode(BizErrorCode.SUCCESS_CODE);
        output.setErrorMsg(BizErrorCode.SUCCESS_Msg);
    }
    
    /**
     * 
     * 函数功能描述：处理用逗号分割的ID list列表
     * @param idListStr  逗号分割的ID list列表；示例：33,44
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <T> List<T> processIdListStr(String idListStr, Class<T> clazz){
        if(StringUtils.isEmpty(idListStr) || StringUtils.isEmpty(idListStr.trim()) ){
            return null;
        }
        List<T> list = new ArrayList<T>();
        String[] idArr = idListStr.split(",");
        for(String id : idArr){
            if(StringUtils.isEmpty(id) || StringUtils.isEmpty(id.trim())){
                continue;
            }
            try{
                if(clazz == Long.class){
                    list.add((T)(new Long(id)));
                }else if(clazz == Integer.class) {
                    list.add((T)(new Integer(id)));
                }else{
                    list.add((T)id); 
                } 
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        return list;
    }
    
    /**
     * SysConstants.EXPRESSION_TYPE表示条件符号
     * 函数功能描述：处理表示一段范围条件的查询，用list包含每个单元
     *      每个单元包含两部分（条件符号|值）
     *      例如：表示小于值：（lt|值）
     *      lte（小于等于）,gt（大于）,gte（大于等于）,eq（等于）
     * @param columnKey  对应数据库中的字段
     * @param valueList  list;每个单元包含两部分（条件符号|值）
     * @param condtionMap  查询条件map
     */
    protected void processValueTimeRange(String columnKey, List<String> valueList, Map<String, Object> condtionMap){
        if(StringUtils.isEmptyAfterTrim(columnKey) || valueList == null || valueList.size() <= 0 || condtionMap == null){
            return;
        }
        columnKey = columnKey.trim();
        for(String value : valueList){
            if(StringUtils.isEmptyAfterTrim(value)){
                continue;
            }
            value = value.trim();
            String[] values = value.split(",");
            if(values.length != 2 || StringUtils.isEmptyAfterTrim(values[0]) || StringUtils.isEmptyAfterTrim(values[1])){
                continue;
            }
            if(SysConstants.EXPRESSION_TYPE.LT.equalsIgnoreCase(values[0]) || SysConstants.EXPRESSION_TYPE.LT_SYMBOL.equalsIgnoreCase(values[0])){
                condtionMap.put(columnKey + "_" + SysConstants.EXPRESSION_TYPE.LT, formatDate(values[1]));
            }else if(SysConstants.EXPRESSION_TYPE.LTE.equalsIgnoreCase(values[0]) || SysConstants.EXPRESSION_TYPE.LTE_SYMBOL.equalsIgnoreCase(values[0])){
                condtionMap.put(columnKey + "_" + SysConstants.EXPRESSION_TYPE.LTE, formatDate(values[1]));
            }else if(SysConstants.EXPRESSION_TYPE.GT.equalsIgnoreCase(values[0]) || SysConstants.EXPRESSION_TYPE.GT_SYMBOL.equalsIgnoreCase(values[0])){
                condtionMap.put(columnKey + "_" + SysConstants.EXPRESSION_TYPE.GT, formatDate(values[1]));
            }else if(SysConstants.EXPRESSION_TYPE.GTE.equalsIgnoreCase(values[0]) || SysConstants.EXPRESSION_TYPE.GTE_SYMBOL.equalsIgnoreCase(values[0])){
                condtionMap.put(columnKey + "_" + SysConstants.EXPRESSION_TYPE.GTE, formatDate(values[1]));
            }else if(SysConstants.EXPRESSION_TYPE.EQ.equalsIgnoreCase(values[0]) || SysConstants.EXPRESSION_TYPE.EQ_SYMBOL.equalsIgnoreCase(values[0])){
                condtionMap.put(columnKey + "_" + SysConstants.EXPRESSION_TYPE.EQ, formatDate(values[1]));
            }
        }
    }
    
    private String formatDate(String dateStr){
        if(StringUtils.isEmptyAfterTrim(dateStr)){
            return null;
        }
        Date date = DateUtil.StringToDate(dateStr);
        if(date == null){
            return null;
        }
        return DateUtil.dateToString(date, DATE_FORMAT_STRING);
    }
    
    /**
     * 
     * 函数功能描述：项目立项
     * @param input
     * @param output
     */
    protected void projectInsert(C003ProjectInput input, C003ProjectOutput output){
      //1、处理输入参数，并添加到数据库中
        TbProject tbProject = BaseInputCheck.copyInputToDb(input, TbProject.class);
        //校验返回生产对象是否为null
        checkObjIsNull(tbProject);
        
        setOpaUserAndDate(tbProject, input.getUserId());
        
        Integer rows = baseDao.insertTbProject(tbProject);
        //2、校验是否插入成功
        checkInsert(rows);
    }
    
    /**
     * 
     * 函数功能描述：招标项目立项
     * @param input
     * @param output
     */
    protected void tenderProjectInsert(C004TenderProjectInput input, C004TenderProjectOutput output){
        //1、处理输入参数，并添加到数据库中
        TbTenderProject tbTenderProject = BaseInputCheck.copyInputToDb(input, TbTenderProject.class);
        //校验返回生产对象是否为null
        checkObjIsNull(tbTenderProject);
        
        setOpaUserAndDate(tbTenderProject, input.getUserId());
        
        Integer rows = baseDao.insertTbTenderProject(tbTenderProject);
        //2、校验是否插入成功
        checkInsert(rows);
    }
    
    /**
     * 
     * 函数功能描述：给dbBean添加分页功能
     * @param dbBean
     * @param input
     */
    protected void dbBeanPager(BaseBean dbBean, BaseQueryCommonInput input){
        MybatisPager pager = MybatisPager.factoryPageByPageSize(input.getCurrentPage(), input.getPageSize());
        dbBean.setPager(pager);
    }
    
    /**
     * 
     * 函数功能描述：获取始终服务器时间
     * @return
     */
    protected Date queryServerTime(){
        return DateUtil.getCurrentDate();
    }
    
    /**
     * 函数功能描述：查询该招标项目上传的招标文件
     * @param tenderProjectId
     * return Map<String, TbPurchaseFile> key是由（）
     */
    protected Map<String, TbPurchaseFile>  queryTbPurchaseFile(Long tenderProjectId) {
        TbPurchaseFile tbPurchaseFile = new TbPurchaseFile();
        tbPurchaseFile.setStatus(SysConstants.STATUS.STATUS_NORMAL);
        tbPurchaseFile.setTenderProjectId(tenderProjectId);
        List<TbPurchaseFile> tbPurchaseFileList = baseDao.queryTbPurchaseFileList(tbPurchaseFile);
        if(tbPurchaseFileList == null || tbPurchaseFileList.size() == 0){
            throw new BizException(BizErrorCode.ERROR_CODE_0012, BizErrorCode.ERROR_Msg_0012);
        }
        if(tbPurchaseFileList.size() != 1){
            throw new BizException(BizErrorCode.ERROR_CODE_0013, BizErrorCode.ERROR_Msg_0013);
        }
        Map<String, TbPurchaseFile> tbPurchaseFileMap = new HashMap<String, TbPurchaseFile>();
        for(TbPurchaseFile item : tbPurchaseFileList){
            if(item == null || item.getSubId() == null || item.getTenderProjectId() == null){
                continue;
            }
            tbPurchaseFileMap.put(item.getTenderProjectId().longValue() + "_" + item.getSubId().longValue(), item);
        }
        return tbPurchaseFileMap;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the baseDao
     */
    public BaseDao getBaseDao() {
        return this.baseDao;
    }

    /**
     * @param baseDao the baseDao to set
     */
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    /**
     * @return the bizDao
     */
    public BizDao getBizDao() {
        return this.bizDao;
    }

    /**
     * @param bizDao the bizDao to set
     */
    public void setBizDao(BizDao bizDao) {
        this.bizDao = bizDao;
    }

    /**
     * @return the manageDao
     */
    public ManageDao getManageDao() {
        return this.manageDao;
    }

    /**
     * @param manageDao the manageDao to set
     */
    public void setManageDao(ManageDao manageDao) {
        this.manageDao = manageDao;
    }

    /**
     * @return the portalDao
     */
    public PortalDao getPortalDao() {
        return this.portalDao;
    }

    /**
     * @param portalDao the portalDao to set
     */
    public void setPortalDao(PortalDao portalDao) {
        this.portalDao = portalDao;
    }

    public MemcachedBiz getMemcachedBiz()
    {
        return memcachedBiz;
    }

    public void setMemcachedBiz(MemcachedBiz memcachedBiz)
    {
        this.memcachedBiz = memcachedBiz;
    }

}
