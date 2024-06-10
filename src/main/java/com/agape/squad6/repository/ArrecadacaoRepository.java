package com.agape.squad6.repository;

import com.agape.squad6.model.arrecadacoes.Arrecadacao;
import com.agape.squad6.model.arrecadacoes.ArrecadacaoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArrecadacaoRepository extends JpaRepository<Arrecadacao, ArrecadacaoId> {

    List<Arrecadacao> findAllByIdAgcCodigoAndIdExeAnoAndTributoIdTriCodigoAndPessoaIdPesCodigo(Integer agcCodigo, Integer ano, Integer codigoTributo, Integer codigoPessoa);
//        Arrecadacao findByIdAgcCodigoAndIdExeAnoAndTributoIdTriCodigoAndPessoaIdPesCodigo(Integer agcCodigo, Integer ano, Integer codigoTributo, Integer codigoPessoa);

}

