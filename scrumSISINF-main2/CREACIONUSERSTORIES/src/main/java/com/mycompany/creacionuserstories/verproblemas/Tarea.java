/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.verproblemas;

/**
 *
 * @author abcri
 */
public class Tarea {
    private String id;
    private String nombre;
    private String fechaEntrega;
    private String fechaCreacion;
    private String descripcion;

    public Tarea(String id, String nombre,String descripcion ,String fechaCreacion,String fechaEntrega) {
        this.id= id;
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.fechaCreacion= fechaCreacion;
        this.fechaEntrega= fechaEntrega;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    void setNota(double nota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Iterable<Estudiante> getEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
