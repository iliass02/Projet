<?php
// gest_erreur.php for  in /home/marcho_i/projects/Projet_No-X/marcho_i/nox
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Fri Nov  7 12:00:04 2014 MARCHOUD Iliass
// Last update Mon Nov 10 10:05:48 2014 MARCHOUD Iliass
//

if (isset($argv[1]) == false)
  echo "USAGE : ./nox.php 'nom du fichier a decrypter' 'dico'\n";
elseif (isset($argv[1]))
  {
    if (file_exists($argv[1]))
      {
	if (is_file($argv[1]) == false)
	  echo "$argv[1] n'est pas un fichier\n";
	if (is_readable($argv[1]) == false)
	  echo "Vous n'avez pas les droits de lecture du fichier $argv[1]\n";
      }
    else
      echo "$argv[1] n'existe pas\n";
    if (isset($argv[2]))
      { 
        if (file_exists($argv[2]))
          { 
            if (is_file($argv[2]) == false)
              echo "$argv[2] n'est pas un fichier\n";
	    if (is_readable($argv[2]) == false)
	      echo "Vous n'avez pas les droits de lecture du fichier $argv[2]\n";
          } 
        else
          echo "$argv[2] n'existe pas\n";
      }
  }