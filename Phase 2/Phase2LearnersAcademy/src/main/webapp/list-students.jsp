<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Students</title>

</head>


	<jsp:include page="left-list.jsp" />
				<h3>Students</h3>


				<table>

					<tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>
						

					</tr>

					<c:forEach var="tempStudent" items="${STUDENT_LIST }">
						<tr>

							<td>${tempStudent.fname}</td>
							<td>${tempStudent.lname}</td>
							<td>${tempStudent.age}</td>
						</tr>

					</c:forEach>

				</table>
</body>
</html>
