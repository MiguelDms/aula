package moduloLaboratorio.testeModelo.exercicio2;

public class Balanca {

    private double qtdOuro = 0;

    public Balanca() {}

    public synchronized void colocaOuro(double ouro) {
        while (qtdOuro >= 12.5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        qtdOuro += ouro;
        notifyAll();
    }

    public synchronized void getOuro() {
        while (qtdOuro <= 12.5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        qtdOuro -= 12.5;
        notifyAll();
    }
}
