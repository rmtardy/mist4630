<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%String table = (String) request.getAttribute("table"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Org Profile</title>
</head>
<body>
<h1>Org Profile</h1>
<!-- make this page appear depending on what coachID was clicked -->

<table border =1>
<tr>
	<th>Review ID</th>
	<th>Review</th>
	<th>Sport</th>
	<th colspan=2>Edit</th>
	<%= table %>

</table>
<form name ="review" action = "ReviewOrgServlet" method ="post">
<input type = "text" name = "reviewID" value = "" />Review ID
<input type = "text" name = "content" value = "" />Content
<input type = "text" name = "sport" value = "" />Sport
<input type = "submit" name =  "addReview" value = "Add Review"/>

</form>
</body>
</html>
