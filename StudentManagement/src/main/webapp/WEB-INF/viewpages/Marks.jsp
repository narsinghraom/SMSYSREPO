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

<spring:url value="/js/jquery-3.2.1.min.js" var="jquerymin"></spring:url>
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
<spring:url value="/js/jquery.validate.js" var="jqueryvalidation"></spring:url>
<spring:url value="/js/jquery.validate.min.js" var="jqueryvalidatemin"></spring:url>

<script src="${jquerymin}"></script>
<script src="${jqueryui}"></script>
<script src="${jqueryvalidation}"></script>
<script src="${jqueryvalidatemin}"></script>

<script type="text/javascript" src="<c:url value='js/Marks.js'/>"></script>
</head>
<body>
<div align="center">

AdmissionID:<input type="text" name="admissionID" id="admissionId" onkeydown="return getAdmissionIdValue('<%=request.getContextPath()%>/GetNameAjax/getAdmissionId')" >
<br></br>

StudentName:<input type="text" name="name" id="firstname" disabled="disabled" ><br></br>

Class:<input type="text" name="name" id="firstname" disabled="disabled" ><br></br>

Father first name:<input type="text" name="name" id="fathername" disabled="disabled" ><br></br>
<!-- <select class="ui search  dropdown" id="searchselect"  name="classsearch" >
  <option value="Nursery">Nursery</option>
  <option value="UKG">UKG</option>
  <option value="LKG">LKG</option>
  <option value="1">First Class</option>
  <option value="2">Second Class</option>
  <option value="3">Third Class</option>
  <option value="4">Fourth Class</option>
  <option value="5">Fiveth Class</option>
  <option value="6">Sixth Class</option>
 <option value="7">Seven Class</option>
  <option value="8">Eight Class</option>
  <option value="9">Nineth Class</option>
  <option value="10">Tenth Class</option>
  </select> -->

<input type="submit" value="Submit" >



</div>
</body>
</html>