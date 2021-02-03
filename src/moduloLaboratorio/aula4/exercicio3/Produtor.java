package moduloLaboratorio.aula4.exercicio3;

import java.util.Random;

public class Produtor extends Thread{

    private String nome;
    private RecursoPartilhado r;

    public Produtor(String nome, RecursoPartilhado r) {
        this.nome = nome;
        this.r = r;
    }

    @Override
    public void run() {
        int rn = new Random().nextInt(30)+1;

        for (int i = 0; i < 10; i++) {
            try {
                r.inserirNumero(rn);
                System.out.println("Produtor " + nome + " criou o valor " + rn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
