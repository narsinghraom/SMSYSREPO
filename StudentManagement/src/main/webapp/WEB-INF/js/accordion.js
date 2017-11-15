$(document).ready(function(){
	$('.accordion_head').click(function(){
		if($('.accordion_body').is(':visible')){
			$('.accordion_body').slideUp(300);
			$('.plusminus').text('+');
		}
		if($(this).next('.accordion_body').is(':visible')){
			 $(this).next('.accordion_body').slideUp(300);
			 $(this).children('.plusminus').text('+');
		}else{
			$(this).next('.accordion_body').slideDown(300);
            $(this).children('.plusminus').text('-');
		}
	});
});






$(document).ready(function(){
	$('.accordion_welcome').click(function(){
		if($('.accodion_regstration_body').is(':visible')){
			$('.accodion_regstration_body').slideUp(300);
         }

		else{
			$(this).next('.accodion_regstration_body').slideDown(300);


		}
	});
});
















