/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 文件名称：BaseBiz.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.biz;

import java.util.Map;

import com.hzw.du.biz.bean.param.bean.ConstantBean;
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
import com.hzw.du.biz.bean.param.common.C036HelpInput;
import com.hzw.du.biz.bean.param.common.C036HelpOutput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonInput;
import com.hzw.du.biz.bean.param.common.C037SysEntrustPersonOutput;
import com.hzw.du.biz.bean.param.common.C038ConstantInput;
import com.hzw.du.biz.bean.param.common.C038ConstantOutput;
import com.hzw.du.biz.bean.param.common.C039ConstantInput;
import com.hzw.du.biz.bean.param.common.C039ConstantOutput;
import com.hzw.du.biz.bean.param.common.DemoInput;
import com.hzw.du.biz.bean.param.common.DemoOutput;



/**
 * 基础业务服务
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface BaseBiz {
    /**
     * 
     * 函数功能描述：测试查询
     * @param input
     * @return
     */
    DemoOutput queryDemo(DemoInput input);
    
    /**
     * 
     * 函数功能描述：新增文件信息
     * @param sysFile
     * @return
     */
    C001FileOutput insertSysFile(C001FileInput fileInput);
    
    /**
     * 
     * 函数功能描述：获取文件信息
     * @param fileId
     * @return
     */
    C002FileOutput getSysFileById(C002FileInput fileInput);
    
    /**
     * 
     * 函数功能描述：修改文件信息
     * @param sysFile
     * @return
     */
    C001FileOutput modifySysFile(C001FileInput fileInput);
    
    /**
     * 
     * 函数功能描述：项目立项、项目修改、项目删除
     * @param input
     * @return
     */
    C003ProjectOutput project(C003ProjectInput input);
    
    /**
     * 
     * 函数功能描述：招标项目（新增、修改、删除）
     * @param input
     * @return
     */
    C004TenderProjectOutput tenderProject(C004TenderProjectInput input);
    
    /**
     * 
     * 函数功能描述：查询公告表信息
     * @param input
     * @return
     */
    C005ConnectNoticeOutput queryConnectNotice(C005ConnectNoticeInput input);
    
    /**
     * 
     * 函数功能描述：添加日志信息
     * @param logInput
     * @return
     */
    C006LogOutput insertSysLog(C006LogInput logInput);
    
    /**
     * 
     * 函数功能描述：日志信息列表（分页）
     * @param logInput
     * @return
     */
    C007LogOutput querySysLogList(C007LogInput logInput);
    
    /**
     * 
     * 函数功能描述：根据主键ID获取日志信息
     * @param logInput
     * @return
     */
    C008LogOutput getSysLogById(C008LogInput logInput);
    
    /**
     * 
     * @param input
     * @return
     */
    C009LoginOutput login(C009LoginInput input);
    
    /**
     * 
     * 函数功能描述：查询所有[SYS_USER  供应商用户表]
     * @param sysUser
     * @return
     */
    C010UserOutput querySysUserByPage(C010UserInput userInput);
    
    /**
     * 
     * 函数功能描述：根据登录号、手机号码验证是否唯一
     * @param sysUser
     * @return
     */
    C011UserOutput queryUserCount(C011UserInput userInput);
    
    /**
     * 
     * 函数功能描述：修改用户密码
     * @param userInput
     * @return
     */
    C012UserOutput modifyPassword(C012UserInput userInput);
    
    /**
     * 
     * 函数功能描述：项目信息查询
     * @param input
     * @return
     */
    C013QueryProjectOutput queryProjectList(C013QueryProjectInput input);
   
    /**
     * 
     * 函数功能描述：获取服务器时间
     * @param input
     * @return
     */
    C014QueryServerTimeOutput queryServerTime(C014QueryServerTimeInput input);

    /**
     * 
     * 函数功能描述：招标人（代理机构）招标项目查询
     * @param input
     * @return
     */
    C015QueryTenderProjectOutput queryTenderProject(C015QueryTenderProjectInput input);
    
    /**
     * 
     * 函数功能描述：保存组织架构
     * @param input
     * @return
     */
	C016OrganizationOutput operateOrganization(C016OrganizationInput input);
	
	/**
	 * 
	 * 函数功能描述：查询数据字典信息(memcached)
	 * @param constantInput
	 * @return
	 */
	C018ConstantOutput queryConstantList(C018ConstantInput constantInput);
	
	/**
	 * 
	 * 函数功能描述：查询数据字典信息
	 * @return
	 */
	Map<String, ConstantBean> queryConstantList();

	/**
	 * 
	 * 函数功能描述：供应商查询招标的项目信息查询
	 * @param input
	 * @return
	 */
	C017QuerySupplierProOutput querySupplierPro(C017QuerySupplierProInput input);
	
	
	/**
     * 函数功能描述：供应商注册
     * @param input
     * @return
     */
	 C020SysSupplierOutput   saveSysSupplier(C020SysSupplierInput input);

	/**
     * 函数功能描述：代理机构注册
     * @param input
     * @return
     */	
	 C021SysAgencyOutput saveSysAgency(C021SysAgencyInput input);
	 
	 /**
	  * 函数功能描述：参标供应商参标项目；新增、修改、删除
	  * @param input
	  * @return
	  */	
	 C022StandardSupplierAddOutput standardSupplierAdd(C022StandardSupplierAddInput input);
	 
	 /**
      * 函数功能描述：用户基本信息注册
      * @param input
      * @return
      */
    C024RegisterSysUserOutput registerSysUser(C024RegisterSysUserInput input);
	 
	 /**
	  * 子用户信息列表（分页）
	  * 函数功能描述：TODO
	  * @param userInput
	  * @return
	  */
	 C025UserOutput querySubUserList(C025UserInput userInput);
	 
	 /**
	  * 
	  * 函数功能描述：对用户进行操作 启用 停用 删除
	  * @param userInput
	  * @return
	  */
	 C026UserOutput modifyUserStatus(C026UserInput userInput);
	 
	 /**
	  * 
	  * 函数功能描述：初始化新增用户信息
	  * @param userInput
	  * @return
	  */
	 C027UserOutput initAddUser(C027UserInput userInput);
	 
	 /**
	  * 
	  * 函数功能描述：新增用户信息
	  * @param userInput
	  * @return
	  */
	 C028UserOutput addUser(C028UserInput userInput);
	 
	 /**
      * 
      * 函数功能描述：修改用户信息
      * @param userInput
      * @return
      */
     C028UserOutput modifyUser(C028UserInput userInput);
	 
	 /**
      * 
      * 函数功能描述：初始化修改用户信息
      * @param userInput
      * @return
      */
     C029UserOutput initModifyUser(C029UserInput userInput);
     
     /**
      * 
      * 函数功能描述：修改用户信息
      * @param userInput
      * @return
      */
     C030UserOutput queryUserOrgList(C030UserInput userInput);
     
     /**
      * 
      * 函数功能描述：个人中心
      * @param userInput
      * @return
      */
     C032UserOutput getPersonCenter(C032UserInput userInput);
     
     /**
      * 
      * 函数功能描述：查询帮助信息（列表）
      * @param helpInput
      * @return
      */
     C033HelpOutput queryMHHelpList(C033HelpInput helpInput);
     
     /**
      * 
      * 函数功能描述：新增帮助信息
      * @param helpInput
      * @return
      */
     C034HelpOutput insertMHHelp(C034HelpInput helpInput);
     
     /**
      * 
      * 函数功能描述：修改帮助信息
      * @param helpInput
      * @return
      */
     C034HelpOutput modifyMHHelp(C034HelpInput helpInput);
     
     /**
      * 
      * 函数功能描述：获取帮助信息
      * @param helpInput
      * @return
      */
     C035HelpOutput getMHHelpById(C035HelpInput helpInput);
     
     /**
      * 
      * 函数功能描述：招标人注册
      * @param userInput
      * @return
      */
     C037SysEntrustPersonOutput registerSysEntrustPerson(C037SysEntrustPersonInput input);
     
     /**
      * 
      * 函数功能描述：查询数据字典信息（列表）
      * @param constantInput
      * @return
      */
	 C038ConstantOutput querySysConstantList(C038ConstantInput constantInput);

	 
	 /**
	  * 
	  * 函数功能描述：新增数据字典信息
	  * @param constantInput
	  * @return
	  */
	 C039ConstantOutput insertConstant(C039ConstantInput constantInput);
	 
	 /**
      * 
      * 函数功能描述：更新数据字典信息
      * @param constantInput
      * @return
      */
     C039ConstantOutput modifyConstant(C039ConstantInput constantInput);
     
     /**
      * 
      * 函数功能描述：删除数据字典信息
      * @param constantInput
      * @return
      */
     C039ConstantOutput delConstant(C039ConstantInput constantInput);
}
