/*
** action.c for action.c in /Users/bernad_t/Documents/ratrapc/bernad_t
** 
** Made by BERNADET Thibault
** Login   <bernad_t@etna-alternance.net>
** 
** Started on  Mon May 25 11:24:28 2015 BERNADET Thibault
** Last update Tue May 26 17:03:52 2015 MARCHOUD iliass
*/

#include "header.h"

int	recup(char *ingredient[16], int number[15])
{
  char	*recup;
  int	j;
  
  my_putstr("Choisir une option : ");
  recup = readLine();
  
  t_fct	tab[5] =
    {
      {'1', &option1},
      {'2', &option5},
      {'3', &option2},
      {'4', &option3},
      {'5', &option4},
    };
  
  for (j = 0; j < 6; j++)
    {
      if (*recup == tab[j].opt)
	{
	  tab[j].fct(ingredient, number);
	  return (0);
	}
    }
  recup_bis(ingredient, number);
  return (0);
}

int	recup_bis(char *ingredient[16], int number[15])
{
  char	*lect;

  my_putstr("option 1)quiter\n");
  my_putstr("option 2)revenir au menu: \n");

  lect = readLine();
  if (*lect == '1')
    return (0);
  else if (*lect == '2')
    aff(ingredient, number);
  else
    {
      system("clear");
      my_putstr("vous ne pouvez choisir que 1 ou 2\n");
      recup_bis(ingredient, number);
    }
  return (0);
}
