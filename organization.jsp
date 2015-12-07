<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Organization</title>
</head>
<body>
<h1>Organization</h1>
<table border=1>
	<tr>
		<th>orgID</th>
		<th>ordAddress</th>
		<th>orgCity</th>
		<th>orgZip</th>
		<th>orgRegion</th>
		<th>orgCountry</th>
		<th>orgPhone</th>
		<th>webURL</th>
		<th>admissionURL</th>
		<th>orgName</th>
	</tr>
</table>
<br>
<form name ="addReview" action = "add.jsp" method = "get">
<p>Want to add a review?
<br>
<input type = "submit" name = "add" value = "Add"/>
</p>
</form>
</body>
</html>
