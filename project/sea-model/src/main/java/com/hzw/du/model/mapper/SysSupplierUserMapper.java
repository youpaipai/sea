/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid] dao
 * 文件名称：SysSupplierUserMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysSupplierUserMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysSupplierUser
     * @return
     */
    Integer insertSysSupplierUser(SysSupplierUser sysSupplierUser);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_SUPPLIER_USER  供应商用户表， 序列seq_supplieruserid]
     * @param sysSupplierUser 
     * @return
     */
    List<SysSupplierUser> querySysSupplierUserByPage(SysSupplierUser sysSupplierUser);
    
    /**
     * 
     * 函数功能描述：修改供应商用户信息
     * @param sysSupplierUser
     * @return
     */
    Integer modifySysSupplierUser(SysSupplierUser sysSupplierUser);
    
    /**
     * 
     * 函数功能描述：获取供应商用户信息
     * @param sysSupplierUser
     * @return
     */
    SysSupplierUser getSysSupplierUserById(Long userId);

}
