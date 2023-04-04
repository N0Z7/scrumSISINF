package com.mycompany.creacionuserstories;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;

public class ConexionFB {
   public static Firestore db;
    
    public static void conectarFb(){
        FileInputStream serviceAccount;
        try {
            serviceAccount = new FileInputStream("claveFirebase.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            System.out.println("se conecto");
        }catch (Exception e){
            System.out.println(" " + e);
        }
    } 
}
