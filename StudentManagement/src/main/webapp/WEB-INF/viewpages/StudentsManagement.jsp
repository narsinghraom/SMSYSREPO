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
<link rel="stylesheet" type="text/css" href="<c:url value='styles/studentmanagment.css'/>"/>



<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="<c:url value='styles/studentmanagment.css'/>"/>
<spring:url value="/js/jquery-3.2.1.min.js" var="jquerymin"></spring:url>
<spring:url value="/js/jquery-ui.js" var="jqueryui"></spring:url>
<spring:url value="/js/jquery.validate.js" var="jqueryvalidation"></spring:url>
<spring:url value="/js/jquery.validate.min.js" var="jqueryvalidatemin"></spring:url>


<script src="${jquerymin}"></script>
<script src="${jqueryui}"></script>
<script src="${jqueryvalidation}"></script>
<script src="${jqueryvalidatemin}"></script>
<script src="${jqueryvalidatemin}"></script>


<script type="text/javascript" src="<c:url value='js/StudentManagement.js'/>"></script>


</head>
<body>
<jsp:include page="Welcome.jsp"></jsp:include>
	<div class="container">
		<ul id="accordion">
			<li ><a href="#" class="active"><i class="fa fa-user" aria-hidden="true"></i></a>
				<div class="box  active">
					<h3 class="masterTooltip" title="Student Admission Management">SAM</h3>
					<p>Manage registration and entire admission process of the
						students for each academic year Storing students previous school
						history and certificates Admission of students to a specific
						academic year in a specific stream, medium , standard and division
						with ease Accept / Reject student admissions On acceptance of
						admission process, automatic transfer of details of the
						student/staff to school register and school records without any
						paper work Get complete view of the student’s admission form with
						photo Generate customized reports to get statistics of student
						admissions</p>
				</div></li>
			<li><a href="#"><i class="fa fa-users" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Student Details Management">SDM</h3>
					<p>Manage all the details of the staff members along with their
						personal, login, educational details and other details. Facility
						of bulk updation to change no of leaves for more than one staff
						person at a time saving time and effort. Freeze/Unfreeze staff
						details incase of their leaving the school. View Staff Details of
						the staff easily through view section. Students’ Details like
						personal details, login details, parents’ details and other
						details can be stored securely in a centralized system Centralized
						GR No. system to keep track of throughout his academic career in
						the school. Complete details of the student with photo can be
						viewed from the view section. You can freeze/unfreeze students as
						per choice Search students belonging to a particular class,
						standard, stream, or medium. You can also search details of a
						particular student using his name or gr no. using the advanced
						search option.</p>
				</div></li>
			<li><a href="#"><i class="fa fa-user-plus" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Student Inquiry Management">SIM</h3>
					<p>You can store all the admission inquiries at one place
						Manage the admission inquiries as per the need and keep a track of
						the inquiries Import/Export inquires from/to Excel. Know the
						status of the inquiry and also change them as per the inquiry
						becomes fruitful/unfruitful.</p>
				</div></li>
			<li><a href="#"><i class="fa fa-sort-numeric-asc" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Student Roll No. Allocation">SRA</h3>
					<p>Allocate roll no. to students of the classes with just one
						click Allocate roll no. to students of the classes with just one
						click UpDation of roll no. of students is easy and simple in case
						some of students leave the class</p>
				</div></li>
			<li><a href="#"><i class="fa fa-certificate" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Certificate Generation">CG</h3>
					<p>Generate certificates for school students and staff Keep a
						record of generated certificates for future references Facility to
						print the generated certificate on the spot Following is a list of
						certificates which can be generated from the software</p>
					<p>Bonafide Certificate</p>
					<p>Migration Certificate</p>
					<p>Transfer Certificate</p>
					<p>Probation Extension</p>
					<p>Offer of Appointment on Probation</p>
					<p>Job Confirmation</p>
				</div></li>
			<li><a href="#"><i class="fa fa-address-card" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Notice Board Management">NBD</h3>
					<p>The school easily post all types of message on the notice
						board. </p>
						<p>Students and teachers can easily go through the notices
						through their logins.</p>
						<p> The school authorities can automatically set
						to activate/deactivate a given notice for a given time period thus
						helping in autoMizing the posting and removal of notices after the
						given time period. </p>
						<p>The authorities can also manually
						activate/deactivate the notices incase the school wants to remove
						the notice bearing wrong message.</p>
				</div></li>

			<li><a href="#"><i class="fa fa-bus" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Transportation Management">TM</h3>
					<p>Easily upload data all route and transportation information
						through an easy-to-use iolite transport bus route management
						module Seamlessly integrate transportation information and
						notification capability into your school website; Allow parents
						and guardians the ability to view their address and bus route on a
						map as well as a listing of bus stops that serve them; Reduce
						calls and complaints to your transportation department Instantly
						inform parents and guardians with email notifications with
						management notification system, parents can register to receive
						important notices related to schedule, stop or vehicle changes and
						find their child’s designated bus stop; Locate which school their
						child would attend if they are planning to move Visualize the
						route their child’s bus will be taking to and from school
						Centralize and maintain consistency in transportation information
						significantly reduce phone inquiries and complaints. You are in
						control transport management system it is fully configurable from
						your desktop. You decide if you want to show stop times, bus
						routes, bus names, am/ pm trips it is in your control. Only your
						district maps, schools, routes and stops are uploaded to our
						servers. It allows you to manage the transport system and
						transport routes of your school vehicles.</p>
					<p>Manage entire transport system of the school.</p>
					<p>Manage route and route stop.</p>
					<p>Integrated with Google Maps to easily define bus routes.</p>
					<p>Route and stop allocation to students, staff and teachers.</p>

				</div></li>
			<li><a href="#"><i class="fa fa-id-card" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="ID Card Generation">ICG</h3>
					<p>It gives you a wonderful facility of automatically generate
						the ID cards for school students and staff members It allows you
						to generate ID cards as per your school design needs. Saves a lot
						of time by eradicating manual entry of the students and staff.</p>
				</div></li>
			<li><a href="#"><i class="fa fa-calendar-plus-o"
					aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Activities Events Management">AEM</h3>
					<p>Keep a list of all the activities happening in the school.
						Keep a track on the upcoming activities All the activities get
						added to the Academic Calendar Student can see all the yearly
						activities through their Student’s Desk in the Academic Calendar
						Section.</p>
				</div></li>
			<li><a href="#"><i class="fa fa-building" aria-hidden="true"></i></a>
				<div class="box">
					<h3 class="masterTooltip" title="Hostel Management">HM</h3>
					<p>It allows you to manage all the school hostels efficiently.
						It allows you to manage different students and teachers in
						different hostels and allocate different rooms to different
						students. Keep a record of hostel ins and outs and hostel
						consumables and durables efficiently. Generate Customized Reports
						for further reference.</p>
				</div></li>
			<li><a href="#"><i class="fa fa-info-circle"
					aria-hidden="true"></i></a>
				<div class="box ">
					<h3 class="masterTooltip" title="Inventory Management">IM</h3>
					<p>Manage record of school consumables and durables
						proficiently. Manage the whole inventory of the school with its
						items and different categories and assign different items to
						different categories. Keep record of purchase order management and
						product inspections. Get stock reports of school and alert for
						shortage of particular items. Keep record of purchase order
						listing and vendor-supplier listing of the school.</p>
				</div></li>
				
				
		</ul>
	</div>




</body>
</html>