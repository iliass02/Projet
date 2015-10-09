## replay.sh for plusoumoins in /home/bertoc_t/PROJ/YOLO/include
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Wed Nov  5 17:04:31 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:39:17 2014 Bertocco Thomas-Killian
##

replay()
{
    y=0
    while [[ $nb != "quit" ]] && [[ $y != 1 ]]; do
	echo "Voulez vous rejouer?
[0] NON
[1] OUI
"
	read nb
	if [[ $nb == 1 ]]; then
	    y=1
	    menu
	elif [[ $nb == 0 ]]; then
	    echo "┌∩┐(◣_◢)┌∩┐ Bye ┌∩┐(◣_◢)┌∩┐
"
	    y=1
	elif [[ $nb != 0 ]] && [[ $nb != 1 ]] && [[ $nb != "quit" ]]; then
	    echo "Veuillez choisir 0 ou 1
"
	fi
    done
}