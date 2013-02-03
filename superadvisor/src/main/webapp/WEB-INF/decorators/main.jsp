<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/imports.jsp"%>
	
<!DOCTYPE html>
<html>
<head>
	<base href="/superadvisor/">
	
	<style type="text/css">
	
	 .container {
        width: auto;
        max-width: 680px;
      }
      .container .credit {
        margin: 20px 0;
      }
	</style>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="andvicoso">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Language" content="pt-BR" />
	
	<link rel="shortcut icon" type="image/png" href="static/img/favicon.ico" />
	<link href="static/css/bootstrap/bootstrap.min.css" rel="stylesheet"
		media="screen">
	<link href="static/css/bootstrap/bootstrap-responsive.css"
		rel="stylesheet">
	<link href="static/css/default.css" rel="stylesheet">
	<link href="static/css/normalize.css" rel="stylesheet">
	<link href="static/css/sticky_footer.css" rel="stylesheet">
	
	<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <![endif]-->
	
	<title>Super Advisor - <sitemesh:write property="title" /></title>
	
	<sitemesh:write property="head" />
</head>
<body>
	<div id="wrap" >
		<jsp:include page="template/header.jsp" />
	
		<sitemesh:write property="body" />
		<div id="push"></div>
	</div>

	<jsp:include page="template/footer.jsp" />
	<!-- javascript -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html