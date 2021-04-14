package br.com.moraespaulolucas.prj_exercicio01.model;

public class Jogador {
    private int idJogador;
    private String nomeJogador;
    private Posicao posicao;
    private int numCamisa;

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public void imprimirJogador() {
        System.out.println("idJogador: " + this.idJogador);
        System.out.println("Nome: " + this.nomeJogador);
        System.out.println("Posicao: " + this.posicao);
        System.out.println("Numero da camisa: " + this.numCamisa);
    }
}
