
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="logica.*"%>

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
                        <li> <a href="acercaDe.jsp" class="btn btn-warning">Acerca de nosostros</a></li>
                    </ul>
                </nav>
            </header>	 

            <%
                String mensaje = (String) request.getAttribute("mensINFO");
                if (mensaje != null) {
            %>               

            <div class="container bg-success text-white"> 
                <br/>
                <h1> <%= mensaje%> </h1>
                <br/>
            </div>
            <% }%>

            <section> 
                <p>Proyecto de una empresa para gestionar viajes y realizar ventas a traves de paquetes, ventas, se podran gestionar los clientes sus usuarios y los empleados </p>
                <p>Podrá gestionar los viajes de sus clientes las ventas de sus empleados, los paquetes disponibles </p>
                <img src="img/viaje2.jpg" alt="Fiesta" class="img-rounded">
                <p>Para registrarse haga click en la pestaña de registrar y cree un empleado para poder utilizar nuestro servicio</p>
            </section>

            <aside>
                <p>Podra gestionar viajes y hospedaje venda a sus cliente el mejor servicio para realizar su trabajo</p>
                <div><img src="img/viaje3.jpg" width="100" height="120" class="img-rounded"></div>
                <p>infinitas posibilidades para realizar con las ventas y administracion necesarias para un emprendimiento</p>
                <p>invite a su familia, a sus amigos, y a mucha gente mas, creale packs de viaje de su empresa para todas  </p>
            </aside>
    </body>
</html>





















