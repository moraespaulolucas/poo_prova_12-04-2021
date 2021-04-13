package br.com.moraespaulolucas.prj_exercicio01.model;

public class Jogador {
    private int idJogador;
    private String nomeJogador;
    private String posicao;
    private int numCamisa;

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public void imprimirJogador() {
        System.out.println("idJogador: " + idJogador);
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Posicao: " + posicao);
        System.out.println("Numero da camisa: " + numCamisa);
    }
}
