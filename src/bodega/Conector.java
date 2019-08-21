
package bodega;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conector {
    
    Connection conexion =  null;
    PreparedStatement insercion;
    Statement stmt;
    ResultSet res;
    String user = "root";
    String password = "123-abc";
    String servidor = "jdbc:mysql://localhost:3306/codenbugs";
    String bodega = "SELECT * FROM bodega;";
    
    public Conector(){
        try {
            conexion = DriverManager.getConnection(servidor, user, password);
            System.out.println("Se conecto XD: "+conexion.getCatalog());
 
        } catch (SQLException e) {
            System.out.println("NO SE CONECTO");
            e.getMessage();
            e.printStackTrace();
        } 
    }
   
}
