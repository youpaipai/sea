/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C021SysAgencyOutput.java
 * 修改时间：2016-7-25
 * 修改人：libb
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.biz.bean.param.common;

import com.hzw.du.biz.bean.constant.CommonBizFunCode;
import com.hzw.du.biz.bean.param.BaseCommonOutput;
/**
 * 
 * 代理机构注册返回信息
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class C021SysAgencyOutput  extends BaseCommonOutput {
	private long  sysAgencyId;//代理机构ID
	private long  sysOrganizationId;//注册组织机构ID
	private long  sysUserId;//用户ID
	
	public long getSysAgencyId() {
		return sysAgencyId;
	}
	public void setSysAgencyId(long sysAgencyId) {
		this.sysAgencyId = sysAgencyId;
	}
	public long getSysOrganizationId() {
		return sysOrganizationId;
	}
	public void setSysOrganizationId(long sysOrganizationId) {
		this.sysOrganizationId = sysOrganizationId;
	}
	public long getSysUserId() {
		return sysUserId;
	}
	public void setSysUserId(long sysUserId) {
		this.sysUserId = sysUserId;
	}
	
	public  C021SysAgencyOutput(){
		functionCode = CommonBizFunCode.SYS_ANGENCY_C021;	
		}
	
	

}
