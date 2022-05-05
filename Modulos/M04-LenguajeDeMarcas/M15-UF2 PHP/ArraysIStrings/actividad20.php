<!-- 
Heu de crear un script on definireu un array associatiu per guardar les notes trimestrals dels
alumnes de 1DAM. Els índexs d’aquest array seran els noms dels alumnes, i els continguts
associats als índexs la nota trimestral de cada alumne.
L’script ha d’imprimir per pantalla:
▪ El nom de l’alumne amb millor nota i la seva nota.
▪ El nom de l’alumne amb pitjor nota i la seva nota.
▪ La mitjana de les notes dels alumnes.
-->
<!DOCTYPE html>
<html>
<body>
<?php
    //array asociativo
    $DAM1A = [
        "Alex" => 10,
        "Capi" => 8,
        "Otro" => 3
    ];

    $mejor_nota = 0;
    $peor_nota = 10;
    $media = 0;
    foreach ($DAM1A as $key => $value) {
        if($value > $mejor_nota)
            $mejor_nota = $value;
        if($value < $peor_nota)
            $peor_nota = $value;
        $media += $value;
    }
    echo "Alumno peor nota: ".array_keys($DAM1A,$peor_nota)[0]."<br>";
    echo "Alumno mejor nota: ".array_keys($DAM1A,$mejor_nota)[0]."<br>";
    echo "Media: ".$media/count($DAM1A);


?>
</body>
</html>