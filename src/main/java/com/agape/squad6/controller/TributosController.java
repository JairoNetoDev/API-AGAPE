package com.agape.squad6.controller;

import com.agape.squad6.model.tributo.Tributo;
import com.agape.squad6.model.tributo.exceptions.TributoNotFoundException;
import com.agape.squad6.service.TributosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tributos")
@RequiredArgsConstructor
public class TributosController {

    private final TributosService tributosService;

    @GetMapping("/{tributoId}/{clienteId}")
    @SecurityRequirement(name = "bearerAuth")
    @Operation(
            summary = "Recuperar Tributos",
            description = "Método que retorna todos os tributos de uma cliente",
            tags = "Currencies"
    )
    public ResponseEntity<?> findTributoByCliente(@PathVariable Integer clienteId) {
        try{
            List<Tributo> tributos = tributosService.findTributoById(clienteId);
            return ResponseEntity.ok(tributos);
        } catch (TributoNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
}
