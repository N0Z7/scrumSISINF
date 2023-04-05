//import static com.mycompany.sprint.ConexionFB.db;
package com.mycompany.creacionuserstories;

public class CREACIONUSERSTORIES {

    public static void main(String[] args) {
        ConexionFB conectar = new ConexionFB();
        conectar.conectarFb();
        MenuInterfaz menu = new MenuInterfaz();
        menu.setVisible(true);
    }
}
