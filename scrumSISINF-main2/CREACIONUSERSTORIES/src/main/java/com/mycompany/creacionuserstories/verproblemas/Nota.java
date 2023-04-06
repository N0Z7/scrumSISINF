/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.creacionuserstories.verproblemas;

import com.google.api.core.ApiFuture;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lizbeth Hualca
 */

    
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.SetOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mycompany.creacionuserstories.ConexionFB;
import java.util.concurrent.ExecutionException;


public class Nota extends JFrame implements ActionListener {
    
    private JLabel tareaIdLabel;
    private JTextField tareaIdField;
    private JButton buscarButton;
    private JLabel estudianteLabel;
    private JTextField estudianteField;
    private JLabel notaLabel;
    private JTextField notaField;
    private JButton guardarButton;
    private Tarea tareaActual;
    private Estudiante nombreActual;
    
    
    public Nota() {
        super("Nota Tarea");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tareaIdLabel = new JLabel("ID de Tarea:");
        tareaIdField = new JTextField(10);
        buscarButton = new JButton("Buscar");
        buscarButton.addActionListener(this);
        estudianteLabel = new JLabel("ID Estudiante:");
        estudianteField = new JTextField(10);
        notaLabel = new JLabel("Nota:");
        notaField = new JTextField(10);
        guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        JPanel idPanel = new JPanel();
        idPanel.add(tareaIdLabel);
        idPanel.add(tareaIdField);
        idPanel.add(buscarButton);
        panel.add(idPanel);
        JPanel estudiantesPanel = new JPanel();
        estudiantesPanel.add(estudianteLabel);
        estudiantesPanel.add(estudianteField);
        panel.add(estudiantesPanel);
        JPanel notaPanel = new JPanel();
        notaPanel.add(notaLabel);
        notaPanel.add(notaField);
        panel.add(notaPanel);
        panel.add(guardarButton);
        getContentPane().add(panel);
        
        setSize(400, 300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        PonerNota ponerNota = new PonerNota();
        if (e.getSource() == buscarButton) {
            String tareaId = tareaIdField.getText();
            
            
            
            if (nombreActual != null) {
                DefaultListModel<String> model = new DefaultListModel<String>();
                for (Estudiante estudiante : tareaActual.getEstudiantes()) {
                    model.addElement(estudiante.getNombre());
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el nombre");
            }
            
            if (tareaActual != null) {
                DefaultListModel<String> model = new DefaultListModel<String>();
                for (Estudiante estudiante : tareaActual.getEstudiantes()) {
                    model.addElement(estudiante.getNombre());
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la tarea");
            }
        } else if (e.getSource() == guardarButton) {
            if (nombreActual != null && tareaActual != null) {
                String notaString = notaField.getText();
                try {
                    double nota = Double.parseDouble(notaString);
                    tareaActual.setNota(nota);
                    JOptionPane.showMessageDialog(this, "Nota guardada correctamente.");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "La nota debe ser un número.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Primero busque una tarea.");
            }
        }
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
