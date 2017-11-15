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
<div  class="container">
<ul id="accordion">
<li><a href="#" class="active"><i class="fa fa-table"  aria-hidden="true"></i></a>
<div class="box   active">
<h3>TIME  TABLE MANAGEMENT</h3>
<p>Time Table Management is most tedious and effort consuming task for the school staff. Each class has a unique time table along with specific subjects and subject – teachers. <p>
<p>Iolite – School Management Software helps in creating time table for students of each class easily and effortlessly. Moreover, the timetables for the teachers are automatically generated based on the the student timetables. <p>
<h4>Features & Advantages of Time Table Management System: </h4>
<p>You can create time-slots for the timetable as per your school principles. </p>
<p>You can create different time-slots for timetables of different standards as per need. Create attendance, prayer and recess slots as per need. </p>
<p>Edit and change time-table whenever the need arises. Students can see their timetable of their class and teachers can see their whole day time-table.</p> 
<p>Easy creation of time table along with printing. Time to time re-arrangement can be done.</p> 
<p>Drag and drop makes time table creation easy and simple. </p>
<p>Avoid conflicts in timings for teachers. Facility to select school working days.</p> 
<p>Automatic creation of time table for teachers on creation of students’ timetables.</p>
</div>
</li>
<li>
<a href="#"><i class="fa fa-id-card-o" aria-hidden="true"></i></a>
<div class="box">
<h3>ATTENDENCE MANAGEMENT:</h3>
<h4>Student Attendance & Staff Attendance </h4>
<p>Maintaining an attendance register of students and staffs requires a lot of effort and accuracy. The software provides feature to keep a record of attendance inside the system eliminating manual effort consuming task. 
It is also linked with the school academic year so that you need not fill attendance for school holidays, vacations and sundays. It also allows you to also fill basic attendance, day boarding attendance, lunch attendance and snacks attendance for the students incase your school provides the day boarding facilities. </p>
<h4>Features & Advantages of Attendance Management System: </h4>
<p>Manage attendance of all the students and staff from one place.<p> 
<p>Manage basic attendance, day boarding attendance, lunch attendance and snacks attendance for 
students if the school provides day boarding facilities. </p>
<p>Simple and easy interface for filling attendance of all staff and students.</p> 
<p>The administrator can keep a note of staff attendance and keep a record of the same. </p>
<p>As staff attendance is linked with the payroll module, it allows automatic calculation of working days and 
generate  payslips for all the staff members.</p> 
<p>Cumulative term, mid-term and annual attendance report can be generated. </p>
<p>Integrated with holiday management module so that holidays are already assigned in the attendance.<p> 
<p>Facility to import and export the student and staff attendance for a specific periods. </p>
</div>
</li>
 <li>
 <a href="#"><i class="fa fa-tasks" aria-hidden="true"></i></a>
 <div class="box">
 <h3>EXAM  SCHEDULING  MANAGEMENT : </h3>
 <p>Exam Scheduling is a laborious and time consuming job and requires much planning. Also exam seating arrangement has to be made to along with invigilation(supervision) duties to be set during exam.</p>
 <h4>Features & Advantages of Exam Scheduling :</h4>
 <p>Create and manage the schedule of different types of exams for different standards.</p> 
<p>Manage exam timings and define max marks and grade for different types of exams and define </p>
<p>different subjects for different standards and allocate them. Define different types of exams like first term, second term, annual etc. </p>
<p>It provides the clone system using which you can follow up/edit the already created examination schedule.</p>
<p>Manage exam timings and define max marks and grade for different types of exams and define 
exams for different subjects in different standards and allocate them. </p>
<p>Schedule exams for different standards by setting subjects exams along with their date and 
time. </p>
<p>Allocation of optional subjects/Examination to student/group of student. </p>
<p>Create proper seating arrangements for the students during the exams in different classrooms. Set invigilation, paper-reading, and reliever duties as per the school needs. </p>
 </div>
  </li>
<li>
<a href="#"><i class="fa fa-file-text" aria-hidden="true"></i></a>
<div class="box">
<h3>EXAM RESULT :</h3>
<p>Entering marks of students and creating a report card is a very tedious and time consuming job and waste much of a time of teacher. In this software you just need to enter marks of students and you can easily generate the report card along with grade calculation according to the exam marking scheme. </p>
<h4>Features & Advantages of Exam Result Management : </h4>
<p>This module allows you to generate result of students for different examination and different types of exams during the year as oral, practical, written, etc.</p> 
<p>Manage the results of the school students and keep a record of results of the students throughout the year. </p>
<p>You can enter marks of the students and can automate the generation of the school report card. </p>
<p>Generate report card along with allocated grade, based on grade calculation easily. </p>
</div>
</li>
<li>
<a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
<div class="box">
<h3>HOME WORK / ASSISTANT / TUTORIALS :</h3>
<h4>It allows you to post homework/assignment details online to student who can see their homework for reference. </h4>
<p>Iolite provides facility to post homework/assignments to students of all the division and standard 
as per teacher.</p>
 <p>Teachers can post homework/assignments to students of their class and provide necessary 
documents for reference. </p>
<p>Students can see the homework assigned to them online through the medium of their desk and refer the reference documents uploaded by the teacher.</p> 
<p>Parents can see the homework assigned to their ward and get it completed on time </p>
</div>
</li>
<li>
<a href="#"><i class="fa fa-tags" aria-hidden="true"></i></a>
<div class="box">
<h3>STUDENT PROMOTIONS : </h3>
<p>Student Promotion allows you to promote passed students of a standard to the next standard and division at the end of the academic year. It also allows you to promote the failed students to next class according to the school policies.   </p>
<h4>Features & Advantages Student Promotion: </h4>
<p>Promote passed students to higher class at the end of each academic year.</p> 
<p>It also allows you to promote all the students of a particular student to higher standard and 
division. </p>
<p>The details of the students automatically get updated in the student details as per the details of the student promotion. </p>
</div>
</li>
<li>
<a href="#"><i class="fa fa-bell" aria-hidden="true"></i></a>
<div class="box">
<h3>NOTIFICATIONS : </h3>
<h4>Student Notifications and Staff Notifications </h4>
<p>This module allows the school staff persons to post important notifications related to exams,fees, activities etc. The students can see such notifications through his login in the students’s desk section. Also the school principal and higher authorities can post notifications to the teacher about school meetings or other details. </p>
<h4>Features & Advantages : </h4>
<p>School staff persons can post notifications to students about exams,fees payment, activities and other important information. </p>
<p>Principals and higher authorities can post notifications to the teachers incase of meetings or other important information. </p>
<p>Students and teachers can get instant notifications at their place using their login.</p> 
</div>
</li>
<li>
<a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
<div class="box">
<h3>SYLLABUS : </h3>
<p>Syllabus module allows the teachers to post the daily coverage of syllabus class-wise, monthwise coverage, reference books/textbooks for the subjects and also post the total syllabus of each standard and division that is to be covered which can also be viewed by the student through his login. </p>
<h4>Features & Advantages : </h4>
<p>Allows the teachers to post total syllabus for the standard and state the names of reference 
books/text books. </p>
<p>Students can see the daily coverage of syllabus, monthwise coverage, names of reference 
books/textbooks also.</p>
<p> Students can also know the complete syllabus of their academic year through their login. </p>
</div>
</li>
<li>
<a href="#"><i class="fa fa-users" aria-hidden="true"></i></a>
<div class="box">
<h3>STUDENT CO-SCHOLASTIC DETAILS : </h3>
<p>Student Co – Scholastic Details module allows you to enter all the co- scholastic details of the students as per the CBSE norms. Moreover, you can create personalised fields as per your school standards and enter the same details for all the students of the school.</p>   
<h4>Features & Advantages : </h4>
<p>Enter all the student Co – Scholastic details as per the CBSE norms. </p>
<p>Also create personalised Co- Scholastic Areas and Sub-Areas and enter the details of the same 
for each students and maintain them securely throughout the year. </p>
<p>You can also add the necessary grade and description for each student in all the Co – 
Scholastic Areas and the same details will appear in the student’s report card. </p>
</div>
</li>
<li>
<a href="#"><i class="fa fa-book" aria-hidden="true"></i></a>
<div class="box">
<h3>STUDENT DIARY : </h3>
<p>Student Diary module allows the teachers to send important message to student and his parents through the diary feature related to his academic performance or mischief or achievement or any other details. The student can view the message in his diary in the students’ desk through his login. </p>
<h4>Features & Advantages : </h4>
<p>The teacher can directly post the message to a particular student’s diary easily. </p>
<p>The student and his parents can regularly check the diary through the student login to check any message related to the student’s performance and behaviour at their place. </p>
</div>
</li>


</ul>
</div>
</body>
</html>