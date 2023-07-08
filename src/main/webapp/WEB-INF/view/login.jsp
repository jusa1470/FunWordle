<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns:th="http://www.thymeleaf.org">

	<head>
		<title>Fun Wordle</title>
		<link rel="stylesheet" href="css/banner.css">
		<link rel="stylesheet" href="css/form.css">
	</head>
	
	<%@ include file="common/header.jspf"%>
	
	<body>
		<div class="container">
			<table>
        <tr>
          <td id="success">${successMessage}</td>
        </tr>
      </table>
      <table>
        <tr>
          <td id="error">${errorMessage}</td>
        </tr>
      </table>
			<form:form modelAttribute="client" action="processlogin" method="post">
        <table>
          <tr>
            <td><form:label path="username">Username</form:label></td>
            <td><form:input path="username" maxlength="50" required="required"/></td>
            <form:errors path="username"></form:errors>
          </tr>
          <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:password path="password" maxlength="50" required="required"/></td>
            <form:errors path="password"></form:errors>
          </tr>
          <tr>
            <td id="button" colspan="2"><input type="submit" value="Login"/></td>
          </tr>
          <tr>
          	<td id="button" colspan="2"><a href="/home">Back</a></td>
          </tr>
        </table>
      </form:form>
	  </div>
	</body>
	
	<%@ include file="common/footer.jspf"%>
</html>