<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add a Team Review</h1>

<form name=addTeam action = AddTeamServlet method =get>
<label>Team Name</label>
<input type=text name=teamName value = ""/>
<br />
<label>Team Gender</label>
<input type=text name=gender value = ""/>
<br />
<label>Team Age Range</label>
<input type = text name = ageRange value = ""/>
<br />
<label>Sport ID Number</label>
<input type = text name = sportID value = ""/>
<br/>
<label>Team Level</label>
<input type=text name=level value = ""/>
<br />
<label>Address</label>
<input type=text name=address value = ""/>
<br />
<label>City</label>
<input type=text name=city value = ""/>
<br />
<label>State</label>
<input type=text name=state value = ""/>
<br />
<label>Zip Code</label>
<input type=text name=zip value = ""/>
<br />
<label>Region</label>
<input type=text name=region value = ""/>
<br />
<label>Country</label>
<input type=text name=country value = ""/>
<br />
<label>Phone Number</label>
<input type=text name=phone value = ""/>
<br />
<label>Email Address</label>
<input type=text name=email value = ""/>
<br />
<label>Website</label>
<input type=text name=website value = ""/>
<br />

<label>Content</label>
<input id = review type = text name = content value = ""/>
<br/>
<input type=submit name=submit value="Submit Review"/>
</form>
</body>
</html>
