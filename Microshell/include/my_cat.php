<?php
// my_ct.php for  in /home/marcho_i/projects
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Fri Oct 17 09:06:44 2014 MARCHOUD Iliass
// Last update Sat Oct 18 15:14:21 2014 MARCHOUD Iliass
//

function my_cat ($argv)
{
  for ($i = 1; isset($argv[$i]); $i++)
    {
      if (is_dir($argv[1]))
        {
          echo "cat: {$argv[1]}: Is a directory\n";
        }
      elseif (file_exists($argv[$i]) == false)
        {
          echo "cat: {$argv[$i]}: No such file or directory\n";
        }
      elseif (is_file($argv[$i]) && is_readable($argv[$i]) == false)
	{
	  echo "cat: {$argv[$i]}: Permission denied\n";
	}
      elseif (is_file($argv[$i]) || is_readable($argv[$i]))
	{
	  $open = fopen($argv[$i], "r");
	  $read = fread($open, filesize($argv[$i]) + 1);
	  echo $read;
	  fclose($open);
	}
    }
}

