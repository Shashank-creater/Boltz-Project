<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%--   <script src="<%=request.getContextPath() %>/resources/js/jquery-3.3.0.min"></script>
  <script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
  <link href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet" />
  <link href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet" />
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/footer.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/slider.css"> --%>
  
   <script src= "/js/jquery-3.3.0.min"></script>
  <script src="/js/bootstrap.min.js"></script>
  <link href="/css/bootstrap.min.css" rel="stylesheet" />
  <link href="/css/style.css" rel="stylesheet" />
  <link rel="stylesheet" href="/css/footer.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="/css/slider.css">

</head>
<body style="padding-top: 58px;">
<div id="container">
	<%@include file="header.jsp" %>
	<div class="container mt-3">
		<%@include file="slider.jsp" %>
		<%@include file="homeProductPage.jsp" %>
	</div>
	<%@include file="footer.jsp" %> 
</div>
</body>
</html>