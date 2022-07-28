/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.rag.Repository;

import com.portfolio.rag.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Augusto
 */
@Repository
public interface RBanner extends JpaRepository<Banner, Integer>{
    public Optional<Banner> findByImagenB(String imagenB);
    public boolean existsByImagenB(String imagenB);
}
