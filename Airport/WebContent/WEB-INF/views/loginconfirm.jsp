<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Admin</h1>
<a href="${pageContext.request.contextPath}/plane/addplane">Add Planes</a>
<a href="${pageContext.request.contextPath}/plane/viewplane">View Planes</a><br>

<a href="${pageContext.request.contextPath}/pilot/pilotshow">Add Pilots</a>
<a href="${pageContext.request.contextPath}/pilot/viewpilot">View Planes</a><br>

<a href="${pageContext.request.contextPath}/hangar/hangarshow">Add Hangar</a>
<a href="${pageContext.request.contextPath}/hangar/viewhangar">View Hangar</a>

</body>
</html>