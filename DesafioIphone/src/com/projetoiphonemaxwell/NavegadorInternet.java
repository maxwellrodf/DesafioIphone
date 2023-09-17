package com.projetoiphonemaxwell;

public interface NavegadorInternet {

    public default void exibirPagina(){
        System.out.println("Exibindo Pagina do Navegador ...");
    }

    public default void adicionarNovaAba(){
        System.out.println("Exibindo Nova Aba do Navegador ...");
    }

    public default void atualizarPagina(){
        System.out.println("Atualizando Pagina do Navegador ...");
    }

}
