function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}

function isAlfa(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {
        return false;
    }
    return true;
}

$(function () {
$('.txtNumeric').keydown(function (e) {
	if (e.shiftKey || e.ctrlKey || e.altKey) {
	e.preventDefault();
	} else {
	var key = e.keyCode;
	if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90) || (key >= 48 && key <= 57) || (key >= 96 && key <= 105))) {
	e.preventDefault();
	}
	}
	});
	});


$(function(){
	
	$("#dob").datepicker({maxDate: new Date});
	
	
});

	