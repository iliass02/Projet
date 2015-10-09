<?php
	session_start();
$json = file_get_contents("users.json");
$parsed_json = json_decode($json);
echo '<br>';
$i = 0;
$j = 0;

//var_dump($parsed_json);
//echo $parsed_json[0][0]->email;

echo "<center>Users list</center>";

while (isset($parsed_json[$i]))
{
			echo "email : ";
			echo $parsed_json[$i][0]->email;
			echo "<br>";
			echo "login : ";
			echo $parsed_json[$i][0]->login;
			echo "<br>";
			echo "-------------------------------------------";
			echo "<br>";
			$i++;
}

/*while (isset($parsed_json[$i]))
  {
	  while (isset($parsed_json[$i][$j]))
	  {
		echo $parsed_json[$i][$j]->email;
		$j++;
		i++;
	  }
	  
  }*/
    /*echo '<br>';
    if ($login == $parsed_json[$i][0]->email)
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
	    header('Location : admin.php');
    }
  
elseif ($j == 0)
  {
	echo "erreur de saisie";
  }*/
	