<!-- 
Heu de crear un script que generi un array associatiu on guardarem tres fruites: "poma",
"pera" i "plàtan" en aquest ordre. Els seus índexs seran les seves traduccions a l'anglès, és a
dir, l'índex de "poma" serà "apple", el de "pera" "pear" i el "plàtan" "banana". I mostrareu el
seu contingut mitjançant la funció print_r.
Ara li afegireu una nova fruita després del "plàtan", en concret "pinya" amb índex
"pineapple", i de nou mostrareu el contingut de l'array mitjançant la funció print_r.
A continuació canviareu la "pera" per "pruna" mantenint el mateix índex, i consultareu l'array
per mostrar per pantalla la traducció de "pear" al català. El que s'ha de mostrar per pantalla
és "Pear : pruna", on pruna ha de ser el valor associat a l'índex "pear"


-->
<!DOCTYPE html>
<html>
<body>
<?php
    //array asociativo
    $frutas = [
        "apple" => "poma",
        "pear" => "pera",
        "banana" => "platan"
    ];
    print_r($frutas);
    echo "<br>";
    $frutas += ["pineapple" => "pinya"];

    print_r($frutas);
    echo "<br>";

    $frutas["pear"] = "pruna";

    foreach ($frutas as $key => $value) {
        echo "$key: $value<br>";
    }

?>
</body>
</html>