package com.projetoiphonemaxwell;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setUsuario("Iphone do Maxwell");
        System.out.println("Usuário: " + iphone.getUsuario());

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.atender();
    }


    @Override
    public void ligar() {
        System.out.println("Ligando para ...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação ...");
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Iniciando Correio de Voz ...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página do Navegador ...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba do Navegador ...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a Página do Navegador ...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música ...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música ...");
    }


}
