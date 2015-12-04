<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add a coach review</h1>

<form name=addCoach action = AddCoachServlet method =get>
<label>Coach First Name</label>
<input type=text name=coachFName value = ""/>
<br />
<label>Coach Last Name</label>
<input type=text name=coachLName value = ""/>
<br />
<label>Coach ID Number</label>
<input type = text name = coachID value = ""/>
<br />
<label>Sport ID Number</label>
<input type = text name = sportID value = ""/>
<br/>
<label>Content</label>
<input id = review type = text name = content value = ""/>
<br/>
<input type=submit name=submit value="Add the Product"/>
</form>
</body>
</html>
