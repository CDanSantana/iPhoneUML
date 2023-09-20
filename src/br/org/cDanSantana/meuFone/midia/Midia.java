package br.org.cDanSantana.meuFone.midia;

// Implementação do reprodutor de música
public class Midia implements IMidia {
    private String midiaAtual = "";

    @Override
    public boolean reproduzir() {
        if(!this.midiaAtual.isEmpty()) System.out.println("Reproduzindo: " + this.midiaAtual);
        else System.out.println("Não existe nenhuma mídia selecionada");
        return !this.midiaAtual.isEmpty() ? true : false;
    }

    @Override
    public boolean parar() {
        if(!this.midiaAtual.isEmpty()) System.out.println("Parando: " + this.midiaAtual);
        else System.out.println("Não existe nenhuma mídia selecionada");
        return !this.midiaAtual.isEmpty() ? true : false;
    }

    @Override
    public String selecionarMidia(String midia) {
        this.midiaAtual = midia.toUpperCase();
        System.out.println(this.midiaAtual + " selecionada");
        return this.midiaAtual;
    }
}