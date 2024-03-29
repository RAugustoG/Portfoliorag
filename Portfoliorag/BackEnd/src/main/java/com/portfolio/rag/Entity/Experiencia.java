/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.rag.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String fechadesdeE;
    private String fechahastaE;
    private String imagenE;
    
   
    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String fechadesdeE, String fechahastaE, String imagenE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechadesdeE = fechadesdeE;
        this.fechahastaE = fechahastaE;
        this.imagenE = imagenE;
    }
    
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    public String getFechadesdeE() {
        return fechadesdeE;
    }

    public void setFechadesdeE(String fechadesdeE) {
        this.fechadesdeE = fechadesdeE;
    }
    
    public String getFechahastaE() {
        return fechahastaE;
    }

    public void setFechahastaE(String fechahastaE) {
        this.fechahastaE = fechahastaE;
    } 
    
    public String getImagenE() {
        return imagenE;
    }

    public void setImagenE(String imagenE) {
        this.imagenE = imagenE;    
    }
    
}
