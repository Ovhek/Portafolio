<!DOCTYPE html>
<html>
<body>
<?php
    $temporal = "Joan";
    echo var_dump($temporal)."<br>Tipo: ".gettype($temporal)."<br><br>";
    $temporal = 3.14;
    echo var_dump($temporal)."<br>Tipo: ".gettype($temporal)."<br><br>";
    $temporal = false;
    echo var_dump($temporal)."<br>Tipo: ".gettype($temporal)."<br><br>";
    $temporal = 3;
    echo var_dump($temporal)."<br>Tipo: ".gettype($temporal)."<br><br>";
    $temporal = null;
    echo var_dump($temporal)."<br>Tipo: ".gettype($temporal);
?>
</body>
</html>
