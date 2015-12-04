<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add a Player Review</h1>

<form name=addPlayer action = AddPlayerServlet method =get>
<label>Player First Name</label>
<input type=text name=playerFName value = ""/>
<br />
<label>Player Last Name</label>
<input type=text name=playerLName value = ""/>
<br />
<label>Player ID Number</label>
<input type = text name = playerID value = ""/>
<br />
<label>Sport ID Number</label>
<input type = text name = sportID value = ""/>
<br/>
<label>Content</label>
<input id = review type = text name = content value = ""/>
<br/>
<input type=submit name=submit value="Submit Review"/>
</form>
</body>
</html>
