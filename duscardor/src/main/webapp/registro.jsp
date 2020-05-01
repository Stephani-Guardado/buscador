<!DOCTYPE html>
<html>
<head>
	<title>Registrar</title>
	<meta charset="utf-8">	
	<link rel="shortcut icon" href="Proyecto/imagenes/escuela.jpg">
	<link rel="stylesheet" type="text/css" href="diceñoR.css">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body background="f.jpg">
	<div class="container2">
		<img src="inicio.png">
<h1> Registro </h1>
<form action="ControladorR" method="post">
	<div class="form-input">
			<div>
		<input type="text" name="Nombre" placeholder="Nombre">
	</div>
	<div>
		<input type="text" name="apellido" placeholder="Apellidos">
	</div>
		<input type="text" name="Usuario" placeholder="Registrar un Usuario">
	</div>
	<div class="form-input">
	<input type="password" name="contraseña" placeholder="Ingrese contraseña"></div>
	<div class="form-input">
	<input type="text" name="dui" placeholder="Ingrese un dui"></div>
<div align="center">
<input align="center" type="submit" name="btn" value="Guardar" class="btn btn-info">
</div>
</form>
	</div>

</body>
</html>