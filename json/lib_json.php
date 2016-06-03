<?php

function select_all($path)
{
	$table = file_get_contents($path);
	$user = json_decode($table);
	return $user;
}

function include_file($add_content, $path)
{
  	$tab = select_all($path);
	$tab[] = $add_content;
	$tab1 = json_encode($tab);
	file_put_contents($path, $tab1);
}
?>
