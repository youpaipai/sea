/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_FILE  文件表， 序列seq_fileid] dao
 * 文件名称：SysFileMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_FILE  文件表， 序列seq_fileid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysFileMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_FILE  文件表， 序列seq_fileid]
     * @param sysFile
     * @return
     */
    Integer insertSysFile(SysFile sysFile);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_FILE  文件表]
     * @param sysFile 
     * @return
     */
    List<SysFile> querySysFileByPage(SysFile sysFile);
    
    /**
     * 
     * 函数功能描述：根据主键ID获取对象
     * @param fileId
     * @return
     */
    SysFile getSysFileById(Long fileId);
    
    /**
     * 
     * 函数功能描述：更新文件表数据
     * @param sysFile
     * @return
     */
    Integer modifySysFile(SysFile sysFile);

}
