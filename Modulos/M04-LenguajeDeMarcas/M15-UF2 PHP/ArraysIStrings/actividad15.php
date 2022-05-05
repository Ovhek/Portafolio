<!-- 
    . Heu de crear un script que donada una frase comprovi si aquesta és un palíndrom o no.
Recordeu que els palíndroms són aquelles frases que si es llegeixen de dreta a esquerra,
diuen el mateix que d’esquerra a dreta. Exemple de palíndrom: “A cavar a Caravaca”.
-->
<!DOCTYPE html>
<html>
<body>
<?php
    $frase = "A cavar a Caravaca";
    $frase_inv = strrev($frase);

    echo strtolower(str_replace(" ","",$frase)) == strtolower(str_replace(" ","",$frase_inv)) ? "Es palindromo" : "No es palindromo";
?>
</body>
</html>