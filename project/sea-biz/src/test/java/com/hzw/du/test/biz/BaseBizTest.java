package com.hzw.du.test.biz;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hzw.du.biz.BaseBiz;
import com.hzw.du.biz.BussinessBiz;
import com.hzw.du.biz.ManageBiz;
import com.hzw.du.biz.PortalBiz;
import com.hzw.du.biz.bean.BaseRequestInput;
import com.hzw.du.biz.bean.param.BaseCommonOutput;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

public class BaseBizTest {
	
    protected static Logger log = (Logger) LoggerFactory.getLogger(BaseBizTest.class);
    
	/**
     * 公共biz
     */
    @Autowired
    @Qualifier("baseBiz")
    protected BaseBiz baseBiz;
    
    /**
     * 业务系统biz
     */
    @Autowired
    @Qualifier("bussinessBiz")
    protected BussinessBiz bussinessBiz;
    
    /**
     * 后台管理biz
     */
    @Autowired
    @Qualifier("manageBiz")
    protected ManageBiz manageBiz;
    
    /**
     * 门户网站biz
     */
    @Autowired
    @Qualifier("portalBiz")
    protected PortalBiz portalBiz;
    
    protected static Object proxyFactory(final Object obj){
        return Proxy.newProxyInstance(TestBizInOutput.class.getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                log.debug("\n>>>>开始=["+ method.getName() +"]\n");
                Object result = null;
                if(args != null && args.length == 1){
                    if(args[0] instanceof BaseRequestInput){
                        debug((BaseRequestInput)args[0]);
                    }
                }
                result = method.invoke(obj, args);
                if(result != null && result instanceof BaseCommonOutput){
                    debug((BaseCommonOutput)result);
                }
                log.debug("\n>>>>>>>结束=["+ method.getName() +"]\n");
                return result;
            }
        });
    }
    
    
    
	protected static void  debug(BaseRequestInput baseRequestInput){
	    String data = new JSONSerializer().exclude("*.class","*.hashKey").transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(baseRequestInput);
        
	    log.info("input>>>\n" + data);
	}
	
	protected static void debug(BaseCommonOutput output){
	    String data = new JSONSerializer().exclude("*.class","*.hashKey").transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(output);
	    log.info("output>>>\n" + data);
	}
	
}
