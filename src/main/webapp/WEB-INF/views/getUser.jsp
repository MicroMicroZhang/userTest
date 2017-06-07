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
    <script type="text/javascript" src="resources/js/getUser.js"></script>
</head>
    <h2>Basic DataGrid</h2>
    <p>The DataGrid is created from markup, no JavaScript code needed.</p>
    <div style="margin:20px 0;"></div>
    
<!-- <table id="dg" style="width:300px"></table> -->

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
        <a href="#" class="easyui-linkbutton" onclick="getSelected()">GetSelected</a>
        <a href="#" class="easyui-linkbutton" onclick="getSelections()">GetSelections</a>
		<a href="#" class="easyui-linkbutton" onclick="exportExcel()">ExportExcel</a>
		<a href="javascript:void(0);" onclick="Export('导出excel');">导出</a>  
    </div>
    <div style="margin:20px 0;">
    	
    </div>

</table>


</body>
</html>
