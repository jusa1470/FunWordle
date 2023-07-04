<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns:th="http://www.thymeleaf.org">

	<head>
		<title>Fun Wordle</title>
		<link rel="stylesheet" href="css/login.css">
	</head>
	
	<%@ include file="common/header.jspf"%>
	
	<body>
		<div class="container">
			<form:form modelAttribute="client" action="login" method="post">
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
               <td><input type="submit" value="Login"/></td>
           </tr>
        </table>
       </form:form>
       <form:form modelAttribute="client" action="signup" method="post">
         <table>
           <tr>
              <td><form:label path="firstName">First Name</form:label></td>
              <td><form:input path="firstName" maxlength="50" required="required"/></td>
              <form:errors path="firstName"></form:errors>
           </tr>
           <tr>
              <td><form:label path="lastName">Last Name</form:label></td>
              <td><form:input path="lastName" maxlength="50" required="required"/></td>
              <form:errors path="lastName"></form:errors>
           </tr>
           <tr>
              <td><form:label path="username">Username</form:label></td>
              <td><form:input path="username" maxlength="50" required="required"/></td>
              <form:errors path="username"></form:errors>
           </tr>
           <tr>
              <td><form:label path="password">Password</form:label></td>
              <td><form:password path="password" maxlength="50" required="required" pattern=".*"/></td>
              <form:errors path="password"></form:errors>
           </tr>
           <tr>
               <td><input type="submit" value="Sign Up"/></td>
           </tr>
        </table>
       </form:form>
	  </div>
	</body>
	
	<%@ include file="common/footer.jspf"%>
</html>