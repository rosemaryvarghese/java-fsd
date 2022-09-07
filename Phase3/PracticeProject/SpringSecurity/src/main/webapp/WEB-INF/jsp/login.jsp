<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Login</title>
    </head>
    <body>
    <center>
    <h1><b>LOGIN </b></h1>
        <div th:if="${param.error}">
            Invalid username or password.
        </div>
        <div th:if="${param.logout}">
            You have been logged out.<br><br>
        </div>
        <form th:action="@{/login}" method="post">
            <div><label> <b>User Name : </b><input type="text" name="username"/> </label></div><br><br>
            <div><label> <b>Password: </b><input type="password" name="password"/> </label></div><br><br>
            <div><input type="submit" value="Sign In"/></div><br><br>
        </form>
        
        <a href="/">Return to Main Page</a>
        </center>
    </body>
</html>