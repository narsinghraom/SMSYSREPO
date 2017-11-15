$(document).ready(function() {

	$("#contextpathid").hide();

});


$(document).ready(function() {
	$(function() {

		var url = $("#contextpathid").val() + "/GetNameAjax/getlastName";
		$("#searchId").autocomplete({
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


function getAllLastName(url) {

	var lastname = $("#searchId").val();
	

	$.ajax({

		url : url,
		type : "GET",
		data : {
			term : lastname
		},
		dataType : "json",
		success : function(data) {
			
			if (data) {
				var len = data.length;
				var result = "";
				if (len > 0) {
					for (var i = 0; i < len; i++) {

						result +=

						"<tr><td>" + data[i].firstName + "</td>" + "<td>"
								+ data[i].middleName + "</td>" + "<td>"
								+ data[i].lastName + "</td>" + "<td>"
								+ data[i].dateOfBirth + "</td>" + "<td>"
								+ data[i].gender + "</td>" + "<td>"
								+ data[i].admissionSought + "</td>" + "<td>"
								+ data[i].previousSchoolName + "</td></tr>";
						

					}
					if (result != "") {
						$("#tables").html="";
						$("#tables").html(result).removeClass("hidden");
					}				
					}

			}

		},
	});
}

function getclassData(url) {

	var AdnissionSought = $("#searchclass").val();

	$.ajax({
		url : url,
		type : "GET",
		data : {
			term : AdnissionSought
		},
		dataType : "json",
		success : function(data) {

			

			if (data) {
				var len = data.length;
				var result = "";
				if (len > 0) {
					for (var i = 0; i < len; i++) {

						result +=

							"<tr><td>" + data[i].firstName + "</td>" + "<td>"
							+ data[i].middleName + "</td>" + "<td>"
							+ data[i].lastName + "</td>" + "<td>"
							+ data[i].dateOfBirth + "</td>" + "<td>"
							+ data[i].gender + "</td>" + "<td>"
							+ data[i].admissionSought + "</td>" + "<td>"
							+ data[i].previousSchoolName + "</td></tr>";

					}
					if (result != "") {
						$("#tables").html="";
						$("#tables").html(result);
					}
				}

			}

		},
	});
}


