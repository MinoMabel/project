<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user</title>
</head>
<body>
<form:form action="login" modelAtrribute="log">
<table align="center">
<tr><td>USERNMAE :</td></tr>
<tr><td><input type="text" name="uname"></td></tr>
<tr><td>PASSWORD</td></tr>
<tr><td><input type="password" name="pass"></td></tr>
<tr><td><input type="submit" value="LOGIN"></td></tr>
</table>
</form:form>
<form:form>
New User? <a href="&{pageContext.request.contextPath}\sign">Click here</a>
</form:form>
</body>
</html>