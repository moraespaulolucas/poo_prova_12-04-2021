package br.com.moraespaulolucas.prj_exercicio01;

import br.com.moraespaulolucas.prj_exercicio01.model.Jogador;
import br.com.moraespaulolucas.prj_exercicio01.model.Time;

public class GerenciarJogo {

    public static void main(String[] args) {
        Time time = new Time();
        time.setIdTime(1);
        time.setNomeTime("Santos");

        Jogador j1 = new Jogador();
        j1.setIdJogador(1);
        j1.setNomeJogador("Marinho");
        j1.setPosicao("Atacante");
        j1.setNumCamisa(11);

        Jogador j2 = new Jogador();
        j2.setIdJogador(2);
        j2.setNomeJogador("Soteldo");
        j2.setPosicao("Meio-campista");
        j2.setNumCamisa(10);

        Jogador j3 = new Jogador();
        j3.setIdJogador(3);
        j3.setNomeJogador("Alison");
        j3.setPosicao("Volante");
        j3.setNumCamisa(5);

        time.addJogador(j1);
        time.addJogador(j2);
        time.addJogador(j3);
        time.listarJogadores();
    }
}
