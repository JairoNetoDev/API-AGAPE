package com.agape.squad6.model.cobranca.exceptions;

public class CobrancaNotFoundException extends RuntimeException{
    public CobrancaNotFoundException(String message){
        super(message);
    }
}
