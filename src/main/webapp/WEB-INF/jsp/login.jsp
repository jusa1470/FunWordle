<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

	<head>
		<title>Fun Wordle</title>
		<link rel="stylesheet" href="css/login.css">
	</head>
	
	<body>
		<header>Fun Wordle</header>
			<div class="container">
				<div class="form-item">
					<h1>Log In</h1>
			    <font color="red">${errorMessage}</font>
			    <form th:action="@{/login}" th:object="${client}">
			    	<div class="form-item">
			    		<label for="username">User Name</label>
				    	<input type="text" name="username" th:field="*{username}"
				    		required/>
			    	</div>
			    	<div class="form-item">
					    <label for="password">Password</label>
					    <input type="password" name="password" th:field="*{password}"
					    	required/> 
				    </div>
				    <div>
				    	<button type="submit">Login</button>
				    </div>
			    </form>
			  </div>
			  <hr width=50%>
			  <div class="form-item">
			  	<h1>Sign Up</h1>
			  	<font color="red">${errorMessage}</font>
			  	<font color="green">${signUpStatus}</font>
			    <form th:action="/@{/signup}" th:object="${client}">
			    	<div class="form-item">
			    		<label for="firstName">First Name</label>
				    	<input class="form-control" type="text" name="firstName" th:field="*{firstName}"
				    		required/>
				    </div>
				    <div class="form-item">
			    		<label for="lastName">Last Name</label>
				    	<input class="form-control" type="text" name="lastName" th:field="*{lastName}"
				    		required/>
				    </div>
				    <div class="form-item">
			    		<label for="username">User Name</label>
				    	<input class="form-control" type="text" name="username" th:field="*{username}"
				    		required/>
				    </div>
				    <div class="form-item">
			    		<label for="password">Password</label>
				    	<input class="form-control" type="password" name="password" th:field="*{password}" required pattern=".*" maxlength=30/>
				    </div>
				    <div>
				    	<button type="submit">Sign Up</button>
				    </div>
			    </form>
			  </div>
		  </div>
    <footer>Based off of the NYT Wordle game
    				Made by Julia Sanford
    </footer>
	</body>

</html>