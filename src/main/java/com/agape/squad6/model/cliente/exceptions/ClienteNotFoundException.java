package com.agape.squad6.model.cliente.exceptions;

public class ClienteNotFoundException extends RuntimeException{
    public ClienteNotFoundException(String message){
        super(message);
    }
}
