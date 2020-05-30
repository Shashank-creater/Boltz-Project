<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	function ajaxCheck()
	{
		$.ajax({
				type:'POST',
				url : 'ajaxCall',
				data : {name :'shashank'},
				success : function(data)
				{
					alert(data);
				}
		});
	}
</script>
</head>
<body>

<spring:message code="index.language.title"/>
<h2><spring:message code="index.welcome.language.heading"></spring:message> </h2>
<form:form action="register-User"  method="post" modelAttribute="UserDetails">
	<form:input path="userName"/>
	<form:errors path="userName"></form:errors><br/>
	<form:password path="password"/>
	
<%-- 	<form:select path="role">
		<form:option value="">--Select Role--</form:option>
		<form:options items="${list}"></form:options>
	</form:select> --%>
	
	<input type="submit" value="SUBMIT">
</form:form>

<button onclick="ajaxCheck();">Ajax Check</button>

<a class="dropdown-item" href="?language=en"><spring:message code="index.language.english"/></a> 
<a class="dropdown-item" href="?language=hi"><spring:message code="index.language.hindi"/></a>
</body>
</html>
