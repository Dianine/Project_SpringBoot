package com.dianinec.cursomc.categoria;

import com.dianinec.cursomc.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public void create(Categoria categoria) {
        repository.save(categoria);
    }
    public List<Categoria> lista() {
        return repository.findAll();
    }
}
