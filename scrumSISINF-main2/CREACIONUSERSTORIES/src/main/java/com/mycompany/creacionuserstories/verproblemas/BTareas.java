/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.verproblemas;

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
 * @author abcri
 */
public class BTareas {

    List <Tarea> listaTareas = new ArrayList<Tarea>();
    public void buscarTareas() throws InterruptedException, ExecutionException {
		CollectionReference tareas = ConexionFB.db.collection("tasks");
		ApiFuture<QuerySnapshot> querySnapshot = tareas.get();

		for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                    Tarea tarea= new Tarea(
                            document.getId(),
                            document.getString("Titulo"),
                            document.getString("Descripcion"),
                            document.getString("FechaCreacion"),
                            document.getString("FechaEntrega"));
                    listaTareas.add(tarea);
		}
                mostrarTareas();
    }
    
    
    private void mostrarTareas(){
        agregarFilasTabla(InterfazVerProblemas.tablaTareas, 0);
        for(int posN=0; posN < listaTareas.size(); posN++){
            agregarFilasTabla(InterfazVerProblemas.tablaTareas, InterfazVerProblemas.tablaTareas.getRowCount()+1);
            InterfazVerProblemas.tablaTareas.setValueAt(listaTareas.get(posN).getId(), posN, 0);
            InterfazVerProblemas.tablaTareas.setValueAt(listaTareas.get(posN).getNombre(), posN, 1);
            InterfazVerProblemas.tablaTareas.setValueAt(listaTareas.get(posN).getDescripcion(), posN, 2);
            InterfazVerProblemas.tablaTareas.setValueAt(listaTareas.get(posN).getFechaCreacion(), posN, 3);
            InterfazVerProblemas.tablaTareas.setValueAt(listaTareas.get(posN).getFechaEntrega(), posN, 4);
        }
    }
    
    public void agregarFilasTabla(JTable jTable, int filas){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(filas);
    }
    
}