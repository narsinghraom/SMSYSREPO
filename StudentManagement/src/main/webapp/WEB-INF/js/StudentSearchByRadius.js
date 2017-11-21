$(document).ready(function() {

	$("#contextpathid").hide();
	$("#contextpath").hide();

});


$(document).ready(function() {
	$(function() {

		var url = $("#contextpath").val() + "/GetNameAjax/getlastName";
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



$(document).ready(function() {
	$(function() {

		var url = $("#contextpathid").val() + "/GetNameAjax/getAddressList";
		$("#searchadress").autocomplete({
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
				var error="data not found";
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
						$("#RadiusErrorMessage").hide();
						$("#tables").show();
						$("#tables").html="";
						$("#tables").html(result);
					}
					
					

				}
				else{
					$("#tables").hide();
					$("#RadiusErrorMessage").show();
					$("#RadiusErrorMessage").html(error);
				}

			}
			
		},
		
	});
}


function getAddressData(url) {

	var searchadress = $("#searchadress").val();

	$.ajax({
		url : url,
		type : "GET",
		data : {
			term : searchadress
		},
		dataType : "json",
		success : function(data) {
alert("helo");
			

			if (data) {
				var len = data.length;
				var result = "";
				if (len > 0) {
					for (var i = 0; i < len; i++) {

						result +=

							"<tr><td>" + data[i].residential_address  + "</td>" + "<td>"
							+ data[i].residential_town  + "</td>" + "<td>"
							+ data[i].residential_lane  + "</td>" + "<td>"
							+ data[i].residential_landMark  + "</td>" + "<td>"
							+ data[i].residential_city  + "</td>" + "<td>"
							+ data[i].residential_state + "</td>" + "<td>"
							+ data[i].residential_district  + "</td>" + "<td>"
							+ data[i].residential_pincode  + "</td>" + "<td>"
							+ data[i].residential_postOffice  + "</td>" + "<td>"
							+ data[i].prensent_address  + "</td>" + "<td>"
							+ data[i].prensent_town  + "</td>" + "<td>"
							+ data[i].prensent_landMark  + "</td>" + "<td>"
							+ data[i].prensent_city  + "</td>" + "<td>"
							+ data[i].prensent_state  + "</td>" + "<td>"
							+ data[i].prensent_district  + "</td>" + "<td>"
							+ data[i].prensent_pincode  + "</td>" + "<td>"
							+ data[i].prensent_postOffice  + "</td></tr>";

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