package com.agape.squad6.model.tributo.exceptions;

public class TributoNotFoundException extends RuntimeException{
    public TributoNotFoundException(String message){
        super(message);
    }
}
