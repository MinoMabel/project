<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>signup</title>
</head>
<body>
<form:form action="sup" modelAtrribute="newuser">
<table align="center">
<tr><td>USERNMAE :</td></tr>
<tr><td><input type="text" name="uname"></td></tr>
<tr><td>PASSWORD</td></tr>
<tr><td><input type="password" name="pass"></td></tr>
<tr><td>EMAIL ID</td></tr>
<tr><td><input type="text" name="mail"></td></tr>
<tr><td>MOBILE NO</td></tr>
<tr><td><input type="password" name="mobile"></td></tr>
<tr><td><input type="submit" value="SIGNUP"></td></tr>
</table>
</form:form>
</body>
</html>