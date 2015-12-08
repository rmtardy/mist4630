<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Page</title>
</head>
<body>
<h1>Search Page</h1>
<p>Here you can search by Sport, Team or Location!</p>
<div>
	<center>	
		<a href="read">Coach</a>	
		<a href="ReadTeamServlet">Team</a>	
		<a href="ReadOrganizationServlet">Organization</a>
	</center>
</div>
<br/>
<p>Search by Sport:</p>
<form name=searchSport action =sportSearchServlet method=POST >
<label>Pick Sport</label>
<select name = "sports">
	<option value="football">Football</option>
	<option value="baseball">Baseball</option>	
	<option value="basketball">Basketball</option>
</select>
<input type=submit name=searchSport value="Search"/>

</form>
<br/>
<p>Search by Team:</p>
<form name=searchTeam action =teamSearchServlet method=POST >
<label>Pick Sport</label>
<select name = "sports">
	<option value="team1">Team 1</option>
	<option value="team2">Team 2</option>	
	<option value="team3">Team 3</option>
</select>
<input type=submit name=searchTeam value="Search"/>
</form>
<br/>
<p>Search by Location:</p>
<form name=searchLocation action=locationSearchServlet method=POST>
<label>Pick Sport</label>
<select name = "sports">
	<option value="football">Location 1</option>
	<option value="baseball">Location 2</option>	
	<option value="basketball">Location 3</option>
</select>
<input type=submit name=searchLocation value="Search"/>
</form>


</body>
</html>
