/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：TODO
 * 文件名称：Demo.java
 * 修改时间：2016年7月13日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */



 	
package com.hzw.du.model.mapper;

/**
 * <一句话功能简述> TODO
 * <功能详细描述>
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class Demo extends BaseBean{
    /**
     * 唯一ID
     */
    private String id;
    
    /**
     * 名称
     */
    private String name;
    
    /**
     * 是否删除（逻辑删除）
     */
    private String isDel;

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the isDel
     */
    public String getIsDel() {
        return this.isDel;
    }

    /**
     * @param isDel the isDel to set
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }
    
}
