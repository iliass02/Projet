#!/bin/bash
## plusoumoins.sh for plusoumoins in /home/bertoc_t/PROJ/plusoumoins
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Mon Nov  3 10:37:34 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:41:42 2014 Bertocco Thomas-Killian
##

source ./include/dif.sh
source ./include/1player.sh
source ./include/multiplayer.sh
source ./include/aide.sh
source ./include/bot.sh

menu()
{
    re='^[0-9]+$'
    x=0
    d=0
    echo -e "
     (づ｡◕‿‿◕｡)づ  \e[1m\e[38;5;17mBienvenue dans le jeu du plus ou moins\e[0m ☜(ﾟヮﾟ☜)
"
    echo "
                     Commandes disponibles : help, quit."
    echo -e "
                        __________________________
                       |\e[48;5;8m \e[1mChoisissez la difficulté \e[0m|
                       |\e[48;5;0m--------------------------\e[0m|
                       |\e[48;5;9m      \e[1ma\e[21m - Facile          \e[0m|
                       |\e[48;5;1m      \e[1mb\e[21m - Normal          \e[0m|
                       |\e[48;5;88m      \e[1mc\e[21m - Difficile       \e[0m|
                       |\e[48;5;52m      \e[1mz\e[21m - Lunatic         \e[0m|
                       |\e[48;5;0m__________________________\e[0m|
"
    while [[ $d -ne 1 ]] && [[ $nb != "quit" ]]; do
	echo -n ">"
	read nb
	if [[ $nb == "help" ]]; then
	    aide
	fi
	if [[ $nb == "a" ]] || [[ $nb == "b" ]] || [[ $nb == "c" ]] || [[ $nb == "z" ]]; then
	    dif $nb
	    x=1
	elif [[ $x == 0 ]] && [[ $nb != "quit" ]]; then
	    echo "Veuillez choisir un niveau de difficulté"
	fi
	if [[ $x == 1 ]] && [[ $nb =~ $re ]]; then
	    if [[ $nb == 0 ]]; then
		bot
		d=1
	    elif [[ $nb == 1 ]]; then
		1p
		d=1
	    elif [[ $nb > 1 ]]; then
		mp $nb
		d=1
	    fi
	elif [[ $x == 1 ]]; then
	    echo -e "
   ┗(-_-)┛┏(-_-)┓\e[1m[ Veuillez entrer le nombre de joueurs ou entrer 0 pour jouer contre un bot]\e[0m┏(-_-)┛┗(-_-﻿ )┓
"
	fi
    done
}
menu