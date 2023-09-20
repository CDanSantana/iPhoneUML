package br.org.cDanSantana.meuFone.telefone;

// Implementação do aparelho telefônico
public class Telefone implements ITelefone {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acessando a caixa postal");
    }
}