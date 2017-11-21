<%@page import="com.eessn.sm.bean.AddressBean"%>
<%@page import="com.eessn.sm.json.Response"%>
<%@page import="com.eessn.sm.bean.ParentBean"%>
<%@page import="com.eessn.sm.json.JsonResponse"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.eessn.sm.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table>
<%
Object obj=request.getAttribute("responseObject");
if(obj!=null)
{
	Response responseObj=(Response)obj;
	StudentBean studenBeanObj=null;
	ParentBean parentBeanObj=null;
	AddressBean addressBeanObj=null;
	for(StudentBean studenBean:responseObj.getListOfStudent()){
		studenBeanObj=studenBean;
	}
	for(ParentBean parentBean:responseObj.getListOfParent()){
		parentBeanObj=parentBean;
	}
	for(AddressBean addressBean:responseObj.getListOfAddress()){
		addressBeanObj=addressBean;
	}
	
	if(studenBeanObj!=null && parentBeanObj!=null && addressBeanObj !=null){
	%>
	

	<tr>
	<tr><th>FirstName</th>
	<th>MiddleName</th>
	<th>LastName</th>
	<th>Date Of Birth</th>
	<th>Gender</th>
	<th>AdmissionSougth</th>
	
	<th>PrevoiusSchoolName</th>
	<th>fatherFirstName</th>
	<th>prensent_city</th>
	</tr>

<tr>
<td><%=studenBeanObj.getFirstName() %></td>
<td><%=studenBeanObj.getMiddleName() %></td>
<td><%=studenBeanObj.getLastName() %></td>
<td><%=studenBeanObj.getDateOfBirth() %></td>
<td><%=studenBeanObj.getGender() %></td>
<td><%=studenBeanObj.getAdmissionSought() %></td>
<td><%=studenBeanObj.getPreviousSchoolName() %></td>
<td><%=parentBeanObj.getFatherFirstName() %></td>
<td><%=addressBeanObj.getPrensent_city() %></td>
</tr>

<% 
}
	else{
		out.print("NO Data Found");
	}
}
	%>
	


</table>

</div>


</body>
</html>