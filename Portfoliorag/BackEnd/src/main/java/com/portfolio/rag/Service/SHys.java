/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.rag.Service;

import com.portfolio.rag.Entity.Hys;
import com.portfolio.rag.Repository.RHys;
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
public class SHys {
    @Autowired
    RHys rHys;
     
     public List<Hys> list(){
         return rHys.findAll();
     }
     
     public Optional<Hys> getOne(int id){
         return rHys.findById(id);
     }
     
     public Optional<Hys> getByNombrehys(String nombrehys){
         return rHys.findByNombrehys(nombrehys);
     }
     
     public void save(Hys h){
         rHys.save(h);
     }
     
     public void delete(int id){
         rHys.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rHys.existsById(id);
     }
     
     public boolean existsByNombrehys(String nombrehys){
         return rHys.existsByNombrehys(nombrehys);
     }
    
}
