package com.Riveras.dao;

import com.Riveras.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository <Categoria,Long>{
    
}