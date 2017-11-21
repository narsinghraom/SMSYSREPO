<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.eessn.sm.bean.StudentBean"%>
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
<link rel="stylesheet" type="text/css" href="<c:url value='styles/StudentSearch.css'/>"/>

<spring:url value="/js/jquery-3.2.1.min.js" var="jquerymin"></spring:url>
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
<spring:url value="/js/jquery.validate.js" var="jqueryvalidation"></spring:url>
<spring:url value="/js/jquery.validate.min.js" var="jqueryvalidatemin"></spring:url>

<script src="${jquerymin}"></script>
<script src="${jqueryui}"></script>
<script src="${jqueryvalidation}"></script>
<script src="${jqueryvalidatemin}"></script>

 
<script type="text/javascript" src="<c:url value='js/StudentSearchByRadiusValidation.js'/>"></script>
<script type="text/javascript" src="<c:url value='js/StudentSearchByRadius.js'/>"></script>
<style type="text/css">
.error
{
color:red;
font-family:verdana, Helvetica;
}

</style>

</head>
<body>


<form action="searchElement" method="post" id="myform">
 
  <div align="center">
  SearchElement:
  <select  id="searchclass"  class="searchclass" name="classsearch" onkeydown="clearError()" onclick="return getclassData('<%=request.getContextPath()%>/GetNameAjax/getclass')" >
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
  </select>
  
<input type="text" id="searchId" name="serchelement"  placeholder="Lastname" onkeydown="clearError()"  onclick="return getAllLastName('<%=request.getContextPath()%>/GetNameAjax/getLastNameData')">
 <input type="text" id="contextpath" value=<%=request.getContextPath()%>> 
 <input type="text" id="searchadress" name="serchelement" placeholder="city" onkeydown="clearError()"   onclick="return getAddressData'<%=request.getContextPath()%>/GetNameAjax/getAddressListData')"  >
 <input type="text" id="contextpathid" value=<%=request.getContextPath()%>> 
<span id="span_serachelement" style="color: red;">Please select any option and enter some value to search</span> 
<br></br>
<p class='container'>
<input type="radio" id="searchelementradio" name="searchelementradio"  value="class" class="searchclass" onkeydown="clearError()">search by class
<input type="radio" id="searchelementradio" name="searchelementradio" value="lastname" class="searchname" onkeydown="clearError()"   >search by LastName
<input type="radio" id="searchelementradio" name="searchelementradio" value="address" class="searchaddress" onkeydown="clearError()"  >search by address
<span id="span" style="color: red;">Please select any of the radio button </span>
</p>
<br></br>


<input type="submit" value="Search" onclick="return validation()" id="btn">
</div>
</form>

 <div id="RadiusErrorMessage" align="center" style="color: red;"></div>
 <table id="tables"  align="center" style="width:100%" >
   
	
</table>
   
   
	
</body>
</html>