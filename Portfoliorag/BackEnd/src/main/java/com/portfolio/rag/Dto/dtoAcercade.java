/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.rag.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Augusto
 */
public class dtoAcercade {
    @NotBlank
    private String nombreA;
    @NotBlank
    private String tituloA;
    @NotBlank
    private String acercadeA;
    @NotBlank
    private String imagenA;
    
    public dtoAcercade() {
    }

    public dtoAcercade(String nombreA, String tituloA, String acercadeA, String imagenA) {
        this.nombreA = nombreA;
        this.tituloA = tituloA;
        this.acercadeA = acercadeA;
        this.imagenA = imagenA;
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
