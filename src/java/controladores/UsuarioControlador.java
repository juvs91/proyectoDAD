/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import BD.conexion;
import beans.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/UsuarioControlador"})
public class UsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String persona = request.getParameter("usuario");
        String password = request.getParameter("password");
        Usuario usuario = null;
        usuario.setGuess("persona");
        usuario.setPassword(password);
        String mensaje = "";
        String usuariox = "root";
        String url = "jdbc:mysql://localhost:8889/sistema_escolar";
        String passwordx = "root";
        Connection conect;
        try {
            conect = (Connection) DriverManager.getConnection(url, usuariox, passwordx);
            Statement query = (Statement) conect.createStatement();
            ResultSet rset = query.executeQuery("SELECT nivel FROM Usuarios WHERE nombre='" + persona + "' AND password='" + password + "'");
            usuario.setNivel(rset.getInt(1));

        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            mensaje = ex.toString();
        }
        int nivel = usuario.getNivel();
        if (nivel == 1) {
            System.out.println(nivel);
        }
        if (nivel == 2) {
            System.out.println(nivel);
        }
        if (nivel == 3) {
            System.out.println(nivel);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
