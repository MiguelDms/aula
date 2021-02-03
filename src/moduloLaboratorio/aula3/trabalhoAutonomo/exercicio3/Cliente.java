package moduloLaboratorio.aula3.trabalhoAutonomo.exercicio3;

import java.util.Random;

public class Cliente extends Thread {

    private String nome;
    private int valorDepositado = 0;
    private ContaBancaria c;
    private boolean available = true;

    public Cliente(String nome, ContaBancaria c) {
        this.nome = nome;
        this.c = c;
    }

    @Override
    public void run() {
        Random r = new Random();

            while (available) {

                for (int i = 0; i < 10; i++) {
                    int valorDepositado = r.nextInt(100);
                    c.deposit(nome, valorDepositado);
                    setValorDepositado(valorDepositado);

                    if (i == 9) {
                        available = false;
                    }
                }
            }
           }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorDepositado() {
        return valorDepositado;
    }

    public void setValorDepositado(int valorDepositado) {
        this.valorDepositado = this.valorDepositado + valorDepositado;
    }
}
