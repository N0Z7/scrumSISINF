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
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Lizbeth Hualca
 */
public class PonerNota {
    Nota nota = new Nota();
    String idTarea;
    String nombreEsts;
    
    
    public void buscarNombre(String nombre)throws InterruptedException, ExecutionException{
        CollectionReference estudiantes = ConexionFB.db.collection("Estudiantes");
        String querySnapshot = estudiantes.getId();
    }
            
    
    
    public void buscarIdTarea(String idTarea)throws InterruptedException, ExecutionException{
        CollectionReference tareas = ConexionFB.db.collection("tasks");
        String querySnapshot = tareas.getId();
        
                
    }
    private void mostrarNota() {
        
                
    }
}
