package com.dianinec.cursomc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @OneToMany (targetEntity = Produto.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_da_Categoria", referencedColumnName = "id")
    private List<Produto> produtos;


   }
