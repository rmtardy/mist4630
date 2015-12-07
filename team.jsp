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
<title>Team List</title>
</head>
<body>

<h1>Teams</h1>
<table border=1>
<tr>
	<th>Team ID</th>
	<th>Team Name</th>
	<th>Gender</th>
	<th>Age Range</th>
	<th>Level</th>
	<th>Address</th>
	<th>City</th>
	<th>State</th>
	<th>Zip</th>
	<th>Region</th>
	<th>Country</th>
	<th>Phone</th>
	<th>Email</th>
	<th>Website</th>	
	<th colspan=2>Edit</th>
<%= table %>
</table>
<br />

<h2>Team not on the List?</h2>
<h2><a href="addTeam.jsp">Add a Team</a></h2>


</body>
</html>
