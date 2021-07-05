<?php

$conn = mysqli_connect("localhost","root","","db_phone") or die (mysql_error($conn));
mysqli_select_db($conn, "db_phone") or die(mysql_error($conn));

?> 