/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_CONSTANT  数据字典表， 序列seq_constantid] dao
 * 文件名称：SysConstantMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_CONSTANT  数据字典表， 序列seq_constantid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysConstantMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param sysConstant
     * @return
     */
    Integer insertSysConstant(SysConstant sysConstant);
    
    /**
     * 
     * 函数功能描述：更新数据字典信息
     * @param sysConstant
     * @return
     */
    Integer modifySysConstant(SysConstant sysConstant);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_CONSTANT  数据字典表， 序列seq_constantid]
     * @param sysConstant 
     * @return
     */
    List<SysConstant> querySysConstantByPage(SysConstant sysConstant);
    
}
