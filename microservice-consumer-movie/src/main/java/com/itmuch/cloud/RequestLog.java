package com.itmuch.cloud;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestLog extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		ServletOutputStream outputStream = response.getOutputStream();
		response.getLocale();
	}
}
