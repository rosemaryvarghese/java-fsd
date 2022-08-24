<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

</head>
<body>
	<h2>Edit User</h2>

	
	<form action="/edit" method="post">
	<br><br><br>

		<label for="name">Name: </label> <input type="text" id="name"
			name="name"><br> <br> <label for="email">Email:</label>
		<input type="text" id="email" name="email"><br> <br>
		<label for="password">Password:</label> <input type="text"
			id="password" name="password"><br> <br> <input
			type="submit" value="Enter">
	</form>
	<a href="users">Back</a>
</body>
</html>