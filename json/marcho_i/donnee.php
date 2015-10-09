<?php
require_once('lib_json.php');

$email = $_POST['email'];
include_file($email, "users.json");

if (isset($_POST['number']))
{
    $_POST['number'] = htmlspecialchars($_POST['number']);

    if (preg_match("#^0[1-68]([-. ]?[0-9]{2}){4}$#", $_POST['number']))
    {
        echo 'Le ' . $_POST['number'] . ' ce num&eacute;ro est invalide !';
    }
    else
    {
	    echo "Inscription reussie";
    }
}
echo "Inscription reussie";
echo "<a href = 'connexion.php'><button>Connexion</button></a>";



?>
