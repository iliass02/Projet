<?php
// my_help.php for  in /home/marcho_i/projects/MicroShell/marcho_i/include
// 
// Made by MARCHOUD Iliass
// Login   <marcho_i@etna-alternance.net>
// 
// Started on  Sat Oct 18 10:49:57 2014 MARCHOUD Iliass
// Last update Sat Oct 18 13:09:21 2014 MARCHOUD Iliass
//

function my_help()
{
  echo "echo : Affiche les arguments sur la sortie standard, puis termine par un retour à la ligne.\n\n";
  echo "pwd : Affiche le chemin courant.\n\n";
  echo "cd : Permet de naviguer dans le système de fichier.\n\n";
  echo "ls : Affiche le contenu du répertoire spécifié en argument, ou du répertoire courant si aucun argument n'est fourni\n\n";
  echo "cat : Affiche sur la sortie standard le contenu de chacun des fichiers indiqués\n\n";
  echo "env : Affiche toutes les variables d'environnement.\n\n";
  echo "setenv : Change ou ajoute une variable d'environnement. Prend 2 arguments, le nom de la variable d'environnement, et la valeur de celle-ci.\n\n";
  echo "unsetenv : Efface une variable d'environnement. Prend un argument, le nom de la variable à effacer. Si le nom de la variable est incorrect, rien n'est modifié.\n";
}