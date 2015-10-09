##
## Makefile for  in /Users/marcho_i/Desktop/RAT-DEVC/bernad_t
## 
## Made by MARCHOUD iliass
## Login   <marcho_i@etna-alternance.net>
## 
## Started on  Tue May 26 10:55:35 2015 MARCHOUD iliass
## Last update Tue May 26 10:55:41 2015 MARCHOUD iliass
##

CC =		gcc

NAME	=	chappie

CFLAGS =	-W -Wall -Werror 

SRC	=	action.c		\
		fonctionp.c		\
		fonctionp2.c 	\
		interface.c		\
		option1et2.c 	\
		option3et4.c 	\
		option5.c 		\
		main.c
OBJ	=	$(SRC:%.c=%.o)

RM	=	rm -f

$(NAME):	$(OBJ)
		$(CC) $(CFLAGS) -o $(NAME) $(OBJ)

all:		$(NAME)


clean:		
		$(RM) $(OBJ)

fclean:		clean
		$(RM) $(NAME)

re:		fclean all