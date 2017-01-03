/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_MENU_BUTTON  菜单按钮关系表]
 * 文件名称：SysMenuButton.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_MENU_BUTTON  菜单按钮关系表]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysMenuButton extends BaseBean {
    
    /**
     * MENUID  NUMBER  Y           菜单ID
     */
    private Long menuId;
    
    /**
     * BUTTONID    NUMBER  Y           按钮ID
     */
    private Long buttonId;

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
