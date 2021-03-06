package com.dianinec.cursomc.produto;

import com.dianinec.cursomc.model.Produto;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @ApiOperation(value = "Cria Produto")
    @PostMapping("/produto")
    @ResponseStatus(HttpStatus.CREATED)
    public void criar(@RequestBody Produto produto){
        service.criar(produto);
    }
    @GetMapping("/produtos")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listar(){
        return service.listar();
    }
}
