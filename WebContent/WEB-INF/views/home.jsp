<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Course</title>
</head>
<body>
<h1>ONLINE COURSE REGISTRATION SYSTEM</h1>
<form:form>
<a href="${pageContext.request.contextPath}/user">USER</a>
<a href="${pageContext.request.contextPath}/admin">ADMIN</a>
</form:form>
</body>
</html>