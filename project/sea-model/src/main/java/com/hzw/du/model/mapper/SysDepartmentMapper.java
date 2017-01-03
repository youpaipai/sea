/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_DEPARTMENT  部门表， 序列seq_departmentid] dao
 * 文件名称：SysDepartmentMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_DEPARTMENT  部门表， 序列seq_departmentid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysDepartmentMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param sysDepartment
     * @return
     */
    Integer insertSysDepartment(SysDepartment sysDepartment);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_DEPARTMENT  部门表， 序列seq_departmentid]
     * @param sysDepartment 
     * @return
     */
    List<SysDepartment> querySysDepartmentByPage(SysDepartment sysDepartment);

}
