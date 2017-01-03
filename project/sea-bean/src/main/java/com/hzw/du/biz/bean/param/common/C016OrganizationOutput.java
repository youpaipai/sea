/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：C016OrganizationOutput.java
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
 * 组织机构注册返回参数
 * <功能详细描述>
 * @author 王帅帅
 * @version V1.0[产品/模块版本]
 */
public class C016OrganizationOutput extends BaseCommonOutput{
	/**
	 * 组织机构ID
	 */
	private Long organizationId;

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	
	public C016OrganizationOutput(){
		functionCode = CommonBizFunCode.SYS_ORGANIZATION_C016;
	}

}
