#!/usr/bin/env php
<?php
// nox.php for  in /home/marcho_i/projects/Projet_No-X/marcho_i/nox
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Thu Nov  6 12:13:36 2014 MARCHOUD Iliass
// Last update Mon Nov 10 18:17:05 2014 MARCHOUD Iliass
//

require_once ('./include/tri_fusion.php');
require_once ('./include/dichotomique.php');
require_once ('./include/tab.php');
require_once ('./include/gest_erreur.php');
require_once ('./include/affichage.php');

$time_start = microtime(true);
if (isset($argv[1]))
  {
    if (isset($argv[2]) == false)
      echo "puis veuillez taper le nom du fichier contenant votre liste de mot WESH\n";
    else
      {
    aff();  	
	tri_fusion($dico);
	for($i = 0; isset($tab[$i]); $i++)
	  {
	    recherche_dicho($dico, $tab[$i]);
	  }
	echo "\n";
	$time_end = microtime(true);
	$time = $time_end - $time_start;
	$time2 = number_format($time, 3);
	echo "terminer en $time2 s\n";
      }
  }