var user = {};
$(document).ready(function(){
			  var id=$('#id').val();
			  var name =$("#name").val();
			  var password =$("#password").val();
			  user.id=id;
			  user.name=name;
			  user.password=password;
			  console.log(user);
			  $('#dg').datagrid({
				    url:'getUserList',
				    method:'get',
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