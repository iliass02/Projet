/*
** my_strlen.c for   in /home/boehm_e/Jour03C/my_strlen
** 
** Made by BOEHM ERWAN
** Login   <boehm_e@etna-alternance.net>
** 
** Started on  Wed Oct  1 09:28:52 2014 BOEHM ERWAN
** Last update Fri Nov 14 18:14:45 2014 MARCHOUD Iliass
*/

int	my_strlen(char *str)
{
  int	i;

  i = 0;

  while (str[i] != '\0')
    {
      ++i;
    }
  return i;
}
