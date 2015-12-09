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
Select below to find the review you want or search by sport:
</p>
<div style="margin-left:225px"> 
	<div>
		<form method="post" action="home.jsp"><button type="submit" class="btn" >Home</button></form>
	</div>
	<div>
		<form method="post" action="read"><button type="submit" class="btn" >Coach</button></form>
	</div>
	<div>
		<form method="post" action="ReadTeamServlet"><button type="submit" class="btn">Team</button></form>
	</div>
	<div>
		<form method="post" action="ReadOrganizationServlet"><button type="submit" class="btn">Organization</button></form>	
	</div>
	<div>
		<form method="post" action="search.jsp"><button type="submit" class="btn" >Search</button></form>
	</div>
</div>
<br>
<br>
<br>
<br>
<br>
<div style="margin-left:375px">
All Done?
<br>
<form method="post" action="Login?logout=true"><button type="submit" class="btn-search">Logout</button></form>
</div>
</body>
</html>
