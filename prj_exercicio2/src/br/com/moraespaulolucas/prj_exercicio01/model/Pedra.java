package br.com.moraespaulolucas.prj_exercicio01.model;

public class Pedra {
    private static int valorMAX = 6;
    private static int range = 7;

    private int valorA;
    private int valorB;

    public static int getValorMAX() {
        return valorMAX;
    }

    public static int getRange() {
        return range;
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

    @Override
    public String toString() {
        return "Pedra{" +
                "valorA=" + valorA +
                ", valorB=" + valorB +
                '}';
    }
}
