package com.zhcx.web.session;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@WebListener
public class SessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent se) {
//		System.err.println("==== Session is created ====");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
//		System.err.println("==== Session is destroyed ====");
	}

}
