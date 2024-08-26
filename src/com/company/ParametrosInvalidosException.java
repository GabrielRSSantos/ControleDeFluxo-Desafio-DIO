package com.company;

public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException() {
        super();
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    public ParametrosInvalidosException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public ParametrosInvalidosException(Throwable causa) {
        super(causa);
    }
}
