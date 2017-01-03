/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表]
 * 文件名称：SysRoleMenuButton.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_ROLE_MENU_BUTTON  角色菜单按钮权限表]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysRoleMenuButton extends BaseBean {
    /**
     * ROLEID  NUMBER  Y           角色ID
     */
    private Long roleId;
    
    /**
     * MENUID  NUMBER  Y           菜单ID
     */
    private Long menuId;
    
    /**
     * BUTTONID    NUMBER   Y           按钮
     */
    private Long buttonId;

    /**
     * @return the roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the menuId
     */
    public Long getMenuId() {
        return this.menuId;
    }

    /**
     * @param menuId the menuId to set
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * @return the buttonId
     */
    public Long getButtonId() {
        return this.buttonId;
    }

    /**
     * @param buttonId the buttonId to set
     */
    public void setButtonId(Long buttonId) {
        this.buttonId = buttonId;
    }

}
