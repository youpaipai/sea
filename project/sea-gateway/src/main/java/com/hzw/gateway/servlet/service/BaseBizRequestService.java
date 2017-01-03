/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：请求biz
 * 文件名称：BizServiceRequest.java
 * 修改时间：2016年7月15日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.gateway.servlet.service;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import com.hzw.du.biz.BaseBiz;
import com.hzw.du.biz.BussinessBiz;
import com.hzw.du.biz.ManageBiz;
import com.hzw.du.biz.PortalBiz;
import com.hzw.du.biz.bean.BaseInput;
import com.hzw.du.biz.bean.BaseOutput;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.BussinessBizFunCode;
import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.common.C001FileInput;
import com.hzw.du.biz.bean.param.common.C002FileInput;
import com.hzw.du.biz.bean.param.common.C003ProjectInput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectInput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeInput;
import com.hzw.du.biz.bean.param.common.C006LogInput;
import com.hzw.du.biz.bean.param.common.C007LogInput;
import com.hzw.du.biz.bean.param.common.C008LogInput;
import com.hzw.du.biz.bean.param.common.C009LoginInput;
import com.hzw.du.biz.bean.param.common.C010UserInput;
import com.hzw.du.biz.bean.param.common.C011UserInput;
import com.hzw.du.biz.bean.param.common.C012UserInput;
import com.hzw.du.biz.bean.param.common.C013QueryProjectInput;
import com.hzw.du.biz.bean.param.common.C014QueryServerTimeInput;
import com.hzw.du.biz.bean.param.common.C016OrganizationInput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput;
import com.hzw.du.biz.bean.param.common.C018ConstantInput;
import com.hzw.du.biz.bean.param.common.C020SysSupplierInput;
import com.hzw.du.biz.bean.param.common.C021SysAgencyInput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddInput;
import com.hzw.du.biz.bean.param.common.C024RegisterSysUserInput;
import com.hzw.du.biz.bean.param.common.C025UserInput;
import com.hzw.du.biz.bean.param.common.C026UserInput;
import com.hzw.du.biz.bean.param.common.C027UserInput;
import com.hzw.du.biz.bean.param.common.C028UserInput;
import com.hzw.du.biz.bean.param.common.C029UserInput;
import com.hzw.du.biz.bean.param.common.C030UserInput;
import com.hzw.du.biz.bean.param.common.C032UserInput;
import com.hzw.du.biz.bean.param.common.C033HelpInput;
import com.hzw.du.biz.bean.param.common.C034HelpInput;
import com.hzw.du.biz.bean.param.common.C035HelpInput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonInput;
import com.hzw.du.biz.bean.param.common.C038ConstantInput;
import com.hzw.du.biz.bean.param.common.C039ConstantInput;
import com.hzw.du.biz.bean.param.common.DemoInput;
import com.hzw.du.common.utils.StringUtils;

/**
 * 请求biz
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public abstract class BaseBizRequestService {
    
    protected Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    
    protected BaseBiz baseBiz;
    protected BussinessBiz bussinessBiz;
    protected ManageBiz manageBiz;
    protected PortalBiz portalBiz;
    
    /**
     * 
     * 函数功能描述：根据请求json参数，转换成调用不同的biz业务功能，并返回结果json字符串
     * @param inputParam 请求参数json字符串
     * @return 返回请求结果json文
     */
    public abstract String excuteRequest(String inputParam);
    
    /**
     * 
     * 函数功能描述：校验输入参数是否合法等
     * @param input 请求input对象，
     * @return 返回校验结果，如果结果为null或者“”空字符，那么表示参数校验通过，否则失败
     */
    public abstract String checkInputParam(BaseCommonInput input);
    
    protected BaseOutput excute(BaseInput input){
        return excute((BaseCommonInput)input);
    }
    protected BaseCommonOutput excute(BaseCommonInput input){
        BaseCommonOutput output = null;
        if(input != null && !StringUtils.isEmpty(input.getFunctionCode())){
            output = excuteCommon(input);
            if(output != null){
                return output;
            }
            output = excuteBussiness(input);
            if(output != null){
                return output;
            }
            output = excuteManage(input);
            if(output != null){
                return output;
            }
            output = excutePortal(input);
            if(output != null){
                return output;
            }
        }
       
        output = new BaseCommonOutput();
        output.setErrorCode(BizErrorCode.ERROR_CODE_9998);
        output.setErrorMsg(BizErrorCode.ERROR_Msg_9998);
        return output;
    }
    //公共业务功能
    private BaseCommonOutput excuteCommon(BaseCommonInput input){
        if(CommonBizFunCode.DEMO.equals(input.getFunctionCode())){
            return baseBiz.queryDemo((DemoInput)input);
        }
        else if (CommonBizFunCode.FILE_C001.equals(input.getFunctionCode())) 
        {
            if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.insertSysFile((C001FileInput) input);
            }
            else if (SysConstants.OPERATE_TYPE.OPERATE_MODIFY.equals(input.getOperateType()))
            {
                return baseBiz.modifySysFile((C001FileInput) input);
            }
        }
        else if (CommonBizFunCode.FILE_C002.equals(input.getFunctionCode()))
        {
            return baseBiz.getSysFileById((C002FileInput) input);
        }else if(CommonBizFunCode.PROJECT_C003.equals(input.getFunctionCode())){
            return baseBiz.project((C003ProjectInput)input);
        }else if(CommonBizFunCode.TENDER_PROJECT_C004.equals(input.getFunctionCode())){
            return baseBiz.tenderProject( (C004TenderProjectInput)input );
        }else if(CommonBizFunCode.CONNECT_NOTICE_C005.equals(input.getFunctionCode())){
            return baseBiz.queryConnectNotice((C005ConnectNoticeInput)input);
        }
        else if (CommonBizFunCode.LOG_C006.equals(input.getFunctionCode()))
        {
            if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.insertSysLog((C006LogInput) input);
            }
        }
        else if (CommonBizFunCode.LOG_C007.equals(input.getFunctionCode()))
        {
            return baseBiz.querySysLogList((C007LogInput) input);
        }
        else if (CommonBizFunCode.LOG_C008.equals(input.getFunctionCode()))
        {
            return baseBiz.getSysLogById((C008LogInput) input);
        }
        else if (CommonBizFunCode.SYS_LOGIN_C009.equals(input.getFunctionCode()))
        {
            return baseBiz.login((C009LoginInput) input);
        }
        else if (CommonBizFunCode.USER_C010.equals(input.getFunctionCode()))
        {
            return baseBiz.querySysUserByPage((C010UserInput) input);
        }
        else if (CommonBizFunCode.USER_C011.equals(input.getFunctionCode()))
        {
            return baseBiz.queryUserCount((C011UserInput) input);
        }
        else if (CommonBizFunCode.USER_C012.equals(input.getFunctionCode()))
        {
            return baseBiz.modifyPassword((C012UserInput) input);
        }
        else if (CommonBizFunCode.QUERY_PROJECT_C013.equals(input.getFunctionCode()))
        {
            return baseBiz.queryProjectList((C013QueryProjectInput)input);
        }
        else if (CommonBizFunCode.QUERY_SERVER_TIME_C014.equals(input.getFunctionCode()))
        {
            return baseBiz.queryServerTime((C014QueryServerTimeInput)input);
        }
        else if (CommonBizFunCode.SYS_ORGANIZATION_C016.equals(input.getFunctionCode()))
        {
            return baseBiz.operateOrganization((C016OrganizationInput)input);
        }
        else if (CommonBizFunCode.CONSTANT_C018.equals(input.getFunctionCode()))
        {
            return baseBiz.queryConstantList((C018ConstantInput) input);
        }
        else if (CommonBizFunCode.QUERY_SUPPLIER_PROJECT_C017.equals(input.getFunctionCode()))
        {
            return baseBiz.querySupplierPro((C017QuerySupplierProInput)input);
        }
        else if (CommonBizFunCode.SYS_SUPPLIER_C020.equals(input.getFunctionCode()))
        {
            return baseBiz.saveSysSupplier((C020SysSupplierInput)input);
        }
        else if (CommonBizFunCode.SYS_ANGENCY_C021.equals(input.getFunctionCode()))
        {
            return baseBiz.saveSysAgency((C021SysAgencyInput)input);
        }
        else if (CommonBizFunCode.C022_STANDARD_SUPPLIER_ADD.equals(input.getFunctionCode()))
        {
            return baseBiz.standardSupplierAdd((C022StandardSupplierAddInput)input);
        }
        else if(CommonBizFunCode.REGISTER_SYSUSER_C024.equals(input.getFunctionCode())){
            return baseBiz.registerSysUser((C024RegisterSysUserInput)input);
        }
        
        else if (CommonBizFunCode.USER_C025.equals(input.getFunctionCode()))
        {
            return baseBiz.querySubUserList((C025UserInput) input);
        }
        else if (CommonBizFunCode.USER_C026.equals(input.getFunctionCode()))
        {
            return baseBiz.modifyUserStatus((C026UserInput) input);
        }
        else if (CommonBizFunCode.USER_C027.equals(input.getFunctionCode()))
        {
            return baseBiz.initAddUser((C027UserInput) input);
        }
        else if (CommonBizFunCode.USER_C028.equals(input.getFunctionCode()))
        {
            if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.addUser((C028UserInput) input);
            }
            else if (SysConstants.OPERATE_TYPE.OPERATE_MODIFY.equals(input.getOperateType()))
            {
                return baseBiz.modifyUser((C028UserInput) input);
            }
        }
        else if (CommonBizFunCode.USER_C029.equals(input.getFunctionCode()))
        {
            return baseBiz.initModifyUser((C029UserInput) input);
        }
        else if (CommonBizFunCode.USER_C030.equals(input.getFunctionCode()))
        {
            return baseBiz.queryUserOrgList((C030UserInput) input);
        }
        else if (CommonBizFunCode.USER_C032.equals(input.getFunctionCode()))
        {
            return baseBiz.getPersonCenter((C032UserInput) input);
        }
        else if (CommonBizFunCode.HELP_C033.endsWith(input.getFunctionCode()))
        {
            return baseBiz.queryMHHelpList((C033HelpInput) input);
        }
        else if (CommonBizFunCode.HELP_C034.endsWith(input.getFunctionCode()))
        {
            if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.insertMHHelp((C034HelpInput) input);
            }
            else if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.modifyMHHelp((C034HelpInput) input);
            }
        }
        else if (CommonBizFunCode.HELP_C035.endsWith(input.getFunctionCode()))
        {
            return baseBiz.getMHHelpById((C035HelpInput) input);
        }
        else if(CommonBizFunCode.SYS_ENTRUST_PERSON_C037.equals(input.getFunctionCode())){
            return baseBiz.registerSysEntrustPerson((C037SysEntrustPersonInput)input);
        }
        else if (CommonBizFunCode.CONSTANT_C038.equals(input.getFunctionCode()))
        {
            return baseBiz.querySysConstantList((C038ConstantInput) input);
        }
        else if (CommonBizFunCode.CONSTANT_C039.equals(input.getFunctionCode()))
        {
            if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.insertConstant((C039ConstantInput) input);
            }
            else if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.modifyConstant((C039ConstantInput) input);
            }
            else if (SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType()))
            {
                return baseBiz.delConstant((C039ConstantInput) input);
            }
        }
        return null;
    }
    //业务系统功能业务
    private BaseCommonOutput excuteBussiness(BaseCommonInput input){
        if(BussinessBizFunCode.B001_SUPPLIER_DOWNLOAD_TEND_FILE.equals(input.getFunctionCode())){
            return bussinessBiz.supplierDownTendFile((B001SupplierDownTendFileInput)input);
        }
        
        if(BussinessBizFunCode.B002_STANDARD_SUPPLIER_UPDATE.equals(input.getFunctionCode())){
            return bussinessBiz.standardSupplierUpdate((B002SupplierTendFeeInput)input);
        }
        
        return null;
    }
    //后台管理功能业务
    private BaseCommonOutput excuteManage(BaseCommonInput input){
            
        return null;
    }
    //门户功能业务
    private BaseCommonOutput excutePortal(BaseCommonInput input){
        return null;
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
