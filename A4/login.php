<?php
if($_SERVER['REQUEST_METHOD'] == 'POST')
{
	$user_name = $_POST['username'];
	$pass_word = $_POSt['password'];
	
	$con = mysqli_connect("localhost", "root", "rootpasswordgiven", "accounts");
	
	if(!$con)
	{
		die("Connection failed" .mysqli_connect_error());
	}
	else
	{
		$flag=0;
		 $query = mysqli_query($con, "SELECT * from t1");
    while($exe = mysqli_fetch_assoc($query)) 
    {
        if(strcmp($exe['username'], $user_name))
        {
        	$flag=0;
        }
        else
        {
        	if(strcmp($exe['password'], $pass_word))
        	{
        		$flag=1;
        		break;
        	}
        }
     }
     
     if($flag==1)
     {
     	echo "<script>window.open('home.php'); </script>";
     }   
     else
     {
     	echo "<script>alert('Wrong Username or Password')</script>";
     }
	}
	mysqli_close($con);	
} 

?>


<html>
	<head><title>PHP, AJAX, Mysql</title></head>
	
	<body>
	<form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post">
		<label>Username</label>
		<input type="text" name="username">
		<label>Password</label>
		<input type="text" name="password">
		<input type="submit">
	</form>
	</body> 
</html>