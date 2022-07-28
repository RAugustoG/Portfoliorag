/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.rag.Controller;

import com.portfolio.rag.Dto.dtoAcercade;
import com.portfolio.rag.Entity.Acercade;
import com.portfolio.rag.Security.Controller.Mensaje;
import com.portfolio.rag.Service.SAcercade;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Augusto
 */
@RestController
@RequestMapping("/acerca")
@CrossOrigin(origins = "http://localhost:4200")
public class CAcercade {
  @Autowired
    SAcercade sAcercade;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Acercade>> list(){
        List<Acercade> list = sAcercade.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acercade> getById(@PathVariable("id") int id){
        if(!sAcercade.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Acercade acercade = sAcercade.getOne(id).get();
        return new ResponseEntity(acercade, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sAcercade.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sAcercade.delete(id);
        return new ResponseEntity(new Mensaje("perfil eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcercade dtoacerca){      
        if(StringUtils.isBlank(dtoacerca.getNombreA()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sAcercade.existsByNombreA(dtoacerca.getNombreA()))
            return new ResponseEntity(new Mensaje("Ese perfil ya existe"), HttpStatus.BAD_REQUEST);
        
        Acercade acercade = new Acercade(dtoacerca.getNombreA(), dtoacerca.getTituloA(), dtoacerca.getAcercadeA(), dtoacerca.getImagenA());
        sAcercade.save(acercade);
        
        return new ResponseEntity(new Mensaje("Perfil agregado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAcercade dtoacerca){
        //Validamos si existe el ID
        if(!sAcercade.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sAcercade.existsByNombreA(dtoacerca.getNombreA()) && sAcercade.getByNombreA(dtoacerca.getNombreA()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese perfil ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoacerca.getNombreA()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Acercade acercade = sAcercade.getOne(id).get();
        acercade.setNombreA(dtoacerca.getNombreA());
        acercade.setTituloA((dtoacerca.getTituloA()));
        acercade.setAcercadeA(dtoacerca.getAcercadeA());
        acercade.setImagenA(dtoacerca.getImagenA());
        
        sAcercade.save(acercade);
        return new ResponseEntity(new Mensaje("Perfil actualizado"), HttpStatus.OK);
             
    }  
    
}
