package moduloLaboratorio.aula3.trabalhoAutonomo.exercicio2;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class EmEspera implements Runnable{
    private String nome;
    private CyclicBarrier c;

    public EmEspera(String nome, CyclicBarrier c) {
        this.nome = nome;
        this.c = c;
    }

    @Override
    public void run() {
        dizMensInicial();
        dizMensFinal();
    }

    public void dizMensInicial() {
       System.out.println("Olá, o meu nome é " + nome + " e vou agora iniciar a partida");
        try {
            Thread.sleep(new Random().nextInt(5000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void dizMensFinal() {
        try {
            System.out.println("Olá, o meu nome é " + nome + " e eu cheguei ao await");
            c.await();
            System.out.println("here");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("Olá, o meu nome é " + nome + " e concluí a corrida");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CyclicBarrier getC() {
        return c;
    }

    public void setC(CyclicBarrier c) {
        this.c = c;
    }
}
