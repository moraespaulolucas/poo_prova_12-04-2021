package br.com.moraespaulolucas.prj_exercicio03.model;

import java.util.Random;

public class Cartela {
    private static int size = 5;
    private static int range = 15;
    
    private int inc = 1;
    private int i;
    private int j;
    private int numTmp;

    private int[][] valores = new int[size][size];

    private Random random = new Random();

    // o método só recebe um array e não um vetor,
    // pois não há como os número se repetirem em diferentes linhas.
    // portanto, só preciso verificar se ele se repete na mesma linha
    private boolean verificaNum(int num, int[] array) {
        boolean r = false;
        int j;
        for (j = 0; j < array.length; j++) {
            if (array[j] == num)
                r = true;
        }
        return r;
    }

    public void preencherCartela () {
        for(this.i = 0; this.i < this.size; this.i++) {
            for (this.j = 0; this.j < this.size; this.j++) {

                // verifica se está no meio da cartela
                if ((this.i == this.size / 2) && (this.j == this.size / 2))
                    continue;

                // verifica se o numero ja existe
                do{
                    this.numTmp = this.inc + this.random.nextInt(range);
                }while (this.verificaNum(this.numTmp, this.valores[i]));

                // insere o valor na posição
                this.valores[this.i][this.j] = this.numTmp;
            }
            this.inc += this.range;
        }
    }

    public void imprimirCartela() {
        System.out.println("Cartela");
        for(this.i = 0; this.i<this.size; this.i++) {
            System.out.printf("{");
            for (this.j = 0; this.j < this.size; this.j++) {
                // verifica se está no meio da cartela
                if ((this.i == this.size / 2) && (this.j == this.size / 2)) {
                    System.out.printf(" X");
                    continue;
                }
                System.out.printf(" %d", this.valores[this.i][this.j]);
            }
            System.out.println(" }");
        }
    }
}