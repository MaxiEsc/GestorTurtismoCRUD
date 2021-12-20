<%-- 
    Document   : exito
    Created on : 13/12/2021, 18:04:38
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

        <%
            HttpSession sesion = request.getSession();
            String usuario = (String) sesion.getAttribute("Usuario");
            String contrasenia = (String) sesion.getAttribute("Contrasenia");
            if (usuario == null && contrasenia == null) {
                response.sendRedirect("ingresarUsuario.jsp");
            } else {
        %>


        <div class="container">

            <main class="container">
                <h1 class="container">Agencias de viajes</h1>
            </main>
            <header class="container-fluid">

                <nav class="container-fluid bg-warning" >
                    <ul>
                        <li><button class="btn btn-warning" type="button" data-bs-toggle="offcanvas" data-bs-target="#menu-desplegable" aria-controls="offcanvas"><b>Usuario Actual</b></button></li>	
                        <li> <a href="ListarPaqueteTuristico" class="btn btn-warning">Paquetes</a></li>
                        <li> <a href="ListarCliente" class="btn btn-warning">Clientes</a></li>
                        <li> <a href="ListarEmpleado" class="btn btn-warning">Empleados</a></li>
                        <li> <a href="ListarVentas" class="btn btn-warning">Ventas</a></li>
                        <li> <a href="ListarServicioTuristico" class="btn btn-warning">Servicios</a></li>		 
                    </ul>
                </nav>
            </header>	    

            <!-- Contenido de Menu-Desplegable de Bootstrap 5 -->
            <div class="offcanvas offcanvas-start bg-warning text-white" tabindex="-1"
                 id="menu-desplegable" aria-labelledby="offcanvasLabel">
                <div class="offcanvas-header">
                    <h5 class="offcanvas-title">Mi Cuenta</h5>                    
                    <button type="button" class="btn-close text-reset " data-bs-dismiss="offcanvas" aria-label="Close"> </button>
                </div>
                <div class="offcanvas-body">
                    <div>
                        <p>Datos</p></br>
                        <input class="form-control" readonly type="text" placeholder="Ingrese su usuario" id="carga-usuario_nombre" name="userName" value="<%= usuario%>"> </br>
                        <input class="form-control" readonly type="password" placeholder="********" name="password" value="<%= contrasenia%>"> </br>
                        <button class="btn btn-primary bg-warning" data-bs-dismiss="offcanvas" aria-label="Close">Cerrar</button>
                        <button class="btn btn-primary bg-warning text-white"><a href="LogoutSession"> Cerrar Session </a></button>
                    </div>
                    <div class="dropdown mt-4">
                    </div>
                </div>
            </div>
            <!-- Fin del contenido -->  

            <%                    String mensaje = (String) request.getAttribute("mensINFO");

                if (mensaje != null) {
            %>               

            <div class="container bg-success text-white"> 
                <br/>
                <h1> <%= mensaje%> </h1>
                <br/>
            </div>
            <% }%>

            <section> 
                <p>Bienvenido a nuestro sistema aqui podrá administrar todos nuestro servicios </p>
                <p>Podrá gestionar los viajes de sus clientes las ventas de sus empleados, los paquetes disponibles </p>
                <img src="img/viaje2.jpg" alt="Fiesta" class="img-rounded">
                <p>Podrá organizar sus altas bajas y  modificaciones de sus datos deseados asi que adelante pruebe nuestro servicio</p>         
            </section>
            <aside>
                <p>Podra gestionar viajes y hospedaje venda a sus cliente el mejor servicio para realizar su trabajo</p>
                <div><img src="img/viaje3.jpg" width="100" height="120" class="img-rounded"></div>
                <p>infinitas posibilidades para realizar con las ventas y administracion necesarias para un emprendimiento</p>
                <p>invite a su familia, a sus amigos, y a mucha gente mas, creale packs de viaje de su empresa para todas  </p>
            </aside>
        </div>

        <%
            }
        %>
    </body>
</html>
