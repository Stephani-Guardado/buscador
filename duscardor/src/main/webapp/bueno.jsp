<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="busquedaD.css">
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
	<title>Gobierno De El Salvador</title>
</head>
<body>
	<div class="container">
<h1 class="text-center mt-5"> <p style="color:#A61010">Consulta quien de tu familia es el beneficiario del apoyo
<br> economico para alimentacion en la emergencia</p></h1>
<h1 class="text-center mt-1"><span class="badge badge-success">COVID-19</span></h1>
 <div class="input-group mb-3">
<input type="text" name="DUI" id="dui" placeholder="Ingresa tu número de DUI" class="form-control light-grey" style="background-color: #f2f2f2;">
<div>
<input type="submit" value="buscar" id="btn" align="center" class="btn btn-info">
</div>
 </div>
</div>
<script type="text/javascript" 
src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(document).ready(function () {
		$("#btn").click(function(){
			var CAJA = $("#dui").val();
			$.post('ControladorBus',{
				CAJA
			}, function(respose) {
				let datos = JSON.parse(respose);
				console.log(datos);
			var MODIFICAR = document.getElementById('nombre_usuario');
			MODIFICAR.innerHTML = "LO SIENTO";
			for (let item of datos) {
				MODIFICAR.innerHTML = item.nombre_usuario+" Eres beneficiario";
			}
			});
		});
	});
</script>
<br>
<h2 id="nombre_usuario" align="center"
style="color: red"></h2>

<div class="col">
                        <p style="color:blue" align="center">El apoyo economico brindado por el Gobierno de El Salvador está dirigido a personas afectadas por la pandemia del COVID-19. Dicho beneficio corresponde a $300 por vivienda.</p>
                    </div>
    
         <div class="col text-right">
                        <p align="center">
                        	<a href="registro.jsp" style="color: red"><i class="fas fa-clipboard"></i>Regitrarse</a><br>
                            <a target="_blank" href="https://presidencia.gob.sv/contactenos"><i class="fas fa-address-book"></i>Contactanos/</a>
                            <a target="_blank" href="https://www.facebook.com/PresidenciaSV"><i class="fab fa-facebook"></i>Facebook/</a>
                            <a target="_blank" href="https://twitter.com/presidenciasv"><i class="fab fa-twitter-square"></i>Twitter/</a>
                            <a target="_blank" href="https://www.instagram.com/presidenciasv/"><i class="fab fa-instagram-square"></i>Instagram</a>
                        </p>
                   </div>  
</body>
</html>