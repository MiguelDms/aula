package moduloLaboratorio.aula4.exercicio5;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Cliente extends Thread{

    private String nome;
    private Barbearia b;
    private CyclicBarrier c;
    private boolean corteCabelo = false;
    private Cadeira cadeira;
    private boolean sentado = false;

    public Cliente(String nome, Barbearia b, CyclicBarrier c) {
        this.nome = nome;
        this.b = b;
        this.c = c;
    }

    public Cadeira getCadeira() {
        return cadeira;
    }

    public void setCadeira(Cadeira cadeira) {
        this.cadeira = cadeira;
    }

    @Override
    public void run() {
        while(!corteCabelo) {
            try {
                 b.getCadeira(this);
             if (getCadeira() != null) {
                 if (cadeira.getTipo().equals("Cadeira do corte")) {
                     System.out.println("O cliente " + nome + " sentou-se na " + cadeira.getTipo() + " numero " + cadeira.getNumeroCadeira());
                     sleep(3000);
                     System.out.println("O cliente " + nome + " sai do barbeiro com um corte de cabelo á maneira");
                     corteCabelo = true;
                     cadeira.setEstado(false);
                     b.getListaCadeiras().add(cadeira);
                     c.await();
                     b.setAtendidos(1);
                 } else {
                     if (sentado == false) {
                         System.out.println("O cliente " + nome + " sentou-se na " + cadeira.getTipo() + " numero " + cadeira.getNumeroCadeira() + " e está em espera");
                     }
                     sentado = true;
                 }
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
                sleep(new Random().nextInt(10000) + 3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
