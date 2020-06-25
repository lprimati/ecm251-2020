package com.company.Excecoes;

import java.util.PrimitiveIterator;

public class ErroDeID  extends Exception{

    private static final long versaoID = 1L;
    public ErroDeID(){
        super();
    }

    public ErroDeID(String mensagem){
        super(mensagem);
    }
    public ErroDeID(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
