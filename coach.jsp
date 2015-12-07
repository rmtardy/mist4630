<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<%
    String table = (String) request.getAttribute("table");
%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<title>Coach List</title>
</head>
<body>

<h1>Coaches</h1>
<table border=1>
<tr>
	<th>Coach ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th colspan=2>Edit</th>
<%= table %>
</table>
<br />

<h2>Coach not on the List?</h2>
<h2><a href="addCoach.jsp">Add a Coach</a></h2>


</body>
</html>
