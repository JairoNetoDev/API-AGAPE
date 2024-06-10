package com.agape.squad6.model.pessoa.exceptions;

public class PessoaNotFoundException extends RuntimeException{
        public PessoaNotFoundException(String message){
            super(message);
        }
}
