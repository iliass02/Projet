/*
** main.c for  in /home/debian/Snake/marcho_i
** 
** Made by MARCHOUD Iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Sat Apr 11 14:41:34 2015 MARCHOUD Iliass
** Last update Sun Apr 12 12:54:16 2015 MARCHOUD Iliass
*/

#include <stdlib.h>
#include <stdio.h>
#include <SDL/SDL.h>
#include <SDL/SDL_image.h>
#include "const.h"

int main()
{
  SDL_Surface *fenetre;
  SDL_Surface *bonus;
  SDL_Surface *snake;
  SDL_Rect snakePosition;
  SDL_Rect bonusPosition;

  SDL_Init(SDL_INIT_VIDEO);
  SDL_WM_SetCaption("Mon Super SNAKE !", NULL);
  fenetre = SDL_SetVideoMode(500,500,32,SDL_HWSURFACE);
  bonus = SDL_CreateRGBSurface(SDL_HWSURFACE, 20, 20, 32, 0, 0, 0, 0);
  snake = IMG_Load("point.png");
  snakePosition.x=10;
  snakePosition.y=10;
  bonusPosition.x = 100;
  bonusPosition.y = 100;
  menu(fenetre);
  move_snake(snakePosition, bonusPosition, fenetre, snake, bonus); 
  temps();
  SDL_FreeSurface(fenetre);
  SDL_FreeSurface(snake);
  SDL_Quit();
  return 0;
}
