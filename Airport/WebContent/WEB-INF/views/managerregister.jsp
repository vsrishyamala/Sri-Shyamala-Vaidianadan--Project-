<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.red{
color:red;
}
</style>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/manager/processmanager" modelAttribute="manager">
VendorId:<form:input path="vendorId"/><br>
FirstName:<form:input path="firstName"/><span><form:errors path="firstName" cssClass="red"></form:errors></span><br>
LastName:<form:input path="lastName"/><span><form:errors path="lastName" cssClass="red"></form:errors></span><br>
Age:<form:input path="age"/><br>
Gender:<form:input path="gender"/><span><form:errors path="gender" cssClass="red"></form:errors></span><br>
ContactNumber:<form:input path="contactNumber"/><br>
PassWord:<form:input path="passWord"/><span><form:errors path="passWord" cssClass="red"></form:errors></span>
<input type="submit" value="Submit">
</form:form>

</body>
</html>