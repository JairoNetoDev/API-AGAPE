package com.agape.squad6.service;

import com.agape.squad6.model.arrecadacoes.Arrecadacao;
import com.agape.squad6.model.arrecadacoes.exceptions.ArrecadacaoNotFoundException;
import com.agape.squad6.repository.ArrecadacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArrecadacoesService{
    private final ArrecadacaoRepository arrecadacaoRepository;

    public List<Arrecadacao> findArrecadacaoById(Integer agcCodigo, Integer ano, Integer codigoTributo, Integer codigoPessoa) {
        List<Arrecadacao> arrecadacoes = arrecadacaoRepository.findAllByIdAgcCodigoAndIdExeAnoAndTributoIdTriCodigoAndPessoaIdPesCodigo(agcCodigo, ano, codigoTributo, codigoPessoa);

        if(arrecadacoes.isEmpty()) {
            throw new ArrecadacaoNotFoundException("Nenhuma arrecadação foi encontrada para o cliente de ID " + agcCodigo);
        }

        return arrecadacaoRepository.findAllByIdAgcCodigoAndIdExeAnoAndTributoIdTriCodigoAndPessoaIdPesCodigo(agcCodigo, ano, codigoTributo, codigoPessoa);
    }



//    public Arrecadacao findArrecadacaoForImpressao(Integer agcCodigo, Integer ano, Integer codigoTributo, Integer codigoPessoa) {
//        return arrecadacaoRepository.findByIdAgcCodigoAndIdExeAnoAndTributoIdTriCodigoAndPessoaIdPesCodigo(agcCodigo, ano, codigoTributo, codigoPessoa);
//    }
}
