<html>
<head>
	<title>AJAX</title>
	<script type="text/javascript">
		function fun(str) {
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if(this.readyState == 4 && this.status == 200) {
				document.getElementById("txtHint").innerHTML = this.responseText;
			}
		};
		xhttp.open("GET","bookfetch.php?q="+str,true);
        xhttp.send();
	}
	</script>
</head>
<body>
	<select id="sel1" onchange="fun(this.value)">
		<option value="title1">Book1</option>
		<option value="title2">Book2</option>
		<option value="title3">Book3</option>
	</select>
	<div id="txtHint"></div>
</body>
</html>