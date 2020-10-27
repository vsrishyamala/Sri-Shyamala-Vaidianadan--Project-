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
<form:form action="${pageContext.request.contextPath}/pilot/pilotprocess" modelAttribute="pilots" >
PlaneId:<form:input path="planeId"/><br>
PilotId:<form:input path="pilotId"/><br>
PilotName:<form:input path="pilotName"/><br>
PlaneName:<form:input path="planeName"/>
<input type="submit" value="Submit">
</form:form>

</body>
</html>