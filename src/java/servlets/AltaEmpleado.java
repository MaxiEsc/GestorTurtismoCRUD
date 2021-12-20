package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Empleado;
import logica.Usuario;
import logica.Ventas;

@WebServlet(name = "AltaEmpleado", urlPatterns = {"/AltaEmpleado"})
public class AltaEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Controladora con = new Controladora();

            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            Integer dni = Integer.parseInt(request.getParameter("dni"));
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha"));
            String cargo = request.getParameter("cargo");
            String nacionalidad = request.getParameter("nacionalidad");
            String celular = request.getParameter("celular");
            Double sueldo = Double.parseDouble(request.getParameter("sueldo"));
            String email = request.getParameter("e-mail");

            String nombreUsuario = request.getParameter("nombreUsuario");
            String contraseniaUser = request.getParameter("contraseniaUsuario");            

            //Logica para anexar las ventas
            /*
            Date fechaVenta = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fechaVentas"));
            String medioPago = request.getParameter("medioPago");

            List<Ventas> ventaPaquete = new ArrayList<>();
            if (con.buscarVenta(fechaVenta, medioPago) != -1) {
                Ventas paquete = new Ventas(null, fechaVenta, medioPago);
                ventaPaquete.add(paquete);

            } else {
                con.crearVenta(fechaVenta, medioPago);
                Ventas paquete = new Ventas(null, fechaVenta, medioPago);
                ventaPaquete.add(paquete);
            }
            */

            if (fecha != null) {

                Empleado nuEmpleado = new Empleado(nombre, apellido, direccion, dni, fecha, nacionalidad, celular, email, null, cargo, sueldo, null);

                con.crearEmpleado(nuEmpleado, nombreUsuario, contraseniaUser);

                request.setAttribute("mensINFO", "Empleado Agregado Correctamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);

            } else {
                response.sendRedirect("/error");
            }

        } catch (ParseException e) {
            e.printStackTrace(System.out);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
