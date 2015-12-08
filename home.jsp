<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css"/>
<title>Home</title>
</head>
<body>
<h1>Welcome to Sport Chirp!</h1>
<p>We are the premier recruiting and review website for athletes, coaches and teams at the high school, college and pro levels. Select your sport:</p> 
<div>
	<center>	
		<a href="read">Coach</a>	
		<a href="ReadTeamServlet">Team</a>	
		<a href="ReadOrganizationServlet">Organization</a>
	</center>
</div>

<br>



<p>
Want to search by sport, name, or location?<a href="search.jsp"> Click here</a>
</p>



<p>
 All done? <a href="Login?logout=true"> Logout</a>
</p>
</body>
</html>

