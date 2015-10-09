/*
** header.h for  in /Users/bernad_t/Documents/ratrapc/bernad_t
** 
** Made by BERNADET Thibault
** Login   <bernad_t@etna-alternance.net>
** 
** Started on  Mon May 25 10:10:33 2015 BERNADET Thibault
** Last update Tue May 26 16:18:36 2015 MARCHOUD iliass
*/

#include <stdlib.h>
#include <unistd.h>

#ifndef __HEADER_H__
# define __HEADER_H__

int	rand_number (char *ingredient[16]);
void	my_putchar(char c);
void	my_putstr(char *str);
void	my_put_nbr(int nb);
int 	my_strcmp(char *s1, char *s2);
void	tab_aff();
char	*readLine();
void 	aff();
int	action();
int 	option1(char *ingredient[16], int number[15]);
int 	recup(char *ingredient[16], int number[15]);
int 	option2(char *ingredient[16], int number[15]);
int 	option3(char *ingredient[16], int number[15]);
int 	option4();
int 	option5(char *ingredient[16], int number[16]);
int	recup_bis(char *ingredient[16], int number[15]);

typedef struct	s_fct
{
  int opt;
  int    (*fct)(char *ingredient[16], int number[16]);
}       t_fct;

struct list {
  char *string;
  struct list *next;
};

#endif
