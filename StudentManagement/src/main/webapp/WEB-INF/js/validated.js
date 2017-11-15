
$(document).ready(function(){
$("#span_name").hide();
$("#span_mname").hide();
$("#span_lname").hide();
$("#span_dob").hide();

$("#span_asought").hide();
$("#span_pschoolname").hide();


$("#span_fathername").hide();
$("#span_foccupation").hide();
$("#span_fqualification").hide();
$("#span_mothername").hide();
$("#span_moccupation").hide();
$("#span_mobile").hide();
$("#span_altermobile").hide();

$("#span_hba").hide();
$("#span_vtc").hide();
$("#span_srl").hide();
$("#span_land").hide();
$("#span_city").hide();
$("#span_state").hide();
$("#span_district").hide();
$("#span_pincode").hide();
$("#span_postoffice").hide();
$("#span_phba").hide();
$("#span_pvtc").hide();
$("#span_psrl").hide();
$("#span_pland").hide();
$("#span_pcity").hide();
$("#span_pstate").hide();
$("#span_pdistrict").hide();
$("#span_ppincode").hide();
$("#span_ppostoffice").hide();


$("#span_phba").hide();
$("#reg").hide();
$("#stn").hide();
$("#sms").hide();
	});

	$("#regbtn").click(function()
			{
		$("#reg").toggle();
		$("#stn").hide();
		$("#sms").hide();
		});
	$("#stnbtn").click(function(){
		$("#stn").toggle();
		$("#reg").hide();
		$("#sms").hide();
	});
	$("#smsbtn").click(function(){
		$("#sms").toggle();
		$("#reg").hide();
		$("#stn").hide();

	});

	$(document).ready(function(){
		$('.acordion_student_button').click(function(){
		/*if(validation()){
			$('.accordion_body').slideUp(300);
		}*/	
			
			var fname=$("#fname").val();
			var mname=$("#mname").val();
			var lname=$("#lname").val();
			var dob=$("dob").val();
		    var admissionSought=$("#admissionSought").val();
			
			
			var pschoolname=$("#pschoolname").val();
			if(fname==null || fname==""){
				$("#span_name").show();
				return false;
			}
			if(mname==null || mname==""){
				$("#span_mname").show();
				return false;
			}
			if(lname==null || lname==""){
				$("#span_lname").show();
				return false;
			}
			
			else if(admissionSought==null || admissionSought==""){
				$("#span_asought").show();
				return false;
			}
			 
			else if(pschoolname==null || pschoolname==""){
				
				$("#span_pschoolname").show();
				
						
			return false;
			
	            }
			
			else{
				return true;
			}
			
			
			$('.accordion_body').slideUp(300);	
			
			
});
	});


	function clearAll(){
		$("#span_name").hide();
		$("#span_mname").hide();
		$("#span_lname").hide();
		$("#span_dob").hide();
		$("#span_age").hide();
		$("#span_asought").hide();
		$("#span_pschoolname").hide();
		
		$("#span_fathername").hide();
		$("#span_foccupation").hide();
		$("#span_fqualification").hide();
		$("#span_mothername").hide();
		$("#span_moccupation").hide();
		$("#span_mobile").hide();
		$("#span_altermobile").hide();
		$("#span_hba").hide();
		$("#span_vtc").hide();
		$("#span_srl").hide();
		$("#span_land").hide();
		$("#span_city").hide();
		$("#span_state").hide();
		$("#span_district").hide();
		$("#span_pincode").hide();
		$("#span_postoffice").hide();
		
		$("#span_phba").hide();
		$("#span_pvtc").hide();
		$("#span_psrl").hide();
		$("#span_pland").hide();
		$("#span_pcity").hide();
		$("#span_pstate").hide();
		$("#span_pdistrict").hide();
		$("#span_ppincode").hide();
		$("#span_ppostoffice").hide();

		
	}

function parentInformationvalidation(){
	
}
$(document).ready(function(){
	$('.accordion_parent_button').click(function(){
	
		var fathername=$("#fathername").val();
		var foccupation=$("#foccupation").val();
		var fatherQualification=$("#fatherQualification").val();
		var mothername=$("#mothername").val();
		var moccupation=$("#moccupation").val();
		var mobile=$("#mobile").val();
		var span_altermobile=$("#altermobile").val();
		if(fathername==null || fathername==""){
			$("#span_fathername").show();
			return false;
		}
		if(foccupation==null || foccupation==""){
			$("#span_foccupation").show();
			return false;
		}
		if(fatherQualification==null || fatherQualification==""){
			$("#span_fqualification").show();
			return false;
		}
		if(mothername==null || mothername==""){
			$("#span_mothername").show();
			return false;
		}
		if(moccupation==null || moccupation==""){
			$("#span_moccupation").show();
			return false;
		}
		if(mobile==null || mobile==""){
			$("#span_mobile").show();
			return false;
		}
		if(span_altermobile==null || span_altermobile==""){
			$("#span_altermobile").show();
			return false;
		}
		else{
			return true;
		}
		
		$('.accordion_body').slideUp(300);
     });
});


	$(document).ready(function(){
		$('.acordion_address_button').click(function(){
		
			var hba=$("#hba").val();
			var vtc=$("#vtc").val();
			var srl=$("#srl").val();
			var landmark=$("#landmark").val();
			var city=$("#city").val();
			var state=$("#state").val();
			var district=$("#district").val();
			var pincode=$("#pincode").val();
			var postoffice=$("#postoffice").val();
			var p_hba=$("#p_hba").val();
			var p_vtc=$("#p_vtc").val();
			var p_srl=$("#p_srl").val();
			var p_landmark=$("#p_landmark").val();
			var p_city=$("#p_city").val();
			var p_state=$("#p_state").val();
			var p_district=$("#p_district").val();
			var p_pincode=$("#p_pincode").val();
			var p_postoffice=$("#p_postoffice").val();
			
			
			if(hba==null || hba==""){
				$("#span_hba").show();
	return false;
			}
			else if(vtc==null || vtc==""){
				$("#span_vtc").show();
				return false;
						}
			else if(srl==null || srl==""){
				$("#span_srl").show();
				return false;
						}
			else if(landmark==null || landmark==""){
				$("#span_land").show();
				return false;
						}
			else if(city==null || city==""){
				$("#span_city").show();
				return false;
						}
			else if(state==null || state==""){
				$("#span_state").show();
				return false;
						}
			else if(district==null || district==""){
				$("#span_district").show();
				return false;
						}
			else if(pincode==null || pincode==""){
				$("#span_pincode").show();
				return false;
						}
			else if(postoffice==null || postoffice==""){
				$("#span_postoffice").show();
				return false;
						}
			
			else if(p_hba==null || p_hba==""){
				$("#span_phba").show();
				return false;
						}
	     else if(p_vtc==null || p_vtc==""){
			$("#span_pvtc").show();
			return false;
					}
		else if(p_srl==null || p_srl==""){
			$("#span_psrl").show();
			return false;
					}
		else if(p_landmark==null || p_landmark==""){
			$("#span_pland").show();
			return false;
					}
		else if(p_city==null || p_city==""){
			$("#span_pcity").show();
			return false;
					}
		else if(p_state==null || p_state==""){
			$("#span_pstate").show();
			return false;
					}
		else if(p_district==null || p_district==""){
			$("#span_pdistrict").show();
			return false;
					}
		else if(p_pincode==null || p_pincode==""){
			$("#span_ppincode").show();
			return false;
					}
		else if(p_postoffice==null || p_postoffice==""){
			$("#span_ppostoffice").show();
			return false;
					}
		else{
				return true;
			}	
			
});
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	