<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/login.css" />
<script src="js/prefixfree.min.js"></script>
</head>
<body>

	<div class="body"></div>
	<div class="grad"></div>
	<div class="header">
		<div>
			Hotel<span>BoaViagem</span>
		</div>
	</div>
	<br>
	<div class="login">
		<form action="Servlet" method="post">
			<input type="text" placeholder="E-mail" name="user"><br>
			<input type="password" placeholder="Senha" name="password"><br>
			<input type="submit" value="Login">
		</form>
	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>





</body>
</html>
