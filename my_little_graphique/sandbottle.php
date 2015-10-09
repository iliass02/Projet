<html>
  <body>
    <head>
      <meta charset="utf-8" />
      <title>SandBottle</title>
    </head>
    <h1 align="center">SandBottle</h1>

   <SPAN style="position: absolute; top: 50 px; left: 550px";>

<form method="post" action="sandbottle.php">
   <center><label for="fonction">fonction f(x) =</label></center>
   <center><input type="number" name="formule_a"><?php echo 'x² + '; ?><input type="number" name="formule_b"> <?php echo 'x + '; ?><input type="number" name="formule_c"</p></center>
        <center><input type="submit" value="Envoyer" /></center>
</form>

  <svg width="500" height="500">
  <rect width="500" height="500" style="fill:rgb(29,234,200);stroke-width:3;stroke:rgb(0,0,0)" />
   <?php $color = "rgba(0, 0, 0, 1)"; ?>
      <line x1="250" x2="250" y1="0" y2="500" style="stroke:<?php echo $color; ?>;stroke-width:1" />
      <line y1="250" y2="250" x1="0" x2="500" style="stroke:<?php echo $color; ?>;stroke-width:1" />
      <?php
   $coord_x = 0;
   $coord_y = 0;
   while ($coord_x <= 500)
     {
       $i = $coord_x;
       $x = $coord_x - 249;
       $coord_x++;
       $a = $_POST["formule_a"];
       $b = $_POST["formule_b"];
       $c = $_POST["formule_c"];
       $y = ($a * $x * $x) + ($b * $x) + $c;
       $j = $coord_y;
       $coord_y = 250 - $y;
       if ($i != 0)
	 echo '<line x1="'.$i.'" y1="'.$j.'" x2="'.$coord_x.'" y2="'.$coord_y.'" style="stroke:rgb(255,0,0);stroke-width:3" />';
     }
   echo '</svg>';
   ?>
    </svg>
    </form>
 </SPAN>
    </table>
  </body>
</html>

