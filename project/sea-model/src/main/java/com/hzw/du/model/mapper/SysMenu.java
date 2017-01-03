/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[SYS_MENU  菜单表， 序列seq_menuid]
 * 文件名称：SysMenu.java
 * 修改时间：2016年7月20日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

/**
 * [SYS_MENU  菜单表， 序列seq_menuid]
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SysMenu extends BaseBean {

    /**
     * MENUID  NUMBER  N           菜单ID
     */
    private Long menuId;

    /**
     * MENUNAME    VARCHAR2(100)   Y           菜单名称
     */
    private String menuName;

    /**
     * URLPATH VARCHAR2(500)   Y           URL路径
     */
    private String urlPath;

    /**
     * PARENTID    NUMBER  Y           父菜单编号
     */
    private Long parentId;

    //CREATEUSER  NUMBER  Y           创建人
    //CREATETIME  DATE    Y           创建时间
    //UPDATEUSER  NUMBER  Y           修改人
    //UPDATETIME  DATE    Y           修改时间

    /**
     * STATUS  NUMBER  Y   0       0.启用 1.停用
     */
    private Integer status;

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
     * @return the menuName
     */
    public String getMenuName() {
        return this.menuName;
    }

    /**
     * @param menuName the menuName to set
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return the urlPath
     */
    public String getUrlPath() {
        return this.urlPath;
    }

    /**
     * @param urlPath the urlPath to set
     */
    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    /**
     * @return the parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
