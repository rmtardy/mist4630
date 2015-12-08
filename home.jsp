<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" type="text/css"/>
<title>Home</title>
</head>
<body>
<div class="home">Welcome to SportChirp!</div>
<p>We are the premier recruiting and review website for athletes, 
coaches and teams at the high school, college and pro levels. 
Select below to find the review you want or add your own:
</p> 

	<div>
		<form method="post" action="read"><button type="submit" class="btn" >Coach</button></form>
	</div>
	<div>
		<form method="post" action="ReadTeamServlet"><button type="submit" class="btn">Team</button></form>
	</div>
	<div>
		<form method="post" action="ReadOrganizationServlet"><button type="submit" class="btn">Organization</button></form>	
	</div>
<br>
<br>
<br>
<br>
<p>
Want to search by sport, name, or location?
<form method="post" action="search.jsp"><button type="submit" class="btn-search">Click Here</button></form>
<br><br>
All Done?
<form method="post" action="Login?logout=true"><button type="submit" class="btn-search">Logout</button></form>
</p>
</body>
</html>
