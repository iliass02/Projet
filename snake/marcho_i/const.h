/*
** const.h for  in /home/debian/Snake/marcho_i
** 
** Made by MARCHOUD Iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Sat Apr 11 14:43:41 2015 MARCHOUD Iliass
** Last update Sun Apr 12 13:53:54 2015 MARCHOUD Iliass
*/

#include "SDL/SDL.h"
#include <stdio.h>
#include <stdlib.h>

#ifndef _CONST_
# define _CONST_

void move_snake (SDL_Rect snakePosition, SDL_Rect bonusPosition, SDL_Surface *fenetre, SDL_Surface *snake, SDL_Surface *bonus);
void menu (SDL_Surface *fenetre);
void temps (); 
int random_bonus(SDL_Rect snakePosition, SDL_Rect bonusPosition, SDL_Surface *snake);

#endif
