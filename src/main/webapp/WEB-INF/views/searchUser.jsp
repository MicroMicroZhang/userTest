<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
    prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic DataGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="resources/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="resources/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="resources/css/demo.css"> 
    <script type="text/javascript" src="resources/jquery.min.js"></script>
    <script type="text/javascript" src="resources/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="resources/js/searchUser.js"></script>
</head>
<body>
     
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
                <td><button id="search" >Search</button></td>
            </tr>
            </table>

</body>
</html>
