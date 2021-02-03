package moduloLaboratorio.aula2.trabalhoAutonomo;

import moduloLaboratorio.aula2.exercicio2.Refeicao;

import java.util.ArrayList;
import java.util.List;

public class Armazem {

    private List<Encomenda> encomendaList;
    private int quantidadeEncomenda;

    public Armazem(List<Encomenda> listEncomenda) {
        this.encomendaList = listEncomenda;

    }

    public synchronized Encomenda get(int capacidade) {
        while (capacidade == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        notifyAll();
        Encomenda e = encomendaList.remove(0);
        this.quantidadeEncomenda = encomendaList.size();
        System.out.println("Existem " + quantidadeEncomenda + " encomendas ainda no armazém");
        return e;
    }
}
