<!-- 
21. Heu de crear un script que simuli el tir de dos daus de manera que si els valors obtinguts del
tir són iguals el jugador, rebrà la següent puntuació:
▪ 1 doble: 1 pt
▪ 2 doble: 4 pts
▪ 3 doble: 6 pts
▪ 4 doble: 8 pts
▪ 5 doble: 10 pts
▪ 6 doble: 20 pts
Cada dau serà un vector i la tirada de daus es farà mitjançant la funció shuffle, de tal manera
que el resultat de la tirada serà el valor que ocupa la primera posició en cadascun dels daus
(vectors).
Al jugador se li ha de mostrar per pantalla el resultat de la tirada:
▪ Si ha estat doble, se li mostrarà la puntuació obtinguda, la tirada que ha sortit i un
missatge d'en hora bona.
▪ Si no és doble, se li mostrarà la tirada que ha sortit i un missatge indicant-li que no té
puntuació perquè no ha sortit un doble.
-->

<!DOCTYPE html>
<html>
<body>
<?php
    $dado1 = array(1,2,3,4,5,6);
    $dado2 = array(1,2,3,4,5,6);
    shuffle($dado1);
    shuffle($dado2);

    echo "Tirada Primer dado: ".$dado1[0]."<br>";
    echo "Tirada Segundo dado: ".$dado2[0]."<br>";
    if ($dado1[0] == $dado2[0]){
        if($dado1[0] == 6)
            $puntos = 20;
        else
            $puntos = $dado1[0]*2;
        echo "Enhorabuena ha salido dobles!!! has ganado $puntos puntos.";
    }
    else{
        echo "No tienes puntuación porque no ha salido doble.";
    }
        
?>
</body>
</html>