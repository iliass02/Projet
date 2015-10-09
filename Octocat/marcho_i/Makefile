##
## Makefile for  in /home/boehm_e/Libmy/libmy_01
## 
## Made by BOEHM ERWAN
## Login   <boehm_e@etna-alternance.net>
## 
## Started on  Sat Oct  4 20:33:17 2014 BOEHM ERWAN
## Last update Fri Nov 14 18:13:43 2014 MARCHOUD Iliass
##
CC =		gcc

NAME	=	octocat

SRC	=	octocat.c	\
		fonctions.c	\
		autocomplet.c	\
		my_putchar.c	\
		readline.c	\
		my_putstr.c	\
		my_strncmp.c	
OBJ	=	$(SRC:%.c=%.o)

RM	=	rm -f

$(NAME):	$(OBJ)
		$(CC) -o $(NAME) $(OBJ)

all:		$(NAME)


clean:		
		$(RM) $(OBJ)

fclean:		clean
		$(RM) $(NAME)

re:		fclean all
