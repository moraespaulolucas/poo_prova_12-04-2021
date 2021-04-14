package br.com.moraespaulolucas.prj_exercicio01;

import br.com.moraespaulolucas.prj_exercicio01.model.Monte;
import br.com.moraespaulolucas.prj_exercicio01.model.Pedra;

public class GerenciarJogo {

    public static void main(String[] args) {
        Monte monte = new Monte();
        System.out.println("DOMINÓ");
        System.out.println("Pedras na ordem");
        for(Pedra pedra : monte.exibir()) {
            System.out.println(pedra.toString());
        }
        monte.embaralhar();
        System.out.println("Pedras embaralhadas");
        for(Pedra pedra : monte.exibir()) {
            System.out.println(pedra.toString());
        }
    }
}