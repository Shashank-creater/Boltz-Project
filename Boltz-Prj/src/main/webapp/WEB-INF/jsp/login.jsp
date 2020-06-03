<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <script src="/js/jquery-3.3.0.min"></script>
  <script src="/js/bootstrap.min.js"></script>
  <link href="/css/bootstrap.min.css" rel="stylesheet" />
  <link href="/css/style.css" rel="stylesheet" />
  <link rel="stylesheet" href="/css/footer.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="/css/slider.css">

</head>
<body>
<div class="loginBody">
	 		
	 	<div class="text-center mt-5 mb-2">
	 		<a href="<c:url value='/homepage'/>">
		    	<img src="/images/boltzlogo.jpg" width="38" height="38" alt="">
			</a>
	 	</div>
		 <div style="width: 35%;margin: auto;margin-top: 3%;font-size: 24px;">
			<div id="LoginDiv" class="p-5" style="background:white;border: 1px solid black;">
				<p class="h4 mb-4 text-center">Sign in</p>
				<form action="login" method="post">
				  
				  <div class="form-group">
					<input type="email" name="username" class="form-control" id="username" aria-describedby="emailHelp" placeholder="Enter email">
					<small id="emailHelp" class="form-text text-muted ">We'll never share your email with anyone else.</small>
				  </div>
				  
				  <div class="form-group">
					<input type="password" name="password" class="form-control" id="password" placeholder="Password">
				  </div>
				  
				  <div class="form-group">
					
					<div class="light float-left ">
						<input type="checkbox" name="remember" id="remember">
						<label for="remember" class="custom-checkbox light small">Remember Me</label>
					</div>
					
					<div class="light float-right small">
						<a href="#" >Forgot Password?</a>
					</div>
					<div class="clear:both;"></div>
				  
				  </div>
							 
				  <!-- Sign in button -->
				  <button class="btn btn-info btn-block my-4" type="submit">Sign in</button>
				
				  <div class="text-center">
					Not a member ? <a href="<c:url value='/registerpage'/>"> Register </a>
				  </div>

				</form>
			</div>
		</div>
		<div>
			<hr>
			<div class=" row text-center mt-1 mb-2" style="width: 35%;margin: auto;">
				<div class="col-sm-4"> 				 
					<a class="text-body" href="<c:url value='/privacypage'/>">Privacy</a>
				 </div>
				 <div class="col-sm-4"> 	
					<a class="text-body"  href="<c:url value='/termsandcondtionpage' />">Terms &amp; Condition</a>
				  </div>
				  <div class="col-sm-4"> 	
					<a class="text-body" href="#">Help</a>
				  </div>
			</div>
			<div class="text-center">
				 &copy; boltz.co.in, Inc. or its affiliates
			</div>
		</div>
	 </div>
</body>
</html>