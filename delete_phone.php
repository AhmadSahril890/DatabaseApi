<?php

include('connection.php');
$id= (int)$_POST['id'];
$query= 'delete from tbl_phone where id=' $id;
$result= mysqli_query($query) or die (mysqli_error());
if(mysqli_affected_row() >0){
    echo 'menghapus data sukses';
}else{
    echo'tidak sukses penghapusan data';
}

?>