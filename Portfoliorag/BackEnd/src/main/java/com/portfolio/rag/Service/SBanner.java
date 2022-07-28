/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.rag.Service;

import com.portfolio.rag.Entity.Banner;
import com.portfolio.rag.Repository.RBanner;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Augusto
 */
@Service
@Transactional
public class SBanner {
    @Autowired
     RBanner rBanner;
     
     public List<Banner> list(){
         return rBanner.findAll();
     }
     
     public Optional<Banner> getOne(int id){
         return rBanner.findById(id);
     }
     
     public Optional<Banner> getByImagenB(String imagenB){
         return rBanner.findByImagenB(imagenB);
     }
     
     public void save(Banner ban){
         rBanner.save(ban);
     }
     
     public void delete(int id){
         rBanner.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rBanner.existsById(id);
     }
     
     public boolean existsByImagenB(String imagenB){
         return rBanner.existsByImagenB(imagenB);
     }
}
