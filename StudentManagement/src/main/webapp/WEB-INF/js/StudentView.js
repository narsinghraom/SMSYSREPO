$(document).ready(function() {

	$("#contextpathfname").hide();

});

$(document).ready(function() {
	$(function() {

		var url = $("#contextpath").val() + "/GetNameAjax/getName";
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

function getAdnissionSought(url) {

	var AdnissionSought = $("#searchselect").val();

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
						$("#table").html="";
						$("#table").html(result).removeClass("hidden");
					}
				}

			}

		},
	});
}


/**
 * 
 */

function getAllNameData(url) {

	var name = $("#fname").val();
	

	$.ajax({

		url : url,
		type : "GET",
		data : {
			term : name
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
						$("#table").html="";
						$("#table").html(result).removeClass("hidden");
					}				
					}

			}

		},
	});
}

