package com.agape.squad6.repository;

import com.agape.squad6.model.cobranca.Cobranca;
import com.agape.squad6.model.cobranca.CobrancaId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CobrancaRepository extends JpaRepository<Cobranca, CobrancaId> {
    List<Cobranca> findAllByIdAgcCodigoAndArrecadacaoIdArrCodigo(Integer agcCodigo, Integer arrCodigo);
}
