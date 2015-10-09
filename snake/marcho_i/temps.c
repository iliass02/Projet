/*
** temps.c for  in /home/debian/Snake/marcho_i
** 
** Made by MARCHOUD Iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Sun Apr 12 12:28:09 2015 MARCHOUD Iliass
** Last update Sun Apr 12 12:55:06 2015 MARCHOUD Iliass
*/

#include <stdlib.h>
#include <stdio.h>
#include <SDL/SDL.h>
#include <SDL/SDL_image.h>
#include <SDL/SDL_ttf.h>

void temps ()
{
  int temps;
  
  temps = SDL_GetTicks() / 1000;
  fprintf(stdout, "Temps de jeu : %d s\n", temps);
}
