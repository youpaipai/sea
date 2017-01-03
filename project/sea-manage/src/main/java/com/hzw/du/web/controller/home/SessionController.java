package com.hzw.du.web.controller.home;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionController implements HttpSessionListener{
	
	//session创建监听
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	//session失效监听
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		 String sessionId=arg0.getSession().getId();  
		    //当前session销毁时删除当前session绑定的用户信息  
		    //同时删除当前session绑定用户的HttpSession  
		 LoginController.USER_SESSION.remove(LoginController.SESSIONID_USER.remove(sessionId));  
	}

}
