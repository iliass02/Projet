/*
** option1et2.c for  in /Users/marcho_i/Desktop/RAT-DEVC/bernad_t
** 
** Made by MARCHOUD iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Tue May 26 10:58:52 2015 MARCHOUD iliass
** Last update Tue May 26 17:05:04 2015 MARCHOUD iliass
*/

#include "header.h"

int 	option1(char *ingredient[16], int number[15])
{
  int   i;

  system("clear");
  for (i = 0; i <= 15; ++i)
    {
      my_putstr("\n");
      my_putstr(ingredient[i]);
      my_putstr(" : ");
      my_put_nbr(number[i]);
    }
  my_putstr("\n\n");
  recup_bis(ingredient, number);
  return (0);
}

int 	option2(char *ingredient[16], int number[15])
{
  char	*ingre;
  char 	*numb;

  my_putstr("Entrer un ingrédient : ");
  ingre = readLine();
  for (int i = 0; i < 16; i++)
    {
      if (my_strcmp(ingre, ingredient[i]) == 0)
	{
	  my_putstr("\nEntrer le nombre d'ingrédient que vous voulez rajouter : ");
	  numb = readLine();
	  number[i] = number[i] + atoi(numb);
	  i = 17;
	  recup_bis(ingredient, number);
	}
    }
  my_putstr("KO : cet ingredient n'est pas valide\n");
  return (0);
}
