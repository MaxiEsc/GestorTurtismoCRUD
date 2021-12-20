package servlets;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.PaqueteTuristico;
import logica.Ventas;

@WebServlet(name = "AltaPaqueteTuristico", urlPatterns = {"/AltaPaqueteTuristico"})
public class AltaPaqueteTuristico extends HttpServlet {

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

       Controladora con = new Controladora();

            Double costo_paquete = Double.parseDouble(request.getParameter("costoPaquete"));

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
            if (costo_paquete != null) {

                PaqueteTuristico aux = new PaqueteTuristico(costo_paquete, null);

                con.crearPaquete(aux);
                request.setAttribute("mensINFO", "Paquete Turistico Agregado Correctamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("mensINFO", "ERROR");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
            }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
