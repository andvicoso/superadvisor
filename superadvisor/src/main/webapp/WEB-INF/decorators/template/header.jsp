<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/imports.jsp"%>

<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="#">Super Advisor</a>
			<div class="nav-collapse collapse">
				<ul class="nav">
					<s:set var="page" value="%{#session.login.loginType.name()}" />
					<c:set var="page" value="${empty page ? 'GUEST' : page}" />
					<jsp:include page="menu/${fn:toLowerCase(page)}.jsp" />
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>