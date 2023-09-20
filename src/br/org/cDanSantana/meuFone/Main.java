package br.org.cDanSantana.meuFone;

import br.org.cDanSantana.meuFone.versao.MeuFoneZero;

public class Main {
    public static void main(String[] args) {
        MeuFoneZero meuFone = new MeuFoneZero();

        meuFone.reproduzir();
        meuFone.selecionarMidia("Minha Música");
        meuFone.parar();
        meuFone.reproduzir();
        meuFone.parar();

        meuFone.exibirPagina("https://meufonezero.cdansantana.org.br");
        meuFone.adicionarNovaAba();
        meuFone.atualizarPagina();
        meuFone.alternarAba(0);
        meuFone.atualizarPagina();

        meuFone.ligar("12345678900");
        meuFone.atender();
        meuFone.iniciarCorreioVoz();
    }
}
