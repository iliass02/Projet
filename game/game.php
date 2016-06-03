<?php

include('./include/parseur.php');

function game ($argc, $argv)
{
	if ($argc == 4)
	{
		parseur($argv[3]);
	}
	else
		echo "\nUSAGE : ./game.php [nombre de vie] [valeur des ressources] [fichier contenant la map]\n\n";

}
game($argc, $argv);
?>