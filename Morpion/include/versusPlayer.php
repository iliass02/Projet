<?php

function	versus($tab)
{
	$vict = 0;
    $pos = array();
    aff_tab($tab);
    while($vict == 0)
    {
        $PJ = 1;
        $pos = recup_input();
        while (verif($tab, $pos) == 0)
            $pos = recup_input();
        $tab = placement($tab, $pos, $PJ);
        aff_tab($tab);
        $vict = victory($tab);
        if ($vict == 0)
        {
		    $PJ =0;
		    $pos = recup_input();
            while (verif($tab, $pos) == 0)
                $pos = recup_input();
            $tab = placement($tab, $pos, $PJ);
            aff_tab($tab);
            $vict = victory($tab);
        }
    }
    aff_end($vict, $PJ);
}