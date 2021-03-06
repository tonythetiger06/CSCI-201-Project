<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="Login.css"/>
	</head>
	<body>
		<div id="GoHome">
			<form method="POST" action="Homepage.jsp"><button name="GoHome" id="GoHome">Return Home</button></form>
		</div>
		<form class="signupform" name="signupform" method="POST" action="Login_Validate">
			<div id="pageTitle">
				<h1>Login</h1>
				<h3>${errorMessageLogin}</h3>
			</div>
			<div id="userInputSection">
				<div id="usernameSection">
					<h3>Username</h3>	
					<div style="color: #FF0000;"><input name="inputUsername" id="inputUsername" type="text"></div>
				</div>
				<div id="passwordSection">
					<h3>Password</h3>
					<div style="color: #FF0000;"><input name="inputPassword" id="inputPassword" type="password" autocomplete="off"></div>
				</div>
				
				<div id="submitButtonSection">
					<br /><input id="signupButton" type="submit" value="Login">
				</div>
			</div>
		</form>
	</body>
</html>