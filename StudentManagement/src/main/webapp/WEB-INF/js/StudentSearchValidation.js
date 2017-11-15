$(document).ready(function(){
	$("#span_serachelement").hide();
	$("#span_radio").hide();
});


function radioValidation(){

	var text =$("#searchId").val();
	
	if(text==null || text==""){
		$("#span_serachelement").show();
		return false;
	}
	    
	    var searchelementval = false;
	    
	    if(searchelement==null || searchelement==""){
	    	$("#span_serachelement").show();
	    	return false;
	    }
		
    
	   
	    for(var i=0; i<searchelementradio.length;i++){
	        if(searchelementradio[i].checked == true){
	        	searchelementval = true; 
	        	
	        }
	    }if(!searchelementval){
	    	$("#span_radio").show();
	    	  return false;
	    }
	    else {
	    	return true;
	    }
   
}





function clear(){
	$("#span_serachelement").hide();
	$("#span_radio").hide();
}

	

    
