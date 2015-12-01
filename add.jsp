<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

String selected = "";

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css"/>
<title>Add Review</title>
<div>
	<center>
		<nav class="navbar">
			<a href="home.jsp">Home</a>	
			<a href="football.jsp">Football</a>	
			<a href="basketball.jsp">Basketball</a>	
			<a href="baseball.jsp">Baseball</a>	
		</nav>
	</center>
</div>
</head>
<body>
<br>
<br>
<form name = "typeOf" action = "<%=selected%>.jsp" method = "get">
<p>
What is your review for?<br>
<a href="addOrganization.jsp">Organization</a><br>
<a href="addTeam.jsp">Team</a><br>
<a href="addCoach.jsp">Coach</a><br>
<!-- <input type = "radio" name = "position" value = "addOrganization">Organization
<input type = "radio" name = "position" value = "addTeam">Team
<input type = "radio" name = "position" value = "addCoach">Coach
<input type = "submit" name = "submit" value ="Enter"> -->

</p>
</form>
</body>
</html>
