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
public class dtoHys {
    @NotBlank
    private String nombrehys;
    @NotBlank
    private String porcentajehys;
    
    public dtoHys() {
    }

    public dtoHys(String nombrehys, String porcentajehys) {
        this.nombrehys = nombrehys;
        this.porcentajehys = porcentajehys;
        
    }
   
    public String getNombrehys() {
        return nombrehys;
    }

    public void setNombrehys(String nombrehys) {
        this.nombrehys = nombrehys;
    }

    
    public String getPorcentajehys() {
        return porcentajehys;
    }
    
    public void setPorcentajehys(String porcentajehys) {
        this.porcentajehys = porcentajehys;
    }
}
