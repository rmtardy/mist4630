<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add an Organization Review</h1>

<form name=addOrganization action = AddOrganizationServlet method =get>
<label>Organization Name</label>
<input type=text name=orgName value = ""/>
<br />
<label>Organization ID Number</label>
<input type = text name = orgID value = ""/>
<br/>
<label>Address</label>
<input type=text name=orgAddress value = ""/>
<br />
<label>City</label>
<input type=text name=orgCity value = ""/>
<br />
<label>State</label>
<input type=text name=orgState value = ""/>
<br />
<label>Zip Code</label>
<input type=text name=orgZip value = ""/>
<br />
<label>Region</label>
<input type=text name=orgRegion value = ""/>
<br />
<label>Country</label>
<input type=text name=orgCountry value = ""/>
<br />
<label>Phone Number</label>
<input type=text name=orgPhone value = ""/>
<br />
<label>Website URL</label>
<input type=text name=webURL value = ""/>
<br />
<label>Admissions URL</label>
<input type=text name=admissionsURL value = ""/>
<br />

<label>Content</label>
<input id = review type = text name = content value = ""/>
<br/>
<input type=submit name=submit value="Submit Review"/>
</form>
</body>
</html>>
