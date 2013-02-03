package org.andvicoso.superadvisor.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andvicoso.superadvisor.infra.util.StringUtils;

public class IndexFilter implements Filter {

	private String indexUrl;

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String path = req.getServletPath();

		if (StringUtils.isBlank(path) || path.equals("/")
				|| path.equals("/index.html")) {
			res.sendRedirect(req.getContextPath() + indexUrl);
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		indexUrl = config.getInitParameter("indexUrl");
	}

}
