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

 
 <link rel="stylesheet" type="text/css" href="<c:url value="/styles/welcome.css"/>/">
 
<spring:url value="/js/jquery-3.2.1.min.js" var="jquerymin"></spring:url>
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
<spring:url value="/js/jquery.validate.js" var="jqueryvalidation"></spring:url>
<spring:url value="/js/jquery.validate.min.js" var="jqueryvalidatemin"></spring:url>
<spring:url value="/js/RegistrationValidation.js" var="jqueryregistration"></spring:url>

<script src="${jquerymin}"></script>
<script src="${jqueryui}"></script>
<script src="${jqueryvalidation}"></script>
<script src="${jqueryvalidatemin}"></script>
<script src="${jqueryvalidatemin}"></script>

<script type="text/javascript" src="<c:url value='js/validated.js'/>"></script>
<script type="text/javascript" src="<c:url value='js/accordion.js'/>"></script>


</head>
<body>
	
 <div class="main">
 <div> 
 <div class="accordion_welcome">
    <a><button id="stnbtn" onclick="window.location.href='StudentsMangement'" class="btn">StudentMangement</button></a>&nbsp;&nbsp;&nbsp;
	<a><button  id="regbtn" onclick="window.location.href='Registration'" class="btn">Registration</button></a>&nbsp;&nbsp;&nbsp;
	<a><button>Login</button></a>&nbsp;&nbsp;&nbsp;
	<a><button class="btn" onclick="window.location.href='SchoolManagementSystem'" id="smsbtn">SchoolManagementSystem</button></a>&nbsp;&nbsp;&nbsp;
	<a><button class="btn" onclick="window.location.href='Search'">Search</button></a><br></br>
     <a><button class="btn" onclick="window.location.href='Feepayment'">Feepayment</button></a>
	</div>
 			
</div>
 			
	 </div> 		 
</body>
</html>