<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<form name ="login" action = "Login" method = "POST">
<p id = "mid">Enter Username: 
<input type = "text" name = "username" placeholder="Username" required>
<br> 
Enter Password:
<input type = "password" name ="password" placeholder ="Password" required>
<input type = "submit" name = "enter" value = "Login"/>
${errorMessage}
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
