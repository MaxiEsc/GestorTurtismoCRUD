<%-- 
    Document   : gestorEmpleado
    Created on : 13/12/2021, 18:06:12
    Author     : Max Esc
--%>

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

            <section class="listas"> 

                <div class="container bg-dark text-white"> 
                    <p>Lista de Empleados en el sistema </p>
                </div>

                <div class="container">
                    <button class="btn btn-warning">Lista de Empleados: </button>
                </div>

                <div class="container-fluid">
                    <table class="table table-dark">
                        <thead>
                            <tr>
                                <th scope="col">ID Cliente</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Apellido</th>
                                <th scope="col">Direccion</th>
                                <th scope="col">DNI</th>
                                <th scope="col">Fecha de Nacimiento</th>
                                <th scope="col">Nacionalidad</th>
                                <th scope="col">Celular</th>
                                <th scope="col">E-mail</th>
                                <th scope="col">Cargo</th>
                                <th scope="col">Sueldo</th>
                                <th scope="col">Nombre de Usuario</th>
                                <th scope="col">Ventas</th>
                            </tr>
                        </thead>

                        <%
                            List<Empleado> todos = (List<Empleado>) request.getAttribute("listaEmp");
                            for (Empleado em : todos) {
                        %>

                        <tbody>
                            <tr>
                                <th scope="row"><%= em.getId_empleado()%></th>
                                <td><%= em.getNombre()%></td>
                                <td><%= em.getApellido()%></td>
                                <td><%= em.getDireccion()%></td>
                                <td><%= em.getDNI()%></td>
                                <td><%= em.getFecha_nac()%></td>
                                <td><%= em.getNacionalidad()%></td>
                                <td><%= em.getCelular()%></td>
                                <td><%= em.getEmail()%></td>
                                <td><%= em.getCargo()%></td>
                                <td><%= em.getSueldo()%></td>
                                <td><%= em.getId_empleado().toString()%></td>
                                <td><%= em.getLista_ventas().size()%></td>
                            </tr>
                        </tbody>
                        <%
                            }
                        %>
                    </table>
                </div>

                <div class="container">		
                    <h2> ¿Que desea realizar?</h2>
                    <button class="btn btn-warning"><div class="container">
                            <a href="altaEmpleado.jsp"> Nuevo Empleados</a>
                        </div>
                    </button>
                    <button class="btn btn-warning"><div class="container">
                            <a href="modificarEmpleado.jsp">Modificar un Empleados</a>
                        </div>
                    </button>
                    <button class="btn btn-warning"><div class="container">
                            <a href="borrarEmpleado.jsp">Eliminar un Empleados</a>
                        </div>
                    </button>                    
                </div>
            </section>
        </div>
        <%
            }
        %>
    </body>
</html>
