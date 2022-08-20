<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Teachers</title>

</head>
		<jsp:include page="left-list.jsp" />
				<h3>Subjects</h3>

				<table>

					<tr>

						<th>Name</th>
						<th>Shortcut</th>
						

					</tr>

					<c:forEach var="tempSubject" items="${SUBJECTS_LIST }">
						<tr>

							<td>${tempSubject.name}</td>
							<td>${tempSubject.shortcut}</td>
							

						</tr>


					</c:forEach>

				</table>
</body>
</html>
