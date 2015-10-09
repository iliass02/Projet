<?php

function	menu()
{
	echo "\n\nBienvenue dans le jeu du Morpion !\n";
	echo "Veuillez taper 1 pour jouer\n";
	echo "Veuillez taper 0 pour quitter\n";
}

function	aff_end($vict, $PJ)
{
	if ($vict == 2)
	   	echo "None\n";
	else if($vict == 1 && $PJ == 0) 
		echo "Player2\n";
	else if($vict == 1 && $PJ == 1)
		echo "Player1\n";
}	