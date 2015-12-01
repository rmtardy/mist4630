<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css"/>
<title>Home</title>
<h1>Welcome to Sport Chirp!</h1>
</head>

<body>

<p>We are the premier recruiting and review website for athletes, coaches and teams at the high school, college and pro levels. Select your sport:</p> 
<div>
	<center>
		<nav class="navbar">	
			<a href="football.jsp">Football</a>	
			<a href="basketball.jsp">Basketball</a>	
			<a href="baseball.jsp">Baseball</a>	
		</nav>
	</center>
</div>

<br>

<p>
Want to search by sport, name, or location?
</p>
<form name ="search" action = "search.jsp" method = "get">
<input type = "text" name = "search" value =""/>
<input type = "submit" name = "doSearh" value ="Search"/>
</form>

</body>
</html>
