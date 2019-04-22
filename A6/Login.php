<?php
if($_SERVER['REQUEST_METHOD'] == 'POST')
{
	$user_name = $_POST['username'];
	$pass_word = $_POST['password'];
	
	$con = mysqli_connect("localhost", "root", "rootpasswordgiven", "accounts");
	
	if(!$con)
	{
		die("Connection failed" .mysqli_connect_error($con));
	}
	else
	{
		$query = mysqli_query($con, "select * from t1 where username = '$user_name' and password = '$pass_word'");
		if(mysqli_num_rows($query) > 0)
		{
			header('Location: Home.html');
		}
		else
		{
			echo "<script>alert('Wrong username or password');</script>";
		}
	}
	mysqli_close($con);
}

?>

<html>
<head><title>Login</title></head>

<body>
	<form action="" method="POST">
		<label>Username</label>
		<input type="text" name="username">
		<label>Password</label>
		<input type="password" name="password">
		<input type="submit">
	</form>
</body>
</html>
