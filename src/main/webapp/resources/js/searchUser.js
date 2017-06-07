$(document).ready(function(){
	  $("#update").click(function(){
		    var user = {};
			var id = $("#id").val();
			var name =$("#name").val();
			var password =$("#password").val();
		    user.name = name;
		    user.password = password;
		    user.id=id;
		  $.ajax({
			  type: 'POST',
			  url: 'updateUser1',
			  data: user,
			  success: function(data){
				  console.log(data);
				  alert("success");
			  }
			});
	  });
	});