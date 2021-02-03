package moduloLaboratorio.aula3.exercicio4;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;

public class Cliente extends Thread{

    private String nome;
    private Transportadora t;

    public Cliente(String nome, Transportadora t) {
        this.nome = nome;
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            Random r = new Random();
            int time = r.nextInt(3000) + 3000;
            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Encomenda e = new Encomenda("nome");
            try {
                System.out.println(nome + " Cliente envia encomenda " + e.getNome());
                t.envia(e);
            } catch (BrokenBarrierException brokenBarrierException) {
                brokenBarrierException.printStackTrace();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
