package com.agape.squad6.model.usuarios.exceptions;

public class UsuarioExistenteException extends RuntimeException{
    public UsuarioExistenteException(String message) {
        super(message);
    }
}
