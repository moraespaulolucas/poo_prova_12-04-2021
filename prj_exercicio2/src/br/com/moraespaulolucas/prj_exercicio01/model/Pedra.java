package br.com.moraespaulolucas.prj_exercicio01.model;

public class Pedra {
    private static final int valorMAX = 7;
    private int valorA;
    private int valorB;

    public static int getValorMAX() {
        return valorMAX;
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
}
