package com.agape.squad6.controller;


import com.agape.squad6.model.cobranca.Cobranca;
import com.agape.squad6.model.cobranca.exceptions.CobrancaNotFoundException;
import com.agape.squad6.service.CobrancasService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cobrancas")
@RequiredArgsConstructor
public class CobrancaController {

    private final CobrancasService cobrancasService;

    @Operation(
            summary = "Recuperar Cobranca da Arrecadação",
            description = "Endpoint que recupera todas as cobranças de uma arrecadação pelo id do Cliente e id da Arrecadação",
            tags = "Currencies"
    )
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/{clienteId}/{arrecadacaoId}")
    public ResponseEntity<?> findAllCobrancaById(@PathVariable Integer clienteId, Integer arrCodigo) {
        try{
            List<Cobranca> cobrancas = cobrancasService.findAllCobrancaById(clienteId, arrCodigo);
            return ResponseEntity.ok(cobrancas);
        } catch (CobrancaNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }

}
