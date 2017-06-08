<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>

	<script type="text/javascript" src="resources/js/login.js"></script>
	    <link rel="stylesheet" type="text/css" href="resources/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="resources/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="resources/css/demo.css"> 
    <script type="text/javascript" src="resources/jquery.min.js"></script>
    <script type="text/javascript" src="resources/jquery.easyui.min.js"></script>
<%@ page session="false" %>
<html>
<head>
	<title>LOGIN PAGE</title>
</head>
<body>
<div align="center">

<h1>
	LOGIN
</h1>
</div>
    <form id="form1" runat="server">
    <div id="win" align="center">
        <table>
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <input id="name" name="name" type="text" value="" />
                </td>
            </tr>
            <tr>
                <td>
                    Password:
                </td>
                <td>
                    <input id="password" name="password" type="password" value="" />
                </td>
            </tr>
            <tr>
                <td>
                    <a href="#" class="easyui-linkbutton" iconcls="icon-ok" onclick="login()">Login</a>
                </td>
                <td>
                    <a href="#" class="easyui-linkbutton" iconcls="icon-cancel" onclick="cancel()">Cancel</a>
                </td>
            </tr>
        </table>
    </div>
    </form>
</body>
</html>
