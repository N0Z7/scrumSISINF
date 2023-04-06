/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.Calificar;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.SetOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Lizbeth Hualca
 */
public class Calificar {
    public void calificarTarea (String idTarea, String nombre, String nota){
        String coleccionTarea = "tasks";
        String coleccionEstudiante = "Estudiantes";
        Firestore firestore = FirestoreClient.getFirestore();
        CollectionReference tasksCollection = firestore.collection(coleccionTarea);
        DocumentReference taskDocument = tasksCollection.document(idTarea).collection(coleccionEstudiante).document(nombre);
        
        Map<String, Object> task = new HashMap<>();
        task.put("Nota", nota);
        
        try {
        taskDocument.set(task, SetOptions.merge());
        JOptionPane.showMessageDialog(null, "Se califico correctamente.");
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al calificar la tarea: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
