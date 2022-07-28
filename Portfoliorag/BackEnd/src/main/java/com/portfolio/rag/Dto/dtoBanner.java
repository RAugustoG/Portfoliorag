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
public class dtoBanner {
    @NotBlank
    private String imagenB;
    
    public dtoBanner() {
    }

    public dtoBanner(String imagenB) {
        this.imagenB = imagenB;
    }
   
        
    public String getImagenB() {
        return imagenB;
    }
    
    public void setImagenB(String imagenB) {
        this.imagenB = imagenB;
    }
    
}
