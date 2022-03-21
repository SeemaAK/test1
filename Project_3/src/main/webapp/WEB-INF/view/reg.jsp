<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<h2>Register Here</h2>
</head>
<body>
<form action="Register" method="post">
<pre>
Name    <input type="text" name="name"/>
City    <input type="text" name="city"/>
Email   <input type="text" name="email"/>
Mobile  <input type="text" name="mobile"/>

<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>