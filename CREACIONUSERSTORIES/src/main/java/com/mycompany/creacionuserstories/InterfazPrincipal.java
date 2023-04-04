package com.mycompany.creacionuserstories;

import com.mycompany.creacionuserstories.crearhistoriasusuario.InterfazCrearHistoriaUsuario;
import com.mycompany.creacionuserstories.crearproblemas.InterfazCrearProblemas;
import com.mycompany.creacionuserstories.verproblemas.InterfazVerProblemas;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class InterfazPrincipal extends javax.swing.JFrame {

    public InterfazPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCrearProblemas = new javax.swing.JButton();
        botonVerProblemas = new javax.swing.JButton();
        panelMostrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCrearHistoriaUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCrearProblemas.setText("CREAR PROBLEMAS");
        botonCrearProblemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearProblemasActionPerformed(evt);
            }
        });

        botonVerProblemas.setText("VER PROBLEMAS");
        botonVerProblemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProblemasActionPerformed(evt);
            }
        });

        panelMostrar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("SELECCIONE UNA DE LAS OPCIONES PARA EMPEZAR");

        javax.swing.GroupLayout panelMostrarLayout = new javax.swing.GroupLayout(panelMostrar);
        panelMostrar.setLayout(panelMostrarLayout);
        panelMostrarLayout.setHorizontalGroup(
            panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMostrarLayout.setVerticalGroup(
            panelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        botonCrearHistoriaUsuario.setText("CREAR USER HISTORY");
        botonCrearHistoriaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearHistoriaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCrearProblemas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonVerProblemas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(botonCrearHistoriaUsuario)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearProblemas)
                    .addComponent(botonVerProblemas)
                    .addComponent(botonCrearHistoriaUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearProblemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearProblemasActionPerformed
        // TODO add your handling code here:
        InterfazCrearProblemas panelcrearproblemas = new InterfazCrearProblemas();
        navegacionPaneles(panelcrearproblemas);
    }//GEN-LAST:event_botonCrearProblemasActionPerformed

    private void botonVerProblemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProblemasActionPerformed
        // TODO add your handling code here:
        InterfazVerProblemas panelverproblemas = new InterfazVerProblemas();
        navegacionPaneles(panelverproblemas);
    }//GEN-LAST:event_botonVerProblemasActionPerformed

    private void botonCrearHistoriaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearHistoriaUsuarioActionPerformed
        // TODO add your handling code here:
        InterfazCrearHistoriaUsuario panelcrearus = new InterfazCrearHistoriaUsuario();
        navegacionPaneles(panelcrearus);
    }//GEN-LAST:event_botonCrearHistoriaUsuarioActionPerformed
    //Metodo para navegar entre paneles
    private void navegacionPaneles(JPanel p){
        panelMostrar.removeAll();
        panelMostrar.setLayout(new BorderLayout());
        panelMostrar.add(p, BorderLayout.CENTER);
        panelMostrar.revalidate();
        panelMostrar.repaint();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearHistoriaUsuario;
    private javax.swing.JButton botonCrearProblemas;
    private javax.swing.JButton botonVerProblemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelMostrar;
    // End of variables declaration//GEN-END:variables
}
