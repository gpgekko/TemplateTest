$(function() {
	$('input[type="button"]').click(function() {
		$("#result").text("");
		$.ajax({
			data: {
				noIncludes: $("#noIncludes").is(":checked")
			},
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