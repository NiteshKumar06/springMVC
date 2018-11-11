<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Enrollments</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>

<form:form method="post" action="save" modelAttribute="empForm">
<body>
	<h2>List of Employees</h2>	
	 <table>
		<tr>
			<td>KIN</td><td><input type="text" name="kin"></td>
		</tr>
		
		<tr>
			<td>NAME</td><td><input type="text" name="name"></td>
		</tr>
		
		<tr>
			<td>Empcode</td><td><input type="text" name="empCode"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="save"></td>
		</tr>
		
		
	</table>
</body>
</form:form>

</html>