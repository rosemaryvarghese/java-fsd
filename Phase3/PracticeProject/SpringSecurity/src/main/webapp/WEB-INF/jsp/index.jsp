<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Greetings!</title>
</head>
<body>
<center>
	<h1>WELCOME!</h1>

	<p>
		Please Click <a th:href="@{/welcome}">here</a> to login.
	</p>
	</center>
</body>
</html>