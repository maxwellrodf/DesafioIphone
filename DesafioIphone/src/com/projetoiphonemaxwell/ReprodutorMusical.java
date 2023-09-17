package com.projetoiphonemaxwell;

public interface ReprodutorMusical {


    public default void tocarMusica(){
        System.out.println("Tocando musica ...");
    }

    public default void pausarMusica(){
        System.out.println("Pausando musica ...");
    }

    public default void selecionarMusica(){
        System.out.println("Selecionando musica ...");
    }






}
