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
</head>
<div id="toolbar">
    <p>Home</p>
</div>
<div id="toolbar"><p>Football</p></div>
<div id="toolbar"><p>Basketball</p></div>
<div id="toolbar"><p>Baseball</p></div>
<div id="toolbarDone"><p></p></div>
<body>
<br>
<br>
<form name = "typeOf" action = "<%=selected%>.jsp" method = "get">
<p>
What is your review for?
<input type = "radio" name = "position" value = "organization">Organization
<input type = "radio" name = "position" value = "team">Team
<input type = "radio" name = "position" value = "coach">Coach
<input type = "radio" name = "position" value = "player">Player
<input type = "submit" name = "submit" value ="Enter">

</p>
</form>
</body>
</html>
