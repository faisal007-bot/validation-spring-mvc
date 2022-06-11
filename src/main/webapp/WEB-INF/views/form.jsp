<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.error{
		color: red;
		text-align: left;
		margin-left: 30px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="process" method="post" modelAttribute="user">
		<p>
			<label>ID</label>
			<form:input path="id" />
			<form:errors path="id" cssClass="error"/>
		</p>
		<p>
			<label>Name</label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error"/>
		</p>
		<p>
			<label>Email</label>
			<form:password path="email" />
			<form:errors path="email" cssClass="error"/>
		</p>
		<p>
			<label>password</label>
			<form:password path="password" />
			<form:errors path="password" cssClass="error"/>
		</p>
		<p>
			<form:checkbox path="valid" />
			<label>accept the terms and conditions</label>
			<form:errors path="valid" cssClass="error"/>
		</p>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>