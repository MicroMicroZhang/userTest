<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<%@ page session="false" %>
<html>
<head>
	<title>ADD USER</title>
</head>
<body>
<h1>
	Add User
</h1>
        <table width="60%" cellpadding="2" cellspacing="0">
            <tr>
            	
                <td>编号</td>
                <td>姓名</td>
                <td>密码</td>
                
            </tr>
            <tr>
                <td><input id="id" name="id"></td>
                <td><input id="name" name="name"></td>
                <td><input id="password" name="password"></td>
                <td><button id="add" >Create</button></td>
            </tr>




<P>  The time on the server is ${serverTime}. </P>
</body>
<script>
$(document).ready(function(){
	  var user = {};
    console.log(user);
	  $("#add").click(function(){
		  var name =$('#name').val();
			var password =$('#password').val();
		  
		    user.name = name;
		    user.password = password;
		  $.ajax({
			  type: 'POST',
			  url: 'addUser1',
			  data: user,
			  success: function(data){
				  console.log(data);
				  alert("success");
			  }
			});
	  });
	});
</script>
</html>
