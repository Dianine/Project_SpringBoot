package com.dianinec.cursomc.categoria;

import com.dianinec.cursomc.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping("/categoria")
    @ResponseStatus(HttpStatus.OK)
    public void create (@RequestBody Categoria categoria){
       service.create(categoria);
    }
    @GetMapping("/categorias")
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> lista(){
        return service.lista();
    }
}
