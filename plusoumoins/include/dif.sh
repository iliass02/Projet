## dif.sh for plusoumoins in /home/bertoc_t/PROJ/plusoumoins/include
## 
## Made by Bertocco Thomas-Killian
## Login   <bertoc_t@etna-alternance.net>
## 
## Started on  Wed Nov  5 09:25:42 2014 Bertocco Thomas-Killian
## Last update Wed Nov  5 17:34:25 2014 Bertocco Thomas-Killian
##

dif()
{
if [[ $nb == "a" ]]; then
plage=250
elif [[ $nb == "b" ]]; then
plage=500
elif [[ $nb == "c" ]]; then
plage=1000
elif [[ $nb == "z" ]]; then
plage=10000
fi
}