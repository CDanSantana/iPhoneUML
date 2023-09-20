package br.org.cDanSantana.meuFone.midia;

// Interface para o reprodutor de música
public interface IMidia {
    boolean reproduzir();
    boolean parar();
    String selecionarMidia(String midia);
}