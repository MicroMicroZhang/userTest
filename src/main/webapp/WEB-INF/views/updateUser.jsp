<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<%@ page session="false" %>
<html>
<head>
	<title>UPDATE USER</title>
	<meta charset="UTF-8">
    <title>Basic DataGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="resources/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="resources/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="resources/css/demo.css"> 
    <script type="text/javascript" src="resources/jquery.min.js"></script>
    <script type="text/javascript" src="resources/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="resources/js/updateUser.js"></script>
</head>
<body>
<h1>
	Update User
</h1>
        <table width="60%" cellpadding="2" cellspacing="0">
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>密码</td>
                
            </tr>
            <tr>
                <td><input id="id"></td>
                <td><input id="name"></td>
                <td><input id="password"></td>
                <td><button id="update">Update</button></td>
            </tr>




<P>  The time on the server is ${serverTime}. </P>
</body>

</html>
