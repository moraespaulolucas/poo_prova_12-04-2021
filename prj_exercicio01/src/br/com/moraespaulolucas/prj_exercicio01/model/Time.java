package br.com.moraespaulolucas.prj_exercicio01.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int idTime;
    private String nomeTime;
    private List<Jogador> jogadores = new ArrayList<>();

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void imprimirTime() {
        System.out.println("Time: "+ this.nomeTime);
        System.out.println("ID: "+ this.idTime);
    }

    public void listarJogadores() {
        for(Jogador j : this.jogadores) {
            j.imprimirJogador();
            System.out.println();
        }
    }
}
