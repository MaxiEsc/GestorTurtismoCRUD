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
import logica.Ventas;

@WebServlet(name = "AltaServicioTuristico", urlPatterns = {"/AltaServicioTuristico"})
public class AltaServicioTuristico extends HttpServlet {

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

            String nombre = request.getParameter("nomVentas");
            String destino = request.getParameter("destinoServicio");
            String descripcion = request.getParameter("descripcionBreve");
            Double costo_servicio = Double.parseDouble(request.getParameter("costoServicio"));
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fechaServicio"));

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
                
                con.crearServicio(nombre, descripcion, destino, costo_servicio, fecha);
                
                request.setAttribute("mensINFO", "Servicio Turistico Agregado Correctamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("mensINFO", "ERROR en el sistema o en la carga de fecha");
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
