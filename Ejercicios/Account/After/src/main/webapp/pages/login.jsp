<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>

<h2>Log In</h2>

<p id="message"><strong>${message}</strong></p>

<form action="login" method="post">

<p>User: <input type="text" name="user" id="user" /></p>
<p>Password: <input type="password" name="password" id="password" /></p>
<p><input type="submit" id="accept"  name="accept" value="Accept" /></p>

</form>

</body>
</html>