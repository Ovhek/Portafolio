<!-- 
Heu d'escriure un script que donat un mes en número (1 per gener, 2 per febrer,...) i un any,
indiqui el nombre de dies d'aquest mes. Recordeu que un any és de traspas si es divisible per
4, excepte quan és divisible per 100, a no ser que sigui divisible per 400. Així, 1900 no va ser
un any de traspas, però l'any 2000 si ho va ser
-->
<!DOCTYPE html>
<html>
<body>
<?php
    $numeroMes = 1;
    $numeroAnyo = 1900;
    echo "Número de días: ".cal_days_in_month(CAL_GREGORIAN,$numeroMes,$numeroAnyo);
?>
</body>
</html>