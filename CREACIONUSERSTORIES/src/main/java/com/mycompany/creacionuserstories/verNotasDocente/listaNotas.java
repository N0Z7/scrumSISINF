/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.verNotasDocente;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.mycompany.creacionuserstories.ConexionFB;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class listaNotas {

    List<Datos> listaTareas = new ArrayList<Datos>();
    String idTarea;

    public void buscarNotas(String nombreTarea) throws InterruptedException, ExecutionException {
        //en la parte de document debo agregar la id de la tarea
        idTarea = "Tarea " + nombreTarea;
        CollectionReference notas = ConexionFB.db.collection("tasks").document(idTarea).collection("Estudiantes");
        ApiFuture<QuerySnapshot> querySnapshot = notas.get();

        for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
            Datos datos = new Datos(
                    document.getString("Nombre"),
                    document.getString("Codigo SIS"),
                    document.getString("Nota")
                );
            listaTareas.add(datos);
        }
        mostrarNotas();
    }

    private void mostrarNotas() {
        agregarFilasTabla(InterfazVerNotas.jTablaNotas, 0);
        for (int posN = 0; posN < listaTareas.size(); posN++) {
            agregarFilasTabla(InterfazVerNotas.jTablaNotas, InterfazVerNotas.jTablaNotas.getRowCount() + 1);
            InterfazVerNotas.jTablaNotas.setValueAt(listaTareas.get(posN).getNombreEst(), posN, 0);
            InterfazVerNotas.jTablaNotas.setValueAt(listaTareas.get(posN).getCodSis(), posN, 1);
            InterfazVerNotas.jTablaNotas.setValueAt(listaTareas.get(posN).getNota(), posN, 2);
        }
    }

    public void agregarFilasTabla(JTable jTablaNotas, int filas) {
        DefaultTableModel tablaN = (DefaultTableModel) jTablaNotas.getModel();
        tablaN.setRowCount(filas);
    }
}
