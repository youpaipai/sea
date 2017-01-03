/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C020SysSupplierInput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonInput;

/**
 * 
 *  供应商注册信息
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class C020SysSupplierInput  extends BaseCommonInput {
	
	
	 /**
     * SUPPLIERID  NUMBER  N           供应商编号
     */
    private Long supplierId;
    
    /**
     * PRODUCTTYPE VARCHAR2(100)   Y           供应商产品类别
     */
    private String productType;
    
    /**
     * BUSINESSRANGE   VARCHAR2(4000)  Y           经营范围
     */
    private String businessRange;
    
    /**
     * PINYINMA    VARCHAR2(300)   Y           企业名称的拼音码
     */
    private String pinYinMa;
    
    /**
     * QUALISEQ    VARCHAR2(50)    Y           资质序列
     */
    private String qualiSeq;
    
    /**
     * ORGANIZATIONID  NUMBER  Y           所属组织机构编号
     */
    private Long organizationId;
    
//    CREATEUSER  NUMBER  Y           创建人
//    CREATETIME  DATE    Y           创建时间
//    UPDATEUSER  NUMBER  Y           修改人
//    UPDATETIME  DATE    Y           修改时间
    /**
     * STATUS  NUMBER  Y           状态 0：未删除 1:删除
     */
    private Integer status;
	
	
	
	public  C020SysSupplierInput(){
		
		functionCode=CommonBizFunCode.SYS_SUPPLIER_C020;
	}
	

}
