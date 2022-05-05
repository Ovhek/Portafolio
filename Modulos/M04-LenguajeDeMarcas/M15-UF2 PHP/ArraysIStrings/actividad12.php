<!-- 12. Heu de crear un script que substitueixi les vocals d’una cadena de caràcters per “X” -->
<!DOCTYPE html>
<html>
<body>
<?php
    $strASustituir = "aeiou";
    $str = "Buenos Días ¿Qué tal?";
    
    $test = preg_replace("/[áàãâäéèêëíìîïóòõôöúùûüçÁÀÃÂÄÉÈÊËÍÌÎÏÓÒÕÖÔÚÙÛÜaaaaaeeeeiiiiooooouuuucAAAAAEEEEIIIIOOOOOUUUU]/","X",$str);
    echo $test;
    
?>
</body>
</html>