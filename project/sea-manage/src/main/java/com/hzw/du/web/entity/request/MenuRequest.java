package com.hzw.du.web.entity.request;

/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：菜单信息bean（添加、修改）
 * 文件名称：MenuRequest.java
 * 修改时间：2016-7-29
 * 修改人:zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
public class MenuRequest
{
    /*主键id*/
    private Integer menuId;

    /*菜单名称*/
    private String menuName;

    /*菜单路径*/
    private String urlPath;

    /*父菜单*/
    private Integer parentId;
    /*区分功能： add、edit、start、stop*/
    private String op;

    /*按钮集合 id,name 以,分割*/
    private String[] buttonIds;

    public Integer getMenuId()
    {
        return menuId;
    }

    public void setMenuId(Integer menuId)
    {
        this.menuId = menuId;
    }

    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public String getUrlPath()
    {
        return urlPath;
    }

    public void setUrlPath(String urlPath)
    {
        this.urlPath = urlPath;
    }

    public Integer getParentId()
    {
        return parentId;
    }

    public void setParentId(Integer parentId)
    {
        this.parentId = parentId;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public String[] getButtonIds()
    {
        return buttonIds;
    }

    public void setButtonIds(String[] buttonIds)
    {
        this.buttonIds = buttonIds;
    }

}
