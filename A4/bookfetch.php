<?php
$q = $_GET['q'];

$con = mysqli_connect('localhost','root','rootpasswordgiven','books');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$result = mysqli_query($con,"SELECT * FROM t1 WHERE title = '".$q."'");

echo "<table><tr><th>ID</th><th>Title</th><th>Price</th></tr>";

while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['title'] . "</td>";
    echo "<td>" . $row['price'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>