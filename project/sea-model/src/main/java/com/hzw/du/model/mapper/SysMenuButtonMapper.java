/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_MENU_BUTTON  菜单按钮关系表] dao
 * 文件名称：SysMenuButtonMapper.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [SYS_MENU_BUTTON  菜单按钮关系表] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface SysMenuButtonMapper extends BaseMapper {

    /**
     * 
     * 函数功能描述：插入[SYS_MENU_BUTTON  菜单按钮关系表]
     * @param sysMenuButton
     * @return
     */
    Integer insertSysMenuButton(SysMenuButton sysMenuButton);

    /**
     * 
     * 函数功能描述：根据条件查询[SYS_MENU_BUTTON  菜单按钮关系表]
     * @param sysMenuButton 
     * @return
     */
    List<SysMenuButton> querySysMenuButtonByPage(SysMenuButton sysMenuButton);

}
