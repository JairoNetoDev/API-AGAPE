package com.agape.squad6.dto;

import java.util.List;

public record ClienteDetails(
        Integer agcCodigo,
        String agcNome,
        String agcContato,
        String agcRg,
        String agcCnpj,
        List<PessoaDetails> list) {}