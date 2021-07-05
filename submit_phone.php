<?php

include('connection.php');
$id = (int)$_POST['id'];
$name = $_POST['nama'];
$harga = $_POST['harga'];
$query = 'insert into tbl_phone(phone_name,harga,)values("'$nama'","'$harga'")';
if($id>0){
    $query = 'update tbl_phone set_phone_name="'$nama'",price="'$harga'"where id ='$id;
}
mysqli_query($query) or die(mysqli_error());

?>
