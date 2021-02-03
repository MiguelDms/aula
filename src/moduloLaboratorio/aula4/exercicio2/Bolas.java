package moduloLaboratorio.aula4.exercicio2;

import java.util.Random;

public class Bolas implements Runnable{

    private String nome;
    private int valor = 0;

    public Bolas(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        Random r = new Random();


        for (int i = 0; i < 35; i++) {
            setValor(r.nextInt(100));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("O valor da bola do " + nome + " é de " + valor);
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = this.valor + valor;
    }
}
