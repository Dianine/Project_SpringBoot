package com.dianinec.cursomc.categoria;

import com.dianinec.cursomc.dto.DtoPersonalizado;
import com.dianinec.cursomc.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    @Query("SELECT new com.dianinec.cursomc.dto.DtoPersonalizado (c.nome, p.produtoNome) FROM Categoria c JOIN c.produtos p")
    public List<DtoPersonalizado> getJoinInformation();
}
