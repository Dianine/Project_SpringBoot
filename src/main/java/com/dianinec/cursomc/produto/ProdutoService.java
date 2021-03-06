package com.dianinec.cursomc.produto;

import com.dianinec.cursomc.exception.NotFoundException;
import com.dianinec.cursomc.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public void criar(Produto produto) {
        repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto buscarProdutoPorId(Integer id){
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.valueOf(id)));
    }
}
