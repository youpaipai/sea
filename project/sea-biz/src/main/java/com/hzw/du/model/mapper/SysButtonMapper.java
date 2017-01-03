/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_BUTTON  按钮初始表， 序列seq_buttonid] dao
 * 文件名称：SysButtonMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_BUTTON  按钮初始表， 序列seq_buttonid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysButtonMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param sysButton
     * @return
     */
    Integer insertSysButton(SysButton sysButton);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_BUTTON  按钮初始表， 序列seq_buttonid]
     * @param sysButton 
     * @return
     */
    List<SysButton> querySysButtonByPage(SysButton sysButton);

}
