package com.zhcx.common.util;

import org.springframework.context.ApplicationContext;

public class ContextUtils {

	private static ApplicationContext context;

	public static ApplicationContext getContext() {
		return context;
	}

	public static void setContext(ApplicationContext context) {
		if (ContextUtils.context == null && context != null) { 
			ContextUtils.context = context;
		}
	}
	
}
