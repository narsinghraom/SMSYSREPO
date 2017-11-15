<%@page import="com.eessn.sm.bean.AddressBean"%>
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
Object obj=request.getAttribute("serchelementadress");
if(obj!=null)
{
	List<AddressBean> listbean=(List<AddressBean>)obj;
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
		
		AddressBean  bean=(AddressBean)itr.next();
%>

<tr>
<td><%=bean.getPrensent_address() %></td>
</tr>

<%} 
}
	%>
	


</table>

</div>

</body>
</html>