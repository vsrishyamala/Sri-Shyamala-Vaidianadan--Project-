<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/plane/planeprocess" modelAttribute="plane" >
PlaneId:<form:input path="id"/><br>
Plane Name:<form:input path="planeName"/><br>
Departure:<form:input path="departure"/><br>
Landing Deck:<form:input path="landingDeck"/>
<input type="submit" value="Submit">
</form:form>

</body>
</html>