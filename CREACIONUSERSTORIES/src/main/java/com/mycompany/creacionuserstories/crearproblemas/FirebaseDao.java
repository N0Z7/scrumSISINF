/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.crearproblemas;

/**
 *
 * @author abcri
 */
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.SetOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class FirebaseDao {

  private static final String TASKS_COLLECTION_NAME = "tasks";

  public void createTask(String ntarea,String name, String description, String createdDate, String dueDate) {
    String tituloTarea= "Tarea "+ntarea;
    Firestore firestore = FirestoreClient.getFirestore();
    CollectionReference tasksCollection = firestore.collection(TASKS_COLLECTION_NAME);

    // Creamos un nuevo documento para la tarea y asignamos un identificador aleatorio
    DocumentReference taskDocument = tasksCollection.document(tituloTarea);

    // Creamos un mapa con los datos de la tarea
    Map<String, Object> taskData = new HashMap<>();
    taskData.put("Titulo", name);
    taskData.put("Descripcion", description);
    taskData.put("FechaCreacion", createdDate);
    taskData.put("FechaEntrega", dueDate);

    // Guardamos los datos de la tarea en Firebase Firestore
    try {
    taskDocument.set(taskData, SetOptions.merge());
    JOptionPane.showMessageDialog(null, "La tarea se creó correctamente.");
    } catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Error al crear la tarea: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

}
