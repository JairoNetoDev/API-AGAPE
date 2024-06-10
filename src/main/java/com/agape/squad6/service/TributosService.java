package com.agape.squad6.service;

import com.agape.squad6.model.tributo.Tributo;
import com.agape.squad6.model.tributo.exceptions.TributoNotFoundException;
import com.agape.squad6.repository.TributoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TributosService {
    private final TributoRepository tributoRepository;

    public List<Tributo> findTributoById(Integer clienteId) {
        List<Tributo> tributos = tributoRepository.findAllByIdAgcCodigo(clienteId);

        if(tributos.isEmpty()) {
            throw new TributoNotFoundException("Nenhum tributo foi encontrado para o cliente de ID " + clienteId);
        }

        return tributoRepository.findAllByIdAgcCodigo(clienteId);
    }


}
