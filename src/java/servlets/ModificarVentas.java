package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;

@WebServlet(name = "ModificarVentas", urlPatterns = {"/ModificarVentas"})
public class ModificarVentas extends HttpServlet {

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

            Integer numVentas = Integer.parseInt(request.getParameter("numVentas"));
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fechaVentas"));
            String medioPago = request.getParameter("medioPago");

            if (con.controlVentas(numVentas) && fecha != null) {
                
                con.actualizarVenta(numVentas, fecha, medioPago);
                request.setAttribute("mensINFO", "Venta Modificada Correctamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
                dispatcher.forward(request, response);
            } else {
                
                request.setAttribute("mensINFO", "ERROR en el sistema");
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
