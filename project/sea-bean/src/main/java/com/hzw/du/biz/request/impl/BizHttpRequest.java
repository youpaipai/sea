/*
s * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：调用业务系统接口的htpp
 * 文件名称：BizHttpRequest.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.request.impl;

import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileOutput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeOutput;
import com.hzw.du.biz.bean.param.common.C001FileInput;
import com.hzw.du.biz.bean.param.common.C001FileOutput;
import com.hzw.du.biz.bean.param.common.C002FileInput;
import com.hzw.du.biz.bean.param.common.C002FileOutput;
import com.hzw.du.biz.bean.param.common.C003ProjectInput;
import com.hzw.du.biz.bean.param.common.C003ProjectOutput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectInput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectOutput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeInput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeOutput;
import com.hzw.du.biz.bean.param.common.C006LogInput;
import com.hzw.du.biz.bean.param.common.C006LogOutput;
import com.hzw.du.biz.bean.param.common.C007LogInput;
import com.hzw.du.biz.bean.param.common.C007LogOutput;
import com.hzw.du.biz.bean.param.common.C008LogInput;
import com.hzw.du.biz.bean.param.common.C008LogOutput;
import com.hzw.du.biz.bean.param.common.C009LoginInput;
import com.hzw.du.biz.bean.param.common.C009LoginOutput;
import com.hzw.du.biz.bean.param.common.C010UserInput;
import com.hzw.du.biz.bean.param.common.C010UserOutput;
import com.hzw.du.biz.bean.param.common.C011UserInput;
import com.hzw.du.biz.bean.param.common.C011UserOutput;
import com.hzw.du.biz.bean.param.common.C012UserInput;
import com.hzw.du.biz.bean.param.common.C012UserOutput;
import com.hzw.du.biz.bean.param.common.C013QueryProjectInput;
import com.hzw.du.biz.bean.param.common.C013QueryProjectOutput;
import com.hzw.du.biz.bean.param.common.C014QueryServerTimeInput;
import com.hzw.du.biz.bean.param.common.C014QueryServerTimeOutput;
import com.hzw.du.biz.bean.param.common.C015QueryTenderProjectInput;
import com.hzw.du.biz.bean.param.common.C015QueryTenderProjectOutput;
import com.hzw.du.biz.bean.param.common.C016OrganizationInput;
import com.hzw.du.biz.bean.param.common.C016OrganizationOutput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProOutput;
import com.hzw.du.biz.bean.param.common.C018ConstantInput;
import com.hzw.du.biz.bean.param.common.C018ConstantOutput;
import com.hzw.du.biz.bean.param.common.C020SysSupplierInput;
import com.hzw.du.biz.bean.param.common.C020SysSupplierOutput;
import com.hzw.du.biz.bean.param.common.C021SysAgencyInput;
import com.hzw.du.biz.bean.param.common.C021SysAgencyOutput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddInput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddOutput;
import com.hzw.du.biz.bean.param.common.C024RegisterSysUserInput;
import com.hzw.du.biz.bean.param.common.C024RegisterSysUserOutput;
import com.hzw.du.biz.bean.param.common.C025UserInput;
import com.hzw.du.biz.bean.param.common.C025UserOutput;
import com.hzw.du.biz.bean.param.common.C026UserInput;
import com.hzw.du.biz.bean.param.common.C026UserOutput;
import com.hzw.du.biz.bean.param.common.C027UserInput;
import com.hzw.du.biz.bean.param.common.C027UserOutput;
import com.hzw.du.biz.bean.param.common.C028UserInput;
import com.hzw.du.biz.bean.param.common.C028UserOutput;
import com.hzw.du.biz.bean.param.common.C029UserInput;
import com.hzw.du.biz.bean.param.common.C029UserOutput;
import com.hzw.du.biz.bean.param.common.C030UserInput;
import com.hzw.du.biz.bean.param.common.C030UserOutput;
import com.hzw.du.biz.bean.param.common.C032UserInput;
import com.hzw.du.biz.bean.param.common.C032UserOutput;
import com.hzw.du.biz.bean.param.common.C033HelpInput;
import com.hzw.du.biz.bean.param.common.C033HelpOutput;
import com.hzw.du.biz.bean.param.common.C034HelpInput;
import com.hzw.du.biz.bean.param.common.C034HelpOutput;
import com.hzw.du.biz.bean.param.common.C035HelpInput;
import com.hzw.du.biz.bean.param.common.C035HelpOutput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonInput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonOutput;
import com.hzw.du.biz.bean.param.common.C038ConstantInput;
import com.hzw.du.biz.bean.param.common.C038ConstantOutput;
import com.hzw.du.biz.bean.param.common.C039ConstantInput;
import com.hzw.du.biz.bean.param.common.C039ConstantOutput;
import com.hzw.du.biz.bean.param.common.DemoInput;
import com.hzw.du.biz.bean.param.common.DemoOutput;
import com.hzw.du.biz.request.BaseBiz;
import com.hzw.du.biz.request.BussinessBiz;
import com.hzw.du.biz.request.ManageBiz;
import com.hzw.du.biz.request.PortalBiz;

/**
 * 调用业务系统接口的htpp
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BizHttpRequest extends BaseBizHttpRequest implements BaseBiz, BussinessBiz, ManageBiz, PortalBiz{

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#queryDemo(com.hzw.du.biz.bean.param.common.DemoInput)
     */
    @Override
    public DemoOutput queryDemo(DemoInput input) {
        return request(input, DemoOutput.class);
    }

    @Override
    public C001FileOutput insertSysFile(C001FileInput fileInput)
    {
        return request(fileInput, C001FileOutput.class);
    }

    @Override
    public C002FileOutput getSysFileById(C002FileInput fileInput)
    {
        return request(fileInput, C002FileOutput.class);
    }

    @Override
    public C001FileOutput modifySysFile(C001FileInput fileInput)
    {
        return request(fileInput, C001FileOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#projectOperate(com.hzw.du.biz.bean.param.common.C003ProjectInput)
     */
    @Override
    public C003ProjectOutput project(C003ProjectInput input) {
        return request(input, C003ProjectOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#tenderProjectApproval(com.hzw.du.biz.bean.param.common.C004TenderProjectInput)
     */
    @Override
    public C004TenderProjectOutput tenderProject(C004TenderProjectInput input) {
        return request(input, C004TenderProjectOutput.class);
    }

    @Override
    public C005ConnectNoticeOutput queryConnectNotice(C005ConnectNoticeInput input)
    {
        return request(input, C005ConnectNoticeOutput.class);
    }

    @Override
    public C006LogOutput insertSysLog(C006LogInput logInput)
    {
        return request(logInput, C006LogOutput.class);
    }

    @Override
    public C007LogOutput querySysLogList(C007LogInput logInput)
    {
        return request(logInput, C007LogOutput.class);
    }

    @Override
    public C008LogOutput getSysLogById(C008LogInput logInput)
    {
        return request(logInput, C008LogOutput.class);
    }

	@Override
	public C009LoginOutput login(C009LoginInput input) {
	   return request(input, C009LoginOutput.class);
	}

	/**
     * 
     * 函数功能描述：查询所有[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
	@Override
    public C010UserOutput querySysUserByPage(C010UserInput userInput)
    {
        return request(userInput, C010UserOutput.class);
    }
    
    /**
     * 
     * 函数功能描述：根据登录号、手机号码验证是否唯一
     * @param sysUser
     * @return
     */
    @Override
    public C011UserOutput queryUserCount(C011UserInput userInput)
    {
        return request(userInput, C011UserOutput.class);
    }
    
    /**
     * 
     * 函数功能描述：修改用户密码
     * @param userInput
     * @return
     */
    @Override
    public C012UserOutput modifyPassword(C012UserInput userInput)
    {
        return request(userInput, C012UserOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#queryProjectList(com.hzw.du.biz.bean.param.common.C013ProjectQueryInput)
     */
    @Override
    public C013QueryProjectOutput queryProjectList(C013QueryProjectInput input) {
        return request(input, C013QueryProjectOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#queryServerTime(com.hzw.du.biz.bean.param.common.C014QueryServerTimeInput)
     */
    @Override
    public C014QueryServerTimeOutput queryServerTime(C014QueryServerTimeInput input) {
        return request(input, C014QueryServerTimeOutput.class);
    }

	@Override
	public C016OrganizationOutput operateOrganization(C016OrganizationInput input) {
		return  request(input, C016OrganizationOutput.class);
	}

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#projectApproval(com.hzw.du.biz.bean.param.common.C014QueryServerTimeInput)
     */
    @Override
    public C015QueryTenderProjectOutput queryTenderProject(C015QueryTenderProjectInput input) {
        return request(input, C015QueryTenderProjectOutput.class);
    }

    @Override
    public C018ConstantOutput queryConstantList(C018ConstantInput constantInput)
    {
        return request(constantInput, C018ConstantOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#querySupplierPro(com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput)
     */
    @Override
    public C017QuerySupplierProOutput querySupplierPro(C017QuerySupplierProInput input) {
        return request(input, C017QuerySupplierProOutput.class);
    }

	@Override
	public C020SysSupplierOutput saveSysSupplier(C020SysSupplierInput input) {
		return request(input, C020SysSupplierOutput.class);
	}

	@Override
	public C021SysAgencyOutput saveSysAgency(C021SysAgencyInput input) {
		return request(input, C021SysAgencyOutput.class);
	}

    @Override
    public C024RegisterSysUserOutput registerSysUser(C024RegisterSysUserInput input)
    {
        return request(input,C024RegisterSysUserOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#standardSupplierAdd(com.hzw.du.biz.bean.param.common.C022StandardSupplierInput)
     */
    @Override
    public C022StandardSupplierAddOutput standardSupplierAdd(C022StandardSupplierAddInput input) {
        return request(input,C022StandardSupplierAddOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BaseBiz#standardSupplierUpdate(com.hzw.du.biz.bean.param.common.C023StandardSupplierUpdateInput)
     */
    @Override
    public B002SupplierTendFeeOutput standardSupplierUpdate(B002SupplierTendFeeInput input) {
        return request(input,B002SupplierTendFeeOutput.class);
    }

    /* (non-Javadoc)
     * @see com.hzw.du.biz.request.BussinessBiz#supplierDownTendFile(com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput)
     */
    @Override
    public B001SupplierDownTendFileOutput supplierDownTendFile(
            B001SupplierDownTendFileInput input) {
        return request(input,B001SupplierDownTendFileOutput.class);
    }

    @Override
    public C025UserOutput querySubUserList(C025UserInput userInput)
    {
        return request(userInput, C025UserOutput.class);
    }

    @Override
    public C026UserOutput modifyUserStatus(C026UserInput userInput)
    {
        return request(userInput, C026UserOutput.class);
    }

    @Override
    public C027UserOutput initAddUser(C027UserInput userInput)
    {
        return request(userInput, C027UserOutput.class);
    }

    @Override
    public C028UserOutput addUser(C028UserInput userInput)
    {
        return request(userInput, C028UserOutput.class);
    }
    
    @Override
    public C028UserOutput modifyUser(C028UserInput userInput)
    {
        return request(userInput, C028UserOutput.class);
    }

    @Override
    public C029UserOutput initModifyUser(C029UserInput userInput)
    {
        return request(userInput, C029UserOutput.class);
    }

    @Override
    public C030UserOutput queryUserOrgList(C030UserInput userInput)
    {
        return request(userInput, C030UserOutput.class);
    }

    @Override
    public C032UserOutput getPersonCenter(C032UserInput userInput)
    {
        return request(userInput, C032UserOutput.class);
    }

    @Override
    public C033HelpOutput queryMHHelpList(C033HelpInput helpInput)
    {
        return request(helpInput, C033HelpOutput.class);
    }

    @Override
    public C034HelpOutput insertMHHelp(C034HelpInput helpInput)
    {
        return request(helpInput, C034HelpOutput.class);
    }

    @Override
    public C034HelpOutput modifyMHHelp(C034HelpInput helpInput)
    {
        return request(helpInput, C034HelpOutput.class);
    }

    @Override
    public C035HelpOutput getMHHelpById(C035HelpInput helpInput)
    {
        return request(helpInput, C035HelpOutput.class);
    }

    @Override
    public C037SysEntrustPersonOutput registerSysEntrustPerson(C037SysEntrustPersonInput input)
    {
        // TODO Auto-generated method stub
        return request(input, C037SysEntrustPersonOutput.class);
    }

    @Override
    public C038ConstantOutput querySysConstantList(C038ConstantInput constantInput)
    {
        return request(constantInput, C038ConstantOutput.class);
    }

    @Override
    public C039ConstantOutput insertConstant(C039ConstantInput constantInput)
    {
        return request(constantInput, C039ConstantOutput.class);
    }

    @Override
    public C039ConstantOutput modifyConstant(C039ConstantInput constantInput)
    {
        return request(constantInput, C039ConstantOutput.class);
    }

    @Override
    public C039ConstantOutput delConstant(C039ConstantInput constantInput)
    {
        return request(constantInput, C039ConstantOutput.class);
    }

}
