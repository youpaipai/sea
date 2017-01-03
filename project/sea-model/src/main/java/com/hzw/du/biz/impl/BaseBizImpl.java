/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BaseBizImpl.java
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

import org.apache.commons.beanutils.BeanUtils;

import com.hzw.du.biz.BaseBiz;
import com.hzw.du.biz.bean.constant.BizErrorCode;
import com.hzw.du.biz.bean.constant.MemcachedConst;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.bean.ConstantBean;
import com.hzw.du.biz.bean.param.bean.PersonUserBean;
import com.hzw.du.biz.bean.param.bean.SubProSupplierUser;
import com.hzw.du.biz.bean.param.bean.SupplierUserBean;
import com.hzw.du.biz.bean.param.bean.UserBean;
import com.hzw.du.biz.bean.param.common.C001FileInput;
import com.hzw.du.biz.bean.param.common.C001FileOutput;
import com.hzw.du.biz.bean.param.common.C002FileDetail;
import com.hzw.du.biz.bean.param.common.C002FileInput;
import com.hzw.du.biz.bean.param.common.C002FileOutput;
import com.hzw.du.biz.bean.param.common.C003ProjectInput;
import com.hzw.du.biz.bean.param.common.C003ProjectOutput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectInput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectOutput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeDetail;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeInput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeOutput;
import com.hzw.du.biz.bean.param.common.C006LogInput;
import com.hzw.du.biz.bean.param.common.C006LogOutput;
import com.hzw.du.biz.bean.param.common.C007LogDetail;
import com.hzw.du.biz.bean.param.common.C007LogInput;
import com.hzw.du.biz.bean.param.common.C007LogOutput;
import com.hzw.du.biz.bean.param.common.C008LogDetail;
import com.hzw.du.biz.bean.param.common.C008LogInput;
import com.hzw.du.biz.bean.param.common.C008LogOutput;
import com.hzw.du.biz.bean.param.common.C009LoginInput;
import com.hzw.du.biz.bean.param.common.C009LoginOutput;
import com.hzw.du.biz.bean.param.common.C010UserDetail;
import com.hzw.du.biz.bean.param.common.C010UserInput;
import com.hzw.du.biz.bean.param.common.C010UserOutput;
import com.hzw.du.biz.bean.param.common.C011UserInput;
import com.hzw.du.biz.bean.param.common.C011UserOutput;
import com.hzw.du.biz.bean.param.common.C012UserInput;
import com.hzw.du.biz.bean.param.common.C012UserOutput;
import com.hzw.du.biz.bean.param.common.C013QueryProjectDetail;
import com.hzw.du.biz.bean.param.common.C013QueryProjectInput;
import com.hzw.du.biz.bean.param.common.C013QueryProjectOutput;
import com.hzw.du.biz.bean.param.common.C014QueryServerTimeInput;
import com.hzw.du.biz.bean.param.common.C014QueryServerTimeOutput;
import com.hzw.du.biz.bean.param.common.C015QueryTenderProjectDetail;
import com.hzw.du.biz.bean.param.common.C015QueryTenderProjectInput;
import com.hzw.du.biz.bean.param.common.C015QueryTenderProjectOutput;
import com.hzw.du.biz.bean.param.common.C016OrganizationInput;
import com.hzw.du.biz.bean.param.common.C016OrganizationOutput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProOutput;
import com.hzw.du.biz.bean.param.common.C017SubDetail;
import com.hzw.du.biz.bean.param.common.C017TenderProjectDetail;
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
import com.hzw.du.biz.bean.param.common.C025UserDetail;
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
import com.hzw.du.biz.bean.param.common.C030UserDetail;
import com.hzw.du.biz.bean.param.common.C030UserInput;
import com.hzw.du.biz.bean.param.common.C030UserOutput;
import com.hzw.du.biz.bean.param.common.C032UserInput;
import com.hzw.du.biz.bean.param.common.C032UserOutput;
import com.hzw.du.biz.bean.param.common.C033HelpDetail;
import com.hzw.du.biz.bean.param.common.C033HelpInput;
import com.hzw.du.biz.bean.param.common.C033HelpOutput;
import com.hzw.du.biz.bean.param.common.C034HelpInput;
import com.hzw.du.biz.bean.param.common.C034HelpOutput;
import com.hzw.du.biz.bean.param.common.C035HelpDetail;
import com.hzw.du.biz.bean.param.common.C035HelpInput;
import com.hzw.du.biz.bean.param.common.C035HelpOutput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonInput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonOutput;
import com.hzw.du.biz.bean.param.common.C038ConstantDetail;
import com.hzw.du.biz.bean.param.common.C038ConstantInput;
import com.hzw.du.biz.bean.param.common.C038ConstantOutput;
import com.hzw.du.biz.bean.param.common.C039ConstantInput;
import com.hzw.du.biz.bean.param.common.C039ConstantOutput;
import com.hzw.du.biz.bean.param.common.DemoInput;
import com.hzw.du.biz.bean.param.common.DemoOutput;
import com.hzw.du.biz.bean.param.common.RegisterSysOrganizationInput;
import com.hzw.du.biz.bean.param.common.RegisterSysUserInfoInput;
import com.hzw.du.biz.check.BaseInputCheck;
import com.hzw.du.biz.exception.BizException;
import com.hzw.du.common.date.DateUtil;
import com.hzw.du.common.md5.MD5Util;
import com.hzw.du.common.utils.StringUtils;
import com.hzw.du.model.mapper.MHHelp;
import com.hzw.du.model.mapper.SysAgency;
import com.hzw.du.model.mapper.SysConstant;
import com.hzw.du.model.mapper.SysEntrustPerson;
import com.hzw.du.model.mapper.SysFile;
import com.hzw.du.model.mapper.SysLog;
import com.hzw.du.model.mapper.SysOrganizatioin;
import com.hzw.du.model.mapper.SysPersonUser;
import com.hzw.du.model.mapper.SysSupplier;
import com.hzw.du.model.mapper.SysSupplierUser;
import com.hzw.du.model.mapper.SysUser;
import com.hzw.du.model.mapper.TbConnectNotice;
import com.hzw.du.model.mapper.TbProject;
import com.hzw.du.model.mapper.TbPurchaseFile;
import com.hzw.du.model.mapper.TbStandardSupplier;
import com.hzw.du.model.mapper.TbSub;
import com.hzw.du.model.mapper.TbTenderProject;
import com.hzw.du.model.page.MybatisPager;

/**
 * 基础业务服务
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseBizImpl extends BaseBizConfig  implements BaseBiz{

    /**
     * 
     * 函数功能描述：测试查询
     * @param input
     * @return
     */
    @Override
    public DemoOutput queryDemo(DemoInput input) {
        DemoOutput output = new DemoOutput();
        try{
            
            output.setErrorCode(BizErrorCode.SUCCESS_CODE);
            output.setErrorMsg("OK");
        }catch(Exception e){
            log.error("测试查询失败", e);
            output.setErrorCode(BizErrorCode.UNKNOW_ERROR_CODE);
            output.setErrorMsg("测试查询失败");
        }
        return output;
    }

    /**
     * 新增文件信息
     */
    @Override
    public C001FileOutput insertSysFile(C001FileInput fileInput)
    {
        C001FileOutput output = new C001FileOutput();
        try{
            SysFile file = BaseInputCheck.copyInputToDb(fileInput, SysFile.class);
            //校验返回生产对象是否为null
            checkObjIsNull(file);
            file.setIdeNumber(StringUtils.getUUID());
            file.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(file, fileInput.getUserId());
            
            Integer count = baseDao.insertSysFile(file);
            
            checkInsert(count);
            output.setFileId(file.getFileId());
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "新增文件信息失败");
        }
        return output;
    }

    /**
     * 获取文件信息
     */
    @Override
    public C002FileOutput getSysFileById(C002FileInput fileInput)
    {
        C002FileOutput output = new C002FileOutput();
        try{
            SysFile file = baseDao.querySysFileById(fileInput.getFileId());
            C002FileDetail fileDetail = new C002FileDetail();
            fileDetail.setFileId(file.getFileId());
            fileDetail.setFileName(file.getFileName());
            fileDetail.setOldFileName(file.getOldFileName());
            fileDetail.setFileDir(file.getFileDir());
            
            output.setFileDetail(fileDetail);
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "获取对象信息失败");
        }
        return output;
    }

    /**
     * 修改文件信息
     */
    @Override
    public C001FileOutput modifySysFile(C001FileInput fileInput)
    {
        C001FileOutput output = new C001FileOutput();
        try{
            SysFile file = new SysFile();
            file.setFileId(fileInput.getFileId());
            file.setStatus(SysConstants.STATUS.STATUS_DELETE);
            this.setOpaUserAndDate(file, fileInput.getUserId());
            
            Integer count = baseDao.modifySysFile(file);
            checkUpdate(count);
            
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "修改文件信息失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：项目立项、项目修改、项目删除
     * @param input
     * @return
     */
    @Override
    public C003ProjectOutput project(C003ProjectInput input) {
        C003ProjectOutput output = new C003ProjectOutput();
        try{
            //1、根据不同的操作类型做不同的操作
            if(SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType())){
                projectInsert(input, output);
            }else if(SysConstants.OPERATE_TYPE.OPERATE_MODIFY.equals(input.getOperateType())){
                
            }else if(SysConstants.OPERATE_TYPE.OPERATE_DELETE.equals(input.getOperateType())){
                
            }else{
                checkOperateType(input);
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "项目立项失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：招标项目立项、项目修改、项目删除
     * @param input
     * @return
     */
    @Override
    public C004TenderProjectOutput tenderProject(C004TenderProjectInput input) {
        C004TenderProjectOutput output = new C004TenderProjectOutput();
        try{
            //1、根据不同的操作类型做不同的操作
            if(SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(input.getOperateType())){
                tenderProjectInsert(input, output);
            }else{
                checkOperateType(input);
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "招标项目立项失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：查询公告表信息
     * @param input
     * @return
     */
    @Override
    public C005ConnectNoticeOutput queryConnectNotice(C005ConnectNoticeInput input) {
        C005ConnectNoticeOutput output = new C005ConnectNoticeOutput();
        try{
            //1、查询条件设置
            TbConnectNotice tbConnectNotice = new TbConnectNotice();
            tbConnectNotice.setTitle(input.getTitle());
            tbConnectNotice.setStatus(input.getStatus());
            
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            List<Long> idList = processIdListStr(input.getNoticeIdList(), Long.class);
            conditonMap.put("noticeIdList", idList);
            idList = processIdListStr(input.getTenderProjectIdList(), Long.class);
            conditonMap.put("tenderProjectIdList", idList);
            idList = processIdListStr(input.getSubIdList(), Long.class);
            conditonMap.put("subIdList", idList);
            conditonMap.put("likeTitle", input.getLikeTitle());
            List<Integer> idList2 = processIdListStr(input.getNoticeTypeList(), Integer.class);
            conditonMap.put("noticeTypeList", idList2);
            idList2 = processIdListStr(input.getNoticeNatureList(), Integer.class);
            conditonMap.put("noticeNatureList", idList2);
            List<String> idList3 = processIdListStr(input.getProjectTypeList(), String.class);
            conditonMap.put("tenderProjectType", idList3);
            processValueTimeRange("startTime", input.getStartTimeList(), conditonMap);
            processValueTimeRange("endTime", input.getEndTimeList(), conditonMap);
            
            tbConnectNotice.setConditonMap(conditonMap);
            MybatisPager pager = MybatisPager.factoryPageByPageSize(input.getCurrentPage(), input.getPageSize());
            tbConnectNotice.setPager(pager);
            //2、查询数据
            List<TbConnectNotice> list = baseDao.queryTbConnectNoticeList(tbConnectNotice);
            output.setTotalRows(pager.getTotalRows());
            if(list != null){
                Date serverTime = queryServerTime();
                for(TbConnectNotice item : list){
                    C005ConnectNoticeDetail detail = new C005ConnectNoticeDetail();
                    detail.setNoticeId(item.getNoticeId());
                    detail.setTenderProjectId(item.getTenderProjectId());
                    detail.setSubId(item.getSubId());
                    detail.setTitle(item.getTitle());
                    detail.setContent(item.getContent());
                    detail.setNoticeType(item.getNoticeType());
                    detail.setNoticeNature(item.getNoticeNature());
                    detail.setStartTime(item.getStartTime());
                    detail.setEndTime(item.getEndTime());
                    detail.setFileId(item.getFileId());
                    detail.setReleasesMedia(item.getReleasesMedia());
                    detail.setOpenTime(item.getOpenTime());
                    detail.setOpenAddress(item.getOpenAddress());
                    detail.setNoticeNum(item.getNoticeNum());
                    detail.setStatus(item.getStatus());
                    detail.setCreateTime(item.getCreateTime());
                    detail.setTenderProjectType(item.getTenderProjectType());
                    if(serverTime != null && item.getEndTime() != null){
                        int diffDays = DateUtil.daysDiff(serverTime, item.getEndTime());
                        if(diffDays <= 0){
                            detail.setRemainBidTime("0");
                            detail.setBidFlag(false);
                        }else{
                            detail.setRemainBidTime(diffDays + "");
                            detail.setBidFlag(true);
                        }
                    }else{
                        detail.setRemainBidTime("0");
                        detail.setBidFlag(false);
                    }
                    
                    output.getDetail().add(detail);
                }
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "查询公告信息失败");
        }
        return output;
    }
    

    /**
     * 
     * 函数功能描述：添加日志信息
     * @param logInput
     * @return
     */
    @Override
    public C006LogOutput insertSysLog(C006LogInput logInput)
    {
        C006LogOutput output = new C006LogOutput();
        try{
            SysLog log = BaseInputCheck.copyInputToDb(logInput, SysLog.class);
            //校验返回生产对象是否为null
            checkObjIsNull(log);
            log.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(log, logInput.getUserId());
            
            Integer count = baseDao.insertSysLog(log);
            
            checkInsert(count);
            output.setLogId(log.getLogId());
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "新增日志信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：日志信息列表（分页）
     * @param logInput
     * @return
     */
    @Override
    public C007LogOutput querySysLogList(C007LogInput logInput)
    {
        C007LogOutput output = new C007LogOutput();
        try
        {
            SysLog log = new SysLog();
            log.setLogType(logInput.getLogType());
            log.setRoleName(logInput.getRoleName());
            log.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            processValueTimeRange("operateTime", logInput.getOperateTimeList(), conditionMap);
            log.setConditonMap(conditionMap);
            MybatisPager pager = MybatisPager.factoryPageByPageSize(logInput.getCurrentPage());
            log.setPager(pager);
            List<SysLog> list = baseDao.querySysLogList(log);
            if (null != list && !list.isEmpty())
            {
                output.setTotalRows(pager.getTotalRows());
                for (SysLog sysLog : list)
                {
                    C007LogDetail logDetail = new C007LogDetail();
                    logDetail.setLogId(sysLog.getLogId());
                    logDetail.setLogType(sysLog.getLogType());
                    logDetail.setRoleName(sysLog.getRoleName());
                    logDetail.setOperator(sysLog.getOperator());
                    logDetail.setOperateTime(sysLog.getOperateTime());
                    logDetail.setIpaddr(sysLog.getIpAddr());
                    output.getLogDetailList().add(logDetail);
                }
                
            }
            //最后，输入正确码进行返回
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询日志信息失败");
        }

        return output;
    }

    /**
     * 
     * 函数功能描述：根据主键ID获取日志信息
     * @param logInput
     * @return
     */
    @Override
    public C008LogOutput getSysLogById(C008LogInput logInput)
    {
        C008LogOutput output = new C008LogOutput();
        try{
            SysLog log = baseDao.getSysLogById(logInput.getLogId());
            C008LogDetail logDetail = new C008LogDetail();
            logDetail.setOperator(log.getOperator());
            logDetail.setRoleName(log.getRoleName());
            logDetail.setIpAddr(log.getIpAddr());
            logDetail.setOperateTime(log.getOperateTime());
            logDetail.setMenuName(log.getMenuName());
            logDetail.setButtonName(log.getButtonName());
            logDetail.setReceiverName(log.getReceiverName());
            logDetail.setOperateNote(log.getOperateNote());
            logDetail.setRemark(log.getRemark());
            logDetail.setCreateUser(log.getCreateUser());
            logDetail.setCreateTime(log.getCreateTime());
            logDetail.setStatus(log.getStatus());
            
            output.setLogDetail(logDetail);
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "获取对象信息失败");
        }
        return output;
    }

    /**
     * 登陆验证通过用户名或手机号 验证密码是否正确
     */
	@Override
	public C009LoginOutput login(C009LoginInput input) {
		C009LoginOutput output = new C009LoginOutput();
        try{
            //查询用户名是存在
        	//1、条件设置
    		SysUser  user = new SysUser();
    		//多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            conditonMap.put("phoeOrLoginName", input.getLoginName());
            user.setConditonMap(conditonMap);
            //2、条件判断 
            List<SysUser> list = baseDao.querySysUserByPage(user);
            
            // //1 验证用户存在
            if(list == null || list.size() <= 0){
            	throw new BizException(BizErrorCode.ERROR_CODE_0004, "用户不存在");
            }else if(list.size() > 1){
            	throw new BizException(BizErrorCode.ERROR_CODE_0004, "用户异常");
            }
            
            SysUser currUser = list.get(0);
            // 最后登陆密码输错时间
            Date errorDate= currUser.getErrorDate();
            Date nowDate = this.queryServerTime();
            long count = 24*60*60*1000;
            
            //2 用户状态为锁定状态切时间没过24小时
            if(currUser.getStatus()==SysConstants.SYS_USER_STATUS.STATUS_7&&!DateUtil.jugeMentTime(errorDate, nowDate, count)){
                throw new BizException(BizErrorCode.ERROR_CODE_0004, "用户状态锁定");
            }
            //校验密码是否正确 密码正确 登陆成功
            if(input.getPassWord().equals(currUser.getPassword())){
                output.setLoginFlag(true);
                output.setUserId(""+currUser.getUserId());
                output.setUserName(currUser.getUserName());
                output.setPhone(currUser.getPhone());
                if(currUser.getCount()!=null&&currUser.getCount()>0){//登陆成功 重置密码错误相关数据
                    currUser.setErrorDate(null);
                    currUser.setCount(0);
                    currUser.setStatus(SysConstants.SYS_USER_STATUS.STATUS_9);
                }
                baseDao.upDateSysUser(currUser);//更新用户信息
                successProcess(output);
            }else{
                 if(currUser.getStatus()==SysConstants.SYS_USER_STATUS.STATUS_7&&DateUtil.jugeMentTime(errorDate, nowDate, count)){
                     currUser.setCount(1);
                     currUser.setErrorDate(new Date()); 
                 }else{
                     currUser.setCount(currUser.getCount()+1);//
                     currUser.setErrorDate(this.queryServerTime()); 
                     if(currUser.getCount()+1==5){//如果错错误次数为5次 则锁用户
                         currUser.setStatus(SysConstants.SYS_USER_STATUS.STATUS_7);  
                     }
                 }
                 baseDao.upDateSysUser(currUser);
                throw new BizException(BizErrorCode.ERROR_CODE_0004, "密码错误");
            }
               //更新用户信息
         
        }catch(Exception e){
            exProcess(e, output, "失败");
        }
        return output;
	}
	
    /**
     * 
     * 函数功能描述：查询所有主用户信息[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
	@Override
    public C010UserOutput querySysUserByPage(C010UserInput userInput)
    {
        C010UserOutput output = new C010UserOutput();
        try
        {
            SysUser user = new SysUser();
            user.setStaffCode(userInput.getStaffCode());
            user.setUserName(userInput.getUserName());
            user.setPhone(userInput.getPhone());
            user.setUserClassify(0);        // 主用户
            user.setStatus(SysConstants.SYS_USER_STATUS.STATUS_0);
            MybatisPager pager = MybatisPager.factoryPageByPageSize(userInput.getCurrentPage());
            user.setPager(pager);
            
            List<SysUser> list = baseDao.querySysUserByPage(user);
            output.setTotalRows(pager.getTotalRows());
            if (null != list && !list.isEmpty())
            {
                for (SysUser sysUser : list)
                {
                    C010UserDetail userDetail = new C010UserDetail();
                    userDetail.setUserId(sysUser.getUserId());
                    userDetail.setUserName(sysUser.getUserName());
                    userDetail.setUserType(sysUser.getUserType());
                    userDetail.setUserClassify(sysUser.getUserClassify());
                    userDetail.setPhone(sysUser.getPhone());
                    userDetail.setStaffCode(sysUser.getStaffCode());
                    userDetail.setReginDate(sysUser.getReginDate());
                    userDetail.setStatus(sysUser.getStatus());
                    output.getUserDetailList().add(userDetail);
                }
                
            }
            //最后，输入正确码进行返回
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询主用户信息失败");
        }

        return output;
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
        C011UserOutput output = new C011UserOutput();
        try
        {
            SysUser user = new SysUser();
            user.setStaffCode(userInput.getStaffCode());
            user.setPhone(userInput.getPhone());
            Integer count = baseDao.queryUserCount(user);
            if (0 < count)
            {
                throw new BizException(BizErrorCode.ERROR_CODE_0007, "用户信息已存在");
            }
            //最后，输入正确码进行返回
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "验证用户信息失败");
        }
        return output;
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
        C012UserOutput output = new C012UserOutput();
        try
        {
            SysUser user = new SysUser();
            user.setUserId(userInput.getUserId());
            user.setPassword(MD5Util.getSecret(userInput.getOldPassword()));
            Integer count = baseDao.queryUserCount(user);
            
            checkObjIsNull(count, "用户信息不存在");
            
            user.setPassword(MD5Util.getSecret(userInput.getNewPassword()));
            this.setOpaUserAndDate(user, user.getUserId());
            count = baseDao.modifyPassword(user);
            
            checkUpdate(count, "修改用户密码失败");
            
            //最后，输入正确码进行返回
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "修改用户密码失败");
        }
        return output;
    }
    
	/**
     * 
     * 函数功能描述：项目信息查询
     * @param input
     * @return
     */
    @Override
    public C013QueryProjectOutput queryProjectList(C013QueryProjectInput input) {
        C013QueryProjectOutput output = new C013QueryProjectOutput();
        try{
            //1、设置查询条件
            TbProject tbProject = new TbProject();
            tbProject.setProjectType(input.getProjectType());
            tbProject.setFundingSource(input.getFundingSource());
            tbProject.setConnector(input.getConnector());
            tbProject.setPhone(input.getPhone());
            tbProject.setProjectManager(input.getProjectManager());
            tbProject.setPurchaseType(input.getPurchaseType());
            tbProject.setCreateUser(input.getCreateUser());
            tbProject.setStatus(input.getStatus());
            
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            List<Long> idList = processIdListStr(input.getProjectIdList(), Long.class);
            //项目信息id列表
            conditonMap.put("projectIdList", idList);
            List<String> idList3 = processIdListStr(input.getProjectNumList(), String.class);
            //项目编号列表
            conditonMap.put("projectNumList", idList3);
            //项目编号；模糊查询使用
            conditonMap.put("projectNumLike", input.getProjectNumLike());
            idList3 = processIdListStr(input.getProjectNameList(), String.class);
            //项目名称列表
            conditonMap.put("projectNameList", idList3);
            //项目名称；模糊查询使用
            conditonMap.put("projectNameLike", input.getProjectNameLike());
            idList3 = processIdListStr(input.getRegionCodeList(), String.class);
            //项目所在行政区域代码列表
            conditonMap.put("regionCodeList", idList3);
            //创建的时间范围
            processValueTimeRange("createTime", input.getCreateTimeList(), conditonMap);
            tbProject.setConditonMap(conditonMap);
            
            //设置分页，不设置不分页
            MybatisPager pager = MybatisPager.factoryPageByPageSize(input.getCurrentPage(), input.getPageSize());
            tbProject.setPager(pager);
            
            //2、查询列表、处理列表并返回
            List<TbProject> list = baseDao.queryTbProjectList(tbProject);
            output.setTotalCount(pager.getTotalRows());
            
            if(list != null){
                for(TbProject item : list){
                    C013QueryProjectDetail detail = new C013QueryProjectDetail();
                    detail.setProjectId(item.getProjectId());
                    detail.setProjectNum(item.getProjectNum());
                    detail.setProjectName(item.getProjectName());
                    detail.setRegionCode(item.getRegionCode());
                    detail.setAddress(item.getAddress());
                    detail.setProjectType(item.getProjectType());
                    detail.setFundingSource(item.getFundingSource());
                    detail.setLegalPerson(item.getLegalPerson());
                    detail.setProjectScale(item.getProjectScale());
                    detail.setConnector(item.getConnector());
                    detail.setPhone(item.getPhone());
                    detail.setApprovalName(item.getApprovalName());
                    detail.setApprovalNumber(item.getApprovalNumber());
                    detail.setApprovalAuthority(item.getApprovalAuthority());
                    detail.setProjectManager(item.getProjectManager());
                    detail.setPurchaseType(item.getPurchaseType());
                    detail.setAreaName(item.getAreaName());
                    detail.setCreateTime(item.getCreateTime());
                    detail.setStatus(item.getStatus());
                    
                    output.getDetailList().add(detail);
                }
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "项目信息查询失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：获取服务器时间
     * @param input
     * @return
     */
    @Override
    public C014QueryServerTimeOutput queryServerTime(C014QueryServerTimeInput input) {
        C014QueryServerTimeOutput output = new C014QueryServerTimeOutput();
        try{
            
            Date serverTime = queryServerTime();
            output.setServerTime(serverTime);
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "获取服务器时间失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：招标人（代理机构）招标项目查询
     * @param input
     * @return
     */
    @Override
    public C015QueryTenderProjectOutput queryTenderProject(C015QueryTenderProjectInput input) {
        C015QueryTenderProjectOutput output = new C015QueryTenderProjectOutput();
        try{
            //1、条件设置
            TbTenderProject tbTenderProject = new TbTenderProject();
            tbTenderProject.setStatus(input.getStatus());
            tbTenderProject.setTenderProjectType(input.getTenderProjectType());
            
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            List<Long> idList = processIdListStr(input.getTenderProjectIdList(), Long.class);
            //招标项目id列表
            conditonMap.put("tenderProjectIdList", idList);
            idList = processIdListStr(input.getProjectIdList(), Long.class);
            //招标项目id列表
            conditonMap.put("projectIdList", idList);
            //招标项目编号列表
            List<String> idList2 = processIdListStr(input.getTenderProjectNumList(), String.class);
            conditonMap.put("tenderProjectNumList", idList2);
            //招标项目编号；模糊查询使用
            conditonMap.put("tenderProjectNumLike", input.getTenderProjectNumLike());
            //招标项目名称列表
            idList2 = processIdListStr(input.getTenderProjectNameList(), String.class);
            conditonMap.put("tenderProjectNameList", idList2);
            //招标项目名称；模糊查询使用
            conditonMap.put("tenderProjectNameLike", input.getTenderProjectNameLike());
            //监督部门id列表
            idList = processIdListStr(input.getOrgSuperviseDeptIdList(), Long.class);
            conditonMap.put("orgSuperviseDeptIdList", idList);
            //审核部门id列表
            idList = processIdListStr(input.getOrgApproveDeptIdList(), Long.class);
            conditonMap.put("orgApproveDeptIdList", idList);
            // 招标人id列表
            idList = processIdListStr(input.getTenderIdList(), Long.class);
            conditonMap.put("tenderIdList", idList);
            //招标方式列表
            List<Integer> idList3 = processIdListStr(input.getTenderModeList(), Integer.class);
            conditonMap.put("tenderModeList", idList3);
            //招标组织形式列表
            idList3 = processIdListStr(input.getTenderOrganziFormList(), Integer.class);
            conditonMap.put("tenderOrganziFormList", idList3);
            //创建人ID列表
            idList = processIdListStr(input.getUserIdList(), Long.class);
            conditonMap.put("userIdList", idList);
            processValueTimeRange("createTime", input.getCreateTimeList(), conditonMap);
            conditonMap.put("querySubNumFlag", input.getQuerySubNumFlag());
            conditonMap.put("queryPushNoticeFlag", input.getQueryPushNoticeFlag());
            conditonMap.put("queryChangeNoticeFlag", input.getQueryChangeNoticeFlag());
            conditonMap.put("querySupplierFlag", input.getQuerySupplierFlag());
            
            tbTenderProject.setConditonMap(conditonMap);
            
            //设置分页，不设置不分页
            dbBeanPager(tbTenderProject, input);
            
            //2、查询并处理返回结果
            List<TbTenderProject>  list = baseDao.queryTbTenderProjectList(tbTenderProject);
            if(list != null){
                for(TbTenderProject item : list){
                    C015QueryTenderProjectDetail detail = new C015QueryTenderProjectDetail();
                    detail.setTenderProjectId(item.getTenderProjectId());
                    detail.setProjectId(item.getProjectId());
                    detail.setTenderProjectNum(item.getTenderProjectNum());
                    detail.setTenderContent(item.getTenderContent());
                    detail.setOrgSuperviseDeptId(item.getOrgSuperviseDeptId());
                    detail.setOrgApproveDeptId(item.getOrgApproveDeptId());
                    detail.setTenderId(item.getTenderId());
                    detail.setTenderMode(item.getTenderMode());
                    detail.setTenderOrganziForm(item.getTenderOrganziForm());
                    detail.setContractFile(item.getContractFile());
                    detail.setSubMoney(item.getSubMoney());
                    detail.setSubReckonPrice(item.getSubReckonPrice());
                    detail.setCurrencyCode(item.getCurrencyCode());
                    detail.setPriceUnit(item.getPriceUnit());
                    detail.setTenderProjectType(item.getTenderProjectType());
                    detail.setCreateTime(item.getCreateTime());
                    detail.setStatus(item.getStatus());
                    detail.setSubNum(item.getSubNum());
                    detail.setPushNoticeNum(item.getPushNoticeNum());
                    detail.setChangeNoticeNum(item.getChangeNoticeNum());
                    detail.setSupplierNum(item.getSupplierNum());
                    
                    output.getDetailList().add(detail);
                }
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "招标人（代理机构）招标项目查询失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：操作组织架构
     * @param input
     * @return
     */

	@Override
	public C016OrganizationOutput operateOrganization(C016OrganizationInput input) {
		C016OrganizationOutput output = new C016OrganizationOutput();
		
	        try{
	            // 获取操作类型
	        	String  operateType = input.getOperateType();
	        	SysOrganizatioin 	sysOrganizatioin =	BaseInputCheck.copyInputToDb(input, SysOrganizatioin.class);
	        	if(SysConstants.OPERATE_TYPE.OPERATE_ADD.equals(operateType)){//新增
	        		long sysOrganizatioinId =  baseDao.insertSysOrganizatioin(sysOrganizatioin);
	        		output.setOrganizationId(sysOrganizatioinId);
	        	}else if(SysConstants.OPERATE_TYPE.OPERATE_MODIFY.equals(operateType)){//修改
	        		baseDao.updateSysOrganizatioin(sysOrganizatioin);
	        	}else if(SysConstants.OPERATE_TYPE.OPERATE_DELETE.equals(operateType)){//删除	
	        		baseDao.updateSysOrganizatioin(sysOrganizatioin);
	        	}
	            //最后，输入正确码进行返回
	            successProcess(output);
	        }catch(Exception e){
	            exProcess(e, output, "获取服务器时间失败");
	        }
	        return output;
	}

	/**
     * 
     * 函数功能描述：供应商查询招标的项目信息查询
     * @param input
     * @return
     */
    @Override
    public C017QuerySupplierProOutput querySupplierPro(C017QuerySupplierProInput input) {
        C017QuerySupplierProOutput output = new C017QuerySupplierProOutput();
        try{
            //1、设置查询条件
            TbStandardSupplier tbStandardSupplier = new TbStandardSupplier();
            
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            //招标项目id列表
            List<Long> idList = processIdListStr(input.getTenderProjectIdList(), Long.class);
            conditonMap.put("tenderProjectIdList", idList);
            //招标项目id列表
            idList = processIdListStr(input.getSubIdList(), Long.class);
            conditonMap.put("subIdList", idList);
            //招标项目编号列表
            List<String> idList2 = processIdListStr(input.getTenderProjectNumList(), String.class);
            conditonMap.put("tenderProjectNumList", idList2);
            //招标项目编号；模糊查询使用
            conditonMap.put("tenderProjectNumLike", input.getTenderProjectNumLike());
            //招标项目名称列表
            idList2 = processIdListStr(input.getTenderProjectNameList(), String.class);
            conditonMap.put("tenderProjectNameList", idList2);
            //招标项目名称；模糊查询使用
            conditonMap.put("tenderProjectNameLike", input.getTenderProjectNameLike());
            //中标状态
            conditonMap.put("bidStatus", input.getBidStatus());
            //参标供应商id列表
            idList2 = processIdListStr(input.getSupplierUserIdList(), String.class);
            conditonMap.put("supplierUserIdList", idList2);
            processValueTimeRange("createTime", input.getCreateTimeList(), conditonMap);
            processValueTimeRange("openTime", input.getOpenTimeList(), conditonMap);
            
            tbStandardSupplier.setConditonMap(conditonMap);
            
            //设置分页，不设置不分页
            dbBeanPager(tbStandardSupplier, input);
            
            //2、查询项目信息
            List<TbStandardSupplier> detailList = baseDao.querySupplierProjectByPage(tbStandardSupplier);
            output.setTotalRows(tbStandardSupplier.getPager().getTotalRows());
            List<Long> tenderProjectIdList = null;
            if(detailList != null){
                tenderProjectIdList = new ArrayList<Long>();
                for(TbStandardSupplier item : detailList){
                    if(item == null ){
                        continue;
                    }
                    
                    C017TenderProjectDetail detail = new C017TenderProjectDetail();
                    detail.setSupplierUserId(item.getSupplierUserId());
                    detail.setTenderProjectId(item.getTenderProjectId());
                    detail.setProjectId(item.getProjectId());
                    detail.setTenderProjectNum(item.getTenderProjectNum());
                    detail.setTenderProjectName(item.getTenderProjectName());
                    if(item.getSubNum() != null && item.getSubNum() > 0){
                        detail.setHaveSubFlag(SysConstants.BOOLEAN_TYPE.TRUE);
                    }else{
                        detail.setHaveSubFlag(SysConstants.BOOLEAN_TYPE.FALSE);
                    }
                    detail.setStatus(item.getStatus());
                    
                    output.getDetailList().add(detail);
                    tenderProjectIdList.add(detail.getTenderProjectId());
                }
            }
            
            //3、查询项目和标段信息
            if(tenderProjectIdList != null && tenderProjectIdList.size() > 0){
                //注意这里不分页了
                tbStandardSupplier.setPager(null);
                if(tbStandardSupplier.getConditonMap() == null){
                    tbStandardSupplier.setConditonMap(new HashMap<String, Object>());
                }
                tbStandardSupplier.getConditonMap().put("tenderProjectIdList", tenderProjectIdList);
                
                List<TbStandardSupplier> subDetailList =  baseDao.querySupplierSubDetailByPage(tbStandardSupplier);
                for(TbStandardSupplier item : subDetailList){
                    C017SubDetail detail = new C017SubDetail();
                    detail.setStandardId(item.getStandardId());
                    detail.setSupplierUserId(item.getSupplierUserId());
                    detail.setTenderProjectId(item.getTenderProjectId());
                    detail.setSubId(item.getSubId());
                    detail.setSubName(item.getSubName());
                    detail.setSubContent(item.getSubContent());
                    detail.setOpenTime(item.getOpenTime());
                    detail.setOpenAddress(item.getOpenAddress());
                    detail.setBidStatus(item.getBidStatus());
                    detail.setAbnormalFlag(item.getAbnormalFlag());
                    
                    output.getSubDetailList().add(detail);
                }
            }
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "投标项目信息查询失败");
        }
        
        return output;
    }
    /**
     * 
     * 函数功能描述：供应商注册
     * @param input
     * @return
     */
	@Override
	public C020SysSupplierOutput saveSysSupplier(C020SysSupplierInput input) {
		C020SysSupplierOutput output = new C020SysSupplierOutput() ;
		 try{
	        	String  operateType = input.getOperateType();
	        	SysSupplier sysSupplier =	BaseInputCheck.copyInputToDb(input, SysSupplier.class);
	        	long  supplieId = 	baseDao.insertSysSupplier(sysSupplier);
	        	output.setSupplierId(supplieId);
	            //最后，输入正确码进行返回
	            successProcess(output);
	        }catch(Exception e){
	            exProcess(e, output, "获取服务器时间失败");
	        }
	        return output;
	}
	/**
     * 
     * 函数功能描述：代理机构注册
     * @param input
     * @return
     */
	@Override
	public C021SysAgencyOutput saveSysAgency(C021SysAgencyInput input) {
		C021SysAgencyOutput output = new C021SysAgencyOutput();
		 try{
	        	RegisterSysOrganizationInput  organizationInput = input.getRegisterSysOrganizationInput();
	    		RegisterSysUserInfoInput   userInfoInput = input.getRegisterSysUserInfoInput();
	    		
	    		
	    		SysOrganizatioin sysOrganizatioin=new SysOrganizatioin();
	    		//复制值到组织机构对象
	    		BeanUtils.copyProperties(sysOrganizatioin, organizationInput);
	    		//fisrt step save 组织机构 获取组织机构ID
	    		long organizationId = 	baseDao.insertSysOrganizatioin(sysOrganizatioin);
	    		//复制值到userInfo
	    		SysUser userInfo =new SysUser();
	    		BeanUtils.copyProperties(userInfo, userInfoInput);
	    		//设置组织机构ID
	    		userInfo.setOrganizationId(organizationId);
	    		long userId = baseDao.insertSysUser(userInfo);
	    		//转换值到
	    		SysAgency agency = BaseInputCheck.copyInputToDb(input, SysAgency.class);
	    		// 设置代理机构 创建人ID 和组织机构ID
	    		agency.setCreateUser(userId);
	    		agency.setOrganizationId(organizationId);
	    		long agencyId = baseDao.insertSysAgency(agency);
	    		//设置返回信息
	    		output.setSysAgencyId(agencyId);
	    		output.setSysOrganizationId(organizationId);
	    		output.setSysUserId(userId);
	            //最后，输入正确码进行返回
	            successProcess(output);
	        }catch(Exception e){
	            exProcess(e, output, "获取服务器时间失败");
	        }
	        return output;
	}
	
	
	/**
     * 函数功能描述：参标供应商 参标项目
     * @param input
     * @return
     */    
    @Override
    public C022StandardSupplierAddOutput standardSupplierAdd(C022StandardSupplierAddInput input) {
        C022StandardSupplierAddOutput output = new C022StandardSupplierAddOutput();
        try{
            //1、校验参数
            BaseInputCheck.checkC022_Add(input);
            
            //2、组织要添加的用户ID以及标段ID，用来判断供应商是否可以正确参标
            //参标供应商ID List
            List<Long> userIdList = new ArrayList<Long>();
            Map<String, Long> userIdMap = new HashMap<String, Long>();
            //标段ID List
            List<Long> subIdList = new ArrayList<Long>();
            
            for(SubProSupplierUser proItem : input.getSubProSupplierList()){
                for(Long supplierItem : proItem.getSupplierUserIdList()){
                    if(userIdMap.containsKey(supplierItem.toString())){
                        continue;
                    }
                    userIdMap.put(supplierItem.toString(), supplierItem);
                    userIdList.add(supplierItem);
                }
                subIdList.add(proItem.getSubId());
            }
            if(userIdList.size() <= 0){
                throw new BizException(BizErrorCode.ERROR_CODE_0009, BizErrorCode.ERROR_Msg_0009);
            }
            
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            /*
             * 3-1、查询标段信息
             */
            conditonMap.clear();
            TbSub tbSubCon = new TbSub();
            conditonMap.put("subIdList", subIdList);
            tbSubCon.setConditonMap(conditonMap);
            List<TbSub>  tbSubLsit = baseDao.queryTbSubList(tbSubCon);
            if(tbSubLsit == null || tbSubLsit.size() <= 0){
                throw new BizException(BizErrorCode.ERROR_CODE_0010, BizErrorCode.ERROR_Msg_0010);
            }
            Map<String, TbSub> tbSubMap = new HashMap<String , TbSub>();
            for(TbSub item : tbSubLsit){
                tbSubMap.put(item.getSubId().toString(), item);
            }
            
            /*
             * 3-2查询供应商信息以及组织机构信息
             */
            conditonMap.clear();
            SysUser sysUserCon = new SysUser();
            sysUserCon.setStatus(SysConstants.SYS_USER_STATUS.STATUS_0);
            conditonMap.put("userIdList", userIdList);
            sysUserCon.setConditonMap(conditonMap);
            List<SysUser>  sysUserList = baseDao.querySysUserAndOrgInfoByPage(sysUserCon);
            if(sysUserList == null || sysUserList.size() <= 0){
                throw new BizException(BizErrorCode.ERROR_CODE_0009, BizErrorCode.ERROR_Msg_0009);
            }
            Map<String, SysUser> sysUserMap = new HashMap<String, SysUser>();
            for(SysUser sysUserItem : sysUserList){
                if(sysUserItem == null){
                    continue;
                }
                sysUserMap.put(sysUserItem.getUserId().toString(), sysUserCon);
            }
            if(sysUserMap.size() <= 0){
                throw new BizException(BizErrorCode.ERROR_CODE_0009, BizErrorCode.ERROR_Msg_0009);
            }
            
            /*
             * 3-3、查询已参加的供应商（根据组织机构来判断是否已经参标了），
             */
            conditonMap.clear();
            TbStandardSupplier querySupplierCon = new TbStandardSupplier();
            querySupplierCon.setTenderProjectId(input.getTenderProjectId());
            querySupplierCon.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            //招标项目id列表
            conditonMap.put("subIdList", subIdList);
            querySupplierCon.setConditonMap(conditonMap);
            List<TbStandardSupplier> querySupplierList = baseDao.queryTbStandardSupplierList(querySupplierCon);
            Map<String, TbStandardSupplier> supplierMap = null;
            if(querySupplierList != null && querySupplierList.size() > 0){
                supplierMap = new HashMap<String, TbStandardSupplier>();
                for(TbStandardSupplier item : querySupplierList){
                    //这里一定是标段ID和组织机构id联合成的key，因为参标供应商是根据组织机构为单位就行参标的
                    supplierMap.put(item.getSubId() + "_" + item.getSupplierOrgId(), item);
                }
            }
            
            /*
             *  3-4、查询招标文件是否上传 
             */
            Map<String, TbPurchaseFile> tbPurchaseFileMap = queryTbPurchaseFile(input.getTenderProjectId());
            
            //4、添加供应商参标项目
            StringBuffer sb = new StringBuffer();
            
            List<TbStandardSupplier> tbStandardSupplierList = new ArrayList<TbStandardSupplier>();
            for(SubProSupplierUser proItem : input.getSubProSupplierList()){
                //判断项目是否存在
                if(!tbSubMap.containsKey(proItem.getSubId().toString())){
                    if(input.getSubProSupplierList().size() > 1){
                        sb.append("ID为[").append(proItem.getSubId().toString()).append("]的项目或者标段不存在\n");
                    }
                }
                for(Long supplierItem : proItem.getSupplierUserIdList()){
                    //判断用户是否存在
                    SysUser sysUser = sysUserMap.get(supplierItem.toString());
                    if(sysUser == null){
                        sb.append("参标供应商ID为[").append(supplierItem.toString())
                        .append("]不存在，项目或标段ID为[").append(proItem.getSubId().toString()).append("]\n");
                        continue;
                    }
                    //判断该供应商是否有组织机构参标过了
                    TbStandardSupplier tbStanSupplier = supplierMap.get(supplierItem.toString() + "_" + sysUser.getOrganizationId().toString());
                    if(tbStanSupplier != null){
                        sb.append("参标供应商ID为[").append(supplierItem.toString())
                        .append("]所在组织机构已经参标ID为[").append(proItem.getSubId().toString()).append("]的项目或标段\n");
                        continue;
                    }
                    //判断该标段是否上传了招标文件
                    TbPurchaseFile tbPurchaseFile2 = tbPurchaseFileMap.get(input.getTenderProjectId() + "_" + proItem.getSubId());
                    if(tbPurchaseFile2 == null){
                        sb.append("参标供应商ID为[").append(supplierItem.toString())
                        .append("]，项目或标段ID为[").append(proItem.getSubId().toString()).append("]的招标文件还未上传，供应商无法参标该项目或者标段\n");
                        continue;
                    }
                    TbStandardSupplier tbStandardSupplier = new TbStandardSupplier();
                    tbStandardSupplier.setStandardId(baseDao.queryNextSeqStandardId());
                    tbStandardSupplier.setTenderProjectId(input.getTenderProjectId());
                    tbStandardSupplier.setSubId(proItem.getSubId());
                    tbStandardSupplier.setSupplierOrgId(sysUser.getOrganizationId());
                    tbStandardSupplier.setSupplierOrgName(sysUser.getOrganizationName());
                    tbStandardSupplier.setSupplierUserId(sysUser.getUserId());
                    tbStandardSupplier.setSupplierUserName(sysUser.getUserName());
                    tbStandardSupplier.setPhone(sysUser.getPhone());
                    tbStandardSupplier.setIsPayment(SysConstants.IS_PAYMENT.FALSE);
                    tbStandardSupplier.setIsInvite(input.getIsInvite());
                    //如果招标文件不收标书费，那么直接开通
                    if(SysConstants.CHARGING_TYPE.FREE.equals(tbPurchaseFile2.getChargingType())){
                        tbStandardSupplier.setIsDownPower(SysConstants.IS_DOWN_POWER.TRUE);
                    }else{
                        tbStandardSupplier.setIsDownPower(SysConstants.IS_DOWN_POWER.FALSE);
                    }
                    tbStandardSupplier.setStatus(SysConstants.STATUS.STATUS_NORMAL);
                    
                    if(input.getIsInvite() == SysConstants.IS_INVITE.TRUE){
                        setOpaUserAndDate(tbStandardSupplier, input.getPersonUserId());
                    }else{
                        setOpaUserAndDate(tbStandardSupplier, supplierItem);
                    }
                    
                    tbStandardSupplierList.add(tbStandardSupplier);
                }
            }
            
            //5、批量插入
            conditonMap.clear();
            TbStandardSupplier tbStandardSupplierCon = new TbStandardSupplier();
            conditonMap.put("tbStandardSupplierList", tbStandardSupplierList);
            tbStandardSupplierCon.setConditonMap(conditonMap);
            Integer rows = baseDao.insertTbStandardSupplierBatch(tbStandardSupplierCon);
            //校验是否插入成功
            checkInsert(rows);
            
            output.setRemark(sb.toString());
            
            //最后，输入正确码进行返回
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "参标失败");
        }
        return output;
    }
    
    
		
		
	/**
     * 
     * 函数功能描述：查询数据字典信息(memcached)
     * @param constantInput
     * @return
     */
	@Override
    public C018ConstantOutput queryConstantList(C018ConstantInput constantInput)
	{
	    C018ConstantOutput output = new C018ConstantOutput();
        try
        {
            output.setConstantMap((Map<String, ConstantBean>) memcachedBiz.get(MemcachedConst.MEM_SYS_CONSTANT));
            //最后，输入正确码进行返回
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询数据字典信息失败");
        }

        return output;
	}
	
	/**
	 * 
	 * 函数功能描述：查询数据字典信息
	 * @return
	 */
	@Override
	public Map<String, ConstantBean> queryConstantList()
	{
	    SysConstant constant = new SysConstant();
	    constant.setStatus(SysConstants.STATUS.STATUS_NORMAL);
        List<SysConstant> list = baseDao.querySysConstantList(constant);
        Map<String, ConstantBean> constantMap = new HashMap<String, ConstantBean>();
        
        if (null != list && !list.isEmpty())
        {
            Map<Long, ConstantBean> constantMaps = new HashMap<Long, ConstantBean>();
            for (SysConstant sysConstant : list)
            {
                ConstantBean detail = new ConstantBean();
                detail.setConstantId(sysConstant.getConstantId());
                detail.setCodeName(sysConstant.getCodeName());
                detail.setCodeVal(sysConstant.getCodeVal());
                detail.setOrderFlag(sysConstant.getOrderFlag());
                detail.setCodeLevel(sysConstant.getCodeLevel());
                detail.setCodeType(sysConstant.getCodeType());
                detail.setParentId(sysConstant.getParentId());
                // 判断是否有上级目录
                if (0L == sysConstant.getParentId() || null == constantMaps.get(detail.getParentId()))
                {
                    detail.setConstantBeanList(new ArrayList<ConstantBean>());
                    constantMaps.put(detail.getConstantId(), detail);
                }
                else
                {
                    constantMaps.get(detail.getParentId()).getConstantBeanList().add(detail);
                }
            }
            // 将map中key值转换成codeType，便于之前获取数据
            for (ConstantBean detail : constantMaps.values())
            {
                constantMap.put(detail.getCodeType(), detail);
            }
        }
        return constantMap;
	}
	
	/**
     * 
     * 函数功能描述：用户基本信息：登陆名、别名 、密码(新增、修改)
     * @return
     */
    @Override
    public C024RegisterSysUserOutput registerSysUser(C024RegisterSysUserInput input)
    {
        C024RegisterSysUserOutput output = new C024RegisterSysUserOutput();
        try{
                String operatype = input.getOperateType();
                SysUser user = BaseInputCheck.copyInputToDb(input, SysUser.class);
                //新增用户信息
                if(operatype.equals(SysConstants.OPERATE_TYPE.OPERATE_ADD)){
                    
                    long sysUserId = baseDao.insertSysUser(user);
                output.setSysUserId(sysUserId);
                }
                //更新用户信息
                else if(operatype.equals(SysConstants.OPERATE_TYPE.OPERATE_MODIFY)){
                    baseDao.upDateSysUser(user);
                }
               //最后，输入正确码进行返回
               successProcess(output);
           }catch(Exception e){
               exProcess(e, output, "获取服务器时间失败");
           }
           return output;
    }


    /**
     * 
     * 函数功能描述：子用户信息列表（分页）
     * @param logInput
     * @return
     */
    @Override
    public C025UserOutput querySubUserList(C025UserInput userInput)
    {
        C025UserOutput output = new C025UserOutput();
        try
        {
            // 查询主用户信息
            SysUser user = baseDao.getSysUserById(userInput.getUserId());
            C025UserDetail detail = new C025UserDetail();
            BeanUtils.copyProperties(detail, user);
            output.setUserDetail(detail);
            user.setUserId(userInput.getUserId());
            
            // 查询子用户信息列表
            user = new SysUser();
            user.setUserId(userInput.getUserId());
            user.setUserClassify(1);        // 子用户
            MybatisPager pager = MybatisPager.factoryPageByPageSize(userInput.getCurrentPage());
            user.setPager(pager);
            
            List<SysUser> list = baseDao.querySysUserByPage(user);
            output.setTotalRows(pager.getTotalRows());
            if (null != list && !list.isEmpty())
            {
                for (SysUser sysUser : list)
                {
                    detail = new C025UserDetail();
                    BeanUtils.copyProperties(detail, sysUser);
                    output.getUserList().add(detail);
                }
                
            }
            //最后，输入正确码进行返回
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询子用户信息失败");
        }
        return output;
    }
	
    /**
     * 
     * 函数功能描述：对用户进行操作 启用 停用 删除
     * @param userInput
     * @return
     */
    @Override
    public C026UserOutput modifyUserStatus(C026UserInput userInput)
    {
        C026UserOutput output = new C026UserOutput();
        try{
            //多余条件添加
            Map<String, Object> conditonMap = new HashMap<String, Object>();
            conditonMap.put("userIdList", userInput.getUserIdList());
            
            SysUser user = new SysUser();
            user.setConditonMap(conditonMap);
            user.setStatus(userInput.getStatus());
            this.setOpaUserAndDate(user, userInput.getUserId());
            
            Integer count = baseDao.modifyUserStatus(user);
            // 检查结果
            checkUpdate(count);
            
            successProcess(output);
        }catch(Exception e){
            exProcess(e, output, "修改用户状态失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：初始化新增用户信息
     * @param userInput
     * @return
     */
    @Override
    public C027UserOutput initAddUser(C027UserInput userInput)
    {
        C027UserOutput output = new C027UserOutput();
        try
        {
            // 获取数据字典（memcached）
            Map<String, ConstantBean> constantMap = (Map<String, ConstantBean>) memcachedBiz.get(MemcachedConst.MEM_SYS_CONSTANT);
            // 用户类型
            ConstantBean uhlx = constantMap.get(MemcachedConst.MEM_CONSTANTS.MEM_UHLX);
            output.setUhlxList(uhlx.getConstantBeanList());
            
            //证件类型数据
            ConstantBean sfz = constantMap.get(MemcachedConst.MEM_CONSTANTS.MEM_SFZ);
            output.setSfzList(sfz.getConstantBeanList());
            
            successProcess(output);
        }
        catch(Exception e)
        {
            exProcess(e, output, "初始化新增用户信息失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：新增用户信息
     * @param userInput
     * @return
     */
    @Override
    public C028UserOutput addUser(C028UserInput userInput)
    {
        C028UserOutput output = new C028UserOutput();
        try
        {
            // 新增用户信息
            SysUser user = new SysUser();
            BeanUtils.copyProperties(user, userInput.getUserBean());
            //校验返回生产对象是否为null
            checkObjIsNull(user);
            user.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(user, userInput.getLoginUserId());
            
            Integer count = baseDao.insertSysUser(user);
            checkInsert(count);
            
            // 判断用户类型
            if (SysConstants.SYS_USER_TYPE.USER_TYPE_SUPPLIER == user.getUserType())
            {
                SysSupplierUser supplierUser = new SysSupplierUser();
                BeanUtils.copyProperties(supplierUser, userInput.getSupplierUserBean());
                
                //校验返回生产对象是否为null
                checkObjIsNull(user);
                supplierUser.setStatus(SysConstants.STATUS.STATUS_NORMAL);
                this.setOpaUserAndDate(supplierUser, userInput.getLoginUserId());
                
                count = baseDao.insertSysSupplierUser(supplierUser);
                checkInsert(count);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_TENDER_PERSON == user.getUserType())
            {
                SysPersonUser personUser = new SysPersonUser();
                BeanUtils.copyProperties(personUser, userInput.getPersonUserBean());
                
                //校验返回生产对象是否为null
                checkObjIsNull(user);
                personUser.setStatus(SysConstants.STATUS.STATUS_NORMAL);
                this.setOpaUserAndDate(personUser, userInput.getLoginUserId());
                
                count = baseDao.insertSysPersonUser(personUser);
                checkInsert(count);
            }
            output.setUserId(user.getUserId());
            successProcess(output);
            
            successProcess(output);
        }
        catch(Exception e)
        {
            exProcess(e, output, "新增用户信息失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：修改用户信息
     * @param userInput
     * @return
     */
    @Override
    public C028UserOutput modifyUser(C028UserInput userInput)
    {
        C028UserOutput output = new C028UserOutput();
        try
        {
            // 修改用户信息
            SysUser user = new SysUser();
            BeanUtils.copyProperties(user, userInput.getUserBean());
            //校验返回生产对象是否为null
            checkObjIsNull(user);
            user.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(user, userInput.getLoginUserId());
            
            Integer count = baseDao.modifySysUser(user);
            checkInsert(count);
            
            // 判断用户类型
            if (SysConstants.SYS_USER_TYPE.USER_TYPE_SUPPLIER == user.getUserType())
            {
                SysSupplierUser supplierUser = new SysSupplierUser();
                BeanUtils.copyProperties(supplierUser, userInput.getSupplierUserBean());
                
                //校验返回生产对象是否为null
                checkObjIsNull(user);
                supplierUser.setStatus(SysConstants.STATUS.STATUS_NORMAL);
                this.setOpaUserAndDate(supplierUser, userInput.getLoginUserId());
                
                count = baseDao.modifySysSupplierUser(supplierUser);
                checkInsert(count);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_TENDER_PERSON == user.getUserType())
            {
                SysPersonUser personUser = new SysPersonUser();
                BeanUtils.copyProperties(personUser, userInput.getPersonUserBean());
                
                //校验返回生产对象是否为null
                checkObjIsNull(user);
                personUser.setStatus(SysConstants.STATUS.STATUS_NORMAL);
                this.setOpaUserAndDate(personUser, userInput.getLoginUserId());
                
                count = baseDao.modifySysPersonUser(personUser);
                checkInsert(count);
            }
            output.setUserId(user.getUserId());
            successProcess(output);
            
            successProcess(output);
        }
        catch(Exception e)
        {
            exProcess(e, output, "修改用户信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：初始化修改用户信息
     * @param userInput
     * @return
     */
    @Override
    public C029UserOutput initModifyUser(C029UserInput userInput)
    {
        C029UserOutput output = new C029UserOutput();
        try
        {
            
            // 获取数据字典（memcached）
            Map<String, ConstantBean> constantMap = (Map<String, ConstantBean>) memcachedBiz.get(MemcachedConst.MEM_SYS_CONSTANT);
            // 用户类型
            ConstantBean uhlx = constantMap.get(MemcachedConst.MEM_CONSTANTS.MEM_UHLX);
            output.setUhlxList(uhlx.getConstantBeanList());
            
            //证件类型数据
            ConstantBean sfz = constantMap.get(MemcachedConst.MEM_CONSTANTS.MEM_SFZ);
            output.setSfzList(sfz.getConstantBeanList());
            
            SysUser user = baseDao.getSysUserById(userInput.getUserId());
            UserBean userBean = new UserBean();
            BeanUtils.copyProperties(userBean, user);
            output.setUserBean(userBean);
            
            // 判断用户类型
            if (SysConstants.SYS_USER_TYPE.USER_TYPE_SUPPLIER == user.getUserType())
            {
                SysSupplierUser supplierUser = baseDao.querySysSupplierUserById(user.getUserId());
                SupplierUserBean supplierUserBean = new SupplierUserBean();
                BeanUtils.copyProperties(supplierUserBean, supplierUser);
                output.setSupplierUserBean(supplierUserBean);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_TENDER_PERSON == user.getUserType())
            {
                SysPersonUser personUser = baseDao.querySysPersonUserById(user.getUserId());
                PersonUserBean personUserBean = new PersonUserBean();
                BeanUtils.copyProperties(personUserBean, personUser);
                output.setPersonUserBean(personUserBean);
            }
            
            
            successProcess(output);
        }
        catch(Exception e)
        {
            exProcess(e, output, "初始化修改用户信息失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：修改用户信息
     * @param userInput
     * @return
     */
    @Override
    public C030UserOutput queryUserOrgList(C030UserInput userInput)
    {
        C030UserOutput output = new C030UserOutput();
        try
        {
            SysOrganizatioin organization = new SysOrganizatioin();
            organization.setType(userInput.getType());
            organization.setOrganizationId(userInput.getOrganizationId());
            organization.setOrganizationName(userInput.getOrganiztionName());
            MybatisPager pager = MybatisPager.factoryPageByPageSize(userInput.getCurrentPage());
            organization.setPager(pager);
            List<SysOrganizatioin> list = baseDao.querySysOrganizatioinList(organization);
            if (null != list && !list.isEmpty())
            {
                output.setTotalRows(pager.getTotalRows());
                for (SysOrganizatioin sysOrganizatioin : list)
                {
                    C030UserDetail detail = new C030UserDetail();
                    BeanUtils.copyProperties(detail, sysOrganizatioin);
                    output.getDetailList().add(detail);
                }
            }
            successProcess(output);
        }
        catch(Exception e)
        {
            exProcess(e, output, "修改用户信息失败");
        }
        return output;
    }
    
    /**
     * 
     * 函数功能描述：个人中心
     * @param userInput
     * @return
     */
    @Override
    public C032UserOutput getPersonCenter(C032UserInput userInput)
    {
        C032UserOutput output = new C032UserOutput();
        try
        {
            // 判断用户类型
            // 系统管理员个人中心
            if (SysConstants.SYS_USER_TYPE.USER_TYPE_ADMIN == userInput.getUserType())
            {
                // 新注册用户个数
                SysUser user = new SysUser();
                user.setUserType(SysConstants.SYS_USER_STATUS.STATUS_2);
                Integer newUserCount = baseDao.queryUserCount(user);
                output.setNewUserCount(newUserCount);

                // 用户信息变更个数
                user.setUserType(SysConstants.SYS_USER_STATUS.STATUS_4);
                Integer modifyUserCount = baseDao.queryUserCount(user);
                output.setModifyUserCount(modifyUserCount);

                SysOrganizatioin organization = new SysOrganizatioin();
                organization.setType(SysConstants.SYS_USER_TYPE.USER_TYPE_TENDER_PERSON);
                organization.setStatus(SysConstants.SYS_ORGANIZATION_STATUS.STATUS_1);
                // 新注册招标人个数
                Integer newPersonCount = baseDao.getOrgCount(organization);
                output.setNewPersonCount(newPersonCount);

                // 招标人信息变更个数
                organization.setStatus(SysConstants.SYS_ORGANIZATION_STATUS.STATUS_3);
                Integer modifyPersonCount = baseDao.getOrgCount(organization);
                output.setModifyPersonCount(modifyPersonCount);

                // 新注册供应商个数 
                organization.setType(SysConstants.SYS_USER_TYPE.USER_TYPE_SUPPLIER);
                organization.setStatus(SysConstants.SYS_ORGANIZATION_STATUS.STATUS_1);
                Integer newSupplierCount = baseDao.getOrgCount(organization);
                output.setNewSupplierCount(newSupplierCount);

                // 供应商信息变更个数
                organization.setStatus(SysConstants.SYS_ORGANIZATION_STATUS.STATUS_3);
                Integer modifySupplierCount = baseDao.getOrgCount(organization);
                output.setModifySupplierCount(modifySupplierCount);

                // 新注册代理机构个数
                organization.setType(SysConstants.SYS_USER_TYPE.USER_TYPE_AGENCY);
                organization.setStatus(SysConstants.SYS_ORGANIZATION_STATUS.STATUS_1);
                Integer newAgencyCount = baseDao.getOrgCount(organization);
                output.setNewAgencyCount(newAgencyCount);

                // 代理机构信息变更个数
                organization.setStatus(SysConstants.SYS_ORGANIZATION_STATUS.STATUS_3);
                Integer modifyAgencyCount = baseDao.getOrgCount(organization);
                output.setModifyAgencyCount(modifyAgencyCount);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_AGENCY == userInput.getUserType())
            {
                // 近期待开标项目个数
                Integer toBidCount = 1;
                output.setToBidCount(toBidCount);
                
                // 供应商标书费待审核个数
                Integer toAuditCount = 1;
                output.setToAuditCount(toAuditCount);
                
                // 供应商保证金待退还项目个数
                Integer toReturnCount = 1;
                output.setToReturnCount(toReturnCount);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_TENDER_PERSON == userInput.getUserType())
            {
                // 近期待开标项目个数
                Integer toBidCount = 1;
                output.setToBidCount(toBidCount);
                
                // 供应商标书费待审核个数
                Integer toAuditCount = 1;
                output.setToAuditCount(toAuditCount);
                
                // 供应商保证金待退还项目个数
                Integer toReturnCount = 1;
                output.setToReturnCount(toReturnCount);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_SUPPLIER == userInput.getUserType())
            {
                // 近期待开标项目个数
                Integer toBidCount = 1;
                output.setToBidCount(toBidCount);
                
                // 供应商保证金待退还项目个数
                Integer toReturnCount = 1;
                output.setToReturnCount(toReturnCount);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_SUPERVISE == userInput.getUserType())
            {
                // 近期待开标项目个数
                Integer toBidCount = 1;
                output.setToBidCount(toBidCount);
            }
            else if (SysConstants.SYS_USER_TYPE.USER_TYPE_EXPERT == userInput.getUserType())
            {
                // 近期待开标项目个数
                Integer toBidCount = 1;
                output.setToBidCount(toBidCount);
            }
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询个人中心失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：查询帮助信息（列表）
     * @param helpInput
     * @return
     */
    @Override
    public C033HelpOutput queryMHHelpList(C033HelpInput helpInput)
    {
        C033HelpOutput output = new C033HelpOutput();
        try
        {
            MHHelp help = new MHHelp();
            BeanUtils.copyProperties(help, helpInput);
            help.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            MybatisPager pager = MybatisPager.factoryPageByPageSize(helpInput.getCurrentPage());
            help.setPager(pager);
            List<MHHelp> helpList = baseDao.queryMHHelpList(help);
            if (null != helpList && !helpList.isEmpty())
            {
                output.setTotalRows(pager.getTotalRows());
                for (MHHelp mhHelp : helpList)
                {
                    C033HelpDetail detail = new C033HelpDetail();
                    BeanUtils.copyProperties(detail, mhHelp);
                    output.getHelpDetailList().add(detail);
                }
            }
            // 返回成功消息
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询帮助信息失败");
        }
        
        return output;
    }

    /**
     * 
     * 函数功能描述：新增帮助信息
     * @param helpInput
     * @return
     */
    @Override
    public C034HelpOutput insertMHHelp(C034HelpInput helpInput)
    {
        C034HelpOutput output = new C034HelpOutput();
        try
        {
            MHHelp help = BaseInputCheck.copyInputToDb(helpInput, MHHelp.class);
            // 校验返回生产对象是否为null
            checkObjIsNull(help, DATE_FORMAT_STRING);
            help.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(help, helpInput.getUserId());
            Integer count = baseDao.insertMHHelp(help);
            checkInsert(count);
            output.setHelpId(help.getHelpId());
            
            successProcess(output);
        }
        catch (Exception e)     
        {
            exProcess(e, output, "新增帮助信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：修改帮助信息
     * @param helpInput
     * @return
     */
    @Override
    public C034HelpOutput modifyMHHelp(C034HelpInput helpInput)
    {
        C034HelpOutput output = new C034HelpOutput();
        try
        {
            MHHelp help = BaseInputCheck.copyInputToDb(helpInput, MHHelp.class);
            // 校验返回生产对象是否为null
            checkObjIsNull(help);
            help.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(help, helpInput.getUserId());
            Integer count = baseDao.insertMHHelp(help);
            checkInsert(count);
            output.setHelpId(help.getHelpId());
            
            successProcess(output);
        }
        catch (Exception e)     
        {
            exProcess(e, output, "新增帮助信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：获取帮助信息
     * @param helpInput
     * @return
     */
    @Override
    public C035HelpOutput getMHHelpById(C035HelpInput helpInput)
    {
        C035HelpOutput output = new C035HelpOutput();
        try
        {
            MHHelp help = baseDao.getMHHelpById(helpInput.getHelpId());
            C035HelpDetail detail = new C035HelpDetail();
            BeanUtils.copyProperties(detail, help);
            output.setHelpDetail(detail);
            
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "获取帮助信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：招标人注册
     * @param userInput
     * @return
     */
    @Override
    public C037SysEntrustPersonOutput registerSysEntrustPerson(C037SysEntrustPersonInput input)
    {
        C037SysEntrustPersonOutput output = new C037SysEntrustPersonOutput();
        try
        {
          String operateType = input.getOperateType(); 
          if(operateType.equals(SysConstants.OPERATE_TYPE.OPERATE_ADD)){
          SysEntrustPerson   sysEntrustPerson =  BaseInputCheck.copyInputToDb(input, SysEntrustPerson.class);
          long sysEntrustPersonId =  baseDao.insertSysEntrustPerson(sysEntrustPerson);
          }
            
            
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询个人中心失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：查询数据字典信息（列表）
     * @param constantInput
     * @return
     */
    @Override
    public C038ConstantOutput querySysConstantList(C038ConstantInput constantInput)
    {
        C038ConstantOutput output = new C038ConstantOutput();
        try
        {
            SysConstant constant = new SysConstant();
            constant.setCodeName(constantInput.getCodeName());
            constant.setCodeVal(constantInput.getCodeVal());
            constant.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            MybatisPager pager = MybatisPager.factoryPageByPageSize(constantInput.getCurrentPage());
            constant.setPager(pager);
            List<SysConstant> list = baseDao.querySysConstantList(constant);
            if (null != list && !list.isEmpty())
            {
                output.setTotalRows(list.size());
                for (SysConstant sysConstant : list)
                {
                    C038ConstantDetail detail = new C038ConstantDetail();
                    BeanUtils.copyProperties(detail, sysConstant);
                    output.getConstantDetailList().add(detail);
                }
            }
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "查询数据字典信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：新增数据字典信息
     * @param constantInput
     * @return
     */
    @Override
    public C039ConstantOutput insertConstant(C039ConstantInput constantInput)
    {
        C039ConstantOutput output = new C039ConstantOutput();
        try
        {
            SysConstant constant = BaseInputCheck.copyInputToDb(constantInput, SysConstant.class);
            checkObjIsNull(constant);
            constant.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(constant, constantInput.getUserId());
            
            Integer count = baseDao.insertSysConstant(constant);
            checkInsert(count);
            
            output.setConstantId(constant.getConstantId());
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "新增数据字典信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：更新数据字典信息
     * @param constantInput
     * @return
     */
    @Override
    public C039ConstantOutput modifyConstant(C039ConstantInput constantInput)
    {
        C039ConstantOutput output = new C039ConstantOutput();
        try
        {
            SysConstant constant = BaseInputCheck.copyInputToDb(constantInput, SysConstant.class);
            checkObjIsNull(constant);
            constant.setStatus(SysConstants.STATUS.STATUS_NORMAL);
            this.setOpaUserAndDate(constant, constantInput.getUserId());
            
            Integer count = baseDao.modifySysConstant(constant);
            checkUpdate(count);
            
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "修改数据字典信息失败");
        }
        return output;
    }

    /**
     * 
     * 函数功能描述：删除数据字典信息
     * @param constantInput
     * @return
     */
    @Override
    public C039ConstantOutput delConstant(C039ConstantInput constantInput)
    {
        C039ConstantOutput output = new C039ConstantOutput();
        try
        {
            SysConstant constant = new SysConstant();
            constant.setConstantId(constantInput.getConstantId());
            constant.setStatus(SysConstants.STATUS.STATUS_DELETE);
            this.setOpaUserAndDate(constant, constantInput.getUserId());
            
            Integer count = baseDao.modifySysConstant(constant);
            checkDelete(count);
            
            successProcess(output);
        }
        catch (Exception e)
        {
            exProcess(e, output, "新增数据字典信息失败");
        }
        return output;
    }
}
