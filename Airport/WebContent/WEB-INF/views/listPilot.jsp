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
<h1>Pilot List</h1>
<table border="1">
<c:forEach var="pilot" items="${listPilot}">
                <tr>
 
                    <td>${pilot.planeId}</td>
                    <td>${pilot.pilotId}</td>
                    <td>${pilot.pilotName}</td>
                    <td>${pilot.planeName}</td>
                </tr>
</c:forEach>
</table>

</body>
</html>