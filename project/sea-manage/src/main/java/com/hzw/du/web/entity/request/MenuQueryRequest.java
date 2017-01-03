package com.hzw.du.web.entity.request;

import com.hzw.du.web.entity.BaseRequest;

/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：菜单查询信息bean（查询使用） 
 * 文件名称：MenuQueryRequest.java
 * 修改时间：2016-7-29
 * 修改人:zl
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

public class MenuQueryRequest extends BaseRequest
{
    /*主键id*/
    private Integer menuId;

    /*区分功能： add、edit、start、stop*/
    private String op;

    /*菜单id集合  以-分隔 用于 启用 停用*/
    private String menuIds;
    
    /*状态  0.启用 1.停用*/
    private Integer status;

    public Integer getMenuId()
    {
        return menuId;
    }

    public void setMenuId(Integer menuId)
    {
        this.menuId = menuId;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public String getMenuIds()
    {
        return menuIds;
    }

    public void setMenuIds(String menuIds)
    {
        this.menuIds = menuIds;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

}
