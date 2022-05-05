<!-- 
6. Heu de crear un script que mostri per pantalla un missatge “Edat correcte” si el valor de la
variable $edat està entre els 18 i 35 anys inclosos i sinó ha de mostrar el missatge “Edat
incorrecte”. Heu d’utilitzar l’operador ternari.
-->
<!DOCTYPE html>
<html>
<body>
<?php
    $edat = 40;
    if($edat >= 18 and $edat <= 35){
        echo "Edad correcta";
    }
    else {
        echo "Edad incorrecta";
    }

?>
</body>
</html>