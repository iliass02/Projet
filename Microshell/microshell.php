#!/usr/bin/env php
<?php
// microshell.php for  in /home/marcho_i/projects
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Thu Oct 16 19:48:52 2014 MARCHOUD Iliass
// Last update Sat Oct 18 14:35:40 2014 MARCHOUD Iliass
//

require_once ('./include/affichage.php');
require_once ('./include/decoupage.php');
require_once ('./include/my_echo.php');
require_once ('./include/my_pwd.php');
require_once ('./include/my_cat.php');
require_once ('./include/my_help.php');
require_once ('./include/my_cd.php');
require_once ('./include/my_ls.php');
require_once ('./include/my_env.php');
require_once ('./include/my_setenv.php');
require_once ('./include/my_unsetenv.php');


$fd = fopen("php://stdin", "r");
if ($fd == true)
  {
    aff_prompt ();
    while (($line = fgets($fd)) == true)
      {
	if ($line == "exit\n")
          {
            echo "fermeture du microshell, Bye !\n";
            return(0);
          }
	$line = trim($line);
	$argv = decoup_params($line);

	$ptr = 'my_'.$argv[0];
	if (function_exists($ptr))
	  {
	    $ptr($argv);
	  }
	elseif (function_exists($ptr) == false && isset($argv[0]))
	  {
	    echo "{$argv[0]}: Commande not found\n";
	  }
       	aff_prompt();
      }
    fclose($fd);
  }