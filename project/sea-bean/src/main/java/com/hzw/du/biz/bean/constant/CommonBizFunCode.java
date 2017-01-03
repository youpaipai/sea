/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：公共接口功能编码
 * 文件名称：CommonBizFunCode.java
 * 修改时间：2016年7月14日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.biz.bean.constant;

import com.hzw.du.biz.bean.param.BaseCommonInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
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
import com.hzw.du.biz.bean.param.common.C019AreaInput;
import com.hzw.du.biz.bean.param.common.C019AreaOutput;
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
 * 公共接口功能编码 ，以“c”开头，001-zzz进行排序
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class CommonBizFunCode {

    /**
     * 测试demo的功能编码
     */
    public final static String DEMO = "ctest";

    /**
     * 增、删、改文件信息
     */
    public final static String FILE_C001 = "c001";

    /**
     * 获取文件信息
     */
    public final static String FILE_C002 = "c002";

    /**
     * 项目（新增、修改、删除）
     */
    public final static String PROJECT_C003 = "c003";

    /**
     * 招标项目（新增、修改、删除）
     */
    public final static String TENDER_PROJECT_C004 = "c004";
    
    /**
     * 公告查询
     */
    public final static String CONNECT_NOTICE_C005 = "c005";
    
    /**
     * 增、删、改日志信息
     */
    public final static String LOG_C006 = "c006";
    
    /**
     * 日志信息列表（分页）
     */
    public final static String LOG_C007 = "c007";
    
    /**
     * 获取日志信息
     */
    public final static String LOG_C008 = "c008";

	/**
     * 系统登陆
     */
    public final static String  SYS_LOGIN_C009="c009";
    
    /**
     * 用户信息列表
     */
    public final static String USER_C010 = "c010";
    
    /**
     * 验证手机号码、登陆账号是否唯一
     */
    public final static String USER_C011 = "c011";
    
    /**
     * 修改用户密码
     */
    public final static String USER_C012 = "c012";

    /**
     * 项目信息查询
     */
    public final static String  QUERY_PROJECT_C013="c013";
    
    /**
     * 获取服务器时间
     */
    public final static String  QUERY_SERVER_TIME_C014="c014";
    
    /**
     * 招标人（代理机构）招标项目查询
     */
    public final static String  QUERY_TENDER_PROJECT_C015="c015";
    
    
    public static final String SYS_ORGANIZATION_C016 = "c016";
	
    
    /**
     * 供应商查询招标的项目信息
     */
    public final static String  QUERY_SUPPLIER_PROJECT_C017="c017";
    
	/**
	 * 数据字典信息（memcached）
	 */
	public static final String CONSTANT_C018 = "c018";
	
	/**
	 * 按钮信息（memcached）
	 */
	public static final String AREA_C019 = "c019";

	 /**
      *用户基本信息注册 
      */
    public static final String SYS_SUPPLIER_C020 = "c020";
    
	public static final String SYS_ANGENCY_C021 = "c021";
	
	/**
	 * 参标供应商参标项目；新增
	 */
	public static final String C022_STANDARD_SUPPLIER_ADD = "c022";
	
	public static final String REGISTER_SYSUSER_C024 = "c024";
	
	/**
	 * 查询子用户信息（列表）
	 */
	public static final String USER_C025 = "c025";
    
	/**
	 * 对用户进行操作 启用 停用 删除
	 */
    public static final String USER_C026 = "c026";
	
    /**
     * 初始化用户信息
     */
    public static final String USER_C027 = "c027";
    
    /**
     * 新增用户信息
     */
    public static final String USER_C028 = "c028";
    
    /**
     * 初始化主用户详情(修改)
     */
    public static final String USER_C029 = "c029";
    
    /**
     * 修改用户信息
     */
    public static final String USER_C030 = "c030";
    
    /**
     * 个人中心
     */
    public static final String USER_C032 = "c032";
    
    /**
     * 查询帮助信息（列表）
     */
    public static final String HELP_C033 = "c033";
    
    /**
     * 新增帮助信息
     */
    public static final String HELP_C034 = "c034";
    
    /**
     * 查看帮助信息
     */
    public static final String HELP_C035 = "c035";
    
    /**
     * 公告信息（memcached）
     */
    public static final String HELP_C036 = "c036";
    
    /**
     * 查询数据字典信息（列表）
     */
    public static final String CONSTANT_C038 = "c038";
    
    /**
     * 增、删、改数据字典信息
     */
    public static final String CONSTANT_C039 = "c039";

    /**
     * 招标人信息保存
     */
    public static final String SYS_ENTRUST_PERSON_C037 = null;

    public static BaseCommonInput creatCmnInput(String functionCode) {
        if (DEMO.equals(functionCode)) {
            return new DemoInput();
        }
        
        if (FILE_C001.equals(functionCode)) {
            return new C001FileInput();
        }
        
        if (FILE_C002.equals(functionCode)) {
            return new C002FileInput();
        }
        
        if (PROJECT_C003.equals(functionCode)) {
            return new C003ProjectInput();
        }
        
        if (TENDER_PROJECT_C004.equals(functionCode)) {
            return new C004TenderProjectInput();
        }
        
        if (CONNECT_NOTICE_C005.equals(functionCode)) {
            return new C005ConnectNoticeInput();
        }
        
        if(SYS_LOGIN_C009.equals(functionCode)){
        	
        	return   new C009LoginInput();
        }
        
        if (LOG_C006.equals(functionCode))
        {
            return new C006LogInput();
        }
        
        if (LOG_C007.equals(functionCode))
        {
            return new C007LogInput();
        }
        if (LOG_C008.equals(functionCode))
        {
            return new C008LogInput();
        }
        if (USER_C010.equals(functionCode))
        {
            return new C010UserInput();
        }
        if (USER_C011.equals(functionCode))
        {
            return new C011UserInput();
        }
        if (USER_C012.equals(functionCode))
        {
            return new C012UserInput();
        }
        if (QUERY_PROJECT_C013.equals(functionCode)) {
            return new C013QueryProjectInput();
        }
        if (QUERY_SERVER_TIME_C014.equals(functionCode)) {
            return new C014QueryServerTimeInput();
        }
        if (QUERY_TENDER_PROJECT_C015.equals(functionCode)) {
            return new C015QueryTenderProjectInput();
        }
        if (SYS_ORGANIZATION_C016.equals(functionCode)) {
            return new C016OrganizationInput();
        }
        if (CONSTANT_C018.equals(functionCode))
        {
            return new C018ConstantInput();
        }
        if (AREA_C019.equals(functionCode))
        {
            return new C019AreaInput();
        }
        if(SYS_SUPPLIER_C020.equals(functionCode)){
        	return new C020SysSupplierInput();
        }
        if (QUERY_SUPPLIER_PROJECT_C017.equals(functionCode)) {
            return new C017QuerySupplierProInput();
        }
        if(SYS_ANGENCY_C021.equals(functionCode)){
        	return new C021SysAgencyInput();
        }
        if(C022_STANDARD_SUPPLIER_ADD.equals(functionCode)){
            return new C022StandardSupplierAddInput();
        }
        if(REGISTER_SYSUSER_C024.equals(functionCode)){
            return new C024RegisterSysUserInput();
        }
        if (USER_C025.equals(functionCode))
        {
            return new C025UserInput();
        }
        if (USER_C026.equals(functionCode))
        {
            return new C026UserInput();
        }
        if (USER_C027.equals(functionCode))
        {
            return new C027UserInput();
        }
        if (USER_C028.equals(functionCode))
        {
            return new C028UserInput();
        }
        if (USER_C029.equals(functionCode))
        {
            return new C029UserInput();
        }
        if (USER_C030.equals(functionCode))
        {
            return new C030UserInput();
        }
        if (USER_C032.equals(functionCode))
        {
            return new C032UserInput();
        }
        if (HELP_C033.equals(functionCode))
        {
            return new C033HelpInput();
        }
        if (HELP_C034.equals(functionCode))
        {
            return new C034HelpInput();
        }
        if (HELP_C035.equals(functionCode))
        {
            return new C035HelpInput();
        }
        if (HELP_C036.equals(functionCode))
        {
            return new C036HelpInput();
        }
        if(SYS_ENTRUST_PERSON_C037.equals(functionCode)){
            return new C037SysEntrustPersonInput();
        }
        if (CONSTANT_C038.equals(functionCode))
        {
            return new C038ConstantInput();
        }
        if (CONSTANT_C038.equals(functionCode))
        {
            return new C038ConstantInput();
        }
        if (CONSTANT_C039.equals(functionCode))
        {
            return new C039ConstantInput();
        }
        return null;
    }

    public static BaseCommonOutput creatCmnOutput(String functionCode) {
        if (DEMO.equals(functionCode)) {
            return new DemoOutput();
        }

        if (FILE_C001.equals(functionCode)) {
            return new C001FileOutput();
        }
        
        if (FILE_C002.equals(functionCode)) {
            return new C002FileOutput();
        }
        
        if (PROJECT_C003.equals(functionCode)) {
            return new C003ProjectOutput();
        }
        
        if (TENDER_PROJECT_C004.equals(functionCode)) {
            return new C004TenderProjectOutput();
        }
        
        if (CONNECT_NOTICE_C005.equals(functionCode)) {
            return new C005ConnectNoticeOutput();
        }
        
        if(SYS_LOGIN_C009.equals(functionCode)){
        	return  new  C009LoginOutput();
        }
        
        if (LOG_C006.equals(functionCode))
        {
            return new C006LogOutput();
        }
        
        if (LOG_C007.equals(functionCode))
        {
            return new C007LogOutput();
        }
        
        if (LOG_C008.equals(functionCode))
        {
            return new C008LogOutput();
        }
        if (USER_C010.equals(functionCode))
        {
            return new C010UserOutput();
        }
        if (USER_C011.equals(functionCode))
        {
            return new C011UserOutput();
        }
        if (USER_C012.equals(functionCode))
        {
            return new C012UserOutput();
        }
        if(QUERY_PROJECT_C013.equals(functionCode)){
            return new C013QueryProjectOutput();
        }
        if(QUERY_SERVER_TIME_C014.equals(functionCode)){
            return new C014QueryServerTimeOutput();
        }
        if(QUERY_TENDER_PROJECT_C015.equals(functionCode)){
            return new C015QueryTenderProjectOutput();
        }
        if(SYS_ORGANIZATION_C016.equals(functionCode)){
            return new C016OrganizationOutput();
        }
        if (CONSTANT_C018.equals(functionCode))
        {
            return new C018ConstantOutput();
        }
        if (AREA_C019.equals(functionCode))
        {
            return new C019AreaOutput();
        }
        if(SYS_SUPPLIER_C020.equals(functionCode)){
        	return new C020SysSupplierOutput();
        }
        if(QUERY_SUPPLIER_PROJECT_C017.equals(functionCode)){
            return new C017QuerySupplierProOutput();
        }
        if(SYS_ANGENCY_C021.equals(functionCode)){
        	return new C021SysAgencyOutput();
        }
        if(C022_STANDARD_SUPPLIER_ADD.equals(functionCode)){
            return new C022StandardSupplierAddOutput();
        }
        if(REGISTER_SYSUSER_C024.equals(functionCode)){
            return new C024RegisterSysUserOutput();
        }
        if (USER_C025.equals(functionCode))
        {
            return new C025UserOutput();
        }
        if (USER_C026.equals(functionCode))
        {
            return new C026UserOutput();
        }
        if (USER_C027.equals(functionCode))
        {
            return new C027UserOutput();
        }
        if (USER_C028.equals(functionCode))
        {
            return new C028UserOutput();
        }
        if (USER_C029.equals(functionCode))
        {
            return new C029UserOutput();
        }
        if (USER_C030.equals(functionCode))
        {
            return new C030UserOutput();
        }
        if (USER_C032.equals(functionCode))
        {
            return new C032UserOutput();
        }
        if (HELP_C033.equals(functionCode))
        {
            return new C033HelpOutput();
        }
        if (HELP_C034.equals(functionCode))
        {
            return new C034HelpOutput();
        }
        if (HELP_C035.equals(functionCode))
        {
            return new C035HelpOutput();
        }
        if (HELP_C036.equals(functionCode))
        {
            return new C036HelpOutput();
        }
        if(SYS_ENTRUST_PERSON_C037.equals(functionCode)){
            return new C037SysEntrustPersonOutput();
        }
        if (CONSTANT_C038.equals(functionCode))
        {
            return new C038ConstantOutput();
        }
        if (CONSTANT_C039.equals(functionCode))
        {
            return new C039ConstantOutput();
        }
        return null;
    }

}
