<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average</title>
</head>
<body>

	<h2>
		The average of
		<%=request.getAttribute("num1")%>
		and
		<%=request.getAttribute("num2")%>
		is
		<%=request.getAttribute("result")%>
	</h2>

</body>
</html>