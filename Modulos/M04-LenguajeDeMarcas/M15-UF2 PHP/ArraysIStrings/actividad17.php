<!-- 
Heu de crear un script per a calcular la nota mitjana trimestral d'un alumne. Per calcular-la,
heu de tenir en compte que les notes del trimestre es guarden en un array numèric.
-->
<!DOCTYPE html>
<html>
<body>
<?php
    $notas = array(5,6,7,1,3,7,9);
    $sum = array_sum($notas);
    echo "Media: ".$sum/count($notas);
?>
</body>
</html>