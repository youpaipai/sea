/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述 ：公共 javabean 
 * 文件名称：BaseEntity.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */

package com.hzw.du.model.mapper;

import java.util.Date;
import java.util.Map;

import com.hzw.du.model.page.MybatisPager;

/**
 * <一句话功能简述> 公共javabean
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class BaseBean {
    /**
     * 分页对象
     */
    protected MybatisPager pager;
    
    /**
     * CREATEUSER  NUMBER  Y           创建人
     */
    protected Long createUser;
    
    /**
     * CREATETIME  DATE    Y           创建时间
     */
    protected Date createTime;
    
    /**
     * UPDATEUSER  NUMBER  Y           修改人
     */
    protected Long updateUser;
    
    /**
     * UPDATETIME  DATE    Y           修改时间
     */
    protected Date updateTime;
    
    /**
     * 其它条件map，为了不增加该bean多余查询条件字段定义
     */
    protected Map<String, Object> conditonMap;
    
    /**
     * 排序sql
     */
    protected String orederBySql;

    /**
     * @return the pager
     */
    public MybatisPager getPager() {
        return this.pager;
    }

    /**
     * @param pager the pager to set
     */
    public void setPager(MybatisPager pager) {
        this.pager = pager;
    }

    /**
     * @return the createUser
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the updateUser
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return the conditonMap
     */
    public Map<String, Object> getConditonMap() {
        return this.conditonMap;
    }

    /**
     * @param conditonMap the conditonMap to set
     */
    public void setConditonMap(Map<String, Object> conditonMap) {
        this.conditonMap = conditonMap;
    }

    /**
     * @return the orederBySql
     */
    public String getOrederBySql() {
        return this.orederBySql;
    }

    /**
     * @param orederBySql the orederBySql to set
     */
    public void setOrederBySql(String orederBySql) {
        this.orederBySql = orederBySql;
    }
}
