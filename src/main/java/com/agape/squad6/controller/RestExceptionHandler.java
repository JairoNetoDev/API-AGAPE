package com.agape.squad6.controller;

import com.agape.squad6.model.arrecadacoes.exceptions.ArrecadacaoNotFoundException;
import com.agape.squad6.model.authentication.exceptions.LoginOrPasswordNotFound;
import com.agape.squad6.model.cliente.exceptions.ClienteNotFoundException;
import com.agape.squad6.model.pessoa.Pessoa;
import com.agape.squad6.model.pessoa.exceptions.PessoaNotFoundException;
import com.agape.squad6.model.usuarios.exceptions.UsuarioExistenteException;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    //VOU DEIXAR APENAS ESSE COMO TESTE DE CONTROLLER EXCEPTIONS

    @ExceptionHandler(UsuarioExistenteException.class)
    public ResponseEntity<?> handleUsuarioExistenteException(UsuarioExistenteException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(ClienteNotFoundException.class)
    public ResponseEntity<?> ClienteNotFoundException(ClienteNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(PessoaNotFoundException.class)
    public ResponseEntity<?> PessoaNotFoundException(PessoaNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(ArrecadacaoNotFoundException.class)
    public ResponseEntity<?> ArrecadacaoNotFoundException(ArrecadacaoNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(LoginOrPasswordNotFound.class)
    public ResponseEntity<?> handleLoginOrPasswordNotFound(LoginOrPasswordNotFound ex) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
    }
}