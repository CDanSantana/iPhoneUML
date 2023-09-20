package br.org.cDanSantana.meuFone.versao;

import br.org.cDanSantana.meuFone.navegador.*;
import br.org.cDanSantana.meuFone.telefone.*;
import br.org.cDanSantana.meuFone.midia.*;

// Classe MeuPhone
// versão zero
public class MeuFoneZero {
    private IMidia midia;
    private ITelefone telefone;
    private INavegador navegador;

    public MeuFoneZero(IMidia midia, ITelefone telefone, INavegador navegador) {
        this.midia = midia;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public MeuFoneZero() {
        this.midia = new Midia();
        this.telefone = new Telefone();
        this.navegador = new Navegador();
    }

    public boolean reproduzir() {
        return this.midia.reproduzir();
    }
    public boolean parar() {
        return this.midia.parar();
    }
    public String selecionarMidia(String midia) {
        return this.midia.selecionarMidia(midia);
    }

    public String exibirPagina(String url) {
        return this.navegador.exibirPagina(url);
    }
    public boolean adicionarNovaAba() {
        return this.navegador.adicionarNovaAba();
    }
    public boolean atualizarPagina() {
        return this.navegador.atualizarPagina();
    }
    public int alternarAba(int indice) {
        return this.navegador.alternarAba(indice);
    }

    public void ligar(String numero) {
        this.telefone.ligar(numero);
    }
    public void atender() {
        this.telefone.atender();
    }
    public void iniciarCorreioVoz() {
        this.telefone.iniciarCorreioVoz();
    }

}