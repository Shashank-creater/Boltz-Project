<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="slider">
	<div id="demo" class="carousel slide" data-ride="carousel">
	  <!-- Indicators -->
	  <ul class="carousel-indicators">
		  <c:forEach var="banner" items="${bannerInfo}" varStatus="loop">
		  	 	<c:choose>
			 		<c:when test="${loop.index == 0 }">
	  					<li data-target="#demo" data-slide-to="${loop.index}" class="active"></li>
					</c:when>
					<c:otherwise>
	  					<li data-target="#demo" data-slide-to="${loop.index}"></li>
					</c:otherwise>
				</c:choose>
		  </c:forEach>
	  </ul>
	  
	  <!-- The slideshow -->
	  <div class="carousel-inner">
			<c:forEach var="banner" items="${bannerInfo}" varStatus="loop">
				<c:choose>
					<c:when test="${loop.index == 0 }">
						<div class="carousel-item active">
							<img src="/images/${banner.imageName}" alt="${banner.imageName}">
						</div>
					</c:when>
					<c:otherwise>
						<div class="carousel-item">
							<img src="/images/${banner.imageName}" alt="${banner.imageName}">
						</div>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
	  
	  <!-- Left and right controls -->
	  <a class="carousel-control-prev" href="#demo" data-slide="prev" style="width: 3%;position: absolute;
    background: #574646;    height: 50%;    top: 1;    top: 25%;">
		<span class="carousel-control-prev-icon"></span>
	  </a>
	  <a class="carousel-control-next" href="#demo" data-slide="next" style="width: 3%;position: absolute;
    background: #574646;    height: 50%;    top: 1;    top: 25%;">
		<span class="carousel-control-next-icon"></span>
	  </a>
   </div> 
</div>

</body>
</html>