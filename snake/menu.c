/*
** menu.c for  in /home/debian/Snake/marcho_i
** 
** Made by MARCHOUD Iliass
** Login   <marcho_i@etna-alternance.net>
** 
** Started on  Sun Apr 12 12:20:51 2015 MARCHOUD Iliass
** Last update Sun Apr 12 12:24:50 2015 MARCHOUD Iliass
*/

#include <stdio.h>
#include <stdlib.h>
#include <SDL/SDL.h>
#include <SDL/SDL_image.h>
#include <SDL/SDL_ttf.h>

void menu(SDL_Surface *fenetre)
{
  SDL_Surface *menu;
  SDL_Rect menuPosition;
  
  menuPosition.x = 0;
  menuPosition.y = 0;
  menu = IMG_Load("menu.png");
  SDL_BlitSurface(menu, NULL, fenetre, &menuPosition);
  SDL_FreeSurface(menu);
  SDL_Flip(fenetre);
}
