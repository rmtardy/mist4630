<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css" type="text/css"/>
<title>Sports</title>
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
<p>
Select a sport in the toolbar or type in a name or location in the search bar. 
</p>
</head>
<form name ="search" action = "search.jsp" method = "get">
<input type = "text" name = "search" value =""/>
<input type = "submit" name = "doSearh" value ="Search"/>
</form>
</body>
</html>
