/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

/**
 *
 * @author abcri
 */
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazConexion extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    private JTextArea textArea;

    public InterfazConexion() {
        // Configuramos la ventana
        setTitle("Conexión a MySQL");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creamos la etiqueta y la agregamos a la ventana
        label = new JLabel("Presiona el botón para conectar a MySQL");
        add(label);

        // Creamos el botón y lo agregamos a la ventana
        button = new JButton("Conectar");
        button.addActionListener(this);
        add(button);

        // Creamos el área de texto y lo agregamos a la ventana
        textArea = new JTextArea(10, 30);
        add(textArea);

        // Mostramos la ventana
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Si se presiona el botón, intentamos conectar a MySQL
        if (e.getSource() == button) {
            try {
                // Cargamos el driver de MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Conectamos a la base de datos "test"
                String url = "jdbc:mysql://localhost:3306/sakila";
                String user = "root";
                String password = "sis2";
                Connection conn = DriverManager.getConnection(url, user, password);

                // Obtenemos las tablas de la base de datos y las mostramos en el área de texto
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SHOW TABLES");
                while (rs.next()) {
                    String tableName = rs.getString(1);
                    textArea.append(tableName + "\n");
                }

                // Cerramos la conexión
                conn.close();
            } catch (Exception ex) {
                // Si ocurre un error, lo mostramos en el área de texto
                textArea.setText(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Creamos la GUI
        new InterfazConexion();
    }
}
