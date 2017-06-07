<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<%@ page session="false" %>
<html>
<head>
	<title>LOGIN PAGE</title>
</head>
<body>
<h1>
	LOGIN
</h1>
        <table width="60%" cellpadding="2" cellspacing="0">
            <tr>
                <td>姓名</td>
                <td>密码</td>
                
            </tr>
            <tr>
                <td><input id="name"></td>
                <td><input id="password" type=password></td>
                <td><button id="lgoin">LOGIN</button></td>
                <td><button id="cancel">CANCEL</button></td>
            </tr>
</body>
<script>
$(document).ready(function(){

	  $("#lgoin").click(function(){
		    var user = {};
			var name =$("#name").val();
			var password =$("#password").val();
		    user.name = name;
		    user.password = password;
		  $.ajax({
			  type: 'GET',
			  url: 'login',
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
