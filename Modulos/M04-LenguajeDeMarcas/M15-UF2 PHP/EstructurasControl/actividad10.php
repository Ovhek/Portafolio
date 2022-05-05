<!-- Heu de crear un script que mostri per pantalla la llista dels nombres primers que trobem de l’1
al 100 -->
<!DOCTYPE html>
<html>
<body>
<?php
    $numeroA = 10.5;
    $numeroB = 2;
    echo esPrimo(4);

    
    function esPrimo(int $numero)
    {
        $primero = true;
        for ($i = 2; $i <= sqrt($numero); $i++) {
            if ($numero % $i == 0) {
                $primero = false;
                break;
            }
        }
        return $primero;
    }
?>
</body>
</html>