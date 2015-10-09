#!/usr/bin/php
<?php

require("./include/affichage.php");
require("./include/victory.php");
require("./include/verif.php");
require("./include/versusPlayer.php");

function	jeu()
{
	$game = 1;
	while ($game == 1)
	{
		passthru('clear');
	    menu();
	    while ($input[0] != "1" && $input[0] != "0")
		{    
		    echo "\n?> ";
		    $handle = fopen('php://stdin', 'r');
    		$input = fgets($handle);
		    $tab = gen_tab();
			gen_tab();  	  
			if($input[0] == "1")
			{
				passthru('clear');
				versus($tab);
			}
			else if ($input[0] == "0")
			    exit();
			else
			    echo "Je n'ai pas compris votre reponse \n";
	    }
	    return 0;
	}
}

function	gen_tab()
{
	$tab = array();
	$tab[0] = array(' ',' ','1',' ','2',' ','3');
	$tab[1] = array('A',' ','.','|','.','|','.');
	$tab[2] = array(' ',' ','_','_','_','_','_');
	$tab[3] = array('B',' ','.','|','.','|','.');
	$tab[4] = array(' ',' ','_','_','_','_','_');
	$tab[5] = array('C',' ','.','|','.','|','.');
	return $tab;
}

function	aff_tab($tab)
{
	echo "\n";
	for($i = 0; isset($tab[$i]); $i++)	
	{
	    for($j = 0; isset($tab[$i][$j]); $j++)
	    	echo $tab[$i][$j];
	    echo "\n";
	}    
	echo "\n";
}

jeu();