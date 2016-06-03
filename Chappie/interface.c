/*
** interface.c for interface.c in /Users/bernad_t/Documents/ratrapc/bernad_t
** 
** Made by BERNADET Thibault
** Login   <bernad_t@etna-alternance.net>
** 
** Started on  Mon May 25 09:27:41 2015 BERNADET Thibault
** Last update Tue May 26 16:01:34 2015 BERNADET Thibault
*/

#include "header.h"

void	aff(char *ingredient[16], int number[15])
{
  system("clear");
  my_putstr("Binvenue dans l'interace de chappie\n\n");
  my_putstr("1) Voir le stock\n");
  my_putstr("2) Cuisiner\n");
  my_putstr("3) Augmenter la quantité d'un ingrédient\n");
  my_putstr("4) Diminuer la quantité d'un ingrédient\n");
  my_putstr("5) Quitter\n\n");
  recup(ingredient, number);
}
