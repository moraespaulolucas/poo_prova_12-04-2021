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

    private

    // o método só recebe um array e não um vetor,
    // pois não há como os número se repetirem em diferentes linhas.
    // portanto, só preciso verificar se ele se repete na mesma linha
    boolean verificaNum(int num, int[] array) {
        boolean r = false;
        int j;
        for (j = 0; j < array.length; j++) {
            if (array[j] == num)
                r = true;
        }
        return r;
    }

    public void preencherCartela () {
        int i, j, numTmp;
        Random random = new Random();
        for(i = 0; i < this.size; i++) {
            for (j = 0; j < this.size; j++) {

                // verifica se está no meio da cartela
                if ((i == this.size / 2) && (j == this.size / 2))
                    continue;

                // verifica se o numero ja existe
                do{
                    numTmp = this.inc + random.nextInt(this.range);
                }while (this.verificaNum(numTmp, this.valores[i]));

                // insere o valor na posição
                this.valores[i][j] = numTmp;
            }
            this.inc += this.range;
        }
    }

    public void imprimirCartela() {
        int i, j;
        System.out.println("Cartela");
        for(i = 0; i<this.size; i++) {
            System.out.printf("{");
            for (j = 0; j < this.size; j++) {
                // verifica se está no meio da cartela
                if ((i == this.size / 2) && (j == this.size / 2)) {
                    System.out.printf(" X");
                    continue;
                }
                System.out.printf(" %d", this.valores[i][j]);
            }
            System.out.println(" }");
        }
    }
}