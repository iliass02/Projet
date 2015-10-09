/*
** option3et4.c for  in /Users/marcho_i/Desktop/RAT-DEVC/bernad_t
** 
** Made by MARCHOUD iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Tue May 26 10:59:18 2015 MARCHOUD iliass
** Last update Tue May 26 17:05:40 2015 MARCHOUD iliass
*/

#include "header.h"

int 	option3(char *ingredient[16], int number[15])
{
  char 	*ingre;
  char 	*numb;

  my_putstr("Entrer un ingrédient : ");
  ingre = readLine();
  for (int i = 0; i < 16; i++)
    {
      if (my_strcmp(ingre, ingredient[i]) == 0)
	{
	  my_putstr("\nEntrer le nombre d'ingrédient que vous voulez supprimer : ");
	  numb = readLine();
	  number[i] = number[i] - atoi(numb);
	  if (number[i] < 0)
	    number[i] = 0;
	  i = 17;
	  recup_bis(ingredient, number);
	}
    }
  my_putstr("KO : cet ingredient n'est pas valide\n");
  return (0);
}

int 	option4()
{
  my_putstr("Vous quittez le programme ! \n\n");
  return (0);
}
