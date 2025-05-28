package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_ventas", "root", "");
            //JOptionPane.showMessageDialog(null,"Intento de conexion a la BD");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
//"jdbc:mysql://localhost/bd_sistema_ventas", "root", " "