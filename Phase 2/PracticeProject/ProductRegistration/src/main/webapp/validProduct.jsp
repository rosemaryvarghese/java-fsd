<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>>Valid Product</title>
</head>
<body>
<%= session.getAttribute("name") %> has been registered to product.ID : <%= session.getAttribute("id") %> Brand: <%= session.getAttribute("brand") %>
</body>
</head>
</html>