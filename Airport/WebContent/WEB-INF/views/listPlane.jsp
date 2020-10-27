<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Plane List</h1>
<table border="1">
<c:forEach var="plane" items="${listPlane}">
                <tr>
 
                    <td>${plane.id}</td>
                    <td>${plane.planeName}</td>
                    <td>${plane.departure}</td>
                    <td>${plane.landingDeck}</td>
                </tr>
</c:forEach>
</table>
</body>
</html>