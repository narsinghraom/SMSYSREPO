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
Object obj1=request.getAttribute("listobj");
if(obj1!=null)
{
	List<StudentBean> listbean=(List<StudentBean>)obj1;
	Iterator itr=listbean.iterator();
	%>
	

	<tr>
	<tr><th>FirstName</th>
	<th>MiddleName</th>
	<th>LastName</th>
	<th>Date Of Birth</th>
	<th>Gender</th>
	<th>AddmissionSougth</th>
	<th>PrevoiusSchoolName</th>
	</tr>
	<%
	while(itr.hasNext()){
		StudentBean  bean=(StudentBean)itr.next();
%>

<tr>
<td><%=bean.getFirstName() %></td>
<td><%=bean.getMiddleName() %></td>
<td><%=bean.getLastName() %></td>
<td><%=bean.getDateOfBirth() %></td>
<td><%=bean.getGender() %></td>
<td><%=bean.getAdnissionSought() %></td>
<td><%=bean.getPrevschoolname() %></td>
</tr>

<%} 
}
%>
</table>
</div>
</body>
</html>