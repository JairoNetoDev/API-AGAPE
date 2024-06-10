package com.agape.squad6.controller;

import com.agape.squad6.dto.PessoaResponseDTO;
import com.agape.squad6.model.pessoa.exceptions.PessoaNotFoundException;
import com.agape.squad6.service.PessoasService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoasController {

    private final PessoasService pessoasService;

    @Operation(
            summary = "Recuperar dados da Pessoa",
            description = "Endpoint que retorna todos os dados de uma pessoa física ou jurídica passando o CPF/CNPJ",
            tags = "Currencies"
    )
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/{pesCpfCnpj}")
    public ResponseEntity<?> encontrarPessoa(@PathVariable String pesCpfCnpj) {
        PessoaResponseDTO pessoaResponse = pessoasService.findByPesCpfCnpj(pesCpfCnpj);
        if(pessoaResponse == null){
            throw new PessoaNotFoundException("Pessoa de CPF/CNPJ " + pesCpfCnpj + " não foi encontrado.");
        }
        return ResponseEntity.ok(pessoaResponse);
    }

}