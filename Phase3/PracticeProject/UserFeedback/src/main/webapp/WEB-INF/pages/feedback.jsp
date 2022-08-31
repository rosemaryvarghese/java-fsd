<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Feedback</title>

</head>
<body>
<div class="container">
  <form method="post" action="/feedback">
<label for="firstname">First Name</label>
    <input type="text" id="firstname" name="firstname" placeholder="Your first name" required>
<br>
    <label for="lastname">Last Name</label>
    <input type="text" id="lastname" name="lastname" placeholder="Your last name" required>
<br>
<label for="email">Email Id</label>
    <input type="email" id="email" name="email" placeholder="Your Email Address" required>
<br>
    <label for="feedback1">Feedback</label>
    <textarea id="feedback1" name="feedback1" placeholder="Write your feedback here..." style="height:200px" required></textarea>
<br>
    <input type="submit" value="Submit">

  </form>
  </div>
</body>
</html>