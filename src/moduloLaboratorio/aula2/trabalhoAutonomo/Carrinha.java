package moduloLaboratorio.aula2.trabalhoAutonomo;

import java.util.ArrayList;
import java.util.List;

public class Carrinha extends Thread{

    private Armazem armazem;
    private int numero;
    private int capacidade = 5;
    private static final int tempoCarrego = 1000;
    private List<Encomenda> encomendaList = new ArrayList<Encomenda>();

    public Carrinha(Armazem armazem, int numero) {
        this.armazem = armazem;
        this.numero = numero;
    }

    @Override
    public void run() {

            while (true) {

                System.out.println("A carrinha numero " + numero + " retirou a encomenda nrº " + armazem.get(capacidade).getNumeroEncomenda());
                this.capacidade = this.capacidade - 1;
                if (capacidade == 0) {
                    break;
                }
                try {
                    sleep(tempoCarrego);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

