<html>

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
			    <form method="post">
			    	<div class="form-item">
			    		<label for="username">User Name</label>
				    	<input type="text" name="username" />
			    	</div>
			    	<div class="form-item">
					    <label for="password">Password</label>
					    <input type="password" name="password" /> 
				    </div>
				    <div>
				    	<input type="button" value="Login" />
				    </div>
			    </form>
			  </div>
			  <hr width=50%>
			  <div class="form-item">
			  	<h1>Sign Up</h1>
			  	<font color="red">${errorMessage}</font>
			    <form method="post">
			    	<div class="form-item">
			    		<label for="firstname">First Name</label>
				    	<input type="text" name="firstname" />
				    </div>
				    <div class="form-item">
			    		<label for="lastname">Last Name</label>
				    	<input type="text" name="lastname" />
				    </div>
				    <div class="form-item">
			    		<label for="username">User Name</label>
				    	<input type="text" name="username" />
				    </div>
				    <div class="form-item">
			    		<label for="password">Password</label>
				    	<input type="password" name="password" />
				    </div>
				    <div>
				    	<input type="submit" value="Create Account"/>
				    </div>
			    </form>
			  </div>
		  </div>
    <footer>Based off of the NYT Wordle game
    				Made by Julia Sanford
    </footer>
	</body>

</html>