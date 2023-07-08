<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns:th="http://www.thymeleaf.org">

	<head>
		<title>Fun Wordle</title>
		<link rel="stylesheet" href="css/login.css">
	</head>
	
	<%@ include file="common/header.jspf"%>
	
	<body>
		<div class="container">
			<div class="status">
				${errorMessage}
				<p>${errorMessage}</p>
				<p th:text="${errorMessage}"/>
				<p th:text="${successMessage}"/>
				<a href="/">Back</a>
			</div>
		</div>
	</body>
	
	<%@ include file="common/footer.jspf"%>
	
</html>