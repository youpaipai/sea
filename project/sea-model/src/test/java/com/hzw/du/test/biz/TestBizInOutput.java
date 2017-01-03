package com.hzw.du.test.biz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzw.du.biz.BaseBiz;
import com.hzw.du.biz.BussinessBiz;
import com.hzw.du.biz.ManageBiz;
import com.hzw.du.biz.PortalBiz;
import com.hzw.du.biz.bean.constant.SysConstants;
import com.hzw.du.biz.bean.param.bean.PersonUserBean;
import com.hzw.du.biz.bean.param.bean.SubProSupplierUser;
import com.hzw.du.biz.bean.param.bean.SupplierTendFeeBean;
import com.hzw.du.biz.bean.param.bean.SupplierUserBean;
import com.hzw.du.biz.bean.param.bean.UserBean;
import com.hzw.du.biz.bean.param.bussiness.B001SupplierDownTendFileInput;
import com.hzw.du.biz.bean.param.bussiness.B002SupplierTendFeeInput;
import com.hzw.du.biz.bean.param.common.C003ProjectInput;
import com.hzw.du.biz.bean.param.common.C004TenderProjectInput;
import com.hzw.du.biz.bean.param.common.C005ConnectNoticeInput;
import com.hzw.du.biz.bean.param.common.C011UserInput;
import com.hzw.du.biz.bean.param.common.C011UserOutput;
import com.hzw.du.biz.bean.param.common.C013QueryProjectInput;
import com.hzw.du.biz.bean.param.common.C015QueryTenderProjectInput;
import com.hzw.du.biz.bean.param.common.C017QuerySupplierProInput;
import com.hzw.du.biz.bean.param.common.C022StandardSupplierAddInput;
import com.hzw.du.biz.bean.param.common.C028UserInput;
import com.hzw.du.biz.bean.param.common.C028UserOutput;
import com.hzw.du.biz.bean.param.common.C029UserInput;
import com.hzw.du.biz.bean.param.common.C029UserOutput;
import com.hzw.du.biz.bean.param.common.C032UserInput;
import com.hzw.du.biz.bean.param.common.C032UserOutput;
import com.hzw.du.biz.bean.param.common.C033HelpInput;
import com.hzw.du.biz.bean.param.common.C033HelpOutput;
import com.hzw.du.biz.bean.param.common.C038ConstantInput;
import com.hzw.du.biz.bean.param.common.C038ConstantOutput;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext_test.xml" })
public class TestBizInOutput extends BaseBizTest{

    /**
     * 公共biz
     */
    protected static BaseBiz baseBizProxy;
    
    /**
     * 业务系统biz
     */
    protected static BussinessBiz bussinessBizProxy;
    
    /**
     * 后台管理biz
     */
    protected static ManageBiz manageBizProxy;
    
    /**
     * 门户网站biz
     */
    protected static PortalBiz portalBizProxy;
    
	@Before
	public void beforeClass() throws Exception {
	    if(baseBizProxy == null){
	        baseBizProxy = (BaseBiz)proxyFactory(baseBiz);
	    }
	    if(bussinessBizProxy == null){
	        bussinessBizProxy = (BussinessBiz)proxyFactory(bussinessBiz);
	    }
	    if(manageBizProxy == null){
	        manageBizProxy = (ManageBiz)proxyFactory(manageBiz);
	    }
	    if(portalBizProxy == null){
	        portalBizProxy = (PortalBiz)proxyFactory(portalBiz);
	    }
	}

	/**
     * 函数功能描述：插入kpBidExpert
     */
	@Test
	public void testBiz_queryDemo() {
	    baseBizProxy.queryDemo(null);
	}
	
	/**
	 * 函数功能描述：项目立项
	 */
	@Test
	public void testBiz_projectOperate() {
	    C003ProjectInput input = new C003ProjectInput();
	    input.setOperateType("1");
	    input.setProjectNum("AB-33333");
	    input.setProjectName("我是这个人吗");
	    input.setUserId(3L);
	    
	    baseBizProxy.project(input);
	}
	
	/**
	 * 函数功能描述：招标项目立项
	 */
	@Test
	public void testBiz_tenderProjectOperate() {
	    C004TenderProjectInput input = new C004TenderProjectInput();
	    input.setOperateType("1");
	    input.setProjectId(1L);
	    input.setTenderProjectNum("AB-2222");
	    
	    baseBizProxy.tenderProject(input);
	}
    
	/**
	 * 函数功能描述：查询公告表信息
	 */
	@Test
	public void testBiz_queryConnectNotice() {
	    C005ConnectNoticeInput input = new C005ConnectNoticeInput();
	    input.setNoticeIdList("3,32,2");
	    input.setTenderProjectIdList("1,2,3");
	    input.setSubIdList("3,23,2");
	    input.setTitle("我");
	    input.setLikeTitle("我额");
	    input.setNoticeTypeList("1,2");
	    input.setNoticeNatureList("1,2");
	    List<String> list = new ArrayList<String>();
	    list.add(SysConstants.EXPRESSION_TYPE.LT + ",2016-06-21");
	    list.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ",2016-01-21");
	    input.setStartTimeList(list);
	    input.setEndTimeList(list);
	    input.setStatus(1);
	    
	    baseBizProxy.queryConnectNotice(input);
	}
	
	/**
	 * 函数功能描述：查询公告表信息
	 */
	@Test
	public void testBiz_queryProjectList() {
	    C013QueryProjectInput input = new C013QueryProjectInput();
	    input.setProjectIdList("3,23,5");
	    input.setProjectNumList("33,223");
	    input.setProjectNumLike("我");
	    input.setProjectNameList("我,这个");
	    input.setProjectNameLike("哈哈");
	    input.setRegionCodeList("33,22");
	    input.setProjectType("A01");
	    input.setFundingSource(1);
	    input.setConnector("张三");
	    input.setPhone("1385151500");
	    input.setProjectManager(2L);
	    List<String> list = new ArrayList<String>();
	    list.add(SysConstants.EXPRESSION_TYPE.LT + ",2016-06-21");
	    list.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ",2016-01-21");
	    input.setCreateTimeList(list);
	    input.setStatus(1);
	    
	    baseBizProxy.queryProjectList(input);
	}
	
	/**
	 * 函数功能描述：查询公告表信息
	 */
	@Test
	public void testBiz_queryTenderProject() {
	    C015QueryTenderProjectInput input = new C015QueryTenderProjectInput();
	    input.setTenderProjectIdList("3,23,5");
	    input.setProjectIdList("33,223");
	    input.setTenderProjectNumList("Ap-我");
	    input.setTenderProjectNumLike("我,这个");
	    input.setTenderProjectNameList("33,22");
	    input.setTenderProjectNameLike("哈哈");
	    input.setOrgSuperviseDeptIdList("33,22");
	    input.setOrgApproveDeptIdList("33,22");
	    input.setTenderIdList("33,22");
	    input.setTenderModeList("33,22");
	    input.setTenderOrganziFormList("33,22");
	    input.setUserIdList("33,22");
	    input.setQuerySubNumFlag("1");
	    input.setQueryPushNoticeFlag("1");
	    input.setQueryChangeNoticeFlag("1");
	    input.setQuerySupplierFlag("1");
	    input.setTenderProjectType("1");
	    List<String> list = new ArrayList<String>();
	    list.add(SysConstants.EXPRESSION_TYPE.LT + ",2016-06-21");
	    list.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ",2016-01-21");
	    input.setCreateTimeList(list);
	    input.setStatus(1);
	    
	    baseBizProxy.queryTenderProject(input);
	}
	
	/**
	 * 函数功能描述：供应商查询招标的项目信息查询
	 */
	@Test
	public void testBiz_querySupplierPro() {
	    C017QuerySupplierProInput input = new C017QuerySupplierProInput();
	    input.setTenderProjectIdList("3,23,5");
	    input.setSubIdList("33,223");
	    input.setTenderProjectNumList("Ap-我");
	    input.setTenderProjectNumLike("我,这个");
	    input.setTenderProjectNameList("33,22");
	    input.setTenderProjectNameLike("哈哈");
	    input.setBidStatus("1");
	    input.setSupplierUserIdList("33,22");
	    List<String> list = new ArrayList<String>();
	    list.add(SysConstants.EXPRESSION_TYPE.LT + ",2016-06-21");
	    list.add(SysConstants.EXPRESSION_TYPE.GTE_SYMBOL + ",2016-01-21");
	    input.setCreateTimeList(list);
	    input.setOpenTimeList(list);
	    input.setStatus(1);
	    
	    baseBizProxy.querySupplierPro(input);
	}
	
	/**
	 * 函数功能描述：供应商查询招标的项目信息查询
	 */
	@Test
	public void testBiz_standardSupplierAdd() {
	    C022StandardSupplierAddInput input = new C022StandardSupplierAddInput();
	    input.setPersonUserId(1L);
	    input.setIsInvite(SysConstants.IS_INVITE.TRUE);
	    input.setTenderProjectId(2L);
	    
	    List<SubProSupplierUser> subProSupplierList = new ArrayList<SubProSupplierUser>();
	    
	    SubProSupplierUser item1 = new SubProSupplierUser();
	    item1.setSubId(3L);
	    List<Long> supplierUserIdList = new ArrayList<Long>();
	    supplierUserIdList.add(4L);
	    supplierUserIdList.add(5L);
	    item1.setSupplierUserIdList(supplierUserIdList);
	    subProSupplierList.add(item1);
	    
	    item1 = new SubProSupplierUser();
        item1.setSubId(6L);
        supplierUserIdList = new ArrayList<Long>();
        supplierUserIdList.add(4L);
        supplierUserIdList.add(5L);
        item1.setSupplierUserIdList(supplierUserIdList);
        subProSupplierList.add(item1);
	    
        item1 = new SubProSupplierUser();
        item1.setSubId(7L);
        supplierUserIdList = new ArrayList<Long>();
        supplierUserIdList.add(4L);
        supplierUserIdList.add(5L);
        item1.setSupplierUserIdList(supplierUserIdList);
        subProSupplierList.add(item1);
	    
        item1 = new SubProSupplierUser();
        item1.setSubId(8L);
        supplierUserIdList = new ArrayList<Long>();
        supplierUserIdList.add(4L);
        supplierUserIdList.add(5L);
        item1.setSupplierUserIdList(supplierUserIdList);
        subProSupplierList.add(item1);
	    
        input.setSubProSupplierList(subProSupplierList);
	    
	    baseBizProxy.standardSupplierAdd(input);
	}
    
	 /**
     * 函数功能描述：供应商查询招标的项目信息查询
     */
    @Test
    public void testBiz_B001SupplierDownTendFile() {
        B001SupplierDownTendFileInput input = new B001SupplierDownTendFileInput();
        input.setSupplierUserId(1L);
        input.setTenderProjectId(2L);
        
        bussinessBizProxy.supplierDownTendFile(input);
    }
    
	/**
     * 函数功能描述：供应商查询招标的项目信息查询
     */
    @Test
    public void testBiz_B002StandardSupplierUpdate() {
        B002SupplierTendFeeInput input = new B002SupplierTendFeeInput();
        input.setSupplierUserId(1L);
        
        List<SupplierTendFeeBean> tendFeeList = new ArrayList<SupplierTendFeeBean>();
        SupplierTendFeeBean item = new SupplierTendFeeBean();
        item.setStandardId(2L);
        item.setTtFileId(7L);
        tendFeeList.add(item);
        
        item = new SupplierTendFeeBean();
        item.setStandardId(4L);
        item.setTtFileId(6L);
        tendFeeList.add(item);
        
        input.setTendFeeList(tendFeeList);
        
        bussinessBizProxy.standardSupplierUpdate(input);
    }
    
    
	/**
     * 函数功能描述：插入kpBidExpert
     */
    @Test
    public void testBiz_demo() {
        baseBizProxy.queryDemo(null);
    }
	
    /**
     * 
     * 函数功能描述：查询所有子用户
     */
    @Test
	public void testBiz_initModifyUser()
	{
        C029UserInput userInput = new C029UserInput();
        userInput.setUserId(1L);
        C029UserOutput output = baseBizProxy.initModifyUser(userInput);
        System.err.println(output.toString());
	}
	
    @Test
    public void testBiz_getPersonCenter()
    {
        C032UserInput userInput = new C032UserInput();
        userInput.setUserType(SysConstants.SYS_USER_TYPE.USER_TYPE_ADMIN);
        C032UserOutput output = baseBizProxy.getPersonCenter(userInput);
        System.err.println(output.toString());
    }
    
    @Test
    public void testBiz_queryUserCount()
    {
        C011UserInput input = new C011UserInput();
        input.setPhone("13111111111");
        C011UserOutput output = baseBizProxy.queryUserCount(input);
        System.err.println(output);
        
    }
    
    @Test
    public void testBiz_queryMHHelpList()
    {
        C033HelpInput input = new C033HelpInput();
        C033HelpOutput output = baseBizProxy.queryMHHelpList(input);
        System.err.println(output);
    }
    
    @Test
    public void testBiz_querySysConstantList()
    {
        C038ConstantInput input = new C038ConstantInput();
        C038ConstantOutput output = baseBizProxy.querySysConstantList(input);
        System.err.println(output);
    }
    
    @Test
    public void testBiz_modifyUser()
    {
        C028UserInput userInput = new C028UserInput();
        userInput.setOperateType(SysConstants.OPERATE_TYPE.OPERATE_MODIFY);
        UserBean userBean = new UserBean();
        //传id
        userBean.setUserId(2L);
        //传info
        userBean.setUserName("xiaoxiao");
        userBean.setPhone("13800000000");
        userBean.setOrganizationId(3L);
        userBean.setTelNo("025-85854652");
        userBean.setEmail("111@163.com");
        userBean.setUserType(2);
        userInput.setUserBean(userBean);
        
        // 判断用户类型
        if (SysConstants.SYS_USER_TYPE.USER_TYPE_SUPPLIER == userBean.getUserType())
        {
            SupplierUserBean supplierUserBean =new SupplierUserBean();
            supplierUserBean.setUserId(userBean.getUserId());
            supplierUserBean.setCardFile(218L);
            supplierUserBean.setPersonFile(218L);
            userInput.setSupplierUserBean(supplierUserBean);
        }
        else if (SysConstants.SYS_USER_TYPE.USER_TYPE_TENDER_PERSON == userBean.getUserType())
        {
            PersonUserBean personUserBean =new PersonUserBean();
            personUserBean.setUserId(userBean.getUserId());
            personUserBean.setCardFile(218L);
            userInput.setPersonUserBean(personUserBean);
        }
        //调用接口
        C028UserOutput output  = baseBiz.modifyUser(userInput);
        System.err.println(output);
    }
    
}
