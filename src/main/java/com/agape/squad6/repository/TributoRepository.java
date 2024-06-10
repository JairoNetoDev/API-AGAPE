package com.agape.squad6.repository;

import com.agape.squad6.model.tributo.Tributo;
import com.agape.squad6.model.tributo.TributoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TributoRepository extends JpaRepository<Tributo, TributoId> {
    List<Tributo> findAllByIdAgcCodigo(Integer clienteId);
}
