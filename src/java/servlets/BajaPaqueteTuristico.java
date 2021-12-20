package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;

@WebServlet(name = "BajaPaqueteTuristico", urlPatterns = {"/BajaPaqueteTuristico"})
public class BajaPaqueteTuristico extends HttpServlet {

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
        Integer Id_Servicio = Integer.parseInt(request.getParameter("idBorrar"));
        
        if (con.controlPaquete(Id_Servicio)) {
            con.borrarPaquete(Id_Servicio);
            request.setAttribute("mensINFO", "Paquete Turistico Eliminado Correctamente");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("mensINFO", "ERROR - El Paquete Turistico No se encuentra o un error en el sistema");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);
        }       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
