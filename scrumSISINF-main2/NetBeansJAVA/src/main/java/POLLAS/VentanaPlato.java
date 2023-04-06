package POLLAS;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class VentanaPlato extends JFrame implements ActionListener {

    private JLabel titulo;
    private JLabel nombre;
    private JLabel costo;
    private Font fuente;
    private JTextField nombrePlato;
    private JTextField costoPlato;
    private JButton btRegistrar;
    Conexion conexion = new Conexion();
    Connection cin = conexion.establecerConexion();
    PreparedStatement ps;

    public VentanaPlato() {

        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*fuente */
        fuente = new Font("Segoe UI Light", 0, 20);
        /*txt titulo */
        titulo = new JLabel("Plato");
        titulo.setFont(new java.awt.Font("Segoe UI Light", 0, 24));
        titulo.setBounds(110, 10, 100, 50);
        add(titulo);
        /*txt nombre */
        nombre = new JLabel("Nombre del Plato");
        nombre.setFont(fuente);
        nombre.setBounds(10, 60, 200, 30);
        add(nombre);
        /* txt costo*/
        costo = new JLabel("Costo");
        costo.setFont(fuente);
        costo.setBounds(10, 130, 100, 30);
        add(costo);
        /*Caja de nombre de plato */
        nombrePlato = new JTextField();
        nombrePlato.setBounds(50, 100, 200, 25);
        add(nombrePlato);
        /*caja de costo del plato */
        costoPlato = new JTextField();
        costoPlato.setBounds(50, 170, 200, 25);
        add(costoPlato);
        /*Boton registrar */
        btRegistrar = new JButton("Registrar");
        btRegistrar.setFont(new java.awt.Font("Segoe UI Light", 0, 15));
        btRegistrar.setBounds(90, 210, 100, 30);
        add(btRegistrar);
        btRegistrar.addActionListener(this);

        this.setSize(300, 300);
        this.setLocation(500, 250);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        ingresarPlato(nombrePlato.getText(), Integer.parseInt(costoPlato.getText()));

    }

    private void ingresarPlato(String nombreP, int costoP) {

        String sql = "insert into Plato(nombre, costo) values (?,?)";
        /*if (validar(nombreP)) {
            JOptionPane.showMessageDialog(null, "Plato ya existente");
        } else {
            try {
                ps = cin.prepareCall(sql);
                ps.setString(1, nombreP);
                ps.setInt(2, costoP);
                int registro = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Plato ingresado");

            } catch (Exception e) {

            }
        }*/
        try{
            ps = cin.prepareCall(sql);
            ps.setString(1, nombreP);
            ps.setInt(2, costoP);
            int registro = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Plato ingresado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Plato existente");
        }
    }

    /*private boolean validar(String nombreP) {
        boolean res = false;
        String verificar = "SELECT nombre FROM Plato WHERE nombre ='" +nombreP+"'";
        PreparedStatement PS = null;
        ResultSet rs;
        try {
            PS = cin.prepareStatement(verificar);
            rs = ps.executeQuery();
            if (rs.next()) {
                res = true;
            }
        } catch (Exception e) {
            System.err.print("Ha ocurrido un error: " + e.getMessage());
        } finally {
            PS = null;
        }
        return res;
    }*/
}
