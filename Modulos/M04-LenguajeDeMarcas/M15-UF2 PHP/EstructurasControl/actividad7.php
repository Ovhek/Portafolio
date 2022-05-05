<!-- 7. Heu d'escriure un script que donat un nombre N major que 0 calculi la següent suma 1+2+3+...
+N. -->
<!DOCTYPE html>
<html>
<body>
<?php
    $numero = 5;
    if($numero > 0){
        $suma = 0;
        for ($x = 1; $x <= $numero; $x++) {
            $suma += $x;
        }
        echo $suma;
    }

?>
</body>
</html>