<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" type="text/css"/>
<title>SportChirp</title>
</head>
<body class="background">
<center><div class="home">SportChirp Login</div></center>
 <br>
<center><div id = "box">
<form name ="login" action = "home.jsp" method = "get">
<p id = "mid">Enter Username: 
<input type = "text" name = "username" value = ""/>
<br> 
Enter Password:
<input type = "password" name = "password" value = ""/>
<br>
<input type = "submit" name = "enter" value = "Submit"/>
</p>
</form>
</div></center>
<br>
<center>
<form name ="profile" action = "addPlayer.jsp" method ="get">
Create a profile
<input type = "submit" name = "createProf" value = "Create Profile"/>
</form></center>
</body>
</html>
