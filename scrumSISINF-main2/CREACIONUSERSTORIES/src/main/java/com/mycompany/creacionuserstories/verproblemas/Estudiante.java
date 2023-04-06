/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.verproblemas;

/**
 *
 * @author Lizbeth Hualca
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;

    public Estudiante(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
