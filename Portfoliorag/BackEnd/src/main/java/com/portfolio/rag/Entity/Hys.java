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
public class Hys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrehys;
    private String porcentajehys;
    
    public Hys() {
    }
    
    public Hys(String nombrehys, String porcentajehys) {
        this.nombrehys = nombrehys;
        this.porcentajehys = porcentajehys;
        
    }
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
