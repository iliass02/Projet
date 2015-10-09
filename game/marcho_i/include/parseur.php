<?php

include('test.php');

function parseur($argv)
{
	$map = $argv;
	if ($file = file_get_contents($map))
	{
		$array = explode("\n", $file);
		var_dump($array);
		echo $array[2][3]."\n";
		shortestPath($array , $array[0][0], $array[2][3]);
	}
	else
		echo "ERREUR : Impossible d'ouvrir la map : ".$map."\n";
}

?>