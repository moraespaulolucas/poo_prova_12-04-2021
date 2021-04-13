package br.com.moraespaulolucas.prj_exercicio01.model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Pedra> mao = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedra> getMao() {
        return mao;
    }

    public void setMao(List<Pedra> mao) {
        this.mao = mao;
    }
}
