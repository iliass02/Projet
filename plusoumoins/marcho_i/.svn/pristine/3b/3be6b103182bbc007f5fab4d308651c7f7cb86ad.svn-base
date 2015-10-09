## vsb.sh for plusoumoins in /home/bertoc_t/PROJ/plusoumoins/include
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Wed Nov  5 15:48:10 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:35:15 2014 Bertocco Thomas-Killian
##

source ./include/replay.sh

vsb()
{
    re='^[0-9]+$'
    c=0
    echo -e "
                            \e[1m\e[38;5;226mDevinez le nombre\e[0m 
"
    while [[ $nb != "quit" ]] && [[ $d != 1 ]]; do
	res=$((9 - $c))
	echo -n ">"
	read nb
	if [[ $nb == "yoloswag" ]]; then
            echo "le nombre mystere est $try"
	elif [[ $nb =~ $re ]]; then
            if (( $nb > $plage )) || (( ${#nb} > 10 )); then
		echo "Le nombre est compris entre 0 et $plage"
	    elif (($nb == $try)); then
		d=1
            elif (($nb > $try)); then
		echo "Trop grand"
            elif (($nb < $try)); then
		echo "trop petit"
            fi
            c=$[$c + 1]
	elif [[ $nb != "quit" ]]; then
            echo "Veuillez entrer un nombre positif"
	fi
    done
    if [[ $c == $coups ]] && [[ $nb != "quit" ]]; then
	echo "Vous avez trouvé le nombre en $c try"
	echo "Le bot a trouvé le nombre en $coups try"
echo -e "
             \e[1mégalité\e[0m
"
    elif [[ $c -lt $coups ]] && [[ $nb != "quit" ]]; then
	echo "Vous avez trouvé le nombre en $c try"
	echo "Le bot a trouvé le nombre en $coups try"
	echo -e "
   \e[1mVous avez gagné\e[0m
"
    elif [[ $c -gt $coups ]] && [[ $nb != "quit" ]]; then
	echo "Vous avez trouvé le nombre en $c try"
	echo "Le bot a trouvé le nombre en $coups try" 
	echo -e "
   \e[1mVous avez perdu\e[0m
"
    fi
    if [[ $nb != "quit" ]]; then
        replay
    fi
}