<%-- 
    Document   : acercaDe
    Created on : 13/12/2021, 17:55:11
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
                    <h1>Como trabajo y que objetivos tengo</h1>
                </div>

                <div class="container">
                    <h3>Como trabajo</h3>

                    <p>Soy Escobar Maximiliano, soy estudiante del ISPC, Instituto Superior Politecnico Córdoba, ya finalizado el cursado de primer año y promovido a segundo año Soy desarrollador de avanzado de java</p>

                    <p>Me gusta la todo lo relacionado a la tecnologia JAVA, busco estudiarlo mas de la cuenta, aprendi desarrollando en c++ y c, Asi que dada la presentacion tomense la libertad de navegar tranquilamente por la pagina, Muchas Gracias por leer</p>                    <h3>Contactos</h3>

                    <p class="container bg-dark"><a href="mailto:maxescobarubp@gmail.com">Enviarme un E-mail</a></p> 
                    <br>
                    <div class="container">
                        <p class="container bg-dark text-white">Linkedin</p><a href="https://www.linkedin.com/in/maxesc/"><img border="0" class="img-rounded" alt="Linkedin" src="img/linkedin.gif" width="20" height="20"></a>
                    </div>
                    <br>
                    <p class="container bg-dark"><a href="tel:+ (0351) 373 3281 ">Teléfono: (0351) 373 3281 </a></p>

                </div>

            </section>
            <aside> 
                <p>Registrese y obtenga todas las posibilidades </p>
                <div><img src="img/viaje2.jpg" width="100" height="120" class="img-fluid"></div>
                <p>Accedera a los mejores precios, mejores ofertas y todos los destinos disponibles</p>
            </aside>	

        </div>
    </body>
</html>
