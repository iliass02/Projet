<?php
// dichotomique.php for  in /home/marcho_i/projects/Projet_No-X/marcho_i/nox
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Thu Nov  6 14:28:14 2014 MARCHOUD Iliass
// Last update Fri Nov  7 11:26:57 2014 ARGYRE Jean-Elie
//

function recherche_dicho($tab, $find)
{
  $debut = 0;
  $fin = count($tab);
  $stop = 0;
  for ($i = 0; isset($tab[$i]); $i++)
    {
      while (($fin - $debut) > 1 && ($stop == 0))
	{
	  $milieu = round(($debut + $fin) / 2);
	  if ($tab[$debut] == $find)
	    return (0)."\n";
	  elseif ($tab[$milieu] > $find)
	    $fin = $milieu;
	  elseif ($tab[$milieu] < $find)
	    $debut = $milieu;
	  elseif ($tab[$milieu] == $find)
	    {
	      echo $tab[$milieu]."\n";
	      $stop = 1;
	    }
	}
    }
}