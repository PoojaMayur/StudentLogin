<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
${msg}
<script type="text/javascript">
function add() {
	alert("in add")
	document.fn.action="registerpage";
	document.fn.submit();
}
function del() {
	
	alert("in delete")
	document.fn.action="del";
	document.fn.submit();
}
function edit() {

	alert("in edit")
	document.fn.action="edit";
	document.fn.submit();
}
</script>
</head>
<body bgcolor="cyan">
	<form name="fn">

			<font color="red">RECORDE</font>
			
		<table border="1" align="center">
			
			<th>Id</th>
			<th>NAME</th>
			<th>ADDRESS</th>
			<th>USERNAME</th>
			<th>PASSWORD</th>
			
			<c:forEach items="${data}" var="s">
			
				<tr>
					<td><input type="radio" name="id" value="${s.id}"></td>
					<td>${s.name}</td>
					<td>${s.address}</td>
					<td>${s.username}</td>
					<td>${s.password}</td>  
			</tr>
			</c:forEach> 
			
			
						


		</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="edit()"></td>
<td><input type="button" value="ADD" onclick="add()"></td>
<td><input type="button" value="DELETE" onclick="del()"></td>

</tr>
</table>
	</form>
</body>

</html>



