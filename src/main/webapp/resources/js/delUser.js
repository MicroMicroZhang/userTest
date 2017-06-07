var user = {};
$(document).ready(function(){
	  $("#del").click(function(){
			  var id=$('#id').val();
			  var name =$("#name").val();
			  var password =$("#password").val();
			  user.id=id;
			  user.name=name;
			  user.password=password;
			  console.log(user);
			  $.ajax({
				  type: 'POST',
				  url: 'delUser1',
				  data: user,
				  success: function(data){
					  console.log(data);
					  alert("success");
				  }
				});
		  
		  
	});
});