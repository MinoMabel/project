<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add course</title>
</head>
<body>
<form:form action="course" modelAtrribute="newcourse">
<table align="center">
<tr><td>Coursename :</td></tr>
<tr><td><input type="text" name="cname"></td></tr>
<tr><td>Course Id</td></tr>
<tr><td><input type="text" name="cid"></td></tr>
<tr><td>Duration </td></tr>
<tr><td><input type="text" name="dur"></td></tr>
<tr><td>Credits</td></tr>
<tr><td><input type="text" name="credits"></td></tr>
<tr><td><input type="submit" value="ADD"></td></tr>
</table>
</form:form>
</body>
</html>