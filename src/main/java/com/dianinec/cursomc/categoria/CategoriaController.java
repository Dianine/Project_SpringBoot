package com.dianinec.cursomc.categoria;

import com.dianinec.cursomc.dto.DtoPersonalizado;
import com.dianinec.cursomc.model.Categoria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
@Api(value = "API REST - DIANINE")
@CrossOrigin(origins = "*")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @ApiOperation(value = "Cria Categoria")
    @PostMapping("/categoria")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Categoria categoria) {
        service.create(categoria);
    }

    @ApiOperation(value = "Lista as Categorias")
    @GetMapping("/categorias")
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> lista() {
        return service.lista();
    }

    @ApiOperation(value = "Nome da Categoria e Produto")
    @GetMapping("/getInfo")
    @ResponseStatus(HttpStatus.OK)
    public List<DtoPersonalizado> getJoinInformation() {
        return service.get();
    }

    @ApiOperation(value = "Categoria Id")
    @GetMapping("/categoria{id}")
    @ResponseStatus(HttpStatus.OK)
    public Categoria findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }
}