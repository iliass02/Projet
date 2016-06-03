/*
** fonctions.c for  in /home/marchoud/etna/projet/Octocat/marcho_i
** 
** Made by MARCHOUD Iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Fri Nov 14 18:10:59 2014 MARCHOUD Iliass
** Last update Fri Nov 14 18:13:20 2014 MARCHOUD Iliass
*/

#include <stdio.h>
#include <stdlib.h>

char    *readLine();
int	i;
int	j;
void	mode();

void	rules()
{
  my_putstr("\nPour vous deplacer :\n-d : droite\n-a : gauche\n-w : haut\n-s : bas\n-q : quitter\n\n");
  sleep(2);
  system("clear");
}

void	a(char *map, char user)
{
  if (user == 'a')
    {
      if (map[i-1] != '\0' && map[i-1] != '#')
	{
	  if (map[i-1] == '>')
	    {
	      my_putstr ("You WON!!\n");
	      mode();
	    }
	  map[i] = ' ';
	  i--;
	  map[i] = 56;
	}
      else
	{
	  my_putstr("Ce jeu n'est pas un casse brique!\n");
	  mode();	      
	}
    }
}

void	d(char *map, char user)
{
  if (user == 'd')
    {
      if (map[i+1] != '\0' && map[i+1] != '#')
	{
	  if (map[i+1] == '>')
	    {
	      my_putstr ("You WON!!\n");
	      mode();
	    }
	  map[i] = ' ';
	  i++;
	  map[i] = 56;
	}
      else
	{
	  my_putstr("Ce jeu n'est pas un casse brique!\n");
	  mode();	      
	}
    }
}
void	w(char *map, char user)
{
  if (user == 'w')
    {
      if (map[i-26] != '\0' && map[i-26] != '#')
	{
	  if (map[i-26] == '>')
	    {
	      my_putstr ("You WON!!\n");
	      mode();
	    }
	  map[i] = ' ';
	  i = i-26;
	  map[i] = 56;
	}
      else
	{     
	  my_putstr("Ce jeu n'est pas un casse brique!\n");
	  mode();	      
	}
    }
}

void	s(char *map, char user)
{
  if (user == 's')
    {
      if (map[i+26] != '\0' && map[i+26] != '#')
	{
	  if (map[i+26] == '>')
	    {
	      my_putstr ("You WON!!\n");
	      mode();
	    }
	  map[i] = ' ';
	  i = i+26;
	  map[i] = 56;
	}
      else
	{
	  my_putstr("Ce jeu n'est pas un casse brique!\n");
	  mode();	      
	}
    }
}
