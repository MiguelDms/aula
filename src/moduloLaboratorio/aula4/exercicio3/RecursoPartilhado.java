package moduloLaboratorio.aula4.exercicio3;

import java.util.LinkedList;

public class RecursoPartilhado {

    public static final int MAX_NUMEROS = 2;
    private LinkedList<Integer> listaN = new LinkedList<>();

    public RecursoPartilhado() {}

    public synchronized void inserirNumero(int numero) throws InterruptedException {
        while (listaN.size() >= MAX_NUMEROS) {
            wait();
        }

        listaN.add(numero);
        notifyAll();
    }

    public synchronized int getNumero() throws InterruptedException {
        while (listaN.size() < MAX_NUMEROS) {
            wait();
        }

        int numero1 = listaN.remove(0);
        int numero2 = listaN.remove(0);

        notifyAll();
        return numero1 + numero2;

    }
}
