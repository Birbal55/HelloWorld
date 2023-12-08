<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Index.jsp</h1>
	
<a href='today'>Today's Date</a>
<br>
<h1>

	<%@page import="java.util.Date" %>

	<%!
		final int number = 90;
		public int sayHello(int number){
			return number * 3;
	}
	%>
	<%= new Date() %>
	<%
		int[] arr = new int[]{12,23,56,89,65,89};
		for(int i : arr){
	%>
	    <%= sayHello(i)%>
	
	<%}%>
</h1>
<a href='fake-credit-cards'>Generate Fake Credit Cards</a>
<br>	

</body>
</html>