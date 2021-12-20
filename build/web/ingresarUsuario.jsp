<%-- 
    Document   : ingresarUsuario
    Created on : 13/12/2021, 18:10:10
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

            <%
                String mensaje = (String) request.getAttribute("mensINFO");

                if (mensaje != null) {
            %>               

            <div class="container bg-danger text-white"> 
                <br/>
                <h1> <%= mensaje%> </h1>
                <br/>
            </div>
            <% }%>

            <section>
                <div class="container bg-dark text-white"> 
                    <br/>
                    <h2>Ingrese un nombre de usuario y una Contraseña</h2>
                    <br/>
                </div>
                <div class="container">
                    <br/>
                    <form action="LoginSession" method="post">
                        <div class="container">
                            <div class="mb-3 row container">
                                <label for="text" class="col-sm-2 col-form-label">Nombre: </label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="regUser" placeholder="Juan" required />
                                </div>
                            </div>
                            <div class="mb-3 row container" >
                                <label for="password" class="col-sm-2 col-form-label">Contraseña: </label>
                                <div class="col-sm-10 container-fluid">
                                    <input type="password" class="form-control" name="regPassword" placeholder="********">
                                </div>                                                           
                            </div>
                            <div class="mb-3 row container" >
                                <button class="btn-warning" name="btnReg"> INGRESAR </button>
                            </div>
                        </div>
                    </form>

                    <div class="container">
                        <p>Si no tiene una cuenta, por faavor contactese con el administrador de base de datos para crear Un Usuario y su cieuenta de empleado correspondiente.</p>
                        <p> En caso de necesitar ayuda pinche la pestaña correspondiente</p>
                    </div>
                </div>
                <div>
                    <p>Registrese y obtenga todas las posibilidades </p>
                    <div><img src="img/viaje7.jpg" width="100" height="120" class="img-rounded"></div>
                    <p>Accedera a los mejores precios, mejores ofertas y todas las promociones</p>
                </div>
            </section>
        </div>
    </body>
</html>	

</section>
<aside> 
    <p>Ingrese con su cuenta y acceda a los mejores precios </p>
    <div><img src="img/viaje5.jpg" width="100" height="120" class="img-fluid"></div>
    <p>Acceda a los mejores precios, mejores ofertas y todas las promociones que le dispone este servicio</p>
</aside>
</body>
</html>
