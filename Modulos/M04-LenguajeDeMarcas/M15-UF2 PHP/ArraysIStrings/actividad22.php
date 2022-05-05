<!-- 
Heu de crear un script que generi la taula de multiplicar del 2 mitjançant un array numèric
bidimensional on cada posició correspondrà a un array de dues posicions, on el contingut de
la primera posició (recordeu que la primera posició correspon a l'índex 0) serà el número pel
qual multiplicarem el 2 i el de la segona posició el resultat d'aquesta multiplicació. Un cop
creada la taula de multiplicar, mostrarem per pantalla el contingut de l'array bidimensional en
format de taula HTML, on cada fila de la taula correspondrà a "N x 2 = P", on N serà el número
pel qual múltiplicarem el 2 i P el resultat de la multiplicació.
Ara convertireu la taula de multiplicar del 2 en la taula de multiplicar del 5, canviant els
resultats guardats en els diferents arrays pel resultat de multiplicar el número que ocupa la
primera posició per 5, i tornarem a mostrar el contingut de l'array bidimensional en una taula
HTML.
Heu de tenir en compte que les taules de multiplicar comencen multiplicant pel número 1 i
finalitzen amb la multiplicació per 10.
-->

<!DOCTYPE html>
<html>
<body>
<?php
    $tabla_del_2 = array(
        array(1,2,3,4,5,6,7,8,9,10),
        array(2,4,6,8,10,12,14,16,18,20)
    );
    echo "<table>";
    foreach ($tabla_del_2 as $arrays) {
        for ($i=0; $i < count($arrays); $i++) { 
            echo $arrays;
        }
    }
    echo "</table>";    
?>
</body>
</html>