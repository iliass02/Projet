<?php
// tri_fusion.php for tri_fusion in /home/argyre_j/Projet/Nox/nox
// 
// Made by ARGYRE Jean-Elie
// Login   <argyre_j@etna-alternance.net>
// 
// Started on  Thu Nov  6 11:50:26 2014 ARGYRE Jean-Elie
// Last update Fri Nov  7 11:28:49 2014 ARGYRE Jean-Elie
//

function tri_fusion(&$tab)
{
  if (count($tab) <= 1)
    return;
  else
    {
      $tab1 = array();
      $tab2 = array();
      for ($i = 0; $i < count($tab); $i++)
	{
	  if ($i < (count($tab)) / 2)
	    $tab1[] = $tab[$i];
        else
          $tab2[] = $tab[$i];
	}
      tri_fusion($tab1);
      tri_fusion($tab2);
      fusionner($tab1, $tab2, $tab);
    }
}

function fusionner($tab1, $tab2, &$tab)
{
  $i = 0;
  $i1 = $i2 = 0;
  while ($i1 < count($tab1) && $i2 < count($tab2))
    {
      if($tab1[$i1] < $tab2[$i2])
	$tab[$i] = $tab1[$i1++];
    else
      $tab[$i] = $tab2[$i2++];
      $i++;
    }
  while ($i1 < count($tab1))
    {
      $tab[$i] = $tab1[$i1++];
      $i++;
    }
  while($i2 < count($tab2))
    {
      $tab[$i] = $tab2[$i2++];
      $i++;
    }
}

?>