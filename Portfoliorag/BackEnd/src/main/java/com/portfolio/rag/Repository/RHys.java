/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.rag.Repository;

import com.portfolio.rag.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Augusto
 */
@Repository
public interface RHys extends JpaRepository<Hys, Integer>{
    public Optional<Hys> findByNombrehys(String nombrehys);
    public boolean existsByNombrehys(String nombrehys);
}
