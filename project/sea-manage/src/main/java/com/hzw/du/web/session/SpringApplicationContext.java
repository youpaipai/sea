/*
 * 公司名称：江苏华招网
 * 版权信息：江苏华招网版权
 * 描述：读取spring中配置的bean
 * 文件名称：SpringApplicationContext.java
 * 修改时间：2016年5月18日
 * 修改人：ypp
 * 修改内容：
 * 跟踪单号：
 * 修改单号 ：
 */
package com.hzw.du.web.session;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import ch.qos.logback.classic.Logger;

/**
 * 读取spring中配置的bean
 * @author ypp
 * @version V1.0[产品/模块版本]
 */
public class SpringApplicationContext implements ApplicationContextAware {

    private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    private static ApplicationContext context;
    
    /**
     * spring注入spring 上下文
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
        log.info("获取spring上下文的对象：[" + context.getClass().getName() + "]");
    }
    
    public static Object getBean(String id){
        return context.getBean(id);
    }
}
