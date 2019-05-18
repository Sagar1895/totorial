<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>search for place</title>
</head>
<h1>SEARCH PLACE</h1>
<body>
	<form action="searchPlace" method="get">
		SEARCH: <input type="text" name="place"></input> 
	
			<input type="submit"  value="search value"></input>
	</form>
	
	<h2>${searchEntity}</h2>
	<h3>${Id}</h3>
	<h3>${State}</h3>
	<h3>${Country}</h3>
	<h3>${Description}</h3>
	<h3>${Popular}</h3>
	<h3>${Season}</h3>
	<h3>${error}</h3>
	
</body>
</html>