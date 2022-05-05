<!-- 

. Heu de crear un script on definireu un array associatiu on els seus índexs seran els set dies de
la setmana ordenats de dilluns a diumenge, i el valor associat a aquests índexs, el valor
numèric que els representa dins de la setmana, és a dir, si l'índex és "dilluns", el seu valor
associat serà 1, sí és "dimarts" el seu valor serà 2, i així successivament fins arribar al
"diumenge" que el seu valor serà 7.
L’script ha d’imprimir per pantalla:
▪ El valor numèric donat un dia de la setmana. Feu servir una variable per guardar el dia
de la setmana.
▪ El dia de la setmana donat un valor numèric de l’1 al 7. Feu servir una variable per
guardar el valor numèric.
-->
<!DOCTYPE html>
<html>
<body>
<?php
    //array asociativo
    $dia_semana = [
        "Lunes" => 1,
        "Martes" => 2,
        "Miércoles" => 3,
        "Jueves" => 4,
        "Viernes" => 5,
        "Sabado" => 6,
        "Domingo" => 7
    ];

    $dia = 1;
    $nombreDia = "Lunes";

    foreach ($dia_semana as $key => $value) {
        if($key == $nombreDia)
            echo $value."<br>";
        if ($value == $dia)
            echo $key."<br>";
    }


?>
</body>
</html>