<?php

function	victory($tab)
{
	if ($tab[1][2] == $tab[3][2] && $tab[1][2] == $tab[5][2] && $tab[5][2] != '.')
	   return 1;
	else if ($tab[1][4] == $tab[3][4] && $tab[1][4] == $tab[5][4] && $tab[5][4] != '.')
	   return 1;
	else if ($tab[1][6] == $tab[3][6] && $tab[1][6] == $tab[5][6] && $tab[5][6] != '.')
	   return 1;
	else if ($tab[1][2] == $tab[1][4] && $tab[1][2] == $tab[1][6] && $tab[1][6] != '.')
	   return 1;
	else if ($tab[3][2] == $tab[3][4] && $tab[3][2] == $tab[3][6] && $tab[3][6] != '.')
	   return 1;
	else if ($tab[5][2] == $tab[5][4] && $tab[5][2] == $tab[5][6] && $tab[5][6] != '.')
	   return 1;
	else if ($tab[1][2] == $tab[3][4] && $tab[1][2] == $tab[5][6] && $tab[5][6] != '.')
	   return 1;
	else if ($tab[1][6] == $tab[3][4] && $tab[1][6] == $tab[5][2] && $tab[5][2] != '.')
	   return 1;
	else
	 {
	   for($i = 1; isset($tab[$i]) ; $i += 2)
	   	  for($j = 2; isset($tab[$i][$j]); $j += 2)
		  	 if ($tab[$i][$j] == '.')
			    return 0;
	   return 2;
	}
}	 


function	recup_input()
{
	$pos = array();
	$pos[0] = 1;
	$pos[1] = 2;
	echo "\n?> ";
    $handle = fopen('php://stdin', 'r');
    $input = fgets($handle);
	if($input[0] == 'A' || $input[0] == 'a')
   	   $pos[0] = 1;
	else if($input[0] == 'B' || $input[0] == 'b')
   	   $pos[0] = 3;
	else if($input[0] == 'C' || $input[0] == 'c')
   	   $pos[0] = 5;
	if($input[1] == '1')
   	   $pos[1] = 2;
	else if($input[1] == '2')
   	   $pos[1] = 4;
	else if($input[1] == '3')
   	   $pos[1] = 6;
   	else 
   		return 0;
	return $pos;
}