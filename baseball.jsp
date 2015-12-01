<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Baseball</title>
</head>
<body>
<div>
	<center>	
		<a href="home.jsp">Home</a>	
		<a href="football.jsp">Football</a>	
		<a href="basketball.jsp">Basketball</a>	
		<a href="baseball.jsp">Baseball</a>
	</center>
</div>
<h1 style="text-align: center">Baseball</h1>
<center>
Select the level<br>
<form action="baseball.jsp">
  <select name="levelBaseball">
    <option value="mlb">MLB</option>
    <option value="ncaa">NCAA</option>
    <option value="ghsa">GHSA</option>
  </select>
  <input type="submit" value="Submit">
</form>
<!-- if mlb is selected, "Select Team" appears with the appropriate teams -->
Select Team<br>

<form name ="addReview" action = "add.jsp" method = "get">
<p>Want to add a review?
<br>
<input type = "submit" name = "add" value = "Add"/>
</p>
</form>
</center></body>
</html>
