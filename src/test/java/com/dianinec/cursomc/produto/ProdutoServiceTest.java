package com.dianinec.cursomc.produto;

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

import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {
    @InjectMocks
    private ProdutoService produtoService;
    @Mock
    private ProdutoRepository produtoRepository;

    private Produto produto;
    @BeforeEach
    void setUp() {
        produto = new Produto(1, "teste",12.0,12);
    }

    @Test
    void listar() {
        when(produtoRepository.findAll()).thenReturn(List.of(produto));
        assertEquals(produtoService.listar(),List.of(produto));


    }

    @Test
    void criar() {
        when(produtoRepository.save(produto)).thenReturn(produto);
        produtoService.criar(produto);
        verify(produtoRepository,times(0)).findById(1);
    }

    @Test
    void buscarProdutoPorId(){
        when(produtoRepository.findById(anyInt())).thenReturn(ofNullable(produto));
        assertEquals(produtoService.buscarProdutoPorId(anyInt()),produto);
    }
}