package com.dianinec.cursomc.categoria;

import com.dianinec.cursomc.dto.DtoPersonalizado;
import com.dianinec.cursomc.exception.NotFoundException;
import com.dianinec.cursomc.model.Categoria;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
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

    public Categoria findById(Integer id) {
        return repository.findById(id).orElseThrow(()->
                new NotFoundException("Não encontrado"));

    }

    public List<DtoPersonalizado> get() { return repository.getJoinInformation();
    }
}
