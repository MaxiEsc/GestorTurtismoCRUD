package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;

@WebServlet(name = "LoginSession", urlPatterns = {"/LoginSession"})
public class LoginSession extends HttpServlet {

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

        String usuario = request.getParameter("regUser");
        String contra = request.getParameter("regPassword");

        if (con.controlUser(usuario, contra)) {
            HttpSession sesionUsuario = request.getSession(true);
            sesionUsuario.setAttribute("Contrasenia", contra);
            sesionUsuario.setAttribute("Usuario", usuario);
            request.setAttribute("mensINFO", "Bienvenido " + usuario + " al sistema");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/exito.jsp");
            dispatcher.forward(request, response);

        } else {
            request.setAttribute("mensINFO", "El usuario no existe o Contraseña para '" + usuario + "' es incorrecta");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ingresarUsuario.jsp");
            dispatcher.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
