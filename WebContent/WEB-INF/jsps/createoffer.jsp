<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link type="text/css" href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">

<table class ="formtable">
<tr><td class="label">Name: </td><td><sf:input path="name" name="name" type="text"/></td></tr>
<tr><td class="label">Email: </td><td><sf:input path="email" name="email" type="text"/></td></tr>
<tr><td class="label">Your offer: </td><td><sf:textarea path="text" name="text" rows="10" cols="10"></sf:textarea></td></tr>
<tr><td> </td><td><input value="Create advert" type="submit"/></td></tr>
</table>

</sf:form>



</body>
</html>