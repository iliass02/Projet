## 1player.sh for plusoumoins in /home/bertoc_t/PROJ/plusoumoins/include
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Wed Nov  5 09:24:54 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:34:52 2014 Bertocco Thomas-Killian
##

source ./include/replay.sh

1p()
{
    re='^[0-9]+$'
    c=0
    try=$RANDOM; try=$[ $try % ($plage + 1) ]
    echo -e "                            \e[1m\e[38;5;226mDevinez le nombre\e[0m
"
    while [[ $nb != "quit" ]] && [[ $d != 1 ]] && (( $c < 10 )); do
	res=$((9 - $c))
	echo -n ">"
	read nb
	if [[ $nb == "yoloswag" ]]; then
            echo "le nombre mystere est $try"
	elif [[ $nb =~ $re ]]; then
            if (( $nb > $plage )) || (( ${#nb} > 10 )); then
		echo "Le nombre est compris entre 0 et $plage"
            elif (($nb == $try)); then
		echo "Bravo vous avez gagner !"
		d=1
            elif (($nb > $try)); then
		echo "Trop grand"
            elif (($nb < $try)); then
		echo "trop petit"
            fi
            if [[ $d != 1 ]]; then
		echo -e "Il vous reste \e[91m$res\e[0m chance(s)"
            fi
            c=$[$c + 1]
	elif [[ $nb != "quit" ]]; then
            echo "Veuillez entrer un nombre positif"
	fi
    done
    if [[ $d != 1 ]] && [[ $nb != "quit" ]]; then
	echo -e "
       \e[1mGAME OVER\e[0m
"
    fi
    if [[ $nb != "quit" ]]; then
	replay
    fi
}