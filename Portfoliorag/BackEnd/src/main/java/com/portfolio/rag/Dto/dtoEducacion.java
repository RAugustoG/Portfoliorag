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
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechadesdeE;
    @NotBlank
    private String fechahastaE;
    @NotBlank
    private String imagenE;
    
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String fechadesdeE, String fechahastaE, String imagenE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechadesdeE = fechadesdeE;
        this.fechahastaE = fechahastaE;
        this.imagenE = imagenE;
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
  

    public void setFechadesde(String fechadesdeE) {
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
