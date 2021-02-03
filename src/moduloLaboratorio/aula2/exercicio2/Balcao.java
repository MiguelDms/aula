package moduloLaboratorio.aula2.exercicio2;

public class Balcao {

    private Refeicao refeicao;
    private boolean available = false;

    public synchronized void put(Refeicao refeicao) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.refeicao = refeicao;
        available = true;
        notifyAll();
    }

    public synchronized Refeicao get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        available = false;
        notifyAll();
        return refeicao;
    }
}