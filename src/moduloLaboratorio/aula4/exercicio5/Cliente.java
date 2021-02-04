package moduloLaboratorio.aula4.exercicio5;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Cliente extends Thread{

    private String nome;
    private Barbearia b;
    private CyclicBarrier c;
    private boolean corteCabelo = false;
    private boolean sentado;

    public boolean isSentado() {
        return sentado;
    }

    public Cliente(String nome, Barbearia b, CyclicBarrier c) {
        this.nome = nome;
        this.b = b;
        this.c = c;
    }



    @Override
    public void run() {
        while(!corteCabelo) {
            try {
               Cadeira cadeira = b.getCadeira(this);
                 if (cadeira.getTipo().equals("Cadeira do corte")) {
                    System.out.println("O cliente " + nome + " sentou-se na " + cadeira.getTipo() + " numero " + cadeira.getNumeroCadeira());
                    sentado = true;
                    sleep(3000);
                    System.out.println("O cliente " + nome + " sai do barbeiro com um corte de cabelo á maneira");
                    corteCabelo = true;
                    cadeira.setEstado(false);
                    c.await();
                    b.setAtendidos(1);
                } else {
                    System.out.println("O cliente " + nome + " sentou-se na " + cadeira.getTipo() + " numero " + cadeira.getNumeroCadeira() + " e está em espera");
                    sentado = true;
                }

            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void clienteSaiERegressa(Cadeira cadeiraAOcupar) {
        if (cadeiraAOcupar == null) {
            System.out.println("Não existe cadeira para o cliente " + nome + " e ele vai sair do barbeiro");
            try {
                sleep(new Random().nextInt(3000) + 3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
