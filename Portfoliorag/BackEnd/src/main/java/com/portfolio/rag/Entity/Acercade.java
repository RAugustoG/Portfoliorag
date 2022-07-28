/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.rag.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Augusto
 */
@Entity
public class Acercade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreA;
    private String tituloA;
    private String acercadeA;
    private String imagenA;
    
   
    public Acercade() {
    }

    public Acercade(String nombreA, String tituloA, String acercadeA, String imagenA) {
        this.nombreA = nombreA;
        this.tituloA = tituloA;
        this.acercadeA = acercadeA;
        this.imagenA = imagenA;
    }
    
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getTituloA() {
        return tituloA;
    }

    public void setTituloA(String tituloA) {
        this.tituloA = tituloA;
    }
    
    public String getAcercadeA() {
        return acercadeA;
    }

    public void setAcercadeA(String acercadeA) {
        this.acercadeA = acercadeA;
    }
    
    public String getImagenA() {
        return imagenA;
    }

    public void setImagenA(String imagenA) {
        this.imagenA = imagenA;
    }
}
