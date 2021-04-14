package br.com.moraespaulolucas.prj_exercicio01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Monte {
    private List<Pedra> monte = new ArrayList<>();

    public Monte() {criar();}

    public void addPedra(Pedra pedra) {
        this.monte.add(pedra);
    }

    private boolean pedraRepetida(int valorA, int valorB, List<Pedra> pedras) {
        boolean r = false;
        for(Pedra p : pedras) {
            if( (valorA == p.getValorB())&&(valorB == p.getValorA()) )
                r = true;
        }
        return r;
    }

    private void criar() {
        int i, j, valorA, valorB;
        Pedra pedra = new Pedra();
        for(i = 0; i < pedra.getRange(); i++) {
            for(j = 0; j < pedra.getRange(); j++) {
                if (this.pedraRepetida(i, j, this.monte))
                    continue;
                Pedra p = new Pedra();
                p.setValorA(i);
                p.setValorB(j);
                this.addPedra(p);
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(this.monte);
    }

    public List<Pedra> exibir(){
        return monte;
    }
}
