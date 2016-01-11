<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Customer Registration</title>
</head>
<body>
	${message}

	<h2>Customer Information</h2>
	<form:form method="POST" action="register" commandName="customer">
		<table>
			<tr>
				<td><form:label path="customerName">Name</form:label></td>
				<td><form:input path="customerName" /></td>
			</tr>
			<tr>
				<td><form:label path="customerEmail">Email</form:label></td>
				<td><form:input path="customerEmail" /></td>
			</tr>
			<tr>
				<td><form:label path="customerPassword">Password</form:label></td>
				<td><form:input path="customerPassword" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>