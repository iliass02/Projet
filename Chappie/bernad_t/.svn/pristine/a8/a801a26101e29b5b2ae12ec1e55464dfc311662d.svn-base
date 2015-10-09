/*
** fonctionp.c for fomctionp.c in /Users/bernad_t/Documents/ratrapc/bernad_t
** 
** Made by BERNADET Thibault
** Login   <bernad_t@etna-alternance.net>
** 
** Started on  Mon May 25 10:07:39 2015 BERNADET Thibault
** Last update Tue May 26 15:57:30 2015 BERNADET Thibault
*/

#include "header.h"

void	my_put_nbr(int n)
{
  int	x;

  x = 1;
  if (n == -2147483647)
    write(1, "-2147483647", 11);
  else
  {
    if (n == 2147483647)
      write(1, "2147483647", 10);
    if (n < 0)
    {
      my_putchar('-');
      n = - n;
    }
    while (n / x >= 10)
      x = x * 10;
    while (x > 0)
    {
      my_putchar((n / x) % 10 + 48);
      x = x / 10;
    }
  }
}

int	my_strcmp(char *s1, char *s2)
{
  int	i;
  int	j;
  int	ret;

  i = 0;
  j = 0;
  ret = 0;
  while ((s1[i] != '\0') || (s2[i] != '\0'))
  {
    j = s1[i] - s2[i];
    if (j < 0)
    {
      ret = -1;
      return (ret);
    }
    else if (j > 0)
    {
      ret = 1;
      return (ret);
    }
    else if (j == 0)
      ret = 0;
    i++;
  }
  return (ret);
}
