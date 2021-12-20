package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Controladora;
import logica.Ventas;

@WebServlet(name = "AltaCliente", urlPatterns = {"/AltaCliente"})
public class AltaCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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

            System.out.println(fecha);

            String nacionalidad = request.getParameter("nacionalidad");
            String celular = request.getParameter("celular");
            String email = request.getParameter("e-mail");

            
            
            //Logica para anexar las ventas
            
            /*
            Date fechaVenta = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fechaVentas"));
            String medioPago = request.getParameter("medioPago");

            List<Ventas> ventaPaquete = new ArrayList<>();
            if (con.buscarVenta(fechaVenta, medioPago) != -1) {
                Ventas paquete = new Ventas(null, fechaVenta, medioPago);
                ventaPaquete.add(paquete);
            }else{                
                con.crearVenta(fechaVenta, medioPago);
                Ventas paquete = new Ventas(null, fechaVenta, medioPago);
                ventaPaquete.add(paquete);                
            }
            */
            
            if (fecha != null) {
                Cliente nuevo = new Cliente(nombre, apellido, direccion, dni, fecha, nacionalidad, celular, email, null);
                
                con.crearCliente(nuevo);

                request.setAttribute("mensINFO", "Cliente Agregado Correctamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);

            } else {
                request.setAttribute("mensINFO", "ERROR");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
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
