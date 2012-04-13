/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class conexion {
    public static void conecta(){
    
    String usuario="root";
    String password="root";
    String mensaje="";
    Connection conect=null;
    String url="jdbc:mysql://localhost:8889/sistema_escolar";
    Statement query=null;
    
        try {
            conect= (Connection)DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            mensaje=ex.toString();
        }
         

    }
}


       
    

