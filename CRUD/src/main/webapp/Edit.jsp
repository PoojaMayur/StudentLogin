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
<input type="hidden" name="id" value="${sdata.id}">

NAME:<input type="text" name="name" value="${sdata.name}">

ADDRESS:<input type="text" name="address" value="${sdata.address}">

USERNAME:<input type="text" name="uname" value="${sdata.username}">

PASSWORD:<input type="text" name="pass" value="${sdata.password}">


           <input type="submit" value="UPDATE">

</pre>
</center>
</form>
</body>
</html> 