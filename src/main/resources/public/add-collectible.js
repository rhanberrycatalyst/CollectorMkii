$(document).ready(function() {
	console.log("JQUERYCHECK");
	$("#color").change(function(){
		var colorSel = $('#color option:selected').val();
		console.log(""+colorSel);
		if(colorSel != "White" && colorSel != "Yellow"){
			$('#color').css({"background-color":colorSel, "color":"white"});
		}
		else{
			$('#color').css({"background-color":colorSel, "color":"black"});
		}
	})

	$("#update_color_modal").change(function(){
		var colorSel = $('#update_color_modal option:selected').val();
		console.log(""+colorSel);
		if(colorSel != "White" && colorSel != "Yellow"){
			$('#update_color_modal').css({"background-color":colorSel, "color":"white"});
		}
		else{
			$('#update_color_modal').css({"background-color":colorSel, "color":"black"});
		}
	})

	$("#submit").click(function(){
		var collectible = {
			name : $("#title").val(),
			type : $("#type").val(),
			color: $("#color").val(),
			age: $("#age").val(),
			condition: $("#condition").val(),
			catalogId: $("#catalogId").val(),
			keyword1: $("#keyword1").val(),
			keyword2: $("#keyword2").val(),
			keyword3: $("#keyword3").val(),
			description : $("#description").val(),
			forSale: false
		}
		console.log(collectible);
		$.ajax({
			method: 'POST',
			url: '/collectibles',
			contentType: 'application/json',
			data: JSON.stringify(collectible)
		})
	})
});
