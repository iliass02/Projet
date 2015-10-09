/*
** fonctionp2.c for  in /Users/marcho_i/Desktop/RAT-DEVC/bernad_t
** 
** Made by MARCHOUD iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Tue May 26 10:57:17 2015 MARCHOUD iliass
** Last update Tue May 26 15:58:55 2015 BERNADET Thibault
*/

#include "header.h"

void	my_putchar(char c)
{
  write(1, &c, 1);
}

void	my_putstr(char *str)
{
  int	i;

  for (i = 0; str[i] != '\0'; i++)
      my_putchar(str[i]);
}

char	*readLine()
{
  ssize_t	ret;
  char		*buff;

  if ((buff = malloc(sizeof(*buff) * (50 + 1))) == NULL)
    return (NULL);
  if ((ret = read(0, buff, 50)) > 1)
  {
	buff[ret - 1] = '\0';
    return (buff);
  }
  buff[0] = '\0';
  return (buff);
}
