package org.andvicoso.superadvisor.infra.util;

import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public final class WebUtils {

	public static String getBaseURL(final HttpServletRequest req) {

		final String scheme = req.getScheme(); // http
		final int serverPort = req.getServerPort(); // 80
		final String serverName = req.getServerName(); // hostname.com
		final String contextPath = req.getContextPath(); // /mywebapp

		return scheme + "://" + serverName + ":" + serverPort + contextPath;

	}

	public static String getRequestURL(final HttpServletRequest req) {
		return getBaseURL(req) + req.getRequestURI();
	}

	public static void writeInResponse(final HttpServletResponse res,
			final InputStream in, final String mimeType) {

		OutputStream out = null;
		int length = 0;

		try {

			out = res.getOutputStream();

			length = StreamUtils.write(in, out);

			res.setContentType(mimeType);
			res.setContentLength(length);

		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			StreamUtils.closeQuietly(in);
			StreamUtils.closeQuietly(out);
		}

	}

	public static void writeInResponse(final HttpServletResponse res,
			final String string, final String mimeType) {

		OutputStream out = null;
		final int length = string.length();

		try {

			out = res.getOutputStream();

			StreamUtils.write(string, out);

			res.setContentType(mimeType);
			res.setContentLength(length);

		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			StreamUtils.closeQuietly(out);
		}

	}

	private WebUtils() {
		// construtor privado para não ser instanciado
	}

	public static String getCurrentUrl(HttpServletRequest request) {
		ServletContext context = ServletActionContext.getServletContext();
		String contextPath = context.getContextPath();
		String appUrl = (String) context.getAttribute("appUrl");
		String targetUrl = (String) request
				.getAttribute("javax.servlet.forward.request_uri");
		targetUrl = targetUrl.replaceFirst(contextPath, "");

		if (request.getQueryString() != null) {
			targetUrl += "?" + request.getQueryString();
		}

		return appUrl + targetUrl;
	}

	public static String getCurrentUrl() {
		HttpServletRequest request = ServletActionContext.getRequest();
		return getCurrentUrl(request);
	}
}
