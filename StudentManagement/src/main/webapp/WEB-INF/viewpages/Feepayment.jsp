<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style> 
#id {
    border: 2px solid;
    padding: 10px;
    background: #dddddd;
    width: 50%;
    left
    : 85%;
    
}
</style>

<spring:url value="/js/jquery-3.2.1.min.js" var="jquerymin"></spring:url>
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
<spring:url value="/js/jquery.validate.js" var="jqueryvalidation"></spring:url>
<spring:url value="/js/jquery.validate.min.js" var="jqueryvalidatemin"></spring:url>


<script src="${jquerymin}"></script>
<script src="${jqueryui}"></script>
<script src="${jqueryvalidation}"></script>
<script src="${jqueryvalidatemin}"></script>
<script type="text/javascript" src="<c:url value='js/FeePayment.js'/>"></script>
</head>
<body>

 <jsp:include page="Welcome.jsp"></jsp:include>
<form action="">
<div id="id" align="center">
StudentName<input type="text" name="name" id="fname" onkeydown="return getfirstnameValues('<%=request.getContextPath()%>/GetNameAjax/getfnameData')">
<br></br>
ClassName<input type="text" name="class" id="class" >
FatherName<input type="text" name="fathername" id="fathername">
</div>
</form>
</body>
</html>