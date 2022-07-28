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
public class dtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String fechaP;
    @NotBlank
    private String imagenP;
    @NotBlank
    private String urlP;
    
    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String fechaP, String imagenP, String urlP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.imagenP = imagenP;
        this.urlP = urlP;
   
    }   
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    public String getFechaP() {
        return fechaP;
    }
  

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }
    
    public String getImagenP() {
        return imagenP;
    }
    
    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }
    
    public String getUrlP() {
        return urlP;
    }
    
    public void setUrlP(String urlP) {
        this.urlP = urlP;
    }
}
