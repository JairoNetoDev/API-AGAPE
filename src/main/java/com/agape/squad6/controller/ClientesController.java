package com.agape.squad6.controller;


import com.agape.squad6.model.cliente.Cliente;
import com.agape.squad6.model.cliente.exceptions.ClienteNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.agape.squad6.service.ClientesService;

@RestController
@RequestMapping(value = "/clientes")
@RequiredArgsConstructor
public class ClientesController {


    private final ClientesService clientesService;


    @Operation(
            summary = "Recuperar dados do Cliente",
            description = "Endpoint que retorna todos os dados do cliente pelo seu id",
            tags = "Currencies"
    )
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/recuperar/{clienteId}")
    public ResponseEntity<?> getClienteById(@PathVariable String clienteId) {
        Cliente cliente = this.clientesService.findClienteById(clienteId);
        if(cliente == null){
            throw new ClienteNotFoundException("Cliente não encontrado com ID " + clienteId);
        }
        return ResponseEntity.ok(cliente);

    }

}


