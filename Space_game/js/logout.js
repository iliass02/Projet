function logout ()
{
	var username = $('#username').val();
	var password = $('#password').val();
	$.ajax({
		url: ' POST /api/1/players/logout',
		type: 'POST',
		xhrFields: { withCredentials: true },
		data: {'username' : username, 'password' : password},
		success : function(){console.log(data)},
		error : function(){alert("Impossible de ce connecter")}
	});
}