/*
** option5.c for  in /Users/marcho_i/Desktop/RAT-DEVC/bernad_t
** 
** Made by MARCHOUD iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Tue May 26 10:59:40 2015 MARCHOUD iliass
** Last update Tue May 26 17:05:51 2015 MARCHOUD iliass
*/

#include "header.h"

int 	option5(char *ingredient[16], int number[16])
{
  system("clear");
  my_putstr("\n\n|============================|\n");
  my_putstr("|    INTERFACE DE CUISINE    |\n");
  my_putstr("|============================|\n\n");
  my_putstr("Recettes :\n\n");
  my_putstr(ingredient[10]);
  my_put_nbr(number[10]);
  my_putstr("\n\n");
  recup_bis(ingredient, number);
  return (0);
}
