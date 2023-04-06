/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resetas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class CConexion {
    Connection conectar = null;
    
    String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=SIS-INF;"
                        + "user=userSIS;"
                        + "password=123;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
    
public Connection establecerConeccion(){
    try {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          conectar = DriverManager.getConnection(connectionUrl);
          //JOptionPane.showMessageDialog(null, "se conecto correctamente");
        }
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "no se conecto, error: ");
        }
    return conectar;
}
}
