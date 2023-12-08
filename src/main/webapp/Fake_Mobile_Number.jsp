<%@ page import="java.util.Random" %>>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fake Mobile Numbers:</h1>
	<table border='1' padding='5px'>
	<%
		Random r = new Random();
		for(int i = 0; i < 20; i++){
			String numbers = "+9198"+((r.nextDouble() + "").substring(2,11));
	%>	
			<tr>
				<td><%= numbers %></td>
			</tr>
		<%} %>
	
	</table>
	

</body>
</html>