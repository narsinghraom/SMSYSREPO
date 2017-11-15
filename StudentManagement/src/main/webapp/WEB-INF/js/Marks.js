function getAdmissionIdValue(url) {

	var admissionId = $("#admissionId").val();

	$.ajax({
		url : url,
		type : "GET",
		data : {
			term : admissionId
		},
		dataType : "json",
		
		success : function(data) {
alert(data);
			if (data.status == "SUCCESS") {

				$('#firstname').val(data.resultObject.firstName);
				
			}
		},

	});

}
