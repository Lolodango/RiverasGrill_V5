package com.Riveras.service.impl;

import com.Riveras.dao.CategoriaDao;
import com.Riveras.domain.Categoria;
import com.Riveras.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null) ;
    
    }
    
    @Override
    @Transactional
    public void save(Categoria categoria){
        categoriaDao.save(categoria);//guardar o modificar el id (categoria)
    } 
    
    @Override
    @Transactional
    public void delete(Categoria categoria){
        categoriaDao.delete(categoria);//Eliminar el id (categoria)
    }
    
    
    
}
