<%@page import="com.eessn.sm.bean.ParentBean"%>
<%@page import="com.eessn.sm.bean.StudentBean"%>
<%@page import="com.eessn.sm.logics.BussinessLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="<c:url value='styles/registration.css'/>" />
<spring:url value="/js/jquery-3.2.1.min.js" var="jquerymin"></spring:url>
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
<spring:url value="/js/jquery.validate.js" var="jqueryvalidation"></spring:url>
<spring:url value="/js/jquery.validate.min.js" var="jqueryvalidatemin"></spring:url>

<script src="${jquerymin}"></script>
<script src="${jqueryui}"></script>
<script src="${jqueryvalidation}"></script>
<script src="${jqueryvalidatemin}"></script>

<script type="text/javascript"
	src="<c:url value='js/RegistrationValidation.js'/>"></script>
<script type="text/javascript" src="<c:url value='js/validated.js'/>"></script>
<script type="text/javascript" src="<c:url value='js/accordion.js'/>"></script>
</head>
<body>
<%-- <div>
	 <jsp:include page="Welcome.jsp"></jsp:include> 
</div> --%>

<%-- <%
Object obj=request.getAttribute("studentbean");

	StudentBean  bean=(StudentBean)obj;
	
%> --%>


	<div class="accordion_contanier">

		<div class="accordion_head">
			<button class="accordion">StudentInformation</button>
			<span class="plusminus">+</span>
		</div>
		<div class="accordion_body" style="display: none;">
			<form action="stroedStudentDetails" method="post">
				<table>
					<tr>
						
					<tr>
						<th>NAME:</th>

						<td><input type="text" name="firstName" id="fname"
							placeholder="FirstName" onkeypress="return isAlfa(event)"
							onkeydown="clearAll()" ></td>
						<td><input type="text" name="middleName"
							placeholder="MiddleName" id="mname" 
							onkeypress="return isAlfa(event)" onkeydown="clearAll()"></td>
						<td><input type="text" name="lastName" placeholder="LastName"
							id="lname" onkeypress="return isAlfa(event)"
							onkeydown="clearAll()"></td>
						<td><span id="span_name">Name field is mandatory</span></td>
						<td><span id="span_mname">middle name field is
								mandatory</span>
						<td><span id="span_lname">last name field is mandatory</span>
					</tr>
					<tr>
						<th>Date Of Birth:</th>
						<td><input type="text" id="dob" name="dateOfBirth"
							placeholder="mm/dd/yyyy" size="20"
							onkeypress="return isNumber(event)" onkeydown="clearAll()"></td>
						<td><span id="span_dob">please enter the date of birth</span></td>
					</tr>
					<tr>
						<th>Gender:</th>
						<td>Female<input type="radio" id="gender" value="female"
							name="gender"> Male<input type="radio" id="gender"
							name="gender" value="male"></td>
						
					</tr>


					<tr>
						<th>Admission Sought :</th>
						<td><select name="admissionSought" onkeydown="clearAll()" id="admissionSought">
								<option>---select-----</option>
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

						</select></td>
						<td><span id="span_asought">enter the class </span></td>
					</tr>
				
					<tr>
						<th>Previous School Name:</th>
						<td><input type="text" placeholder="School Name"
							name="previousSchoolName" id="pschoolname" onkeypress="return isAlfa(event)" onkeydown=" clearAll()"></td>
						<td><span id="span_pschoolname">previous school name</span></td>
					</tr>
					<tr>
						<td class="acordion_student_button"><input type="submit"
							value="Update" class="button_upadted" id="btn"></td>
						<td><input type="reset" value="Reset" id="btn"></td>
					</tr>
				</table>
			</form>
		</div>




		<div class="accordion_head">
			<button class="accordion">ParentInformation</button>
			<span class="plusminus">+</span>
		</div>
		<div class="accordion_body" style="display: none;">
			<form action="stroedparentDetails" method="post">
				<table>
					<tr>
						<th>Father's NAME:</th>
						<td><input type="text" name="fatherFirstName" id="fathername"
							placeholder="FirstName" onkeypress="return isAlfa(event)"
							onkeydown=" clearAll()"></td>
						<td><input type="text" name="fatherMiddleName"
							placeholder="MiddleName" onkeypress="return isAlfa(event)"></td>
						<td><input type="text" name="fatherLastName"
							placeholder="LastName" onkeypress="return isAlfa(event)"></td>
						<td><span id="span_fathername">father name field is
								mandatory</span></td>
					</tr>
					<tr>
						<th>Father Occupation:</th>
						<td><input type="text" placeholder="occupation"
							name="fatherOccupation" id="foccupation" onkeypress="return isAlfa(event)" onkeydown="clearAll()"></td>
						<td><span id="span_foccupation">occupation field is
								mandatory</span></td>
					</tr>
					<tr>
						<th>Father Qualification:</th>
						<td><input type="text" placeholder="qualification"
							name="fatherQualification" id="fatherQualification"
							onkeypress="return isAlfa(event)" onkeydown="clearAll()"></td>
						<td><span id="span_fqualification">qualification field
								is mandatory</span></td>
					</tr>

					<tr>
						<th>Mother's NAME:</th>
						<td><input type="text" name="motherFirstName"
							placeholder="FirstName" id="mothername"
							onkeypress="return isAlfa(event)" onkeydown="clearAll()"></td>
						<td><input type="text" name="motherMiddleName"
							placeholder="MiddleName" onkeypress="return isAlfa(event)"></td>
						<td><input type="text" name="motherLastName"
							placeholder="LastName" onkeypress="return isAlfa(event)"></td>
						<td><span id="span_mothername">mother name field is
								mandatory</span></td>
					</tr>
					<tr>
						<th>Mother Occupation:</th>
						<td><input type="text" placeholder="occupation"
							name="motherOccupation" id="moccupation"
							onkeypress="return isAlfa(event)" onkeydown="clearAll()"></td>
						<td><span id="span_moccupation">mother occupation
								field is mandatory</span></td>

					</tr>
					<tr>
						<th>Mother Qualification:</th>
						<td><input type="text" placeholder="qualification"
							id="txtNumeric" name="motherQualification"></td>
					</tr>

					<tr>
						<th>Mobile No :</th>
						<td><input type="text" placeholder="mobile" id="mobile"
							name="mobileNo" onkeypress="return isNumber(event)"
							onkeydown="clearAll()"></td>
						<td><span id="span_mobile">mobile no field is
								mandatory</span></td>
						<td>
					</tr>
					<tr>
						<th>Alternate/Emergency Contact No:</th>
						<td><input type="text" placeholder="Number" id="altermobile"
							name="alternateMobileNo" onkeypress="return isNumber(event)" onkeydown="clearAll()"></td>
							<td><span id="span_altermobile">mobile no field is
								mandatory</span></td>
						<td>
					</tr>
					<tr>
						<td class="accordion_parent_button"><input type="submit"
							value="Update" id="btn"></td>
						<td><input type="reset" value="Reset" id="btn"></td>
					</tr>
				</table>
			</form>
		</div>


		<div class="accordion_head">
			<button class="accordion">AddressDetails</button>
			<span class="plusminus">+</span>
		</div>
		<div class="accordion_body" style="display: none;">
			<form action="storedaddressDetails" method="post">
				<table>
					<tr>
						<th>ResidentialAddress</th>
					</tr>
					
					<tr>
						<th>HouseNo/Bldg/Apt:</th>
						<td><input type="text" placeholder="houseno/Bldg/Apt"
							id="hba" name="residential_address" class="txtNumeric"
							onkeydown="clearAll()"></td>
						<td><span id=span_hba>HouseNo/Bldg/Apt field any one</span></td>
					</tr>
					<tr>
						<th>Village/Town/City :</th>
						<td><input type="text" placeholder="village/town/city"
							id="vtc" class="txtNumeric" name="residential_town"
							onkeydown="clearAll()"></td>
						<td><span id="span_vtc">Village/Town/City field any
								one </span></td>
					</tr>
					<tr>
						<th>Street/Road/Lane:</th>
						<td><input type="text" placeholder="street/road/lane"
							id="srl" class="txtNumeric" name="residential_lane"
							onkeydown="clearAll()"></td>
						<td><span id="span_srl">Street/Road/Lane field any one
						</span></td>
					</tr>
					<tr>
						<th>LandMark:</th>
						<td><input type="text" placeholder="landmark" id="landmark"
							class="txtNumeric" name="residential_landMark"
							onkeydown="clearAll()"></td>
						<td><span id="span_land">near land mark field any
								one </span></td>
					</tr>
					<tr>
						<th>City:</th>
						<td><input type="text" placeholder="city" id="city"
							onkeypress="return isAlfa(evt)" name="residential_city"
							onkeydown="clearAll()"></td>
						<td><span id="span_city">city feild is mandatory </span></td>
					</tr>
					<tr>
						<th>State:</th>
						<td><input type="text" placeholder="state" id="state"
							onkeypress="return isAlfa(evt)" name="residential_state"
							onkeydown="clearAll()"></td>
						<td><span id="span_state">state feild is mandatory </span></td>
					</tr>
					<tr>
						<th>District:</th>
						<td><input type="text" placeholder="district" id="district"
							onkeypress="return isAlfa(evt)" name="residential_district"
							onkeydown="clearAll()"></td>
						<td><span id="span_district"> district is mandatory</span></td>
					</tr>
					<tr>
						<th>PinCode:</th>
						<td><input type="text" placeholder="pincode" id="pincode"
							onkeypress="return isNumber(event)" name="residential_pincode"
							onkeydown="clearAll()"></td>
						<td><span id="span_pincode">pindoce is mandatory </span></td>
					</tr>
					<tr>
						<th>PostOffice:</th>
						<td><input type="text" placeholder="postoffice"
							class="txtNumeric" id="postoffice" name="residential_postOffice"
							onkeydown="clearAll()"></td>
						<td><span id="span_postoffice">near postoffice is
								mandatory </span></td>
					</tr>
				</table>
				<table>
					<tr>
						<th>Present Address</th>
					</tr>
					<tr>
						<th>HouseNo/Bldg/Apt:</th>
						<td><input type="text" placeholder="houseno/Bldg/Apt"
							class="txtNumeric" id="p_hba" name="prensent_address"
							onkeydown="clearAll()"></td>
						<td><span id=span_phba>HouseNo/Bldg/Apt field any one</span></td>
					</tr>
					<tr>
						<th>Village/Town/City :</th>
						<td><input type="text" placeholder="village/town/city"
							class="txtNumeric" id="p_vtc" name="prensent_town"
							onkeydown="clearAll()"></td>
						<td><span id="span_pvtc">Village/Town/City field any
								one </span></td>
					</tr>
					<tr>
						<th>Street/Road/Lane:</th>
						<td><input type="text" placeholder="street/road/lane"
							class="txtNumeric" id="p_srl" name="prensent_lane"
							onkeydown="clearAll()"></td>
						<td><span id="span_psrl">Street/Road/Lane field any
								one </span></td>
					</tr>
					<tr>
						<th>LandMark:</th>
						<td><input type="text" placeholder="landmark"
							class="txtNumeric" id="p_landmark" name="prensent_landMark"
							onkeydown="clearAll()"></td>
						<td><span id="span_pland">near land mark field any
								one </span></td>
					</tr>
					<tr>
						<th>City:</th>
						<td><input type="text" placeholder="city"
							onkeypress="return isAlfa(evt)" id="p_city" name="prensent_city"
							onkeydown="clearAll()"></td>
						<td><span id="span_pcity">city feild is mandatory </span></td>
					</tr>
					<tr>
						<th>State:</th>
						<td><input type="text" placeholder="state"
							onkeypress="return isAlfa(evt)" id="p_state"
							name="prensent_state" onkeydown="clearAll()"></td>
						<td><span id="span_pstate">state feild is mandatory </span></td>
					</tr>
					<tr>
						<th>District:</th>
						<td><input type="text" placeholder="district"
							onkeypress="return isAlfa(evt)" id="p_district"
							name="prensent_district" onkeydown="clearAll()"></td>
						<td><span id="span_pdistrict"> district is mandatory</span></td>
					</tr>
					<tr>
						<th>PinCode:</th>
						<td><input type="text" placeholder="pincode"
							onkeypress="return isNumber(event)" id="p_pincode"
							name="prensent_pincode" onkeydown="clearAll()"></td>
						<td><span id="span_ppincode">pindoce is mandatory </span></td>
					</tr>
					<tr>
						<th>PostOffice:</th>
						<td><input type="text" placeholder="postoffice"
							class="txtNumeric" id="p_postoffice" name="prensent_postOffice"
							onkeydown="clearAll()"></td>
						<td><span id="span_ppostoffice">near postoffice is
								mandatory </span></td>
					</tr>
					<tr>
						<td class="acordion_address_button"><input type="submit"
							value="Update" id="btn"></td>
						<td><input type="reset" value="Reset" id="btn"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>