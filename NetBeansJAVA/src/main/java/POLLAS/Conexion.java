package POLLAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar = null;

    String cadena = "jdbc:sqlserver://localhost:1433;"
            + "database=ListaPlatos;"
            + "user=sa;"
            + "password=123456;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";

    public Connection establecerConexion() {
        try {
            conectar = DriverManager.getConnection(cadena);
            //JOptionPane.showMessageDialog(null, "se conecto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.toString());
        }
        return conectar;
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
