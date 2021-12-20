package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.PaqueteTuristico;
import logica.ServicioTuristico;

@WebServlet(name = "ListarPaqueteTuristico", urlPatterns = {"/ListarPaqueteTuristico"})
public class ListarPaqueteTuristico extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora con = new Controladora();
        
        List<PaqueteTuristico> pTuristico = con.mostrarPaquete();
        request.setAttribute("paquetes", pTuristico);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/gestorPaquetes.jsp");
        dispatcher.forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
