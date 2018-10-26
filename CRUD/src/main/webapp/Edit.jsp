<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Yellow">
<form action="update">
<center>
<pre>
<input type="hidden" name="id" value="${data.id}">

NAME:<input type="text" name="name" value="${data.name}">

ADDRESS:<input type="text" name="address" value="${data.address}">

USERNAME:<input type="text" name="username" value="${data.username}">

PASSWORD:<input type="text" name="password" value="${data.password}">


           <input type="submit" value="UPDATE">

</pre>
</center>
</form>
</body>
</html> 