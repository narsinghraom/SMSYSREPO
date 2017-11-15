<%@page import="java.util.Iterator"%>
<%@page import="com.eessn.sm.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='styles/StudentSearch.css'/>"/>
 <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/semantic.min.css">
 
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/semantic.min.js"></script>
<script type="text/javascript" src="js/semantic.min.css"></script>


<script type="text/javascript" src="<c:url value='js/StudentView.js'/>"></script>

 
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
 
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
 
 
<script src="${jqueryui}"></script>

<style type="text/css">
.hidden{
display:none;
}

</style>

</head>
<body>

<form action="studentview" method="post">

<div align="center">
<select class="ui search  dropdown" id="searchselect"  name="classsearch" onclick="return getAdnissionSought('<%=request.getContextPath()%>/GetNameAjax/getData')" >
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
 
  

<div class="ui input">
  <input placeholder="Enter Name" type="text" name="studentname" id="fname" onkeydown="return getAllNameData('<%=request.getContextPath()%>/GetNameAjax/getNameData')" >
  <input type="text" id="contextpath" value=<%=request.getContextPath()%>>
</div> 

<input type="submit" id="btn" value="SUBMIT"> 
</div>
 </form>
 
 
	 
 
 <table id="table" class="hidden" align="center" style="width:100%" >
   
	<tr><th>FirstName</th>
	<th>MiddleName</th>
	<th>LastName</th>
	<th>Date Of Birth</th>
	<th>Gender</th>
	<th>AddmissionSougth</th>
	<th>PrevoiusSchoolName</th>
	
	</tr>
</table>
   
	
 
  
  
 
</body>
</html>