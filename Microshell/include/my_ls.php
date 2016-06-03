<?php
// my_ls.php for  in /home/marcho_i/MicroShell/marcho_i
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Fri Oct 17 11:12:28 2014 MARCHOUD Iliass
// Last update Sat Oct 18 15:32:14 2014 MARCHOUD Iliass
//

function my_ls ($argv)
{
  if (file_exists($argv[1]) == false)
    {
      echo "ls: {$argv[1]}: No such file or directory\n";
    }
  elseif (is_dir($argv[1]) == true)
    {
      $open = opendir($argv[1]);
      $read = readdir($open);
      echo "{$read}\n";
      closedir ($open);
    }
  elseif ($read != ".")
    {
      if (is_link($read))
        {
          echo "{$read}@\n";
        }
      elseif (is_dir($read))
        {
          echo "{$read}/\n";
        }
      elseif (is_file($read))
	{
	  echo "{$read}*\n";
	}
    }
}
