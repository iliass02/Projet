<?php

	session_start();
$json = file_get_contents("users.json");
$parsed_json = json_decode($json);
echo '<br>';
$i = 0;
$j = 0;

if (isset($_POST['telephone']))
{
    $_POST['number'] = htmlspecialchars($_POST['telephone']); // On rend inoffensives les balises HTML que le visiteur a pu entrer

    if (preg_match("#^0[1-68]([-. ]?[0-9]{2}){4}$#", $_POST['number']))
    {
        echo 'Le ' . $_POST['telephone'] . ' est un numéro <strong>valide</strong> !';
    }
    else
    {
        echo 'Le ' . $_POST['telephone'] . ' n\'est pas valide, recommencez !';
    }
}





while (isset($parsed_json[$i]))
  {
    echo '<br>';
    $login = $_GET['email'];
    $pwd = $_GET['pwd'];
    if ($login == $parsed_json[$i][0]->email || $login == $parsed_json[$i][0]->login)
    {
       	if ($parsed_json[$i][0]->pwd == $pwd)
        {
	    	$j = 1;
		    $_SESSION['email'] = $login;
			echo "Connexion Etablie";
		}
    }
    $i++;
  }
  
  if($login == "admin" && $pwd == "admin" )
    {
	    	$j = 1;
	    echo "Bonjour patron";
		echo "<a href = 'admin.php'><button>Interface admin</button></a>";
    }
  
elseif ($j == 0)
  {
	echo "erreur de saisie";
  }
	
	
?>