
$(document).ready(function() {
    $("#fnamecontextpath").hide();
	$("#lnamecontextpath").hide();

});



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

				$("#class").val(data.resultObject.admissionSought);
				$("#fathername").val(data.resultObject.fatherFirstName);
				
			}
		},

	});

}


$(document).ready(function() {
	$(function() {

		var url = $("#lnamecontextpath").val() + "/GetNameAjax/getlastName";
		$("#lname").autocomplete({
			source : function(request, response) {
				$.ajax({
					url : url,
					type : "GET",
					data : {
						term : request.term
					},
					dataType : "json",
					success : function(data) {

						response($.map(data, function(v, i) {
							return {
								label : v
							};
						}));

					}
				});
			}
		});
	});
});



$(document).ready(function() {
	$(function() {

		var url = $("#fnamecontextpath").val() + "/GetNameAjax/getName";
		$("#fname").autocomplete({
			
			source : function(request, response) {
				$.ajax({
					url : url,
					type : "GET",
					data : {
						term : request.term
					},
					dataType : "json",
					success : function(data) {

						response($.map(data, function(v, i) {
							return {
								label : v
							};
						}));

					}
				});
			}
		});
	});
});

