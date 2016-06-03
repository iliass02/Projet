

function connexion ()
{
	var username = $('#username').val();
	var password = $('#password').val();
	$.ajax({
		url: "http://163.5.245.219:3000/api/1/players/login",
		type: "POST",
		data: {username: username, password: password},
		xhrFields: { withCredentials:true },
		username: "bernad_t@etna-alternance.net",
		password: "Mv93jATr",

		success : function() {
			console.log("connexion etablie")
		},
		error : function(data) {
			console.log("echec de la connexion", data)
		}
	});
	
	$('body>header>fieldset').remove();
	$('#first').remove();
}

setInterval(function()
{
	$.ajax
	({
  		url: 'http://163.5.245.219:3000/api/1/crystalmines',
  		type: 'GET',
  		xhrFields: { withCredentials: true },
  		username: "bernad_t@etna-alternance.net",
  		password: "Mv93jATr",
  		success:function(data)
  		{
			$($('p', '#m1')[0]).text("nvM: " + data.level);
			$($('p', '#m1')[1]).text("prod/min: "+data.production);
			$($('p', '#m1')[2]).text("Ressources: "+data.amount);
		},
  		error: function()
  		{
			console.log('error in crystal mine');
  		}
	});
}, 
2000
);

setInterval(function()
{
	$.ajax
	({
  		url: 'http://163.5.245.219:3000/api/1/metalmines',
  		type: 'GET',
  		xhrFields: { withCredentials: true },
  		username: "bernad_t@etna-alternance.net",
  		password: "Mv93jATr",
  		success:function(data)
  		{
			$($('p', '#m2')[0]).text("nvM: " + data.level);
			$($('p', '#m2')[1]).text("prod/min: "+data.production);
			$($('p', '#m2')[2]).text("Ressources: "+data.amount);
		},
  		error: function()
  		{
			console.log('error in metals ');
  		}
	});
}, 
2000
);
setInterval(function()

{
	$.ajax
	({
  		url: 'http://163.5.245.219:3000/api/1/factorys',
  		type: 'GET',
  		xhrFields: { withCredentials: true },
  		username: "bernad_t@etna-alternance.net",
  		password: "Mv93jATr",
  		success:function(data)
  		{
			$($('p', '#fact')[0]).text("nvM: " + data.level);
			$($('p', '#fact')[1]).text("prod/min: "+data.production);
		},
  		error: function()
  		{
			console.log('error in fact');
  		}
	});
}, 
2000
);

setInterval(function()
{
	$.ajax
	({
  		url: 'http://163.5.245.219:3000/api/1/metalmines/levelUp ',
  		type: 'PUT',
  		xhrFields: { withCredentials: true },
  		username: "bernad_t@etna-alternance.net",
  		password: "Mv93jATr",
  		success:function(data)
  		{
			$($('p', '#m1')[0]).text("nvM: " + data.level);
			$($('p', '#m1')[1]).text("prod/min: "+data.production);
		},
  		error: function()
  		{
			console.log('error metalmines');
  		}
	});
}, 
2000
);

setInterval(function()
{
	$.ajax
	({
  		url: 'http://163.5.245.219:3000/api/1/crystalmines/levelUp',
  		type: 'PUT',
  		xhrFields: { withCredentials: true },
  		username: "bernad_t@etna-alternance.net",
  		password: "Mv93jATr",
  		success:function(data)
  		{
			$($('p', '#m2')[0]).text("nvM: " + data.level);
			$($('p', '#m2')[1]).text("prod/min: "+data.production);
		},
  		error: function()
  		{
			console.log('error in crystal mine');
  		}
	});
}, 
2000
);


setInterval(function()
{
	$.ajax
	({
  		url: 'http://163.5.245.219:3000/api/1/factorys/add_droid',
  		type: 'PUT',
  		xhrFields: { withCredentials: true },
  		username: "bernad_t@etna-alternance.net",
  		password: "Mv93jATr",
  		success:function(data)
  		{
			$($('p', '#fact')[0]).text("nvM: " + data.level);
			$($('p', '#fact')[1]).text("prod/min: "+data.production);
		},
  		error: function()
  		{
			console.log('error in fact');
  		}
	});
}, 
2000
);



