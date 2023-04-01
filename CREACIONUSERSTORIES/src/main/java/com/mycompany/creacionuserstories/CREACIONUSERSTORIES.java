//import static com.mycompany.sprint.ConexionFB.db;
package com.mycompany.creacionuserstories;

public class CREACIONUSERSTORIES {

    public static void main(String[] args) {
        ConexionFB conectar = new ConexionFB();
        conectar.conectarFb();
        InterfazPrincipal interfaz= new InterfazPrincipal();
        interfaz.setVisible(true);
    }
}
