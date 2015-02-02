$(function() {
	$('input').click(function() {
		$("#result").text("");
		$.ajax({
			dataType: "json",
			type: "GET",
			url: "/case/" + this.id
		}).done(function(data) {
			$("#result").text(JSON.stringify(data));
		}).fail(function(jqXHR) {
			$("#result").text(jqXHR.responseText);
		});
	});
});