<?php

function        verif($tab, $pos)
{
    if($tab[$pos[0]][$pos[1]] == '.')
        return 1;
    else
        echo "\nKO : la case est remplie ou n'existe pas\n";
}

function        placement($tab, $pos, $PJ)
{
    if($tab[$pos[0]][$pos[1]] == '.')
    {
        if($PJ == 1)
            $tab[$pos[0]][$pos[1]] = "\033[32mO\033[0m";
        else
            $tab[$pos[0]][$pos[1]] = "\033[31mX\033[0m";
        passthru('clear');
        return $tab;
    }
}
