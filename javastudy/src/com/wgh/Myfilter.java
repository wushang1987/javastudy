package com.wgh;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(
		urlPatterns = {"/index.jsp"},
		initParams = {
				@WebInitParam(name = "count", value = "5000")
		}
)

//简单的过滤器实现
public class Myfilter implements Filter {
	//来访数量
	private int count;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		count ++;
		HttpServletRequest req = (HttpServletRequest) request;
		
		ServletContext context = req.getServletContext();
		context.setAttribute("count", count);
		
		chain.doFilter(request,response);
		

	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		String param = fConfig.getInitParameter("count");
		count = Integer.valueOf(param);
	}

}
