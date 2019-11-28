$(document).ready(function () {
    var startDate_input = $('input[id="startDate"]'); //our date input has the name "startdate"
    var endDate_input = $('input[id="endDate"]'); //our date input has the name "enddate"
    var container = $('.bootstrap-iso form-group').length > 0 ? $('.bootstrap-iso form-group').parent() : "body";
    var options = {
        format: 'dd/mm/yyyy',
        container: container,
        todayHighlight: true,
        autoclose: true,
    };
    startDate_input.datepicker(options);
    endDate_input.datepicker(options);

})