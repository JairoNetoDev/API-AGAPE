package com.agape.squad6.controller;

import com.agape.squad6.model.arrecadacoes.exceptions.ArrecadacaoNotFoundException;
import com.agape.squad6.service.ArrecadacoesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arrecadacoes")
@RequiredArgsConstructor
public class ArrecadacaoController {
    private final ArrecadacoesService arrecadacaoService;


    @Operation(
            summary = "Recuperar Arrecadações do Cliente",
            description = "Endpoint que recupera as arrecadações do cliente pelo id do cliente, ano, código do tributo e codigo da pessoa",
            tags = "Currencies"
    )
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/{clienteId}/{anoArrecadacao}/{codigoTributo}/{pessoaCodigo}")
    public ResponseEntity<?> findArrecadacaoById(@PathVariable Integer clienteId, Integer anoArrecadacao, Integer codigoTributo, Integer codigoPessoa){


        try{
            return ResponseEntity.ok(arrecadacaoService.findArrecadacaoById(clienteId, anoArrecadacao, codigoTributo, codigoPessoa));
        } catch (ArrecadacaoNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }

}
