package com.dianinec.cursomc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @OneToMany(targetEntity = Produto.class,
             fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_da_Categoria", referencedColumnName = "id")
    private List<Produto> produtos;



}
