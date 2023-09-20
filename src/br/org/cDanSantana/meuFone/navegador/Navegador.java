package br.org.cDanSantana.meuFone.navegador;

import java.util.ArrayList;
import java.util.List;

// Implementação do navegador
public class Navegador implements INavegador {
    private List<String> urls;
    private Integer urlAtual;

    public Navegador() {
        this.urls = new ArrayList<>();
        this.urlAtual = -1;
    }

    @Override
    public String exibirPagina(String url) {
        if (this.urlAtual >= 0 && this.urlAtual < this.urls.size()) {
            if (this.urls.get(this.urlAtual).isEmpty()) {
                this.urls.set(this.urlAtual, url);
                System.out.println("Nova página carregada: " + url);
            } else {
                this.urls.add(url);
                this.urlAtual = this.urls.size() - 1;
                System.out.println("Página carregada: " + url);
            }
            return this.urls.get(this.urlAtual);
        } else {
            this.urls.add(url);
            this.urlAtual = this.urls.size() - 1;
            System.out.println("Página carregada: " + url);
            return this.urls.get(this.urlAtual);
        }
    }

    @Override
    public boolean adicionarNovaAba() {
        this.urls.add("");
        this.urlAtual++;
        System.out.println("Quantidade de abas abertas: " + (this.urlAtual + 1));
        return true;
    }

    @Override
    public boolean atualizarPagina() {
        if (this.urlAtual >= 0 && this.urlAtual < this.urls.size()) {
            String currentUrl = this.urls.get(this.urlAtual);
            if (!currentUrl.isEmpty()) {
                System.out.println("Página atualizada: " + currentUrl);
            } else {
                System.out.println("Não há página carregada nesta aba para atualizar.");
            }
            return true;
        } else {
            System.out.println("Não há abas abertas para atualizar.");
            return false;
        }
    }

    @Override
    public int alternarAba(int indice) {
        if (indice >= 0 && indice < this.urls.size()) {
            this.urlAtual = indice;
            System.out.println("Alternando para a aba " + (indice + 1));
            return this.urlAtual;
        } else {
            System.out.println("A aba especificada não existe.");
            return -1;
        }
    }
}
