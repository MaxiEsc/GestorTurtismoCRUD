<%-- 
    Document   : ayuda
    Created on : 13/12/2021, 18:00:57
    Author     : Max Esc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Agencias de viajes</title>
<link rel="stylesheet" href="css/estilos.css">

 <!--Implementamos booststrap 5 para un menu desplegable--> <!-- Necesario para el menu desplegable -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <link rel="stylesheet" href="css/style.css">
 <!-- Fin de archivos necesarios para Bootstrap 5 -->


</head>
<body>
	<div class="container">
		
   	<main class="container">
		<h1 class="container">Agencias de viajes</h1>
    </main>
   		<header class="container-fluid">
   			
   			<nav class="container-fluid bg-warning" >
   				<ul>
					<li> <a href="ingresarUsuario.jsp" class="btn btn-warning">Ingresar</a></li>
					<li> <a href="ayuda.jsp" class="btn btn-warning">Ayuda</a></li>
					<li> <a href="index.jsp" class="btn btn-warning">Inicio</a></li>
					<li> <a href="acercaDe.jsp" class="btn btn-warning">Acerca de nosostros</a></li>					
   				</ul>
   			</nav>
   		</header>	   

  <section> 

	<div class="container bg-dark text-white"> 
		<h1>Consejos de ayuda</h1>
	</div>

    <div class="container">
        <h3>¿Como usar la pagina?</h3>

		<p>Debera ingresar como un empleado a la plataforma para realizar todo tipo de operaciones de estructura con el sistema impuesto </p>

        <h3>¿Como registrarse?</h3>

		<p>Debera solicitar ayuda del personal autoriazdo para que se le cree un usuario como empleado para acceder a la plataforma </p>

        <h3>¿Como ingresar?</h3>

		<p>Debera ingresar a la pestaña ingresar para comenzar el la pagina web </p>

        <h3>¿Como ver Clientes?</h3>

		<p>Debera tener cuenta como trabajador dependiente de la empresa para realizar la carga y ventas de clientes en el servicio </p>

        <h3>¿Como ver las Empleado?</h3>

		<p>Debera ingresar como un empleado a la plataforma para realizar las operaciones de gestion de los empleados</p>

        <h3>¿Como cargar Ventas?</h3>

		<p>Debera ingresar como un empleado registrado en la plataforma para realizar cargas de ventas en el servicio </p>

    </div>

	
</section>
<aside> 
	<p>Registrese y obtenga todas las posibilidades </p>
  	<div><img src="img/viaje4.jpg" width="100" height="120" class="img-fluid"></div>
  	<p>Accedera a los mejores precios, mejores ofertas y todas las promociones</p>
</aside>

   </div>
</body>
</html>
