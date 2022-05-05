<!-- 
Heu de crear un script que donada la següent adreça URL:
http://www.google.com/search?hl=en&ie=UTF-8&q=php+development&btnG=Goo+bro
imprimeixi per pantalla un llistat HTML amb:
• El domini de l'adreça (http://www.google.com/search) en el primer punt del llistat.
• Els parells nom/valor que formen part de l’adreça. Cadascun d'ells en un dels següents
punts del llistat. És a dir, els parells nom/valor que hi ha després del interrogant “?”, per
exemple hl=en, ie=UTF, etc.

-->
<!DOCTYPE html>
<html>
<body>
<?php
    $url = "http://www.google.com/search?hl=en&ie=UTF-8&q=php+development&btnG=Goo+bro";
    $dominio = substr($url,0,strpos($url,"?"));
    echo "<ul>";
    echo "<li>$dominio</li>";
    $primer_par_valor = substr($url,strpos($url,'?')+1,5);
    echo "<li>$primer_par_valor</li>";
    $pares_valor =  explode('&',$url);
    foreach ($pares_valor as $par_valor) {
        echo "<li>$par_valor</li>";
    }
    echo "</ul>";
?>
</body>
</html>