package com.dianinec.cursomc.categoria;

import com.dianinec.cursomc.model.Categoria;
import com.dianinec.cursomc.model.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class CategoriaServiceTest {

    @InjectMocks
    private CategoriaService service;
    @Mock
    private CategoriaRepository repository;

    private Categoria categoria;
    private Produto produto;
    @BeforeEach
    void setUp() {
        produto = new Produto(1, "teste",12.0,12);
        categoria = new Categoria(1,"categoria", List.of(produto));
    }

    @Test
    void create() {
        Mockito.when(repository.save(categoria)).thenReturn(categoria);
        service.create(categoria);
        Mockito.verify(repository,Mockito.times(0)).findById(Mockito.anyInt());
    }

    @Test
    void lista() {
        Mockito.when(repository.findAll()).thenReturn(List.of(categoria));
        Assertions.assertEquals(service.lista(), List.of(categoria));
    }

    @Test
    void findById() {
    }

    @Test
    void get() {
    }
}