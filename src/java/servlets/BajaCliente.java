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

@WebServlet(name = "BajaCliente", urlPatterns = {"/BajaCliente"})
public class BajaCliente extends HttpServlet {

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
        Controladora con = new Controladora();

        Integer id_Cliente = Integer.parseInt(request.getParameter("idBorrar"));

        if (con.existeCliente(id_Cliente)) {
            
            con.borrarCliente(id_Cliente);
            request.setAttribute("mensINFO", "Cliente eliminado Correctamente");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);
            
        } else {
            
            request.setAttribute("mensINFO", "Cliente Buscado no existe");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
