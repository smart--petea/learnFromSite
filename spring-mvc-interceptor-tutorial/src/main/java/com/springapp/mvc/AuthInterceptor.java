package com.springapp.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthInterceptor implements HandlerInterceptor {

	private static final Logger logger = Logger.getLogger("AuthInterceptor");
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.info(" After Completion ");

	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
			throws Exception {
		logger.info(" Post handle ");
		if(modelAndView.getModelMap().containsKey("status")) {
			String status = (String) modelAndView.getModelMap().get("status");
			if(status.equals("SUCCESS!")) {
				status = "Authentication " + status;
				modelAndView.getModelMap().put("status", status);
			}
		}
	}

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		logger.info(" Pre handle ");
		
		if(httpServletRequest.getMethod().equals("GET")) {
			return true;
		} else {
			return false;
		}
	}

}
