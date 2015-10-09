/*
** main.c for  in /Users/marcho_i/Desktop/RAT-DEVC/bernad_t
** 
** Made by MARCHOUD iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Mon May 25 09:22:17 2015 MARCHOUD iliass
** Last update Tue May 26 17:04:47 2015 MARCHOUD iliass
*/

#include "header.h"

int	rand_number (char *ingredient[16])
{
  int	number[15];
  int 	i;

  for (i = 0; i <= 15; ++i)
      number[i] = rand() % 11;
  aff(ingredient, number);
  return (0);
}

void	tab_ingredient()
{
  char 	*ingredient[16];

  ingredient[0] = "pates";
  ingredient[1] = "fromage";
  ingredient[2] = "creme_fraiche";
  ingredient[3] = "tomates";
  ingredient[4] = "huile";
  ingredient[5] = "tomates";
  ingredient[6] = "olive";
  ingredient[7] = "oeuf";
  ingredient[8] = "farine";
  ingredient[9] = "sucre";
  ingredient[10] = "chocolat";
  ingredient[11] = "beurre";
  ingredient[12] = "fraise";
  ingredient[13] = "chantilly";
  ingredient[14] = "pates_feuilletee";
  ingredient[15] = "fromage";
  rand_number(ingredient);
}

int	main()
{
  tab_ingredient();
  return (0);
}
