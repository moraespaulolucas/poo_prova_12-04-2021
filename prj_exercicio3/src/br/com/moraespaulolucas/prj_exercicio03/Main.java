package br.com.moraespaulolucas.prj_exercicio03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int i, j, tam = 5, length = 15, inc = 1;
        double x = tam;
        int[][] cartela = new int[tam][tam];
        Random random = new Random();
        for(i = 0; i<cartela.length; i++) {
            for(j = 0; j<cartela.length; j++) {
                if ( (i == tam / 2) && (j == tam / 2) )
                    continue;
                cartela[i][j] = inc + random.nextInt(length);
                System.out.println(cartela[i][j]+" ");
            }
            inc += 15;
            System.out.println();
        }
    }
}
