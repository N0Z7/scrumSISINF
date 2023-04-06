/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.creacionuserstories.crearproblemas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class InterfazCrearProblemas extends javax.swing.JPanel {
    
    
    public InterfazCrearProblemas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaProblema = new javax.swing.JTextArea();
        jEtiquetaTitulo = new javax.swing.JLabel();
        jBotonSubir = new javax.swing.JButton();
        jBotonEditar = new javax.swing.JButton();
        jEtiquetaFecha = new javax.swing.JLabel();
        jEtiquetaProblema = new javax.swing.JLabel();
        jTxtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtFecha = new javax.swing.JTextField();
        jEtiquetaFecha1 = new javax.swing.JLabel();
        jTxtNTarea = new javax.swing.JTextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(2000, 2000));

        jTxtAreaProblema.setColumns(20);
        jTxtAreaProblema.setLineWrap(true);
        jTxtAreaProblema.setRows(5);
        jTxtAreaProblema.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTxtAreaProblema);

        jEtiquetaTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jEtiquetaTitulo.setText("Título");

        jBotonSubir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBotonSubir.setText("Subir");
        jBotonSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSubirActionPerformed(evt);
            }
        });

        jBotonEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBotonEditar.setText("Editar");

        jEtiquetaFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jEtiquetaFecha.setText("Fecha de Entrega");

        jEtiquetaProblema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jEtiquetaProblema.setText("Redactar el problema");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("D/M/A");

        jEtiquetaFecha1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jEtiquetaFecha1.setText("ID Tarea:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jBotonSubir)
                .addGap(102, 102, 102)
                .addComponent(jBotonEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEtiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jEtiquetaFecha)
                            .addComponent(jTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEtiquetaFecha1)
                            .addComponent(jEtiquetaProblema))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jEtiquetaFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEtiquetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtNTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEtiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jEtiquetaProblema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonSubir)
                    .addComponent(jBotonEditar))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSubirActionPerformed
        //Recopila todos los datos de los campos de texto
        //fecha limite
        String fechaE ="";
        String fechaS ="";
        String titulo ="";
        String txtProblema ="";
        String ntarea = "";
        try{
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(jTxtFecha.getText());
            fechaE = jTxtFecha.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fecha incorecta");
        }
        //fecha subida del problema
        String dia = (LocalDate.now().getDayOfMonth())+"";
        String mes = (LocalDate.now().getMonthValue())+"";
        String ano = (LocalDate.now().getYear())+"";
        fechaS = dia + "/"+ mes +"/"+ ano;
        //titulo del problema
        if(jTxtTitulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el título del problema por favor");
        }else{
            titulo = jTxtTitulo.getText();
        }
        //ntarea del problema
        if(jTxtNTarea.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese un número de tarea o nombre");
        }else{
            ntarea = jTxtNTarea.getText();
        }
        //texto del problema
        if(jTxtAreaProblema.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el Problema");
        }else{
            txtProblema = jTxtAreaProblema.getText();
        }
        FirebaseDao dao = new FirebaseDao();
        dao.createTask(ntarea, titulo, txtProblema, fechaS, fechaE);
    }//GEN-LAST:event_jBotonSubirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonEditar;
    private javax.swing.JButton jBotonSubir;
    private javax.swing.JLabel jEtiquetaFecha;
    private javax.swing.JLabel jEtiquetaFecha1;
    private javax.swing.JLabel jEtiquetaProblema;
    private javax.swing.JLabel jEtiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtAreaProblema;
    private javax.swing.JTextField jTxtFecha;
    private javax.swing.JTextField jTxtNTarea;
    private javax.swing.JTextField jTxtTitulo;
    // End of variables declaration//GEN-END:variables
}
