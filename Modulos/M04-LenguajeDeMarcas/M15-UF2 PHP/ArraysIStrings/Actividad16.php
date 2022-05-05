<!-- 
Heu de crear un script en el qual definireu un array que contingui els números de l'1 al 10 i un
altre array amb els números de l'11 al 20. Aquest script ha de generar un tercer array amb la
suma dels dos primers arrays.
La suma serà el resultat de sumar els continguts de les mateixes posicions dels dos primers
arrays i el resultat l’haureu d’afegir a la mateixa posició però del tercer array. Per exemple el
contingut de la posició 0 del primer array serà 1 i del segon array serà 11, per tant la seva
suma serà 1 + 11 = 12, i aquest resultat (12), s’ha de guardar en la posició 0 del tercer array.


-->
<!DOCTYPE html>
<html>
<body>
<?php
    $uno_diez  = array(1,2,3,4,5,6,7,8,9,10);
    $once_veinte = array(11,12,13,14,15,16,17,18,19,20);
    $test = array_map(function($a,$b){
        return $a+$b;
    },$uno_diez,$once_veinte);
    var_dump($test);
?>
</body>
</html>