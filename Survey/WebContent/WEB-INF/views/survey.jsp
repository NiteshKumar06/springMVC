<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to survey Page</h1>
<form:form method="post" action="saveSurvey" modelAttribute="surveyAnsList">

<table border="1px">
		<tr>
			<td>id</td><td>Question</td><td></td>
		</tr>
		<c:forEach items="${questionList}" var="question" varStatus="status">
			<tr>
			<td><input type="text" name="answers[${status.index}].id" value="${question.id}" readonly="readonly"> </td>
			<td><input type="text" name="answers[${status.index}].question" value="${question.question}" readonly="readonly"> </td>
			 <td> <input type="radio" name="answers[${status.index}].vote" value="Yes"> Yes<br>
  				 <input type="radio" name="answers[${status.index}].vote" value="No"> No<br> 
  			</td> 
			</tr>
		</c:forEach>
	</table>
	<br>
	<input type="submit" value="Save" />

</form:form>

</body>
</html>