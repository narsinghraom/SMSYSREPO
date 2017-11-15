$(document).ready(function(){
	$("#span_serachelement").hide();
	$("#span").hide();
	$("#searchclass").hide();


	
});


function validation(){
	
	var tex=$("#searchId").val();

	if(tex==null || tex==""){
		$("#span_serachelement").show();
		return false;
	}
	else{
		return true;
	}
}



jQuery(function(){
    $("#searchId").click(function(){
        var isChecked = jQuery("#searchelementradio:checked").val();
        
         if(!isChecked){
           $("#span").show();
             return false;
         }else  {
            
             return ;
         }
    });
    });



jQuery(function(){
	$(".searchclass").click(function()
			{
		if(this.id=="searchelementradio")
		$("#searchId").hide();
		$("#searchclass").show();
	});
});

jQuery(function(){
	$(".searchaddress").click(function()
			{
		if(this.id=="searchelementradio")
		$("#searchclass").hide();
		$("#searchId").show();
	});
});


jQuery(function(){
	$(".searchname").click(function()
			{
		if(this.id=="searchelementradio")
		$("#searchclass").hide();
		$("#searchId").show();
	});
});





function clearError(){
	$("#span_serachelement").hide();
	$("#span").hide();
	$("#searchclass").hide();
	
	
}