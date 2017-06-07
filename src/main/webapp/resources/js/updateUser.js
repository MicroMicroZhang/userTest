var user = {};
$(document).ready(function(){
	  $("#update").click(function(){
			  var id=$('#id').val();
			  var name =$("#name").val();
			  var password =$("#password").val();
			  user.id=id;
			  user.name=name;
			  user.password=password;
			  
			  console.log("in searchUser",user);
			  $("body").append(" <table id=\"dg\" style=\"width:300px\"></table>");
			  $('#dg').datagrid({
				    url:'updateUser1',
				    method:'post',
				    queryParams: {
						name: user.name,
						password: user.password,
						id : user.id
				    	
					},
				    columns:[[
				        {field:'id',title:'User Id',width:100},
				        {field:'name',title:'User Name',width:100},
				        {field:'password',title:'User Password',width:100}
				    ]],
				    toolbar: [{
						iconCls: 'icon-edit',
						handler: function(){
							
						}
					},'-',{
						iconCls: 'icon-help',
						handler: function(){alert('help')}
					}]
				    
				});
		  
		  
	});
});