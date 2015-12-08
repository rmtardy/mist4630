<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css"/>
<title>Sport Chirp</title>
</head>
<body>
<h1>Sport Chirp Login</h1>
<br></br> 
<div id = "box">
<form name ="login" action = "home.jsp" method = "get">
<p id = "mid">Enter Username: 
<input type = "text" name = "username" value = ""/>
<br> 
Enter Password:
<input type = "password" name = "password" value = ""/>
<input type = "submit" name = "enter" value = "Submit"/>
</p>

</form>
</div>

<p>
Create a profile
</p>
<form name ="profile" action = "addPlayer.jsp" method ="get">
<input type = "submit" name = "createProf" value = "Create Profile"/>

</form>
<br>

<p>
<a href="read">View the database</a>
</p>
</body>
</html>
