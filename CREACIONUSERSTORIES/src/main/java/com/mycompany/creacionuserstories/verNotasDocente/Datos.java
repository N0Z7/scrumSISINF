/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionuserstories.verNotasDocente;

/**
 *
 * @author Usuario
 */
public class Datos {
    private String nombreEst;
    private String codSis;
    private String nota;
    
    public Datos(String nombreEst, String codSis, String nota){
        this.nombreEst = nombreEst;
        this.codSis = codSis;
        this.nota = nota;
    }
    
    public void setNombreEst(String nombreEst){
        this.nombreEst = nombreEst;
    }
    
    public void setCodSis(String codSis){
        this.codSis = codSis;
    }
    
    public void setNotas(String nota){
        this.nota = nota;
    }
    
    public String getNombreEst(){
        return nombreEst;
    }
    
    public String getCodSis(){
        return codSis;
    }
    
    public String getNota(){
        return nota;
    }
}
