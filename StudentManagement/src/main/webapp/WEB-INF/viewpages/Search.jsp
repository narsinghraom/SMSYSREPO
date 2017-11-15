<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<style type="text/css">
body{
			margin-top: 100px;
			font-family: 'Trebuchet MS', serif;
			line-height: 1.6;
		}
		.container{
			width: 800px;
			margin: 0 auto;
		}
   ul.tabs{
			margin: 0px;
			padding: 0px;
			list-style: none;
		}
		ul.tabs li{
			background: none;
			color: #222;
			display: inline-block;
			padding: 10px 15px;
			cursor: pointer;
		}

		ul.tabs li.current{
			background: #1aa3ff;
			color: #222;
		}

		.tab-content{
			display: none;
			background: #1aa3ff;
			padding: 15px;
		}

		.tab-content.current{
			display: inherit;
		}
</style>



<script type="text/javascript">
$(document).ready(function(){
	
	$('ul.tabs li').click(function(){
		var tab_id = $(this).attr('data-tab');

		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');
	

		$(this).addClass('current');
		$("#"+tab_id).addClass('current');
	});

});
</script>

</head>
<body>
 <div>
<jsp:include page="Welcome.jsp"></jsp:include>
<div class="container">
        <ul class="tabs">
            <li class="tab-link  current" data-tab="tab-1">StudentSearchByRadius</li>
             <li class="tab-link" data-tab="tab-2">StudentSearch</li>
             <li class="tab-link" data-tab="tab-3">StudentByTopper</li>
            
        </ul>
        <div id="tab-1" class="tab-content current" >
            <jsp:include page="StudentSearchByRadius.jsp"></jsp:include>
        </div>
        
        <div id="tab-2" class="tab-content" >
           <jsp:include page="StudentSearch.jsp"></jsp:include>
           </div>
           
           <div id="tab-3" class="tab-content" >
           <jsp:include page="Marks.jsp"></jsp:include></div>
           
        </div>
           
        </div>
        
        
        
       <div >
        <jsp:include page="StudentSearchResult.jsp"></jsp:include>
        
       </div>
       
       
       </div>
       
     
 
 </body>
</html>