<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
    prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>STUDENT</title>
    <link rel="stylesheet" type="text/css" href="resources/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="resources/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="resources/css/demo.css"> 
    <script type="text/javascript" src="resources/jquery.min.js"></script>
    <script type="text/javascript" src="resources/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="resources/js/students.js"></script>
    <script src="https://code.highcharts.com/highcharts.src.js"></script>
</head>
<body>

 <table id="dg" class="easyui-datagrid" style="width:400px;height:250px"
        fitColumns:true,singleSelect:true" rownumbers="true">
        <div id="pp" style="background:#efefef;border:1px solid #ccc;"></div>
<!--     <thead>
        <tr>
            <th data-options="field:'id',width:100">id</th>
            <th data-options="field:'name',width:100">Name</th>
            <th data-options="field:'password',width:100,align:'right'">Password</th>
        </tr>
    </thead>
 -->
    <div style="margin:20px 0;">
        <a href="#" class="easyui-linkbutton" onclick="crtChart()" style="width : 100px">create chart</a>
      
	
    </div>
    <div style="margin:20px 0;">
    	
    </div>

</table>

<div id="container"></div>

<button id="large">Large</button>
<button id="small">Small</button>

</body>
</html>