package com.projetoiphonemaxwell;

public interface AparelhoTelefonico {

    public default void ligar(){
        System.out.println("Ligando para fulando ...");
    }

    public default void atender(){
        System.out.println("Atendendo ligação ...");
    }

    public default void iniciarCorreiodeVoz(){
        System.out.println("Iniciando Correio de Voz ...");
    }


}
