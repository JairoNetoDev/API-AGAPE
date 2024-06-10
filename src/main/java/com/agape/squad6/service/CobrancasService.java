package com.agape.squad6.service;

import com.agape.squad6.model.cobranca.Cobranca;
import com.agape.squad6.model.cobranca.exceptions.CobrancaNotFoundException;
import com.agape.squad6.repository.CobrancaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CobrancasService {
    private final CobrancaRepository cobrancaRepository;

    public List<Cobranca> findAllCobrancaById(Integer clienteId, Integer arrCodigo) {
        List<Cobranca> cobrancas = cobrancaRepository.findAllByIdAgcCodigoAndArrecadacaoIdArrCodigo(clienteId, arrCodigo);
        if (cobrancas.isEmpty()) {
            throw new CobrancaNotFoundException("Nenhuma cobrança foi encontrada da Arrecadação de ID " + arrCodigo +
                    " do Cliente " + clienteId );
        }
        return cobrancaRepository.findAllByIdAgcCodigoAndArrecadacaoIdArrCodigo(clienteId, arrCodigo);
    }

}
