
package com.mycompany.creacionuserstories.crearhistoriasusuario;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.SetOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class SubirHistoriasUsusario {
    private static final String problema="tasks";
    private static final String estudiantes="Estudiantes";
    
    public void crearHistoriasUsuario(String nombre, String ci, String sis, String idproblema, String US, String nombreUS){
        Firestore firestore = FirestoreClient.getFirestore();
        CollectionReference colecciontareas = firestore.collection(problema);
        DocumentReference documentoproblemas = colecciontareas.document(idproblema)
                .collection(estudiantes).document(nombre);
        
        Map<String, Object> datosusuario = new HashMap<>();
           datosusuario.put("Nombre", nombre);
           datosusuario.put("N CARNET", ci);
           datosusuario.put("Codigo SIS", sis);
           
        try {
           documentoproblemas.set(datosusuario, SetOptions.merge());
        } catch (Exception ex) {
        }
        guardarUS(nombre,idproblema,US,nombreUS);
    }
    
    public void guardarUS(String nombreid,String idproblema, String HistoriaUsuario, String nombreUS){
        String coleccionhistorias="Historias de usuario";
        Firestore firestore = FirestoreClient.getFirestore();
        CollectionReference colecciontareas = firestore.collection(problema);
        DocumentReference documentoproblemas = colecciontareas.document(idproblema)
                .collection(estudiantes).document(nombreid)
                .collection(coleccionhistorias).document(nombreUS);
        
        Map<String, Object> historiasusuario = new HashMap<>();
           historiasusuario.put("Nombre de historia", nombreUS);
           historiasusuario.put("Historia de usuario", HistoriaUsuario);
           
        try {
           documentoproblemas.set(historiasusuario, SetOptions.merge());
           JOptionPane.showMessageDialog(null, "Se guardo correctamente su historia de usuario.");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Error al crear la tarea: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
