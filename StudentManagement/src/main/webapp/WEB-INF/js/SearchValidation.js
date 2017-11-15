$(document).ready(function(){
	$("#span_serachelement").hide();
	$("#span_radio").hide();
});


function validation(){
	
	var tex=$("#searchId").val();

	if(tex=="" || tex==null){
		$("#span_serachelement").show();
		return false;
	}
	else{
		return true;
	}
}

function clear(){
	$("#span_serachelement").hide();
}