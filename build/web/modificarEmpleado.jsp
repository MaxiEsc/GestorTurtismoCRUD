<%-- 
    Document   : modificarEmpleado
    Created on : 13/12/2021, 18:11:23
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
                        <li> <a href="exito.jsp" class="btn btn-warning">Inicio</a></li>		
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

            <section> 

                <div class="container">
                    <div class="container bg-dark text-white"> 
                        <p>Ingrese los datos necesarios para Modificar a un Empleado</p>
                    </div>

                    <form action="ModificarEmpleado" method="post" class="form-check">
                        <div class="mb-3 row ">
                            <label for="text" class="col-sm-2 col-form-label">Id Empleado: </label>
                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="idEmpleado" required />
                            </div>
                        </div>
                        <div class="mb-3 row ">
                            <label for="text" class="col-sm-2 col-form-label">Nombre: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nombre" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="password" class="col-sm-2 col-form-label">Apellido: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="regPassword"name="apellido" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="password" class="col-sm-2 col-form-label">Direccion: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="regPassword"name="direccion" required />
                            </div>
                        </div>
                        <div class="mb-3 row ">
                            <label for="text" class="col-sm-2 col-form-label">Dni: </label>
                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="dni" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="password" class="col-sm-2 col-form-label">Fecha de nacimiento: </label>
                            <div class="col-sm-10">
                                <input type="date" name="fecha" min="1900-01-01" max="2070-31-12" step="1" class="form-control" required />
                            </div>
                        </div>

                        <div class="mb-3 row">
                            <label for="monedas" class="col-sm-2 col-form-label">Nacionalidad: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nacionalidad" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="monedas" class="col-sm-2 col-form-label">Celular: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="celular" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="monedas" class="col-sm-2 col-form-label">Cargo: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="cargo" required />
                            </div>
                        </div>
                        <div class="mb-3 row ">
                            <label for="text" class="col-sm-2 col-form-label">Sueldo:  </label>
                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="sueldo" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="time" class="col-sm-2 col-form-label">E-mail: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="e-mail" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="time" class="col-sm-2 col-form-label">Nombre de Usuario: </label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="nombreUsuario" required />
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="time" class="col-sm-2 col-form-label">Contraseña: </label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" name="contrasenia" required />
                            </div>
                        </div>
                        <button class="btn-warning" name="btnReg"> Registrar </button>
                    </form>
                </div>
            </section>
            <aside> 
                <p>Registrese y obtenga todas las posibilidades </p>
                <div><img src="img/viaje7.jpg" width="100" height="120" class="img-fluid"></div>
                <p>Accedera a los mejores precios, mejores ofertas y todas las promociones</p>
            </aside>
        </div>
        <%
            }
        %>
    </body>
</html>
