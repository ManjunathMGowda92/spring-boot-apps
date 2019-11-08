package org.manjunath.springboot.votersappwithswagger.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class XFrameFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (request instanceof HttpServletRequest && response instanceof HttpServletResponse) {
			HttpServletResponse httpResponse = (HttpServletResponse) response;

			httpResponse.setHeader("X-XSS-Protection", "1; mode=block");
			httpResponse.setHeader("Strict-Transport-Security", "max-age=31536000; includeSubDomains");
			httpResponse.setHeader("X-Content-Type-Options", "nosniff");
			httpResponse.setHeader("Cache-control", "no-store, no-cache");
			httpResponse.setHeader("X-Frame-Options", "SAMEORIGIN");
			httpResponse.setHeader("Set-Cookie",
					"XSRF-TOKEN=NDKDdfdsfkldsfNd3SZAJfwLsTl5WUgOkE; Path=/; Secure;HttpOnly");
		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

}
