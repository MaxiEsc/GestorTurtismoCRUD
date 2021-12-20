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
import logica.PaqueteTuristico;
import logica.Ventas;

@WebServlet(name = "ModificarPaqueteTuristico", urlPatterns = {"/ModificarPaqueteTuristico"})
public class ModificarPaqueteTuristico extends HttpServlet {

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

            Integer id_Paquete = Integer.parseInt(request.getParameter("idPaquete"));
            Double costo_paquete = Double.parseDouble(request.getParameter("costoPaquete"));
            
            if (con.controlPaquete(id_Paquete)) {

                PaqueteTuristico aux = new PaqueteTuristico(id_Paquete, costo_paquete, null);
                con.actualizarPaquete(aux);
                request.setAttribute("mensINFO", "Paquete Turistico Modificado Correctamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("mensINFO", "ERROR el Paquete turistico no existe o error del sistema");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
            }
      
            

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
            
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
