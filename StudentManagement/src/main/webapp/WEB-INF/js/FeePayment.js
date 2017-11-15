function getfirstnameValues(url) {

	var firstname = $("#fname").val();
	
	$.ajax({
		url : url,
		type : "GET",
		data : {
			term : firstname
		},
		dataType : "json",
		
		success : function(data) {

			if (data.status == "SUCCESS") {

				$('#class').val(data.resultObject.admissionSought);
				$('#fathername').val(data.resultObject.fatherFirstName);
				
			}
		},

	});

}
