$(document).ready(function() {
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
						description : $("#description").val()
					}
					console.log(task);
					$.ajax({
						method: 'POST',
						url: '/collectibles',
						contentType: 'application/json',
						data: JSON.stringify(task)
					}).then(function(task){
						window.location.href = "/collectible/index";
					});
				})
			});
