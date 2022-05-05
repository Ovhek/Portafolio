<!-- Heu de crear un script que indiqui si dues paraules rimen o no. Si coincideixen les tres últimes
lletres, s'ha de mostrar un missatge que digui que rimen molt, si només coincideixen les dues
últimes lletres, s'ha de mostrar un missatge que digui que rimen un poc i si no s'ha de mostrar
un missatge que no rimen.
-->
<!DOCTYPE html>
<html>
<body>
<?php
    $str1 = "string";
    $str2 = "strisdasdnasddasg";
    if(substr($str1,-3) == substr($str2,-3)){
        echo "Riman mucho!!";
    }
    else if (substr($str1,-2) == substr($str2,-2)){
        echo "Riman poco!!";
    }
    else{
        echo "No riman!!";
    }
?>
</body>
</html>