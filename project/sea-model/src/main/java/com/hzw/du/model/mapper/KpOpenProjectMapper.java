/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid] dao
 * 文件名称：KpOpenProjectMapper.java
 * 修改时间：2016年7月19日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
 	
package com.hzw.du.model.mapper;

import java.util.List;

/**
 * [KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid] dao
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public interface KpOpenProjectMapper extends BaseMapper{
    
    /**
     * 
     * 函数功能描述：插入[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param kpOpenProject
     * @return
     */
    Integer insertKpOpenProject(KpOpenProject kpOpenProject);
   
    /**
     * 
     * 函数功能描述：根据条件查询[KP_OPEN_PROJECT  开标项目配置表， 序列seq_openid]
     * @param kpOpenProject 
     * @return
     */
    List<KpOpenProject> queryKpOpenProjectByPage(KpOpenProject kpOpenProject);
    
    
}
