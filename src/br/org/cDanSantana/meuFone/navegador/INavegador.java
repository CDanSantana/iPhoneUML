package br.org.cDanSantana.meuFone.navegador;

// Interface para o navegador na Internet
public interface INavegador {
    String exibirPagina(String url);
    boolean adicionarNovaAba();
    boolean atualizarPagina();
    int alternarAba(int indice);
}