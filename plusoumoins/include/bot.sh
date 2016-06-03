## test.sh for test in /home/bertoc_t/PROJ/plusoumoins
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Wed Nov  5 10:18:40 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:32:37 2014 Bertocco Thomas-Killian
##

source ./include/vsb.sh

bot()
{
    echo -e "                          \e[1mC'est le tour du bot\e[0m
"
    try=$RANDOM; try=$[ $try % ($plage + 1) ]
    my_array=( $( seq 0 $plage ) )
    a=0
    r=0
    coups=0
    size=${#my_array[@]}
    z=${#my_array[@]}
    while (( $size > 1 )) && (( $r != 1 )) && (( ($z - $a) >= 1 ))
    do
	mid=$[ ($a + $z) / 2]
	echo $mid
	coups=$[ $coups + 1 ]
	if [[ ${my_array[$mid]} == $try ]]; then
	    r=1
	    echo "Le bot a trouvé le nombre en $coups try"
	else
	    if [[ ${my_array[$mid]} -gt $try ]]; then
		z=$mid
		echo "Trop grand"
	    elif [[ ${my_array[$mid]} -lt $try ]]; then
		a=$mid
		echo "Trop petit"
	    fi
	fi
	size=${#my_array[@]}
	sleep 1
    done
    sleep 3
    clear
    vsb
}