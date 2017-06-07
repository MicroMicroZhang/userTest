<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Delete User</h1>
	<input id="id" name="id">
	<button id="del" name="del">DELETE</button>
	<P>The time on the server is ${serverTime}.</P>
</body>
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript" src="resources/js/delUser.js"></script>
</html>
