package br.com.moraespaulolucas.prj_exercicio01.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int idTime;
    private String nomeTime;
    private List<Jogador> jogadores = new ArrayList<>();

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void listarJogadores() {
        for(Jogador j : this.jogadores) {
            j.imprimirJogador();
        }
    }
}
