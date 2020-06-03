<%@page import="org.apache.catalina.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String userName = (String)session.getAttribute("userName");
%>
<body>
<div id="header" >
  <div id="top-navbar">
	  <!-- nav bar Start -->
	 <nav class="navbar navbar-expand-lg fixed-top	 navbar-dark bg-primary">
		<a class="navbar-brand" href="#">
		    <img src="/images/boltzlogo.jpg" width="38" height="38" alt="Boltz">
		</a>
		<!-- Search Box -->
		<form id="search" class="form-inline my-2 my-lg-0">
		  <input class="form-control mr-sm-2 input-normal" placeholder="Search for products" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-light my-2 my-sm-0" type="submit">Search</button>
		</form>
		<!-- Search Box -->

		<!-- Menu -->
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	  
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
			  <li class="nav-item">
				<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
			  </li>
			  <li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					<i class="fa fa-user-o"></i>
				</a>
    			<div class="dropdown-menu" aria-labelledby="navbarDropdown">
    			  <%
    			  	if(userName != null && !"".equals(userName))
    			  	{
    			  %>
    			  	  <a class="dropdown-item" href="#">My Profile</a>
					  <a class="dropdown-item" href="#">Orders</a>
					  <a class="dropdown-item" href="#">Logout</a>
					  <div class="dropdown-divider"></div>
					  <a class="dropdown-item" href="#">Something else here</a>		
    			  <%
    			  	}
    			  	else
    			  	{
    			  %>
	    			  <a class="dropdown-item" href="<c:url value='/loginpage'></c:url>">Login</a>
					  <a class="dropdown-item" href="<c:url value='/registerpage'/>">Sign Up</a>
					  <div class="dropdown-divider"></div>
					  <a class="dropdown-item" href="#">Something else here</a>
    			  <%} %>

				</div>

			  </li>
			  <li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">SHOP</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
				  <a class="dropdown-item" href="#">Dog</a>
				  <a class="dropdown-item" href="#">Cat</a>
				  <div class="dropdown-divider"></div>
				  <a class="dropdown-item" href="#">Something else here</a>
				</div>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" style="font-size:17px" href="#">
				<i class="fa fa-cart-plus"></i>
				</a>
			  </li>
			</ul>
	    </div>
	    <!-- Menu -->
	 </nav>
     <!-- nav bar End -->
   </div>
 </div>

</body>
</html>