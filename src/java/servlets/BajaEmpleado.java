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

@WebServlet(name = "BajaEmpleado", urlPatterns = {"/BajaEmpleado"})
public class BajaEmpleado extends HttpServlet {

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

        Integer id_Empleado = Integer.parseInt(request.getParameter("idBorrar"));

        if (con.existeEmpleado(id_Empleado)) {
            
            con.borrarEmpleado(id_Empleado);
            request.setAttribute("mensINFO", "Empleado eliminado Correctamente");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);
            
        } else {
            
            request.setAttribute("mensINFO", "Empleado Buscado no existe");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
