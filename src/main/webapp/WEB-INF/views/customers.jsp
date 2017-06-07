<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
	    <link rel="stylesheet" type="text/css" href="resources/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="resources/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="resources/css/demo.css"> 
    <script type="text/javascript" src="resources/jquery.min.js"></script>
    <script type="text/javascript" src="resources/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="resources/js/customers.js"></script>
<%@ page session="false" %>
<html>
<head>
	<title>CUSTOMERS</title>
	  <style type="text/css">
        .pop-box {   
            z-index: 9999; /*这个数值要足够大，才能够显示在最上层*/  
            margin-bottom: 3px;   
            display: none;   
            position: absolute;   
            background: #FFF;   
            border:solid 1px #6e8bde;   
        }   
          
        .pop-box h4 {   
            color: #FFF;   
            cursor:default;   
            height: 18px;   
            font-size: 14px;   
            font-weight:bold;   
            text-align: left;   
            padding-left: 8px;   
            padding-top: 4px;   
            padding-bottom: 2px;   
            background: url("../images/header_bg.gif") repeat-x 0 0;   
        }   
          
        .pop-box-body {   
            clear: both;   
            margin: 4px;   
            padding: 2px;   
        } 
        
        
        .mask {   
            color:#C7EDCC;
            background-color:#C7EDCC;
            position:absolute;
            top:0px;
            left:0px;
            filter: Alpha(Opacity=60);
        } 
    </style>
</head>
<body>
<h1>
	CUSTOMERS
</h1>
<button id="show" name="show" onclick="show()">
SHOW
</button>
 <table id="dg" class="easyui-datagrid" style="width:400px;height:250px" fitColumns:true,singleSelect:true" rownumbers="true" display="false">
        <div id="pp" style="background:#efefef;border:1px solid #ccc;"></div>

<!--     <div style="margin:20px 0;">
        <a href="#" class="easyui-linkbutton" onclick="getSelected()">GetSelected</a>
        <a href="#" class="easyui-linkbutton" onclick="getSelections()">GetSelections</a>
		<a href="#" class="easyui-linkbutton" onclick="exportExcel()">ExportExcel</a>
		<a href="javascript:void(0);" onclick="Export('导出excel');">导出</a>  
    </div> -->
    	<div style="margin:20px 0;"></div>
	
</table>
 <form id="form1"  class="easyui-dialog">
        <div id='test' style="width: 300px;" class="pop-box">  
            <h4>标题位置</h4>  
            <div class="pop-box-body" >  
                <input id=btnClose type=button onclick="hideDiv('test');" value="关闭"/>
                <input id=btnClose type=button onclick="addCustomer();" value="提交"/>
            </div>  
        </div>
    </form>

</body>

</html>
