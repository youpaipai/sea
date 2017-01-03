/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_ORGANIZATION  组织机构表， 序列seq_organizationid] dao
 * 文件名称：SysOrganizatioinMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_ORGANIZATION  组织机构表， 序列seq_organizationid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysOrganizatioinMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param sysOrganizatioin
     * @return
     */
    Integer insertSysOrganizatioin(SysOrganizatioin sysOrganizatioin);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_ORGANIZATION  组织机构表， 序列seq_organizationid]
     * @param sysOrganizatioin 
     * @return
     */
    List<SysOrganizatioin> querySysOrganizatioinByPage(SysOrganizatioin sysOrganizatioin);

    /**
     * 
     * 函数功能描述：更新组织机构信息
     * @param sysOrganizatioin 
     * @return
     */
	void updateSysOrganizatioin(SysOrganizatioin sysOrganizatioin);
	
	/**
	 * 
	 * 函数功能描述：查询组织机构个数
	 * @param sysOrganizatioin
	 * @return
	 */
	Integer getOrgCount(SysOrganizatioin sysOrganizatioin);

}
