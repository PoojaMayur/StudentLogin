<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
${msg}
<script type="text/javascript">
function add() {
	
	document.fn.action="registerpage";
	document.fn.submit();
}
function del() {
	
	document.fn.action="del";
	document.fn.submit();
}
function edit() {

	document.fn.action="edit";
	document.fn.submit();
}
</script>
</head>
<body bgcolor="cyan">
	<form name="fn">


		<table border="1" align="center">
			
			<th>Id</th>
			<th>NAME</th>
			<th>USERNAME</th>
			<th>PASSWORD</th>
			
			
				<c:forEach items="${sdata}" var="sdata">
				<tr>
					
					<td><input type="radio" name="id" value="${sdata.id}"></td>
					<td>${sdata.name}</td>
					<td>${sdata.address}</td>
					<td>${sdata.username}</td>
					<td>${sdata.password}</td>    
					
					
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



