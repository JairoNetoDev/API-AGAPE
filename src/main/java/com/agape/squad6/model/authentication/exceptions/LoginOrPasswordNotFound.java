package com.agape.squad6.model.authentication.exceptions;

public class LoginOrPasswordNotFound extends RuntimeException{
    public LoginOrPasswordNotFound(String message){
        super(message);
    }
}
