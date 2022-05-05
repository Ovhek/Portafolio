<!-- 11. Heu de crear un script que doni la volta (comenci pel final) a una cadena de caràcters.
 -->
<!DOCTYPE html>
<html>
<body>
<?php
    $str = "Hola";
    //Implode --> Junta un array de chars en un string
    //array_reverse --> da la vuelta a un array
    //str_split --> divide el string en un array de charss
    echo implode("",array_reverse(str_split($str)));
    
?>
</body>
</html>