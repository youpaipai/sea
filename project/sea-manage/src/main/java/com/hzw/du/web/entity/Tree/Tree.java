/*
 * 公司名称：江苏华招网信息技术有限公司
 * 版权信息：江苏华招网信息技术有限公司版权所有
 * 描述：TODO
 * 文件名称：Tree.java
 * 修改时间：2016-7-25
 * 修改人：张露
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.web.entity.Tree;

import java.io.Serializable;

/**
 * <一句话功能简述> 权限节点Tree
 * @author zl
 * @version V1.0[产品/模块版本]
 */
public class Tree implements Serializable
{
    //节点id
    private Integer id;
    //节点名称
    private String name;
    //父节点
    private Integer pId;
    //节点是否选中
    private boolean checked;
    //是否显示checkbox
    private boolean nocheck;
    
    public boolean isNocheck()
    {
        return nocheck;
    }
    public void setNocheck(boolean nocheck)
    {
        this.nocheck = nocheck;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getpId()
    {
        return pId;
    }
    public void setpId(Integer pId)
    {
        this.pId = pId;
    }
    public boolean isChecked()
    {
        return checked;
    }
    public void setChecked(boolean checked)
    {
        this.checked = checked;
    }
    public Tree(Integer id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
    public Tree()
    {
        super();
    }
    
    
}