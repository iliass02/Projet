## multiplayer.sh for plusoumoins in /home/bertoc_t/PROJ/plusoumoins/include
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Wed Nov  5 09:25:57 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:35:05 2014 Bertocco Thomas-Killian
##

source ./include/replay.sh

mp()
{
    re='^[0-9]+$'
    c=1
    d=1
    try=$RANDOM; try=$[ $try % ($plage + 1) ]
    echo -e "                            \e[1m\e[38;5;226mDevinez le nombre\e[0m
"
    echo -e "C'est au tour du joueur \e[91m$d\e[0m"
    while [[ $nb != "quit" ]] && [[ $d -ne $1+1 ]]; do
        echo -n ">"
        read nb
        if [[ $nb == "yoloswag" ]]; then
            echo "le nombre mystere est $try"
        elif [[ $nb =~ $re ]]; then
            if (( $nb > $plage )) || (( ${#nb} > 10 )); then
                echo "Le nombre mystere est compris entre 0 et $plage"
            elif (($nb == $try)); then
                echo -e "Le joueur \e[91m$d\e[0m a trouve le nombre en \e[33m$c\e[0m try"
                if [[ -n "$m" ]] && [[ $c == $m ]]; then
                    draw=1
                fi
                if [[ ! -n "$m" ]] || [[ $m > $c ]]; then
                    m=$c
                    x=$d
                fi
                c=0
                d=$[$d + 1]
                if (($d <= $1)); then
                    echo -e "C'est au tour du joueur \e[91m$d\e[0m"
		    sleep 3
		    clear
                fi
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
    if [[ $draw == 1 ]]; then
        echo "égalité"
    elif [[ $nb != "quit" ]]; then
        echo -e "Le joueur \e[91m$x\e[0m a gagné"
    fi
    if [[ $nb != "quit" ]]; then
        replay
    fi
}