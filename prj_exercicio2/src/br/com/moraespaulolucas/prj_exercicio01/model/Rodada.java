package br.com.moraespaulolucas.prj_exercicio01.model;

import java.util.ArrayList;
import java.util.List;

public class Rodada {
    private List<Jogador> jogadores = new ArrayList<>();
    private List<Pedra> monte = new ArrayList<>();

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Pedra> getMonte() {
        return monte;
    }

    public void setMonte(List<Pedra> monte) {
        this.monte = monte;
    }
}
